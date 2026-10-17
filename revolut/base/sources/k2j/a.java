package k2j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static boolean a(xi0.b sourceCurrency, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        if (cp5.d.z(sourceCurrency) && cp5.d.y(targetCurrency)) {
            return false;
        }
        return (cp5.d.y(sourceCurrency) && cp5.d.z(targetCurrency)) ? false : true;
    }
}
