package com.revolut.feature.card_order_new.impl.kompot;

import android.view.View;
import buf.u;
import c23.d;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import rd0.e;
import te0.w;
import x13.q;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData;", "", "Lno/m;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardOrderFlow extends BaseFlow<CardOrderFlowContract$Step, CardOrderFlowContract$InputData, Object> implements m {
    public final LargeActionButtonDelegate P;
    public final Object Q;
    public final AnalyticsProduct R;
    public final Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardOrderFlow(CardOrderFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = new LargeActionButtonDelegate();
        this.Q = w.y0(new u(this, inputData, 18));
        this.R = inputData.getD();
        this.S = w.y0(new bvb.a(this, 7));
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        com.revolut.kompot.navigable.a.g2(this, e.b(this.P.d.f121375b), null, new c23.c(this, null), 3);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (q) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (q) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (d) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void a3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((q) this.Q.getValue()).f302175g.get()).d(zhm.u.c(this.P));
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CardOrderFlowContract$Step step = (CardOrderFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
