package g88;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    private h() {
    }

    public static String a(ProductAccountId productAccountId) {
        String strE0;
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        String str = productAccountId.f89729a;
        r68.b.Companion.getClass();
        String str2 = r68.a.f251650b;
        if (!a0.H(str, str2, false)) {
            str = null;
        }
        if (str == null || (strE0 = d0.e0(str, str2)) == null || strE0.length() <= 0) {
            return null;
        }
        return strE0;
    }
}
