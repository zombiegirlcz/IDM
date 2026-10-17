package com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import boh.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotel.transfers.api.R$string;
import com.revolut.feature.travel.hotel.transfers.impl.R$id;
import com.revolut.feature.travel.hotel.transfers.impl.R$layout;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import k22.c;
import k8g.d;
import k8g.g;
import k8g.i;
import k8g.j;
import k8g.l;
import k8g.m;
import k8g.n;
import knm.b;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotel/transfers/impl/ui/screen/home/TravelHotelTransfersHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lk8g/n;", "feature_travel_hotel_transfers_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelTransfersHomeScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TravelHotelTransfersHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotel/transfers/impl/databinding/ScreenTravelHotelTransfersHomeBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final h N;
    public final HeroBannerDelegate O;
    public final LargeActionButtonDelegate P;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final SwipeToActionDelegate S;
    public final CellDetailsChevronDelegate T;
    public final Object U;

    public TravelHotelTransfersHomeScreen() {
        this(0);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        boolean z = uiState.f182146b;
        l lVar = qVar instanceof l ? (l) qVar : null;
        ScreenContentRecyclerView travelHotelTransfersHomeRecyclerView = d3().f132773c;
        Intrinsics.checkNotNullExpressionValue(travelHotelTransfersHomeRecyclerView, "travelHotelTransfersHomeRecyclerView");
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b.v(f.p(context), travelHotelTransfersHomeRecyclerView);
        if (lVar == null || lVar.f182144a) {
            NavBarWithToolbar travelHotelTransfersHomeNavBar = d3().f132772b;
            Intrinsics.checkNotNullExpressionValue(travelHotelTransfersHomeNavBar, "travelHotelTransfersHomeNavBar");
            travelHotelTransfersHomeNavBar.setVisibility(z ? 0 : 8);
            if (z) {
                NavBarWithToolbar navBarWithToolbar = d3().f132772b;
                navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.trade_rev_points_home_header_title, null, null, 14), null);
                navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.trade_rev_points_home_header_title, null, null, 14));
                navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i8g.b) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        HeroBannerDelegate heroBannerDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(heroBannerDelegate.e), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(heroBannerDelegate.d), null, new k8g.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new k8g.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53218h), null, new k8g.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f51821c), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f132772b.f59410q), null, new c(this, null, 13), 3);
    }

    public final f8g.a d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f8g.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }

    public /* synthetic */ TravelHotelTransfersHomeScreen(int i) {
        this(new TravelHotelTransfersHomeScreenContract$InputData(false));
    }

    public TravelHotelTransfersHomeScreen(TravelHotelTransfersHomeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_hotel_transfers_home;
        this.L = w.y0(new k8e.a(this, inputData, 1));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: k8g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelTransfersHomeScreen f182140b;

            {
                this.f182140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelTransfersHomeScreen.V;
                        return (m) ((i8g.b) this.f182140b.L.getValue()).f159530c.get();
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelTransfersHomeScreen.V;
                        TravelHotelTransfersHomeScreen travelHotelTransfersHomeScreen = this.f182140b;
                        return dli.f.a(travelHotelTransfersHomeScreen, travelHotelTransfersHomeScreen.R2(), v.k(travelHotelTransfersHomeScreen.O, travelHotelTransfersHomeScreen.P, travelHotelTransfersHomeScreen.Q, travelHotelTransfersHomeScreen.R, travelHotelTransfersHomeScreen.S, travelHotelTransfersHomeScreen.T), R$id.travelHotelTransfersHome_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, k8g.c.f);
        this.O = new HeroBannerDelegate(0);
        this.P = new LargeActionButtonDelegate();
        this.Q = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        this.T = new CellDetailsChevronDelegate();
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: k8g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelTransfersHomeScreen f182140b;

            {
                this.f182140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelTransfersHomeScreen.V;
                        return (m) ((i8g.b) this.f182140b.L.getValue()).f159530c.get();
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelTransfersHomeScreen.V;
                        TravelHotelTransfersHomeScreen travelHotelTransfersHomeScreen = this.f182140b;
                        return dli.f.a(travelHotelTransfersHomeScreen, travelHotelTransfersHomeScreen.R2(), v.k(travelHotelTransfersHomeScreen.O, travelHotelTransfersHomeScreen.P, travelHotelTransfersHomeScreen.Q, travelHotelTransfersHomeScreen.R, travelHotelTransfersHomeScreen.S, travelHotelTransfersHomeScreen.T), R$id.travelHotelTransfersHome_recyclerView, null, null, null, 56);
                }
            }
        });
    }
}
