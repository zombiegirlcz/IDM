package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.TravelMilesFlightSearchFilterOptionScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.TravelMilesFlightSearchFilterOptionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import phg.b;
import phg.c;
import phg.d;
import phg.f;
import phg.i;
import phg.j;
import phg.k;
import rfg.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_results/filter_options/TravelMilesFlightSearchFilterOptionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lphg/i;", "Ldli/a;", "Lphg/k;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesFlightSearchFilterOptionScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TravelMilesFlightSearchFilterOptionScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesFlightSearchFilterOptionBinding;", 0))};
    public final TravelMilesFlightSearchFilterOptionScreenContract$InputData K;
    public final int L;
    public final SelectableDelegate M;
    public final SelectableDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public TravelMilesFlightSearchFilterOptionScreen(TravelMilesFlightSearchFilterOptionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_travel_miles_flight_search_filter_option;
        this.M = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.N = new SelectableDelegate(new ListSubheaderDelegate());
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: phg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchFilterOptionScreen f236300b;

            {
                this.f236300b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesFlightSearchFilterOptionScreen travelMilesFlightSearchFilterOptionScreen = this.f236300b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightSearchFilterOptionScreen.S;
                        TravelMilesFlightSearchFilterOptionScreen travelMilesFlightSearchFilterOptionScreen2 = this.f236300b;
                        return dli.f.a(travelMilesFlightSearchFilterOptionScreen2, travelMilesFlightSearchFilterOptionScreen2.R2(), v.k(travelMilesFlightSearchFilterOptionScreen2.M, travelMilesFlightSearchFilterOptionScreen2.N), R$id.travelMilesFlightSearchFilterOptionScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesFlightSearchFilterOptionScreen.S;
                        qji.b bVarU2 = travelMilesFlightSearchFilterOptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.di.TravelMilesFlightSearchFilterOptionScreenInjector");
                        ufg.n nVar = (ufg.n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        ufg.n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchFilterOptionScreenContract$InputData travelMilesFlightSearchFilterOptionScreenContract$InputData = travelMilesFlightSearchFilterOptionScreen.K;
                        travelMilesFlightSearchFilterOptionScreenContract$InputData.getClass();
                        return new ufg.k(gVar, nVar2, travelMilesFlightSearchFilterOptionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesFlightSearchFilterOptionScreen.S;
                        return (j) ((ufg.k) travelMilesFlightSearchFilterOptionScreen.Q.getValue()).f279755c.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: phg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchFilterOptionScreen f236300b;

            {
                this.f236300b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesFlightSearchFilterOptionScreen travelMilesFlightSearchFilterOptionScreen = this.f236300b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightSearchFilterOptionScreen.S;
                        TravelMilesFlightSearchFilterOptionScreen travelMilesFlightSearchFilterOptionScreen2 = this.f236300b;
                        return dli.f.a(travelMilesFlightSearchFilterOptionScreen2, travelMilesFlightSearchFilterOptionScreen2.R2(), v.k(travelMilesFlightSearchFilterOptionScreen2.M, travelMilesFlightSearchFilterOptionScreen2.N), R$id.travelMilesFlightSearchFilterOptionScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesFlightSearchFilterOptionScreen.S;
                        qji.b bVarU2 = travelMilesFlightSearchFilterOptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.di.TravelMilesFlightSearchFilterOptionScreenInjector");
                        ufg.n nVar = (ufg.n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        ufg.n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchFilterOptionScreenContract$InputData travelMilesFlightSearchFilterOptionScreenContract$InputData = travelMilesFlightSearchFilterOptionScreen.K;
                        travelMilesFlightSearchFilterOptionScreenContract$InputData.getClass();
                        return new ufg.k(gVar, nVar2, travelMilesFlightSearchFilterOptionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesFlightSearchFilterOptionScreen.S;
                        return (j) ((ufg.k) travelMilesFlightSearchFilterOptionScreen.Q.getValue()).f279755c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: phg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchFilterOptionScreen f236300b;

            {
                this.f236300b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelMilesFlightSearchFilterOptionScreen travelMilesFlightSearchFilterOptionScreen = this.f236300b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightSearchFilterOptionScreen.S;
                        TravelMilesFlightSearchFilterOptionScreen travelMilesFlightSearchFilterOptionScreen2 = this.f236300b;
                        return dli.f.a(travelMilesFlightSearchFilterOptionScreen2, travelMilesFlightSearchFilterOptionScreen2.R2(), v.k(travelMilesFlightSearchFilterOptionScreen2.M, travelMilesFlightSearchFilterOptionScreen2.N), R$id.travelMilesFlightSearchFilterOptionScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesFlightSearchFilterOptionScreen.S;
                        qji.b bVarU2 = travelMilesFlightSearchFilterOptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.di.TravelMilesFlightSearchFilterOptionScreenInjector");
                        ufg.n nVar = (ufg.n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        ufg.n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchFilterOptionScreenContract$InputData travelMilesFlightSearchFilterOptionScreenContract$InputData = travelMilesFlightSearchFilterOptionScreen.K;
                        travelMilesFlightSearchFilterOptionScreenContract$InputData.getClass();
                        return new ufg.k(gVar, nVar2, travelMilesFlightSearchFilterOptionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesFlightSearchFilterOptionScreen.S;
                        return (j) ((ufg.k) travelMilesFlightSearchFilterOptionScreen.Q.getValue()).f279755c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f253809c;
        TextLocalisedClause textLocalisedClause = uiState.f236307b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        LargeActionButton travelMilesFlightSearchFilterOptionScreenButton = d3().f253808b;
        Intrinsics.checkNotNullExpressionValue(travelMilesFlightSearchFilterOptionScreenButton, "travelMilesFlightSearchFilterOptionScreenButton");
        travelMilesFlightSearchFilterOptionScreenButton.setVisibility(uiState.f236308c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ufg.k) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f253809c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.miles_search_filters_search_hint, null, null, 14));
        d3().f253808b.setText(new TextLocalisedClause(R$string.miles_search_filters_button_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253809c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253809c.f59409p.f57337m), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253809c.X0), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.r()), null, new phg.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.r()), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253808b.o), null, new c(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
