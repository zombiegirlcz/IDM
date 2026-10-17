package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f103009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cha.b f103010b;

    public f(t pricingPlanInteractor, cha.b familyPlansInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        this.f103009a = pricingPlanInteractor;
        this.f103010b = familyPlansInteractor;
    }
}
