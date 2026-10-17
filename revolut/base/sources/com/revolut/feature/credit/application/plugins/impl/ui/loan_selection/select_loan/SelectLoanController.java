package com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.SelectLoanController;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.SelectLoanControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.c6;
import dw3.z3;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ld4.b;
import ld4.c;
import ld4.d;
import ld4.f;
import ld4.l;
import ld4.m;
import ld4.n;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/loan_selection/select_loan/SelectLoanController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lld4/l;", "Ldli/a;", "Lld4/m;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectLoanController extends PluginScreenController<l> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SelectLoanController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SelectLoanControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Lazy Q;
    public final Lazy R;
    public final Object S;

    public SelectLoanController(SelectLoanControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ld4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectLoanController f194022b;

            {
                this.f194022b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectLoanController selectLoanController = this.f194022b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectLoanController.T;
                        qji.b bVarU2 = selectLoanController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.di.SelectLoanControllerInjector");
                        z3 z3Var = (z3) bVarU2;
                        c1 c1Var = z3Var.f120273c;
                        z3 z3Var2 = z3Var.d;
                        SelectLoanControllerContract$InputData selectLoanControllerContract$InputData = selectLoanController.L;
                        selectLoanControllerContract$InputData.getClass();
                        return new c6(c1Var, z3Var2, selectLoanController, selectLoanControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectLoanController.T;
                        return (n) ((c6) selectLoanController.N.getValue()).f118518j.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectLoanController.T;
                        SelectLoanController selectLoanController2 = this.f194022b;
                        return dli.f.a(selectLoanController2, selectLoanController2.R2(), v.k((RowDelegate) selectLoanController2.Q.getValue(), (FullScreenStateDelegate) selectLoanController2.R.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ld4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectLoanController f194022b;

            {
                this.f194022b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectLoanController selectLoanController = this.f194022b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectLoanController.T;
                        qji.b bVarU2 = selectLoanController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.di.SelectLoanControllerInjector");
                        z3 z3Var = (z3) bVarU2;
                        c1 c1Var = z3Var.f120273c;
                        z3 z3Var2 = z3Var.d;
                        SelectLoanControllerContract$InputData selectLoanControllerContract$InputData = selectLoanController.L;
                        selectLoanControllerContract$InputData.getClass();
                        return new c6(c1Var, z3Var2, selectLoanController, selectLoanControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectLoanController.T;
                        return (n) ((c6) selectLoanController.N.getValue()).f118518j.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectLoanController.T;
                        SelectLoanController selectLoanController2 = this.f194022b;
                        return dli.f.a(selectLoanController2, selectLoanController2.R2(), v.k((RowDelegate) selectLoanController2.Q.getValue(), (FullScreenStateDelegate) selectLoanController2.R.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = j.b(new l92.h(21));
        this.R = j.b(new l92.h(22));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ld4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectLoanController f194022b;

            {
                this.f194022b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelectLoanController selectLoanController = this.f194022b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectLoanController.T;
                        qji.b bVarU2 = selectLoanController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.di.SelectLoanControllerInjector");
                        z3 z3Var = (z3) bVarU2;
                        c1 c1Var = z3Var.f120273c;
                        z3 z3Var2 = z3Var.d;
                        SelectLoanControllerContract$InputData selectLoanControllerContract$InputData = selectLoanController.L;
                        selectLoanControllerContract$InputData.getClass();
                        return new c6(c1Var, z3Var2, selectLoanController, selectLoanControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectLoanController.T;
                        return (n) ((c6) selectLoanController.N.getValue()).f118518j.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectLoanController.T;
                        SelectLoanController selectLoanController2 = this.f194022b;
                        return dli.f.a(selectLoanController2, selectLoanController2.R2(), v.k((RowDelegate) selectLoanController2.Q.getValue(), (FullScreenStateDelegate) selectLoanController2.R.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f194030b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        R2().I2(f.f194024a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c6) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new la8.h(this, null, 6), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), new d(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
