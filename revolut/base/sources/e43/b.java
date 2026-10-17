package e43;

import h93.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    public static boolean a(l0 cardType, String pocketCurrency) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        int i = a.f122380a[cardType.ordinal()];
        if (i == 1) {
            xi0.b.Companion.getClass();
            return Intrinsics.f(pocketCurrency, xi0.b.D.f306286a);
        }
        if (i == 2) {
            xi0.b.Companion.getClass();
            if (Intrinsics.f(pocketCurrency, xi0.b.D.f306286a)) {
                return false;
            }
        } else if (i == 3) {
            xi0.b.Companion.getClass();
            if (Intrinsics.f(pocketCurrency, xi0.b.z.f306286a)) {
                return false;
            }
        }
        return true;
    }
}
