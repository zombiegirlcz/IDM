package ixe;

import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutOrderFeeBreakdown;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    public static CheckoutOrderFeeBreakdown a(c93.l pricing) {
        jxe.d dVar;
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        dj0.d dVar2 = pricing.f22290a;
        dj0.d dVar3 = pricing.f22291b;
        Iterable<c93.m> iterable = pricing.f22292c;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (c93.m mVar : iterable) {
            dj0.d dVar4 = mVar.f22293a;
            switch (j.f169560b[mVar.f22294b.ordinal()]) {
                case 1:
                    dVar = jxe.d.VAT;
                    break;
                case 2:
                    dVar = jxe.d.CENTRAL_GOOD_AND_SERVICES;
                    break;
                case 3:
                    dVar = jxe.d.INTEGRATED_GOOD_AND_SERVICES;
                    break;
                case 4:
                    dVar = jxe.d.STATE_GOOD_AND_SERVICES;
                    break;
                case 5:
                    dVar = jxe.d.GMF;
                    break;
                case 6:
                    dVar = jxe.d.STAMP_DUTY;
                    break;
                case 7:
                    dVar = jxe.d.UNKNOWN;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            CheckoutOrderFeeBreakdown.CheckoutFeeTax checkoutFeeTax = new CheckoutOrderFeeBreakdown.CheckoutFeeTax(dVar4, dVar);
            if (!dVar4.f(dj0.d.e)) {
                checkoutFeeTax = null;
            }
            if (checkoutFeeTax != null) {
                arrayList.add(checkoutFeeTax);
            }
        }
        return new CheckoutOrderFeeBreakdown(dVar2, dVar3, arrayList);
    }
}
