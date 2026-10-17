package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.EvidenceHolderSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.EvidenceHolderSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dli.c;
import dw3.c1;
import dw3.x2;
import dw3.y2;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q2e.i0;
import q43.m;
import q97.b1;
import qb4.b;
import qb4.d;
import qb4.f;
import qb4.g;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/evidence_holder_selection/EvidenceHolderSelectionScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lqb4/f;", "Ldli/a;", "Lqb4/g;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EvidenceHolderSelectionScreen extends PluginScreenController<f> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EvidenceHolderSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final EvidenceHolderSelectionScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final ProductSelectionDelegate Q;
    public final Object R;

    public EvidenceHolderSelectionScreen(EvidenceHolderSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceHolderSelectionScreen f244109b;

            {
                this.f244109b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EvidenceHolderSelectionScreen evidenceHolderSelectionScreen = this.f244109b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceHolderSelectionScreen.S;
                        qji.b bVarU2 = evidenceHolderSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.di.EvidenceHolderSelectionScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        c1 c1Var = x2Var.f120130c;
                        x2 x2Var2 = x2Var.d;
                        EvidenceHolderSelectionScreenContract$InputData evidenceHolderSelectionScreenContract$InputData = evidenceHolderSelectionScreen.L;
                        evidenceHolderSelectionScreenContract$InputData.getClass();
                        return new y2(c1Var, x2Var2, evidenceHolderSelectionScreen, evidenceHolderSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceHolderSelectionScreen.S;
                        return (h) ((y2) evidenceHolderSelectionScreen.N.getValue()).f120202g.get();
                    default:
                        KProperty[] kPropertyArr3 = EvidenceHolderSelectionScreen.S;
                        EvidenceHolderSelectionScreen evidenceHolderSelectionScreen2 = this.f244109b;
                        return dli.f.a(evidenceHolderSelectionScreen2, (h) evidenceHolderSelectionScreen2.O.getValue(), u.c(evidenceHolderSelectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceHolderSelectionScreen f244109b;

            {
                this.f244109b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EvidenceHolderSelectionScreen evidenceHolderSelectionScreen = this.f244109b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceHolderSelectionScreen.S;
                        qji.b bVarU2 = evidenceHolderSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.di.EvidenceHolderSelectionScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        c1 c1Var = x2Var.f120130c;
                        x2 x2Var2 = x2Var.d;
                        EvidenceHolderSelectionScreenContract$InputData evidenceHolderSelectionScreenContract$InputData = evidenceHolderSelectionScreen.L;
                        evidenceHolderSelectionScreenContract$InputData.getClass();
                        return new y2(c1Var, x2Var2, evidenceHolderSelectionScreen, evidenceHolderSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceHolderSelectionScreen.S;
                        return (h) ((y2) evidenceHolderSelectionScreen.N.getValue()).f120202g.get();
                    default:
                        KProperty[] kPropertyArr3 = EvidenceHolderSelectionScreen.S;
                        EvidenceHolderSelectionScreen evidenceHolderSelectionScreen2 = this.f244109b;
                        return dli.f.a(evidenceHolderSelectionScreen2, (h) evidenceHolderSelectionScreen2.O.getValue(), u.c(evidenceHolderSelectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new ProductSelectionDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: qb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceHolderSelectionScreen f244109b;

            {
                this.f244109b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EvidenceHolderSelectionScreen evidenceHolderSelectionScreen = this.f244109b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceHolderSelectionScreen.S;
                        qji.b bVarU2 = evidenceHolderSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.di.EvidenceHolderSelectionScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        c1 c1Var = x2Var.f120130c;
                        x2 x2Var2 = x2Var.d;
                        EvidenceHolderSelectionScreenContract$InputData evidenceHolderSelectionScreenContract$InputData = evidenceHolderSelectionScreen.L;
                        evidenceHolderSelectionScreenContract$InputData.getClass();
                        return new y2(c1Var, x2Var2, evidenceHolderSelectionScreen, evidenceHolderSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceHolderSelectionScreen.S;
                        return (h) ((y2) evidenceHolderSelectionScreen.N.getValue()).f120202g.get();
                    default:
                        KProperty[] kPropertyArr3 = EvidenceHolderSelectionScreen.S;
                        EvidenceHolderSelectionScreen evidenceHolderSelectionScreen2 = this.f244109b;
                        return dli.f.a(evidenceHolderSelectionScreen2, (h) evidenceHolderSelectionScreen2.O.getValue(), u.c(evidenceHolderSelectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f244114b, null);
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        Clause clause = uiState.f244115c;
        navBarWithToolbar2.setSecondDescriptionText(clause);
        d3().f174539b.setSecondDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((qb4.h) this.O.getValue()).C2(d.f244111a);
        return super.F2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (qb4.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174539b.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new m(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, new b1(rd0.e.b(this.Q.p()), 1), null, new i0(this, (Continuation) null, 26), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
