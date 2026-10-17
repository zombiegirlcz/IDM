package com.revolut.feature.statements.impl.ui.account_confirmation.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.account_confirmation.screen.AccountConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import eyd.b0;
import eyd.d;
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
import xki.e;
import zhm.v;
import zyd.b;
import zyd.c;
import zyd.f;
import zyd.h;
import zyd.i;
import zyd.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/account_confirmation/screen/AccountConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzyd/j;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountConfirmationScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AccountConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final ao.h N;
    public final CellDetailsSwitcherDelegate O;
    public final RowDelegate P;
    public final SelectableDelegate Q;
    public final Object R;
    public final Object S;

    public AccountConfirmationScreen(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zyd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountConfirmationScreen f326436b;

            {
                this.f326436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountConfirmationScreen accountConfirmationScreen = this.f326436b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountConfirmationScreen.T;
                        return (i) ((eyd.d) accountConfirmationScreen.S.getValue()).f130726c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountConfirmationScreen.T;
                        AccountConfirmationScreen accountConfirmationScreen2 = this.f326436b;
                        return dli.f.a(accountConfirmationScreen2, accountConfirmationScreen2.R2(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), accountConfirmationScreen2.O, accountConfirmationScreen2.Q, accountConfirmationScreen2.P), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountConfirmationScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(accountConfirmationScreen.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.account_confirmation.screen.di.AccountConfirmationScreenInjector");
                        b0 b0Var = ((b0) objB).o;
                        h hVar = accountConfirmationScreen.K;
                        hVar.getClass();
                        return new eyd.d(b0Var, hVar);
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = new CellDetailsSwitcherDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SelectableDelegate(rowDelegate);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: zyd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountConfirmationScreen f326436b;

            {
                this.f326436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountConfirmationScreen accountConfirmationScreen = this.f326436b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountConfirmationScreen.T;
                        return (i) ((eyd.d) accountConfirmationScreen.S.getValue()).f130726c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountConfirmationScreen.T;
                        AccountConfirmationScreen accountConfirmationScreen2 = this.f326436b;
                        return dli.f.a(accountConfirmationScreen2, accountConfirmationScreen2.R2(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), accountConfirmationScreen2.O, accountConfirmationScreen2.Q, accountConfirmationScreen2.P), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountConfirmationScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(accountConfirmationScreen.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.account_confirmation.screen.di.AccountConfirmationScreenInjector");
                        b0 b0Var = ((b0) objB).o;
                        h hVar = accountConfirmationScreen.K;
                        hVar.getClass();
                        return new eyd.d(b0Var, hVar);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: zyd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountConfirmationScreen f326436b;

            {
                this.f326436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountConfirmationScreen accountConfirmationScreen = this.f326436b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountConfirmationScreen.T;
                        return (i) ((eyd.d) accountConfirmationScreen.S.getValue()).f130726c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountConfirmationScreen.T;
                        AccountConfirmationScreen accountConfirmationScreen2 = this.f326436b;
                        return dli.f.a(accountConfirmationScreen2, accountConfirmationScreen2.R2(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), accountConfirmationScreen2.O, accountConfirmationScreen2.Q, accountConfirmationScreen2.P), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountConfirmationScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(accountConfirmationScreen.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.account_confirmation.screen.di.AccountConfirmationScreenInjector");
                        b0 b0Var = ((b0) objB).o;
                        h hVar = accountConfirmationScreen.K;
                        hVar.getClass();
                        return new eyd.d(b0Var, hVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f326443b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.statement_account_confirmation_selection_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.statement_action_generate, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f51912c), null, new zyd.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.r()), null, new zyd.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
