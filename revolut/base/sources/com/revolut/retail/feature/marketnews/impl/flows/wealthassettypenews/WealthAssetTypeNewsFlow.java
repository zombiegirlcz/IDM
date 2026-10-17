package com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.marketnews.impl.R$id;
import com.revolut.retail.feature.marketnews.impl.R$layout;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pnb.b;
import pt4.d;
import rd0.e;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthassettypenews/WealthAssetTypeNewsFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthassettypenews/WealthAssetTypeNewsFlowContract$Step;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthassettypenews/WealthAssetTypeNewsFlowContract$InputData;", "Laii/q;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthAssetTypeNewsFlow extends BaseFlow<WealthAssetTypeNewsFlowContract$Step, WealthAssetTypeNewsFlowContract$InputData, q> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(WealthAssetTypeNewsFlow.class, "binding", "getBinding()Lcom/revolut/retail/feature/marketnews/impl/databinding/FlowWealthAssetTypeNewsBinding;", 0))};
    public final h P;
    public final int Q;
    public final boolean R;
    public final Object S;
    public final Object T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WealthAssetTypeNewsFlow(WealthAssetTypeNewsFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = s.t(this, q0k.a.f);
        this.Q = R$layout.flow_wealth_asset_type_news;
        this.R = true;
        this.S = w.y0(new d(this, inputData, 13));
        this.T = w.y0(new pyc.a(this, 7));
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((j0k.a) value).f170057b.f59410q), null, new b(this, null, 26), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (l0k.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (l0k.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    /* JADX INFO: renamed from: R2 */
    public final int getQ() {
        return R$id.flowWealthAssetTypeNews_container;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final dki.s S2() {
        return (q0k.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void a3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((j0k.a) value).f170057b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_news_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        WealthAssetTypeNewsFlowContract$Step step = (WealthAssetTypeNewsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
