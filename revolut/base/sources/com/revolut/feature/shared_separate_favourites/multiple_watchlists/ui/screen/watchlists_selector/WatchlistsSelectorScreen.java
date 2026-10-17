package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c65.i;
import chd.d;
import chd.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fw0.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l3d.r;
import lw0.j;
import te0.w;
import tki.c;
import vc.s;
import vgd.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/watchlists_selector/WatchlistsSelectorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lchd/h;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WatchlistsSelectorScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(WatchlistsSelectorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final h K;
    public final InputChecklistDelegate L;
    public final FullScreenStateDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public WatchlistsSelectorScreen(WatchlistsSelectorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, d.f);
        this.L = new InputChecklistDelegate();
        this.M = new FullScreenStateDelegate();
        this.N = w.y0(new cf6.a(this, inputData, 5));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: chd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistsSelectorScreen f24197b;

            {
                this.f24197b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = WatchlistsSelectorScreen.Q;
                        vgd.g gVar = (vgd.g) this.f24197b.N.getValue();
                        WatchlistsSelectorScreenContract$InputData watchlistsSelectorScreenContract$InputData = gVar.f288859a;
                        r rVarA = gVar.f288860b.f288841a.a();
                        s.j(rVarA);
                        return new com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a(watchlistsSelectorScreenContract$InputData, rVarA, new i());
                    default:
                        KProperty[] kPropertyArr2 = WatchlistsSelectorScreen.Q;
                        int i2 = R$id.navBarBottomSheet_RecyclerView;
                        WatchlistsSelectorScreen watchlistsSelectorScreen = this.f24197b;
                        return tki.g.a(watchlistsSelectorScreen, watchlistsSelectorScreen.d(), v.k(watchlistsSelectorScreen.L, new RowLoadingDelegate(), watchlistsSelectorScreen.M), i2, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: chd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistsSelectorScreen f24197b;

            {
                this.f24197b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WatchlistsSelectorScreen.Q;
                        vgd.g gVar = (vgd.g) this.f24197b.N.getValue();
                        WatchlistsSelectorScreenContract$InputData watchlistsSelectorScreenContract$InputData = gVar.f288859a;
                        r rVarA = gVar.f288860b.f288841a.a();
                        s.j(rVarA);
                        return new com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a(watchlistsSelectorScreenContract$InputData, rVarA, new i());
                    default:
                        KProperty[] kPropertyArr2 = WatchlistsSelectorScreen.Q;
                        int i22 = R$id.navBarBottomSheet_RecyclerView;
                        WatchlistsSelectorScreen watchlistsSelectorScreen = this.f24197b;
                        return tki.g.a(watchlistsSelectorScreen, watchlistsSelectorScreen.d(), v.k(watchlistsSelectorScreen.L, new RowLoadingDelegate(), watchlistsSelectorScreen.M), i22, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((chd.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.watchlists_asset_details_add_to_watchlist, null, null, 14), null, null, new j("add-new", new b(new TextLocalisedClause(R$string.watchlists_asset_details_new, null, null, 14))), false, 22));
        d3().f174545b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174546c.E), new cbh.g(this, continuation, 18), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52518c), new chd.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new i(this, continuation, 15), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new f(this, null), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final a d() {
        return (a) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getK() {
        return R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
