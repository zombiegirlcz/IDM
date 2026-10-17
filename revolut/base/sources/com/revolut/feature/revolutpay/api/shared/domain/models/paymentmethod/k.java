package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k {
    public static final PaymentMethod.Pocket.PocketDetails.Savings a(PaymentMethod.Pocket pocket) {
        Intrinsics.checkNotNullParameter(pocket, "<this>");
        PaymentMethod.Pocket.PocketDetails pocketDetails = pocket.f84383m;
        Intrinsics.i(pocketDetails, "null cannot be cast to non-null type com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.Pocket.PocketDetails.Savings");
        return (PaymentMethod.Pocket.PocketDetails.Savings) pocketDetails;
    }

    public static final String b(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        if (paymentMethod instanceof PaymentMethod.Pocket) {
            return ((PaymentMethod.Pocket) paymentMethod).f84377b;
        }
        if ((paymentMethod instanceof PaymentMethod.RevolutAccount) || (paymentMethod instanceof PaymentMethod.Card) || (paymentMethod instanceof PaymentMethod.BankAccount)) {
            return paymentMethod.getF84393a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public static final PaymentMethod.Pocket c(PaymentMethod.RevolutAccount revolutAccount, String str) {
        Intrinsics.checkNotNullParameter(revolutAccount, "<this>");
        if (str == null) {
            return null;
        }
        Iterator it8 = revolutAccount.f84394b.values().iterator();
        while (it8.hasNext()) {
            for (PaymentMethod.Pocket pocket : w.u(((PaymentMethod.RevolutAccount.Wallet) it8.next()).f84396b.values())) {
                if (Intrinsics.f(pocket.f84376a, str)) {
                    return pocket;
                }
            }
        }
        return null;
    }

    public static final String d(PaymentMethod paymentMethod) {
        if (paymentMethod instanceof PaymentMethod.Pocket) {
            return ((PaymentMethod.Pocket) paymentMethod).f84376a;
        }
        if ((paymentMethod instanceof PaymentMethod.RevolutAccount) || (paymentMethod instanceof PaymentMethod.Card) || (paymentMethod instanceof PaymentMethod.BankAccount) || paymentMethod == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean e(PaymentMethod paymentMethod) {
        if ((paymentMethod instanceof PaymentMethod.RevolutAccount) || (paymentMethod instanceof PaymentMethod.Pocket)) {
            return true;
        }
        if ((paymentMethod instanceof PaymentMethod.Card) || (paymentMethod instanceof PaymentMethod.BankAccount) || paymentMethod == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final u6c.l f(PaymentMethod paymentMethod) {
        if (paymentMethod instanceof PaymentMethod.Pocket) {
            PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) paymentMethod;
            if (pocket.f84378c == i.CURRENT) {
                return pocket.f == j.PERSONAL_JOINT ? u6c.l.JOINT : u6c.l.PERSONAL_FIAT;
            }
        }
        return u6c.l.UNDEFINED;
    }
}
