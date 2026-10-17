package hf1;

import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {
    public static dj0.d a(CartItem cartItem) {
        Intrinsics.checkNotNullParameter(cartItem, "cartItem");
        TaxRate taxRate = cartItem.f;
        double d = taxRate != null ? taxRate.e / ((double) 100) : 0.0d;
        return pyd.c.T(d / (((double) 1) + d), b(cartItem));
    }

    public static dj0.d b(CartItem cartItem) {
        Intrinsics.checkNotNullParameter(cartItem, "cartItem");
        return pyd.c.U(cartItem.d, cartItem.f60666g);
    }
}
