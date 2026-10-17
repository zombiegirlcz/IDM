package com.revolut.feature.insurance_home.impl.ui.flow.home;

import com.revolut.feature.insurance_home.impl.ui.flow.home.InsuranceHomeFlowContract$Step;
import com.revolut.feature.insurance_home.impl.ui.screen.home.InsuranceHomeScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sw7.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InsuranceHomeFlowContract$Step.Home f76216t = InsuranceHomeFlowContract$Step.Home.f76215a;
    public final InsuranceHomeFlowContract$State u = InsuranceHomeFlowContract$State.f76214a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        InsuranceHomeFlowContract$Step step = (InsuranceHomeFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof InsuranceHomeFlowContract$Step.Home) {
            return new InsuranceHomeScreen();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f76216t;
    }
}
