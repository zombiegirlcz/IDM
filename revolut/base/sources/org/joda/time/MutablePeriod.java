package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes14.dex */
public class MutablePeriod extends BasePeriod implements ReadWritablePeriod, Cloneable, Serializable {
    private static final long serialVersionUID = 3436451121567212165L;

    public MutablePeriod() {
        super(0L, (PeriodType) null, (Chronology) null);
    }

    @FromString
    public static MutablePeriod parse(String str) {
        return parse(str, ISOPeriodFormat.standard());
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(DurationFieldType durationFieldType, int i) {
        super.addField(durationFieldType, i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addDays(int i) {
        super.addField(DurationFieldType.days(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addHours(int i) {
        super.addField(DurationFieldType.hours(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMillis(int i) {
        super.addField(DurationFieldType.millis(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMinutes(int i) {
        super.addField(DurationFieldType.minutes(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMonths(int i) {
        super.addField(DurationFieldType.months(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addSeconds(int i) {
        super.addField(DurationFieldType.seconds(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addWeeks(int i) {
        super.addField(DurationFieldType.weeks(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addYears(int i) {
        super.addField(DurationFieldType.years(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void clear() {
        super.setValues(new int[size()]);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutablePeriod copy() {
        return (MutablePeriod) clone();
    }

    public int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    @Override // org.joda.time.base.BasePeriod
    public void mergePeriod(ReadablePeriod readablePeriod) {
        super.mergePeriod(readablePeriod);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void set(DurationFieldType durationFieldType, int i) {
        super.setField(durationFieldType, i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setDays(int i) {
        super.setField(DurationFieldType.days(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setHours(int i) {
        super.setField(DurationFieldType.hours(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMillis(int i) {
        super.setField(DurationFieldType.millis(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMinutes(int i) {
        super.setField(DurationFieldType.minutes(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMonths(int i) {
        super.setField(DurationFieldType.months(), i);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setPeriod(ReadablePeriod readablePeriod) {
        super.setPeriod(readablePeriod);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setSeconds(int i) {
        super.setField(DurationFieldType.seconds(), i);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setValue(int i, int i2) {
        super.setValue(i, i2);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setWeeks(int i) {
        super.setField(DurationFieldType.weeks(), i);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setYears(int i) {
        super.setField(DurationFieldType.years(), i);
    }

    public MutablePeriod(PeriodType periodType) {
        super(0L, periodType, (Chronology) null);
    }

    public static MutablePeriod parse(String str, PeriodFormatter periodFormatter) {
        return periodFormatter.parsePeriod(str).toMutablePeriod();
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(ReadablePeriod readablePeriod) {
        super.addPeriod(readablePeriod);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setPeriod(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        super.setPeriod(i, i2, i3, i5, i6, i21, i22, i32);
    }

    public MutablePeriod(int i, int i2, int i3, int i5) {
        super(0, 0, 0, 0, i, i2, i3, i5, PeriodType.standard());
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        setPeriod(FieldUtils.safeAdd(getYears(), i), FieldUtils.safeAdd(getMonths(), i2), FieldUtils.safeAdd(getWeeks(), i3), FieldUtils.safeAdd(getDays(), i5), FieldUtils.safeAdd(getHours(), i6), FieldUtils.safeAdd(getMinutes(), i21), FieldUtils.safeAdd(getSeconds(), i22), FieldUtils.safeAdd(getMillis(), i32));
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setPeriod(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            setPeriod(0L);
        } else {
            setPeriod(readableInterval.getStartMillis(), readableInterval.getEndMillis(), DateTimeUtils.getChronology(readableInterval.getChronology()));
        }
    }

    public MutablePeriod(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        super(i, i2, i3, i5, i6, i21, i22, i32, PeriodType.standard());
    }

    public MutablePeriod(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, PeriodType periodType) {
        super(i, i2, i3, i5, i6, i21, i22, i32, periodType);
    }

    public MutablePeriod(long j2) {
        super(j2);
    }

    public void setPeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == readableInstant2) {
            setPeriod(0L);
        } else {
            setPeriod(DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantMillis(readableInstant2), DateTimeUtils.getIntervalChronology(readableInstant, readableInstant2));
        }
    }

    public MutablePeriod(long j2, PeriodType periodType) {
        super(j2, periodType, (Chronology) null);
    }

    public MutablePeriod(long j2, Chronology chronology) {
        super(j2, (PeriodType) null, chronology);
    }

    public MutablePeriod(long j2, PeriodType periodType, Chronology chronology) {
        super(j2, periodType, chronology);
    }

    public MutablePeriod(long j2, long j3) {
        super(j2, j3, null, null);
    }

    public MutablePeriod(long j2, long j3, PeriodType periodType) {
        super(j2, j3, periodType, null);
    }

    public void setPeriod(long j2, long j3) {
        setPeriod(j2, j3, null);
    }

    public MutablePeriod(long j2, long j3, Chronology chronology) {
        super(j2, j3, null, chronology);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(ReadableInterval readableInterval) {
        if (readableInterval != null) {
            add(readableInterval.toPeriod(getPeriodType()));
        }
    }

    public void setPeriod(long j2, long j3, Chronology chronology) {
        setValues(DateTimeUtils.getChronology(chronology).get(this, j2, j3));
    }

    public MutablePeriod(long j2, long j3, PeriodType periodType, Chronology chronology) {
        super(j2, j3, periodType, chronology);
    }

    public void add(ReadableDuration readableDuration) {
        if (readableDuration != null) {
            add(new Period(readableDuration.getMillis(), getPeriodType()));
        }
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2, (PeriodType) null);
    }

    public void add(long j2) {
        add(new Period(j2, getPeriodType()));
    }

    public void setPeriod(ReadableDuration readableDuration) {
        setPeriod(readableDuration, (Chronology) null);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        super(readableInstant, readableInstant2, periodType);
    }

    public void add(long j2, Chronology chronology) {
        add(new Period(j2, getPeriodType(), chronology));
    }

    public void setPeriod(ReadableDuration readableDuration, Chronology chronology) {
        setPeriod(DateTimeUtils.getDurationMillis(readableDuration), chronology);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration, (PeriodType) null);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        super(readableInstant, readableDuration, periodType);
    }

    public void setPeriod(long j2) {
        setPeriod(j2, (Chronology) null);
    }

    public MutablePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant, (PeriodType) null);
    }

    public void setPeriod(long j2, Chronology chronology) {
        setValues(DateTimeUtils.getChronology(chronology).get(this, j2));
    }

    public MutablePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        super(readableDuration, readableInstant, periodType);
    }

    public MutablePeriod(Object obj2) {
        super(obj2, (PeriodType) null, (Chronology) null);
    }

    public MutablePeriod(Object obj2, PeriodType periodType) {
        super(obj2, periodType, (Chronology) null);
    }

    public MutablePeriod(Object obj2, Chronology chronology) {
        super(obj2, (PeriodType) null, chronology);
    }

    public MutablePeriod(Object obj2, PeriodType periodType, Chronology chronology) {
        super(obj2, periodType, chronology);
    }
}
