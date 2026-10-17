package com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import bg4.b;
import bg4.d;
import bg4.f;
import bg4.g;
import bg4.m;
import bg4.u;
import bg4.v;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.CheckoutController;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.CheckoutControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import dw3.c1;
import dw3.g0;
import dw3.y4;
import java.util.List;
import jii.k;
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

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/payment/checkout/CheckoutController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lbg4/u;", "Ldli/a;", "Lbg4/v;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckoutController extends PluginScreenController<u> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CheckoutController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final CheckoutControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final RowDelegate Q;
    public final CellDetailsDelegate R;
    public final FullScreenStateDelegate S;
    public final Object T;

    public CheckoutController(CheckoutControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: bg4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutController f15095b;

            {
                this.f15095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CheckoutController checkoutController = this.f15095b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutController.U;
                        qji.b bVarU2 = checkoutController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.di.CheckoutControllerInjector");
                        y4 y4Var = (y4) bVarU2;
                        c1 c1Var = y4Var.f120208c;
                        y4 y4Var2 = y4Var.d;
                        CheckoutControllerContract$InputData checkoutControllerContract$InputData = checkoutController.L;
                        checkoutControllerContract$InputData.getClass();
                        return new g0(c1Var, y4Var2, checkoutController, checkoutControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CheckoutController.U;
                        return (i) ((g0) checkoutController.N.getValue()).f118787h.get();
                    default:
                        KProperty[] kPropertyArr3 = CheckoutController.U;
                        CheckoutController checkoutController2 = this.f15095b;
                        return dli.f.a(checkoutController2, checkoutController2.d(), zhm.v.k(checkoutController2.Q, checkoutController2.R, checkoutController2.S, new RowLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsPriceDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: bg4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutController f15095b;

            {
                this.f15095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CheckoutController checkoutController = this.f15095b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutController.U;
                        qji.b bVarU2 = checkoutController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.di.CheckoutControllerInjector");
                        y4 y4Var = (y4) bVarU2;
                        c1 c1Var = y4Var.f120208c;
                        y4 y4Var2 = y4Var.d;
                        CheckoutControllerContract$InputData checkoutControllerContract$InputData = checkoutController.L;
                        checkoutControllerContract$InputData.getClass();
                        return new g0(c1Var, y4Var2, checkoutController, checkoutControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CheckoutController.U;
                        return (i) ((g0) checkoutController.N.getValue()).f118787h.get();
                    default:
                        KProperty[] kPropertyArr3 = CheckoutController.U;
                        CheckoutController checkoutController2 = this.f15095b;
                        return dli.f.a(checkoutController2, checkoutController2.d(), zhm.v.k(checkoutController2.Q, checkoutController2.R, checkoutController2.S, new RowLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsPriceDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new RowDelegate(null, null, 7);
        this.R = new CellDetailsDelegate();
        this.S = new FullScreenStateDelegate();
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: bg4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutController f15095b;

            {
                this.f15095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CheckoutController checkoutController = this.f15095b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutController.U;
                        qji.b bVarU2 = checkoutController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.di.CheckoutControllerInjector");
                        y4 y4Var = (y4) bVarU2;
                        c1 c1Var = y4Var.f120208c;
                        y4 y4Var2 = y4Var.d;
                        CheckoutControllerContract$InputData checkoutControllerContract$InputData = checkoutController.L;
                        checkoutControllerContract$InputData.getClass();
                        return new g0(c1Var, y4Var2, checkoutController, checkoutControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CheckoutController.U;
                        return (i) ((g0) checkoutController.N.getValue()).f118787h.get();
                    default:
                        KProperty[] kPropertyArr3 = CheckoutController.U;
                        CheckoutController checkoutController2 = this.f15095b;
                        return dli.f.a(checkoutController2, checkoutController2.d(), zhm.v.k(checkoutController2.Q, checkoutController2.R, checkoutController2.S, new RowLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsPriceDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v uiState = (v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = uiState.f15116b;
        i iVar = uiState.d;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f15117c;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        ActionFooterView actionFooterView = d3().f174533b;
        actionFooterView.setVisibility(iVar == null ? 8 : 0);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) d()).J2(m.f15108a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.e), new bg4.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new f(this, null), 3);
        ViewController.P2(this, new an9.i(rd0.e.b(this.R.d), 29), new bg4.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new g(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final bg4.i d() {
        return (bg4.i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
