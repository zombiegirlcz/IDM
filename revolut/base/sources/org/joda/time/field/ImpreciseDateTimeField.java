package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ImpreciseDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 7190739608550251860L;
    private final DurationField iDurationField;
    final long iUnitMillis;

    public final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        public LinkedDurationField(DurationFieldType durationFieldType) {
            super(durationFieldType);
        }

        @Override // org.joda.time.DurationField
        public long add(long j2, int i) {
            return ImpreciseDateTimeField.this.add(j2, i);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j2, long j3) {
            return ImpreciseDateTimeField.this.getDifference(j2, j3);
        }

        @Override // org.joda.time.DurationField
        public long getDifferenceAsLong(long j2, long j3) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j2, j3);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(int i, long j2) {
            return ImpreciseDateTimeField.this.add(j2, i) - j2;
        }

        @Override // org.joda.time.DurationField
        public long getUnitMillis() {
            return ImpreciseDateTimeField.this.iUnitMillis;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j2, long j3) {
            return ImpreciseDateTimeField.this.getDifference(j2 + j3, j3);
        }

        @Override // org.joda.time.DurationField
        public long getValueAsLong(long j2, long j3) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j2 + j3, j3);
        }

        @Override // org.joda.time.DurationField
        public boolean isPrecise() {
            return false;
        }

        @Override // org.joda.time.DurationField
        public long add(long j2, long j3) {
            return ImpreciseDateTimeField.this.add(j2, j3);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(long j2, long j3) {
            return ImpreciseDateTimeField.this.add(j3, j2) - j3;
        }
    }

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j2) {
        super(dateTimeFieldType);
        this.iUnitMillis = j2;
        this.iDurationField = new LinkedDurationField(dateTimeFieldType.getDurationType());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j2, int i);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j2, long j3);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract int get(long j2);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j2, long j3) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j2, j3));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j2, long j3) {
        if (j2 < j3) {
            return -getDifferenceAsLong(j3, j2);
        }
        long j5 = (j2 - j3) / this.iUnitMillis;
        if (add(j3, j5) >= j2) {
            if (add(j3, j5) > j2) {
                do {
                    j5--;
                } while (add(j3, j5) > j2);
            }
            return j5;
        }
        while (true) {
            long j16 = j5 + 1;
            if (add(j3, j16) > j2) {
                return j5;
            }
            j5 = j16;
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getDurationField() {
        return this.iDurationField;
    }

    public final long getDurationUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long roundFloor(long j2);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long set(long j2, int i);
}
