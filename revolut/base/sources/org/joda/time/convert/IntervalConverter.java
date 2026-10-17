package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.ReadWritableInterval;

/* JADX INFO: loaded from: classes14.dex */
public interface IntervalConverter extends Converter {
    boolean isReadableInterval(Object obj2, Chronology chronology);

    void setInto(ReadWritableInterval readWritableInterval, Object obj2, Chronology chronology);
}
