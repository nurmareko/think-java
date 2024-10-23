public class Time {

    public static void main(String[] args) {
        int initialHour = 10;
        int initialMinute = 18;
        int initialSecond = 32;

        int currentHour = 10;
        int currentMinute = 50;
        int currentSecond = 22;

        int hourInDay = 24;
        int hourInSecond = 3600;
        int minuteInSecond = 60;
        int dayInSecond = hourInDay * hourInSecond;

        int initialHourInSecond = initialHour * hourInSecond;
        int initialMinuteInSecond = initialMinute * minuteInSecond;
        int initialTimeInSecond = initialHourInSecond + initialMinuteInSecond + initialSecond;

        int currentHourInSecond = currentHour * hourInSecond;
        int currentMinuteInSecond = currentMinute * minuteInSecond;
        int currentTimeInSecond = currentHourInSecond + currentMinuteInSecond + currentSecond;

        int timeElapseInSecond = currentTimeInSecond - initialTimeInSecond;

        System.out.print("number of seconds since midnight: ");
        System.out.println(initialTimeInSecond);

        System.out.print("number of seconds remaining in the day: ");
        System.out.println(dayInSecond - initialTimeInSecond);

        System.out.print("percentage of the day that has passed: ");
        System.out.println((double) initialTimeInSecond / dayInSecond * 100.0 + "%");

        System.out.print("time elapse since this program written: ");
        System.out.println(timeElapseInSecond + " seconds");
    }

}
