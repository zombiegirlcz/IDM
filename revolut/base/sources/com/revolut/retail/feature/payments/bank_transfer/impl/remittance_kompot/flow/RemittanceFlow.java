package com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceInputData;
import dki.s;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import p2k.z;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/RemittanceInputData;", "Laii/q;", "Lin0/g;", "Lno/d1;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RemittanceFlow extends BaseFlow<RemittanceFlowContract$Step, RemittanceInputData, q> implements g, d1 {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemittanceFlow(RemittanceInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new vqd.b(this, inputData, 23));
        this.Q = w.y0(new vt3.a(this, 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (z) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (z) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (w3k.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        RemittanceFlowContract$Step step = (RemittanceFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
