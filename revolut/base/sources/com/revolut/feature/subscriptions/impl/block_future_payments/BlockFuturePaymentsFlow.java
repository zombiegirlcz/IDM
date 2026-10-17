package com.revolut.feature.subscriptions.impl.block_future_payments;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import i9e.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/block_future_payments/BlockFuturePaymentsFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/subscriptions/impl/block_future_payments/BlockFuturePaymentsFlowContract$Step;", "Lcom/revolut/feature/subscriptions/impl/block_future_payments/BlockFuturePaymentsFlowContract$InputData;", "Laii/q;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockFuturePaymentsFlow extends BaseFlow<BlockFuturePaymentsFlowContract$Step, BlockFuturePaymentsFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;
    public final boolean R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockFuturePaymentsFlow(BlockFuturePaymentsFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new qvf.a(this, inputData, 22));
        this.Q = w.y0(new r1a.a(this, 6));
        this.R = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (r9e.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        BlockFuturePaymentsFlowContract$Step step = (BlockFuturePaymentsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
