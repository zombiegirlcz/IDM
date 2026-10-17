package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanDocumentsBottomSheetScreenContract$InputData f103525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f103526b;

    public a(PlanDocumentsBottomSheetScreenContract$InputData inputData, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f103525a = inputData;
        this.f103526b = pricingPlanInteractor;
    }
}
