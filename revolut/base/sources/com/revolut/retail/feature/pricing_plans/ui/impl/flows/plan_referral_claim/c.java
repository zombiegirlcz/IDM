package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim;

import cik.d;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.PlanReferralsClaimFlowContract$Step;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rgk.p;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements cik.b {

    @NotNull
    private static final d Companion = new d();
    public final PlanReferralsClaimFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f103216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b f103217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zfk.c f103218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a f103219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f103220t;
    public final yki.a u;

    public c(PlanReferralsClaimFlowContract$InputData inputData, t planInteractor, com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b actionHandler, zfk.c planSubscriberControllerModelExtension, com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a actionControllerFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planInteractor, "planInteractor");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(actionControllerFactory, "actionControllerFactory");
        this.o = inputData;
        this.f103216p = planInteractor;
        this.f103217q = actionHandler;
        this.f103218r = planSubscriberControllerModelExtension;
        this.f103219s = actionControllerFactory;
        this.f103220t = new p(false, new PricingPlanAnalyticsSource.Predefined(xfa.b.PLAN_OFFER_PROMPT), rgk.b.PhysicalCardOrder, rgk.a.CloseAfterResult);
        cik.c cVar = new cik.c(this, 0);
        this.u = cp5.d.a(this, PlanReferralsClaimFlowContract$Step.Prompt.f103214a, f0.f322471a, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c r11, com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction.ClaimPlanReferral r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof cik.e
            if (r0 == 0) goto L13
            r0 = r13
            cik.e r0 = (cik.e) r0
            int r1 = r0.f24560w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24560w = r1
            goto L18
        L13:
            cik.e r0 = new cik.e
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f24560w
            r9 = 1
            if (r2 == 0) goto L2f
            if (r2 != r9) goto L27
            yhm.o.b(r13)
            goto L71
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            ffk.t r11 = r11.f103216p
            java.lang.String r4 = r12.f102796b
            hha.i r5 = r12.f102797c
            java.lang.String r10 = r12.d
            r11.getClass()
            java.lang.String r12 = "planId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r12)
            java.lang.String r12 = "billingCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r12)
            dha.c r11 = r11.f134850a
            r8 = 0
            r3 = r11
            pfk.p0 r3 = (pfk.p0) r3
            r6 = 0
            r7 = 0
            efm.r r11 = r3.c(r4, r5, r6, r7, r8, r9, r10)
            ccg.a r12 = new ccg.a
            r13 = 20
            r12.<init>(r13)
            r13 = 0
            efm.r r11 = m70.a.g(r11, r13, r12, r9)
            efm.d0 r11 = r11.firstOrError()
            java.lang.String r12 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            r0.f24560w = r9
            java.lang.Object r13 = nim.a.b(r11, r0)
            if (r13 != r1) goto L71
            return r1
        L71:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c.I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c, com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction$ClaimPlanReferral, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
