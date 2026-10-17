package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.PlanDurableTermsFlowContract$Step;
import cp5.d;
import ehk.j;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import x0f.g;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements xhk.b {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PlanDurableTermsFlowContract$InputData f103172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f103173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f103174r;

    public c(t pricingPlanInteractor, PlanDurableTermsFlowContract$InputData inputData, j planDurableTermsPendingStateResolver) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planDurableTermsPendingStateResolver, "planDurableTermsPendingStateResolver");
        this.o = pricingPlanInteractor;
        this.f103172p = inputData;
        this.f103173q = planDurableTermsPendingStateResolver;
        x2g.b bVar = new x2g.b(this, 27);
        this.f103174r = d.a(this, PlanDurableTermsFlowContract$Step.PlanTerms.f103168a, f0.f322471a, bVar);
    }

    public final void I2() {
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new g(this, null, 17), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103174r;
    }
}
