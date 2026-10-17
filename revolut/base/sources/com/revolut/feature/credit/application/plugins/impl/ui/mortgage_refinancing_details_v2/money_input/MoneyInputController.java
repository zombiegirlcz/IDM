package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.MoneyInputController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.MoneyInputControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.e4;
import dw3.g4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m84.e;
import me4.b;
import me4.c;
import me4.d;
import me4.g;
import me4.n;
import me4.p;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/money_input/MoneyInputController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lme4/n;", "Ldli/a;", "Lme4/o;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoneyInputController extends PluginScreenController<n> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(MoneyInputController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final MoneyInputControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final InputTextDelegate R;
    public final Object S;

    public MoneyInputController(MoneyInputControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: me4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyInputController f204601b;

            {
                this.f204601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MoneyInputController moneyInputController = this.f204601b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyInputController.T;
                        qji.b bVarU2 = moneyInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.di.MoneyInputControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        MoneyInputControllerContract$InputData moneyInputControllerContract$InputData = moneyInputController.L;
                        moneyInputControllerContract$InputData.getClass();
                        return new e4(c1Var, g4Var2, moneyInputController, moneyInputControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyInputController.T;
                        return (e) ((e4) moneyInputController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = MoneyInputController.T;
                        qd0.b bVarN = ((e4) moneyInputController.N.getValue()).f118642b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = MoneyInputController.T;
                        MoneyInputController moneyInputController2 = this.f204601b;
                        return dli.f.a(moneyInputController2, moneyInputController2.R2(), u.c(moneyInputController2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: me4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyInputController f204601b;

            {
                this.f204601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MoneyInputController moneyInputController = this.f204601b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyInputController.T;
                        qji.b bVarU2 = moneyInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.di.MoneyInputControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        MoneyInputControllerContract$InputData moneyInputControllerContract$InputData = moneyInputController.L;
                        moneyInputControllerContract$InputData.getClass();
                        return new e4(c1Var, g4Var2, moneyInputController, moneyInputControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyInputController.T;
                        return (e) ((e4) moneyInputController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = MoneyInputController.T;
                        qd0.b bVarN = ((e4) moneyInputController.N.getValue()).f118642b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = MoneyInputController.T;
                        MoneyInputController moneyInputController2 = this.f204601b;
                        return dli.f.a(moneyInputController2, moneyInputController2.R2(), u.c(moneyInputController2.R), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: me4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyInputController f204601b;

            {
                this.f204601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MoneyInputController moneyInputController = this.f204601b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyInputController.T;
                        qji.b bVarU2 = moneyInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.di.MoneyInputControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        MoneyInputControllerContract$InputData moneyInputControllerContract$InputData = moneyInputController.L;
                        moneyInputControllerContract$InputData.getClass();
                        return new e4(c1Var, g4Var2, moneyInputController, moneyInputControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyInputController.T;
                        return (e) ((e4) moneyInputController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = MoneyInputController.T;
                        qd0.b bVarN = ((e4) moneyInputController.N.getValue()).f118642b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = MoneyInputController.T;
                        MoneyInputController moneyInputController2 = this.f204601b;
                        return dli.f.a(moneyInputController2, moneyInputController2.R2(), u.c(moneyInputController2.R), 0, null, null, null, 60);
                }
            }
        });
        this.R = new InputTextDelegate(new e(this, 11));
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: me4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyInputController f204601b;

            {
                this.f204601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                MoneyInputController moneyInputController = this.f204601b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyInputController.T;
                        qji.b bVarU2 = moneyInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.di.MoneyInputControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        MoneyInputControllerContract$InputData moneyInputControllerContract$InputData = moneyInputController.L;
                        moneyInputControllerContract$InputData.getClass();
                        return new e4(c1Var, g4Var2, moneyInputController, moneyInputControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyInputController.T;
                        return (e) ((e4) moneyInputController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = MoneyInputController.T;
                        qd0.b bVarN = ((e4) moneyInputController.N.getValue()).f118642b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = MoneyInputController.T;
                        MoneyInputController moneyInputController2 = this.f204601b;
                        return dli.f.a(moneyInputController2, moneyInputController2.R2(), u.c(moneyInputController2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        me4.o uiState = (me4.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonImage(uiState.f204610b);
        TextLocalisedClause textLocalisedClause = uiState.f204611c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.d);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.f);
        largeActionButton.setEnabled(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((p) R2()).I2(g.f204603a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e4) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.R.e.f121375b), new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final me4.e R2() {
        return (me4.e) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
