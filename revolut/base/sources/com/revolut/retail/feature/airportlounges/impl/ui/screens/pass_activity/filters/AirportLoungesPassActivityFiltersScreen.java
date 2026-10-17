package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.AirportLoungesPassActivityFiltersScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.AirportLoungesPassActivityFiltersScreenContract$InputData;
import cwi.j0;
import cwi.p0;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;
import zxi.b;
import zxi.c;
import zxi.d;
import zxi.f;
import zxi.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_activity/filters/AirportLoungesPassActivityFiltersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzxi/f;", "Ldli/a;", "Lzxi/h;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesPassActivityFiltersScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AirportLoungesPassActivityFiltersScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AirportLoungesPassActivityFiltersScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AirportLoungesPassActivityFiltersScreen(AirportLoungesPassActivityFiltersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new zx0.h(2));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: zxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassActivityFiltersScreen f326339b;

            {
                this.f326339b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungesPassActivityFiltersScreen airportLoungesPassActivityFiltersScreen = this.f326339b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesPassActivityFiltersScreen.R;
                        AirportLoungesPassActivityFiltersScreen airportLoungesPassActivityFiltersScreen2 = this.f326339b;
                        return dli.f.a(airportLoungesPassActivityFiltersScreen2, (g) airportLoungesPassActivityFiltersScreen2.Q.getValue(), v.k(new ListSubheaderDelegate(), (InputChecklistDelegate) airportLoungesPassActivityFiltersScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesPassActivityFiltersScreen.R;
                        qji.b bVarU2 = airportLoungesPassActivityFiltersScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.di.AirportLoungesPassActivityFiltersScreenInjector");
                        }
                        p0 p0Var = (p0) bVarU2;
                        cwi.h0 h0Var = p0Var.f109756a;
                        p0 p0Var2 = p0Var.f109757b;
                        AirportLoungesPassActivityFiltersScreenContract$InputData airportLoungesPassActivityFiltersScreenContract$InputData = airportLoungesPassActivityFiltersScreen.K;
                        airportLoungesPassActivityFiltersScreenContract$InputData.getClass();
                        return new j0(h0Var, p0Var2, airportLoungesPassActivityFiltersScreen, airportLoungesPassActivityFiltersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesPassActivityFiltersScreen.R;
                        return (g) ((j0) airportLoungesPassActivityFiltersScreen.P.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: zxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassActivityFiltersScreen f326339b;

            {
                this.f326339b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungesPassActivityFiltersScreen airportLoungesPassActivityFiltersScreen = this.f326339b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesPassActivityFiltersScreen.R;
                        AirportLoungesPassActivityFiltersScreen airportLoungesPassActivityFiltersScreen2 = this.f326339b;
                        return dli.f.a(airportLoungesPassActivityFiltersScreen2, (g) airportLoungesPassActivityFiltersScreen2.Q.getValue(), v.k(new ListSubheaderDelegate(), (InputChecklistDelegate) airportLoungesPassActivityFiltersScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesPassActivityFiltersScreen.R;
                        qji.b bVarU2 = airportLoungesPassActivityFiltersScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.di.AirportLoungesPassActivityFiltersScreenInjector");
                        }
                        p0 p0Var = (p0) bVarU2;
                        cwi.h0 h0Var = p0Var.f109756a;
                        p0 p0Var2 = p0Var.f109757b;
                        AirportLoungesPassActivityFiltersScreenContract$InputData airportLoungesPassActivityFiltersScreenContract$InputData = airportLoungesPassActivityFiltersScreen.K;
                        airportLoungesPassActivityFiltersScreenContract$InputData.getClass();
                        return new j0(h0Var, p0Var2, airportLoungesPassActivityFiltersScreen, airportLoungesPassActivityFiltersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesPassActivityFiltersScreen.R;
                        return (g) ((j0) airportLoungesPassActivityFiltersScreen.P.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: zxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassActivityFiltersScreen f326339b;

            {
                this.f326339b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungesPassActivityFiltersScreen airportLoungesPassActivityFiltersScreen = this.f326339b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesPassActivityFiltersScreen.R;
                        AirportLoungesPassActivityFiltersScreen airportLoungesPassActivityFiltersScreen2 = this.f326339b;
                        return dli.f.a(airportLoungesPassActivityFiltersScreen2, (g) airportLoungesPassActivityFiltersScreen2.Q.getValue(), v.k(new ListSubheaderDelegate(), (InputChecklistDelegate) airportLoungesPassActivityFiltersScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesPassActivityFiltersScreen.R;
                        qji.b bVarU2 = airportLoungesPassActivityFiltersScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.di.AirportLoungesPassActivityFiltersScreenInjector");
                        }
                        p0 p0Var = (p0) bVarU2;
                        cwi.h0 h0Var = p0Var.f109756a;
                        p0 p0Var2 = p0Var.f109757b;
                        AirportLoungesPassActivityFiltersScreenContract$InputData airportLoungesPassActivityFiltersScreenContract$InputData = airportLoungesPassActivityFiltersScreen.K;
                        airportLoungesPassActivityFiltersScreenContract$InputData.getClass();
                        return new j0(h0Var, p0Var2, airportLoungesPassActivityFiltersScreen, airportLoungesPassActivityFiltersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesPassActivityFiltersScreen.R;
                        return (g) ((j0) airportLoungesPassActivityFiltersScreen.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        zxi.h uiState = (zxi.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f326344b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.airport_lounges_pass_activity_filters, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.airport_lounges_pass_activity_filters_confirm, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((InputChecklistDelegate) this.N.getValue()).f52518c), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
