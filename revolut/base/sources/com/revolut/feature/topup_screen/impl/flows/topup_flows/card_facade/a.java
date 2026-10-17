package com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade;

import gim.i;
import jze.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import t61.g;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public g u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f90993w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f90993w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f90993w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.v
            r2 = 6
            jze.b r3 = r9.f90993w
            r4 = 0
            com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade.FacadeCardTopupFlowContract$Step$DeferredCvv r5 = com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade.FacadeCardTopupFlowContract$Step.DeferredCvv.f90991a
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L24
            if (r1 == r7) goto L20
            if (r1 != r6) goto L18
            t61.g r0 = r9.u
            yhm.o.b(r10)
            goto L72
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            yhm.o.b(r10)
            goto L57
        L24:
            yhm.o.b(r10)
            com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData r10 = r3.o
            com.revolut.feature.topup_screen.api.descriptor.CardTopUpType r1 = r10.f90493a
            boolean r1 = r1 instanceof com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.PennyTopUp
            if (r1 == 0) goto L37
            yki.i r10 = r3.f179800r
            oki.h.u2(r3, r10, r5, r4, r2)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L37:
            y51.a r1 = r3.f179799q
            java.lang.String r10 = r10.f90494b
            w4l.h r8 = w4l.h.f294642c
            e0f.z r1 = (e0f.z) r1
            efm.r r10 = r1.c(r10, r8)
            jul.c r1 = new jul.c
            r8 = 22
            r1.<init>(r8)
            efm.r r10 = m70.a.g(r10, r4, r1, r7)
            r9.v = r7
            java.lang.Object r10 = nim.a.c(r10, r9)
            if (r10 != r0) goto L57
            goto L6f
        L57:
            t61.g r10 = (t61.g) r10
            xoj.a r1 = r3.f179798p
            yoj.c r7 = yoj.c.DEFERRED_CVV
            yoj.d r8 = yoj.d.DISABLED
            cpj.b r1 = (cpj.b) r1
            ufm.i r1 = r1.f(r7, r8)
            r9.u = r10
            r9.v = r6
            java.lang.Object r1 = nim.a.b(r1, r9)
            if (r1 != r0) goto L70
        L6f:
            return r0
        L70:
            r0 = r10
            r10 = r1
        L72:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r0 = r0.f268145n
            if (r0 == 0) goto L87
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7f
            goto L87
        L7f:
            yki.i r10 = r3.f179800r
            com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade.FacadeCardTopupFlowContract$Step$ForcedCvv r0 = com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade.FacadeCardTopupFlowContract$Step.ForcedCvv.f90992a
            oki.h.u2(r3, r10, r0, r4, r2)
            goto L8c
        L87:
            yki.i r10 = r3.f179800r
            oki.h.u2(r3, r10, r5, r4, r2)
        L8c:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
