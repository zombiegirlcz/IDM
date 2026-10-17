package twe;

import b93.f;
import b93.g;
import b93.h;
import com.revolut.feature.checkout.models.Checkout;
import com.revolut.feature.checkout.models.CheckoutConfig;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import h93.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pi3.d;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public final CheckoutScreenContract$CheckoutTarget a(CheckoutFlowContract$InputData inputData) {
        CheckoutOrder checkoutOrder;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CheckoutParams checkoutParams = inputData.f90668a;
        CheckoutConfig checkoutConfig = inputData.f90669b;
        String str = null;
        Checkout.Order order = checkoutConfig instanceof Checkout.Order ? (Checkout.Order) checkoutConfig : null;
        d dVar = (order == null || (checkoutOrder = order.f65844a) == null) ? null : checkoutOrder.d;
        if ((checkoutParams instanceof CheckoutParams.CardOrder) && dVar != null && dVar.f236395m == j0.YOUTH) {
            f fVar = ((CheckoutParams.CardOrder) checkoutParams).f65850a;
            if (!(fVar instanceof f.a) && !(fVar instanceof f.b) && !(fVar instanceof h)) {
                if (!(fVar instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((g) fVar).f13621c;
            }
            if (str != null) {
                return new CheckoutScreenContract$CheckoutTarget.Junior(str);
            }
        }
        TopUpTarget topUpTarget = inputData.f90670c;
        if (topUpTarget instanceof TopUpTarget.Invest) {
            return new CheckoutScreenContract$CheckoutTarget.Invest(((TopUpTarget.Invest) topUpTarget).f90571a);
        }
        if (topUpTarget instanceof TopUpTarget.Joint) {
            return new CheckoutScreenContract$CheckoutTarget.Joint(((TopUpTarget.Joint) topUpTarget).f90572a);
        }
        if (Intrinsics.f(topUpTarget, TopUpTarget.Main.f90573a)) {
            return CheckoutScreenContract$CheckoutTarget.Main.f90717a;
        }
        if (Intrinsics.f(topUpTarget, TopUpTarget.Pro.f90574a)) {
            return CheckoutScreenContract$CheckoutTarget.Pro.f90718a;
        }
        if (Intrinsics.f(topUpTarget, TopUpTarget.RevXFiat.f90575a)) {
            return CheckoutScreenContract$CheckoutTarget.RevXFiat.f90719a;
        }
        if (!(topUpTarget instanceof TopUpTarget.Savings)) {
            throw new NoWhenBranchMatchedException();
        }
        TopUpTarget.Savings savings = (TopUpTarget.Savings) topUpTarget;
        return new CheckoutScreenContract$CheckoutTarget.Savings(savings.f90577b, savings.f90576a);
    }
}
