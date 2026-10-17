package org.joda.time;

/* JADX INFO: loaded from: classes14.dex */
public interface ReadableDuration extends Comparable<ReadableDuration> {
    boolean equals(Object obj2);

    long getMillis();

    int hashCode();

    boolean isEqual(ReadableDuration readableDuration);

    boolean isLongerThan(ReadableDuration readableDuration);

    boolean isShorterThan(ReadableDuration readableDuration);

    Duration toDuration();

    Period toPeriod();

    String toString();
}
