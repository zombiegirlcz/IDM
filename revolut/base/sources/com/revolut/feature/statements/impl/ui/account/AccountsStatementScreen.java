package com.revolut.feature.statements.impl.ui.account;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.account.AccountsStatementScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import eyd.f;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import woc.p;
import wyd.a0;
import wyd.b0;
import wyd.m;
import wyd.n;
import wyd.y;
import wyd.z;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/account/AccountsStatementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwyd/b0;", "<init>", "()V", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountsStatementScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccountsStatementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object N;
    public final Object P;
    public final Object Q;
    public final h K = s.t(this, a.f);
    public final SmallActionButtonDelegate L = new SmallActionButtonDelegate();
    public final FixedTabsDelegate M = new FixedTabsDelegate();
    public final int O = R$layout.screen_recycler_navbar_nextbutton;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public AccountsStatementScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wyd.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsStatementScreen f301257b;

            {
                this.f301257b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountsStatementScreen accountsStatementScreen = this.f301257b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsStatementScreen.R;
                        return (q) ((eyd.f) accountsStatementScreen.Q.getValue()).k.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsStatementScreen.R;
                        AccountsStatementScreen accountsStatementScreen2 = this.f301257b;
                        return dli.f.a(accountsStatementScreen2, accountsStatementScreen2.R2(), zhm.d0.E0(((i0e.m) ((i0e.f) ((eyd.f) accountsStatementScreen2.Q.getValue()).f.get())).Q(), zhm.v.k(new TextDelegate(), accountsStatementScreen2.L, accountsStatementScreen2.M)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountsStatementScreen.R;
                        qji.b bVarU2 = accountsStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.account.di.AccountsStatementScreenInjector");
                        eyd.e eVar = (eyd.e) bVarU2;
                        eyd.b0 b0Var = eVar.f130730b;
                        eyd.e eVar2 = eVar.f130731c;
                        eyd.f fVar = new eyd.f();
                        fVar.f130735a = e4m.b.b(e4m.c.a(accountsStatementScreen));
                        int i3 = 8;
                        fVar.f130736b = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 2, i3));
                        fVar.f130737c = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 4, i3));
                        fVar.d = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 5, i3));
                        fVar.e = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 3, i3));
                        fVar.f = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 1, i3));
                        fVar.f130738g = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 0, i3));
                        fVar.f130739h = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 6, i3));
                        fVar.i = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 7, i3));
                        fVar.f130740j = new ehe.o(b0Var, eVar2, fVar, 9, i3);
                        fVar.k = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 8, i3));
                        return fVar;
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: wyd.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsStatementScreen f301257b;

            {
                this.f301257b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountsStatementScreen accountsStatementScreen = this.f301257b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsStatementScreen.R;
                        return (q) ((eyd.f) accountsStatementScreen.Q.getValue()).k.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsStatementScreen.R;
                        AccountsStatementScreen accountsStatementScreen2 = this.f301257b;
                        return dli.f.a(accountsStatementScreen2, accountsStatementScreen2.R2(), zhm.d0.E0(((i0e.m) ((i0e.f) ((eyd.f) accountsStatementScreen2.Q.getValue()).f.get())).Q(), zhm.v.k(new TextDelegate(), accountsStatementScreen2.L, accountsStatementScreen2.M)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountsStatementScreen.R;
                        qji.b bVarU2 = accountsStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.account.di.AccountsStatementScreenInjector");
                        eyd.e eVar = (eyd.e) bVarU2;
                        eyd.b0 b0Var = eVar.f130730b;
                        eyd.e eVar2 = eVar.f130731c;
                        eyd.f fVar = new eyd.f();
                        fVar.f130735a = e4m.b.b(e4m.c.a(accountsStatementScreen));
                        int i3 = 8;
                        fVar.f130736b = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 2, i3));
                        fVar.f130737c = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 4, i3));
                        fVar.d = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 5, i3));
                        fVar.e = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 3, i3));
                        fVar.f = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 1, i3));
                        fVar.f130738g = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 0, i3));
                        fVar.f130739h = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 6, i3));
                        fVar.i = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 7, i3));
                        fVar.f130740j = new ehe.o(b0Var, eVar2, fVar, 9, i3);
                        fVar.k = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 8, i3));
                        return fVar;
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: wyd.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsStatementScreen f301257b;

            {
                this.f301257b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountsStatementScreen accountsStatementScreen = this.f301257b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsStatementScreen.R;
                        return (q) ((eyd.f) accountsStatementScreen.Q.getValue()).k.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsStatementScreen.R;
                        AccountsStatementScreen accountsStatementScreen2 = this.f301257b;
                        return dli.f.a(accountsStatementScreen2, accountsStatementScreen2.R2(), zhm.d0.E0(((i0e.m) ((i0e.f) ((eyd.f) accountsStatementScreen2.Q.getValue()).f.get())).Q(), zhm.v.k(new TextDelegate(), accountsStatementScreen2.L, accountsStatementScreen2.M)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountsStatementScreen.R;
                        qji.b bVarU2 = accountsStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.account.di.AccountsStatementScreenInjector");
                        eyd.e eVar = (eyd.e) bVarU2;
                        eyd.b0 b0Var = eVar.f130730b;
                        eyd.e eVar2 = eVar.f130731c;
                        eyd.f fVar = new eyd.f();
                        fVar.f130735a = e4m.b.b(e4m.c.a(accountsStatementScreen));
                        int i32 = 8;
                        fVar.f130736b = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 2, i32));
                        fVar.f130737c = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 4, i32));
                        fVar.d = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 5, i32));
                        fVar.e = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 3, i32));
                        fVar.f = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 1, i32));
                        fVar.f130738g = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 0, i32));
                        fVar.f130739h = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 6, i32));
                        fVar.i = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 7, i32));
                        fVar.f130740j = new ehe.o(b0Var, eVar2, fVar, 9, i32);
                        fVar.k = e4m.b.b(new ehe.o(b0Var, eVar2, fVar, 8, i32));
                        return fVar;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b0 uiState = (b0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        a0 a0Var = uiState.f301241b;
        if (a0Var instanceof y) {
            TextLocalisedClause textLocalisedClause = ((y) a0Var).f301268a;
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setLoadingVisible(false);
        } else {
            if (!a0Var.equals(z.f301269a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.setLoadingVisible(true);
        }
        d3().f174564b.setEnabled(uiState.f301240a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.statement_action_generate, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new m(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53336c.f121375b), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new m(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52339c.f121375b), null, new p(2, R2(), wyd.q.class, "onTabSelected", "onTabSelected(Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$SelectedData;)V", 4, 3), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final wyd.q R2() {
        return (wyd.q) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
