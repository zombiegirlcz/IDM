package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import boh.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.TravelHotelsHomeFavoritesScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mcg.h;
import mcg.i;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/favorites/TravelHotelsHomeFavoritesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/favorites/a;", "Ldli/a;", "Lmcg/i;", "<init>", "()V", "Companion", "a", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsHomeFavoritesScreen extends ViewController<a> implements dli.a {
    public final int K = R$layout.screen_recycler_view;
    public final int L = R$style.TransparentNavigationBarMarkerTheme;
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final VoucherSmallTileDelegate N = new VoucherSmallTileDelegate();
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelHotelsHomeFavoritesScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: mcg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeFavoritesScreen f204349b;

            {
                this.f204349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsHomeFavoritesScreen travelHotelsHomeFavoritesScreen = this.f204349b;
                switch (i2) {
                    case 0:
                        TravelHotelsHomeFavoritesScreen travelHotelsHomeFavoritesScreen2 = this.f204349b;
                        return dli.f.a(travelHotelsHomeFavoritesScreen2, (h) travelHotelsHomeFavoritesScreen2.Q.getValue(), v.k(travelHotelsHomeFavoritesScreen2.M, new VoucherSmallLoadingDelegate(), travelHotelsHomeFavoritesScreen2.N, new TextDelegate()), 0, new m98.k(travelHotelsHomeFavoritesScreen2, 13), null, null, 52);
                    case 1:
                        qji.b bVarU2 = travelHotelsHomeFavoritesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.di.TravelHomeFavoritesScreenInjector");
                        g9g.v vVar = (g9g.v) bVarU2;
                        return new g9g.a(vVar.f141832b, vVar.f141833c, travelHotelsHomeFavoritesScreen);
                    default:
                        return (h) ((g9g.a) travelHotelsHomeFavoritesScreen.P.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: mcg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeFavoritesScreen f204349b;

            {
                this.f204349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsHomeFavoritesScreen travelHotelsHomeFavoritesScreen = this.f204349b;
                switch (i22) {
                    case 0:
                        TravelHotelsHomeFavoritesScreen travelHotelsHomeFavoritesScreen2 = this.f204349b;
                        return dli.f.a(travelHotelsHomeFavoritesScreen2, (h) travelHotelsHomeFavoritesScreen2.Q.getValue(), v.k(travelHotelsHomeFavoritesScreen2.M, new VoucherSmallLoadingDelegate(), travelHotelsHomeFavoritesScreen2.N, new TextDelegate()), 0, new m98.k(travelHotelsHomeFavoritesScreen2, 13), null, null, 52);
                    case 1:
                        qji.b bVarU2 = travelHotelsHomeFavoritesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.di.TravelHomeFavoritesScreenInjector");
                        g9g.v vVar = (g9g.v) bVarU2;
                        return new g9g.a(vVar.f141832b, vVar.f141833c, travelHotelsHomeFavoritesScreen);
                    default:
                        return (h) ((g9g.a) travelHotelsHomeFavoritesScreen.P.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: mcg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeFavoritesScreen f204349b;

            {
                this.f204349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsHomeFavoritesScreen travelHotelsHomeFavoritesScreen = this.f204349b;
                switch (i22) {
                    case 0:
                        TravelHotelsHomeFavoritesScreen travelHotelsHomeFavoritesScreen2 = this.f204349b;
                        return dli.f.a(travelHotelsHomeFavoritesScreen2, (h) travelHotelsHomeFavoritesScreen2.Q.getValue(), v.k(travelHotelsHomeFavoritesScreen2.M, new VoucherSmallLoadingDelegate(), travelHotelsHomeFavoritesScreen2.N, new TextDelegate()), 0, new m98.k(travelHotelsHomeFavoritesScreen2, 13), null, null, 52);
                    case 1:
                        qji.b bVarU2 = travelHotelsHomeFavoritesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.di.TravelHomeFavoritesScreenInjector");
                        g9g.v vVar = (g9g.v) bVarU2;
                        return new g9g.a(vVar.f141832b, vVar.f141833c, travelHotelsHomeFavoritesScreen);
                    default:
                        return (h) ((g9g.a) travelHotelsHomeFavoritesScreen.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        RecyclerView recyclerViewH = k().h();
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(f.p(context), recyclerViewH);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g9g.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = k().h().getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 8.0f);
        int iK2 = kli.a.k(context, 8.0f);
        int iK3 = kli.a.k(context, 16.0f);
        int iK4 = kli.a.k(context, 16.0f);
        k().h().addItemDecoration(new tw0.b(iK2, iK, 12));
        k().h().setPaddingRelative(iK3, iK4, iK3, iK4);
        RecyclerView.LayoutManager layoutManager = k().h().getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).setSpanSizeLookup(new mcg.b(this));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new mcg.c(this, null), 3);
        VoucherSmallTileDelegate voucherSmallTileDelegate = this.N;
        ViewController.P2(this, rd0.e.b(voucherSmallTileDelegate.f53608c), new mcg.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(voucherSmallTileDelegate.d), new mcg.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final dli.c k() {
        return (dli.c) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }
}
