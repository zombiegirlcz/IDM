package com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.TravelFlightsAirlinesFilterScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import f4g.b0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r4g.b;
import r4g.c;
import r4g.d;
import r4g.f;
import r4g.h;
import r4g.i;
import r4g.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/airlines_filter/TravelFlightsAirlinesFilterScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr4g/h;", "Ldli/a;", "Lr4g/j;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsAirlinesFilterScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TravelFlightsAirlinesFilterScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsAirlinesFilterBinding;", 0))};
    public final TravelFlightsAirlinesFilterScreenContract$InputData K;
    public final int L;
    public final SelectableDelegate M;
    public final SelectableDelegate N;
    public final Object O;
    public final ao.h P;
    public final Object Q;
    public final Object R;

    public TravelFlightsAirlinesFilterScreen(TravelFlightsAirlinesFilterScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_travel_flights_airlines_filter;
        this.M = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.N = new SelectableDelegate(new ListSubheaderDelegate());
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: r4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsAirlinesFilterScreen f251450b;

            {
                this.f251450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsAirlinesFilterScreen travelFlightsAirlinesFilterScreen = this.f251450b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsAirlinesFilterScreen.S;
                        TravelFlightsAirlinesFilterScreen travelFlightsAirlinesFilterScreen2 = this.f251450b;
                        return dli.f.a(travelFlightsAirlinesFilterScreen2, travelFlightsAirlinesFilterScreen2.d(), v.k(travelFlightsAirlinesFilterScreen2.M, travelFlightsAirlinesFilterScreen2.N), R$id.travelFlightsAirlinesFilterScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsAirlinesFilterScreen.S;
                        qji.b bVarU2 = travelFlightsAirlinesFilterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.di.TravelFlightsAirlinesFilterScreenInjector");
                        return (b0) ((s4g.a) ((s4g.b) bVarU2).D().mo3808a(travelFlightsAirlinesFilterScreen)).h0(travelFlightsAirlinesFilterScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsAirlinesFilterScreen.S;
                        b0 b0Var = (b0) travelFlightsAirlinesFilterScreen.Q.getValue();
                        switch (b0Var.f132072a) {
                            case 0:
                                return (i) b0Var.d.get();
                            case 1:
                                return (i) b0Var.d.get();
                            default:
                                return (i) b0Var.d.get();
                        }
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: r4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsAirlinesFilterScreen f251450b;

            {
                this.f251450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsAirlinesFilterScreen travelFlightsAirlinesFilterScreen = this.f251450b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsAirlinesFilterScreen.S;
                        TravelFlightsAirlinesFilterScreen travelFlightsAirlinesFilterScreen2 = this.f251450b;
                        return dli.f.a(travelFlightsAirlinesFilterScreen2, travelFlightsAirlinesFilterScreen2.d(), v.k(travelFlightsAirlinesFilterScreen2.M, travelFlightsAirlinesFilterScreen2.N), R$id.travelFlightsAirlinesFilterScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsAirlinesFilterScreen.S;
                        qji.b bVarU2 = travelFlightsAirlinesFilterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.di.TravelFlightsAirlinesFilterScreenInjector");
                        return (b0) ((s4g.a) ((s4g.b) bVarU2).D().mo3808a(travelFlightsAirlinesFilterScreen)).h0(travelFlightsAirlinesFilterScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsAirlinesFilterScreen.S;
                        b0 b0Var = (b0) travelFlightsAirlinesFilterScreen.Q.getValue();
                        switch (b0Var.f132072a) {
                            case 0:
                                return (i) b0Var.d.get();
                            case 1:
                                return (i) b0Var.d.get();
                            default:
                                return (i) b0Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: r4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsAirlinesFilterScreen f251450b;

            {
                this.f251450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsAirlinesFilterScreen travelFlightsAirlinesFilterScreen = this.f251450b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsAirlinesFilterScreen.S;
                        TravelFlightsAirlinesFilterScreen travelFlightsAirlinesFilterScreen2 = this.f251450b;
                        return dli.f.a(travelFlightsAirlinesFilterScreen2, travelFlightsAirlinesFilterScreen2.d(), v.k(travelFlightsAirlinesFilterScreen2.M, travelFlightsAirlinesFilterScreen2.N), R$id.travelFlightsAirlinesFilterScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsAirlinesFilterScreen.S;
                        qji.b bVarU2 = travelFlightsAirlinesFilterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.di.TravelFlightsAirlinesFilterScreenInjector");
                        return (b0) ((s4g.a) ((s4g.b) bVarU2).D().mo3808a(travelFlightsAirlinesFilterScreen)).h0(travelFlightsAirlinesFilterScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsAirlinesFilterScreen.S;
                        b0 b0Var = (b0) travelFlightsAirlinesFilterScreen.Q.getValue();
                        switch (b0Var.f132072a) {
                            case 0:
                                return (i) b0Var.d.get();
                            case 1:
                                return (i) b0Var.d.get();
                            default:
                                return (i) b0Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f21250c;
        TextLocalisedClause textLocalisedClause = uiState.f251457b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        LargeActionButton travelFlightsAirlinesFilterScreenButton = d3().f21249b;
        Intrinsics.checkNotNullExpressionValue(travelFlightsAirlinesFilterScreenButton, "travelFlightsAirlinesFilterScreenButton");
        travelFlightsAirlinesFilterScreenButton.setVisibility(uiState.f251458c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f21250c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.travel_flights_search_button_title, null, null, 14));
        d3().f21249b.setText(new TextLocalisedClause(R$string.travel_flights_common_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f21250c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f21250c.f59409p.f57337m), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f21250c.X0), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.r()), new r4g.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.r()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f21249b.o), new c(this, null, 1), 3);
    }

    public final c4g.b d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
