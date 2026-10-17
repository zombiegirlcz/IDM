package org.joda.time;

/* JADX INFO: loaded from: classes13.dex */
public interface ReadableInstant extends Comparable<ReadableInstant> {
    boolean equals(Object obj2);

    int get(DateTimeFieldType dateTimeFieldType);

    Chronology getChronology();

    long getMillis();

    DateTimeZone getZone();

    int hashCode();

    boolean isAfter(ReadableInstant readableInstant);

    boolean isBefore(ReadableInstant readableInstant);

    boolean isEqual(ReadableInstant readableInstant);

    boolean isSupported(DateTimeFieldType dateTimeFieldType);

    Instant toInstant();

    String toString();
}
