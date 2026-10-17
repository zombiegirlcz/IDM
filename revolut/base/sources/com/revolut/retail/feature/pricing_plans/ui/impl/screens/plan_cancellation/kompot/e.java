package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot;

import ajk.f;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$Step;
import dlk.g;
import dlk.r;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends h implements dlk.b {
    public final qki.d A;
    public final j2 B;
    public final yki.a C;
    public final PlanCancelFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qlk.a f103499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f103500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final clk.c f103501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final elk.a f103502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f103503t;
    public final egk.d u;
    public final bgk.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final bmk.b f103504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wjk.e f103505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f103506y;
    public final gte.a z;

    public e(PlanCancelFlowContract$InputData inputData, qlk.a promptModelProvider, t pricingPlanInteractor, clk.c planCancellationFlowInteractor, elk.a planCancelActionControllerModelExtension, r navigatorProvider, egk.d planBenefitsInteractor, bgk.a planTermsWorkflowControllerExtension, bmk.b planDowngradeOfferControllerModelExtension, wjk.e cancelFreePlanControllerModelExtension, f pricingPlanNavigationCommandsProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(promptModelProvider, "promptModelProvider");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planCancellationFlowInteractor, "planCancellationFlowInteractor");
        Intrinsics.checkNotNullParameter(planCancelActionControllerModelExtension, "planCancelActionControllerModelExtension");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        Intrinsics.checkNotNullParameter(planBenefitsInteractor, "planBenefitsInteractor");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(planDowngradeOfferControllerModelExtension, "planDowngradeOfferControllerModelExtension");
        Intrinsics.checkNotNullParameter(cancelFreePlanControllerModelExtension, "cancelFreePlanControllerModelExtension");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f103499p = promptModelProvider;
        this.f103500q = pricingPlanInteractor;
        this.f103501r = planCancellationFlowInteractor;
        this.f103502s = planCancelActionControllerModelExtension;
        this.f103503t = navigatorProvider;
        this.u = planBenefitsInteractor;
        this.v = planTermsWorkflowControllerExtension;
        this.f103504w = planDowngradeOfferControllerModelExtension;
        this.f103505x = cancelFreePlanControllerModelExtension;
        this.f103506y = pricingPlanNavigationCommandsProvider;
        this.z = featureToggleInteractor;
        this.A = hx7.e.b(this, new PlanCancelFlowContract$DomainState(null, null));
        this.B = q.c(new dlk.c(null));
        dgj.h hVar = new dgj.h(this, 8);
        this.C = cp5.d.a(this, PlanCancelFlowContract$Step.Features.f103487a, f0.f322471a, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof dlk.l
            if (r0 == 0) goto L13
            r0 = r12
            dlk.l r0 = (dlk.l) r0
            int r1 = r0.f115792x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115792x = r1
            goto L18
        L13:
            dlk.l r0 = new dlk.l
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f115792x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e r11 = r0.u
            yhm.o.b(r12)
            goto L7b
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            yhm.o.b(r12)
            goto L4a
        L38:
            yhm.o.b(r12)
            ffk.t r12 = r11.f103500q
            ufm.f r12 = r12.j()
            r0.f115792x = r4
            java.lang.Object r12 = nim.a.b(r12, r0)
            if (r12 != r1) goto L4a
            goto L7a
        L4a:
            r5 = r12
            hha.d r5 = (hha.d) r5
            pi3.h r4 = new pi3.h
            kotlin.jvm.internal.Intrinsics.h(r5)
            qki.d r12 = r11.A
            java.lang.Object r12 = r12.f22677a
            vkm.j2 r12 = (vkm.j2) r12
            java.lang.Object r12 = r12.getValue()
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$DomainState r12 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$DomainState) r12
            iha.a r9 = r12.f103480a
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$InputData r12 = r11.o
            boolean r12 = r12.f103482a
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r12)
            r6 = 0
            r7 = 0
            r8 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            ajk.f r12 = r11.f103506y
            r0.u = r11
            r0.f115792x = r3
            java.lang.Object r12 = r12.c(r4, r0)
            if (r12 != r1) goto L7b
        L7a:
            return r1
        L7b:
            com.revolut.retail.core.navigation.NaviCommand r12 = (com.revolut.retail.core.navigation.NaviCommand) r12
            com.revolut.kompot.bridge.navigation.BridgeDestination r12 = zh9.u0.b(r12)
            r11.C1(r12)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e.I2(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e r4, dlk.e r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof dlk.m
            if (r0 == 0) goto L13
            r0 = r6
            dlk.m r0 = (dlk.m) r0
            int r1 = r0.f115794x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115794x = r1
            goto L18
        L13:
            dlk.m r0 = new dlk.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f115794x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dlk.e r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f115794x = r3
            java.lang.Object r6 = r4.M2(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            qha.a r6 = (qha.a) r6
            clk.c r0 = r4.f103501r
            r0.getClass()
            java.lang.String r0 = "info"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List r0 = r6.f246567c
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L64
            dj0.d r0 = r6.f246565a
            if (r0 != 0) goto L64
            boolean r0 = r6.f246568g
            if (r0 == 0) goto L5e
            goto L64
        L5e:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L64:
            com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig r6 = r6.f246570j
            if (r6 == 0) goto L81
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreen r0 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreen
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreenContract$InputData r1 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreenContract$InputData
            r1.<init>(r6)
            r0.<init>(r1)
            dcl.m0 r6 = new dcl.m0
            r1 = 24
            r6.<init>(r4, r5, r1)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r5 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r4.f2(r0, r5, r6)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L81:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "screenConfig is null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e.J2(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e, dlk.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof dlk.n
            if (r0 == 0) goto L13
            r0 = r9
            dlk.n r0 = (dlk.n) r0
            int r1 = r0.f115795w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115795w = r1
            goto L18
        L13:
            dlk.n r0 = new dlk.n
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f115795w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L3b
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            r0.f115795w = r3
            java.lang.Object r9 = r8.M2(r0)
            if (r9 != r1) goto L3b
            return r1
        L3b:
            qha.a r9 = (qha.a) r9
            java.util.List r9 = r9.k
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L4a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4c
        L4a:
            r1 = r8
            goto L5d
        L4c:
            yki.a r2 = r8.C
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$Step$Block r3 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$Step$Block
            r3.<init>(r9)
            r6 = 0
            r7 = 12
            r4 = 1
            r5 = 0
            r1 = r8
            oki.h.t2(r1, r2, r3, r4, r5, r6, r7)
            goto L62
        L5d:
            dlk.t r8 = dlk.t.DOWNGRADE_LEGIBILITY
            r1.L2(r8)
        L62:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e.K2(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        int i = 26;
        l2(new g(this, continuation, 0), new yi5.b(i));
        l2(new g(this, continuation, 1), new yi5.b(i));
        l.a1(this, this.f103502s.b3(), null, null, new d(this, null), 3);
    }

    public final void L2(dlk.t tVar) {
        l2(new d3i.g(this, tVar, null, 29), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof dlk.i
            if (r0 == 0) goto L13
            r0 = r7
            dlk.i r0 = (dlk.i) r0
            int r1 = r0.f115787w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115787w = r1
            goto L18
        L13:
            dlk.i r0 = new dlk.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f115787w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            qki.d r7 = r6.A
            java.lang.Object r7 = r7.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$DomainState r7 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$DomainState) r7
            iha.a r7 = r7.f103480a
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$InputData r2 = r6.o
            boolean r4 = r2.f103482a
            com.revolut.feature.pricingplans.models.PricingPlanUpdateSource r2 = r2.f103483b
            ffk.t r5 = r6.f103500q
            sfm.b r7 = r5.s(r7, r4, r2)
            dee.a0 r2 = new dee.a0
            r4 = 27
            r2.<init>(r4)
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r2, r3)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.f115787w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e.M2(gim.c):java.lang.Object");
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.A;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.C;
    }
}
