package com.revolut.feature.security_hub.impl.ui.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function1 {
    public SecurityHubFlowContract$Step u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f85567w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f85568x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f85567w = mVar;
        this.f85568x = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.f85567w, this.f85568x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r14 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.v
            r2 = 3
            r3 = 2
            r4 = 1
            com.revolut.feature.security_hub.impl.ui.flow.m r5 = r13.f85567w
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step r0 = r13.u
            yhm.o.b(r14)
            r8 = r0
            goto L91
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step r1 = r13.u
            yhm.o.b(r14)
            goto L6e
        L27:
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step r1 = r13.u
            yhm.o.b(r14)
            goto L59
        L2d:
            yhm.o.b(r14)
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$StreetMode r14 = new com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$StreetMode
            com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$Step$SetTrustedLocation r1 = com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$Step.SetTrustedLocation.f85661a
            r14.<init>(r1)
            gte.a r1 = r5.F
            com.revolut.feature.security_hub.api.SecurityHubApi$Toggles$StreetModeWifi r6 = com.revolut.feature.security_hub.api.SecurityHubApi$Toggles.StreetModeWifi.f85371c
            jte.d r1 = (jte.d) r1
            boolean r1 = r1.c(r6)
            if (r1 == 0) goto L7c
            w39.b r1 = r5.G
            z39.b r1 = (z39.b) r1
            ufm.c r1 = r1.b()
            r13.u = r14
            r13.v = r4
            java.lang.Object r1 = nim.a.b(r1, r13)
            if (r1 != r0) goto L56
            goto L8f
        L56:
            r12 = r1
            r1 = r14
            r14 = r12
        L59:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L7d
            tb4.t r14 = r5.H
            r13.u = r1
            r13.v = r3
            java.lang.Object r14 = r14.d(r13)
            if (r14 != r0) goto L6e
            goto L8f
        L6e:
            com.revolut.feature.security_hub.impl.interactor.ConnectedWifi r14 = (com.revolut.feature.security_hub.impl.interactor.ConnectedWifi) r14
            if (r14 == 0) goto L7d
            boolean r3 = r14.f85468b
            if (r3 != 0) goto L7d
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$StreetModeSetupWithWifi r1 = new com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$StreetModeSetupWithWifi
            r1.<init>(r14)
            goto L7d
        L7c:
            r1 = r14
        L7d:
            boolean r14 = r13.f85568x
            if (r14 == 0) goto L83
            r7 = r1
            goto L9e
        L83:
            r10.t r14 = r5.E
            r13.u = r1
            r13.v = r2
            java.lang.Object r14 = r14.g(r13)
            if (r14 != r0) goto L90
        L8f:
            return r0
        L90:
            r8 = r1
        L91:
            r7 = r14
            com.revolut.feature.product_article.api.models.ProductArticleParams r7 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r7
            boolean r10 = r8 instanceof com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step.StreetModeSetupWithWifi
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$ProductArticle r6 = new com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$ProductArticle
            r9 = 0
            r11 = 4
            r6.<init>(r7, r8, r9, r10, r11)
            r7 = r6
        L9e:
            boolean r14 = r7 instanceof com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step.StreetModeSetupWithWifi
            if (r14 == 0) goto Laa
            yki.a r14 = r5.N
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r0 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r14, r7, r0)
            goto Lb4
        Laa:
            yki.a r6 = r5.N
            r10 = 0
            r11 = 12
            r8 = 1
            r9 = 0
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
        Lb4:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.flow.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
