package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.SingleSelectionController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.SingleSelectionControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.g4;
import dw3.p6;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ocb.d;
import oe4.c;
import oe4.f;
import oe4.g;
import oe4.o;
import oe4.p;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/single_selection/SingleSelectionController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Loe4/o;", "Ldli/a;", "Loe4/p;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SingleSelectionController extends PluginScreenController<o> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SingleSelectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SingleSelectionControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final RowDelegate Q;
    public final InputDisclosureDelegate R;
    public final Object S;

    public SingleSelectionController(SingleSelectionControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: oe4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleSelectionController f224523b;

            {
                this.f224523b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SingleSelectionController singleSelectionController = this.f224523b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SingleSelectionController.T;
                        qji.b bVarU2 = singleSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.di.SingleSelectionControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        SingleSelectionControllerContract$InputData singleSelectionControllerContract$InputData = singleSelectionController.L;
                        singleSelectionControllerContract$InputData.getClass();
                        return new p6(c1Var, g4Var2, singleSelectionController, singleSelectionControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SingleSelectionController.T;
                        return (f) ((p6) singleSelectionController.N.getValue()).f119532h.get();
                    default:
                        KProperty[] kPropertyArr3 = SingleSelectionController.T;
                        SingleSelectionController singleSelectionController2 = this.f224523b;
                        return dli.f.a(singleSelectionController2, singleSelectionController2.d(), v.k(singleSelectionController2.Q, singleSelectionController2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: oe4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleSelectionController f224523b;

            {
                this.f224523b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SingleSelectionController singleSelectionController = this.f224523b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SingleSelectionController.T;
                        qji.b bVarU2 = singleSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.di.SingleSelectionControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        SingleSelectionControllerContract$InputData singleSelectionControllerContract$InputData = singleSelectionController.L;
                        singleSelectionControllerContract$InputData.getClass();
                        return new p6(c1Var, g4Var2, singleSelectionController, singleSelectionControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SingleSelectionController.T;
                        return (f) ((p6) singleSelectionController.N.getValue()).f119532h.get();
                    default:
                        KProperty[] kPropertyArr3 = SingleSelectionController.T;
                        SingleSelectionController singleSelectionController2 = this.f224523b;
                        return dli.f.a(singleSelectionController2, singleSelectionController2.d(), v.k(singleSelectionController2.Q, singleSelectionController2.R), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, c.f);
        this.Q = new RowDelegate(null, null, 7);
        this.R = new InputDisclosureDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: oe4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleSelectionController f224523b;

            {
                this.f224523b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SingleSelectionController singleSelectionController = this.f224523b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SingleSelectionController.T;
                        qji.b bVarU2 = singleSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.di.SingleSelectionControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        SingleSelectionControllerContract$InputData singleSelectionControllerContract$InputData = singleSelectionController.L;
                        singleSelectionControllerContract$InputData.getClass();
                        return new p6(c1Var, g4Var2, singleSelectionController, singleSelectionControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SingleSelectionController.T;
                        return (f) ((p6) singleSelectionController.N.getValue()).f119532h.get();
                    default:
                        KProperty[] kPropertyArr3 = SingleSelectionController.T;
                        SingleSelectionController singleSelectionController2 = this.f224523b;
                        return dli.f.a(singleSelectionController2, singleSelectionController2.d(), v.k(singleSelectionController2.Q, singleSelectionController2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ResourceImage resourceImage = uiState.f224532b;
        Clause clause = uiState.e;
        navBarWithToolbar.setNavigationButtonImage(resourceImage);
        TextLocalisedClause textLocalisedClause = uiState.f224533c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause2 = uiState.d;
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((oe4.q) d()).I2(g.f224524a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p6) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.x0()), new o95.c(this, continuation, 14), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new oe4.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52538c), new oe4.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
