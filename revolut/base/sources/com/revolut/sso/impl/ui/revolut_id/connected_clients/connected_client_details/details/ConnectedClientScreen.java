package com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details.ConnectedClientScreen;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details.ConnectedClientScreenContract$InputData;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpl.b;
import lpl.c;
import lpl.d;
import lpl.e;
import lpl.f;
import lpl.g;
import mjl.m;
import te0.w;
import tx0.r3;
import vc.s;
import yy0.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/connected_clients/connected_client_details/details/ConnectedClientScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llpl/e;", "Ldli/a;", "Llpl/g;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConnectedClientScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ConnectedClientScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ConnectedClientScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final ListSubheaderDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ConnectedClientScreen(ConnectedClientScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new ListSubheaderDelegate();
        this.O = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: lpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectedClientScreen f199149b;

            {
                this.f199149b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConnectedClientScreen connectedClientScreen = this.f199149b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConnectedClientScreen.S;
                        qji.b bVarU2 = connectedClientScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details.di.ConnectedClientScreenInjector");
                        mjl.f fVar = (mjl.f) bVarU2;
                        m mVar = fVar.f206080c;
                        mjl.f fVar2 = fVar.d;
                        ConnectedClientScreenContract$InputData connectedClientScreenContract$InputData = connectedClientScreen.K;
                        connectedClientScreenContract$InputData.getClass();
                        return new mjl.h(mVar, fVar2, connectedClientScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConnectedClientScreen.S;
                        return (h) ((mjl.h) connectedClientScreen.P.getValue()).f206084b.get();
                    default:
                        KProperty[] kPropertyArr3 = ConnectedClientScreen.S;
                        ConnectedClientScreen connectedClientScreen2 = this.f199149b;
                        return dli.f.a(connectedClientScreen2, (h) connectedClientScreen2.Q.getValue(), v.k(connectedClientScreen2.M, connectedClientScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: lpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectedClientScreen f199149b;

            {
                this.f199149b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConnectedClientScreen connectedClientScreen = this.f199149b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConnectedClientScreen.S;
                        qji.b bVarU2 = connectedClientScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details.di.ConnectedClientScreenInjector");
                        mjl.f fVar = (mjl.f) bVarU2;
                        m mVar = fVar.f206080c;
                        mjl.f fVar2 = fVar.d;
                        ConnectedClientScreenContract$InputData connectedClientScreenContract$InputData = connectedClientScreen.K;
                        connectedClientScreenContract$InputData.getClass();
                        return new mjl.h(mVar, fVar2, connectedClientScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConnectedClientScreen.S;
                        return (h) ((mjl.h) connectedClientScreen.P.getValue()).f206084b.get();
                    default:
                        KProperty[] kPropertyArr3 = ConnectedClientScreen.S;
                        ConnectedClientScreen connectedClientScreen2 = this.f199149b;
                        return dli.f.a(connectedClientScreen2, (h) connectedClientScreen2.Q.getValue(), v.k(connectedClientScreen2.M, connectedClientScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: lpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectedClientScreen f199149b;

            {
                this.f199149b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConnectedClientScreen connectedClientScreen = this.f199149b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConnectedClientScreen.S;
                        qji.b bVarU2 = connectedClientScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details.di.ConnectedClientScreenInjector");
                        mjl.f fVar = (mjl.f) bVarU2;
                        m mVar = fVar.f206080c;
                        mjl.f fVar2 = fVar.d;
                        ConnectedClientScreenContract$InputData connectedClientScreenContract$InputData = connectedClientScreen.K;
                        connectedClientScreenContract$InputData.getClass();
                        return new mjl.h(mVar, fVar2, connectedClientScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConnectedClientScreen.S;
                        return (h) ((mjl.h) connectedClientScreen.P.getValue()).f206084b.get();
                    default:
                        KProperty[] kPropertyArr3 = ConnectedClientScreen.S;
                        ConnectedClientScreen connectedClientScreen2 = this.f199149b;
                        return dli.f.a(connectedClientScreen2, (h) connectedClientScreen2.Q.getValue(), v.k(connectedClientScreen2.M, connectedClientScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f199153a.f199151a, null);
        f fVar = uiState.f199153a;
        navBarWithToolbar.setToolbarTitle(fVar.f199151a);
        navBarWithToolbar.setEndImage(new r3(new j(fVar.f199152b)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mjl.h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (lpl.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new d(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
