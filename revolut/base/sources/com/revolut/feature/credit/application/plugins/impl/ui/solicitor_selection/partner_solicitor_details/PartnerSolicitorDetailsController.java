package com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details;

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
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.PartnerSolicitorDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.PartnerSolicitorDetailsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.r6;
import dw3.w4;
import ei4.d;
import ei4.i;
import ei4.j;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/partner_solicitor_details/PartnerSolicitorDetailsController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lei4/i;", "Ldli/a;", "Lei4/j;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PartnerSolicitorDetailsController extends PluginScreenController<i> implements a, c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PartnerSolicitorDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PartnerSolicitorDetailsControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public PartnerSolicitorDetailsController(PartnerSolicitorDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ei4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PartnerSolicitorDetailsController f126398b;

            {
                this.f126398b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PartnerSolicitorDetailsController partnerSolicitorDetailsController = this.f126398b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PartnerSolicitorDetailsController.R;
                        qji.b bVarU2 = partnerSolicitorDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.di.PartnerSolicitorDetailsControllerInjector");
                        r6 r6Var = (r6) bVarU2;
                        c1 c1Var = r6Var.f119680c;
                        r6 r6Var2 = r6Var.d;
                        PartnerSolicitorDetailsControllerContract$InputData partnerSolicitorDetailsControllerContract$InputData = partnerSolicitorDetailsController.L;
                        partnerSolicitorDetailsControllerContract$InputData.getClass();
                        return new w4(c1Var, r6Var2, partnerSolicitorDetailsController, partnerSolicitorDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PartnerSolicitorDetailsController.R;
                        return (e) ((w4) partnerSolicitorDetailsController.N.getValue()).f120065j.get();
                    default:
                        KProperty[] kPropertyArr3 = PartnerSolicitorDetailsController.R;
                        PartnerSolicitorDetailsController partnerSolicitorDetailsController2 = this.f126398b;
                        return dli.f.a(partnerSolicitorDetailsController2, (e) partnerSolicitorDetailsController2.O.getValue(), ((w4) partnerSolicitorDetailsController2.N.getValue()).c().Q(), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ei4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PartnerSolicitorDetailsController f126398b;

            {
                this.f126398b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PartnerSolicitorDetailsController partnerSolicitorDetailsController = this.f126398b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PartnerSolicitorDetailsController.R;
                        qji.b bVarU2 = partnerSolicitorDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.di.PartnerSolicitorDetailsControllerInjector");
                        r6 r6Var = (r6) bVarU2;
                        c1 c1Var = r6Var.f119680c;
                        r6 r6Var2 = r6Var.d;
                        PartnerSolicitorDetailsControllerContract$InputData partnerSolicitorDetailsControllerContract$InputData = partnerSolicitorDetailsController.L;
                        partnerSolicitorDetailsControllerContract$InputData.getClass();
                        return new w4(c1Var, r6Var2, partnerSolicitorDetailsController, partnerSolicitorDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PartnerSolicitorDetailsController.R;
                        return (e) ((w4) partnerSolicitorDetailsController.N.getValue()).f120065j.get();
                    default:
                        KProperty[] kPropertyArr3 = PartnerSolicitorDetailsController.R;
                        PartnerSolicitorDetailsController partnerSolicitorDetailsController2 = this.f126398b;
                        return dli.f.a(partnerSolicitorDetailsController2, (e) partnerSolicitorDetailsController2.O.getValue(), ((w4) partnerSolicitorDetailsController2.N.getValue()).c().Q(), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, ei4.c.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ei4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PartnerSolicitorDetailsController f126398b;

            {
                this.f126398b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PartnerSolicitorDetailsController partnerSolicitorDetailsController = this.f126398b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PartnerSolicitorDetailsController.R;
                        qji.b bVarU2 = partnerSolicitorDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.di.PartnerSolicitorDetailsControllerInjector");
                        r6 r6Var = (r6) bVarU2;
                        c1 c1Var = r6Var.f119680c;
                        r6 r6Var2 = r6Var.d;
                        PartnerSolicitorDetailsControllerContract$InputData partnerSolicitorDetailsControllerContract$InputData = partnerSolicitorDetailsController.L;
                        partnerSolicitorDetailsControllerContract$InputData.getClass();
                        return new w4(c1Var, r6Var2, partnerSolicitorDetailsController, partnerSolicitorDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PartnerSolicitorDetailsController.R;
                        return (e) ((w4) partnerSolicitorDetailsController.N.getValue()).f120065j.get();
                    default:
                        KProperty[] kPropertyArr3 = PartnerSolicitorDetailsController.R;
                        PartnerSolicitorDetailsController partnerSolicitorDetailsController2 = this.f126398b;
                        return dli.f.a(partnerSolicitorDetailsController2, (e) partnerSolicitorDetailsController2.O.getValue(), ((w4) partnerSolicitorDetailsController2.N.getValue()).c().Q(), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f126403b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(uiState.f126404c);
        navBarWithToolbar.setEndImage(uiState.d);
        d3().f174564b.setText(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w4) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (ei4.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    public final ax4.d d() {
        return (ei4.e) this.O.getValue();
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
