package kp7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import pfk.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MotorPlanSelectorScreenContract$InputData f188200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ll7.u f188201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dha.c f188202n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f188203p;

    public w(MotorPlanSelectorScreenContract$InputData inputData, ll7.u planRepository, dha.c pricingPlansRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planRepository, "planRepository");
        Intrinsics.checkNotNullParameter(pricingPlansRepository, "pricingPlansRepository");
        this.f188200l = inputData;
        this.f188201m = planRepository;
        this.f188202n = pricingPlansRepository;
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, new kge.b(rd0.e.b(((p0) this.f188202n).b()), 18), null, new kae.d(this, null, 24), 3);
    }

    @Override // yji.n
    public final void H2() {
        yji.n.l2(this, new kge.b(rd0.e.b(((p0) this.f188202n).a(w4l.h.f294642c)), 17), null, new com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.f(this, null), 3);
    }
}
