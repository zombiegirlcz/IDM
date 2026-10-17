package com.revolut.feature.insurance_embedded.impl.ui.flow.coverage;

import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.CoverageFlowContract$Step;
import com.revolut.feature.insurance_embedded.impl.ui.flow.detail.EmbeddedDetailFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.detail.EmbeddedDetailFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.CoverageListScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.CoverageListScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rnb.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements ru7.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CoverageFlowContract$InputData f76052t;
    public final CoverageFlowContract$Step.CoverageList u;
    public final CoverageFlowContract$State v;

    public a(CoverageFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f76052t = inputData;
        this.u = CoverageFlowContract$Step.CoverageList.f76049a;
        this.v = CoverageFlowContract$State.f76048a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CoverageFlowContract$Step step = (CoverageFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof CoverageFlowContract$Step.CoverageList)) {
            if (!(step instanceof CoverageFlowContract$Step.Detail)) {
                throw new NoWhenBranchMatchedException();
            }
            CoverageFlowContract$Step.Detail detail = (CoverageFlowContract$Step.Detail) step;
            return new EmbeddedDetailFlow(new EmbeddedDetailFlowContract$InputData(detail.f76050a, detail.f76051b));
        }
        CoverageListScreen coverageListScreen = new CoverageListScreen(new CoverageListScreenContract$InputData(this.f76052t.f76047a));
        u uVar = new u(1, this, a.class, "handleCoverageListResult", "handleCoverageListResult(Lcom/revolut/feature/insurance_embedded/impl/ui/screen/coverage_list/CoverageListScreenContract$OutputData;)V", 0, 9);
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        coverageListScreen.H = uVar;
        return coverageListScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
