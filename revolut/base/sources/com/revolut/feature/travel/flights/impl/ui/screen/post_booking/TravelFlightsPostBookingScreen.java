package com.revolut.feature.travel.flights.impl.ui.screen.post_booking;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c4g.n;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.post_booking.TravelFlightsPostBookingScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.post_booking.TravelFlightsPostBookingScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import f4g.p;
import f4g.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sef.j;
import t05.m;
import t6g.f;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lt6g/f;", "Lali/g;", "Lt6g/h;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsPostBookingScreen extends ViewController<f> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelFlightsPostBookingScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsPostBookingBinding;", 0))};
    public final TravelFlightsPostBookingScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TravelFlightsPostBookingScreen(TravelFlightsPostBookingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_travel_flights_post_booking;
        this.M = s.t(this, t6g.c.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: t6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPostBookingScreen f268346b;

            {
                this.f268346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsPostBookingScreen travelFlightsPostBookingScreen = this.f268346b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPostBookingScreen.Q;
                        qji.b bVarU2 = travelFlightsPostBookingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.post_booking.di.TravelFlightsPostBookingScreenInjector");
                        p pVar = (p) bVarU2;
                        f4g.b bVar = pVar.f132168b;
                        p pVar2 = pVar.f132169c;
                        TravelFlightsPostBookingScreenContract$InputData travelFlightsPostBookingScreenContract$InputData = travelFlightsPostBookingScreen.K;
                        travelFlightsPostBookingScreenContract$InputData.getClass();
                        return new x(bVar, pVar2, travelFlightsPostBookingScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsPostBookingScreen.Q;
                        return (g) ((x) travelFlightsPostBookingScreen.N.getValue()).f132215b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsPostBookingScreen.Q;
                        return mif.a.a(travelFlightsPostBookingScreen, 0, R$id.travelFlightsPostBookingScreen_pager, (g) travelFlightsPostBookingScreen.O.getValue(), 5);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: t6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPostBookingScreen f268346b;

            {
                this.f268346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsPostBookingScreen travelFlightsPostBookingScreen = this.f268346b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPostBookingScreen.Q;
                        qji.b bVarU2 = travelFlightsPostBookingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.post_booking.di.TravelFlightsPostBookingScreenInjector");
                        p pVar = (p) bVarU2;
                        f4g.b bVar = pVar.f132168b;
                        p pVar2 = pVar.f132169c;
                        TravelFlightsPostBookingScreenContract$InputData travelFlightsPostBookingScreenContract$InputData = travelFlightsPostBookingScreen.K;
                        travelFlightsPostBookingScreenContract$InputData.getClass();
                        return new x(bVar, pVar2, travelFlightsPostBookingScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsPostBookingScreen.Q;
                        return (g) ((x) travelFlightsPostBookingScreen.N.getValue()).f132215b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsPostBookingScreen.Q;
                        return mif.a.a(travelFlightsPostBookingScreen, 0, R$id.travelFlightsPostBookingScreen_pager, (g) travelFlightsPostBookingScreen.O.getValue(), 5);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: t6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPostBookingScreen f268346b;

            {
                this.f268346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsPostBookingScreen travelFlightsPostBookingScreen = this.f268346b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPostBookingScreen.Q;
                        qji.b bVarU2 = travelFlightsPostBookingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.post_booking.di.TravelFlightsPostBookingScreenInjector");
                        p pVar = (p) bVarU2;
                        f4g.b bVar = pVar.f132168b;
                        p pVar2 = pVar.f132169c;
                        TravelFlightsPostBookingScreenContract$InputData travelFlightsPostBookingScreenContract$InputData = travelFlightsPostBookingScreen.K;
                        travelFlightsPostBookingScreenContract$InputData.getClass();
                        return new x(bVar, pVar2, travelFlightsPostBookingScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsPostBookingScreen.Q;
                        return (g) ((x) travelFlightsPostBookingScreen.N.getValue()).f132215b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsPostBookingScreen.Q;
                        return mif.a.a(travelFlightsPostBookingScreen, 0, R$id.travelFlightsPostBookingScreen_pager, (g) travelFlightsPostBookingScreen.O.getValue(), 5);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t6g.h uiState = (t6g.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Tabs travelFlightsPostBookingScreenTabs = d3().f21286c;
        Intrinsics.checkNotNullExpressionValue(travelFlightsPostBookingScreenTabs, "travelFlightsPostBookingScreenTabs");
        travelFlightsPostBookingScreenTabs.setVisibility(uiState.f268352c ? 0 : 8);
        d3().f21286c.setItems(uiState.f268350a, uiState.f268351b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        TravelFlightsPostBookingScreenContract$Tab pagerItem2 = (TravelFlightsPostBookingScreenContract$Tab) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        t6g.g gVar = (t6g.g) this.O.getValue();
        String tabId = pagerItem2.getF94249a();
        b bVar = (b) gVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        bVar.f93394q = null;
        bVar.H2(bVar.f93395r, new j(tabId, 25));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (x) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (t6g.g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar travelFlightsPostBookingScreenNavBar = d3().f21285b;
        Intrinsics.checkNotNullExpressionValue(travelFlightsPostBookingScreenNavBar, "travelFlightsPostBookingScreenNavBar");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_booking_details_title, null, null, 14);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        t6g.a model = new t6g.a(textLocalisedClause, numValueOf);
        Intrinsics.checkNotNullParameter(travelFlightsPostBookingScreenNavBar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        travelFlightsPostBookingScreenNavBar.setToolbarTitle(textLocalisedClause);
        travelFlightsPostBookingScreenNavBar.setTitle(textLocalisedClause, null);
        travelFlightsPostBookingScreenNavBar.setNavigationButtonIcon(numValueOf);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f21285b.f59410q), new m(this, null, 9), 3);
        ViewController.P2(this, rd0.e.b(d3().f21286c.f58882b), new sy6.j(this, null, 18), 3);
    }

    public final n d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.P.getValue();
    }
}
