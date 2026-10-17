package elf;

import com.revolut.feature.shared.savings.models.product.ProductGroup;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w1 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f127428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final njb.d f127429m;

    public w1(j60.a bottomDialogExtension, njb.d productInfoSheetsDelegate) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(productInfoSheetsDelegate, "productInfoSheetsDelegate");
        this.f127428l = bottomDialogExtension;
        this.f127429m = productInfoSheetsDelegate;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean zF = Intrinsics.f(str, "ID_SAVINGS_INCOME_TAX");
        boolean z = true;
        j60.a aVar = this.f127428l;
        if (zF) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.shared.savings.models.product.ProductGroup.Tax");
            aVar.x(((skb.f) this.f127429m).e((ProductGroup.Tax) obj2));
        } else if (Intrinsics.f(str, "ID_SAVINGS_INTEREST_GOT_IT_BUTTON")) {
            j60.a.v(aVar, false, null, 2);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
