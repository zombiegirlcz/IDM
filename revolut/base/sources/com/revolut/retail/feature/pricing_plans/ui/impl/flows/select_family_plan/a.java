package com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.SelectFamilyPlanFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import phk.k;
import q5g.f0;
import qik.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final SelectFamilyPlanFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f103258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f103259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f103260r;

    public a(SelectFamilyPlanFlowContract$InputData inputData, k planBillingPickerControllerModelExtension, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planBillingPickerControllerModelExtension, "planBillingPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f103258p = planBillingPickerControllerModelExtension;
        this.f103259q = featureToggleInteractor;
        f0 f0Var = new f0(this, 25);
        this.f103260r = d.a(this, SelectFamilyPlanFlowContract$Step.SelectPlan.f103257a, zhm.f0.f322471a, f0Var);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103260r;
    }
}
