package org.joda.time.convert;

import java.util.Date;
import org.joda.time.Chronology;

/* JADX INFO: loaded from: classes14.dex */
final class DateConverter extends AbstractConverter implements InstantConverter, PartialConverter {
    static final DateConverter INSTANCE = new DateConverter();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj2, Chronology chronology) {
        return ((Date) obj2).getTime();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return Date.class;
    }
}
