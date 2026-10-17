package olk;

import cli.n;
import cli.y;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.PlanCancelFeedbackScreenContract$InputData;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends oki.h implements h {
    public final PlanCancelFeedbackScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n60.a f226447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f226448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f226449r;

    public k(n stateMapper, PlanCancelFeedbackScreenContract$InputData inputData, n60.a keyboardControllerExtension, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.o = inputData;
        this.f226447p = keyboardControllerExtension;
        this.f226448q = pricingPlanInteractor;
        this.f226449r = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        w4l.h hVar = w4l.h.f294642c;
        t tVar = this.f226448q;
        yji.l.a1(this, nim.a.v(rd0.e.b(tVar.v(hVar)), new okk.d(11)), null, null, new j(this, null, 0), 3);
        PlanCancelFeedbackScreenContract$InputData planCancelFeedbackScreenContract$InputData = this.o;
        yji.l.a1(this, rd0.e.b(tVar.s(planCancelFeedbackScreenContract$InputData.f103511a, planCancelFeedbackScreenContract$InputData.f103512b, planCancelFeedbackScreenContract$InputData.f103513c)), null, null, new j(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f226449r;
    }
}
