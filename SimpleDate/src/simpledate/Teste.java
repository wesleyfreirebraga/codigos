package simpledate;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Teste {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date x1 = new Date();
		Date y1 = sdf1.parse("22/09/2022");
		Date y2 = sdf2.parse("22/09/2022 15:42:07");
		Date y3 = Date.from(Instant.parse("2022-09-22T09:02:07Z"));
		
		System.out.println("y01 = " + sdf2.format(x1));
		System.out.println("y1 = " + sdf2.format(y2));
		System.out.println("y2 = " + sdf2.format(y2));
		System.out.println("y3 = " + sdf2.format(y3));
	System.out.println("------------------------------");
	System.out.println("  trabalhando com calendar");
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date d = Date.from(Instant.parse("2022-09-22T09:14:07Z"));
	System.out.println(sdf.format(d));
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
	cal.add(Calendar.HOUR_OF_DAY, 4);
	d=cal.getTime();
	System.out.println(sdf.format(d));
	}

}
