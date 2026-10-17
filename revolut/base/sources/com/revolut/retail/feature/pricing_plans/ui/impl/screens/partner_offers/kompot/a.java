package com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.PlanPartnersFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tkk.b;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(PlanPartnersFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ta8.a aVar = new ta8.a(inputData, 20);
        this.o = d.a(this, PlanPartnersFlowContract$Step.ListPartners.f103455a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
