package vge;

import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f2 {
    private f2() {
    }

    public static String a(ProductId productId) {
        Intrinsics.checkNotNullParameter(productId, "<this>");
        return j6.a.q("PRODUCT_PREFIX_", productId.getId());
    }
}
