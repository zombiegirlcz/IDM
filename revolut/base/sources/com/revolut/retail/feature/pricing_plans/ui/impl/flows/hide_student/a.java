package com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student;

import cha.c;
import chk.b;
import chk.d;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.HideStudentFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f103044p;

    public a(c studentPlanInteractor) {
        Intrinsics.checkNotNullParameter(studentPlanInteractor, "studentPlanInteractor");
        this.o = studentPlanInteractor;
        this.f103044p = d8l.d.a(this, new c9f.c(this, 19));
    }

    @Override // yki.j
    public final void M0() {
        h.w2(this.f103044p, HideStudentFlowContract$Step.Confirmation.f103043a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103044p;
    }
}
