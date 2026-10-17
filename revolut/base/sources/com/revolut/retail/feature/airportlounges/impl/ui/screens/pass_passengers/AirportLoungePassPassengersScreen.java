package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarCellDelegate;
import com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.R$id;
import com.revolut.retail.feature.airportlounges.impl.R$layout;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersScreen;
import cwi.b0;
import cwi.e0;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lyi.b;
import lyi.d;
import lyi.e;
import lyi.i;
import lyi.j;
import lyi.k;
import te0.w;
import vc.s;
import zhm.v;
import zvi.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_passengers/AirportLoungePassPassengersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llyi/b;", "Ldli/a;", "Llyi/e;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungePassPassengersScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AirportLoungePassPassengersScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/airportlounges/impl/databinding/ScreenAirportLoungePassPassengersBinding;", 0))};
    public final AirportLoungePassPassengersContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final SuggestionsBarCellDelegate Q;
    public final InputTextDelegate R;
    public final FullScreenStateDelegate S;

    public AirportLoungePassPassengersScreen(AirportLoungePassPassengersContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_airport_lounge_pass_passengers;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lyi.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassPassengersScreen f200838b;

            {
                this.f200838b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungePassPassengersScreen airportLoungePassPassengersScreen = this.f200838b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassPassengersScreen.T;
                        qji.b bVarU2 = airportLoungePassPassengersScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.di.AirportLoungePassPassengersScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        cwi.h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        AirportLoungePassPassengersContract$InputData airportLoungePassPassengersContract$InputData = airportLoungePassPassengersScreen.K;
                        airportLoungePassPassengersContract$InputData.getClass();
                        return new e0(h0Var, b0Var2, airportLoungePassPassengersScreen, airportLoungePassPassengersContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassPassengersScreen.T;
                        return (d) ((e0) airportLoungePassPassengersScreen.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassPassengersScreen.T;
                        AirportLoungePassPassengersScreen airportLoungePassPassengersScreen2 = this.f200838b;
                        return dli.f.a(airportLoungePassPassengersScreen2, airportLoungePassPassengersScreen2.d(), v.k(airportLoungePassPassengersScreen2.R, airportLoungePassPassengersScreen2.Q, airportLoungePassPassengersScreen2.S), R$id.passPassengers_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lyi.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassPassengersScreen f200838b;

            {
                this.f200838b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungePassPassengersScreen airportLoungePassPassengersScreen = this.f200838b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassPassengersScreen.T;
                        qji.b bVarU2 = airportLoungePassPassengersScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.di.AirportLoungePassPassengersScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        cwi.h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        AirportLoungePassPassengersContract$InputData airportLoungePassPassengersContract$InputData = airportLoungePassPassengersScreen.K;
                        airportLoungePassPassengersContract$InputData.getClass();
                        return new e0(h0Var, b0Var2, airportLoungePassPassengersScreen, airportLoungePassPassengersContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassPassengersScreen.T;
                        return (d) ((e0) airportLoungePassPassengersScreen.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassPassengersScreen.T;
                        AirportLoungePassPassengersScreen airportLoungePassPassengersScreen2 = this.f200838b;
                        return dli.f.a(airportLoungePassPassengersScreen2, airportLoungePassPassengersScreen2.d(), v.k(airportLoungePassPassengersScreen2.R, airportLoungePassPassengersScreen2.Q, airportLoungePassPassengersScreen2.S), R$id.passPassengers_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lyi.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassPassengersScreen f200838b;

            {
                this.f200838b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungePassPassengersScreen airportLoungePassPassengersScreen = this.f200838b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassPassengersScreen.T;
                        qji.b bVarU2 = airportLoungePassPassengersScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.di.AirportLoungePassPassengersScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        cwi.h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        AirportLoungePassPassengersContract$InputData airportLoungePassPassengersContract$InputData = airportLoungePassPassengersScreen.K;
                        airportLoungePassPassengersContract$InputData.getClass();
                        return new e0(h0Var, b0Var2, airportLoungePassPassengersScreen, airportLoungePassPassengersContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassPassengersScreen.T;
                        return (d) ((e0) airportLoungePassPassengersScreen.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassPassengersScreen.T;
                        AirportLoungePassPassengersScreen airportLoungePassPassengersScreen2 = this.f200838b;
                        return dli.f.a(airportLoungePassPassengersScreen2, airportLoungePassPassengersScreen2.d(), v.k(airportLoungePassPassengersScreen2.R, airportLoungePassPassengersScreen2.Q, airportLoungePassPassengersScreen2.S), R$id.passPassengers_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, lyi.h.f);
        this.Q = new SuggestionsBarCellDelegate();
        this.R = new InputTextDelegate(null);
        this.S = new FullScreenStateDelegate();
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f325689c.setTitle(uiState.f200835b, null);
        d3().f325688b.setEnabled(uiState.f200836c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f325689c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f325688b.setText(new TextLocalisedClause(R$string.airport_lounges_common_confirm, null, null, 14));
        d3().f325688b.setLoadingButtonTag("TAG_LOADING_BUTTON_CONFIRM");
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f325689c.f59410q), new i(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((SuggestionDelegate) this.Q.f53481c.getValue()).d), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.e.f121375b), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f325688b.o), new i(this, continuation, 1), 3);
    }

    public final c d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.N.getValue();
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
