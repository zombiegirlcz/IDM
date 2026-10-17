package c0k;

import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements e {
    public static DateTimeFormatter a() {
        b.Companion.getClass();
        DateTimeFormatter dateTimeFormatterDateTime = ISODateTimeFormat.dateTime();
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterDateTime, "dateTime(...)");
        s.k(dateTimeFormatterDateTime);
        return dateTimeFormatterDateTime;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
