package com.revolut.sso.impl.ui.revolut_id.account_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bpl.b;
import bpl.c;
import bpl.d;
import bpl.f;
import bpl.g;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.revolut_id.account_details.AccountDetailsScreen;
import com.revolut.sso.impl.ui.revolut_id.account_details.AccountDetailsScreenContract$InputData;
import dkl.p;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mjl.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/account_details/AccountDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbpl/h;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AccountDetailsScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenSsoAccountDetailsBinding;", 0))};
    public final AccountDetailsScreenContract$InputData K;
    public final h L;
    public final CellDetailsNoteDelegate M;
    public final RowDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AccountDetailsScreen(AccountDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new CellDetailsNoteDelegate();
        this.N = new RowDelegate(null, null, 7);
        this.O = R$layout.screen_sso_account_details;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: bpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsScreen f17632b;

            {
                this.f17632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountDetailsScreen accountDetailsScreen = this.f17632b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsScreen.S;
                        qji.b bVarU2 = accountDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.account_details.di.AccountDetailsScreenInjector");
                        n nVar = (n) bVarU2;
                        mjl.m mVar = nVar.f206114b;
                        n nVar2 = nVar.f206115c;
                        AccountDetailsScreenContract$InputData accountDetailsScreenContract$InputData = accountDetailsScreen.K;
                        accountDetailsScreenContract$InputData.getClass();
                        return new mjl.a(mVar, nVar2, accountDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsScreen.S;
                        AccountDetailsScreen accountDetailsScreen2 = this.f17632b;
                        return dli.f.a(accountDetailsScreen2, (f) accountDetailsScreen2.R.getValue(), v.k(accountDetailsScreen2.M, accountDetailsScreen2.N), R$id.accountDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountDetailsScreen.S;
                        return (f) ((mjl.a) accountDetailsScreen.P.getValue()).f206067b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: bpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsScreen f17632b;

            {
                this.f17632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountDetailsScreen accountDetailsScreen = this.f17632b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsScreen.S;
                        qji.b bVarU2 = accountDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.account_details.di.AccountDetailsScreenInjector");
                        n nVar = (n) bVarU2;
                        mjl.m mVar = nVar.f206114b;
                        n nVar2 = nVar.f206115c;
                        AccountDetailsScreenContract$InputData accountDetailsScreenContract$InputData = accountDetailsScreen.K;
                        accountDetailsScreenContract$InputData.getClass();
                        return new mjl.a(mVar, nVar2, accountDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsScreen.S;
                        AccountDetailsScreen accountDetailsScreen2 = this.f17632b;
                        return dli.f.a(accountDetailsScreen2, (f) accountDetailsScreen2.R.getValue(), v.k(accountDetailsScreen2.M, accountDetailsScreen2.N), R$id.accountDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountDetailsScreen.S;
                        return (f) ((mjl.a) accountDetailsScreen.P.getValue()).f206067b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: bpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsScreen f17632b;

            {
                this.f17632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountDetailsScreen accountDetailsScreen = this.f17632b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsScreen.S;
                        qji.b bVarU2 = accountDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.account_details.di.AccountDetailsScreenInjector");
                        n nVar = (n) bVarU2;
                        mjl.m mVar = nVar.f206114b;
                        n nVar2 = nVar.f206115c;
                        AccountDetailsScreenContract$InputData accountDetailsScreenContract$InputData = accountDetailsScreen.K;
                        accountDetailsScreenContract$InputData.getClass();
                        return new mjl.a(mVar, nVar2, accountDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsScreen.S;
                        AccountDetailsScreen accountDetailsScreen2 = this.f17632b;
                        return dli.f.a(accountDetailsScreen2, (f) accountDetailsScreen2.R.getValue(), v.k(accountDetailsScreen2.M, accountDetailsScreen2.N), R$id.accountDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AccountDetailsScreen.S;
                        return (f) ((mjl.a) accountDetailsScreen.P.getValue()).f206067b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        bpl.h uiState = (bpl.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f115675b;
        g gVar = uiState.f17639a;
        TextClause textClause = gVar.f17636a;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(gVar.f17637b);
        navBarWithToolbar.setEndImage(gVar.f17638c);
        navBarWithToolbar.setEndIconBadge(gVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mjl.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f115675b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f115675b.f59410q), null, new bf5.a(this, null, 24), 3);
        CellDetailsNoteDelegate cellDetailsNoteDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(cellDetailsNoteDelegate.f51869g), rd0.e.b(cellDetailsNoteDelegate.d), rd0.e.b(cellDetailsNoteDelegate.f)), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new d(this, null), 3);
    }

    public final p d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
