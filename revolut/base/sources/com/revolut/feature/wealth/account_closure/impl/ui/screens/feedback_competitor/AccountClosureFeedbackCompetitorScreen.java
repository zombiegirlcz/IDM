package com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.AccountClosureFeedbackCompetitorScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.AccountClosureFeedbackCompetitorScreenContract$InputData;
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
import org.jetbrains.annotations.NotNull;
import sug.b;
import sug.c;
import sug.d;
import sug.h;
import sug.i;
import sug.j;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;
import ztg.f;
import ztg.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/feedback_competitor/AccountClosureFeedbackCompetitorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsug/h;", "Ldli/a;", "Lsug/j;", "Companion", "a", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountClosureFeedbackCompetitorScreen extends ViewController<h> implements a {
    public final AccountClosureFeedbackCompetitorScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final InputChecklistDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccountClosureFeedbackCompetitorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.AccountClosureFeedbackCompetitorScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public AccountClosureFeedbackCompetitorScreen(AccountClosureFeedbackCompetitorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new InputChecklistDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: sug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureFeedbackCompetitorScreen f265758b;

            {
                this.f265758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen = this.f265758b;
                switch (i2) {
                    case 0:
                        AccountClosureFeedbackCompetitorScreen.Companion companion = AccountClosureFeedbackCompetitorScreen.INSTANCE;
                        AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen2 = this.f265758b;
                        return dli.f.a(accountClosureFeedbackCompetitorScreen2, accountClosureFeedbackCompetitorScreen2.R2(), u.c(accountClosureFeedbackCompetitorScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AccountClosureFeedbackCompetitorScreen.Companion companion2 = AccountClosureFeedbackCompetitorScreen.INSTANCE;
                        qji.b bVarU2 = accountClosureFeedbackCompetitorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.di.AccountClosureFeedbackCompetitorScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureFeedbackCompetitorScreenContract$InputData accountClosureFeedbackCompetitorScreenContract$InputData = accountClosureFeedbackCompetitorScreen.K;
                        accountClosureFeedbackCompetitorScreenContract$InputData.getClass();
                        return new ztg.f(nVar, hVar2, accountClosureFeedbackCompetitorScreenContract$InputData);
                    default:
                        AccountClosureFeedbackCompetitorScreen.Companion companion3 = AccountClosureFeedbackCompetitorScreen.INSTANCE;
                        return (i) ((ztg.f) accountClosureFeedbackCompetitorScreen.P.getValue()).f325130c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: sug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureFeedbackCompetitorScreen f265758b;

            {
                this.f265758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen = this.f265758b;
                switch (i22) {
                    case 0:
                        AccountClosureFeedbackCompetitorScreen.Companion companion = AccountClosureFeedbackCompetitorScreen.INSTANCE;
                        AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen2 = this.f265758b;
                        return dli.f.a(accountClosureFeedbackCompetitorScreen2, accountClosureFeedbackCompetitorScreen2.R2(), u.c(accountClosureFeedbackCompetitorScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AccountClosureFeedbackCompetitorScreen.Companion companion2 = AccountClosureFeedbackCompetitorScreen.INSTANCE;
                        qji.b bVarU2 = accountClosureFeedbackCompetitorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.di.AccountClosureFeedbackCompetitorScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureFeedbackCompetitorScreenContract$InputData accountClosureFeedbackCompetitorScreenContract$InputData = accountClosureFeedbackCompetitorScreen.K;
                        accountClosureFeedbackCompetitorScreenContract$InputData.getClass();
                        return new ztg.f(nVar, hVar2, accountClosureFeedbackCompetitorScreenContract$InputData);
                    default:
                        AccountClosureFeedbackCompetitorScreen.Companion companion3 = AccountClosureFeedbackCompetitorScreen.INSTANCE;
                        return (i) ((ztg.f) accountClosureFeedbackCompetitorScreen.P.getValue()).f325130c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: sug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureFeedbackCompetitorScreen f265758b;

            {
                this.f265758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen = this.f265758b;
                switch (i22) {
                    case 0:
                        AccountClosureFeedbackCompetitorScreen.Companion companion = AccountClosureFeedbackCompetitorScreen.INSTANCE;
                        AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen2 = this.f265758b;
                        return dli.f.a(accountClosureFeedbackCompetitorScreen2, accountClosureFeedbackCompetitorScreen2.R2(), u.c(accountClosureFeedbackCompetitorScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AccountClosureFeedbackCompetitorScreen.Companion companion2 = AccountClosureFeedbackCompetitorScreen.INSTANCE;
                        qji.b bVarU2 = accountClosureFeedbackCompetitorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.di.AccountClosureFeedbackCompetitorScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureFeedbackCompetitorScreenContract$InputData accountClosureFeedbackCompetitorScreenContract$InputData = accountClosureFeedbackCompetitorScreen.K;
                        accountClosureFeedbackCompetitorScreenContract$InputData.getClass();
                        return new ztg.f(nVar, hVar2, accountClosureFeedbackCompetitorScreenContract$InputData);
                    default:
                        AccountClosureFeedbackCompetitorScreen.Companion companion3 = AccountClosureFeedbackCompetitorScreen.INSTANCE;
                        return (i) ((ztg.f) accountClosureFeedbackCompetitorScreen.P.getValue()).f325130c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        jii.u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f265762a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionText(uiState.f265763b);
        navBarWithToolbar.setDescriptionVisible(true);
        LargeActionButton largeActionButton = uVarD3.f174564b;
        largeActionButton.setText(uiState.f265764c);
        largeActionButton.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.P.getValue();
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
        InputChecklistDelegate inputChecklistDelegate = this.N;
        ViewController.P2(this, rd0.e.b(inputChecklistDelegate.f52518c), new d(this, null), 3);
        ViewController.P2(this, t1.g(rd0.e.b(inputChecklistDelegate.e.f121375b), 200L), new sug.e(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
