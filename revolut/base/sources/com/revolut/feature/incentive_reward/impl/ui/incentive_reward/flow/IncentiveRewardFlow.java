package com.revolut.feature.incentive_reward.impl.ui.incentive_reward.flow;

import aii.q;
import cf7.d;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.tracking.v3.IncentiveRewardContext;
import dki.s;
import grl.j5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/incentive_reward/impl/ui/incentive_reward/flow/IncentiveRewardFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/incentive_reward/impl/ui/incentive_reward/flow/IncentiveRewardFlowContract$Step;", "", "Laii/q;", "Lno/k;", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncentiveRewardFlow extends BaseFlow<IncentiveRewardFlowContract$Step, Object, q> implements k {
    public final Object P;
    public final Object Q;
    public AnalyticsContext R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncentiveRewardFlow(IncentiveRewardFlowContract$InputData$Details inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new sw6.a(this, inputData, 18));
        this.Q = w.y0(new sii.a(this, 29));
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        IncentiveRewardContext.a aVarNewBuilder = IncentiveRewardContext.newBuilder();
        j5 j5Var = j5.CASHBACK;
        aVarNewBuilder.c();
        ((IncentiveRewardContext) aVarNewBuilder.f49761b).setRewardType(j5Var);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.R = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (d) this.P.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (s) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        IncentiveRewardFlowContract$Step step = (IncentiveRewardFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
