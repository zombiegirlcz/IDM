package com.revolut.feature.robo.impl.ui.screen.risk_metrics;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.wealth.resources.R$string;
import dmc.z;
import grl.k9;
import java.util.List;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lea.b;
import lnc.a;
import lnc.d;
import lnc.e;
import no.m;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/risk_metrics/RiskMetricsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Llnc/e;", "Lcom/revolut/feature/robo/impl/ui/screen/risk_metrics/RiskMetricsScreenContract$InputData;", "", "Lno/m;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RiskMetricsScreen extends BaseRecyclerViewScreen<e, RiskMetricsScreenContract$InputData, Object> implements m {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f85193a0 = {o0.f186429a.j(new h0(RiskMetricsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final k9 U;
    public final Object V;
    public final boolean W;
    public final h X;
    public final ListSubheaderDelegate Y;
    public final FullScreenStateDelegate Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskMetricsScreen(RiskMetricsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 value = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.U = value;
        this.V = w.y0(new b(this, inputData, 14));
        this.W = true;
        this.X = s.t(this, a.f);
        this.Y = new ListSubheaderDelegate();
        this.Z = new FullScreenStateDelegate();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        e uiState = (e) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174539b.setSecondDescriptionText(uiState.f197141a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return new AnalyticsProduct.Retail(this.U);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (z) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return ((z) this.V.getValue()).d();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174539b.f59410q), null, new la8.h(this, null, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.d), null, new lnc.b(2, 4, d.class, ((z) this.V.getValue()).d(), "onInfoButtonClicked", "onInfoButtonClicked(Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;)V"), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        e uiState = (e) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174539b.setSecondDescriptionText(uiState.f197141a);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75642b0() {
        return v.k(this.Y, new CellDetailsDelegate(), this.Z, new RowLoadingDelegate());
    }

    public final jii.m g3() {
        ViewBinding value = this.X.getValue(this, f85193a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getL() {
        return R$layout.screen_recycler_navbar;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
