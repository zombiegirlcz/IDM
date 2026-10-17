package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au;

import a15.d;
import aj0.o;
import aj6.b;
import aj6.f;
import aj6.g;
import aj6.j;
import aj6.k;
import aj6.l;
import aj6.n;
import aj6.p;
import aj6.r;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au.AccountsSelectionAuScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import xf6.b2;
import xf6.p2;
import xf6.w2;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/accounts_au/accounts_selection_au/accounts_selection_au/AccountsSelectionAuScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laj6/n;", "Ldli/a;", "Laj6/r;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountsSelectionAuScreen extends ViewController<n> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(AccountsSelectionAuScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};
    public final l K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final TextDelegate R;
    public final Object S;
    public final Object T;

    public AccountsSelectionAuScreen(l inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: aj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsSelectionAuScreen f5401b;

            {
                this.f5401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountsSelectionAuScreen accountsSelectionAuScreen = this.f5401b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsSelectionAuScreen.U;
                        return (p) ((b2) accountsSelectionAuScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsSelectionAuScreen.U;
                        return new SelectableDelegate((RowDelegate) accountsSelectionAuScreen.P.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsSelectionAuScreen.U;
                        AccountsSelectionAuScreen accountsSelectionAuScreen2 = this.f5401b;
                        return dli.f.a(accountsSelectionAuScreen2, accountsSelectionAuScreen2.R2(), zhm.v.k(new CellDetailsActionDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsChevronDelegate) accountsSelectionAuScreen2.O.getValue(), (RowDelegate) accountsSelectionAuScreen2.P.getValue(), (SelectableDelegate) accountsSelectionAuScreen2.Q.getValue(), accountsSelectionAuScreen2.R, new ListSubheaderDelegate(), new PlainTextWarningDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = AccountsSelectionAuScreen.U;
                        qji.b bVarU2 = accountsSelectionAuScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au.di.AccountsSelectionAuScreenInjector");
                        p2 p2Var = (p2) bVarU2;
                        w2 w2Var = p2Var.f304991b;
                        p2 p2Var2 = p2Var.f304992c;
                        l lVar = accountsSelectionAuScreen.K;
                        lVar.getClass();
                        return new b2(w2Var, p2Var2, lVar);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        this.N = s.t(this, b.f);
        this.O = w.y0(new o(3));
        this.P = w.y0(new o(4));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: aj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsSelectionAuScreen f5401b;

            {
                this.f5401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountsSelectionAuScreen accountsSelectionAuScreen = this.f5401b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsSelectionAuScreen.U;
                        return (p) ((b2) accountsSelectionAuScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsSelectionAuScreen.U;
                        return new SelectableDelegate((RowDelegate) accountsSelectionAuScreen.P.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsSelectionAuScreen.U;
                        AccountsSelectionAuScreen accountsSelectionAuScreen2 = this.f5401b;
                        return dli.f.a(accountsSelectionAuScreen2, accountsSelectionAuScreen2.R2(), zhm.v.k(new CellDetailsActionDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsChevronDelegate) accountsSelectionAuScreen2.O.getValue(), (RowDelegate) accountsSelectionAuScreen2.P.getValue(), (SelectableDelegate) accountsSelectionAuScreen2.Q.getValue(), accountsSelectionAuScreen2.R, new ListSubheaderDelegate(), new PlainTextWarningDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = AccountsSelectionAuScreen.U;
                        qji.b bVarU2 = accountsSelectionAuScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au.di.AccountsSelectionAuScreenInjector");
                        p2 p2Var = (p2) bVarU2;
                        w2 w2Var = p2Var.f304991b;
                        p2 p2Var2 = p2Var.f304992c;
                        l lVar = accountsSelectionAuScreen.K;
                        lVar.getClass();
                        return new b2(w2Var, p2Var2, lVar);
                }
            }
        });
        this.R = new TextDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: aj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsSelectionAuScreen f5401b;

            {
                this.f5401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountsSelectionAuScreen accountsSelectionAuScreen = this.f5401b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsSelectionAuScreen.U;
                        return (p) ((b2) accountsSelectionAuScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsSelectionAuScreen.U;
                        return new SelectableDelegate((RowDelegate) accountsSelectionAuScreen.P.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsSelectionAuScreen.U;
                        AccountsSelectionAuScreen accountsSelectionAuScreen2 = this.f5401b;
                        return dli.f.a(accountsSelectionAuScreen2, accountsSelectionAuScreen2.R2(), zhm.v.k(new CellDetailsActionDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsChevronDelegate) accountsSelectionAuScreen2.O.getValue(), (RowDelegate) accountsSelectionAuScreen2.P.getValue(), (SelectableDelegate) accountsSelectionAuScreen2.Q.getValue(), accountsSelectionAuScreen2.R, new ListSubheaderDelegate(), new PlainTextWarningDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = AccountsSelectionAuScreen.U;
                        qji.b bVarU2 = accountsSelectionAuScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au.di.AccountsSelectionAuScreenInjector");
                        p2 p2Var = (p2) bVarU2;
                        w2 w2Var = p2Var.f304991b;
                        p2 p2Var2 = p2Var.f304992c;
                        l lVar = accountsSelectionAuScreen.K;
                        lVar.getClass();
                        return new b2(w2Var, p2Var2, lVar);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: aj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsSelectionAuScreen f5401b;

            {
                this.f5401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AccountsSelectionAuScreen accountsSelectionAuScreen = this.f5401b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsSelectionAuScreen.U;
                        return (p) ((b2) accountsSelectionAuScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsSelectionAuScreen.U;
                        return new SelectableDelegate((RowDelegate) accountsSelectionAuScreen.P.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsSelectionAuScreen.U;
                        AccountsSelectionAuScreen accountsSelectionAuScreen2 = this.f5401b;
                        return dli.f.a(accountsSelectionAuScreen2, accountsSelectionAuScreen2.R2(), zhm.v.k(new CellDetailsActionDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsChevronDelegate) accountsSelectionAuScreen2.O.getValue(), (RowDelegate) accountsSelectionAuScreen2.P.getValue(), (SelectableDelegate) accountsSelectionAuScreen2.Q.getValue(), accountsSelectionAuScreen2.R, new ListSubheaderDelegate(), new PlainTextWarningDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = AccountsSelectionAuScreen.U;
                        qji.b bVarU2 = accountsSelectionAuScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au.di.AccountsSelectionAuScreenInjector");
                        p2 p2Var = (p2) bVarU2;
                        w2 w2Var = p2Var.f304991b;
                        p2 p2Var2 = p2Var.f304992c;
                        l lVar = accountsSelectionAuScreen.K;
                        lVar.getClass();
                        return new b2(w2Var, p2Var2, lVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        k kVar = uiState.f5424b;
        Clause clause = uiState.f5425c;
        if (kVar instanceof k.a) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            if (!(kVar instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
            TextLocalisedClause textLocalisedClause = ((j) kVar).f5412a;
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
        }
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorWhite_70);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setMenuItems(v.l(uiState.e));
        d3().d.setSecondaryButtonEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b2) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174567b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TwinHorizontalButton twinHorizontalButton = d3().d;
        twinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14));
        twinHorizontalButton.setPrimaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinHorizontalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.oba_authorize_accounts_button_title, null, null, 14));
        twinHorizontalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174567b.f59410q), new f(this, null, 1), 3);
        ViewController.P2(this, new d(rd0.e.b(d3().f174567b.o.f57403b), 26), new f(this, null, 2), 3);
        ViewController.P2(this, vkm.q.J(new d(rd0.e.b(((RowDelegate) this.P.getValue()).f53225r), 27), new d(rd0.e.b(((SelectableDelegate) this.Q.getValue()).r()), 28)), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsChevronDelegate) this.O.getValue()).f51821c), new aj6.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().d.c()), new f(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().d.d()), new f(this, null, 0), 3);
    }

    public final jii.v d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.v) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
