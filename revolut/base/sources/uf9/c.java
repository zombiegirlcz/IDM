package uf9;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f279628w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, List list, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f279628w = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f279628w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            uf9.d r3 = r0.v
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L1c
            if (r2 != r5) goto L14
            yhm.o.b(r22)
            r2 = r22
            goto L31
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            yhm.o.b(r22)
            tw9.h r2 = new tw9.h
            java.util.List r6 = r0.f279628w
            r7 = 8
            r2.<init>(r3, r6, r4, r7)
            r0.u = r5
            java.lang.Object r2 = r3.Y2(r0, r2)
            if (r2 != r1) goto L31
            return r1
        L31:
            com.revolut.feature.apm.bills.core.api.model.search.uae.BillSearchUaeResult r2 = (com.revolut.feature.apm.bills.core.api.model.search.uae.BillSearchUaeResult) r2
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.PaymentFlow r1 = new com.revolut.feature.pay_bills_taxes.impl.ui_payment.PaymentFlow
            com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData r6 = new com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData
            xo1.g r7 = xo1.g.UAE_BILLS
            com.revolut.feature.apm.bills.core.api.model.BillTransferType r8 = com.revolut.feature.apm.bills.core.api.model.BillTransferType.BILL_PAYMENT
            dj0.d r9 = r2.f61461b
            if (r9 != 0) goto L4d
            dj0.d r9 = new dj0.d
            xi0.a r10 = xi0.b.Companion
            r10.getClass()
            xi0.b r10 = xi0.b.v
            r11 = 0
            r9.<init>(r11, r10)
        L4d:
            r14 = r9
            dj0.d r15 = r2.f61464h
            dj0.d r9 = r2.i
            boolean r10 = r2.e
            r11 = 0
            if (r10 != 0) goto L5f
            dj0.d r10 = r2.f61461b
            if (r10 != 0) goto L5c
            goto L5f
        L5c:
            r17 = r11
            goto L61
        L5f:
            r17 = r5
        L61:
            com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider r10 = r2.d
            com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$BillData r13 = new com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$BillData
            r18 = 0
            r20 = 0
            r16 = r9
            r19 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r9 = r11
            r10 = r13
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_descriptor_payment_amount_title
            r13 = 14
            r11.<init>(r12, r4, r4, r13)
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_descriptor_payment_review_title
            r12.<init>(r14, r4, r4, r13)
            boolean r13 = r2.f
            if (r13 == 0) goto L94
            gte.a r13 = r3.f279631n
            com.revolut.feature.pay_bills_taxes.api.PayBillsAndTaxesApi$Toggles$UaeBillsSchedule r14 = com.revolut.feature.pay_bills_taxes.api.PayBillsAndTaxesApi$Toggles.UaeBillsSchedule.f78665c
            jte.d r13 = (jte.d) r13
            boolean r13 = r13.c(r14)
            if (r13 == 0) goto L94
            r14 = r5
            goto L95
        L94:
            r14 = r9
        L95:
            boolean r15 = r2.f61463g
            r16 = 64
            java.util.List r9 = r0.f279628w
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.<init>(r6)
            r2 = 3
            yji.n.P2(r3, r1, r4, r4, r2)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uf9.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
