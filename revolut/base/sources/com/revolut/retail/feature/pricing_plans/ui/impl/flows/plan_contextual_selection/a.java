package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.PlanContextualSelectionFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import shk.b;
import shk.d;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final PlanContextualSelectionFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b f103151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f103152q;

    public a(PlanContextualSelectionFlowContract$InputData inputData, com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b actionHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.o = inputData;
        this.f103151p = actionHandler;
        this.f103152q = cp5.d.a(this, new PlanContextualSelectionFlowContract$Step.PlanSelection(inputData.f103140a, inputData.f103141b, inputData.f103142c, inputData.d), f0.f322471a, new scl.h(this, 10));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103152q;
    }
}
