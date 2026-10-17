package com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c4g.l;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.m0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r6g.d;
import r6g.f;
import r6g.g;
import r6g.i;
import r6g.j;
import r6g.k;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr6g/i;", "Ltki/c;", "Lr6g/k;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsPassengersPickerScreen extends ViewController<i> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelFlightsPassengersPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsPassengersPickerBinding;", 0))};
    public final CellIncrementDelegate K;
    public final CellDetailsActionDelegate L;
    public final InputChecklistDelegate M;
    public final TextDelegate N;
    public final int O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public TravelFlightsPassengersPickerScreen(TravelFlightsPassengersPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new CellIncrementDelegate();
        this.L = new CellDetailsActionDelegate();
        this.M = new InputChecklistDelegate();
        this.N = new TextDelegate();
        this.O = R$layout.screen_travel_flights_passengers_picker;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: r6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPassengersPickerScreen f251839b;

            {
                this.f251839b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPassengersPickerScreen.T;
                        TravelFlightsPassengersPickerScreen travelFlightsPassengersPickerScreen = this.f251839b;
                        return tki.g.a(travelFlightsPassengersPickerScreen, travelFlightsPassengersPickerScreen.d(), v.k(travelFlightsPassengersPickerScreen.K, travelFlightsPassengersPickerScreen.L, travelFlightsPassengersPickerScreen.M, travelFlightsPassengersPickerScreen.N), R$id.travelFlightsPassengersPickerScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsPassengersPickerScreen.T;
                        m0 m0Var = (m0) this.f251839b.R.getValue();
                        switch (m0Var.f132153a) {
                            case 0:
                                return (j) m0Var.d.get();
                            case 1:
                                return (j) m0Var.d.get();
                            default:
                                return (j) m0Var.d.get();
                        }
                }
            }
        });
        this.Q = s.t(this, r6g.c.f);
        this.R = w.y0(new qvf.a(this, inputData, 18));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: r6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPassengersPickerScreen f251839b;

            {
                this.f251839b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPassengersPickerScreen.T;
                        TravelFlightsPassengersPickerScreen travelFlightsPassengersPickerScreen = this.f251839b;
                        return tki.g.a(travelFlightsPassengersPickerScreen, travelFlightsPassengersPickerScreen.d(), v.k(travelFlightsPassengersPickerScreen.K, travelFlightsPassengersPickerScreen.L, travelFlightsPassengersPickerScreen.M, travelFlightsPassengersPickerScreen.N), R$id.travelFlightsPassengersPickerScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsPassengersPickerScreen.T;
                        m0 m0Var = (m0) this.f251839b.R.getValue();
                        switch (m0Var.f132153a) {
                            case 0:
                                return (j) m0Var.d.get();
                            case 1:
                                return (j) m0Var.d.get();
                            default:
                                return (j) m0Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f21281c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_passengers_info_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f21280b.setText(new TextLocalisedClause(R$string.travel_flights_passengers_info_submit_button, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f21281c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f21280b.o), new d(this, null, 1), 3);
        CellIncrementDelegate cellIncrementDelegate = this.K;
        ViewController.P2(this, rd0.e.b(cellIncrementDelegate.f51948c), new r6g.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(cellIncrementDelegate.d), new r6g.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.d), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52518c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new r6g.e(this, continuation, 2), 3);
    }

    public final l d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
