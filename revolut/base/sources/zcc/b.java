package zcc;

import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import kotlin.jvm.internal.Intrinsics;
import u6c.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static u a(CheckoutMode checkoutMode, boolean z) {
        Intrinsics.checkNotNullParameter(checkoutMode, "checkoutMode");
        if (Intrinsics.f(checkoutMode, CheckoutMode.CustomerInitiated.f84335b) && z) {
            return u.CUSTOMER;
        }
        if (checkoutMode instanceof CheckoutMode.MerchantInitiated) {
            return u.MERCHANT;
        }
        return null;
    }
}
