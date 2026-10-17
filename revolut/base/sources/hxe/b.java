package hxe;

import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import fmc.z;
import h93.l0;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ngm.n;
import yt8.i;
import yte.j;
import yte.k;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f156573a;

    public b(a checkoutExtraTopUpFactory, z juniorCheckoutExtraTopUpFactory) {
        Intrinsics.checkNotNullParameter(checkoutExtraTopUpFactory, "checkoutExtraTopUpFactory");
        Intrinsics.checkNotNullParameter(juniorCheckoutExtraTopUpFactory, "juniorCheckoutExtraTopUpFactory");
        this.f156573a = juniorCheckoutExtraTopUpFactory;
    }

    public final Object a(uwe.a aVar, boolean z, boolean z3, SelectedMethod selectedMethod, gim.c cVar) {
        CheckoutOrder checkoutOrder;
        k kVar;
        pi3.d dVar;
        CheckoutScreenContract$CheckoutTarget checkoutScreenContract$CheckoutTarget = aVar.f;
        Optional postActivationConfigOptional = aVar.f283631c;
        dj0.d dVar2 = aVar.k;
        if (checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Junior) {
            return this.f156573a.c(dVar2, postActivationConfigOptional, ((CheckoutScreenContract$CheckoutTarget.Junior) checkoutScreenContract$CheckoutTarget).f90716a, cVar);
        }
        CheckoutScreenContract$CheckoutContent$Order order = aVar.f283629a;
        dj0.d balance = aVar.f283630b;
        i kycStatus = aVar.e;
        boolean z4 = aVar.f283632g;
        boolean z6 = (selectedMethod instanceof vye.d) && ((vye.d) selectedMethod).e == vye.c.CHECKOUT_PREORDER;
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        Intrinsics.checkNotNullParameter(postActivationConfigOptional, "postActivationConfigOptional");
        if (!z6 && !z3) {
            boolean z11 = (n.p(kycStatus) || !order.getF90713b().f109938a.k() || z4) ? false : true;
            boolean z12 = z4 || balance.i(order.getF90713b().f109938a);
            if (balance.k() && z && z12 && !z11) {
                Intrinsics.checkNotNullParameter(order, "<this>");
                if (order instanceof CheckoutScreenContract$CheckoutContent$Order.Checkout) {
                    checkoutOrder = ((CheckoutScreenContract$CheckoutContent$Order.Checkout) order).f90710a;
                } else {
                    if (!(order instanceof CheckoutScreenContract$CheckoutContent$Order.ThreeDs)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    checkoutOrder = null;
                }
                if (((checkoutOrder == null || (dVar = checkoutOrder.d) == null) ? null : dVar.f236396n) != l0.INDIA_GLOBAL && (kVar = (k) u1.l(postActivationConfigOptional)) != null) {
                    j jVar = kVar.f316717a;
                    if (dVar2 == null) {
                        dVar2 = jVar.f316716b;
                    }
                    return new jxe.b(dVar2, jVar.f316715a);
                }
            }
        }
        return null;
    }
}
