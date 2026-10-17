package com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification;

import do3.u;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public u u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f103291w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f103291w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.f103291w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g r0 = r7.f103291w
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L23
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            do3.u r2 = r7.u
            yhm.o.b(r8)
            goto L66
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            yhm.o.b(r8)
            goto L36
        L23:
            yhm.o.b(r8)
            rik.e r8 = new rik.e
            r3 = 23
            r8.<init>(r0, r6, r3)
            r7.v = r5
            java.lang.Object r8 = r0.p2(r7, r8)
            if (r8 != r2) goto L36
            goto L63
        L36:
            pha.a r8 = (pha.a) r8
            do3.u r8 = r8.f236250a
            if (r8 == 0) goto Lbd
            r7.u = r8
            r7.v = r4
            do3.m r3 = r8.f116433b
            if (r3 == 0) goto L47
            do3.l r3 = r3.f116406a
            goto L48
        L47:
            r3 = r6
        L48:
            if (r3 != 0) goto L4b
            goto L4c
        L4b:
            r5 = 0
        L4c:
            boolean r3 = r1 instanceof com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData.StudentStatus
            if (r3 != 0) goto L5f
            if (r5 == 0) goto L5f
            zja.a r3 = r0.f103294r
            com.revolut.feature.product_article.api.models.ProductArticleParams r4 = r0.f103297w
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$AlwaysShow r5 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.AlwaysShow.f81285a
            kka.h r3 = (kka.h) r3
            java.lang.Object r3 = r3.e(r4, r5, r7)
            goto L61
        L5f:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L61:
            if (r3 != r2) goto L64
        L63:
            return r2
        L64:
            r2 = r8
            r8 = r3
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L83
            snk.u r8 = r0.v
            vkm.j2 r8 = r8.f264658a
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r8.getClass()
            r8.g(r6, r3)
            yki.i r8 = r0.f103298x
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$Step$IntroProductArticle r3 = com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$Step.IntroProductArticle.f103283a
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r4 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
            oki.h.w2(r8, r3, r4)
        L83:
            boolean r8 = r1 instanceof com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData.Default
            if (r8 == 0) goto L8b
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g.I2(r0, r2, r6)
            goto Lb4
        L8b:
            boolean r8 = r1 instanceof com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData.Verification
            if (r8 == 0) goto L97
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData$Verification r1 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData.Verification) r1
            java.lang.String r8 = r1.f103273a
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g.I2(r0, r2, r8)
            goto Lb4
        L97:
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData$StudentStatus r8 = com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData.StudentStatus.f103272a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r1, r8)
            if (r8 == 0) goto Lb7
            yki.i r8 = r0.f103298x
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$Step$StudentStatus r1 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$Step$StudentStatus
            java.time.Instant r3 = r2.f116434c
            do3.m r2 = r2.f116433b
            if (r2 == 0) goto Lac
            java.lang.String r2 = r2.f116407b
            goto Lad
        Lac:
            r2 = r6
        Lad:
            r1.<init>(r2, r3)
            r2 = 6
            oki.h.u2(r0, r8, r1, r6, r2)
        Lb4:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lb7:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        Lbd:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
