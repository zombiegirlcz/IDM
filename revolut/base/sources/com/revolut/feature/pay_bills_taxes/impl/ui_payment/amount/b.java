package com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount;

import kotlin.jvm.internal.Intrinsics;
import opf.c0;
import rh9.e;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentAmountContract$InputData f78776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x02.b f78777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x02.a f78778c;
    public final vo9.a d;
    public final e e;
    public final c0 f;

    public b(PaymentAmountContract$InputData inputData, x02.b quoteInteractor, x02.a apmPocketInteractor, vo9.a pocketMapper, e validator, c0 transferSuggestedAmountsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(apmPocketInteractor, "apmPocketInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        this.f78776a = inputData;
        this.f78777b = quoteInteractor;
        this.f78778c = apmPocketInteractor;
        this.d = pocketMapper;
        this.e = validator;
        this.f = transferSuggestedAmountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData.NewTransfer r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.a
            if (r0 == 0) goto L13
            r0 = r13
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.a r0 = (com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.a) r0
            int r1 = r0.f78775y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78775y = r1
            goto L18
        L13:
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.a r0 = new com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.a
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f78773w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f78775y
            com.revolut.core.model.account.AccountId$Personal r8 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r1 = r0.v
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData$NewTransfer r12 = r0.u
            yhm.o.b(r13)
            r5 = r1
            goto L53
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            yhm.o.b(r13)
            com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$BillData r13 = r12.f78763b
            dj0.d r13 = r13.f78666a
            long r4 = r13.f115082a
            xi0.b r13 = r13.f115083b
            r0.u = r12
            r0.v = r4
            r0.f78775y = r3
            x02.a r2 = r11.f78778c
            q12.d r2 = (q12.d) r2
            java.lang.Object r13 = r2.c(r8, r0, r13)
            if (r13 != r1) goto L52
            return r1
        L52:
            r5 = r4
        L53:
            r4 = r13
            com.revolut.feature.transfer.core.models.PocketSource r4 = (com.revolut.feature.transfer.core.models.PocketSource) r4
            xi0.b r7 = r4.f92241b
            boolean r13 = r12.d
            if (r13 == 0) goto L71
            com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection$Outgoing r13 = new com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection$Outgoing
            xo1.g r0 = r12.getF78767b()
            com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod r0 = oh9.b.a(r0)
            r13.<init>(r0)
            boolean r13 = r13.a()
            if (r13 == 0) goto L71
        L6f:
            r9 = r3
            goto L73
        L71:
            r3 = 0
            goto L6f
        L73:
            com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$BillData r12 = r12.f78763b
            boolean r10 = r12.d
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData r3 = new com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData
            r3.<init>(r4, r5, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.b.a(com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData$NewTransfer, gim.c):java.lang.Object");
    }
}
