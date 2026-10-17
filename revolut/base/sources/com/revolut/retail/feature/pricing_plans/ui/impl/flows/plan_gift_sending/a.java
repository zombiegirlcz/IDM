package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.PlanGiftSendingFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import phk.k;
import y8a.g;
import yhk.b;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final PlanGiftSendingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f103181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f103182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f103183r;

    public a(PlanGiftSendingFlowContract$InputData inputData, k planBillingPickerControllerModelExtension, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planBillingPickerControllerModelExtension, "planBillingPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f103181p = planBillingPickerControllerModelExtension;
        this.f103182q = featureToggleInteractor;
        g gVar = new g(this, 29);
        this.f103183r = d.a(this, PlanGiftSendingFlowContract$Step.SelectPlanToGive.f103180a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103183r;
    }
}
