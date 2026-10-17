package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow;

import aii.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.R$id;
import com.revolut.feature.cryptocommodity_invest.impl.R$layout;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mw5.j;
import rd0.e;
import te0.w;
import xge.h;
import xw5.b;
import xw5.c;
import xw5.d;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$InputData;", "Laii/q;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoCommodityBuyCollectionFlow extends BaseFlow<CryptoCommodityBuyCollectionFlowContract$Step, CryptoCommodityBuyCollectionFlowContract$InputData, q> {
    public final int P;
    public final boolean Q;
    public final int R;
    public final Object S;
    public final Object T;
    public final CellDetailsActionDelegate U;
    public final CellDetailsDelegate V;
    public final LargeActionButtonDelegate W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCommodityBuyCollectionFlow(CryptoCommodityBuyCollectionFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = R$layout.flow_crypto_commodity_buy_collection;
        this.Q = true;
        this.R = R$id.buyCollectionFlow_container;
        this.S = w.y0(new xfj.a(this, inputData, 25));
        this.T = w.y0(new h(this, 13));
        this.U = new CellDetailsActionDelegate();
        this.V = new CellDetailsDelegate();
        this.W = new LargeActionButtonDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        j60.a aVar = (j60.a) ((j) this.S.getValue()).f.get();
        TextDelegate textDelegate = new TextDelegate();
        LargeActionButtonDelegate largeActionButtonDelegate = this.W;
        CellDetailsDelegate cellDetailsDelegate = this.V;
        CellDetailsActionDelegate cellDetailsActionDelegate = this.U;
        aVar.d(v.k(largeActionButtonDelegate, cellDetailsDelegate, cellDetailsActionDelegate, textDelegate));
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsActionDelegate.d), null, new xw5.a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsDelegate.d), null, new b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(largeActionButtonDelegate.d.f121375b), null, new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (j) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (j) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CryptoCommodityBuyCollectionFlowContract$Step step = (CryptoCommodityBuyCollectionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }
}
