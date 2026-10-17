package ov3;

import com.revolut.kompot.common.ParcelableDestination;
import ft3.a1;
import ft3.q0;
import ft3.y0;
import grl.r2;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import yp3.b;
import yp3.c;
import yp3.d;
import yp3.e;
import yp3.f;

/* JADX INFO: loaded from: classes22.dex */
public interface a {
    static ParcelableDestination b(a aVar, r2 entryPointType, q0 product, wp3.a aVar2, d dVar, String str, e eVar, String str2, int i) {
        wp3.a activeApplicationStrategy = (i & 8) != 0 ? wp3.a.OPEN_EXISTING_APPLICATION : aVar2;
        d productArticleStrategy = (i & 16) != 0 ? d.DEFAULT : dVar;
        String str3 = (i & 32) != 0 ? null : str;
        f productIntroStrategy = f.SHOW_ALL;
        c planSelectionStrategy = c.DEFAULT;
        e eligibilityStrategy = (i & 256) != 0 ? e.SKIP_ON_TOGGLE_DISABLED : eVar;
        b kycStrategy = b.DEFAULT;
        y0 y0VarA = s.A(product.getF137851b());
        String str4 = (i & 8192) == 0 ? str2 : null;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(activeApplicationStrategy, "activeApplicationStrategy");
        Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
        Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
        Intrinsics.checkNotNullParameter(planSelectionStrategy, "planSelectionStrategy");
        Intrinsics.checkNotNullParameter(eligibilityStrategy, "eligibilityStrategy");
        Intrinsics.checkNotNullParameter(kycStrategy, "kycStrategy");
        return ((gz3.a) aVar).c(product, new a1(entryPointType, null, null, y0VarA, null, 16), activeApplicationStrategy, productArticleStrategy, str3, productIntroStrategy, planSelectionStrategy, eligibilityStrategy, kycStrategy, null, str4);
    }
}
