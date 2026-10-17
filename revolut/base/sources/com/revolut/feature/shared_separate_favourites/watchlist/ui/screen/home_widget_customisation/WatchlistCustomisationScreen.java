package com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation;

import an9.g;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.api.watchlist.home_widget_customisation.WatchlistWidgetCustomisationScreen$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.WatchlistCustomisationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import i5b.d;
import igh.k;
import ihd.c;
import ihd.e;
import ihd.q;
import ihd.u;
import ihd.v;
import ihm.f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tw0.b0;
import tw0.n;
import vc.s;
import yhm.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/home_widget_customisation/WatchlistCustomisationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lihd/u;", "Lcom/revolut/feature/shared_separate_favourites/api/watchlist/home_widget_customisation/WatchlistWidgetCustomisationScreen$InputData;", "Lqfd/b;", "Ltw0/b0;", "", "Companion", "a", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WatchlistCustomisationScreen extends BaseRecyclerViewScreen<u, WatchlistWidgetCustomisationScreen$InputData, qfd.b> implements b0 {
    public final ItemTouchHelper U;
    public final DraggableDelegate V;
    public final FullScreenStateDelegate W;
    public final h X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86960a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Lazy f86961b0;
    public final Lazy c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86959d0 = {o0.f186429a.j(new h0(WatchlistCustomisationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.WatchlistCustomisationScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistCustomisationScreen(WatchlistWidgetCustomisationScreen$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new n(this));
        this.U = itemTouchHelper;
        this.V = new DraggableDelegate(new RowDelegate(null, null, 7), itemTouchHelper);
        this.W = new FullScreenStateDelegate();
        this.X = s.t(this, e.f);
        this.Y = R$layout.screen_recycler_navbar_nextbutton;
        this.Z = R$id.recyclerView;
        final int i = 0;
        this.f86960a0 = w.y0(new Function0(this) { // from class: ihd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistCustomisationScreen f161374b;

            {
                this.f161374b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WatchlistCustomisationScreen watchlistCustomisationScreen = this.f161374b;
                switch (i2) {
                    case 0:
                        WatchlistCustomisationScreen.Companion companion = WatchlistCustomisationScreen.INSTANCE;
                        return zhm.v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new TextDelegate(), watchlistCustomisationScreen.V, watchlistCustomisationScreen.W);
                    default:
                        WatchlistCustomisationScreen.Companion companion2 = WatchlistCustomisationScreen.INSTANCE;
                        return (q) ((vfd.h) watchlistCustomisationScreen.f86961b0.getValue()).f288605c.get();
                }
            }
        });
        this.f86961b0 = j.b(new i1d.b(this, inputData, 20));
        final int i2 = 1;
        this.c0 = j.b(new Function0(this) { // from class: ihd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistCustomisationScreen f161374b;

            {
                this.f161374b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WatchlistCustomisationScreen watchlistCustomisationScreen = this.f161374b;
                switch (i22) {
                    case 0:
                        WatchlistCustomisationScreen.Companion companion = WatchlistCustomisationScreen.INSTANCE;
                        return zhm.v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new TextDelegate(), watchlistCustomisationScreen.V, watchlistCustomisationScreen.W);
                    default:
                        WatchlistCustomisationScreen.Companion companion2 = WatchlistCustomisationScreen.INSTANCE;
                        return (q) ((vfd.h) watchlistCustomisationScreen.f86961b0.getValue()).f288605c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (vfd.h) this.f86961b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        f fVar = h3().f174565c.f59409p.f57337m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.revolut.kompot.navigable.a.g2(this, new exe.j(new d(rd0.e.b(w.y(fVar, 400L)), 19), 23), null, new hp4.e(2, T2(), q.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/home_widget_customisation/WatchlistCustomisationScreenContract$UIEvent;)V", 4, 15), 3);
        r map = h3().f174565c.v0().map(new c(0, new k(9)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new hp4.e(i2, T2(), q.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/home_widget_customisation/WatchlistCustomisationScreenContract$UIEvent;)V", i, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(h3().f174565c.f59410q), 20), null, new hp4.e(i2, T2(), q.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/home_widget_customisation/WatchlistCustomisationScreenContract$UIEvent;)V", i, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(h3().f174565c.o.f57403b), 21), null, new hp4.e(i2, T2(), q.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/home_widget_customisation/WatchlistCustomisationScreenContract$UIEvent;)V", i, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(h3().f174565c.f59409p.f57336l), 22), null, new a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(h3().f174564b.o), 23), null, new hp4.e(i2, T2(), q.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/home_widget_customisation/WatchlistCustomisationScreenContract$UIEvent;)V", i, 12), 3);
        DraggableDelegate draggableDelegate = this.V;
        int i3 = 4;
        int i5 = 2;
        com.revolut.kompot.navigable.a.g2(this, new exe.j(new g(vkm.q.J(rd0.e.b(draggableDelegate.f), rd0.e.b(draggableDelegate.e)), 16), 24), null, new hp4.e(i5, T2(), q.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/home_widget_customisation/WatchlistCustomisationScreenContract$UIEvent;)V", i3, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(this.W.f52371h.f121375b), 24), null, new hp4.e(i5, T2(), q.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/home_widget_customisation/WatchlistCustomisationScreenContract$UIEvent;)V", i3, 14), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.shared_watchlist_widget_customisation_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.shared_watchlist_widget_customisation_screen_title, null, null, 14), null);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.shared_watchlist_widget_customisation_search_hint, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        this.U.attachToRecyclerView(h3().d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.f86960a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(u uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = h3().f174564b;
        boolean z = uiState.f161393c;
        boolean z3 = uiState.d;
        largeActionButton.setVisibility(z ? 0 : 8);
        h3().f174564b.setText(uiState.f161392b);
        h3().f174565c.setMenuItems(uiState.e);
        h3().f174565c.setSearchButtonActive(z3);
        if (z3) {
            return;
        }
        h3().f174565c.m0(j4.FADE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Y;
    }

    public final jii.u h3() {
        ViewBinding value = this.X.getValue(this, f86959d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final q T2() {
        return (q) this.c0.getValue();
    }

    @Override // tw0.b0
    public final void m1(int i, int i2) {
        ((v) T2()).y2(new ihd.s(i, i2));
    }
}
