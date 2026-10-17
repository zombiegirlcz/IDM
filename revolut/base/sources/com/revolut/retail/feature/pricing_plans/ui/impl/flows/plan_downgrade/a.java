package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade;

import egk.d;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import u7k.w;
import uhk.b;
import uhk.g;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final PlanDowngradeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f103162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f103163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bmk.b f103164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f103165s;

    public a(PlanDowngradeFlowContract$InputData inputData, d planBenefitsInteractor, t planInteractor, bmk.b planDowngradeOfferControllerModelExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planBenefitsInteractor, "planBenefitsInteractor");
        Intrinsics.checkNotNullParameter(planInteractor, "planInteractor");
        Intrinsics.checkNotNullParameter(planDowngradeOfferControllerModelExtension, "planDowngradeOfferControllerModelExtension");
        this.o = inputData;
        this.f103162p = planBenefitsInteractor;
        this.f103163q = planInteractor;
        this.f103164r = planDowngradeOfferControllerModelExtension;
        this.f103165s = d8l.d.a(this, new w(this, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof uhk.i
            if (r0 == 0) goto L13
            r0 = r8
            uhk.i r0 = (uhk.i) r0
            int r1 = r0.f280267w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280267w = r1
            goto L18
        L13:
            uhk.i r0 = new uhk.i
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280267w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L5f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            ffk.t r8 = r7.f103163q
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$InputData r2 = r7.o
            java.lang.String r4 = r2.f103153a
            hha.i r2 = r2.f103154b
            r5 = 0
            r6 = 12
            efm.r r8 = ffk.t.u(r8, r4, r2, r5, r6)
            ud3.f0 r2 = new ud3.f0
            r4 = 18
            r2.<init>(r4)
            r4 = 0
            efm.r r8 = m70.a.g(r8, r4, r2, r3)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.f280267w = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            qha.a r8 = (qha.a) r8
            com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig r8 = r8.f246570j
            if (r8 == 0) goto L74
            yki.i r7 = r7.f103165s
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$Step$FeesAndRefunds r0 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$Step$FeesAndRefunds
            r0.<init>(r8)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r8 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r7, r0, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L74:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a.I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new g(this, null, 0), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103165s;
    }
}
