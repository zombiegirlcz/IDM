package com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits;

import cha.c;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.CancelStudentBenefitsFlowContract$Step;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sgk.b;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f102973p;

    public a(c studentPlanInteractor) {
        Intrinsics.checkNotNullParameter(studentPlanInteractor, "studentPlanInteractor");
        this.o = studentPlanInteractor;
        this.f102973p = d.a(this, new scl.h(this, 9));
    }

    @Override // yki.j
    public final void M0() {
        h.t2(this, this.f102973p, CancelStudentBenefitsFlowContract$Step.Confirmation.f102972a, false, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102973p;
    }
}
