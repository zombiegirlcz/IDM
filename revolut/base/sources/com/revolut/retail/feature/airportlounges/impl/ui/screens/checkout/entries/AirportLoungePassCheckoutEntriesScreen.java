package com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries.AirportLoungePassCheckoutEntriesScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries.AirportLoungePassCheckoutEntriesScreenContract$InputData;
import cwi.y;
import cwi.z;
import cxi.b;
import cxi.c;
import cxi.f;
import cxi.g;
import dli.a;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/entries/AirportLoungePassCheckoutEntriesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcxi/f;", "Ldli/a;", "Lcxi/g;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungePassCheckoutEntriesScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AirportLoungePassCheckoutEntriesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final AirportLoungePassCheckoutEntriesScreenContract$InputData K;
    public final int L;
    public final CellIncrementDelegate M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AirportLoungePassCheckoutEntriesScreen(AirportLoungePassCheckoutEntriesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_base;
        this.M = new CellIncrementDelegate();
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: cxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassCheckoutEntriesScreen f109985b;

            {
                this.f109985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungePassCheckoutEntriesScreen airportLoungePassCheckoutEntriesScreen = this.f109985b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassCheckoutEntriesScreen.R;
                        AirportLoungePassCheckoutEntriesScreen airportLoungePassCheckoutEntriesScreen2 = this.f109985b;
                        return dli.f.a(airportLoungePassCheckoutEntriesScreen2, (h) airportLoungePassCheckoutEntriesScreen2.Q.getValue(), u.c(airportLoungePassCheckoutEntriesScreen2.M), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassCheckoutEntriesScreen.R;
                        qji.b bVarU2 = airportLoungePassCheckoutEntriesScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries.di.AirportLoungePassCheckoutEntriesScreenInjector");
                        }
                        y yVar = (y) bVarU2;
                        cwi.h0 h0Var = yVar.f109817b;
                        y yVar2 = yVar.f109818c;
                        AirportLoungePassCheckoutEntriesScreenContract$InputData airportLoungePassCheckoutEntriesScreenContract$InputData = airportLoungePassCheckoutEntriesScreen.K;
                        airportLoungePassCheckoutEntriesScreenContract$InputData.getClass();
                        return new z(h0Var, yVar2, airportLoungePassCheckoutEntriesScreen, airportLoungePassCheckoutEntriesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassCheckoutEntriesScreen.R;
                        return (h) ((z) airportLoungePassCheckoutEntriesScreen.P.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: cxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassCheckoutEntriesScreen f109985b;

            {
                this.f109985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungePassCheckoutEntriesScreen airportLoungePassCheckoutEntriesScreen = this.f109985b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassCheckoutEntriesScreen.R;
                        AirportLoungePassCheckoutEntriesScreen airportLoungePassCheckoutEntriesScreen2 = this.f109985b;
                        return dli.f.a(airportLoungePassCheckoutEntriesScreen2, (h) airportLoungePassCheckoutEntriesScreen2.Q.getValue(), u.c(airportLoungePassCheckoutEntriesScreen2.M), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassCheckoutEntriesScreen.R;
                        qji.b bVarU2 = airportLoungePassCheckoutEntriesScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries.di.AirportLoungePassCheckoutEntriesScreenInjector");
                        }
                        y yVar = (y) bVarU2;
                        cwi.h0 h0Var = yVar.f109817b;
                        y yVar2 = yVar.f109818c;
                        AirportLoungePassCheckoutEntriesScreenContract$InputData airportLoungePassCheckoutEntriesScreenContract$InputData = airportLoungePassCheckoutEntriesScreen.K;
                        airportLoungePassCheckoutEntriesScreenContract$InputData.getClass();
                        return new z(h0Var, yVar2, airportLoungePassCheckoutEntriesScreen, airportLoungePassCheckoutEntriesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassCheckoutEntriesScreen.R;
                        return (h) ((z) airportLoungePassCheckoutEntriesScreen.P.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: cxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassCheckoutEntriesScreen f109985b;

            {
                this.f109985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungePassCheckoutEntriesScreen airportLoungePassCheckoutEntriesScreen = this.f109985b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassCheckoutEntriesScreen.R;
                        AirportLoungePassCheckoutEntriesScreen airportLoungePassCheckoutEntriesScreen2 = this.f109985b;
                        return dli.f.a(airportLoungePassCheckoutEntriesScreen2, (h) airportLoungePassCheckoutEntriesScreen2.Q.getValue(), u.c(airportLoungePassCheckoutEntriesScreen2.M), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassCheckoutEntriesScreen.R;
                        qji.b bVarU2 = airportLoungePassCheckoutEntriesScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries.di.AirportLoungePassCheckoutEntriesScreenInjector");
                        }
                        y yVar = (y) bVarU2;
                        cwi.h0 h0Var = yVar.f109817b;
                        y yVar2 = yVar.f109818c;
                        AirportLoungePassCheckoutEntriesScreenContract$InputData airportLoungePassCheckoutEntriesScreenContract$InputData = airportLoungePassCheckoutEntriesScreen.K;
                        airportLoungePassCheckoutEntriesScreenContract$InputData.getClass();
                        return new z(h0Var, yVar2, airportLoungePassCheckoutEntriesScreen, airportLoungePassCheckoutEntriesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassCheckoutEntriesScreen.R;
                        return (h) ((z) airportLoungePassCheckoutEntriesScreen.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174514c.setHeaderModel(new lw0.a(uiState.f109992a, new TextLocalisedClause(R$string.airport_lounges_checkout_entries_subtitle, null, null, 14), null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (cxi.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(0);
        d3().f174513b.setModel(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.airport_lounges_common_confirm, null, null, 14), LargeActionButton.ButtonStyle.e, null, null, false, null, null, 1020), null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174513b.f), null, new c(this, null, 0), 3);
        CellIncrementDelegate cellIncrementDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellIncrementDelegate.f51948c), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellIncrementDelegate.d), null, new c(this, null, 2), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
