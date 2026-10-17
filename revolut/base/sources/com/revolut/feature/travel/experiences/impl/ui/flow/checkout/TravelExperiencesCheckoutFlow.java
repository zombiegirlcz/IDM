package com.revolut.feature.travel.experiences.impl.ui.flow.checkout;

import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import ghk.t;
import h1g.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import z0g.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$InputData;", "Lh1g/c;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesCheckoutFlow extends BaseFlow<TravelExperiencesCheckoutFlowContract$Step, TravelExperiencesCheckoutFlowContract$InputData, c> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesCheckoutFlow(TravelExperiencesCheckoutFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new t(this, inputData, 29));
        this.Q = w.y0(new h1g.a(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (h1g.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        TravelExperiencesCheckoutFlowContract$Step step = (TravelExperiencesCheckoutFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
