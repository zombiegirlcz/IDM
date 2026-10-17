package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.flow;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.flow.PlanHubV2FlowContract$Step;
import hfb.d;
import hmk.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final PlanHubV2FlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f103553p;

    public a(PlanHubV2FlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        d dVar = new d(this, 10);
        this.f103553p = cp5.d.a(this, PlanHubV2FlowContract$Step.PlanHub.f103552a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103553p;
    }
}
