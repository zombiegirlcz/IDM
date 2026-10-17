package com.revolut.feature.credit_card.autopay.api.models_v3;

import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mb5.u;
import nb5.e;
import nb5.h;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d {
    public static final CreditScheduledAmountType a(CreditCardAutopayPayment.PaymentAmount paymentAmount) {
        Intrinsics.checkNotNullParameter(paymentAmount, "<this>");
        boolean z = paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.MinRepayment;
        CreditScheduledAmountType.Minimum minimum = CreditScheduledAmountType.Minimum.f70685a;
        if (z) {
            return minimum;
        }
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.StatementBalance) {
            return CreditScheduledAmountType.Statement.f70686a;
        }
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Fixed) {
            return new CreditScheduledAmountType.Fixed(((CreditCardAutopayPayment.PaymentAmount.Fixed) paymentAmount).f70712a);
        }
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Unsupported) {
            return minimum;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final u b(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = h.f213985a[eVar.ordinal()];
        if (i == 1) {
            return u.BACKUP_CARD;
        }
        if (i == 2) {
            return u.DIRECT_DEBIT;
        }
        if (i == 3) {
            return u.SCHEDULED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final CreditCardAutopayPayment.PaymentAmount c(CreditScheduledAmountType creditScheduledAmountType) {
        Intrinsics.checkNotNullParameter(creditScheduledAmountType, "<this>");
        if (creditScheduledAmountType instanceof CreditScheduledAmountType.Minimum) {
            return CreditCardAutopayPayment.PaymentAmount.MinRepayment.f70713a;
        }
        if (creditScheduledAmountType instanceof CreditScheduledAmountType.Statement) {
            return CreditCardAutopayPayment.PaymentAmount.StatementBalance.f70714a;
        }
        if (creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed) {
            return new CreditCardAutopayPayment.PaymentAmount.Fixed(((CreditScheduledAmountType.Fixed) creditScheduledAmountType).f70684a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
