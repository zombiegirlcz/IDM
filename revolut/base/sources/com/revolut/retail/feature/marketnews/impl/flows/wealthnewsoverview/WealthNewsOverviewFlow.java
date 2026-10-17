package com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import com.revolut.kompot.navigable.flow.scroller.ScrollerFlowStep;
import com.revolut.retail.feature.marketnews.impl.R$id;
import com.revolut.retail.feature.marketnews.impl.R$layout;
import com.revolut.retail.wealth.resources.R$string;
import eki.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l0k.i;
import rd0.e;
import rlh.c;
import rsl.p;
import rtl.y;
import s0k.d;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlow;", "Lcom/revolut/kompot/navigable/flow/scroller/BaseScrollerFlow;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$InputData;", "Laii/q;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthNewsOverviewFlow extends BaseScrollerFlow<WealthNewsOverviewFlowContract$Step, WealthNewsOverviewFlowContract$InputData, q> {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(WealthNewsOverviewFlow.class, "binding", "getBinding()Lcom/revolut/retail/feature/marketnews/impl/databinding/FlowWealthNewsOverviewBinding;", 0))};
    public final h R;
    public final int S;
    public final int T;
    public final Object U;
    public final Object V;
    public final boolean W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WealthNewsOverviewFlow(WealthNewsOverviewFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.R = s.t(this, s0k.a.f);
        this.S = R$layout.flow_wealth_news_overview;
        this.T = R$id.flowWealthNewsOverview_recyclerView;
        this.U = w.y0(new rxe.b(this, inputData, 9));
        this.V = w.y0(new y(this, 10));
        this.W = true;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        com.revolut.kompot.navigable.a.g2(this, e.b(Y2().f170059b.f59410q), null, new c(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, new ryj.w(e.b(Y2().f170060c.f58882b), 1), null, new s0k.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, ((a) ((d) this.V.getValue())).f101855q, null, new s0k.c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow
    public final rji.a O2() {
        return (i) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow
    public final n Q2() {
        return (d) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (i) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow
    /* JADX INFO: renamed from: T2, reason: from getter */
    public final int getT() {
        return this.T;
    }

    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow
    public final void U2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = Y2().f170059b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_news_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setAlwaysExpanded(false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow
    public final void V2(ScrollerFlowStep scrollerFlowStep) {
        WealthNewsOverviewFlowContract$Step step = (WealthNewsOverviewFlowContract$Step) scrollerFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        a aVar = (a) ((d) this.V.getValue());
        aVar.getClass();
        Intrinsics.checkNotNullParameter(step, "step");
        aVar.n2(new s09.c(aVar, new p(aVar, step, 25), null, 1), new whi.b(6));
    }

    public final j0k.b Y2() {
        ViewBinding value = this.R.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j0k.b) value;
    }

    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
