package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_selection;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_selection.PlanSelectionFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import n8i.e;
import nik.b;
import nik.c;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f103242p;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        e eVar = new e(this, 26);
        this.f103242p = d.a(this, PlanSelectionFlowContract$Step.SelectPlan.f103241a, f0.f322471a, eVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103242p;
    }
}
