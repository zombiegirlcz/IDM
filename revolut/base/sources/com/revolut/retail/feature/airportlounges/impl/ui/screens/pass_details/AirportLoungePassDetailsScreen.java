package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bu7.y;
import byi.c;
import byi.f;
import byi.g;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PassCardDelegate;
import com.revolut.core.ui_kit.delegates.PassCardLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.AirportLoungePassDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.AirportLoungePassDetailsScreenContract$InputData;
import cwi.b0;
import cwi.c0;
import jii.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_details/AirportLoungePassDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_details/a;", "Ldli/a;", "Lbyi/g;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungePassDetailsScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AirportLoungePassDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarBinding;", 0))};
    public final AirportLoungePassDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AirportLoungePassDetailsScreen(AirportLoungePassDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_basic_navbar;
        this.M = s.t(this, byi.b.f);
        this.N = w.y0(new y(20));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: byi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassDetailsScreen f19824b;

            {
                this.f19824b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungePassDetailsScreen airportLoungePassDetailsScreen = this.f19824b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassDetailsScreen.R;
                        AirportLoungePassDetailsScreen airportLoungePassDetailsScreen2 = this.f19824b;
                        return dli.f.a(airportLoungePassDetailsScreen2, (f) airportLoungePassDetailsScreen2.Q.getValue(), v.k(new PassCardDelegate(), new PassCardLoadingDelegate(), (FullScreenStateDelegate) airportLoungePassDetailsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassDetailsScreen.R;
                        qji.b bVarU2 = airportLoungePassDetailsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.di.AirportLoungePassDetailsScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        cwi.h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        AirportLoungePassDetailsScreenContract$InputData airportLoungePassDetailsScreenContract$InputData = airportLoungePassDetailsScreen.K;
                        airportLoungePassDetailsScreenContract$InputData.getClass();
                        return new c0(h0Var, b0Var2, airportLoungePassDetailsScreen, airportLoungePassDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassDetailsScreen.R;
                        return (f) ((c0) airportLoungePassDetailsScreen.P.getValue()).f109647g.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: byi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassDetailsScreen f19824b;

            {
                this.f19824b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungePassDetailsScreen airportLoungePassDetailsScreen = this.f19824b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassDetailsScreen.R;
                        AirportLoungePassDetailsScreen airportLoungePassDetailsScreen2 = this.f19824b;
                        return dli.f.a(airportLoungePassDetailsScreen2, (f) airportLoungePassDetailsScreen2.Q.getValue(), v.k(new PassCardDelegate(), new PassCardLoadingDelegate(), (FullScreenStateDelegate) airportLoungePassDetailsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassDetailsScreen.R;
                        qji.b bVarU2 = airportLoungePassDetailsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.di.AirportLoungePassDetailsScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        cwi.h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        AirportLoungePassDetailsScreenContract$InputData airportLoungePassDetailsScreenContract$InputData = airportLoungePassDetailsScreen.K;
                        airportLoungePassDetailsScreenContract$InputData.getClass();
                        return new c0(h0Var, b0Var2, airportLoungePassDetailsScreen, airportLoungePassDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassDetailsScreen.R;
                        return (f) ((c0) airportLoungePassDetailsScreen.P.getValue()).f109647g.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: byi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassDetailsScreen f19824b;

            {
                this.f19824b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungePassDetailsScreen airportLoungePassDetailsScreen = this.f19824b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassDetailsScreen.R;
                        AirportLoungePassDetailsScreen airportLoungePassDetailsScreen2 = this.f19824b;
                        return dli.f.a(airportLoungePassDetailsScreen2, (f) airportLoungePassDetailsScreen2.Q.getValue(), v.k(new PassCardDelegate(), new PassCardLoadingDelegate(), (FullScreenStateDelegate) airportLoungePassDetailsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassDetailsScreen.R;
                        qji.b bVarU2 = airportLoungePassDetailsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.di.AirportLoungePassDetailsScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        cwi.h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        AirportLoungePassDetailsScreenContract$InputData airportLoungePassDetailsScreenContract$InputData = airportLoungePassDetailsScreen.K;
                        airportLoungePassDetailsScreenContract$InputData.getClass();
                        return new c0(h0Var, b0Var2, airportLoungePassDetailsScreen, airportLoungePassDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassDetailsScreen.R;
                        return (f) ((c0) airportLoungePassDetailsScreen.P.getValue()).f109647g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174530b.setMenuItems(uiState.f19831a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f174530b;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.airport_lounges_pass_details_header_lounge_pass_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174530b.f59211b), null, new brc.h(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174530b.f59210a.f57403b), null, new btd.e(this, continuation, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new c(this, null), 3);
    }

    public final j d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
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
