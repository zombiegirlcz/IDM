package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes14.dex */
public interface InstantConverter extends Converter {
    Chronology getChronology(Object obj2, Chronology chronology);

    Chronology getChronology(Object obj2, DateTimeZone dateTimeZone);

    long getInstantMillis(Object obj2, Chronology chronology);
}
