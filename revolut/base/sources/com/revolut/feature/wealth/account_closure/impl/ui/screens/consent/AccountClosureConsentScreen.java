package com.revolut.feature.wealth.account_closure.impl.ui.screens.consent;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent.AccountClosureConsentScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent.AccountClosureConsentScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import iug.b;
import iug.c;
import iug.d;
import iug.g;
import iug.i;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/consent/AccountClosureConsentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liug/g;", "Ldli/a;", "Liug/i;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountClosureConsentScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccountClosureConsentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AccountClosureConsentScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputChecklistDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AccountClosureConsentScreen(AccountClosureConsentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new InputChecklistDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: iug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureConsentScreen f168590b;

            {
                this.f168590b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountClosureConsentScreen accountClosureConsentScreen = this.f168590b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureConsentScreen.R;
                        AccountClosureConsentScreen accountClosureConsentScreen2 = this.f168590b;
                        return dli.f.a(accountClosureConsentScreen2, (h) accountClosureConsentScreen2.Q.getValue(), v.k(accountClosureConsentScreen2.N, new PlainTextWarningDelegate(), new TextDelegate(), new ListCellBulletDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountClosureConsentScreen.R;
                        qji.b bVarU2 = accountClosureConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.consent.di.AccountClosureConsentScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        ztg.n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureConsentScreenContract$InputData accountClosureConsentScreenContract$InputData = accountClosureConsentScreen.K;
                        accountClosureConsentScreenContract$InputData.getClass();
                        return new ztg.b(nVar, hVar2, accountClosureConsentScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountClosureConsentScreen.R;
                        return (h) ((ztg.b) accountClosureConsentScreen.P.getValue()).f325120c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: iug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureConsentScreen f168590b;

            {
                this.f168590b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountClosureConsentScreen accountClosureConsentScreen = this.f168590b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureConsentScreen.R;
                        AccountClosureConsentScreen accountClosureConsentScreen2 = this.f168590b;
                        return dli.f.a(accountClosureConsentScreen2, (h) accountClosureConsentScreen2.Q.getValue(), v.k(accountClosureConsentScreen2.N, new PlainTextWarningDelegate(), new TextDelegate(), new ListCellBulletDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountClosureConsentScreen.R;
                        qji.b bVarU2 = accountClosureConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.consent.di.AccountClosureConsentScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        ztg.n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureConsentScreenContract$InputData accountClosureConsentScreenContract$InputData = accountClosureConsentScreen.K;
                        accountClosureConsentScreenContract$InputData.getClass();
                        return new ztg.b(nVar, hVar2, accountClosureConsentScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountClosureConsentScreen.R;
                        return (h) ((ztg.b) accountClosureConsentScreen.P.getValue()).f325120c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: iug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureConsentScreen f168590b;

            {
                this.f168590b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountClosureConsentScreen accountClosureConsentScreen = this.f168590b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureConsentScreen.R;
                        AccountClosureConsentScreen accountClosureConsentScreen2 = this.f168590b;
                        return dli.f.a(accountClosureConsentScreen2, (h) accountClosureConsentScreen2.Q.getValue(), v.k(accountClosureConsentScreen2.N, new PlainTextWarningDelegate(), new TextDelegate(), new ListCellBulletDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountClosureConsentScreen.R;
                        qji.b bVarU2 = accountClosureConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.consent.di.AccountClosureConsentScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        ztg.n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureConsentScreenContract$InputData accountClosureConsentScreenContract$InputData = accountClosureConsentScreen.K;
                        accountClosureConsentScreenContract$InputData.getClass();
                        return new ztg.b(nVar, hVar2, accountClosureConsentScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountClosureConsentScreen.R;
                        return (h) ((ztg.b) accountClosureConsentScreen.P.getValue()).f325120c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        Clause clause = uiState.f168596a;
        navBarWithToolbar.setTitle(clause, null);
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        LargeActionButton largeActionButton = uVarD3.f174564b;
        largeActionButton.setText(uiState.f168597b);
        largeActionButton.setEnabled(uiState.f168598c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ztg.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (iug.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174565c.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        u uVarD3 = d3();
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(uVarD3.f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(uVarD3.f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52518c), null, new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
