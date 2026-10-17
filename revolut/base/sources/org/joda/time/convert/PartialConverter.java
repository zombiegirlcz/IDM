package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes14.dex */
public interface PartialConverter extends Converter {
    Chronology getChronology(Object obj2, Chronology chronology);

    Chronology getChronology(Object obj2, DateTimeZone dateTimeZone);

    int[] getPartialValues(ReadablePartial readablePartial, Object obj2, Chronology chronology);

    int[] getPartialValues(ReadablePartial readablePartial, Object obj2, Chronology chronology, DateTimeFormatter dateTimeFormatter);
}
