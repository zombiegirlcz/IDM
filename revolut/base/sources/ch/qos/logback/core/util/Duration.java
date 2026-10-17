package ch.qos.logback.core.util;

import a0.d;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class Duration {
    static final long DAYS_COEFFICIENT = 86400000;
    private static final int DOUBLE_GROUP = 1;
    static final long HOURS_COEFFICIENT = 3600000;
    static final long MINUTES_COEFFICIENT = 60000;
    static final long SECONDS_COEFFICIENT = 1000;
    private static final int UNIT_GROUP = 3;
    final long millis;
    private static final String DOUBLE_PART = "([0-9]*(.[0-9]+)?)";
    private static final String UNIT_PART = "(|milli(second)?|second(e)?|minute|hour|day)s?";
    private static final Pattern DURATION_PATTERN = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);

    public Duration(long j2) {
        this.millis = j2;
    }

    public static Duration buildByDays(double d) {
        return new Duration((long) (d * 8.64E7d));
    }

    public static Duration buildByHours(double d) {
        return new Duration((long) (d * 3600000.0d));
    }

    public static Duration buildByMilliseconds(double d) {
        return new Duration((long) d);
    }

    public static Duration buildByMinutes(double d) {
        return new Duration((long) (d * 60000.0d));
    }

    public static Duration buildBySeconds(double d) {
        return new Duration((long) (d * 1000.0d));
    }

    public static Duration buildUnbounded() {
        return new Duration(Long.MAX_VALUE);
    }

    public static Duration valueOf(String str) {
        Matcher matcher = DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(p.a.p("String value [", str, "] is not in the expected format."));
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(3);
        double dDoubleValue = Double.valueOf(strGroup).doubleValue();
        if (strGroup2.equalsIgnoreCase("milli") || strGroup2.equalsIgnoreCase("millisecond") || strGroup2.length() == 0) {
            return buildByMilliseconds(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("second") || strGroup2.equalsIgnoreCase("seconde")) {
            return buildBySeconds(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("minute")) {
            return buildByMinutes(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("hour")) {
            return buildByHours(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("day")) {
            return buildByDays(dDoubleValue);
        }
        throw new IllegalStateException("Unexpected ".concat(strGroup2));
    }

    public long getMilliseconds() {
        return this.millis;
    }

    public String toString() {
        long j2 = this.millis;
        if (j2 < 1000) {
            return d.j(this.millis, " milliseconds", new StringBuilder());
        }
        if (j2 < 60000) {
            return d.j(this.millis / 1000, " seconds", new StringBuilder());
        }
        if (j2 < 3600000) {
            return d.j(this.millis / 60000, " minutes", new StringBuilder());
        }
        return d.j(this.millis / 3600000, " hours", new StringBuilder());
    }
}
