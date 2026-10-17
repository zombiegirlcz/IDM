package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractConverter implements Converter {
    public Chronology getChronology(Object obj2, DateTimeZone dateTimeZone) {
        return ISOChronology.getInstance(dateTimeZone);
    }

    public long getInstantMillis(Object obj2, Chronology chronology) {
        return DateTimeUtils.currentTimeMillis();
    }

    public int[] getPartialValues(ReadablePartial readablePartial, Object obj2, Chronology chronology) {
        return chronology.get(readablePartial, getInstantMillis(obj2, chronology));
    }

    public PeriodType getPeriodType(Object obj2) {
        return PeriodType.standard();
    }

    public boolean isReadableInterval(Object obj2, Chronology chronology) {
        return false;
    }

    public String toString() {
        return a.i(new StringBuilder("Converter["), getSupportedType() == null ? "null" : getSupportedType().getName(), "]");
    }

    public Chronology getChronology(Object obj2, Chronology chronology) {
        return DateTimeUtils.getChronology(chronology);
    }

    public int[] getPartialValues(ReadablePartial readablePartial, Object obj2, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        return getPartialValues(readablePartial, obj2, chronology);
    }
}
