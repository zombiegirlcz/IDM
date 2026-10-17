package com.revolut.feature.travel.miles.impl.ui.screen.flight_date_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_date_picker.TravelMilesFlightDatePickerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import e58.d;
import ehg.b;
import ehg.c;
import ehg.e;
import ehg.f;
import ehg.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rfg.i;
import te0.w;
import ufg.c0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_date_picker/TravelMilesFlightDatePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lehg/e;", "Ldli/a;", "Lehg/g;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesFlightDatePickerScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelMilesFlightDatePickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesFlightDatePickerBinding;", 0))};
    public final int K;
    public final DatePickerDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public TravelMilesFlightDatePickerScreen(TravelMilesFlightDatePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_miles_flight_date_picker;
        this.L = new DatePickerDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ehg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightDatePickerScreen f126186b;

            {
                this.f126186b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightDatePickerScreen.Q;
                        TravelMilesFlightDatePickerScreen travelMilesFlightDatePickerScreen = this.f126186b;
                        return dli.f.a(travelMilesFlightDatePickerScreen, (f) travelMilesFlightDatePickerScreen.P.getValue(), u.c(travelMilesFlightDatePickerScreen.L), R$id.travelMilesFlightDatePickerScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesFlightDatePickerScreen.Q;
                        c0 c0Var = (c0) this.f126186b.O.getValue();
                        switch (c0Var.f279676a) {
                            case 0:
                                return (f) c0Var.d.get();
                            default:
                                return (f) c0Var.d.get();
                        }
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = w.y0(new d(this, inputData, 19));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ehg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightDatePickerScreen f126186b;

            {
                this.f126186b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightDatePickerScreen.Q;
                        TravelMilesFlightDatePickerScreen travelMilesFlightDatePickerScreen = this.f126186b;
                        return dli.f.a(travelMilesFlightDatePickerScreen, (f) travelMilesFlightDatePickerScreen.P.getValue(), u.c(travelMilesFlightDatePickerScreen.L), R$id.travelMilesFlightDatePickerScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesFlightDatePickerScreen.Q;
                        c0 c0Var = (c0) this.f126186b.O.getValue();
                        switch (c0Var.f279676a) {
                            case 0:
                                return (f) c0Var.d.get();
                            default:
                                return (f) c0Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f253797b.setDescriptionText(uiState.f126189a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f253797b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_search_date_picker_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionClickable(true);
        d3().f253798c.setButtonText(new TextLocalisedClause(R$string.miles_search_date_picker_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253797b.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253797b.q0()), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52176c.f121375b), null, new ea4.d(this, null, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253798c.f0()), null, new c(this, null, 2), 3);
    }

    public final i d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
