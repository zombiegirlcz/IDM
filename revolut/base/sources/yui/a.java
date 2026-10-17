package yui;

import java.time.LocalDate;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static LocalDate a(TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        LocalDate localDateNow = LocalDate.now(timeZone.toZoneId());
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        return localDateNow;
    }
}
