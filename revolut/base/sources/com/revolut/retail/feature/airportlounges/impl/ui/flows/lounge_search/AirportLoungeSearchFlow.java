package com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import cwi.f0;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pgk.f;
import pt4.d;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$InputData;", "Laii/q;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungeSearchFlow extends BaseFlow<AirportLoungeSearchFlowContract$Step, AirportLoungeSearchFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirportLoungeSearchFlow(AirportLoungeSearchFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new d(this, inputData, 9));
        this.Q = w.y0(new f(this, 26));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (f0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (f0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (pwi.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        AirportLoungeSearchFlowContract$Step step = (AirportLoungeSearchFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
