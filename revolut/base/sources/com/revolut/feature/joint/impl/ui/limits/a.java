package com.revolut.feature.joint.impl.ui.limits;

import com.revolut.feature.joint.impl.ui.limits.JointLimitsFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import e58.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final JointLimitsFlowContract$EmptyState f76591t = JointLimitsFlowContract$EmptyState.f76587a;
    public final JointLimitsFlowContract$Step.Limits u = JointLimitsFlowContract$Step.Limits.f76588a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        JointLimitsFlowContract$Step step = (JointLimitsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof JointLimitsFlowContract$Step.Limits) {
            return new JointLimitsScreen();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f76591t;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
