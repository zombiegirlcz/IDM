package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ticketor;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ticketor.ManualUnderwritingTicketorContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ticketor.ManualUnderwritingTicketorController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dw3.b4;
import dw3.c1;
import dw3.d4;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rr0.f;
import te0.w;
import tx0.j0;
import vc.s;
import xd4.b;
import xd4.c;
import xd4.d;
import xd4.g;
import xd4.i;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ticketor/ManualUnderwritingTicketorController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lxd4/b;", "Ldli/a;", "Lxd4/d;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManualUnderwritingTicketorController extends PluginScreenController<b> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ManualUnderwritingTicketorController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ManualUnderwritingTicketorContract$InputData L;
    public final int M;
    public final Object N;
    public f O;
    public final Object P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final h S;

    public ManualUnderwritingTicketorController(ManualUnderwritingTicketorContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xd4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualUnderwritingTicketorController f304263b;

            {
                this.f304263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ManualUnderwritingTicketorController manualUnderwritingTicketorController = this.f304263b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManualUnderwritingTicketorController.T;
                        qji.b bVarU2 = manualUnderwritingTicketorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ticketor.di.ManualUnderwritingTicketorScreenInjector");
                        b4 b4Var = (b4) bVarU2;
                        c1 c1Var = b4Var.f118345c;
                        b4 b4Var2 = b4Var.d;
                        ManualUnderwritingTicketorContract$InputData manualUnderwritingTicketorContract$InputData = manualUnderwritingTicketorController.L;
                        manualUnderwritingTicketorContract$InputData.getClass();
                        return new d4(c1Var, b4Var2, manualUnderwritingTicketorContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ManualUnderwritingTicketorController.T;
                        return (c) ((d4) manualUnderwritingTicketorController.N.getValue()).f118567c.get();
                    default:
                        KProperty[] kPropertyArr3 = ManualUnderwritingTicketorController.T;
                        ManualUnderwritingTicketorController manualUnderwritingTicketorController2 = this.f304263b;
                        return dli.f.a(manualUnderwritingTicketorController2, manualUnderwritingTicketorController2.d(), v.k(manualUnderwritingTicketorController2.Q, new ProgressStepVerticalV2Delegate(), new ProgressStepVerticalLoadingV2Delegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xd4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualUnderwritingTicketorController f304263b;

            {
                this.f304263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ManualUnderwritingTicketorController manualUnderwritingTicketorController = this.f304263b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManualUnderwritingTicketorController.T;
                        qji.b bVarU2 = manualUnderwritingTicketorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ticketor.di.ManualUnderwritingTicketorScreenInjector");
                        b4 b4Var = (b4) bVarU2;
                        c1 c1Var = b4Var.f118345c;
                        b4 b4Var2 = b4Var.d;
                        ManualUnderwritingTicketorContract$InputData manualUnderwritingTicketorContract$InputData = manualUnderwritingTicketorController.L;
                        manualUnderwritingTicketorContract$InputData.getClass();
                        return new d4(c1Var, b4Var2, manualUnderwritingTicketorContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ManualUnderwritingTicketorController.T;
                        return (c) ((d4) manualUnderwritingTicketorController.N.getValue()).f118567c.get();
                    default:
                        KProperty[] kPropertyArr3 = ManualUnderwritingTicketorController.T;
                        ManualUnderwritingTicketorController manualUnderwritingTicketorController2 = this.f304263b;
                        return dli.f.a(manualUnderwritingTicketorController2, manualUnderwritingTicketorController2.d(), v.k(manualUnderwritingTicketorController2.Q, new ProgressStepVerticalV2Delegate(), new ProgressStepVerticalLoadingV2Delegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: xd4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualUnderwritingTicketorController f304263b;

            {
                this.f304263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ManualUnderwritingTicketorController manualUnderwritingTicketorController = this.f304263b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManualUnderwritingTicketorController.T;
                        qji.b bVarU2 = manualUnderwritingTicketorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ticketor.di.ManualUnderwritingTicketorScreenInjector");
                        b4 b4Var = (b4) bVarU2;
                        c1 c1Var = b4Var.f118345c;
                        b4 b4Var2 = b4Var.d;
                        ManualUnderwritingTicketorContract$InputData manualUnderwritingTicketorContract$InputData = manualUnderwritingTicketorController.L;
                        manualUnderwritingTicketorContract$InputData.getClass();
                        return new d4(c1Var, b4Var2, manualUnderwritingTicketorContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ManualUnderwritingTicketorController.T;
                        return (c) ((d4) manualUnderwritingTicketorController.N.getValue()).f118567c.get();
                    default:
                        KProperty[] kPropertyArr3 = ManualUnderwritingTicketorController.T;
                        ManualUnderwritingTicketorController manualUnderwritingTicketorController2 = this.f304263b;
                        return dli.f.a(manualUnderwritingTicketorController2, manualUnderwritingTicketorController2.d(), v.k(manualUnderwritingTicketorController2.Q, new ProgressStepVerticalV2Delegate(), new ProgressStepVerticalLoadingV2Delegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = s.t(this, xd4.f.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        f fVar = this.O;
        if (fVar == null) {
            Intrinsics.r("loadingButtonController");
            throw null;
        }
        boolean z = uiState.d;
        TextLocalisedClause textLocalisedClause = uiState.f304260b;
        TextLocalisedClause textLocalisedClause2 = uiState.f304259a;
        fVar.b(z);
        u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        LargeActionButton goToButton = uVarD3.f174564b;
        navBarWithToolbar.setTitle(textLocalisedClause2, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause2);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionVisible(textLocalisedClause != null);
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.e ? 0 : 8);
        goToButton.setText(uiState.f304261c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((i) d()).C2(b.a.f304257a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d4) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        this.O = d3().f174564b.A.V();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new xd4.h(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c d() {
        return (c) this.P.getValue();
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
