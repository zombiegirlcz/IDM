package com.revolut.feature.travel.flights.impl.ui.screen.search_filters;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.p0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import y6g.c;
import y6g.e;
import y6g.f;
import y6g.g;
import y6g.i;
import y6g.j;
import y6g.l;
import y6g.m;
import y6g.n;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_filters/TravelFlightsSearchFiltersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ly6g/l;", "Ldli/a;", "Ly6g/n;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsSearchFiltersScreen extends ViewController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelFlightsSearchFiltersScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsSearchFiltersBinding;", 0))};
    public final TravelFlightsSearchFiltersScreenContract$InputData K;
    public final int L;
    public final SelectableDelegate M;
    public final InputSliderDelegate N;
    public final LargeActionButtonDelegate O;
    public final ActionsDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public TravelFlightsSearchFiltersScreen(TravelFlightsSearchFiltersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_travel_flights_search_filters;
        this.M = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.N = new InputSliderDelegate();
        this.O = new LargeActionButtonDelegate();
        this.P = new ActionsDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: y6g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSearchFiltersScreen f311271b;

            {
                this.f311271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen = this.f311271b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsSearchFiltersScreen.U;
                        TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen2 = this.f311271b;
                        return dli.f.a(travelFlightsSearchFiltersScreen2, travelFlightsSearchFiltersScreen2.d(), v.k(new ListSubheaderDelegate(), travelFlightsSearchFiltersScreen2.P, travelFlightsSearchFiltersScreen2.M, travelFlightsSearchFiltersScreen2.N, travelFlightsSearchFiltersScreen2.O), R$id.travelFlightsSearchFiltersScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsSearchFiltersScreen.U;
                        qji.b bVarU2 = travelFlightsSearchFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.search_filters.di.TravelFlightsSearchFiltersScreenInjector");
                        return (p0) ((z6g.a) ((z6g.b) bVarU2).s().mo3808a(travelFlightsSearchFiltersScreen)).w(travelFlightsSearchFiltersScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsSearchFiltersScreen.U;
                        p0 p0Var = (p0) travelFlightsSearchFiltersScreen.S.getValue();
                        switch (p0Var.f132170a) {
                            case 0:
                                return (m) p0Var.d.get();
                            case 1:
                                return (m) p0Var.d.get();
                            default:
                                return (m) p0Var.d.get();
                        }
                }
            }
        });
        this.R = s.t(this, e.f);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: y6g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSearchFiltersScreen f311271b;

            {
                this.f311271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen = this.f311271b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsSearchFiltersScreen.U;
                        TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen2 = this.f311271b;
                        return dli.f.a(travelFlightsSearchFiltersScreen2, travelFlightsSearchFiltersScreen2.d(), v.k(new ListSubheaderDelegate(), travelFlightsSearchFiltersScreen2.P, travelFlightsSearchFiltersScreen2.M, travelFlightsSearchFiltersScreen2.N, travelFlightsSearchFiltersScreen2.O), R$id.travelFlightsSearchFiltersScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsSearchFiltersScreen.U;
                        qji.b bVarU2 = travelFlightsSearchFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.search_filters.di.TravelFlightsSearchFiltersScreenInjector");
                        return (p0) ((z6g.a) ((z6g.b) bVarU2).s().mo3808a(travelFlightsSearchFiltersScreen)).w(travelFlightsSearchFiltersScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsSearchFiltersScreen.U;
                        p0 p0Var = (p0) travelFlightsSearchFiltersScreen.S.getValue();
                        switch (p0Var.f132170a) {
                            case 0:
                                return (m) p0Var.d.get();
                            case 1:
                                return (m) p0Var.d.get();
                            default:
                                return (m) p0Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: y6g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSearchFiltersScreen f311271b;

            {
                this.f311271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen = this.f311271b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsSearchFiltersScreen.U;
                        TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen2 = this.f311271b;
                        return dli.f.a(travelFlightsSearchFiltersScreen2, travelFlightsSearchFiltersScreen2.d(), v.k(new ListSubheaderDelegate(), travelFlightsSearchFiltersScreen2.P, travelFlightsSearchFiltersScreen2.M, travelFlightsSearchFiltersScreen2.N, travelFlightsSearchFiltersScreen2.O), R$id.travelFlightsSearchFiltersScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsSearchFiltersScreen.U;
                        qji.b bVarU2 = travelFlightsSearchFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.search_filters.di.TravelFlightsSearchFiltersScreenInjector");
                        return (p0) ((z6g.a) ((z6g.b) bVarU2).s().mo3808a(travelFlightsSearchFiltersScreen)).w(travelFlightsSearchFiltersScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsSearchFiltersScreen.U;
                        p0 p0Var = (p0) travelFlightsSearchFiltersScreen.S.getValue();
                        switch (p0Var.f132170a) {
                            case 0:
                                return (m) p0Var.d.get();
                            case 1:
                                return (m) p0Var.d.get();
                            default:
                                return (m) p0Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f21289c.setMenuItems(uiState.f311278b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p0) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar travelFlightsSearchFiltersScreenNavBar = d3().f21289c;
        Intrinsics.checkNotNullExpressionValue(travelFlightsSearchFiltersScreenNavBar, "travelFlightsSearchFiltersScreenNavBar");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_search_filters_header_title, null, null, 14);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        c model = new c(textLocalisedClause, numValueOf);
        Intrinsics.checkNotNullParameter(travelFlightsSearchFiltersScreenNavBar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        travelFlightsSearchFiltersScreenNavBar.setTitle(textLocalisedClause, null);
        travelFlightsSearchFiltersScreenNavBar.setToolbarTitle(textLocalisedClause);
        travelFlightsSearchFiltersScreenNavBar.setNavigationButtonIcon(numValueOf);
        d3().f21288b.setText(new TextLocalisedClause(R$string.travel_flights_search_filters_show_flights_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f21289c.f59410q), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f21289c.o.f57403b), new g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.r()), new y6g.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51611c.f121375b), new g(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52559c), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f21288b.o), new f(this, null, 1), 3);
    }

    public final c4g.o d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.o) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
