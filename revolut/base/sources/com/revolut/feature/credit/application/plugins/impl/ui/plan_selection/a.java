package com.revolut.feature.credit.application.plugins.impl.ui.plan_selection;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.CreditPlanSelectionFlowContract$Step;
import cp5.d;
import dha.c;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import ng4.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditPlanSelectionFlowContract$InputData f68209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xx3.a f68210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f68211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sg4.a f68212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f68213t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CreditPlanSelectionFlowContract$InputData inputData, xx3.a planSelectionInteractor, c pricingPlansRepository, sg4.a creditPricingPlanAnalyticsMetadataFactory, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planSelectionInteractor, "planSelectionInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansRepository, "pricingPlansRepository");
        Intrinsics.checkNotNullParameter(creditPricingPlanAnalyticsMetadataFactory, "creditPricingPlanAnalyticsMetadataFactory");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68209p = inputData;
        this.f68210q = planSelectionInteractor;
        this.f68211r = pricingPlansRepository;
        this.f68212s = creditPricingPlanAnalyticsMetadataFactory;
        n8i.e eVar = new n8i.e(this, 22);
        this.f68213t = d.a(this, CreditPlanSelectionFlowContract$Step.PlansDashboard.f68208a, f0.f322471a, eVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68213t;
    }
}
