package com.revolut.feature.credit.card.impl.ui.instalment.repay.details;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r13 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r13 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            yhm.o.b(r13)
            goto L82
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L19:
            yhm.o.b(r13)
            r10 = r12
            goto L82
        L1e:
            yhm.o.b(r13)
            com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c r13 = r12.v
            cli.y r1 = r13.f69492s
            com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData r4 = r13.o
            al4.m r13 = r13.f69489p
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            xs4.f r1 = (xs4.f) r1
            com.revolut.data.model.Data r1 = r1.f308395a
            java.lang.Object r1 = zi0.c.I(r1)
            com.revolut.feature.credit.card.impl.ui.instalment.repay.details.a r1 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.details.a) r1
            dj0.d r8 = r1.f69488c
            com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData$RepayDetails r1 = r1.f69486a
            boolean r5 = r1 instanceof com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract.InputData.RepayDetails.FutureInstalments
            if (r5 == 0) goto L64
            com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData$RepayDetails$FutureInstalments r1 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract.InputData.RepayDetails.FutureInstalments) r1
            r12.u = r3
            com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuote r1 = r1.f69483a
            java.lang.String r6 = r4.f69478a
            java.lang.String r7 = r4.f69479b
            dj0.d r9 = r1.d
            int r1 = r1.f68768a
            r5 = r13
            om4.r1 r5 = (om4.r1) r5
            r11 = r12
            r10 = r8
            r8 = r1
            java.lang.Object r13 = r5.s(r6, r7, r8, r9, r10, r11)
            r10 = r11
            if (r13 != r0) goto L5f
            goto L61
        L5f:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L61:
            if (r13 != r0) goto L82
            goto L81
        L64:
            r10 = r12
            boolean r3 = r1 instanceof com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract.InputData.RepayDetails.CustomAmount
            if (r3 == 0) goto L85
            com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData$RepayDetails$CustomAmount r1 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract.InputData.RepayDetails.CustomAmount) r1
            r10.u = r2
            java.lang.String r6 = r4.f69478a
            java.lang.String r7 = r4.f69479b
            dj0.d r9 = r1.f69481a
            r5 = r13
            om4.r1 r5 = (om4.r1) r5
            java.lang.Object r13 = r5.r(r6, r7, r8, r9, r10)
            if (r13 != r0) goto L7d
            goto L7f
        L7d:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L7f:
            if (r13 != r0) goto L82
        L81:
            return r0
        L82:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L85:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.card.impl.ui.instalment.repay.details.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
