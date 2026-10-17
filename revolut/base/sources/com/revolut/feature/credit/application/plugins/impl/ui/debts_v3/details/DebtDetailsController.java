package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.c1;
import dw3.u4;
import dw3.v1;
import j2c.n;
import j94.b;
import j94.c;
import j94.d;
import j94.g;
import j94.h;
import j94.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/details/DebtDetailsController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lj94/h;", "Ldli/a;", "Lj94/i;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DebtDetailsController extends PluginScreenController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DebtDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final DebtDetailsControllerContract$InputData L;
    public final int M;
    public final ao.h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public DebtDetailsController(DebtDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: j94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f172279b;

            {
                this.f172279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DebtDetailsController debtDetailsController = this.f172279b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DebtDetailsController.T;
                        qd0.b bVarN = ((v1) debtDetailsController.Q.getValue()).f119966b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = DebtDetailsController.T;
                        return new InputTextDelegate(new n(debtDetailsController, 17));
                    case 2:
                        KProperty[] kPropertyArr3 = DebtDetailsController.T;
                        qji.b bVarU2 = debtDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.di.DebtDetailsControllerInjector");
                        u4 u4Var = (u4) bVarU2;
                        c1 c1Var = u4Var.f119906c;
                        u4 u4Var2 = u4Var.d;
                        DebtDetailsControllerContract$InputData debtDetailsControllerContract$InputData = debtDetailsController.L;
                        debtDetailsControllerContract$InputData.getClass();
                        return new v1(c1Var, u4Var2, debtDetailsControllerContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = DebtDetailsController.T;
                        return (g) ((v1) debtDetailsController.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = DebtDetailsController.T;
                        DebtDetailsController debtDetailsController2 = this.f172279b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.R2(), u.c((InputTextDelegate) debtDetailsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: j94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f172279b;

            {
                this.f172279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DebtDetailsController debtDetailsController = this.f172279b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DebtDetailsController.T;
                        qd0.b bVarN = ((v1) debtDetailsController.Q.getValue()).f119966b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = DebtDetailsController.T;
                        return new InputTextDelegate(new n(debtDetailsController, 17));
                    case 2:
                        KProperty[] kPropertyArr3 = DebtDetailsController.T;
                        qji.b bVarU2 = debtDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.di.DebtDetailsControllerInjector");
                        u4 u4Var = (u4) bVarU2;
                        c1 c1Var = u4Var.f119906c;
                        u4 u4Var2 = u4Var.d;
                        DebtDetailsControllerContract$InputData debtDetailsControllerContract$InputData = debtDetailsController.L;
                        debtDetailsControllerContract$InputData.getClass();
                        return new v1(c1Var, u4Var2, debtDetailsControllerContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = DebtDetailsController.T;
                        return (g) ((v1) debtDetailsController.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = DebtDetailsController.T;
                        DebtDetailsController debtDetailsController2 = this.f172279b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.R2(), u.c((InputTextDelegate) debtDetailsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: j94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f172279b;

            {
                this.f172279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DebtDetailsController debtDetailsController = this.f172279b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DebtDetailsController.T;
                        qd0.b bVarN = ((v1) debtDetailsController.Q.getValue()).f119966b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = DebtDetailsController.T;
                        return new InputTextDelegate(new n(debtDetailsController, 17));
                    case 2:
                        KProperty[] kPropertyArr3 = DebtDetailsController.T;
                        qji.b bVarU2 = debtDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.di.DebtDetailsControllerInjector");
                        u4 u4Var = (u4) bVarU2;
                        c1 c1Var = u4Var.f119906c;
                        u4 u4Var2 = u4Var.d;
                        DebtDetailsControllerContract$InputData debtDetailsControllerContract$InputData = debtDetailsController.L;
                        debtDetailsControllerContract$InputData.getClass();
                        return new v1(c1Var, u4Var2, debtDetailsControllerContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = DebtDetailsController.T;
                        return (g) ((v1) debtDetailsController.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = DebtDetailsController.T;
                        DebtDetailsController debtDetailsController2 = this.f172279b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.R2(), u.c((InputTextDelegate) debtDetailsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: j94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f172279b;

            {
                this.f172279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DebtDetailsController debtDetailsController = this.f172279b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DebtDetailsController.T;
                        qd0.b bVarN = ((v1) debtDetailsController.Q.getValue()).f119966b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = DebtDetailsController.T;
                        return new InputTextDelegate(new n(debtDetailsController, 17));
                    case 2:
                        KProperty[] kPropertyArr3 = DebtDetailsController.T;
                        qji.b bVarU2 = debtDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.di.DebtDetailsControllerInjector");
                        u4 u4Var = (u4) bVarU2;
                        c1 c1Var = u4Var.f119906c;
                        u4 u4Var2 = u4Var.d;
                        DebtDetailsControllerContract$InputData debtDetailsControllerContract$InputData = debtDetailsController.L;
                        debtDetailsControllerContract$InputData.getClass();
                        return new v1(c1Var, u4Var2, debtDetailsControllerContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = DebtDetailsController.T;
                        return (g) ((v1) debtDetailsController.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = DebtDetailsController.T;
                        DebtDetailsController debtDetailsController2 = this.f172279b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.R2(), u.c((InputTextDelegate) debtDetailsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: j94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f172279b;

            {
                this.f172279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                DebtDetailsController debtDetailsController = this.f172279b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DebtDetailsController.T;
                        qd0.b bVarN = ((v1) debtDetailsController.Q.getValue()).f119966b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = DebtDetailsController.T;
                        return new InputTextDelegate(new n(debtDetailsController, 17));
                    case 2:
                        KProperty[] kPropertyArr3 = DebtDetailsController.T;
                        qji.b bVarU2 = debtDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.di.DebtDetailsControllerInjector");
                        u4 u4Var = (u4) bVarU2;
                        c1 c1Var = u4Var.f119906c;
                        u4 u4Var2 = u4Var.d;
                        DebtDetailsControllerContract$InputData debtDetailsControllerContract$InputData = debtDetailsController.L;
                        debtDetailsControllerContract$InputData.getClass();
                        return new v1(c1Var, u4Var2, debtDetailsControllerContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = DebtDetailsController.T;
                        return (g) ((v1) debtDetailsController.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = DebtDetailsController.T;
                        DebtDetailsController debtDetailsController2 = this.f172279b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.R2(), u.c((InputTextDelegate) debtDetailsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f172282a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f172283b;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setMenuItems(uiState.e);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.f172284c);
        largeActionButton.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v1) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Continuation continuation = null;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new j82.q(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ?? r102 = this.P;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r102.getValue()).e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r102.getValue()).f52575g.f121375b), new j94.e(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.R.getValue();
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
