package com.revolut.feature.travel.flights.impl.ui.screen.passengers_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.v;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lp2.c;
import m6g.d;
import m6g.f;
import m6g.g;
import m6g.k;
import m6g.m;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lm6g/k;", "Ldli/a;", "Lm6g/o;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsPassengersDetailsScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelFlightsPassengersDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsPassengersDetailsBinding;", 0))};
    public final TravelFlightsPassengersDetailsScreenContract$InputData K;
    public final InputTextDelegate L;
    public final ListSubheaderDelegate M;
    public final FullScreenStateDelegate N;
    public final h O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TravelFlightsPassengersDetailsScreen(TravelFlightsPassengersDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new InputTextDelegate(new c(this, 28));
        this.M = new ListSubheaderDelegate();
        this.N = new FullScreenStateDelegate();
        this.O = s.t(this, m6g.c.f);
        this.P = R$layout.screen_travel_flights_passengers_details;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: m6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPassengersDetailsScreen f203089b;

            {
                this.f203089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen = this.f203089b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPassengersDetailsScreen.T;
                        TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen2 = this.f203089b;
                        return dli.f.a(travelFlightsPassengersDetailsScreen2, travelFlightsPassengersDetailsScreen2.d(), zhm.v.k(travelFlightsPassengersDetailsScreen2.L, travelFlightsPassengersDetailsScreen2.M, travelFlightsPassengersDetailsScreen2.N, new RowLoadingDelegate()), R$id.travelFlightsPassengersDetailsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsPassengersDetailsScreen.T;
                        qji.b bVarU2 = travelFlightsPassengersDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.di.TravelFlightsPassengersDetailsScreenInjector");
                        f4g.p pVar = (f4g.p) bVarU2;
                        f4g.b bVar = pVar.f132168b;
                        f4g.p pVar2 = pVar.f132169c;
                        TravelFlightsPassengersDetailsScreenContract$InputData travelFlightsPassengersDetailsScreenContract$InputData = travelFlightsPassengersDetailsScreen.K;
                        travelFlightsPassengersDetailsScreenContract$InputData.getClass();
                        return new f4g.v(bVar, pVar2, travelFlightsPassengersDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsPassengersDetailsScreen.T;
                        return (m) ((f4g.v) travelFlightsPassengersDetailsScreen.R.getValue()).f132206h.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: m6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPassengersDetailsScreen f203089b;

            {
                this.f203089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen = this.f203089b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPassengersDetailsScreen.T;
                        TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen2 = this.f203089b;
                        return dli.f.a(travelFlightsPassengersDetailsScreen2, travelFlightsPassengersDetailsScreen2.d(), zhm.v.k(travelFlightsPassengersDetailsScreen2.L, travelFlightsPassengersDetailsScreen2.M, travelFlightsPassengersDetailsScreen2.N, new RowLoadingDelegate()), R$id.travelFlightsPassengersDetailsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsPassengersDetailsScreen.T;
                        qji.b bVarU2 = travelFlightsPassengersDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.di.TravelFlightsPassengersDetailsScreenInjector");
                        f4g.p pVar = (f4g.p) bVarU2;
                        f4g.b bVar = pVar.f132168b;
                        f4g.p pVar2 = pVar.f132169c;
                        TravelFlightsPassengersDetailsScreenContract$InputData travelFlightsPassengersDetailsScreenContract$InputData = travelFlightsPassengersDetailsScreen.K;
                        travelFlightsPassengersDetailsScreenContract$InputData.getClass();
                        return new f4g.v(bVar, pVar2, travelFlightsPassengersDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsPassengersDetailsScreen.T;
                        return (m) ((f4g.v) travelFlightsPassengersDetailsScreen.R.getValue()).f132206h.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: m6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPassengersDetailsScreen f203089b;

            {
                this.f203089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen = this.f203089b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPassengersDetailsScreen.T;
                        TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen2 = this.f203089b;
                        return dli.f.a(travelFlightsPassengersDetailsScreen2, travelFlightsPassengersDetailsScreen2.d(), zhm.v.k(travelFlightsPassengersDetailsScreen2.L, travelFlightsPassengersDetailsScreen2.M, travelFlightsPassengersDetailsScreen2.N, new RowLoadingDelegate()), R$id.travelFlightsPassengersDetailsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsPassengersDetailsScreen.T;
                        qji.b bVarU2 = travelFlightsPassengersDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.di.TravelFlightsPassengersDetailsScreenInjector");
                        f4g.p pVar = (f4g.p) bVarU2;
                        f4g.b bVar = pVar.f132168b;
                        f4g.p pVar2 = pVar.f132169c;
                        TravelFlightsPassengersDetailsScreenContract$InputData travelFlightsPassengersDetailsScreenContract$InputData = travelFlightsPassengersDetailsScreen.K;
                        travelFlightsPassengersDetailsScreenContract$InputData.getClass();
                        return new f4g.v(bVar, pVar2, travelFlightsPassengersDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsPassengersDetailsScreen.T;
                        return (m) ((f4g.v) travelFlightsPassengersDetailsScreen.R.getValue()).f132206h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m6g.o uiState = (m6g.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f21277b.setEnabled(uiState.f203104b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar travelFlightsPassengersDetailsScreenNavBar = d3().f21278c;
        Intrinsics.checkNotNullExpressionValue(travelFlightsPassengersDetailsScreenNavBar, "travelFlightsPassengersDetailsScreenNavBar");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_passenger_details_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.travel_flights_passenger_details_header_subtitle, null, null, 14);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        m6g.a model = new m6g.a(textLocalisedClause, textLocalisedClause2, numValueOf);
        Intrinsics.checkNotNullParameter(travelFlightsPassengersDetailsScreenNavBar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        travelFlightsPassengersDetailsScreenNavBar.setToolbarTitle(textLocalisedClause);
        travelFlightsPassengersDetailsScreenNavBar.setTitle(textLocalisedClause, null);
        travelFlightsPassengersDetailsScreenNavBar.setSecondDescriptionText(textLocalisedClause2);
        travelFlightsPassengersDetailsScreenNavBar.setNavigationButtonIcon(numValueOf);
        travelFlightsPassengersDetailsScreenNavBar.setSecondDescriptionVisible(true);
        d3().f21277b.setText(new TextLocalisedClause(R$string.travel_flights_common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f21278c.f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f21277b.o), new d(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.L;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new m6g.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new g(this, null), 3);
    }

    public final c4g.k d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
