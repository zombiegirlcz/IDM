package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import boh.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dze.n;
import ea4.d;
import ebg.c;
import ebg.g;
import ebg.i;
import ebg.j;
import g9g.r0;
import knm.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/TravelHotelsHomeBookingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lebg/g;", "Ldli/a;", "Lebg/j;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsHomeBookingsScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelHotelsHomeBookingsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenHotelsHomeBookingBinding;", 0))};
    public final CellDetailsChevronDelegate K;
    public final ListingTileDelegate L;
    public final FullScreenStateDelegate M;
    public final int N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;

    public TravelHotelsHomeBookingsScreen() {
        this(0);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.O);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        boolean z = uiState.f124343b;
        ebg.h hVar = qVar instanceof ebg.h ? (ebg.h) qVar : null;
        if (hVar == null || hVar.f124341a) {
            NavBarWithToolbar hotelsHomeBookingsScreenNavBar = d3().f22383b;
            Intrinsics.checkNotNullExpressionValue(hotelsHomeBookingsScreenNavBar, "hotelsHomeBookingsScreenNavBar");
            hotelsHomeBookingsScreenNavBar.setVisibility(z ? 0 : 8);
            if (z) {
                NavBarWithToolbar navBarWithToolbar = d3().f22383b;
                navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.hotels_stays_header_title, null, null, 14), null);
                navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.hotels_stays_header_title, null, null, 14));
                navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
            }
        }
        ScreenContentRecyclerView hotelsHomeBookingsScreenRecyclerView = d3().f22384c;
        Intrinsics.checkNotNullExpressionValue(hotelsHomeBookingsScreenRecyclerView, "hotelsHomeBookingsScreenRecyclerView");
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b.v(f.p(context), hotelsHomeBookingsScreenRecyclerView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52751c), null, new d(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.f51821c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new ebg.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22383b.f59410q), null, new n(this, continuation, 27), 3);
    }

    public final c9g.b d3() {
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c9g.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    public /* synthetic */ TravelHotelsHomeBookingsScreen(int i) {
        this(new TravelHotelsHomeBookingsScreenContract$InputData(false));
    }

    public TravelHotelsHomeBookingsScreen(TravelHotelsHomeBookingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new CellDetailsChevronDelegate();
        this.L = new ListingTileDelegate();
        this.M = new FullScreenStateDelegate();
        this.N = R$layout.screen_hotels_home_booking;
        this.O = R$style.TransparentNavigationBarMarkerTheme;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ebg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeBookingsScreen f124335b;

            {
                this.f124335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsHomeBookingsScreen.T;
                        TravelHotelsHomeBookingsScreen travelHotelsHomeBookingsScreen = this.f124335b;
                        return dli.f.a(travelHotelsHomeBookingsScreen, travelHotelsHomeBookingsScreen.R2(), v.k(travelHotelsHomeBookingsScreen.K, travelHotelsHomeBookingsScreen.L, travelHotelsHomeBookingsScreen.M, new ListingTileLoadingDelegate(), new TextDelegate()), R$id.hotelsHomeBookingsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsHomeBookingsScreen.T;
                        r0 r0Var = (r0) this.f124335b.Q.getValue();
                        switch (r0Var.f141803a) {
                            case 0:
                                return (i) r0Var.e.get();
                            default:
                                return (i) r0Var.e.get();
                        }
                }
            }
        });
        this.Q = w.y0(new e58.d(this, inputData, 10));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ebg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeBookingsScreen f124335b;

            {
                this.f124335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsHomeBookingsScreen.T;
                        TravelHotelsHomeBookingsScreen travelHotelsHomeBookingsScreen = this.f124335b;
                        return dli.f.a(travelHotelsHomeBookingsScreen, travelHotelsHomeBookingsScreen.R2(), v.k(travelHotelsHomeBookingsScreen.K, travelHotelsHomeBookingsScreen.L, travelHotelsHomeBookingsScreen.M, new ListingTileLoadingDelegate(), new TextDelegate()), R$id.hotelsHomeBookingsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsHomeBookingsScreen.T;
                        r0 r0Var = (r0) this.f124335b.Q.getValue();
                        switch (r0Var.f141803a) {
                            case 0:
                                return (i) r0Var.e.get();
                            default:
                                return (i) r0Var.e.get();
                        }
                }
            }
        });
        this.S = s.t(this, ebg.b.f);
    }
}
