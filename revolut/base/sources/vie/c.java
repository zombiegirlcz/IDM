package vie;

import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private c() {
    }

    public static boolean a(ProductId productId, ProductAccountId.Payload payload) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        int i = b.f289577a[productId.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3) {
            return false;
        }
        return payload instanceof ExtendedSubaccountType.Collateral;
    }
}
