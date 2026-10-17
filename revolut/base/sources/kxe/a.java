package kxe;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final AccountId a(CheckoutScreenContract$CheckoutTarget checkoutScreenContract$CheckoutTarget) {
        Intrinsics.checkNotNullParameter(checkoutScreenContract$CheckoutTarget, "<this>");
        if (checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Joint) {
            return ((CheckoutScreenContract$CheckoutTarget.Joint) checkoutScreenContract$CheckoutTarget).f90715a;
        }
        if ((checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.RevXFiat) || (checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Savings) || (checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Pro) || (checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Invest) || (checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Junior) || (checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Main)) {
            return AccountId.Personal.f51414a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TopUpTarget b(CheckoutScreenContract$CheckoutTarget checkoutScreenContract$CheckoutTarget) {
        Intrinsics.checkNotNullParameter(checkoutScreenContract$CheckoutTarget, "<this>");
        if (checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Invest) {
            return new TopUpTarget.Invest(((CheckoutScreenContract$CheckoutTarget.Invest) checkoutScreenContract$CheckoutTarget).f90714a);
        }
        if (checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Joint) {
            return new TopUpTarget.Joint(((CheckoutScreenContract$CheckoutTarget.Joint) checkoutScreenContract$CheckoutTarget).f90715a);
        }
        boolean z = checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Junior;
        TopUpTarget.Main main = TopUpTarget.Main.f90573a;
        if (z || Intrinsics.f(checkoutScreenContract$CheckoutTarget, CheckoutScreenContract$CheckoutTarget.Main.f90717a)) {
            return main;
        }
        if (Intrinsics.f(checkoutScreenContract$CheckoutTarget, CheckoutScreenContract$CheckoutTarget.Pro.f90718a)) {
            return TopUpTarget.Pro.f90574a;
        }
        if (Intrinsics.f(checkoutScreenContract$CheckoutTarget, CheckoutScreenContract$CheckoutTarget.RevXFiat.f90719a)) {
            return TopUpTarget.RevXFiat.f90575a;
        }
        if (!(checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Savings)) {
            throw new NoWhenBranchMatchedException();
        }
        CheckoutScreenContract$CheckoutTarget.Savings savings = (CheckoutScreenContract$CheckoutTarget.Savings) checkoutScreenContract$CheckoutTarget;
        return new TopUpTarget.Savings(savings.f90721b, savings.f90720a);
    }
}
