package com.revolut.feature.insurance_embedded.impl.ui.flow.comparison;

import a83.o0;
import bu7.k;
import com.revolut.feature.insurance_embedded.impl.ui.flow.comparison.PlanComparisonFlowContract$Step;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.CoverageFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.CoverageFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import msb.c;
import mu7.e;
import pfk.p0;
import qi3.i;
import vkm.q;
import w4l.h;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g implements qu7.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PlanComparisonFlowContract$InputData f76045t;
    public final e u;
    public final PlanComparisonFlowContract$Step.PlanComparison v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final PlanComparisonFlowContract$State f76046w;

    public b(PlanComparisonFlowContract$InputData inputData, e planComparisonInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planComparisonInteractor, "planComparisonInteractor");
        this.f76045t = inputData;
        this.u = planComparisonInteractor;
        this.v = PlanComparisonFlowContract$Step.PlanComparison.f76043a;
        this.f76046w = PlanComparisonFlowContract$State.f76042a;
    }

    @Override // yji.l
    public final void T1(long j2) {
        k coverageGroup = this.f76045t.f76041a;
        e eVar = this.u;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
        l.b1(this, q.q(new t38.e(q.q(rd0.e.b(nim.a.w(((p0) eVar.f208999a).a(h.f294642c), new c(23)))), 24, eVar.a(coverageGroup, true), new o0(3, 13, null))), null, new a(this, null), 3);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PlanComparisonFlowContract$Step step = (PlanComparisonFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof PlanComparisonFlowContract$Step.PlanComparison;
        PlanComparisonFlowContract$InputData planComparisonFlowContract$InputData = this.f76045t;
        if (!z) {
            if (step instanceof PlanComparisonFlowContract$Step.PlanCoverage) {
                return new CoverageFlow(new CoverageFlowContract$InputData(planComparisonFlowContract$InputData.f76041a));
            }
            throw new NoWhenBranchMatchedException();
        }
        PlanComparisonScreen planComparisonScreen = new PlanComparisonScreen(new PlanComparisonScreenContract$InputData(planComparisonFlowContract$InputData.f76041a));
        i iVar = new i(1, this, b.class, "handlePlanComparisonScreenResult", "handlePlanComparisonScreenResult(Lcom/revolut/feature/insurance_embedded/impl/ui/screen/plan_comparison/PlanComparisonScreenContract$OutputData;)V", 0, 14);
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        planComparisonScreen.H = iVar;
        return planComparisonScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f76046w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
