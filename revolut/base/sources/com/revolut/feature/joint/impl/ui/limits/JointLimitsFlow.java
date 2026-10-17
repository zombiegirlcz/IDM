package com.revolut.feature.joint.impl.ui.limits;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import e58.d;
import e58.e;
import e58.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/limits/JointLimitsFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/joint/impl/ui/limits/JointLimitsFlowContract$Step;", "Lcom/revolut/feature/joint/impl/ui/limits/JointLimitsContract$InputData;", "Laii/q;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointLimitsFlow extends BaseFlow<JointLimitsFlowContract$Step, JointLimitsContract$InputData, q> {
    public final Object P;
    public final Object Q;
    public final boolean R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointLimitsFlow(JointLimitsContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new d(this, inputData, 0));
        this.Q = w.y0(new e(this, 0));
        this.R = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (f58.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (f58.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        JointLimitsFlowContract$Step step = (JointLimitsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
