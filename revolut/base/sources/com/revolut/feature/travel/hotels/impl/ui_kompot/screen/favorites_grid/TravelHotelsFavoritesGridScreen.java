package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rcg.d;
import rcg.f;
import rcg.k;
import rcg.l;
import rcg.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/favorites_grid/TravelHotelsFavoritesGridScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrcg/k;", "Ldli/a;", "Lrcg/m;", "Companion", "a", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsFavoritesGridScreen extends ViewController<k> implements dli.a {
    public final h K;
    public final VoucherSmallTileDelegate L;
    public final FullScreenStateDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelHotelsFavoritesGridScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public TravelHotelsFavoritesGridScreen(TravelHotelsFavoritesGridScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, rcg.b.f);
        this.L = new VoucherSmallTileDelegate();
        this.M = new FullScreenStateDelegate();
        this.N = R$layout.screen_recycler_navbar;
        this.O = w.y0(new qvf.a(this, inputData, 25));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: rcg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFavoritesGridScreen f253253b;

            {
                this.f253253b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsFavoritesGridScreen.R;
                        return (l) ((g9g.p) this.f253253b.O.getValue()).f141774g.get();
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsFavoritesGridScreen.R;
                        TravelHotelsFavoritesGridScreen travelHotelsFavoritesGridScreen = this.f253253b;
                        return dli.f.a(travelHotelsFavoritesGridScreen, travelHotelsFavoritesGridScreen.k3(), v.k(travelHotelsFavoritesGridScreen.L, travelHotelsFavoritesGridScreen.M), 0, new rbj.g(5), null, null, 52);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rcg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFavoritesGridScreen f253253b;

            {
                this.f253253b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsFavoritesGridScreen.R;
                        return (l) ((g9g.p) this.f253253b.O.getValue()).f141774g.get();
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsFavoritesGridScreen.R;
                        TravelHotelsFavoritesGridScreen travelHotelsFavoritesGridScreen = this.f253253b;
                        return dli.f.a(travelHotelsFavoritesGridScreen, travelHotelsFavoritesGridScreen.k3(), v.k(travelHotelsFavoritesGridScreen.L, travelHotelsFavoritesGridScreen.M), 0, new rbj.g(5), null, null, 52);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        rcg.h hVar = uiState.f253261b;
        Clause clause = hVar.f253256a;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
        Clause clause2 = hVar.f253257b;
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        RecyclerView recyclerViewH = ((dli.c) this.Q.getValue()).h();
        Context context = recyclerViewH.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 16.0f);
        recyclerViewH.setPadding(iK, iK, iK, iK);
        Context context2 = recyclerViewH.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, 8.0f);
        recyclerViewH.addItemDecoration(new tw0.b(iK2, iK2, 12));
        RecyclerView.LayoutManager layoutManager = recyclerViewH.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).setSpanSizeLookup(new f(this));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new r0e.c(this, null, 19), 3);
        VoucherSmallTileDelegate voucherSmallTileDelegate = this.L;
        ViewController.P2(this, rd0.e.b(voucherSmallTileDelegate.f53608c), new rcg.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(voucherSmallTileDelegate.d), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new rcg.e(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l k3() {
        return (l) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
