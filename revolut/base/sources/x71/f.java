package x71;

import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements ReadableDateTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DateTime f303138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f303139b;

    public f(long j2) {
        this.f303138a = new DateTime(j2);
        this.f303139b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(ReadableInstant readableInstant) {
        return this.f303138a.compareTo(readableInstant);
    }

    @Override // org.joda.time.ReadableInstant
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f303139b == ((f) obj2).f303139b;
    }

    @Override // org.joda.time.ReadableInstant
    public final int get(DateTimeFieldType dateTimeFieldType) {
        return this.f303138a.get(dateTimeFieldType);
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getCenturyOfEra() {
        return this.f303138a.getCenturyOfEra();
    }

    @Override // org.joda.time.ReadableInstant
    public final Chronology getChronology() {
        return this.f303138a.getChronology();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getDayOfMonth() {
        return this.f303138a.getDayOfMonth();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getDayOfWeek() {
        return this.f303138a.getDayOfWeek();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getDayOfYear() {
        return this.f303138a.getDayOfYear();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getEra() {
        return this.f303138a.getEra();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getHourOfDay() {
        return this.f303138a.getHourOfDay();
    }

    @Override // org.joda.time.ReadableInstant
    public final long getMillis() {
        return this.f303138a.getMillis();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getMillisOfDay() {
        return this.f303138a.getMillisOfDay();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getMillisOfSecond() {
        return this.f303138a.getMillisOfSecond();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getMinuteOfDay() {
        return this.f303138a.getMinuteOfDay();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getMinuteOfHour() {
        return this.f303138a.getMinuteOfHour();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getMonthOfYear() {
        return this.f303138a.getMonthOfYear();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getSecondOfDay() {
        return this.f303138a.getSecondOfDay();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getSecondOfMinute() {
        return this.f303138a.getSecondOfMinute();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getWeekOfWeekyear() {
        return this.f303138a.getWeekOfWeekyear();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getWeekyear() {
        return this.f303138a.getWeekyear();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getYear() {
        return this.f303138a.getYear();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getYearOfCentury() {
        return this.f303138a.getYearOfCentury();
    }

    @Override // org.joda.time.ReadableDateTime
    public final int getYearOfEra() {
        return this.f303138a.getYearOfEra();
    }

    @Override // org.joda.time.ReadableInstant
    public final DateTimeZone getZone() {
        return this.f303138a.getZone();
    }

    @Override // org.joda.time.ReadableInstant
    public final int hashCode() {
        return Long.hashCode(this.f303139b);
    }

    @Override // org.joda.time.ReadableInstant
    public final boolean isAfter(ReadableInstant readableInstant) {
        return this.f303138a.isAfter(readableInstant);
    }

    @Override // org.joda.time.ReadableInstant
    public final boolean isBefore(ReadableInstant readableInstant) {
        return this.f303138a.isBefore(readableInstant);
    }

    @Override // org.joda.time.ReadableInstant
    public final boolean isEqual(ReadableInstant readableInstant) {
        return this.f303138a.isEqual(readableInstant);
    }

    @Override // org.joda.time.ReadableInstant
    public final boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        return this.f303138a.isSupported(dateTimeFieldType);
    }

    @Override // org.joda.time.ReadableDateTime
    public final DateTime toDateTime() {
        return this.f303138a.toDateTime();
    }

    @Override // org.joda.time.ReadableInstant
    public final Instant toInstant() {
        return this.f303138a.toInstant();
    }

    @Override // org.joda.time.ReadableDateTime
    public final MutableDateTime toMutableDateTime() {
        return this.f303138a.toMutableDateTime();
    }

    @Override // org.joda.time.ReadableDateTime
    public final String toString(String str) {
        return this.f303138a.toString(str);
    }

    @Override // org.joda.time.ReadableDateTime
    public final String toString(String str, Locale locale) {
        return this.f303138a.toString(str, locale);
    }
}
