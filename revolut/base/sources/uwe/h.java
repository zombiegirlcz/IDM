package uwe;

import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan;
import e93.j0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h {
    public static final long a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        dj0.d dVarH = pyd.c.H(aVar.f283629a.getF90713b().f109938a, aVar.f283633h);
        CheckoutCardPlan checkoutCardPlan = aVar.i;
        return pyd.c.H(dVarH, checkoutCardPlan != null ? checkoutCardPlan.f90757c : null).f115082a;
    }

    public static final j0 b(a aVar, e93.c cVar) {
        j0 j0Var;
        Object next;
        CheckoutOrder checkoutOrder;
        pi3.d dVar;
        pi3.i iVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        CheckoutScreenContract$CheckoutContent$Order checkoutScreenContract$CheckoutContent$Order = aVar.f283629a;
        CheckoutScreenContract$CheckoutContent$Order.Checkout checkout = checkoutScreenContract$CheckoutContent$Order instanceof CheckoutScreenContract$CheckoutContent$Order.Checkout ? (CheckoutScreenContract$CheckoutContent$Order.Checkout) checkoutScreenContract$CheckoutContent$Order : null;
        dj0.d dVar2 = (checkout == null || (checkoutOrder = checkout.f90710a) == null || (dVar = checkoutOrder.d) == null || (iVar = dVar.f236397p) == null) ? null : iVar.f236407a;
        j0 j0Var2 = aVar.f283635l;
        if (j0Var2 != null) {
            return j0Var2;
        }
        if (cVar != null) {
            Iterator it8 = cVar.f123825b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((j0) next).f123876a, dVar2)) {
                    break;
                }
            }
            j0Var = (j0) next;
        } else {
            j0Var = null;
        }
        if (j0Var != null) {
            return j0Var;
        }
        if (cVar != null) {
            return (j0) d0.o0(cVar.f123825b);
        }
        return null;
    }
}
