package com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f91000w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f91000w = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f91000w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r7 == r0) goto L15;
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
            com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.c r2 = r6.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            yhm.o.b(r7)
            goto L43
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            yhm.o.b(r7)
            goto L33
        L1f:
            yhm.o.b(r7)
            y51.a r7 = r2.f91001p
            com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.IdealTopUpFlowContract$InputData r1 = r2.o
            dj0.d r1 = r1.f90997a
            r6.u = r4
            e0f.z r7 = (e0f.z) r7
            java.lang.Object r7 = r7.g(r1, r6)
            if (r7 != r0) goto L33
            goto L42
        L33:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            r1 = 3
            jhi.b r7 = mo3.a.g(r7, r5, r5, r1)
            r6.u = r3
            java.lang.Object r7 = vkm.q.z(r7, r6)
            if (r7 != r0) goto L43
        L42:
            return r0
        L43:
            cue.d r7 = (cue.d) r7
            if (r7 == 0) goto L55
            yki.i r0 = r2.f91002q
            com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.IdealTopUpFlowContract$Step$ThreeDs r1 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.IdealTopUpFlowContract$Step$ThreeDs
            r1.<init>(r7)
            r7 = 6
            oki.h.u2(r2, r0, r1, r5, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "No payment info retrieved for iDeal top-up"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
