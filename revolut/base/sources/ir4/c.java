package ir4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.direct_debit.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (((yb5.e) r1).e(r13, r5, r12) == r2) goto L25;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            com.revolut.feature.credit.card.impl.ui.direct_debit.b r0 = r12.v
            lb5.b r1 = r0.o
            qki.d r0 = r0.f69273r
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r12.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L23
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            yhm.o.b(r13)
            goto Lb2
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            yhm.o.b(r13)
            goto L7a
        L23:
            yhm.o.b(r13)
            java.lang.Object r13 = r0.f22677a
            vkm.j2 r13 = (vkm.j2) r13
            java.lang.Object r13 = r13.getValue()
            com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State r13 = (com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State) r13
            java.lang.String r8 = r13.f69264a
            nb5.f r9 = new nb5.f
            java.lang.Object r13 = r0.f22677a
            vkm.j2 r13 = (vkm.j2) r13
            java.lang.Object r13 = r13.getValue()
            com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State r13 = (com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State) r13
            com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType$DirectDebit r13 = r13.f69265b
            nb5.g r13 = r13.f70733h
            java.lang.String r3 = "Required value was null."
            if (r13 == 0) goto Lbb
            java.lang.Object r6 = r0.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State r6 = (com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State) r6
            java.lang.String r6 = r6.f69266c
            if (r6 == 0) goto Lb5
            r9.<init>(r13, r6)
            r12.u = r5
            r13 = r1
            yb5.e r13 = (yb5.e) r13
            hd.r r7 = r13.f312201a
            b96.d r6 = new b96.d
            r11 = 5
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r6, r12)
            if (r13 != r2) goto L70
            goto L72
        L70:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L72:
            if (r13 != r2) goto L75
            goto L77
        L75:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L77:
            if (r13 != r2) goto L7a
            goto Lb1
        L7a:
            java.lang.Object r13 = r0.f22677a
            vkm.j2 r13 = (vkm.j2) r13
            java.lang.Object r13 = r13.getValue()
            com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State r13 = (com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State) r13
            java.lang.String r13 = r13.f69264a
            com.revolut.feature.credit_card.autopay.api.models_v3.b r5 = new com.revolut.feature.credit_card.autopay.api.models_v3.b
            nb5.e r6 = nb5.e.DIRECT_DEBIT
            com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment$PaymentDay r7 = new com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment$PaymentDay
            nb5.b r3 = nb5.b.DUE_DATE
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State r0 = (com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State) r0
            com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType$DirectDebit r0 = r0.f69265b
            int r0 = r0.f
            r8 = 0
            r7.<init>(r3, r0, r8)
            com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment$PaymentAmount$MinRepayment r8 = com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment.PaymentAmount.MinRepayment.f70713a
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12.u = r4
            yb5.e r1 = (yb5.e) r1
            java.lang.Object r13 = r1.e(r13, r5, r12)
            if (r13 != r2) goto Lb2
        Lb1:
            return r2
        Lb2:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        Lb5:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r3)
            throw r13
        Lbb:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r3)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ir4.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
