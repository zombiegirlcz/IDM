package com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.ConstructorCreditPromptController;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.ConstructorCreditPromptControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.c1;
import dw3.q0;
import dw3.q1;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s74.l;
import s74.n;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/constructor/ConstructorCreditPromptController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/constructor/a;", "Ldli/a;", "Ls74/n;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConstructorCreditPromptController extends PluginScreenController<a> implements dli.a, c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ConstructorCreditPromptController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final ConstructorCreditPromptControllerContract$InputData L;
    public final int M;
    public AnalyticsContext N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ConstructorCreditPromptController(ConstructorCreditPromptControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_action_footer;
        this.N = inputData.d;
        this.O = s.t(this, s74.b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: s74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConstructorCreditPromptController f260506b;

            {
                this.f260506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConstructorCreditPromptController constructorCreditPromptController = this.f260506b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConstructorCreditPromptController.S;
                        qji.b bVarU2 = constructorCreditPromptController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.di.ConstructorCreditPromptControllerInjector");
                        q1 q1Var = (q1) bVarU2;
                        c1 c1Var = q1Var.f119560b;
                        q1 q1Var2 = q1Var.f119561c;
                        ConstructorCreditPromptControllerContract$InputData constructorCreditPromptControllerContract$InputData = constructorCreditPromptController.L;
                        constructorCreditPromptControllerContract$InputData.getClass();
                        return new q0(c1Var, q1Var2, constructorCreditPromptController, constructorCreditPromptControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConstructorCreditPromptController.S;
                        return (l) ((q0) constructorCreditPromptController.P.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = ConstructorCreditPromptController.S;
                        ConstructorCreditPromptController constructorCreditPromptController2 = this.f260506b;
                        return dli.f.a(constructorCreditPromptController2, constructorCreditPromptController2.d(), ((q0) constructorCreditPromptController2.P.getValue()).c().Q(), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: s74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConstructorCreditPromptController f260506b;

            {
                this.f260506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConstructorCreditPromptController constructorCreditPromptController = this.f260506b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConstructorCreditPromptController.S;
                        qji.b bVarU2 = constructorCreditPromptController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.di.ConstructorCreditPromptControllerInjector");
                        q1 q1Var = (q1) bVarU2;
                        c1 c1Var = q1Var.f119560b;
                        q1 q1Var2 = q1Var.f119561c;
                        ConstructorCreditPromptControllerContract$InputData constructorCreditPromptControllerContract$InputData = constructorCreditPromptController.L;
                        constructorCreditPromptControllerContract$InputData.getClass();
                        return new q0(c1Var, q1Var2, constructorCreditPromptController, constructorCreditPromptControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConstructorCreditPromptController.S;
                        return (l) ((q0) constructorCreditPromptController.P.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = ConstructorCreditPromptController.S;
                        ConstructorCreditPromptController constructorCreditPromptController2 = this.f260506b;
                        return dli.f.a(constructorCreditPromptController2, constructorCreditPromptController2.d(), ((q0) constructorCreditPromptController2.P.getValue()).c().Q(), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: s74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConstructorCreditPromptController f260506b;

            {
                this.f260506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConstructorCreditPromptController constructorCreditPromptController = this.f260506b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConstructorCreditPromptController.S;
                        qji.b bVarU2 = constructorCreditPromptController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.di.ConstructorCreditPromptControllerInjector");
                        q1 q1Var = (q1) bVarU2;
                        c1 c1Var = q1Var.f119560b;
                        q1 q1Var2 = q1Var.f119561c;
                        ConstructorCreditPromptControllerContract$InputData constructorCreditPromptControllerContract$InputData = constructorCreditPromptController.L;
                        constructorCreditPromptControllerContract$InputData.getClass();
                        return new q0(c1Var, q1Var2, constructorCreditPromptController, constructorCreditPromptControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConstructorCreditPromptController.S;
                        return (l) ((q0) constructorCreditPromptController.P.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = ConstructorCreditPromptController.S;
                        ConstructorCreditPromptController constructorCreditPromptController2 = this.f260506b;
                        return dli.f.a(constructorCreditPromptController2, constructorCreditPromptController2.d(), ((q0) constructorCreditPromptController2.P.getValue()).c().Q(), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        ResourceImage resourceImage = uiState.f260517a;
        i iVar = uiState.e;
        Clause clause = uiState.d;
        navBarWithToolbar.setNavigationButtonImage(resourceImage);
        TextLocalisedClause textLocalisedClause = uiState.f260518b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause2 = uiState.f260519c;
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
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
        ((b) d()).J2(s74.h.f260512a);
        return true;
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q0) this.P.getValue();
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getC0() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new s1k.b(this, null, 11), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.x0()), new s74.e(this, null, 0), 3);
        ViewController.P2(this, new ryj.w(rd0.e.b(d3().f174533b.f), 13), new s74.e(this, null, 1), 3);
        ViewController.P2(this, new ryj.w(rd0.e.b(d3().f174533b.f58955g), 14), new s74.e(this, null, 2), 3);
    }

    public final k d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.Q.getValue();
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
