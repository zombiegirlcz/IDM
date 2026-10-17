package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.PlanKeepFlowContract$Step;
import d8l.d;
import ffk.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;
import zhk.b;
import zhk.c;
import zhk.e;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final PlanKeepFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f103187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f103188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f103189r;

    public a(PlanKeepFlowContract$InputData inputData, t pricingPlanInteractor, c dialogFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        this.o = inputData;
        this.f103187p = pricingPlanInteractor;
        this.f103188q = dialogFactory;
        this.f103189r = d.a(this, new zba.a(this, 20));
    }

    @Override // yki.j
    public final void M0() {
        int i = e.f322433a[this.o.f103184a.ordinal()];
        if (i == 1) {
            h.t2(this, this.f103189r, PlanKeepFlowContract$Step.BenefitsToLose.f103185a, false, null, false, 12);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new yzb.c(this, null, 20), new yi5.b(26));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103189r;
    }
}
