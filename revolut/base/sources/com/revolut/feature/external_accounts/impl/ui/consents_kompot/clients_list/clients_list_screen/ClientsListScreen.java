package com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import hl6.c;
import hl6.f;
import hl6.k;
import hl6.l;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.i2;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/clients_list_screen/ClientsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/clients_list_screen/a;", "Ldli/a;", "Lhl6/l;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ClientsListScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ClientsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final RowDelegate M;
    public final ListSubheaderDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ClientsListScreen(ClientsListScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, c.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new ListSubheaderDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: hl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ClientsListScreen f152984b;

            {
                this.f152984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ClientsListScreen.R;
                        ClientsListScreen clientsListScreen = this.f152984b;
                        return dli.f.a(clientsListScreen, (k) clientsListScreen.Q.getValue(), zhm.v.k(clientsListScreen.M, clientsListScreen.N, new RowLoadingDelegate(), new CellDetailsActionDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ClientsListScreen.R;
                        return (k) ((i2) this.f152984b.P.getValue()).f304893h.get();
                }
            }
        });
        this.P = w.y0(new hl6.b(this, input, 0));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ClientsListScreen f152984b;

            {
                this.f152984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ClientsListScreen.R;
                        ClientsListScreen clientsListScreen = this.f152984b;
                        return dli.f.a(clientsListScreen, (k) clientsListScreen.Q.getValue(), zhm.v.k(clientsListScreen.M, clientsListScreen.N, new RowLoadingDelegate(), new CellDetailsActionDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ClientsListScreen.R;
                        return (k) ((i2) this.f152984b.P.getValue()).f304893h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(uiState.f152995b);
        navBarWithToolbar.setTitle(uiState.f152995b, null);
        TextLocalisedClause textLocalisedClause = uiState.f152996c;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i2) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jpl.b bVar = (jpl.b) ((i2) this.P.getValue()).d.get();
        bVar.getClass();
        RowDelegate rowDelegate = this.M;
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        ListSubheaderDelegate listSubheaderDelegate = this.N;
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        bVar.d = rowDelegate;
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new hbg.h(this, null, 13), 3);
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, new h23.b(rd0.e.b(rowDelegate.f53218h), 25), new hl6.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53226s), new hl6.e(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
