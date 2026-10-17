package com.revolut.feature.transactions.impl.ui.pending;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import es.e;
import fb6.j;
import gnf.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/pending/PendingTransactionFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/transactions/impl/ui/pending/PendingTransactionFlowContract$Step;", "Lcom/revolut/feature/transactions/impl/ui/pending/PendingTransactionFlowContract$InputData;", "Laii/q;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingTransactionFlow extends BaseFlow<PendingTransactionFlowContract$Step, PendingTransactionFlowContract$InputData, q> {
    public final boolean P;
    public final Object Q;
    public final Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingTransactionFlow(PendingTransactionFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = true;
        this.Q = w.y0(new j(this, inputData, 16));
        this.R = w.y0(new e(this, 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (fnf.a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        PendingTransactionFlowContract$Step step = (PendingTransactionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
