package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.TravelMilesFlightSearchResultsFiltersScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.TravelMilesFlightSearchResultsFiltersScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rfg.p;
import rhg.b;
import rhg.c;
import rhg.d;
import rhg.f;
import rhg.g;
import rhg.i;
import rhg.k;
import rhg.l;
import rhg.m;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_results/filters/TravelMilesFlightSearchResultsFiltersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrhg/k;", "Ldli/a;", "Lrhg/m;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesFlightSearchResultsFiltersScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(TravelMilesFlightSearchResultsFiltersScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesFlightSearchResultsFiltersBinding;", 0))};
    public final TravelMilesFlightSearchResultsFiltersScreenContract$InputData K;
    public final int L;
    public final FullScreenStateDelegate M;
    public final SelectableDelegate N;
    public final InputChecklistDelegate O;
    public final RangeSliderTitleDelegate P;
    public final LargeActionButtonDelegate Q;
    public final ListSubheaderDelegate R;
    public final Object S;
    public final h T;
    public final Object U;
    public final Object V;

    public TravelMilesFlightSearchResultsFiltersScreen(TravelMilesFlightSearchResultsFiltersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_travel_miles_flight_search_results_filters;
        this.M = new FullScreenStateDelegate();
        this.N = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.O = new InputChecklistDelegate();
        this.P = new RangeSliderTitleDelegate();
        this.Q = new LargeActionButtonDelegate();
        this.R = new ListSubheaderDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: rhg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchResultsFiltersScreen f254450b;

            {
                this.f254450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen = this.f254450b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightSearchResultsFiltersScreen.W;
                        TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen2 = this.f254450b;
                        return dli.f.a(travelMilesFlightSearchResultsFiltersScreen2, travelMilesFlightSearchResultsFiltersScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), travelMilesFlightSearchResultsFiltersScreen2.M, new RowLoadingDelegate(), travelMilesFlightSearchResultsFiltersScreen2.R, travelMilesFlightSearchResultsFiltersScreen2.N, travelMilesFlightSearchResultsFiltersScreen2.O, travelMilesFlightSearchResultsFiltersScreen2.P, travelMilesFlightSearchResultsFiltersScreen2.Q), R$id.travelMilesFlightSearchResultsFiltersScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesFlightSearchResultsFiltersScreen.W;
                        qji.b bVarU2 = travelMilesFlightSearchResultsFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.di.TravelMilesFlightSearchResultsFiltersScreenInjector");
                        ufg.n nVar = (ufg.n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        ufg.n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchResultsFiltersScreenContract$InputData travelMilesFlightSearchResultsFiltersScreenContract$InputData = travelMilesFlightSearchResultsFiltersScreen.K;
                        travelMilesFlightSearchResultsFiltersScreenContract$InputData.getClass();
                        return new ufg.m(gVar, nVar2, travelMilesFlightSearchResultsFiltersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesFlightSearchResultsFiltersScreen.W;
                        return (l) ((ufg.m) travelMilesFlightSearchResultsFiltersScreen.U.getValue()).f279767b.get();
                }
            }
        });
        this.T = s.t(this, b.f);
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: rhg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchResultsFiltersScreen f254450b;

            {
                this.f254450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen = this.f254450b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightSearchResultsFiltersScreen.W;
                        TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen2 = this.f254450b;
                        return dli.f.a(travelMilesFlightSearchResultsFiltersScreen2, travelMilesFlightSearchResultsFiltersScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), travelMilesFlightSearchResultsFiltersScreen2.M, new RowLoadingDelegate(), travelMilesFlightSearchResultsFiltersScreen2.R, travelMilesFlightSearchResultsFiltersScreen2.N, travelMilesFlightSearchResultsFiltersScreen2.O, travelMilesFlightSearchResultsFiltersScreen2.P, travelMilesFlightSearchResultsFiltersScreen2.Q), R$id.travelMilesFlightSearchResultsFiltersScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesFlightSearchResultsFiltersScreen.W;
                        qji.b bVarU2 = travelMilesFlightSearchResultsFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.di.TravelMilesFlightSearchResultsFiltersScreenInjector");
                        ufg.n nVar = (ufg.n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        ufg.n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchResultsFiltersScreenContract$InputData travelMilesFlightSearchResultsFiltersScreenContract$InputData = travelMilesFlightSearchResultsFiltersScreen.K;
                        travelMilesFlightSearchResultsFiltersScreenContract$InputData.getClass();
                        return new ufg.m(gVar, nVar2, travelMilesFlightSearchResultsFiltersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesFlightSearchResultsFiltersScreen.W;
                        return (l) ((ufg.m) travelMilesFlightSearchResultsFiltersScreen.U.getValue()).f279767b.get();
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: rhg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchResultsFiltersScreen f254450b;

            {
                this.f254450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen = this.f254450b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightSearchResultsFiltersScreen.W;
                        TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen2 = this.f254450b;
                        return dli.f.a(travelMilesFlightSearchResultsFiltersScreen2, travelMilesFlightSearchResultsFiltersScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), travelMilesFlightSearchResultsFiltersScreen2.M, new RowLoadingDelegate(), travelMilesFlightSearchResultsFiltersScreen2.R, travelMilesFlightSearchResultsFiltersScreen2.N, travelMilesFlightSearchResultsFiltersScreen2.O, travelMilesFlightSearchResultsFiltersScreen2.P, travelMilesFlightSearchResultsFiltersScreen2.Q), R$id.travelMilesFlightSearchResultsFiltersScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesFlightSearchResultsFiltersScreen.W;
                        qji.b bVarU2 = travelMilesFlightSearchResultsFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.di.TravelMilesFlightSearchResultsFiltersScreenInjector");
                        ufg.n nVar = (ufg.n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        ufg.n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchResultsFiltersScreenContract$InputData travelMilesFlightSearchResultsFiltersScreenContract$InputData = travelMilesFlightSearchResultsFiltersScreen.K;
                        travelMilesFlightSearchResultsFiltersScreenContract$InputData.getClass();
                        return new ufg.m(gVar, nVar2, travelMilesFlightSearchResultsFiltersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesFlightSearchResultsFiltersScreen.W;
                        return (l) ((ufg.m) travelMilesFlightSearchResultsFiltersScreen.U.getValue()).f279767b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f253818c.setMenuItems(uiState.f254457b);
        LargeActionButton travelMilesFlightSearchResultsFiltersScreenButton = d3().f253817b;
        Intrinsics.checkNotNullExpressionValue(travelMilesFlightSearchResultsFiltersScreenButton, "travelMilesFlightSearchResultsFiltersScreenButton");
        travelMilesFlightSearchResultsFiltersScreenButton.setVisibility(uiState.f254458c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ufg.m) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f253818c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.miles_search_filters_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.miles_search_filters_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f253817b.setText(new TextLocalisedClause(R$string.miles_search_filters_cta, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253818c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52518c), null, new rhg.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.r()), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53139c), null, new g(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253817b.o), null, new c(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253818c.o.f57403b), null, new g(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52707c), null, new rhg.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d.f121375b), null, new i(this, null), 3);
    }

    public final p d3() {
        ViewBinding value = this.T.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
