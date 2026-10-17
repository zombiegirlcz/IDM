package com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f102043w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z, c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f102043w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f102043w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r7 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r7 == r0) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            r3 = 1
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c r4 = r6.f102043w
            boolean r5 = r6.v
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            yhm.o.b(r7)
            goto L51
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L35
        L20:
            yhm.o.b(r7)
            r7 = 0
            if (r5 == 0) goto L3c
            w3k.h r1 = new w3k.h
            r2 = 0
            r1.<init>(r4, r7, r2)
            r6.u = r3
            java.lang.Object r7 = r4.p2(r6, r1)
            if (r7 != r0) goto L35
            goto L50
        L35:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L57
        L3c:
            w3k.h r1 = new w3k.h
            r3 = 1
            r1.<init>(r4, r7, r3)
            r6.u = r2
            tji.f r7 = r4.X()
            java.lang.String r2 = "REMITTANCE_AMOUNT_CTA_BUTTON_TAG"
            java.lang.Object r7 = zh9.u0.b0(r7, r2, r1, r6)
            if (r7 != r0) goto L51
        L50:
            return r0
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
        L57:
            if (r7 == 0) goto L5c
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlowContract$Step$Recipient r7 = com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlowContract$Step.Recipient.f102039a
            goto L66
        L5c:
            if (r5 == 0) goto L64
            r4.Q2(r5)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L64:
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlowContract$Step$New r7 = com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlowContract$Step.New.f102038a
        L66:
            if (r5 == 0) goto L6b
            com.revolut.kompot.navigable.TransitionAnimation$SLIDE_START_TO_END r0 = com.revolut.kompot.navigable.TransitionAnimation.SLIDE_START_TO_END.f98396a
            goto L6d
        L6b:
            com.revolut.kompot.navigable.TransitionAnimation$SLIDE_END_TO_START r0 = com.revolut.kompot.navigable.TransitionAnimation.SLIDE_END_TO_START.f98395a
        L6d:
            r1 = 0
            r4.E2(r7, r1, r0, r1)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
