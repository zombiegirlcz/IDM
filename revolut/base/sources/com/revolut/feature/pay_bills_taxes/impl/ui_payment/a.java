package com.revolut.feature.pay_bills_taxes.impl.ui_payment;

import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.PaymentFlowContract$Step;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData;
import cp5.d;
import dh9.b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import pfk.o0;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final BillPaymentNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ph9.a f78758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b3a.a f78759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final co9.b f78760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f78761s;

    public a(BillPaymentNavigation$InputData flowInputData, ph9.a errorHandlerExtension, b3a.a chatTransferNavigationProvider, co9.b paymentCounterpartyInteractor) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        this.o = flowInputData;
        this.f78758p = errorHandlerExtension;
        this.f78759q = chatTransferNavigationProvider;
        this.f78760r = paymentCounterpartyInteractor;
        this.f78761s = d.a(this, new PaymentFlowContract$Step.Amount(new PaymentAmountContract$InputData.NewTransfer(flowInputData.f78670a, flowInputData.d, flowInputData.e, true, flowInputData.f78674h, flowInputData.i, flowInputData.f78675j)), f0.f322471a, new dgj.h(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.pay_bills_taxes.impl.ui_payment.a r6, k71.c r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof dh9.d
            if (r0 == 0) goto L13
            r0 = r9
            dh9.d r0 = (dh9.d) r0
            int r1 = r0.f114772x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114772x = r1
            goto L18
        L13:
            dh9.d r0 = new dh9.d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114772x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            k71.c r7 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L51
        L2a:
            r0 = move-exception
            r8 = r0
            goto L56
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r9)
            com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData r9 = r6.o
            xo1.g r9 = r9.f78670a
            xo1.g r2 = xo1.g.NZ_BILLS
            if (r9 != r2) goto L75
            if (r8 == 0) goto L64
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            co9.b r9 = r6.f78760r     // Catch: java.lang.Throwable -> L2a
            r0.u = r7     // Catch: java.lang.Throwable -> L2a
            r0.f114772x = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r9 = r9.a(r8, r0)     // Catch: java.lang.Throwable -> L2a
            if (r9 != r1) goto L51
            return r1
        L51:
            com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo r9 = (com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo) r9     // Catch: java.lang.Throwable -> L2a
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            goto L5c
        L56:
            yhm.m$a r9 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r8)
        L5c:
            boolean r8 = r9 instanceof yhm.n
            if (r8 == 0) goto L61
            r9 = r4
        L61:
            com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo r9 = (com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo) r9
            goto L65
        L64:
            r9 = r4
        L65:
            if (r9 == 0) goto L6c
            com.revolut.feature.payments.social.api.model.ChatTransferRecipient$PaymentCounterpartyRecipient r4 = new com.revolut.feature.payments.social.api.model.ChatTransferRecipient$PaymentCounterpartyRecipient
            r4.<init>(r9)
        L6c:
            b3a.a r6 = r6.f78759q
            v3a.b r6 = (v3a.b) r6
            com.revolut.retail.core.navigation.CompositeCommand r6 = r6.e(r7, r4)
            return r6
        L75:
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig$Details r0 = new com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig$Details
            r4 = 0
            r5 = 122(0x7a, float:1.71E-43)
            r2 = 0
            r3 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pay_bills_taxes.impl.ui_payment.a.I2(com.revolut.feature.pay_bills_taxes.impl.ui_payment.a, k71.c, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ph9.b bVar = (ph9.b) this.f78758p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        z zVarA = bVar.f236247l.a(throwable);
        if (zVarA != null) {
            n.j2(bVar, bVar.L2(new y0(null, zVarA, false, 5)), null, new o0(bVar, (Continuation) null, 1), 3);
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78761s;
    }
}
