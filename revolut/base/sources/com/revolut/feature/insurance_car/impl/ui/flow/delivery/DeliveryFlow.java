package com.revolut.feature.insurance_car.impl.ui.flow.delivery;

import android.view.View;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import ql7.x;
import rd0.e;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/delivery/DeliveryFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/delivery/DeliveryFlowContract$Step;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/delivery/DeliveryFlowContract$InputData;", "", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeliveryFlow extends BaseFlow<DeliveryFlowContract$Step, DeliveryFlowContract$InputData, Object> {
    public final boolean P;
    public final Object Q;
    public final Object R;
    public final TwinHorizontalButtonDelegate S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryFlow(DeliveryFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = true;
        this.Q = w.y0(new cf6.a(this, inputData, 11));
        this.R = w.y0(new bvb.a(this, 25));
        this.S = new TwinHorizontalButtonDelegate();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.S;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new cm7.a(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.d.f121375b), null, new cm7.a(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (x) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (x) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (cm7.b) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void a3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((x) this.Q.getValue()).f.get()).d(u.c(this.S));
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        DeliveryFlowContract$Step step = (DeliveryFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
