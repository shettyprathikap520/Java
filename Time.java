import java.time.*;
import java.time.format.DateTimeFormatter;

public class WorldTime {
    public static void main(String[] args) {
        LocalTime utcTime = LocalTime.of(6, 0);
        System.out.println("UTC Time: " + utcTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        displayTime("LON", utcTime, 1, 0, formatter);     
        displayTime("DUB", utcTime, 4, 0, formatter);    
        displayTime("BLR", utcTime, 5, 30, formatter);    
        displayTime("SGP", utcTime, 8, 0, formatter);    
        displayTime("TOK", utcTime, 9, 0, formatter);     
        displayTime("SYD", utcTime, 10, 0, formatter);   
        displayTime("WEL", utcTime, 12, 0, formatter);   
        System.out.println();
        System.out.println("If you move westwards, time lags (negative offset):");
        displayTime("NYC", utcTime, -4, 0, formatter);    
        displayTime("LAX", utcTime, -7, 0, formatter);   
        displayTime("RIO", utcTime, -3, 0, formatter);   
    }

    
    private static void displayTime(String city, LocalTime utcTime, int hourOffset, int minuteOffset, DateTimeFormatter formatter)
  {
        LocalTime localTime = utcTime.plusHours(hourOffset).plusMinutes(minuteOffset);
        System.out.println(city + " • " + localTime.format(formatter));
    }
                    }
