package com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details.ConnectedAppDetailsScreen;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details.ConnectedAppDetailsScreenContract$InputData;
import dli.a;
import ec8.c;
import epl.b;
import epl.d;
import epl.f;
import epl.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mjl.m;
import te0.w;
import vc.s;
import xki.e;
import yy0.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/connected_apps/connected_app_details/details/ConnectedAppDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lepl/d;", "Ldli/a;", "Lepl/g;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConnectedAppDetailsScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ConnectedAppDetailsScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenConnectedAppDetailsBinding;", 0))};
    public final ConnectedAppDetailsScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public ConnectedAppDetailsScreen(ConnectedAppDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_connected_app_details;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: epl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectedAppDetailsScreen f128204b;

            {
                this.f128204b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConnectedAppDetailsScreen connectedAppDetailsScreen = this.f128204b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConnectedAppDetailsScreen.Q;
                        qji.b bVarU2 = connectedAppDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details.di.ConnectedAppDetailsScreenInjector");
                        mjl.c cVar = (mjl.c) bVarU2;
                        m mVar = cVar.f206073c;
                        mjl.c cVar2 = cVar.d;
                        ConnectedAppDetailsScreenContract$InputData connectedAppDetailsScreenContract$InputData = connectedAppDetailsScreen.K;
                        connectedAppDetailsScreenContract$InputData.getClass();
                        return new mjl.d(mVar, cVar2, connectedAppDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConnectedAppDetailsScreen.Q;
                        return (e) ((mjl.d) connectedAppDetailsScreen.N.getValue()).f206075b.get();
                    default:
                        KProperty[] kPropertyArr3 = ConnectedAppDetailsScreen.Q;
                        ConnectedAppDetailsScreen connectedAppDetailsScreen2 = this.f128204b;
                        return dli.f.a(connectedAppDetailsScreen2, (e) connectedAppDetailsScreen2.O.getValue(), v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7)), R$id.connectedAppDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: epl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectedAppDetailsScreen f128204b;

            {
                this.f128204b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConnectedAppDetailsScreen connectedAppDetailsScreen = this.f128204b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConnectedAppDetailsScreen.Q;
                        qji.b bVarU2 = connectedAppDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details.di.ConnectedAppDetailsScreenInjector");
                        mjl.c cVar = (mjl.c) bVarU2;
                        m mVar = cVar.f206073c;
                        mjl.c cVar2 = cVar.d;
                        ConnectedAppDetailsScreenContract$InputData connectedAppDetailsScreenContract$InputData = connectedAppDetailsScreen.K;
                        connectedAppDetailsScreenContract$InputData.getClass();
                        return new mjl.d(mVar, cVar2, connectedAppDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConnectedAppDetailsScreen.Q;
                        return (e) ((mjl.d) connectedAppDetailsScreen.N.getValue()).f206075b.get();
                    default:
                        KProperty[] kPropertyArr3 = ConnectedAppDetailsScreen.Q;
                        ConnectedAppDetailsScreen connectedAppDetailsScreen2 = this.f128204b;
                        return dli.f.a(connectedAppDetailsScreen2, (e) connectedAppDetailsScreen2.O.getValue(), v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7)), R$id.connectedAppDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: epl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectedAppDetailsScreen f128204b;

            {
                this.f128204b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConnectedAppDetailsScreen connectedAppDetailsScreen = this.f128204b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConnectedAppDetailsScreen.Q;
                        qji.b bVarU2 = connectedAppDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details.di.ConnectedAppDetailsScreenInjector");
                        mjl.c cVar = (mjl.c) bVarU2;
                        m mVar = cVar.f206073c;
                        mjl.c cVar2 = cVar.d;
                        ConnectedAppDetailsScreenContract$InputData connectedAppDetailsScreenContract$InputData = connectedAppDetailsScreen.K;
                        connectedAppDetailsScreenContract$InputData.getClass();
                        return new mjl.d(mVar, cVar2, connectedAppDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConnectedAppDetailsScreen.Q;
                        return (e) ((mjl.d) connectedAppDetailsScreen.N.getValue()).f206075b.get();
                    default:
                        KProperty[] kPropertyArr3 = ConnectedAppDetailsScreen.Q;
                        ConnectedAppDetailsScreen connectedAppDetailsScreen2 = this.f128204b;
                        return dli.f.a(connectedAppDetailsScreen2, (e) connectedAppDetailsScreen2.O.getValue(), v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7)), R$id.connectedAppDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f115645b;
        navBarWithToolbar.setToolbarTitle(uiState.f128209a.f128206a);
        f fVar = uiState.f128209a;
        navBarWithToolbar.setTitle(fVar.f128206a, null);
        navBarWithToolbar.setDescriptionText(fVar.f128207b);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setEndImage(new j(fVar.f128208c));
        navBarWithToolbar.setEndIconBadge(RetailBadge.f58066a);
        navBarWithToolbar.setFilters(fVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mjl.d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (epl.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f115645b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f115645b.f59410q), null, new c(this, null, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f115645b.s0()), null, new epl.c(this, null), 3);
    }

    public final dkl.e d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dkl.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
