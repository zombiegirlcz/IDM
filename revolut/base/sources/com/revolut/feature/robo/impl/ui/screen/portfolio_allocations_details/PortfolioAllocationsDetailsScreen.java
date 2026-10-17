package com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalBarGroupDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import cyc.c;
import dcf.v0;
import dnc.a;
import dnc.j;
import dnc.m;
import grl.k9;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import spc.b;
import te0.w;
import vc.s;
import vkm.d;
import z0h.s1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/portfolio_allocations_details/PortfolioAllocationsDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ldnc/m;", "Lcom/revolut/feature/robo/impl/ui/screen/portfolio_allocations_details/PortfolioAllocationsDetailsScreenContract$InputData;", "", "Lz0h/s1;", "Lno/m;", "Lspc/b;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioAllocationsDetailsScreen extends BaseRecyclerViewScreen<m, PortfolioAllocationsDetailsScreenContract$InputData, Object> implements s1, no.m, b {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(PortfolioAllocationsDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final k9 U;
    public final h V;
    public final FixedTabsDelegate W;
    public final RowDelegate X;
    public final FullScreenStateDelegate Y;
    public final LargeActionButtonDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f85147a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f85148b0;
    public final boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f85149d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final TextDelegate f85150e0;
    public final List f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioAllocationsDetailsScreen(PortfolioAllocationsDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 value = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.U = value;
        this.V = s.t(this, a.f);
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        this.W = fixedTabsDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.X = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Y = fullScreenStateDelegate;
        this.Z = new LargeActionButtonDelegate();
        this.f85147a0 = R$layout.screen_recycler_navbar;
        this.f85148b0 = w.y0(new dgg.b(this, inputData, 7));
        this.c0 = true;
        this.f85149d0 = w.y0(new d8e.a(this, 9));
        TextDelegate textDelegate = new TextDelegate();
        this.f85150e0 = textDelegate;
        this.f0 = v.k(new HorizontalBarGroupDelegate(), new ListSubheaderDelegate(), fixedTabsDelegate, rowDelegate, new RowLoadingDelegate(), textDelegate, fullScreenStateDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return new AnalyticsProduct.Retail(this.U);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (dmc.v) this.f85148b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.f85149d0.getValue();
    }

    @Override // spc.b
    public final spc.a V0() {
        return new spc.a(this.f85150e0, this.Z);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        d dVarB = e.b(this.W.f52339c.f121375b);
        ?? r102 = this.f85149d0;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new c(2, (j) r102.getValue(), j.class, "onTabSelected", "onTabSelected(Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$SelectedData;)V", 4, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new v0(this, null, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.f53218h), null, new dnc.b(2, 4, j.class, (j) r102.getValue(), "onRowDelegateClick", "onRowDelegateClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.f52371h.f121375b), null, new dnc.c(2, 4, j.class, (j) r102.getValue(), "onRetryClick", "onRetryClick(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f85150e0.d), null, new c(2, (j) r102.getValue(), j.class, "onTextDelegateClauseClick", "onTextDelegateClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 9), 3);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        dmc.v vVar = (dmc.v) this.f85148b0.getValue();
        switch (vVar.f116073a) {
            case 0:
                aVar = (j60.a) vVar.f116077h.get();
                break;
            default:
                aVar = (j60.a) vVar.f116077h.get();
                break;
        }
        aVar.d(u.c(this.Z));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(m uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f116262a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(uiState.f116263b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF85147a0() {
        return this.f85147a0;
    }

    public final jii.m h3() {
        ViewBinding value = this.V.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // z0h.s1
    public final d r() {
        return e.b(this.f85150e0.d);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.c0);
    }
}
