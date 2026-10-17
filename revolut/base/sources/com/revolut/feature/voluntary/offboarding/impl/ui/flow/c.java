package com.revolut.feature.voluntary.offboarding.impl.ui.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (com.revolut.feature.voluntary.offboarding.impl.ui.flow.e.P2(r7, r8) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r9 == r0) goto L25;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 0
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e r7 = r8.v
            if (r1 == 0) goto L27
            if (r1 == r6) goto L23
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            yhm.o.b(r9)
            goto L82
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            yhm.o.b(r9)
            goto L5f
        L23:
            yhm.o.b(r9)
            goto L51
        L27:
            yhm.o.b(r9)
            com.revolut.kompot.navigable.flow.FlowStateWrapper r9 = r7.A2()
            com.revolut.kompot.navigable.flow.FlowStep r9 = r9.f98430b
            com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step$Loading r1 = com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step.Loading.f94833a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r1)
            if (r9 == 0) goto L65
            csg.a r9 = r7.B
            r9.getClass()
            asg.a r9 = new asg.a
            r9.<init>()
            go.g r1 = new go.g
            r4 = 2
            r1.<init>(r9, r4)
            r8.u = r6
            java.lang.Object r9 = vkm.q.x(r1, r8)
            if (r9 != r0) goto L51
            goto L81
        L51:
            asg.a r9 = (asg.a) r9
            r9.getClass()
            r8.u = r5
            java.lang.Object r9 = com.revolut.feature.voluntary.offboarding.impl.ui.flow.e.P2(r7, r8)
            if (r9 != r0) goto L5f
            goto L81
        L5f:
            com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step$HeyWaitPromptStep r9 = com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step.HeyWaitPromptStep.f94832a
            r7.E2(r9, r2, r3, r2)
            goto L8f
        L65:
            com.revolut.kompot.navigable.flow.FlowStateWrapper r9 = r7.A2()
            com.revolut.kompot.navigable.flow.FlowStep r9 = r9.f98430b
            com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step$RemoveObstaclesStep r1 = com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step.RemoveObstaclesStep.f94836a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r1)
            if (r9 == 0) goto L8f
            jsg.f r9 = new jsg.f
            r1 = 1
            r9.<init>(r7, r3, r1)
            r8.u = r4
            java.lang.Object r9 = r7.p2(r8, r9)
            if (r9 != r0) goto L82
        L81:
            return r0
        L82:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8f
            com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step$ProtectDataStep r9 = com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a
            r7.E2(r9, r2, r3, r2)
        L8f:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.voluntary.offboarding.impl.ui.flow.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
