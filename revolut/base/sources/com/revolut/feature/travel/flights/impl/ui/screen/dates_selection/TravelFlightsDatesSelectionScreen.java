package com.revolut.feature.travel.flights.impl.ui.screen.dates_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sy6.j;
import t5g.c;
import t5g.e;
import t5g.f;
import t5g.g;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/dates_selection/TravelFlightsDatesSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lt5g/e;", "Lcli/w;", "Lt5g/g;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsDatesSelectionScreen extends ViewController<e> implements w {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TravelFlightsDatesSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsDatesSelectionBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public TravelFlightsDatesSelectionScreen(TravelFlightsDatesSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_flights_dates_selection;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: t5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsDatesSelectionScreen f268104b;

            {
                this.f268104b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsDatesSelectionScreen travelFlightsDatesSelectionScreen = this.f268104b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsDatesSelectionScreen.P;
                        return n14.e.a(travelFlightsDatesSelectionScreen, (f) travelFlightsDatesSelectionScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsDatesSelectionScreen.P;
                        f4g.h0 h0Var = (f4g.h0) travelFlightsDatesSelectionScreen.N.getValue();
                        switch (h0Var.f132122a) {
                            case 0:
                                return (f) h0Var.f132124c.get();
                            default:
                                return (f) h0Var.f132124c.get();
                        }
                }
            }
        });
        this.M = s.t(this, t5g.b.f);
        this.N = te0.w.y0(new sw6.a(this, inputData, 5));
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: t5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsDatesSelectionScreen f268104b;

            {
                this.f268104b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsDatesSelectionScreen travelFlightsDatesSelectionScreen = this.f268104b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsDatesSelectionScreen.P;
                        return n14.e.a(travelFlightsDatesSelectionScreen, (f) travelFlightsDatesSelectionScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsDatesSelectionScreen.P;
                        f4g.h0 h0Var = (f4g.h0) travelFlightsDatesSelectionScreen.N.getValue();
                        switch (h0Var.f132122a) {
                            case 0:
                                return (f) h0Var.f132124c.get();
                            default:
                                return (f) h0Var.f132124c.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().d.setDescriptionText(uiState.f268112g);
        CalendarPickerRangeView travelFlightsDatesSelectionCalendarPickerRangeView = d3().f21261c;
        Intrinsics.checkNotNullExpressionValue(travelFlightsDatesSelectionCalendarPickerRangeView, "travelFlightsDatesSelectionCalendarPickerRangeView");
        CalendarPickerRangeView.setCalendarData$default(travelFlightsDatesSelectionCalendarPickerRangeView, uiState.f268109a, uiState.f268110b, uiState.f268111c, uiState.d, uiState.e, null, 32, null);
        LargeActionButton largeActionButton = d3().f21260b;
        largeActionButton.setText(uiState.f268113h);
        largeActionButton.setEnabled(uiState.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f4g.h0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_flight_dates_selection_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().d.f59410q), new c(this, null, 0), 3);
        r map = d3().f21261c.b().map(new t45.a(new t3b.g(25), 8));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new j(this, null, 17), 3);
        ViewController.P2(this, rd0.e.b(d3().f21260b.o), new c(this, null, 1), 3);
    }

    public final c4g.e d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.L.getValue();
    }
}
