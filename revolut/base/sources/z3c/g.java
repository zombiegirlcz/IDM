package z3c;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import d3c.p;
import d3c.x;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static UrlImage a(p product, boolean z) {
        Intrinsics.checkNotNullParameter(product, "product");
        x xVar = (x) d0.d0(product.f);
        String str = xVar != null ? xVar.k.f110988a : null;
        String str2 = (str == null || kotlin.text.d0.W(str)) ? null : str;
        if (str2 == null) {
            return null;
        }
        return new UrlImage(str2, null, null, null, 0L, null, null, null, z ? ez0.h.FitCenter : null, null, false, null, null, null, false, false, 523774);
    }
}
