package org.joda.time.convert;

import org.joda.time.Chronology;

/* JADX INFO: loaded from: classes14.dex */
class LongConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter {
    static final LongConverter INSTANCE = new LongConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj2) {
        return ((Long) obj2).longValue();
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj2, Chronology chronology) {
        return ((Long) obj2).longValue();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return Long.class;
    }
}
