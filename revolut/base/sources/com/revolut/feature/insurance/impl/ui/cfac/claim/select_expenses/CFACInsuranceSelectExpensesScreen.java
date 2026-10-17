package com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import ghk.t;
import gk7.b;
import gk7.c;
import gk7.d;
import gk7.g;
import gk7.i;
import gk7.j;
import ik7.f;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/select_expenses/CFACInsuranceSelectExpensesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lgk7/j;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/select_expenses/CFACInsuranceSelectExpensesScreenContract$InputData;", "Lgk7/g;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceSelectExpensesScreen extends BaseRecyclerViewScreen<j, CFACInsuranceSelectExpensesScreenContract$InputData, g> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CFACInsuranceSelectExpensesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75107a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f75108b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACInsuranceSelectExpensesScreen(CFACInsuranceSelectExpensesScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = true;
        this.W = s.t(this, b.f);
        this.X = w.y0(new t(this, inputData, 2));
        this.Y = w.y0(new g8i.h(this, 12));
        Lazy lazyY0 = w.y0(new gaa.b(22));
        this.Z = lazyY0;
        Lazy lazyY02 = w.y0(new gaa.b(23));
        this.f75107a0 = lazyY02;
        this.f75108b0 = v.k(new ListSubheaderDelegate(), (SelectableDelegate) lazyY0.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) lazyY02.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (nk7.w) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, e.b(h3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        a.g2(this, e.b(h3().f174565c.o.f57403b), null, new c(this, continuation, 1), 3);
        a.g2(this, e.b(h3().f174565c.f59409p.f57337m), null, new d(this, continuation, 0), 3);
        a.g2(this, e.b(h3().f174564b.o), null, new c(this, continuation, 2), 3);
        r map = ((SelectableDelegate) this.Z.getValue()).r().filter(new gjg.e(new ghk.r(29), 3)).map(new gjg.e(new gk7.a(0), 4));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        a.g2(this, e.b(map), null, new d(this, continuation, 1), 3);
        a.g2(this, e.b(((FullScreenStateDelegate) this.f75107a0.getValue()).f52371h.f121375b), null, new gk7.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cfac_claim_select_expenses_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_claim_select_expenses_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(f.b());
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.cfac_claim_select_expenses_search_bar_placeholder, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF75108b0() {
        return this.f75108b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = h3().f174564b;
        if (uiState.d) {
            largeActionButton.setVisibility(0);
            largeActionButton.setEnabled(uiState.f144338c);
            largeActionButton.setText(uiState.f144337b);
        } else {
            largeActionButton.setVisibility(8);
        }
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setSearchButtonActive(uiState.e);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final u h3() {
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
