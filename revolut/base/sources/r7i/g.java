package r7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static boolean a(xi0.b currency, AccountWrapper accountWrapper) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        xi0.b.Companion.getClass();
        if (!Intrinsics.f(currency, xi0.b.D)) {
            return true;
        }
        j8l.a[] elements = {j8l.a.CRYPTO, j8l.a.VAULT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (d0.T(kotlin.collections.d.y0(elements), accountWrapper != null ? accountWrapper.f97224a : null)) {
            return !cp5.d.z(accountWrapper != null ? accountWrapper.getCurrency() : null);
        }
        return true;
    }
}
