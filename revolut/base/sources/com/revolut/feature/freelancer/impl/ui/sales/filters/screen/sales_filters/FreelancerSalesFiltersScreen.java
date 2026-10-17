package com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$id;
import com.revolut.feature.freelancer.impl.R$layout;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import java.util.List;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import up2.q;
import us6.z0;
import v0c.b;
import v17.a;
import v17.c;
import v17.d;
import v17.f;
import v17.g;
import v17.i;
import v17.l;
import v17.n;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/filters/screen/sales_filters/FreelancerSalesFiltersScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lv17/n;", "Lcom/revolut/feature/freelancer/impl/ui/sales/filters/screen/sales_filters/FreelancerSalesFiltersScreenContract$InputData;", "Lv17/l;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerSalesFiltersScreen extends BaseRecyclerViewScreen<n, FreelancerSalesFiltersScreenContract$InputData, l> {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f74135h0 = {o0.f186429a.j(new h0(FreelancerSalesFiltersScreen.class, "binding", "getBinding()Lcom/revolut/feature/freelancer/impl/databinding/ScreenFreelancerSalesFiltersBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ActionsDelegate f74136a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ListSubheaderDelegate f74137b0;
    public final FullScreenStateDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final InputTextDelegate f74138d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final RowDelegate f74139e0;
    public final SelectableDelegate f0;
    public final List g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreelancerSalesFiltersScreen(FreelancerSalesFiltersScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_freelancer_sales_filters;
        this.V = R$id.freelancerSalesFilters_recyclerView;
        this.W = true;
        this.X = s.t(this, a.f);
        this.Y = w.y0(new b(this, inputData, 5));
        this.Z = w.y0(new ur2.a(this, 13));
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.f74136a0 = actionsDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.f74137b0 = listSubheaderDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.c0 = fullScreenStateDelegate;
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.f74138d0 = inputTextDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f74139e0 = rowDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(rowDelegate);
        this.f0 = selectableDelegate;
        this.g0 = v.k(actionsDelegate, listSubheaderDelegate, fullScreenStateDelegate, inputTextDelegate, rowDelegate, new RowLoadingDelegate(), selectableDelegate);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        n uiState = (n) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f257028c.setMenuItems(uiState.f285249b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (z0) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f257028c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f257028c.o.f57403b), null, new q(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f257027b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f74136a0.f51611c.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f74137b0.f52707c), null, new v17.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.f52371h.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f74138d0.e.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f0.r()), null, new v17.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f74139e0.f53218h), null, new i(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f257028c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.freelancer_common_word_filters, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.freelancer_common_word_filters, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        g3().f257027b.setText(new TextLocalisedClause(R$string.freelancer_sales_filters_common_action_apply_filters, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        n uiState = (n) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f257028c.setMenuItems(uiState.f285249b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final RecyclerView.LayoutManager a3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(context, 2, 8);
        screenGridLayoutManager.setSpanSizeLookup(new v17.b(this, screenGridLayoutManager));
        return screenGridLayoutManager;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getG0() {
        return this.g0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final rs6.d g3() {
        ViewBinding value = this.X.getValue(this, f74135h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rs6.d) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final v17.m T2() {
        return (v17.m) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
