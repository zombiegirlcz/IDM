package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/* JADX INFO: loaded from: classes14.dex */
class ReadablePeriodConverter extends AbstractConverter implements PeriodConverter {
    static final ReadablePeriodConverter INSTANCE = new ReadablePeriodConverter();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PeriodConverter
    public PeriodType getPeriodType(Object obj2) {
        return ((ReadablePeriod) obj2).getPeriodType();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return ReadablePeriod.class;
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj2, Chronology chronology) {
        readWritablePeriod.setPeriod((ReadablePeriod) obj2);
    }
}
