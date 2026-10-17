package com.revolut.feature.travel.experiences.impl.ui.screen.options_v2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.OptionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import rtl.y;
import rxe.b;
import ryd.i;
import s2g.d;
import s2g.f;
import s2g.g;
import s2g.n;
import s2g.p;
import te0.w;
import vc.s;
import yp0.v;
import z0g.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/TravelExperiencesOptionsV2Screen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ls2g/p;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/TravelExperiencesOptionsV2ScreenContract$InputData;", "Ls2g/n;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesOptionsV2Screen extends BaseRecyclerViewScreen<p, TravelExperiencesOptionsV2ScreenContract$InputData, n> {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(TravelExperiencesOptionsV2Screen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesPaymentOptionsV2Binding;", 0))};
    public v U;
    public final RowDelegate V;
    public final PlainTextDelegate W;
    public final CellDetailsPriceDelegate X;
    public final LargeActionButtonDelegate Y;
    public final ActionsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f93087a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellDetailsRevPointsDelegate f93088b0;
    public final h c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f93089d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f93090e0;
    public final List f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f93091h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesOptionsV2Screen(TravelExperiencesOptionsV2ScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.V = rowDelegate;
        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        ListSubheaderLoadingDelegate listSubheaderLoadingDelegate = new ListSubheaderLoadingDelegate();
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.W = plainTextDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        CellDetailsPriceDelegate cellDetailsPriceDelegate = new CellDetailsPriceDelegate();
        this.X = cellDetailsPriceDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Y = largeActionButtonDelegate;
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.Z = new ActionsDelegate();
        CellDetailsBadgeDelegate cellDetailsBadgeDelegate = new CellDetailsBadgeDelegate();
        OptionCardLoadingDelegate optionCardLoadingDelegate = new OptionCardLoadingDelegate();
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f93087a0 = fullScreenStateDelegate;
        CellDetailsRevPointsDelegate cellDetailsRevPointsDelegate = new CellDetailsRevPointsDelegate();
        this.f93088b0 = cellDetailsRevPointsDelegate;
        this.c0 = s.t(this, d.f);
        this.f93089d0 = R$layout.screen_experiences_payment_options_v2;
        this.f93090e0 = R$id.experiencesPaymentOptionsV2_recyclerView;
        this.f0 = zhm.v.k(rowDelegate, rowLoadingDelegate, listSubheaderDelegate, listSubheaderLoadingDelegate, plainTextDelegate, cellDetailsDelegate, cellDetailsPriceDelegate, cellDetailsActionDelegate, largeActionButtonDelegate, cellDetailsBadgeDelegate, optionCardLoadingDelegate, fullScreenStateDelegate, cellDetailsRevPointsDelegate, new CellDetailsListDelegate());
        this.g0 = w.y0(new b(this, inputData, 15));
        this.f93091h0 = w.y0(new y(this, 17));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        p uiState = (p) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f293716b.setFilters(uiState.f259320b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (k) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        this.U = yp0.y.a(h(), 2, true, new i(this, 12));
        Continuation continuation = null;
        a.g2(this, e.b(g3().f293716b.f59410q), null, new s1k.b(this, continuation, 1), 3);
        a.g2(this, e.b(g3().f293716b.s0()), null, new s2g.e(this, null), 3);
        a.g2(this, e.b(this.W.f.f121375b), null, new f(this, null), 3);
        a.g2(this, e.b(this.X.f51887c), null, new g(this, continuation, 0), 3);
        a.g2(this, e.b(this.f93087a0.f52371h.f121375b), null, new s2g.h(this, null), 3);
        a.g2(this, e.b(this.Y.d.f121375b), null, new s2g.i(this, null), 3);
        a.g2(this, e.b(this.Z.f51611c.f121375b), null, new g(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f293716b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.experiences_options_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_options_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        ((j60.a) ((k) this.g0.getValue()).d.get()).d(zhm.v.k(this.Z, this.Y, this.V, this.X, this.f93088b0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        RecyclerView recyclerViewH = h();
        v vVar = this.U;
        if (vVar == null) {
            Intrinsics.r("scrollListener");
            throw null;
        }
        recyclerViewH.removeOnScrollListener(vVar);
        super.Y2();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        p uiState = (p) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f293716b.setFilters(uiState.f259320b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getF93090e0() {
        return this.f93090e0;
    }

    public final w0g.k g3() {
        ViewBinding value = this.c0.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.k) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.f93089d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final s2g.o T2() {
        return (s2g.o) this.f93091h0.getValue();
    }
}
