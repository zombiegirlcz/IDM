package com.revolut.feature.selfserve.sot.impl.ui.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r12 == r3) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            com.revolut.feature.selfserve.sot.impl.ui.flow.e r0 = r11.v
            qki.d r1 = r0.v
            k7i.i r2 = r0.f85942q
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r11.u
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L22
            if (r4 == r6) goto L1e
            if (r4 != r5) goto L16
            yhm.o.b(r12)
            goto L7c
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            yhm.o.b(r12)
            goto L2e
        L22:
            yhm.o.b(r12)
            r11.u = r6
            java.lang.Object r12 = r2.t(r11)
            if (r12 != r3) goto L2e
            goto L7b
        L2e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L73
            java.lang.Object r12 = r1.f22677a
            vkm.j2 r12 = (vkm.j2) r12
            java.lang.Object r12 = r12.getValue()
            com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState r12 = (com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState) r12
            boolean r12 = r12.f85911a
            if (r12 == 0) goto L48
            com.revolut.feature.selfserve.sot.impl.ui.stories.SotRemoteStoriesKey r12 = com.revolut.feature.selfserve.sot.impl.ui.stories.SotRemoteStoriesKey.SOT_HARD_LOCK
        L46:
            r2 = r12
            goto L4b
        L48:
            com.revolut.feature.selfserve.sot.impl.ui.stories.SotRemoteStoriesKey r12 = com.revolut.feature.selfserve.sot.impl.ui.stories.SotRemoteStoriesKey.SOT_NON_LOCK
            goto L46
        L4b:
            com.revolut.kompot.bridge.navigation.BridgeDestination r12 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r10 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.retail.core.navigation.FinishCommand r6 = new com.revolut.retail.core.navigation.FinishCommand
            r1 = 0
            r3 = 7
            r6.<init>(r1, r1, r1, r3)
            com.revolut.retail.core.navigation.FinishCommand r4 = new com.revolut.retail.core.navigation.FinishCommand
            r4.<init>(r1, r1, r1, r3)
            sza.a r5 = sza.a.ON_FIRST_PAGE_SHOWN
            com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig$Key r1 = new com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig$Key
            r8 = 10001(0x2711, float:1.4014E-41)
            r9 = 7626(0x1dca, float:1.0686E-41)
            r3 = 0
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.<init>(r1)
            r12.<init>(r10)
            aii.n r12 = r0.C1(r12)
            return r12
        L73:
            r11.u = r5
            java.lang.Object r12 = r2.n(r11)
            if (r12 != r3) goto L7c
        L7b:
            return r3
        L7c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            v2e.x r2 = new v2e.x
            r3 = 28
            r2.<init>(r12, r3)
            r0.H2(r1, r2)
            if (r12 == 0) goto L92
            com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step$Home r12 = com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step.Home.f85929a
        L90:
            r2 = r12
            goto L95
        L92:
            com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step$Status r12 = com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step.Status.f85932a
            goto L90
        L95:
            yki.a r1 = r0.f85946w
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.selfserve.sot.impl.ui.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
