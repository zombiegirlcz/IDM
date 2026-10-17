package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.AirportLoungesDisclaimerAcceptanceContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.AirportLoungesDisclaimerAcceptanceScreen;
import cwi.b0;
import cwi.g0;
import dli.a;
import iyi.b;
import iyi.c;
import iyi.d;
import iyi.f;
import iyi.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_list/modals/disclaimer_acceptance/AirportLoungesDisclaimerAcceptanceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liyi/b;", "Ldli/a;", "Liyi/d;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesDisclaimerAcceptanceScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AirportLoungesDisclaimerAcceptanceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final AirportLoungesDisclaimerAcceptanceContract$InputData K;
    public final RowDelegate L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AirportLoungesDisclaimerAcceptanceScreen(AirportLoungesDisclaimerAcceptanceContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        this.M = s.t(this, f.f);
        this.N = R$layout.screen_bottom_sheet_base;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: iyi.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesDisclaimerAcceptanceScreen f169764b;

            {
                this.f169764b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungesDisclaimerAcceptanceScreen airportLoungesDisclaimerAcceptanceScreen = this.f169764b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesDisclaimerAcceptanceScreen.R;
                        qji.b bVarU2 = airportLoungesDisclaimerAcceptanceScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.di.AirportLoungesDisclaimerAcceptanceScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        cwi.h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        AirportLoungesDisclaimerAcceptanceContract$InputData airportLoungesDisclaimerAcceptanceContract$InputData = airportLoungesDisclaimerAcceptanceScreen.K;
                        airportLoungesDisclaimerAcceptanceContract$InputData.getClass();
                        return new g0(h0Var, b0Var2, airportLoungesDisclaimerAcceptanceScreen, airportLoungesDisclaimerAcceptanceContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesDisclaimerAcceptanceScreen.R;
                        return (c) ((g0) airportLoungesDisclaimerAcceptanceScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesDisclaimerAcceptanceScreen.R;
                        AirportLoungesDisclaimerAcceptanceScreen airportLoungesDisclaimerAcceptanceScreen2 = this.f169764b;
                        return dli.f.a(airportLoungesDisclaimerAcceptanceScreen2, airportLoungesDisclaimerAcceptanceScreen2.R2(), u.c(airportLoungesDisclaimerAcceptanceScreen2.L), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: iyi.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesDisclaimerAcceptanceScreen f169764b;

            {
                this.f169764b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungesDisclaimerAcceptanceScreen airportLoungesDisclaimerAcceptanceScreen = this.f169764b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesDisclaimerAcceptanceScreen.R;
                        qji.b bVarU2 = airportLoungesDisclaimerAcceptanceScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.di.AirportLoungesDisclaimerAcceptanceScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        cwi.h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        AirportLoungesDisclaimerAcceptanceContract$InputData airportLoungesDisclaimerAcceptanceContract$InputData = airportLoungesDisclaimerAcceptanceScreen.K;
                        airportLoungesDisclaimerAcceptanceContract$InputData.getClass();
                        return new g0(h0Var, b0Var2, airportLoungesDisclaimerAcceptanceScreen, airportLoungesDisclaimerAcceptanceContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesDisclaimerAcceptanceScreen.R;
                        return (c) ((g0) airportLoungesDisclaimerAcceptanceScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesDisclaimerAcceptanceScreen.R;
                        AirportLoungesDisclaimerAcceptanceScreen airportLoungesDisclaimerAcceptanceScreen2 = this.f169764b;
                        return dli.f.a(airportLoungesDisclaimerAcceptanceScreen2, airportLoungesDisclaimerAcceptanceScreen2.R2(), u.c(airportLoungesDisclaimerAcceptanceScreen2.L), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: iyi.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesDisclaimerAcceptanceScreen f169764b;

            {
                this.f169764b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungesDisclaimerAcceptanceScreen airportLoungesDisclaimerAcceptanceScreen = this.f169764b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesDisclaimerAcceptanceScreen.R;
                        qji.b bVarU2 = airportLoungesDisclaimerAcceptanceScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.di.AirportLoungesDisclaimerAcceptanceScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        cwi.h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        AirportLoungesDisclaimerAcceptanceContract$InputData airportLoungesDisclaimerAcceptanceContract$InputData = airportLoungesDisclaimerAcceptanceScreen.K;
                        airportLoungesDisclaimerAcceptanceContract$InputData.getClass();
                        return new g0(h0Var, b0Var2, airportLoungesDisclaimerAcceptanceScreen, airportLoungesDisclaimerAcceptanceContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesDisclaimerAcceptanceScreen.R;
                        return (c) ((g0) airportLoungesDisclaimerAcceptanceScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesDisclaimerAcceptanceScreen.R;
                        AirportLoungesDisclaimerAcceptanceScreen airportLoungesDisclaimerAcceptanceScreen2 = this.f169764b;
                        return dli.f.a(airportLoungesDisclaimerAcceptanceScreen2, airportLoungesDisclaimerAcceptanceScreen2.R2(), u.c(airportLoungesDisclaimerAcceptanceScreen2.L), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174514c.setHeaderModel(new lw0.a(uiState.f169761b, uiState.f169762c, null, null, false, 28));
        d3().f174513b.setModel(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g0) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174514c.F), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53226s), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174513b.f), new iyi.h(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174513b.f58955g), new iyi.h(this, null, 1), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c d() {
        return (c) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
