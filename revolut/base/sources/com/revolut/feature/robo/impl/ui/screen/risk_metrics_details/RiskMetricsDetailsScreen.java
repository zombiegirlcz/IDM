package com.revolut.feature.robo.impl.ui.screen.risk_metrics_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import dmc.n;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qba.b;
import qnc.a;
import qnc.d;
import qnc.f;
import rd0.e;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/risk_metrics_details/RiskMetricsDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lqnc/d;", "Lcom/revolut/feature/robo/impl/ui/screen/risk_metrics_details/RiskMetricsDetailsScreenContract$InputData;", "", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RiskMetricsDetailsScreen extends BaseRecyclerViewScreen<d, RiskMetricsDetailsScreenContract$InputData, Object> {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(RiskMetricsDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object U;
    public final boolean V;
    public final h W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskMetricsDetailsScreen(RiskMetricsDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new b(this, inputData, 19));
        this.V = true;
        this.W = s.t(this, a.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (n) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) ((n) this.U.getValue()).f116017c.get();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new qg4.d(this, null, 15), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        RiskMetricsDetailsScreenContract$InputData riskMetricsDetailsScreenContract$InputData = (RiskMetricsDetailsScreenContract$InputData) this.G;
        navBarWithToolbar.setTitle(riskMetricsDetailsScreenContract$InputData.f85195a, null);
        navBarWithToolbar.setToolbarTitle(riskMetricsDetailsScreenContract$InputData.f85195a);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75642b0() {
        return m72.b.v(null, null, 7);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getL() {
        return R$layout.screen_recycler_navbar;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
