package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary;

import af4.b;
import af4.d;
import af4.f;
import af4.g;
import af4.j;
import af4.p;
import af4.u;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.MortgageValuationSummaryController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.MortgageValuationSummaryControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.j4;
import dw3.k4;
import hx7.i;
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
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_valuation/summary/MortgageValuationSummaryController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Laf4/p;", "Ldli/a;", "Laf4/q;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MortgageValuationSummaryController extends PluginScreenController<p> implements a, c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(MortgageValuationSummaryController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final MortgageValuationSummaryControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public MortgageValuationSummaryController(MortgageValuationSummaryControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: af4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MortgageValuationSummaryController f3861b;

            {
                this.f3861b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MortgageValuationSummaryController mortgageValuationSummaryController = this.f3861b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MortgageValuationSummaryController.S;
                        qji.b bVarU2 = mortgageValuationSummaryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.di.MortgageValuationSummaryControllerInjector");
                        j4 j4Var = (j4) bVarU2;
                        c1 c1Var = j4Var.f119033c;
                        j4 j4Var2 = j4Var.d;
                        MortgageValuationSummaryControllerContract$InputData mortgageValuationSummaryControllerContract$InputData = mortgageValuationSummaryController.L;
                        mortgageValuationSummaryControllerContract$InputData.getClass();
                        return new k4(c1Var, j4Var2, mortgageValuationSummaryController, mortgageValuationSummaryControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MortgageValuationSummaryController.S;
                        return (g) ((k4) mortgageValuationSummaryController.N.getValue()).f119115j.get();
                    default:
                        KProperty[] kPropertyArr3 = MortgageValuationSummaryController.S;
                        MortgageValuationSummaryController mortgageValuationSummaryController2 = this.f3861b;
                        return dli.f.a(mortgageValuationSummaryController2, mortgageValuationSummaryController2.d(), d0.F0(mortgageValuationSummaryController2.Q, ((k4) mortgageValuationSummaryController2.N.getValue()).c().Q()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: af4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MortgageValuationSummaryController f3861b;

            {
                this.f3861b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MortgageValuationSummaryController mortgageValuationSummaryController = this.f3861b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MortgageValuationSummaryController.S;
                        qji.b bVarU2 = mortgageValuationSummaryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.di.MortgageValuationSummaryControllerInjector");
                        j4 j4Var = (j4) bVarU2;
                        c1 c1Var = j4Var.f119033c;
                        j4 j4Var2 = j4Var.d;
                        MortgageValuationSummaryControllerContract$InputData mortgageValuationSummaryControllerContract$InputData = mortgageValuationSummaryController.L;
                        mortgageValuationSummaryControllerContract$InputData.getClass();
                        return new k4(c1Var, j4Var2, mortgageValuationSummaryController, mortgageValuationSummaryControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MortgageValuationSummaryController.S;
                        return (g) ((k4) mortgageValuationSummaryController.N.getValue()).f119115j.get();
                    default:
                        KProperty[] kPropertyArr3 = MortgageValuationSummaryController.S;
                        MortgageValuationSummaryController mortgageValuationSummaryController2 = this.f3861b;
                        return dli.f.a(mortgageValuationSummaryController2, mortgageValuationSummaryController2.d(), d0.F0(mortgageValuationSummaryController2.Q, ((k4) mortgageValuationSummaryController2.N.getValue()).c().Q()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: af4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MortgageValuationSummaryController f3861b;

            {
                this.f3861b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MortgageValuationSummaryController mortgageValuationSummaryController = this.f3861b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MortgageValuationSummaryController.S;
                        qji.b bVarU2 = mortgageValuationSummaryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.di.MortgageValuationSummaryControllerInjector");
                        j4 j4Var = (j4) bVarU2;
                        c1 c1Var = j4Var.f119033c;
                        j4 j4Var2 = j4Var.d;
                        MortgageValuationSummaryControllerContract$InputData mortgageValuationSummaryControllerContract$InputData = mortgageValuationSummaryController.L;
                        mortgageValuationSummaryControllerContract$InputData.getClass();
                        return new k4(c1Var, j4Var2, mortgageValuationSummaryController, mortgageValuationSummaryControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MortgageValuationSummaryController.S;
                        return (g) ((k4) mortgageValuationSummaryController.N.getValue()).f119115j.get();
                    default:
                        KProperty[] kPropertyArr3 = MortgageValuationSummaryController.S;
                        MortgageValuationSummaryController mortgageValuationSummaryController2 = this.f3861b;
                        return dli.f.a(mortgageValuationSummaryController2, mortgageValuationSummaryController2.d(), d0.F0(mortgageValuationSummaryController2.Q, ((k4) mortgageValuationSummaryController2.N.getValue()).c().Q()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        af4.q uiState = (af4.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        i.z(screenRecyclerNavbarActionFooterNavBar, uiState.f3872b);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        aw0.i iVar = uiState.f3873c;
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            d3().f174533b.setModel(iVar);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((u) d()).I2(j.f3866a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k4) this.N.getValue();
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
        ViewController.P2(this, new a15.d(rd0.e.b(d3().f174534c.s0()), 22), new af4.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new f(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
