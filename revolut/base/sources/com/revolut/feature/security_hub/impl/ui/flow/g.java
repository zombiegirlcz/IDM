package com.revolut.feature.security_hub.impl.ui.flow;

import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f85561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SecurityHubFlowContract$Step.Initial.Destination.WealthProtection f85562x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, CoroutineScope coroutineScope, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection wealthProtection, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
        this.f85561w = coroutineScope;
        this.f85562x = wealthProtection;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f85561w, this.f85562x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r7 == r0) goto L20;
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
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$Initial$Destination$WealthProtection r4 = r6.f85562x
            com.revolut.feature.security_hub.impl.ui.flow.m r5 = r6.v
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L14
            goto L45
        L14:
            r7 = move-exception
            goto L4a
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            yhm.o.b(r7)
            goto L30
        L22:
            yhm.o.b(r7)
            wtc.g0 r7 = r5.f85575w
            r6.u = r3
            java.lang.Object r7 = r7.c(r6)
            if (r7 != r0) goto L30
            goto L44
        L30:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L70
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L14
            ufm.d r7 = r5.v     // Catch: java.lang.Throwable -> L14
            r6.u = r2     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = r7.e(r6)     // Catch: java.lang.Throwable -> L14
            if (r7 != r0) goto L45
        L44:
            return r0
        L45:
            com.revolut.feature.security_hub.api.models.SecurityDelayInfo r7 = (com.revolut.feature.security_hub.api.models.SecurityDelayInfo) r7     // Catch: java.lang.Throwable -> L14
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L14
            goto L50
        L4a:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L50:
            boolean r0 = r7 instanceof yhm.n
            if (r0 == 0) goto L55
            r7 = 0
        L55:
            com.revolut.feature.security_hub.api.models.SecurityDelayInfo r7 = (com.revolut.feature.security_hub.api.models.SecurityDelayInfo) r7
            if (r7 == 0) goto L6c
            yki.a r7 = r5.N
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$WealthProtectionSecurityDelay r0 = new com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$WealthProtectionSecurityDelay
            com.revolut.kompot.navigable.flow.FlowStep r1 = r7.d()
            boolean r1 = r1 instanceof com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step.Initial
            r0.<init>(r4, r1)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r7, r0, r1)
            goto L73
        L6c:
            r5.K2(r4)
            goto L73
        L70:
            r5.K2(r4)
        L73:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.flow.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
