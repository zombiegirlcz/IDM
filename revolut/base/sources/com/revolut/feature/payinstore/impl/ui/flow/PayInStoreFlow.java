package com.revolut.feature.payinstore.impl.ui.flow;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kn9.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pe2.c;
import pgk.f;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payinstore/impl/ui/flow/PayInStoreFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/payinstore/impl/ui/flow/PayInStoreFlowContract$Step;", "Lcom/revolut/feature/payinstore/impl/ui/flow/PayInStoreFlowContract$InputData;", "Laii/q;", "feature_pay_in_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayInStoreFlow extends BaseFlow<PayInStoreFlowContract$Step, PayInStoreFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    public PayInStoreFlow(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        PayInStoreFlowContract$InputData inputData = new PayInStoreFlowContract$InputData(orderId);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        super(inputData);
        this.P = w.y0(new c(this, inputData, 17));
        this.Q = w.y0(new f(this, 13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (pn9.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        PayInStoreFlowContract$Step step = (PayInStoreFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
