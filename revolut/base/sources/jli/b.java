package jli;

import ch.qos.logback.core.CoreConstants;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRulesException;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f175839a;

    static {
        Intrinsics.checkNotNullExpressionValue(new DateTime(0, 1, 1, 0, 0).toDate(), "toDate(...)");
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterForPattern, "forPattern(...)");
        f175839a = dateTimeFormatterForPattern;
    }

    public static final int a(DateTime dateTime, DateTime to6) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        Intrinsics.checkNotNullParameter(to6, "to");
        return Days.daysBetween(dateTime.withTimeAtStartOfDay(), to6.withTimeAtStartOfDay()).getDays();
    }

    public static final long b(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.toDateTimeAtStartOfDay().getMillis();
    }

    public static final boolean c(Instant instant, Instant otherInstant, DateTimeZone zone) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(otherInstant, "otherInstant");
        Intrinsics.checkNotNullParameter(zone, "zone");
        long millis = instant.getMillis();
        long millis2 = otherInstant.getMillis();
        return (millis + ((long) zone.getOffset(millis))) / CoreConstants.MILLIS_IN_ONE_DAY != (millis2 + ((long) zone.getOffset(millis2))) / CoreConstants.MILLIS_IN_ONE_DAY;
    }

    public static final long d() {
        return DateTime.now().toDate().getTime();
    }

    public static final java.time.LocalDate e(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        java.time.LocalDate localDateOf = java.time.LocalDate.of(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
        return localDateOf;
    }

    public static final LocalDateTime f(org.joda.time.LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        LocalDateTime localDateTimeOf = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonthOfYear(), localDateTime.getDayOfMonth(), localDateTime.getHourOfDay(), localDateTime.getMinuteOfHour(), localDateTime.getSecondOfMinute(), localDateTime.getMillisOfSecond() * 1000000);
        Intrinsics.checkNotNullExpressionValue(localDateTimeOf, "of(...)");
        return localDateTimeOf;
    }

    public static final ZonedDateTime g(DateTime dateTime) {
        ZoneId zoneIdSystemDefault;
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        java.time.Instant instantOfEpochMilli = java.time.Instant.ofEpochMilli(dateTime.getMillis());
        try {
            zoneIdSystemDefault = ZoneId.of(dateTime.getZone().getID(), ZoneId.SHORT_IDS);
        } catch (ZoneRulesException unused) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(instantOfEpochMilli, zoneIdSystemDefault);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeOfInstant, "ofInstant(...)");
        return zonedDateTimeOfInstant;
    }

    public static final DateTime h(ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(zonedDateTime, "<this>");
        return new DateTime(zonedDateTime.toInstant().toEpochMilli(), DateTimeZone.forTimeZone(TimeZone.getTimeZone(zonedDateTime.getZone())));
    }

    public static final LocalDate i(java.time.LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return new LocalDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }

    public static final org.joda.time.LocalDateTime j(LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        return new org.joda.time.LocalDateTime(localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano() / 1000000);
    }

    public static final DateTime k(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        DateTime dateTimeWithMaximumValue = dateTime.millisOfDay().withMaximumValue();
        Intrinsics.checkNotNullExpressionValue(dateTimeWithMaximumValue, "withMaximumValue(...)");
        return dateTimeWithMaximumValue;
    }
}
