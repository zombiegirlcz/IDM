package com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import dte.c;
import efm.r;
import ihm.f;
import java.util.List;
import jki.o;
import kkf.r6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ma1.v;
import mh4.x;
import mhd.b;
import mhd.j0;
import mhd.m;
import mhd.q;
import mhd.t;
import mhd.y;
import rd0.e;
import rfd.d;
import te0.w;
import tw0.b0;
import tw0.n;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lmhd/y;", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreenContract$InputData;", "Lmhd/q;", "Ltw0/b0;", "Ldte/c;", "Lrfd/d;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WatchlistHomeScreen extends BaseRecyclerViewScreen<y, WatchlistHomeScreenContract$InputData, q> implements b0, c, d {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(WatchlistHomeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final boolean U;
    public final int V;
    public final no0.a W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ItemTouchHelper f86968a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final h f86969b0;
    public final RowDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TextDelegate f86970d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ListSubheaderDelegate f86971e0;
    public final AppTipDelegate f0;
    public final FullScreenStateDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final SwipeToActionDelegate f86972h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistHomeScreen(WatchlistHomeScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = !inputData.f86974b;
        this.V = R$layout.screen_recycler_navbar;
        koi.c delegatesManager = new koi.c(0);
        boolean z = this.Q;
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        this.W = new no0.a(delegatesManager, false, z, true);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: mhd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistHomeScreen f205484b;

            {
                this.f205484b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WatchlistHomeScreen watchlistHomeScreen = this.f205484b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WatchlistHomeScreen.i0;
                        return zhm.v.k(new RowLoadingDelegate(), watchlistHomeScreen.f0, watchlistHomeScreen.g0, watchlistHomeScreen.f86971e0, watchlistHomeScreen.c0, watchlistHomeScreen.f86972h0, watchlistHomeScreen.f86970d0);
                    default:
                        KProperty[] kPropertyArr2 = WatchlistHomeScreen.i0;
                        return (r) ((vfd.c) ((nhd.a) watchlistHomeScreen.Y.getValue())).f288590t.get();
                }
            }
        });
        this.Y = w.y0(new b(this, inputData, i));
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: mhd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistHomeScreen f205484b;

            {
                this.f205484b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WatchlistHomeScreen watchlistHomeScreen = this.f205484b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WatchlistHomeScreen.i0;
                        return zhm.v.k(new RowLoadingDelegate(), watchlistHomeScreen.f0, watchlistHomeScreen.g0, watchlistHomeScreen.f86971e0, watchlistHomeScreen.c0, watchlistHomeScreen.f86972h0, watchlistHomeScreen.f86970d0);
                    default:
                        KProperty[] kPropertyArr2 = WatchlistHomeScreen.i0;
                        return (r) ((vfd.c) ((nhd.a) watchlistHomeScreen.Y.getValue())).f288590t.get();
                }
            }
        });
        this.f86968a0 = new ItemTouchHelper(new n(this));
        this.f86969b0 = s.t(this, mhd.d.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.c0 = rowDelegate;
        this.f86970d0 = new TextDelegate();
        this.f86971e0 = new ListSubheaderDelegate();
        this.f0 = new AppTipDelegate();
        this.g0 = new FullScreenStateDelegate();
        this.f86972h0 = new SwipeToActionDelegate(rowDelegate, false);
    }

    @Override // dte.c
    public final f A0() {
        return this.f0.e;
    }

    @Override // tw0.b0
    public final void I1() {
        ((j0) T2()).y2(a.c.f86978a);
    }

    @Override // dte.c
    public final f S0() {
        return this.f0.f51654g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (nhd.a) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        r map = h3().f174539b.f59410q.map(new mhd.c(new x(2), 0));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map), null, new mc9.n(2, T2(), mhd.r.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreenContract$UIEvent;)V", 4, 7), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, new lt.d(e.b(h3().f174539b.f59409p.f57337m), 17), null, new mc9.n(i2, T2(), mhd.r.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreenContract$UIEvent;)V", i, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, new lt.d(e.b(h3().f174539b.v0()), 18), null, new mc9.n(i2, T2(), mhd.r.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreenContract$UIEvent;)V", i, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, new lt.d(e.b(h3().f174539b.f59409p.f57336l), 19), null, new mc9.n(i2, T2(), mhd.r.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreenContract$UIEvent;)V", i, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, new lt.d(e.b(h3().f174539b.z0()), 20), null, new mc9.n(i2, T2(), mhd.r.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreenContract$UIEvent;)V", i, 3), 3);
        RowDelegate rowDelegate = this.c0;
        r map2 = rowDelegate.f53218h.filter(new mhd.c(new x(3), 1)).map(new mhd.c(new x(4), 2));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        int i3 = 4;
        com.revolut.kompot.navigable.a.g2(this, e.b(map2), null, new mc9.n(2, T2(), mhd.r.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreenContract$UIEvent;)V", i3, i), 3);
        r rVarFilter = this.g0.f52371h.f121375b.filter(new v(29, new x(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new m(this, null), 3);
        int i5 = 2;
        com.revolut.kompot.navigable.a.g2(this, new r6(new lt.d(e.b(rowDelegate.f53227t), 22), 24), null, new mc9.n(i5, T2(), mhd.r.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreenContract$UIEvent;)V", i3, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, new lt.d(e.b(this.f86970d0.d), 21), null, new mc9.n(i5, T2(), mhd.r.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreenContract$UIEvent;)V", i3, 6), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174540c.setHasFixedSize(true);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        WatchlistHomeScreenContract$InputData watchlistHomeScreenContract$InputData = (WatchlistHomeScreenContract$InputData) this.G;
        navBarWithToolbar.setVisibility(!watchlistHomeScreenContract$InputData.f86974b ? 0 : 8);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.shared_watchlist_common_search_placeholder, null, null, 14));
        if (watchlistHomeScreenContract$InputData.f86975c) {
            navBarWithToolbar.K0(j4.NO_ANIMATION);
        }
        this.f86968a0.attachToRecyclerView(h3().f174540c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final RecyclerView.LayoutManager a3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new UIKitLinearLayoutManager(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF94799d0() {
        return (List) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final koi.h d3() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(y uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        TextLocalisedClause textLocalisedClause = uiState.f205540b;
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        if (((WatchlistHomeScreenContract$InputData) this.G).f86975c) {
            navBarWithToolbar.E0();
        } else {
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        }
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        boolean z = uiState.f205541c;
        String str = uiState.d;
        navBarWithToolbar.setSearchButtonActive(z);
        navBarWithToolbar.setSortingEnabled(true);
        mhd.x xVar = oVar instanceof mhd.x ? (mhd.x) oVar : null;
        if (xVar == null || !xVar.f205538a || str == null) {
            return;
        }
        ScreenContentRecyclerView recyclerView = h3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        koi.b bVarF = yp0.y.f(recyclerView, str);
        if (bVarF != null) {
            this.f86968a0.startDrag(bVarF);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    public final jii.m h3() {
        ViewBinding value = this.f86969b0.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final mhd.r T2() {
        return (mhd.r) this.Z.getValue();
    }

    @Override // tw0.b0
    public final void m1(int i, int i2) {
        ((j0) T2()).y2(new t(i, i2));
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }

    @Override // dte.c
    public final f v1() {
        return this.f0.d;
    }
}
