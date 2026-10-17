package com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.AccountClosureFeedbackScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.AccountClosureFeedbackScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qug.b;
import qug.c;
import qug.d;
import qug.g;
import qug.i;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;
import ztg.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/feedback/AccountClosureFeedbackScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqug/g;", "Ldli/a;", "Lqug/i;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountClosureFeedbackScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccountClosureFeedbackScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AccountClosureFeedbackScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputChecklistDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AccountClosureFeedbackScreen(AccountClosureFeedbackScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new InputChecklistDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureFeedbackScreen f249442b;

            {
                this.f249442b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountClosureFeedbackScreen accountClosureFeedbackScreen = this.f249442b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureFeedbackScreen.R;
                        AccountClosureFeedbackScreen accountClosureFeedbackScreen2 = this.f249442b;
                        return dli.f.a(accountClosureFeedbackScreen2, (h) accountClosureFeedbackScreen2.Q.getValue(), u.c(accountClosureFeedbackScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountClosureFeedbackScreen.R;
                        qji.b bVarU2 = accountClosureFeedbackScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.di.AccountClosureFeedbackScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureFeedbackScreenContract$InputData accountClosureFeedbackScreenContract$InputData = accountClosureFeedbackScreen.K;
                        accountClosureFeedbackScreenContract$InputData.getClass();
                        return new ztg.g(nVar, hVar2, accountClosureFeedbackScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountClosureFeedbackScreen.R;
                        return (h) ((ztg.g) accountClosureFeedbackScreen.P.getValue()).f325132b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureFeedbackScreen f249442b;

            {
                this.f249442b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountClosureFeedbackScreen accountClosureFeedbackScreen = this.f249442b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureFeedbackScreen.R;
                        AccountClosureFeedbackScreen accountClosureFeedbackScreen2 = this.f249442b;
                        return dli.f.a(accountClosureFeedbackScreen2, (h) accountClosureFeedbackScreen2.Q.getValue(), u.c(accountClosureFeedbackScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountClosureFeedbackScreen.R;
                        qji.b bVarU2 = accountClosureFeedbackScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.di.AccountClosureFeedbackScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureFeedbackScreenContract$InputData accountClosureFeedbackScreenContract$InputData = accountClosureFeedbackScreen.K;
                        accountClosureFeedbackScreenContract$InputData.getClass();
                        return new ztg.g(nVar, hVar2, accountClosureFeedbackScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountClosureFeedbackScreen.R;
                        return (h) ((ztg.g) accountClosureFeedbackScreen.P.getValue()).f325132b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureFeedbackScreen f249442b;

            {
                this.f249442b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountClosureFeedbackScreen accountClosureFeedbackScreen = this.f249442b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureFeedbackScreen.R;
                        AccountClosureFeedbackScreen accountClosureFeedbackScreen2 = this.f249442b;
                        return dli.f.a(accountClosureFeedbackScreen2, (h) accountClosureFeedbackScreen2.Q.getValue(), u.c(accountClosureFeedbackScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountClosureFeedbackScreen.R;
                        qji.b bVarU2 = accountClosureFeedbackScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.di.AccountClosureFeedbackScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureFeedbackScreenContract$InputData accountClosureFeedbackScreenContract$InputData = accountClosureFeedbackScreen.K;
                        accountClosureFeedbackScreenContract$InputData.getClass();
                        return new ztg.g(nVar, hVar2, accountClosureFeedbackScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountClosureFeedbackScreen.R;
                        return (h) ((ztg.g) accountClosureFeedbackScreen.P.getValue()).f325132b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        jii.u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f249448a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(uiState.f249449b);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        LargeActionButton largeActionButton = uVarD3.f174564b;
        largeActionButton.setText(uiState.f249450c);
        largeActionButton.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ztg.g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (qug.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        jii.u uVarD3 = d3();
        ViewController.P2(this, rd0.e.b(uVarD3.f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(uVarD3.f174564b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52518c), new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
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
