package org.joda.time;

import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public abstract class DateTimeField {
    public abstract long add(long j2, int i);

    public abstract long add(long j2, long j3);

    public abstract int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2);

    public abstract long addWrapField(long j2, int i);

    public abstract int[] addWrapField(ReadablePartial readablePartial, int i, int[] iArr, int i2);

    public abstract int[] addWrapPartial(ReadablePartial readablePartial, int i, int[] iArr, int i2);

    public abstract int get(long j2);

    public abstract String getAsShortText(int i, Locale locale);

    public abstract String getAsShortText(long j2);

    public abstract String getAsShortText(long j2, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, int i, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, Locale locale);

    public abstract String getAsText(int i, Locale locale);

    public abstract String getAsText(long j2);

    public abstract String getAsText(long j2, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, int i, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, Locale locale);

    public abstract int getDifference(long j2, long j3);

    public abstract long getDifferenceAsLong(long j2, long j3);

    public abstract DurationField getDurationField();

    public abstract int getLeapAmount(long j2);

    public abstract DurationField getLeapDurationField();

    public abstract int getMaximumShortTextLength(Locale locale);

    public abstract int getMaximumTextLength(Locale locale);

    public abstract int getMaximumValue();

    public abstract int getMaximumValue(long j2);

    public abstract int getMaximumValue(ReadablePartial readablePartial);

    public abstract int getMaximumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract int getMinimumValue();

    public abstract int getMinimumValue(long j2);

    public abstract int getMinimumValue(ReadablePartial readablePartial);

    public abstract int getMinimumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract String getName();

    public abstract DurationField getRangeDurationField();

    public abstract DateTimeFieldType getType();

    public abstract boolean isLeap(long j2);

    public abstract boolean isLenient();

    public abstract boolean isSupported();

    public abstract long remainder(long j2);

    public abstract long roundCeiling(long j2);

    public abstract long roundFloor(long j2);

    public abstract long roundHalfCeiling(long j2);

    public abstract long roundHalfEven(long j2);

    public abstract long roundHalfFloor(long j2);

    public abstract long set(long j2, int i);

    public abstract long set(long j2, String str);

    public abstract long set(long j2, String str, Locale locale);

    public abstract int[] set(ReadablePartial readablePartial, int i, int[] iArr, int i2);

    public abstract int[] set(ReadablePartial readablePartial, int i, int[] iArr, String str, Locale locale);

    public long setExtended(long j2, int i) {
        return set(j2, i);
    }

    public abstract String toString();
}
