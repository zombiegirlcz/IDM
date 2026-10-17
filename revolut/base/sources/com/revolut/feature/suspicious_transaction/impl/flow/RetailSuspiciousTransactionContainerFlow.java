package com.revolut.feature.suspicious_transaction.impl.flow;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.x8;
import mzb.e;
import qji.a;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/suspicious_transaction/impl/flow/RetailSuspiciousTransactionContainerFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/suspicious_transaction/impl/flow/RetailSuspiciousTransactionContainerFlowContract$Step;", "Lcom/revolut/feature/suspicious_transaction/impl/flow/RetailSuspiciousTransactionContainerFlowContract$InputData;", "Laii/q;", "feature_suspicious_transaction_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailSuspiciousTransactionContainerFlow extends BaseFlow<RetailSuspiciousTransactionContainerFlowContract$Step, RetailSuspiciousTransactionContainerFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetailSuspiciousTransactionContainerFlow(RetailSuspiciousTransactionContainerFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new e(this, inputData, 27));
        this.Q = w.y0(new x8(this, 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final a Q2() {
        return (lfe.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (lfe.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (nfe.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        RetailSuspiciousTransactionContainerFlowContract$Step step = (RetailSuspiciousTransactionContainerFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
