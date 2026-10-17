package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;
import p.a;

/* JADX INFO: loaded from: classes13.dex */
class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
    private static final int MIN = 1;
    private static final long serialVersionUID = -8258715387168736L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    public BasicMonthOfYearDateTimeField(BasicChronology basicChronology, int i) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.iChronology = basicChronology;
        this.iMax = basicChronology.getMaxMonth();
        this.iLeapMonth = i;
    }

    private Object readResolve() {
        return this.iChronology.monthOfYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j2, int i) {
        int i2;
        int i3;
        int i5;
        int i6;
        int i21;
        if (i == 0) {
            return j2;
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j2);
        int year = this.iChronology.getYear(j2);
        int monthOfYear = this.iChronology.getMonthOfYear(j2, year);
        int i22 = monthOfYear - 1;
        int i32 = i22 + i;
        if (monthOfYear <= 0 || i32 >= 0) {
            i2 = year;
        } else {
            if (Math.signum(this.iMax + i) == Math.signum(i)) {
                i6 = year - 1;
                i21 = i + this.iMax;
            } else {
                i6 = year + 1;
                i21 = i - this.iMax;
            }
            int i33 = i6;
            i32 = i21 + i22;
            i2 = i33;
        }
        if (i32 >= 0) {
            int i43 = this.iMax;
            i3 = (i32 / i43) + i2;
            i5 = (i32 % i43) + 1;
        } else {
            i3 = (i32 / this.iMax) + i2;
            int i59 = i3 - 1;
            int iAbs = Math.abs(i32);
            int i66 = this.iMax;
            int i74 = iAbs % i66;
            if (i74 == 0) {
                i74 = i66;
            }
            i5 = (i66 - i74) + 1;
            if (i5 != 1) {
                i3 = i59;
            }
        }
        int dayOfMonth = this.iChronology.getDayOfMonth(j2, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i3, i5);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i3, i5, dayOfMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j2, int i) {
        return set(j2, FieldUtils.getWrappedValue(get(j2), i, 1, this.iMax));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j2) {
        return this.iChronology.getMonthOfYear(j2);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j2, long j3) {
        if (j2 < j3) {
            return -getDifference(j3, j2);
        }
        int year = this.iChronology.getYear(j2);
        int monthOfYear = this.iChronology.getMonthOfYear(j2, year);
        int year2 = this.iChronology.getYear(j3);
        int monthOfYear2 = this.iChronology.getMonthOfYear(j3, year2);
        long j5 = ((((long) (year - year2)) * ((long) this.iMax)) + ((long) monthOfYear)) - ((long) monthOfYear2);
        int dayOfMonth = this.iChronology.getDayOfMonth(j2, year, monthOfYear);
        if (dayOfMonth == this.iChronology.getDaysInYearMonth(year, monthOfYear) && this.iChronology.getDayOfMonth(j3, year2, monthOfYear2) > dayOfMonth) {
            j3 = this.iChronology.dayOfMonth().set(j3, dayOfMonth);
        }
        return j2 - this.iChronology.getYearMonthMillis(year, monthOfYear) < j3 - this.iChronology.getYearMonthMillis(year2, monthOfYear2) ? j5 - 1 : j5;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j2) {
        return isLeap(j2) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j2) {
        int year = this.iChronology.getYear(j2);
        return this.iChronology.isLeapYear(year) && this.iChronology.getMonthOfYear(j2, year) == this.iLeapMonth;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j2) {
        return j2 - roundFloor(j2);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j2) {
        int year = this.iChronology.getYear(j2);
        return this.iChronology.getYearMonthMillis(year, this.iChronology.getMonthOfYear(j2, year));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j2, int i) {
        FieldUtils.verifyValueBounds(this, i, 1, this.iMax);
        int year = this.iChronology.getYear(j2);
        int dayOfMonth = this.iChronology.getDayOfMonth(j2, year);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(year, i);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(year, i, dayOfMonth) + ((long) this.iChronology.getMillisOfDay(j2));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j2, long j3) {
        long j5;
        long j16;
        long j22;
        int i = (int) j3;
        if (i == j3) {
            return add(j2, i);
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j2);
        int year = this.iChronology.getYear(j2);
        int monthOfYear = this.iChronology.getMonthOfYear(j2, year);
        long j42 = ((long) (monthOfYear - 1)) + j3;
        if (j42 >= 0) {
            int i2 = this.iMax;
            j5 = (j42 / ((long) i2)) + ((long) year);
            j22 = (j42 % ((long) i2)) + 1;
            j16 = millisOfDay;
        } else {
            j5 = (j42 / ((long) this.iMax)) + ((long) year);
            long j46 = j5 - 1;
            long jAbs = Math.abs(j42);
            int i3 = this.iMax;
            j16 = millisOfDay;
            int i5 = (int) (jAbs % ((long) i3));
            if (i5 == 0) {
                i5 = i3;
            }
            j22 = (i3 - i5) + 1;
            if (j22 != 1) {
                j5 = j46;
            }
        }
        if (j5 >= this.iChronology.getMinYear() && j5 <= this.iChronology.getMaxYear()) {
            int i6 = (int) j5;
            int i21 = (int) j22;
            int dayOfMonth = this.iChronology.getDayOfMonth(j2, year, monthOfYear);
            int daysInYearMonth = this.iChronology.getDaysInYearMonth(i6, i21);
            if (dayOfMonth > daysInYearMonth) {
                dayOfMonth = daysInYearMonth;
            }
            return this.iChronology.getYearMonthDayMillis(i6, i21, dayOfMonth) + j16;
        }
        throw new IllegalArgumentException(a.m(j3, "Magnitude of add amount is too large: "));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        if (readablePartial.size() > 0 && readablePartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i == 0) {
            return set(readablePartial, 0, iArr, ((((i2 % 12) + (iArr[0] - 1)) + 12) % 12) + 1);
        }
        if (DateTimeUtils.isContiguous(readablePartial)) {
            int size = readablePartial.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                j2 = readablePartial.getFieldType(i3).getField(this.iChronology).set(j2, iArr[i3]);
            }
            return this.iChronology.get(readablePartial, add(j2, i2));
        }
        return super.add(readablePartial, i, iArr, i2);
    }
}
