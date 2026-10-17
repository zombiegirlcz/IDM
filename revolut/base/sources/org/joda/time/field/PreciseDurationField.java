package org.joda.time.field;

import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes13.dex */
public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j2) {
        super(durationFieldType);
        this.iUnitMillis = j2;
    }

    @Override // org.joda.time.DurationField
    public long add(long j2, int i) {
        return FieldUtils.safeAdd(j2, ((long) i) * this.iUnitMillis);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof PreciseDurationField) {
            PreciseDurationField preciseDurationField = (PreciseDurationField) obj2;
            if (getType() == preciseDurationField.getType() && this.iUnitMillis == preciseDurationField.iUnitMillis) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j2, long j3) {
        return FieldUtils.safeSubtract(j2, j3) / this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i, long j2) {
        return ((long) i) * this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j2, long j3) {
        return j2 / this.iUnitMillis;
    }

    public int hashCode() {
        long j2 = this.iUnitMillis;
        return getType().hashCode() + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // org.joda.time.DurationField
    public final boolean isPrecise() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j2, long j3) {
        return FieldUtils.safeMultiply(j2, this.iUnitMillis);
    }

    @Override // org.joda.time.DurationField
    public long add(long j2, long j3) {
        return FieldUtils.safeAdd(j2, FieldUtils.safeMultiply(j3, this.iUnitMillis));
    }
}
