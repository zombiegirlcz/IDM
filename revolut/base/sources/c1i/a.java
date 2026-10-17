package c1i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private a() {
    }

    public static String a(wd6.e exchangeMode) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        return j6.a.q("SECONDARY_CURRENCY", exchangeMode.name());
    }
}
