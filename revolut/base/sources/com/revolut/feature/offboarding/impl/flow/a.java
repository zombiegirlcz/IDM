package com.revolut.feature.offboarding.impl.flow;

import com.revolut.feature.offboarding.impl.flow.RetailContainerFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.offboarding.impl.flow.SharedOffboardingFlow;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t5e.m;
import t79.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetailContainerFlowContract$Step.Home f78143t = RetailContainerFlowContract$Step.Home.f78142a;
    public final RetailContainerFlowContract$State u = new RetailContainerFlowContract$State(0);

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        RetailContainerFlowContract$Step step = (RetailContainerFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof RetailContainerFlowContract$Step.Home)) {
            throw new NoWhenBranchMatchedException();
        }
        SharedOffboardingFlow sharedOffboardingFlow = new SharedOffboardingFlow();
        m block = new m(this, 11);
        Intrinsics.checkNotNullParameter(block, "block");
        sharedOffboardingFlow.H = block;
        return sharedOffboardingFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f78143t;
    }
}
