package com.revolut.feature.retail.reverywhere.impl.onboarding;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$InputData;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.navigable.TransitionAnimation;
import d8l.d;
import eub.i;
import hfb.b;
import hfb.c;
import hfb.l;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final web.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f82910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f82911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ReverywhereOnboardingFlowContract$InputData f82912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.i f82913s;

    public a(web.b interactor, i revPointsOptInInteractor, l optInSourceMapper, ReverywhereOnboardingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(optInSourceMapper, "optInSourceMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = interactor;
        this.f82910p = revPointsOptInInteractor;
        this.f82911q = optInSourceMapper;
        this.f82912r = inputData;
        this.f82913s = d.a(this, new hfb.d(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6.M2(true, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.retail.reverywhere.impl.onboarding.a r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof hfb.j
            if (r0 == 0) goto L13
            r0 = r7
            hfb.j r0 = (hfb.j) r0
            int r1 = r0.f151796w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151796w = r1
            goto L18
        L13:
            hfb.j r0 = new hfb.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f151796w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L5a
        L36:
            yhm.o.b(r7)
            web.b r7 = r6.o
            com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$InputData r2 = r6.f82912r
            com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName r2 = r2.getF82905c()
            web.a r5 = web.b.Companion
            w4l.h r5 = w4l.h.f294642c
            efb.g r7 = (efb.g) r7
            jhi.k r7 = r7.b(r2, r5)
            r2 = 3
            r5 = 0
            jhi.b r7 = mo3.a.g(r7, r5, r5, r2)
            r0.f151796w = r4
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L5a
            goto L6a
        L5a:
            xeb.a r7 = (xeb.a) r7
            java.lang.String r2 = r7.f304566a
            java.util.List r7 = r7.f304567b
            if (r2 != 0) goto L6e
            r0.f151796w = r3
            java.lang.Object r6 = r6.M2(r4, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6e:
            yki.i r0 = r6.f82913s
            com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$Step$ProductArticle r1 = new com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$Step$ProductArticle
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r3 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            r3.<init>(r2)
            r1.<init>(r3, r7)
            com.revolut.kompot.navigable.TransitionAnimation r7 = r6.K2()
            r2 = 4
            oki.h.u2(r6, r0, r1, r7, r2)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.reverywhere.impl.onboarding.a.I2(com.revolut.feature.retail.reverywhere.impl.onboarding.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.retail.reverywhere.impl.onboarding.a r9, gim.c r10) {
        /*
            web.b r0 = r9.o
            boolean r1 = r10 instanceof hfb.k
            if (r1 == 0) goto L15
            r1 = r10
            hfb.k r1 = (hfb.k) r1
            int r2 = r1.f151798x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f151798x = r2
            goto L1a
        L15:
            hfb.k r1 = new hfb.k
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f151798x
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            java.util.List r0 = r1.u
            java.util.List r0 = (java.util.List) r0
            yhm.o.b(r10)
            goto L71
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            yhm.o.b(r10)
            goto L5c
        L3c:
            yhm.o.b(r10)
            r1.f151798x = r5
            r10 = r0
            efb.g r10 = (efb.g) r10
            zjh.i r10 = r10.e
            web.a r3 = web.b.Companion
            r3.getClass()
            java.util.List r3 = web.a.f296708b
            e38.c r5 = new e38.c
            r6 = 0
            r7 = 10
            r5.<init>(r3, r10, r6, r7)
            java.lang.Object r10 = skm.e0.o(r5, r1)
            if (r10 != r2) goto L5c
            goto L6d
        L5c:
            java.util.List r10 = (java.util.List) r10
            r3 = r10
            java.util.List r3 = (java.util.List) r3
            r1.u = r3
            r1.f151798x = r4
            efb.g r0 = (efb.g) r0
            java.lang.Object r0 = r0.c(r1)
            if (r0 != r2) goto L6e
        L6d:
            return r2
        L6e:
            r8 = r0
            r0 = r10
            r10 = r8
        L71:
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference r10 = (com.revolut.feature.product_article.api.models.ProductArticleParams.ArticleReference) r10
            yki.i r1 = r9.f82913s
            com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$Step$ProductArticle r2 = new com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$Step$ProductArticle
            r2.<init>(r10, r0)
            com.revolut.kompot.navigable.TransitionAnimation r10 = r9.K2()
            r0 = 4
            oki.h.u2(r9, r1, r2, r10, r0)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.reverywhere.impl.onboarding.a.J2(com.revolut.feature.retail.reverywhere.impl.onboarding.a, gim.c):java.lang.Object");
    }

    public final TransitionAnimation K2() {
        TransitionAnimation transitionAnimation;
        ReverywhereOnboardingFlowContract$InputData reverywhereOnboardingFlowContract$InputData = this.f82912r;
        ReverywhereOnboardingFlowContract$InputData.AppConfiguration appConfiguration = reverywhereOnboardingFlowContract$InputData instanceof ReverywhereOnboardingFlowContract$InputData.AppConfiguration ? (ReverywhereOnboardingFlowContract$InputData.AppConfiguration) reverywhereOnboardingFlowContract$InputData : null;
        return (appConfiguration == null || (transitionAnimation = appConfiguration.f82902h) == null) ? TransitionAnimation.NONE.f98393a : transitionAnimation;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof hfb.f
            if (r0 == 0) goto L13
            r0 = r5
            hfb.f r0 = (hfb.f) r0
            int r1 = r0.f151791w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151791w = r1
            goto L18
        L13:
            hfb.f r0 = new hfb.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f151791w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            eub.i r5 = r4.f82910p
            efm.d0 r5 = eub.i.b(r5)
            r0.f151791w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            m1c.r0 r5 = (m1c.r0) r5
            m1c.x0 r5 = r5.f201447a
            m1c.x0 r0 = m1c.x0.OPTED_IN
            if (r5 != r0) goto L4a
            goto L4b
        L4a:
            r3 = 0
        L4b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.reverywhere.impl.onboarding.a.L2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new hfb.i(this, null, 0), new c(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(boolean r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof hfb.g
            if (r0 == 0) goto L13
            r0 = r6
            hfb.g r0 = (hfb.g) r0
            int r1 = r0.f151793x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151793x = r1
            goto L18
        L13:
            hfb.g r0 = new hfb.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f151793x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f151793x = r3
            java.lang.Object r6 = r4.L2(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 4
            yki.i r1 = r4.f82913s
            if (r6 == 0) goto L59
            if (r5 == 0) goto L51
            com.revolut.kompot.navigable.TransitionAnimation r5 = r4.K2()
            goto L53
        L51:
            com.revolut.kompot.navigable.TransitionAnimation$SLIDE_END_TO_START r5 = com.revolut.kompot.navigable.TransitionAnimation.SLIDE_END_TO_START.f98395a
        L53:
            com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$Step$Reverywhere r6 = com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$Step.Reverywhere.f82909a
            oki.h.u2(r4, r1, r6, r5, r0)
            goto L67
        L59:
            if (r5 == 0) goto L60
            com.revolut.kompot.navigable.TransitionAnimation r5 = r4.K2()
            goto L62
        L60:
            com.revolut.kompot.navigable.TransitionAnimation$SLIDE_END_TO_START r5 = com.revolut.kompot.navigable.TransitionAnimation.SLIDE_END_TO_START.f98395a
        L62:
            com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$Step$RevPointsOptIn r6 = com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$Step.RevPointsOptIn.f82908a
            oki.h.u2(r4, r1, r6, r5, r0)
        L67:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.reverywhere.impl.onboarding.a.M2(boolean, gim.c):java.lang.Object");
    }

    public final void N2() {
        yji.l.b1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, new hbg.h(this, null, 5), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f82913s;
    }
}
