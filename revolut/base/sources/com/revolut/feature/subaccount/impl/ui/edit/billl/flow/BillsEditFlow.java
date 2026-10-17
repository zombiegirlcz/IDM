package com.revolut.feature.subaccount.impl.ui.edit.billl.flow;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import cvi.b;
import d8e.c;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r6e.d;
import rd0.e;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/edit/billl/flow/BillsEditFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/subaccount/impl/ui/edit/billl/flow/BillsEditFlowContract$Step;", "Lcom/revolut/feature/subaccount/impl/ui/edit/billl/flow/BillsEditFlowContract$InputData;", "Laii/q;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillsEditFlow extends BaseFlow<BillsEditFlowContract$Step, BillsEditFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;
    public final TwinHorizontalButtonDelegate R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillsEditFlow(BillsEditFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new b(this, inputData, 21));
        this.Q = w.y0(new d8e.a(this, 0));
        this.R = new TwinHorizontalButtonDelegate();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.R;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new d8e.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.d.f121375b), null, new d8e.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void a3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((d) this.P.getValue()).f.get()).d(u.c(this.R));
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        BillsEditFlowContract$Step step = (BillsEditFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
