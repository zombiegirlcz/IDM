package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets;

import a15.d;
import ad4.c;
import agh.b;
import ahd.c0;
import ahd.f;
import ahd.i;
import ahd.j;
import ahd.k;
import ahd.l;
import ahd.p;
import aii.q;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tw0.b0;
import tw0.n;
import vc.s;
import vkm.j2;
import xki.e;
import yp0.y;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/watchlist_assets/WatchlistAssetsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lahd/p;", "Ltw0/b0;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WatchlistAssetsScreen extends ViewController<q> implements a, b0 {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(WatchlistAssetsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};
    public final Object K;
    public final Object L;
    public final int M;
    public final h N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final ListSubheaderDelegate Q;
    public final SwipeToActionDelegate R;
    public final ItemTouchHelper S;
    public final Object T;

    public WatchlistAssetsScreen(WatchlistAssetsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new b(this, inputData, 2));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ahd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistAssetsScreen f4946b;

            {
                this.f4946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = WatchlistAssetsScreen.U;
                        return (l) ((vgd.f) ((bhd.a) this.f4946b.K.getValue())).f288858m.get();
                    default:
                        KProperty[] kPropertyArr2 = WatchlistAssetsScreen.U;
                        WatchlistAssetsScreen watchlistAssetsScreen = this.f4946b;
                        return dli.f.a(watchlistAssetsScreen, watchlistAssetsScreen.R2(), zhm.v.k(new RowLoadingDelegate(), watchlistAssetsScreen.P, watchlistAssetsScreen.O, watchlistAssetsScreen.R, watchlistAssetsScreen.Q), 0, null, null, null, 60);
                }
            }
        });
        this.M = R$layout.screen_recycler_view;
        this.N = s.t(this, f.f);
        this.O = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new ListSubheaderDelegate();
        this.R = new SwipeToActionDelegate(rowDelegate, false);
        this.S = new ItemTouchHelper(new n(this));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: ahd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistAssetsScreen f4946b;

            {
                this.f4946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WatchlistAssetsScreen.U;
                        return (l) ((vgd.f) ((bhd.a) this.f4946b.K.getValue())).f288858m.get();
                    default:
                        KProperty[] kPropertyArr2 = WatchlistAssetsScreen.U;
                        WatchlistAssetsScreen watchlistAssetsScreen = this.f4946b;
                        return dli.f.a(watchlistAssetsScreen, watchlistAssetsScreen.R2(), zhm.v.k(new RowLoadingDelegate(), watchlistAssetsScreen.P, watchlistAssetsScreen.O, watchlistAssetsScreen.R, watchlistAssetsScreen.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        String str = uiState.f4954b;
        ahd.o oVar2 = qVar instanceof ahd.o ? (ahd.o) qVar : null;
        if (oVar2 == null || !oVar2.f4952a || str == null) {
            return;
        }
        ScreenContentRecyclerView recyclerView = d3().f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        koi.b bVarF = y.f(recyclerView, str);
        if (bVarF != null) {
            this.S.startDrag(bVarF);
        }
    }

    @Override // tw0.b0
    public final void I1() {
        List list;
        c0 c0Var = (c0) R2();
        c0Var.H2(c0Var.f4943w, new agh.h(9));
        if (!c0Var.v || (list = (List) ((ahd.n) ((j2) c0Var.f4943w.f22677a).getValue()).f4950b.getContent()) == null) {
            return;
        }
        c0Var.n2(new c(c0Var, list, null, 10), new whi.b(6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bhd.a) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.S.attachToRecyclerView(d3().f236787b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new ahd.h(this, null), 3);
        RowDelegate rowDelegate = this.P;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new i(this, null), 3);
        ViewController.P2(this, new d(rd0.e.b(rowDelegate.f53227t), 25), new af4.e(this, null, 9), 3);
        ViewController.P2(this, rd0.e.b(this.R.f), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52707c), new k(this, null), 3);
    }

    public final pji.a d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (pji.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // tw0.b0
    public final void m1(int i, int i2) {
        c0 c0Var = (c0) R2();
        List list = (List) ((ahd.n) ((j2) c0Var.f4943w.f22677a).getValue()).f4950b.getContent();
        if (list != null) {
            int i3 = i - 2;
            int i5 = i2 - 2;
            if (i3 >= 0) {
                List list2 = list;
                if (i3 >= list2.size() || i5 < 0 || i5 >= list2.size()) {
                    return;
                }
                ArrayList arrayListF1 = d0.f1(list2);
                arrayListF1.add(i5, (WatchlistItem) arrayListF1.remove(i3));
                c0Var.H2(c0Var.f4943w, new a83.c0(4, arrayListF1));
                c0Var.v = true;
            }
        }
    }
}
