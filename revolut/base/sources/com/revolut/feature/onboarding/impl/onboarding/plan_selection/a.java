package com.revolut.feature.onboarding.impl.onboarding.plan_selection;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_order_new.api.GetCardFeatureConfig;
import com.revolut.feature.onboarding.impl.onboarding.plan_selection.OnboardingPlanSelectionFlowContract$Step;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import d8l.d;
import ffk.t;
import grl.k9;
import hha.s;
import hha.u;
import hy2.j;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oa4.c;
import ob9.b;
import oki.h;
import q89.e;
import wik.m;
import yki.i;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f78475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f78476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tfk.a f78477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f78478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f78479t;
    public final ma3.a u;
    public final i v;

    public a(e onboardingInteractor, t pricingPlanInteractor, j cardDesignPrefetch3dAssetsInteractor, tfk.a planPrepareTermsSender, gte.a featureToggleInteractor, m pricingPlanOffersInteractor, ma3.a orderNewCardNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cardDesignPrefetch3dAssetsInteractor, "cardDesignPrefetch3dAssetsInteractor");
        Intrinsics.checkNotNullParameter(planPrepareTermsSender, "planPrepareTermsSender");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(orderNewCardNavigationCommandFactory, "orderNewCardNavigationCommandFactory");
        this.o = onboardingInteractor;
        this.f78475p = pricingPlanInteractor;
        this.f78476q = cardDesignPrefetch3dAssetsInteractor;
        this.f78477r = planPrepareTermsSender;
        this.f78478s = featureToggleInteractor;
        this.f78479t = pricingPlanOffersInteractor;
        this.u = orderNewCardNavigationCommandFactory;
        this.v = d.a(this, new c(this, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.onboarding.impl.onboarding.plan_selection.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof ob9.e
            if (r0 == 0) goto L13
            r0 = r6
            ob9.e r0 = (ob9.e) r0
            int r1 = r0.f223898w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223898w = r1
            goto L18
        L13:
            ob9.e r0 = new ob9.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223898w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L47
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            ffk.t r5 = r5.f78475p
            efm.r r5 = r5.n()
            r6 = 3
            efm.r r5 = m70.a.g(r5, r4, r4, r6)
            r0.f223898w = r3
            java.lang.Object r6 = nim.a.e(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L65
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r5 = r6.iterator()
        L51:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L63
            java.lang.Object r6 = r5.next()
            r0 = r6
            hha.d r0 = (hha.d) r0
            boolean r0 = r0.f152296p
            if (r0 == 0) goto L51
            r4 = r6
        L63:
            hha.d r4 = (hha.d) r4
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.plan_selection.a.I2(com.revolut.feature.onboarding.impl.onboarding.plan_selection.a, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.onboarding.impl.onboarding.plan_selection.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof ob9.f
            if (r0 == 0) goto L13
            r0 = r6
            ob9.f r0 = (ob9.f) r0
            int r1 = r0.f223899w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223899w = r1
            goto L18
        L13:
            ob9.f r0 = new ob9.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223899w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L83
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f223899w = r3
            wik.m r5 = r5.f78479t
            r5.getClass()
            w4l.h r6 = w4l.h.f294642c
            java.lang.String r2 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            kjk.f r5 = r5.f297924b
            kjk.o r5 = (kjk.o) r5
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            kotlin.Lazy r5 = r5.e
            java.lang.Object r5 = r5.getValue()
            x4l.c r5 = (x4l.c) r5
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r5 = r5.b(r2, r6)
            o95.b r6 = new o95.b
            r2 = 26
            r6.<init>(r2)
            cxe.u r5 = nim.a.A(r5, r6)
            ob2.a r6 = new ob2.a
            r2 = 1
            r6.<init>(r2)
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r6, r3)
            n28.b r6 = new n28.b
            r3 = 3
            r4 = 15
            r6.<init>(r3, r4, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r5 = rd0.e.e(r5, r2, r6)
            java.lang.Object r6 = vkm.q.z(r5, r0)
            if (r6 != r1) goto L83
            return r1
        L83:
            ggk.d r6 = (ggk.d) r6
            boolean r5 = r6 instanceof ggk.b
            if (r5 == 0) goto L8c
            com.revolut.feature.onboarding.impl.onboarding.plan_selection.OnboardingPlanSelectionFlowContract$Step$PlanOffer r5 = com.revolut.feature.onboarding.impl.onboarding.plan_selection.OnboardingPlanSelectionFlowContract$Step.PlanOffer.f78472a
            return r5
        L8c:
            boolean r5 = r6 instanceof ggk.c
            if (r5 != 0) goto L99
            if (r6 != 0) goto L93
            goto L99
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L99:
            com.revolut.feature.onboarding.impl.onboarding.plan_selection.OnboardingPlanSelectionFlowContract$Step$SelectPlan r5 = new com.revolut.feature.onboarding.impl.onboarding.plan_selection.OnboardingPlanSelectionFlowContract$Step$SelectPlan
            xfa.b r6 = xfa.b.ONBOARDING_KYC
            r0 = 0
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.plan_selection.a.J2(com.revolut.feature.onboarding.impl.onboarding.plan_selection.a, gim.c):java.lang.Object");
    }

    public static final Object K2(a aVar, hha.d dVar, hha.i iVar, PricingPlanOffer pricingPlanOffer, boolean z, gim.i iVar2) {
        pi3.h hVar = new pi3.h(dVar, iVar, pricingPlanOffer, z, 48);
        Lazy lazy = s.f152339a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        u.Companion.getClass();
        if (s.h(dVar, u.f152351j) || s.h(dVar, u.f152358p)) {
            return aVar.L2(hVar, iVar2);
        }
        zn3.a aVar2 = zn3.a.ONBOARDING;
        boolean z3 = ((db9.d) aVar.o).c() || dVar.f152296p;
        k9 k9Var = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return u0.b(new FeatureCommand(new GetCardFeatureConfig(aVar2, hVar, z3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 9)));
    }

    @Override // yji.l
    public final void I1() {
        l2(new ob9.h(this, null, 1), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(pi3.h r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ob9.d
            if (r0 == 0) goto L14
            r0 = r10
            ob9.d r0 = (ob9.d) r0
            int r1 = r0.f223897w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f223897w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ob9.d r0 = new ob9.d
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f223897w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r10)
            goto L50
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            r10 = r2
            xfa.b r2 = xfa.b.ONBOARDING_CARD_SELECTION
            grl.k9 r1 = grl.k9.Onboarding
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r3 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r3 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r5 = com.google.android.gms.internal.mlkit_vision_face.a.h(r1, r3, r1)
            r6.f223897w = r10
            ma3.a r1 = r8.u
            r3 = 0
            r7 = 94
            r4 = r9
            java.lang.Object r10 = ma3.a.a(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L50
            return r0
        L50:
            com.revolut.retail.core.navigation.NaviCommand r10 = (com.revolut.retail.core.navigation.NaviCommand) r10
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = zh9.u0.b(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.plan_selection.a.L2(pi3.h, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        Continuation continuation = null;
        if (((jte.d) this.f78478s).c(PricingPlansUiApi$Toggles.OnboardingFreeTrialBeforePlanSelectionScreen.f102633c)) {
            l2(new ob9.h(this, continuation, 0), new yi5.b(26));
        } else {
            h.u2(this, this.v, new OnboardingPlanSelectionFlowContract$Step.SelectPlan(xfa.b.ONBOARDING_KYC, false), null, 6);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
