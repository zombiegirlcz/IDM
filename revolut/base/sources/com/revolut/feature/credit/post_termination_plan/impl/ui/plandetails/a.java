package com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails;

import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.PostTerminationPlanDetailsFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import ic2.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vsl.f;
import vvc.s;
import wa5.b;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final PostTerminationPlanDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ra5.b f70670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qa5.b f70671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f70672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f70673s;

    public a(PostTerminationPlanDetailsFlowContract$InputData inputData, ra5.b creditPostTerminationPlanInteractor, qa5.b explainerControllerFactory, c errorHandlingDialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditPostTerminationPlanInteractor, "creditPostTerminationPlanInteractor");
        Intrinsics.checkNotNullParameter(explainerControllerFactory, "explainerControllerFactory");
        Intrinsics.checkNotNullParameter(errorHandlingDialogMapper, "errorHandlingDialogMapper");
        this.o = inputData;
        this.f70670p = creditPostTerminationPlanInteractor;
        this.f70671q = explainerControllerFactory;
        this.f70672r = errorHandlingDialogMapper;
        this.f70673s = d.a(this, new s(this, 23));
    }

    @Override // yki.j
    public final void M0() {
        CreditPostTerminationPlanDetails creditPostTerminationPlanDetails = this.o.f70667b;
        i iVar = this.f70673s;
        if (creditPostTerminationPlanDetails != null) {
            h.w2(iVar, new PostTerminationPlanDetailsFlowContract$Step.PlanDetails(creditPostTerminationPlanDetails), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        h.u2(this, iVar, PostTerminationPlanDetailsFlowContract$Step.Loading.f70668a, null, 6);
        l2(new w76.a(this, null, 4), new f(1, this, a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 16));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f70673s;
    }
}
