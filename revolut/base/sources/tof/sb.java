package tof;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class sb {
    private sb() {
    }

    public static String a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String lowerCase = tb.f273094c.replace(value, "").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return kotlin.text.d0.F0(lowerCase).toString();
    }
}
