package com.revolut.feature.apm.bills.pagopa.impl.ui.flow;

import agh.b;
import aii.q;
import com.revolut.feature.apm.bills.pagopa.api.navigation.PagoPAFlowDestination;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/pagopa/impl/ui/flow/PagoPAFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/apm/bills/pagopa/impl/ui/flow/PagoPAFlowContract$Step;", "Lcom/revolut/feature/apm/bills/pagopa/api/navigation/PagoPAFlowDestination$InputData;", "Laii/q;", "feature_apm_bills_pagopa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PagoPAFlow extends BaseFlow<PagoPAFlowContract$Step, PagoPAFlowDestination.InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagoPAFlow(PagoPAFlowDestination.InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new b(this, inputData, 24));
        this.Q = w.y0(new aqe.a(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (br1.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (br1.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (ar1.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        PagoPAFlowContract$Step step = (PagoPAFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
