package com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cbh.g;
import ci4.b;
import ci4.c;
import ci4.d;
import ci4.l;
import ci4.m;
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
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.CustomSolicitorDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.CustomSolicitorDetailsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.r6;
import dw3.s1;
import java.util.List;
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
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/custom_solicitor_details/CustomSolicitorDetailsController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lci4/l;", "Ldli/a;", "Lci4/m;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomSolicitorDetailsController extends PluginScreenController<l> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CustomSolicitorDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CustomSolicitorDetailsControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final InputTextDelegate Q;
    public final Object R;

    public CustomSolicitorDetailsController(CustomSolicitorDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ci4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomSolicitorDetailsController f24367b;

            {
                this.f24367b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomSolicitorDetailsController customSolicitorDetailsController = this.f24367b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CustomSolicitorDetailsController.S;
                        qji.b bVarU2 = customSolicitorDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.di.CustomSolicitorDetailsControllerInjector");
                        r6 r6Var = (r6) bVarU2;
                        c1 c1Var = r6Var.f119680c;
                        r6 r6Var2 = r6Var.d;
                        CustomSolicitorDetailsControllerContract$InputData customSolicitorDetailsControllerContract$InputData = customSolicitorDetailsController.L;
                        customSolicitorDetailsControllerContract$InputData.getClass();
                        return new s1(c1Var, r6Var2, customSolicitorDetailsController, customSolicitorDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomSolicitorDetailsController.S;
                        return (e) ((s1) customSolicitorDetailsController.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomSolicitorDetailsController.S;
                        CustomSolicitorDetailsController customSolicitorDetailsController2 = this.f24367b;
                        return dli.f.a(customSolicitorDetailsController2, customSolicitorDetailsController2.d(), u.c(customSolicitorDetailsController2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ci4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomSolicitorDetailsController f24367b;

            {
                this.f24367b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomSolicitorDetailsController customSolicitorDetailsController = this.f24367b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomSolicitorDetailsController.S;
                        qji.b bVarU2 = customSolicitorDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.di.CustomSolicitorDetailsControllerInjector");
                        r6 r6Var = (r6) bVarU2;
                        c1 c1Var = r6Var.f119680c;
                        r6 r6Var2 = r6Var.d;
                        CustomSolicitorDetailsControllerContract$InputData customSolicitorDetailsControllerContract$InputData = customSolicitorDetailsController.L;
                        customSolicitorDetailsControllerContract$InputData.getClass();
                        return new s1(c1Var, r6Var2, customSolicitorDetailsController, customSolicitorDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomSolicitorDetailsController.S;
                        return (e) ((s1) customSolicitorDetailsController.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomSolicitorDetailsController.S;
                        CustomSolicitorDetailsController customSolicitorDetailsController2 = this.f24367b;
                        return dli.f.a(customSolicitorDetailsController2, customSolicitorDetailsController2.d(), u.c(customSolicitorDetailsController2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new InputTextDelegate(null);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ci4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomSolicitorDetailsController f24367b;

            {
                this.f24367b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CustomSolicitorDetailsController customSolicitorDetailsController = this.f24367b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomSolicitorDetailsController.S;
                        qji.b bVarU2 = customSolicitorDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.di.CustomSolicitorDetailsControllerInjector");
                        r6 r6Var = (r6) bVarU2;
                        c1 c1Var = r6Var.f119680c;
                        r6 r6Var2 = r6Var.d;
                        CustomSolicitorDetailsControllerContract$InputData customSolicitorDetailsControllerContract$InputData = customSolicitorDetailsController.L;
                        customSolicitorDetailsControllerContract$InputData.getClass();
                        return new s1(c1Var, r6Var2, customSolicitorDetailsController, customSolicitorDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomSolicitorDetailsController.S;
                        return (e) ((s1) customSolicitorDetailsController.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomSolicitorDetailsController.S;
                        CustomSolicitorDetailsController customSolicitorDetailsController2 = this.f24367b;
                        return dli.f.a(customSolicitorDetailsController2, customSolicitorDetailsController2.d(), u.c(customSolicitorDetailsController2.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f24380b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f24381c);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.e);
        largeActionButton.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s1) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.x0()), new g(this, null, 21), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.e.f121375b), new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ci4.e d() {
        return (ci4.e) this.O.getValue();
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
