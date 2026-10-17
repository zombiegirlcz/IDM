package com.revolut.feature.freelancer.impl.ui.profile.website.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r11 == r0) goto L30;
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
            r2 = 6
            com.revolut.feature.freelancer.impl.ui.profile.website.flow.d r3 = r10.v
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L21
            if (r1 == r6) goto L1d
            if (r1 != r4) goto L15
            yhm.o.b(r11)
            goto La7
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            yhm.o.b(r11)
            goto L42
        L21:
            yhm.o.b(r11)
            et6.h1 r11 = r3.o
            efm.r r11 = r11.c()
            vkm.d r11 = rd0.e.b(r11)
            ewh.y r1 = new ewh.y
            r7 = 17
            r1.<init>(r7)
            jhi.b r11 = mo3.a.g(r11, r5, r1, r6)
            r10.u = r6
            java.lang.Object r11 = vkm.q.z(r11, r10)
            if (r11 != r0) goto L42
            goto La6
        L42:
            com.revolut.feature.freelancer.common.models.FreelancerProfileSettings r11 = (com.revolut.feature.freelancer.common.models.FreelancerProfileSettings) r11
            if (r11 == 0) goto L49
            java.lang.String r11 = r11.f73327g
            goto L4a
        L49:
            r11 = r5
        L4a:
            if (r11 == 0) goto L54
            yki.i r11 = r3.f74088t
            com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$Step$ReviewPrompt r0 = com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$Step.ReviewPrompt.f74082a
            oki.h.u2(r3, r11, r0, r5, r2)
            goto Lbb
        L54:
            gte.a r11 = r3.f74086r
            com.revolut.feature.freelancer.api.FreelancerApi$Toggles$ProUrlWorkflowsApi r1 = com.revolut.feature.freelancer.api.FreelancerApi$Toggles.ProUrlWorkflowsApi.f73171c
            jte.d r11 = (jte.d) r11
            boolean r11 = r11.c(r1)
            if (r11 == 0) goto Lb4
            jvh.a r11 = r3.f74085q
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r7 = "flow"
            java.lang.String r8 = "MERCHANT_CHANGE_REQUEST"
            r1.<init>(r7, r8)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r8 = "product"
            java.lang.String r9 = "URL"
            r7.<init>(r8, r9)
            com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$InputData r8 = r3.f74087s
            gs6.a r8 = r8.f74079b
            int[] r9 = f17.e.f131177a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r6) goto L8d
            if (r8 != r4) goto L87
            java.lang.String r6 = "ECOMMERCE_URL"
            goto L8f
        L87:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L8d:
            java.lang.String r6 = "REGULAR_URL"
        L8f:
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r9 = "flowType"
            r8.<init>(r9, r6)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1, r7, r8}
            java.util.Map r1 = zhm.r0.k(r1)
            r10.u = r4
            java.lang.Object r11 = r11.b(r1, r10)
            if (r11 != r0) goto La7
        La6:
            return r0
        La7:
            java.lang.String r11 = (java.lang.String) r11
            yki.i r0 = r3.f74088t
            com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$Step$ChangeRequest r1 = new com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$Step$ChangeRequest
            r1.<init>(r11)
            oki.h.u2(r3, r0, r1, r5, r2)
            goto Lbb
        Lb4:
            yki.i r11 = r3.f74088t
            com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$Step$EditWebsite r0 = com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$Step.EditWebsite.f74081a
            oki.h.u2(r3, r11, r0, r5, r2)
        Lbb:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.profile.website.flow.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
