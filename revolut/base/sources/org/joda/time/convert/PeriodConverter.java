package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;

/* JADX INFO: loaded from: classes14.dex */
public interface PeriodConverter extends Converter {
    PeriodType getPeriodType(Object obj2);

    void setInto(ReadWritablePeriod readWritablePeriod, Object obj2, Chronology chronology);
}
