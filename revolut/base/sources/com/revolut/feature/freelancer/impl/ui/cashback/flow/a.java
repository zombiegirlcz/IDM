package com.revolut.feature.freelancer.impl.ui.cashback.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r14 == r0) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.u
            r2 = 2
            r3 = 1
            com.revolut.feature.freelancer.impl.ui.cashback.flow.c r4 = r13.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r14)
            goto L71
        L12:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1a:
            yhm.o.b(r14)
            goto L3b
        L1e:
            yhm.o.b(r14)
            ip0.yc0 r5 = new ip0.yc0
            et6.u0 r7 = r4.o
            r11 = 0
            r12 = 16
            r6 = 1
            java.lang.Class<et6.u0> r8 = et6.u0.class
            java.lang.String r9 = "hasAcquiring"
            java.lang.String r10 = "hasAcquiring(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.u = r3
            java.lang.Object r14 = r4.p2(r13, r5)
            if (r14 != r0) goto L3b
            goto L6b
        L3b:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r1 = 6
            r3 = 0
            if (r14 != 0) goto L4d
            yki.i r14 = r4.f73748t
            com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step$Plan r0 = com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step.Plan.f73742a
            oki.h.u2(r4, r14, r0, r3, r1)
            goto L71
        L4d:
            com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$InputData r14 = r4.f73745q
            com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step r14 = r14.f73738a
            com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step$Booster r5 = com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step.Booster.f73739a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r14, r5)
            if (r5 == 0) goto L6c
            r13.u = r2
            com.revolut.feature.freelancer.impl.ui.cashback.flow.b r14 = new com.revolut.feature.freelancer.impl.ui.cashback.flow.b
            r14.<init>(r4, r3)
            java.lang.Object r14 = r4.p2(r13, r14)
            if (r14 != r0) goto L67
            goto L69
        L67:
            kotlin.Unit r14 = kotlin.Unit.f186387a
        L69:
            if (r14 != r0) goto L71
        L6b:
            return r0
        L6c:
            yki.i r0 = r4.f73748t
            oki.h.u2(r4, r0, r14, r3, r1)
        L71:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.cashback.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
