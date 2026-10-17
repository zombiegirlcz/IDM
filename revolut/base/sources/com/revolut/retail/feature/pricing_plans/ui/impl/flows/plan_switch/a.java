package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch;

import ajk.f;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.PlanSwitchToAnnualFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oik.b;
import oik.c;
import oki.h;
import wli.x;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zfk.c f103244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f103245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f103246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f103247s;

    public a(c inputData, zfk.c planSubscriberControllerModelExtension, f pricingPlanNavigationCommandsProvider, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f103244p = planSubscriberControllerModelExtension;
        this.f103245q = pricingPlanNavigationCommandsProvider;
        this.f103246r = deeplinkHandler;
        oa4.c cVar = new oa4.c(this, 19);
        this.f103247s = d.a(this, PlanSwitchToAnnualFlowContract$Step.SwitchToAnnual.f103243a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103247s;
    }
}
