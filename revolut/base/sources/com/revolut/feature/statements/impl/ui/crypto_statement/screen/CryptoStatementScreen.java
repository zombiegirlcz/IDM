package com.revolut.feature.statements.impl.ui.crypto_statement.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.crypto_statement.screen.CryptoStatementScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import eyd.b0;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tyg.g;
import tzd.c;
import tzd.d;
import tzd.e;
import tzd.f;
import tzd.i;
import vc.s;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/crypto_statement/screen/CryptoStatementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ltzd/i;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoStatementScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CryptoStatementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final e K;
    public final h L;
    public final SmallActionButtonDelegate M;
    public final FixedTabsDelegate N;
    public final Object O;
    public final boolean P;
    public final int Q;
    public final Object R;
    public final Object S;

    public CryptoStatementScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = new SmallActionButtonDelegate();
        this.N = new FixedTabsDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: tzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoStatementScreen f275923b;

            {
                this.f275923b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoStatementScreen cryptoStatementScreen = this.f275923b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoStatementScreen.T;
                        return (f) ((eyd.o) cryptoStatementScreen.S.getValue()).k.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoStatementScreen.T;
                        CryptoStatementScreen cryptoStatementScreen2 = this.f275923b;
                        return dli.f.a(cryptoStatementScreen2, (f) cryptoStatementScreen2.O.getValue(), d0.E0(((i0e.m) ((i0e.f) ((eyd.o) cryptoStatementScreen2.S.getValue()).f130808g.get())).Q(), v.k(cryptoStatementScreen2.M, cryptoStatementScreen2.N)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CryptoStatementScreen.T;
                        qji.b bVarU2 = cryptoStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.crypto_statement.screen.di.CryptoStatementScreenInjector");
                        eyd.n nVar = (eyd.n) bVarU2;
                        b0 b0Var = nVar.f130802b;
                        eyd.n nVar2 = nVar.f130803c;
                        e eVar = cryptoStatementScreen.K;
                        eVar.getClass();
                        return new eyd.o(b0Var, nVar2, cryptoStatementScreen, eVar);
                }
            }
        });
        this.P = true;
        this.Q = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: tzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoStatementScreen f275923b;

            {
                this.f275923b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoStatementScreen cryptoStatementScreen = this.f275923b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoStatementScreen.T;
                        return (f) ((eyd.o) cryptoStatementScreen.S.getValue()).k.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoStatementScreen.T;
                        CryptoStatementScreen cryptoStatementScreen2 = this.f275923b;
                        return dli.f.a(cryptoStatementScreen2, (f) cryptoStatementScreen2.O.getValue(), d0.E0(((i0e.m) ((i0e.f) ((eyd.o) cryptoStatementScreen2.S.getValue()).f130808g.get())).Q(), v.k(cryptoStatementScreen2.M, cryptoStatementScreen2.N)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CryptoStatementScreen.T;
                        qji.b bVarU2 = cryptoStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.crypto_statement.screen.di.CryptoStatementScreenInjector");
                        eyd.n nVar = (eyd.n) bVarU2;
                        b0 b0Var = nVar.f130802b;
                        eyd.n nVar2 = nVar.f130803c;
                        e eVar = cryptoStatementScreen.K;
                        eVar.getClass();
                        return new eyd.o(b0Var, nVar2, cryptoStatementScreen, eVar);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: tzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoStatementScreen f275923b;

            {
                this.f275923b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoStatementScreen cryptoStatementScreen = this.f275923b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoStatementScreen.T;
                        return (f) ((eyd.o) cryptoStatementScreen.S.getValue()).k.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoStatementScreen.T;
                        CryptoStatementScreen cryptoStatementScreen2 = this.f275923b;
                        return dli.f.a(cryptoStatementScreen2, (f) cryptoStatementScreen2.O.getValue(), d0.E0(((i0e.m) ((i0e.f) ((eyd.o) cryptoStatementScreen2.S.getValue()).f130808g.get())).Q(), v.k(cryptoStatementScreen2.M, cryptoStatementScreen2.N)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CryptoStatementScreen.T;
                        qji.b bVarU2 = cryptoStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.crypto_statement.screen.di.CryptoStatementScreenInjector");
                        eyd.n nVar = (eyd.n) bVarU2;
                        b0 b0Var = nVar.f130802b;
                        eyd.n nVar2 = nVar.f130803c;
                        e eVar = cryptoStatementScreen.K;
                        eVar.getClass();
                        return new eyd.o(b0Var, nVar2, cryptoStatementScreen, eVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f275929a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (eyd.o) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        int i = tzd.b.f275924a[this.K.f275925a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.statement_header_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_statements_pnl_statement_title, null, null, 14);
        }
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174564b.setText(new TextLocalisedClause(R$string.statement_action_generate, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, continuation, 0), 3);
        r map = this.N.f52339c.f121375b.map(new ty1.c(new g(6), 24));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new tz6.e(this, (Continuation) null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
