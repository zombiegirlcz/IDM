package com.revolut.feature.incentive_reward.impl.ui.incentive_reward.flow;

import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.flow.IncentiveRewardFlowContract$Step;
import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.IncentiveRewardDetailsController;
import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.IncentiveRewardDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends g implements tf7.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final IncentiveRewardFlowContract$InputData$Details f74864t;
    public final IncentiveRewardFlowContract$Step.Details u;
    public final IncentiveRewardFlowContract$EmptyState v;

    public a(IncentiveRewardFlowContract$InputData$Details inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f74864t = inputData;
        this.u = IncentiveRewardFlowContract$Step.Details.f74863a;
        this.v = IncentiveRewardFlowContract$EmptyState.f74861a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        IncentiveRewardFlowContract$Step step = (IncentiveRewardFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        IncentiveRewardFlowContract$InputData$Details incentiveRewardFlowContract$InputData$Details = this.f74864t;
        if (incentiveRewardFlowContract$InputData$Details == null) {
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.f(step, IncentiveRewardFlowContract$Step.Details.f74863a)) {
            return new IncentiveRewardDetailsController(new IncentiveRewardDetailsControllerContract$InputData(incentiveRewardFlowContract$InputData$Details.f74862a));
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
