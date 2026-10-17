package cie;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u {
    public static String a(ProductAccountId productAccountId, ProductId productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(productId.getId(), "_:_", productAccountId.f89729a);
    }
}
