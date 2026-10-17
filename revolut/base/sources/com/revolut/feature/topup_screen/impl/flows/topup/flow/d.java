package com.revolut.feature.topup_screen.impl.flows.topup.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ TopupFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f90902w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TopupFlowContract$Step topupFlowContract$Step, i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = topupFlowContract$Step;
        this.f90902w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f90902w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (((e0f.r1) r0).m(r7, r8, r9, true, r12) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (((e0f.r1) r0).o(r13, r1, r12) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            com.revolut.feature.topup_screen.impl.flows.topup.flow.i r0 = r12.f90902w
            uye.g r1 = r0.o
            u51.a r0 = r0.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r12.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            yhm.o.b(r13)
            r11 = r12
            goto L59
        L20:
            yhm.o.b(r13)
            com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step r13 = r12.v
            com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$CardVerificationWorkflow r13 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step.CardVerificationWorkflow) r13
            com.revolut.feature.topup_screen.common.CardDetails r7 = r13.d
            if (r7 == 0) goto L43
            java.lang.String r8 = r13.f90838c
            pte.a r13 = r1.f284276b
            com.revolut.feature.topup_screen.common.TopUpTarget r1 = r1.f284275a
            yte.n r9 = pw5.a.K(r13, r1)
            r12.u = r5
            r6 = r0
            e0f.r1 r6 = (e0f.r1) r6
            r10 = 1
            r11 = r12
            java.lang.Object r13 = r6.m(r7, r8, r9, r10, r11)
            if (r13 != r2) goto L59
            goto L58
        L43:
            r11 = r12
            java.lang.String r13 = r13.f90838c
            pte.a r3 = r1.f284276b
            com.revolut.feature.topup_screen.common.TopUpTarget r1 = r1.f284275a
            yte.n r1 = pw5.a.K(r3, r1)
            r11.u = r4
            e0f.r1 r0 = (e0f.r1) r0
            java.lang.Object r13 = r0.o(r13, r1, r12)
            if (r13 != r2) goto L59
        L58:
            return r2
        L59:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
