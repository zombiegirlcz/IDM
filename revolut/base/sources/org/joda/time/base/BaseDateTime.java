package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseDateTime extends AbstractDateTime implements ReadableDateTime, Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile Chronology iChronology;
    private volatile long iMillis;

    public BaseDateTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
    }

    private void adjustForMinMax() {
        if (this.iMillis == Long.MIN_VALUE || this.iMillis == Long.MAX_VALUE) {
            this.iChronology = this.iChronology.withUTC();
        }
    }

    public Chronology checkChronology(Chronology chronology) {
        return DateTimeUtils.getChronology(chronology);
    }

    public long checkInstant(long j2, Chronology chronology) {
        return j2;
    }

    @Override // org.joda.time.ReadableInstant
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.ReadableInstant
    public long getMillis() {
        return this.iMillis;
    }

    public void setChronology(Chronology chronology) {
        this.iChronology = checkChronology(chronology);
    }

    public void setMillis(long j2) {
        this.iMillis = checkInstant(j2, this.iChronology);
    }

    public BaseDateTime(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public BaseDateTime(long j2) {
        this(j2, ISOChronology.getInstance());
    }

    public BaseDateTime(long j2, DateTimeZone dateTimeZone) {
        this(j2, ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(long j2, Chronology chronology) {
        this.iChronology = checkChronology(chronology);
        this.iMillis = checkInstant(j2, this.iChronology);
        adjustForMinMax();
    }

    public BaseDateTime(Object obj2, DateTimeZone dateTimeZone) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj2);
        Chronology chronologyCheckChronology = checkChronology(instantConverter.getChronology(obj2, dateTimeZone));
        this.iChronology = chronologyCheckChronology;
        this.iMillis = checkInstant(instantConverter.getInstantMillis(obj2, chronologyCheckChronology), chronologyCheckChronology);
        adjustForMinMax();
    }

    public BaseDateTime(Object obj2, Chronology chronology) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj2);
        this.iChronology = checkChronology(instantConverter.getChronology(obj2, chronology));
        this.iMillis = checkInstant(instantConverter.getInstantMillis(obj2, chronology), this.iChronology);
        adjustForMinMax();
    }

    public BaseDateTime(int i, int i2, int i3, int i5, int i6, int i21, int i22) {
        this(i, i2, i3, i5, i6, i21, i22, ISOChronology.getInstance());
    }

    public BaseDateTime(int i, int i2, int i3, int i5, int i6, int i21, int i22, DateTimeZone dateTimeZone) {
        this(i, i2, i3, i5, i6, i21, i22, ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(int i, int i2, int i3, int i5, int i6, int i21, int i22, Chronology chronology) {
        this.iChronology = checkChronology(chronology);
        this.iMillis = checkInstant(this.iChronology.getDateTimeMillis(i, i2, i3, i5, i6, i21, i22), this.iChronology);
        adjustForMinMax();
    }
}
