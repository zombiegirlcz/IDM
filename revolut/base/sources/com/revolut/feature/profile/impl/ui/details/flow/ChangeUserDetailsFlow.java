package com.revolut.feature.profile.impl.ui.details.flow;

import aii.q;
import bc1.a;
import bc1.b;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import fma.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/flow/ChangeUserDetailsFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/profile/impl/ui/details/flow/ChangeUserDetailsFlowContract$Step;", "Lcom/revolut/feature/profile/impl/ui/details/flow/ChangeUserDetailsFlowContract$InputData;", "Laii/q;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChangeUserDetailsFlow extends BaseFlow<ChangeUserDetailsFlowContract$Step, ChangeUserDetailsFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeUserDetailsFlow(ChangeUserDetailsFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new a(this, inputData, 16));
        this.Q = w.y0(new b(this, 16));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (bna.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        ChangeUserDetailsFlowContract$Step step = (ChangeUserDetailsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
