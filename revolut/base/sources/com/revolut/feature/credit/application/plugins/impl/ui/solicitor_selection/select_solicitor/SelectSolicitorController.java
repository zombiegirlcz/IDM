package com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.SelectSolicitorController;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.SelectSolicitorControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.d6;
import dw3.r6;
import g85.f;
import gaa.g;
import gi4.b;
import gi4.d;
import gi4.j;
import gi4.k;
import gi4.l;
import java.util.List;
import jii.m;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/select_solicitor/SelectSolicitorController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lgi4/j;", "Ldli/a;", "Lgi4/k;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectSolicitorController extends PluginScreenController<j> implements a, c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SelectSolicitorController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SelectSolicitorControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public SelectSolicitorController(SelectSolicitorControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: gi4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectSolicitorController f144079b;

            {
                this.f144079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectSolicitorController selectSolicitorController = this.f144079b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectSolicitorController.R;
                        qji.b bVarU2 = selectSolicitorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.di.SelectSolicitorControllerInjector");
                        r6 r6Var = (r6) bVarU2;
                        c1 c1Var = r6Var.f119680c;
                        r6 r6Var2 = r6Var.d;
                        SelectSolicitorControllerContract$InputData selectSolicitorControllerContract$InputData = selectSolicitorController.L;
                        selectSolicitorControllerContract$InputData.getClass();
                        return new d6(c1Var, r6Var2, selectSolicitorController, selectSolicitorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectSolicitorController.R;
                        return (c) ((d6) selectSolicitorController.N.getValue()).f118590j.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectSolicitorController.R;
                        SelectSolicitorController selectSolicitorController2 = this.f144079b;
                        return dli.f.a(selectSolicitorController2, selectSolicitorController2.d(), ((d6) selectSolicitorController2.N.getValue()).c().Q(), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: gi4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectSolicitorController f144079b;

            {
                this.f144079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectSolicitorController selectSolicitorController = this.f144079b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectSolicitorController.R;
                        qji.b bVarU2 = selectSolicitorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.di.SelectSolicitorControllerInjector");
                        r6 r6Var = (r6) bVarU2;
                        c1 c1Var = r6Var.f119680c;
                        r6 r6Var2 = r6Var.d;
                        SelectSolicitorControllerContract$InputData selectSolicitorControllerContract$InputData = selectSolicitorController.L;
                        selectSolicitorControllerContract$InputData.getClass();
                        return new d6(c1Var, r6Var2, selectSolicitorController, selectSolicitorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectSolicitorController.R;
                        return (c) ((d6) selectSolicitorController.N.getValue()).f118590j.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectSolicitorController.R;
                        SelectSolicitorController selectSolicitorController2 = this.f144079b;
                        return dli.f.a(selectSolicitorController2, selectSolicitorController2.d(), ((d6) selectSolicitorController2.N.getValue()).c().Q(), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: gi4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectSolicitorController f144079b;

            {
                this.f144079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelectSolicitorController selectSolicitorController = this.f144079b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectSolicitorController.R;
                        qji.b bVarU2 = selectSolicitorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.di.SelectSolicitorControllerInjector");
                        r6 r6Var = (r6) bVarU2;
                        c1 c1Var = r6Var.f119680c;
                        r6 r6Var2 = r6Var.d;
                        SelectSolicitorControllerContract$InputData selectSolicitorControllerContract$InputData = selectSolicitorController.L;
                        selectSolicitorControllerContract$InputData.getClass();
                        return new d6(c1Var, r6Var2, selectSolicitorController, selectSolicitorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectSolicitorController.R;
                        return (c) ((d6) selectSolicitorController.N.getValue()).f118590j.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectSolicitorController.R;
                        SelectSolicitorController selectSolicitorController2 = this.f144079b;
                        return dli.f.a(selectSolicitorController2, selectSolicitorController2.d(), ((d6) selectSolicitorController2.N.getValue()).c().Q(), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f144086b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f144087c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((l) d()).I2(d.f144080a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d6) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new f(this, null, 13), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.x0()), new g(this, null, 28), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gi4.c d() {
        return (gi4.c) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
