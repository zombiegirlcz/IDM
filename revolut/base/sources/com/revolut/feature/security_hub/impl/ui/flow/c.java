package com.revolut.feature.security_hub.impl.ui.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SecurityHubFlowContract$Step f85556w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, SecurityHubFlowContract$Step securityHubFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f85556w = securityHubFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f85556w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r3.a(r1, r11, r10) == r0) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            r2 = 2
            r3 = 1
            com.revolut.feature.security_hub.impl.ui.flow.m r4 = r10.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r11)
            goto L62
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            yhm.o.b(r11)
            goto L2c
        L1e:
            yhm.o.b(r11)
            w39.b r11 = r4.G
            r10.u = r3
            java.lang.Object r11 = oi0.d.o(r11, r10)
            if (r11 != r0) goto L2c
            goto L42
        L2c:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r11 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r11
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step r1 = r10.f85556w
            if (r11 == 0) goto L43
            wtc.g0 r3 = r4.f85575w
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$StreetModeSetupWithWifi r1 = (com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step.StreetModeSetupWithWifi) r1
            com.revolut.feature.security_hub.impl.interactor.ConnectedWifi r1 = r1.f85543a
            java.lang.String r1 = r1.f85467a
            r10.u = r2
            java.lang.Object r11 = r3.a(r1, r11, r10)
            if (r11 != r0) goto L62
        L42:
            return r0
        L43:
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$StreetModeSetupWithWifi r1 = (com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step.StreetModeSetupWithWifi) r1
            com.revolut.feature.security_hub.impl.interactor.ConnectedWifi r11 = r1.f85543a
            java.lang.String r11 = r11.f85467a
            buc.h r0 = r4.J
            r0.getClass()
            nii.y0 r0 = buc.h.a()
            kotlinx.coroutines.flow.Flow r5 = r4.X1(r0)
            com.revolut.feature.security_hub.impl.ui.flow.l r8 = new com.revolut.feature.security_hub.impl.ui.flow.l
            r0 = 0
            r8.<init>(r4, r11, r0)
            r9 = 3
            r6 = 0
            r7 = 0
            yji.l.a1(r4, r5, r6, r7, r8, r9)
        L62:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.flow.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
