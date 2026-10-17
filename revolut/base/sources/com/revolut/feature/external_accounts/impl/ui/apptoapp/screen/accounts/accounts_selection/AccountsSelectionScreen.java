package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.accounts_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.accounts_selection.AccountsSelectionScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ei6.d;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vkm.j2;
import w50.g;
import wi6.b;
import wi6.f;
import wi6.i;
import wi6.k;
import wi6.m;
import wi6.t;
import xf6.c2;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/accounts/accounts_selection/AccountsSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwi6/m;", "Ldli/a;", "Lwi6/o;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountsSelectionScreen extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AccountsSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AccountsSelectionScreen(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, b.f);
        this.M = w.y0(new wf5.a(8));
        this.N = w.y0(new wf5.a(9));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: wi6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsSelectionScreen f297803b;

            {
                this.f297803b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountsSelectionScreen accountsSelectionScreen = this.f297803b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsSelectionScreen.S;
                        return new SelectableDelegate((RowDelegate) accountsSelectionScreen.N.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsSelectionScreen.S;
                        AccountsSelectionScreen accountsSelectionScreen2 = this.f297803b;
                        return dli.f.a(accountsSelectionScreen2, accountsSelectionScreen2.d(), v.k(new CellDetailsActionDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsChevronDelegate) accountsSelectionScreen2.M.getValue(), (RowDelegate) accountsSelectionScreen2.N.getValue(), (SelectableDelegate) accountsSelectionScreen2.O.getValue(), new ListSubheaderDelegate(), new PlainTextWarningDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountsSelectionScreen.S;
                        return (t) ((c2) accountsSelectionScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: wi6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsSelectionScreen f297803b;

            {
                this.f297803b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountsSelectionScreen accountsSelectionScreen = this.f297803b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsSelectionScreen.S;
                        return new SelectableDelegate((RowDelegate) accountsSelectionScreen.N.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsSelectionScreen.S;
                        AccountsSelectionScreen accountsSelectionScreen2 = this.f297803b;
                        return dli.f.a(accountsSelectionScreen2, accountsSelectionScreen2.d(), v.k(new CellDetailsActionDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsChevronDelegate) accountsSelectionScreen2.M.getValue(), (RowDelegate) accountsSelectionScreen2.N.getValue(), (SelectableDelegate) accountsSelectionScreen2.O.getValue(), new ListSubheaderDelegate(), new PlainTextWarningDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountsSelectionScreen.S;
                        return (t) ((c2) accountsSelectionScreen.Q.getValue()).e.get();
                }
            }
        });
        this.Q = w.y0(new w83.a(this, inputData, 16));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: wi6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsSelectionScreen f297803b;

            {
                this.f297803b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountsSelectionScreen accountsSelectionScreen = this.f297803b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsSelectionScreen.S;
                        return new SelectableDelegate((RowDelegate) accountsSelectionScreen.N.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsSelectionScreen.S;
                        AccountsSelectionScreen accountsSelectionScreen2 = this.f297803b;
                        return dli.f.a(accountsSelectionScreen2, accountsSelectionScreen2.d(), v.k(new CellDetailsActionDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsChevronDelegate) accountsSelectionScreen2.M.getValue(), (RowDelegate) accountsSelectionScreen2.N.getValue(), (SelectableDelegate) accountsSelectionScreen2.O.getValue(), new ListSubheaderDelegate(), new PlainTextWarningDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountsSelectionScreen.S;
                        return (t) ((c2) accountsSelectionScreen.Q.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        wi6.o uiState = (wi6.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174565c.setDescriptionText(uiState.f297821b);
        d3().f174565c.setDescriptionVisible(uiState.f297821b != null);
        d3().f174565c.setMenuItems(v.l(uiState.d));
        d3().f174564b.setEnabled(uiState.f297822c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        t tVarD = d();
        d dVar = ((wi6.h) ((j2) tVarD.f297833t.f22677a).getValue()).f297807a;
        tVarD.C2(new k(dVar != null ? dVar.f126446a : null));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c2) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.auth_account_select_account_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.oba_authorize_accounts_button_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new f(this, null, 0), 3);
        ViewController.P2(this, new wa3.d(rd0.e.b(d3().f174565c.o.f57403b), 10), new f(this, null, 1), 3);
        ViewController.P2(this, vkm.q.J(new wa3.d(rd0.e.b(((RowDelegate) this.N.getValue()).f53225r), 11), new wa3.d(rd0.e.b(((SelectableDelegate) this.O.getValue()).r()), 12)), new g(this, (Continuation) null, 24), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsChevronDelegate) this.M.getValue()).f51821c), new wi6.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new f(this, null, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final t d() {
        return (t) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
