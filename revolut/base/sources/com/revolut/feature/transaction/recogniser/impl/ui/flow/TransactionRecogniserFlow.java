package com.revolut.feature.transaction.recogniser.impl.ui.flow;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import jef.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q97.p1;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$InputData;", "Laii/q;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionRecogniserFlow extends BaseFlow<TransactionRecogniserFlowContract$Step, TransactionRecogniserFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionRecogniserFlow(TransactionRecogniserFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new qba.b(this, inputData, 8));
        this.Q = w.y0(new p1(this, 6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (s) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        TransactionRecogniserFlowContract$Step step = (TransactionRecogniserFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
