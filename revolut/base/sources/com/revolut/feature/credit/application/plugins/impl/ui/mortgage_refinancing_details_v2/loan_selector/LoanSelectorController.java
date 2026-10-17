package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector.LoanSelectorController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector.LoanSelectorControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.a4;
import dw3.c1;
import dw3.g4;
import jii.u;
import ke4.b;
import ke4.c;
import ke4.d;
import ke4.g;
import ke4.n;
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

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/loan_selector/LoanSelectorController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lke4/n;", "Ldli/a;", "Lke4/o;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanSelectorController extends PluginScreenController<n> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(LoanSelectorController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final LoanSelectorControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final SelectableDelegate Q;
    public final Object R;

    public LoanSelectorController(LoanSelectorControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ke4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectorController f182987b;

            {
                this.f182987b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanSelectorController loanSelectorController = this.f182987b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanSelectorController.S;
                        qji.b bVarU2 = loanSelectorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector.di.LoanSelectorControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        LoanSelectorControllerContract$InputData loanSelectorControllerContract$InputData = loanSelectorController.L;
                        loanSelectorControllerContract$InputData.getClass();
                        return new a4(c1Var, g4Var2, loanSelectorController, loanSelectorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanSelectorController.S;
                        return (e) ((a4) loanSelectorController.N.getValue()).f118267h.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanSelectorController.S;
                        LoanSelectorController loanSelectorController2 = this.f182987b;
                        return dli.f.a(loanSelectorController2, loanSelectorController2.R2(), v.k(loanSelectorController2.Q, new CellDetailsDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ke4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectorController f182987b;

            {
                this.f182987b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanSelectorController loanSelectorController = this.f182987b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanSelectorController.S;
                        qji.b bVarU2 = loanSelectorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector.di.LoanSelectorControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        LoanSelectorControllerContract$InputData loanSelectorControllerContract$InputData = loanSelectorController.L;
                        loanSelectorControllerContract$InputData.getClass();
                        return new a4(c1Var, g4Var2, loanSelectorController, loanSelectorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanSelectorController.S;
                        return (e) ((a4) loanSelectorController.N.getValue()).f118267h.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanSelectorController.S;
                        LoanSelectorController loanSelectorController2 = this.f182987b;
                        return dli.f.a(loanSelectorController2, loanSelectorController2.R2(), v.k(loanSelectorController2.Q, new CellDetailsDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ke4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectorController f182987b;

            {
                this.f182987b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanSelectorController loanSelectorController = this.f182987b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanSelectorController.S;
                        qji.b bVarU2 = loanSelectorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector.di.LoanSelectorControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        LoanSelectorControllerContract$InputData loanSelectorControllerContract$InputData = loanSelectorController.L;
                        loanSelectorControllerContract$InputData.getClass();
                        return new a4(c1Var, g4Var2, loanSelectorController, loanSelectorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanSelectorController.S;
                        return (e) ((a4) loanSelectorController.N.getValue()).f118267h.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanSelectorController.S;
                        LoanSelectorController loanSelectorController2 = this.f182987b;
                        return dli.f.a(loanSelectorController2, loanSelectorController2.R2(), v.k(loanSelectorController2.Q, new CellDetailsDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ke4.o uiState = (ke4.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonImage(uiState.f182996b);
        TextLocalisedClause textLocalisedClause = uiState.f182997c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.d;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.f);
        largeActionButton.setEnabled(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((ke4.q) R2()).I2(g.f182989a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a4) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.r()), new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ke4.e R2() {
        return (ke4.e) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
