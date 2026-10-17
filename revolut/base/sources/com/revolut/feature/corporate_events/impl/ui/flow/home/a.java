package com.revolut.feature.corporate_events.impl.ui.flow.home;

import com.revolut.feature.corporate_events.impl.ui.flow.home.CorporateEventsHomeFlowContract$Step;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenContract$Input;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import fp3.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CorporateEventsHomeFlowContract$Input f66119t;
    public final CorporateEventsHomeFlowContract$Step.Home u;
    public final EmptyFlowState v;

    public a(CorporateEventsHomeFlowContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f66119t = inputData;
        this.u = CorporateEventsHomeFlowContract$Step.Home.f66118a;
        this.v = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CorporateEventsHomeFlowContract$Step step = (CorporateEventsHomeFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, CorporateEventsHomeFlowContract$Step.Home.f66118a)) {
            return new CorporateEventsHomeScreen(new CorporateEventsHomeScreenContract$Input(this.f66119t.f66117a));
        }
        throw new NoWhenBranchMatchedException();
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
