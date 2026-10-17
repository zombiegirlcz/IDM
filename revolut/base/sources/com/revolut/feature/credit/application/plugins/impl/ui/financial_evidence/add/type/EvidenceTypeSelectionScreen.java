package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dli.c;
import dw3.c1;
import dw3.q;
import dw3.z2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ob4.b;
import ob4.i;
import ob4.j;
import ob4.k;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/type/EvidenceTypeSelectionScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lob4/i;", "Ldli/a;", "Lob4/k;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EvidenceTypeSelectionScreen extends PluginScreenController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EvidenceTypeSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final EvidenceTypeSelectionScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final ProductSelectionDelegate Q;
    public final Object R;

    public EvidenceTypeSelectionScreen(EvidenceTypeSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ob4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceTypeSelectionScreen f223873b;

            {
                this.f223873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EvidenceTypeSelectionScreen evidenceTypeSelectionScreen = this.f223873b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceTypeSelectionScreen.S;
                        qji.b bVarU2 = evidenceTypeSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.di.EvidenceTypeSelectionScreenInjector");
                        q qVar = (q) bVarU2;
                        c1 c1Var = qVar.f119541c;
                        q qVar2 = qVar.d;
                        EvidenceTypeSelectionScreenContract$InputData evidenceTypeSelectionScreenContract$InputData = evidenceTypeSelectionScreen.L;
                        evidenceTypeSelectionScreenContract$InputData.getClass();
                        return new z2(c1Var, qVar2, evidenceTypeSelectionScreen, evidenceTypeSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceTypeSelectionScreen.S;
                        return (j) ((z2) evidenceTypeSelectionScreen.N.getValue()).f120270g.get();
                    default:
                        KProperty[] kPropertyArr3 = EvidenceTypeSelectionScreen.S;
                        int i3 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        EvidenceTypeSelectionScreen evidenceTypeSelectionScreen2 = this.f223873b;
                        return dli.f.a(evidenceTypeSelectionScreen2, (j) evidenceTypeSelectionScreen2.O.getValue(), u.c(evidenceTypeSelectionScreen2.Q), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ob4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceTypeSelectionScreen f223873b;

            {
                this.f223873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EvidenceTypeSelectionScreen evidenceTypeSelectionScreen = this.f223873b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceTypeSelectionScreen.S;
                        qji.b bVarU2 = evidenceTypeSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.di.EvidenceTypeSelectionScreenInjector");
                        q qVar = (q) bVarU2;
                        c1 c1Var = qVar.f119541c;
                        q qVar2 = qVar.d;
                        EvidenceTypeSelectionScreenContract$InputData evidenceTypeSelectionScreenContract$InputData = evidenceTypeSelectionScreen.L;
                        evidenceTypeSelectionScreenContract$InputData.getClass();
                        return new z2(c1Var, qVar2, evidenceTypeSelectionScreen, evidenceTypeSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceTypeSelectionScreen.S;
                        return (j) ((z2) evidenceTypeSelectionScreen.N.getValue()).f120270g.get();
                    default:
                        KProperty[] kPropertyArr3 = EvidenceTypeSelectionScreen.S;
                        int i3 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        EvidenceTypeSelectionScreen evidenceTypeSelectionScreen2 = this.f223873b;
                        return dli.f.a(evidenceTypeSelectionScreen2, (j) evidenceTypeSelectionScreen2.O.getValue(), u.c(evidenceTypeSelectionScreen2.Q), i3, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new ProductSelectionDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ob4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceTypeSelectionScreen f223873b;

            {
                this.f223873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EvidenceTypeSelectionScreen evidenceTypeSelectionScreen = this.f223873b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceTypeSelectionScreen.S;
                        qji.b bVarU2 = evidenceTypeSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.di.EvidenceTypeSelectionScreenInjector");
                        q qVar = (q) bVarU2;
                        c1 c1Var = qVar.f119541c;
                        q qVar2 = qVar.d;
                        EvidenceTypeSelectionScreenContract$InputData evidenceTypeSelectionScreenContract$InputData = evidenceTypeSelectionScreen.L;
                        evidenceTypeSelectionScreenContract$InputData.getClass();
                        return new z2(c1Var, qVar2, evidenceTypeSelectionScreen, evidenceTypeSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceTypeSelectionScreen.S;
                        return (j) ((z2) evidenceTypeSelectionScreen.N.getValue()).f120270g.get();
                    default:
                        KProperty[] kPropertyArr3 = EvidenceTypeSelectionScreen.S;
                        int i32 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        EvidenceTypeSelectionScreen evidenceTypeSelectionScreen2 = this.f223873b;
                        return dli.f.a(evidenceTypeSelectionScreen2, (j) evidenceTypeSelectionScreen2.O.getValue(), u.c(evidenceTypeSelectionScreen2.Q), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        ResourceImage resourceImage = uiState.f223883b;
        Clause clause = uiState.e;
        navBarWithToolbar.setNavigationButtonImage(resourceImage);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        screenRecyclerNavbarFooterNextbuttonToolbar.setTitle(uiState.f223884c, null);
        NavBarWithToolbar navBarWithToolbar2 = d3().e;
        Clause clause2 = uiState.d;
        navBarWithToolbar2.setSecondDescriptionText(clause2);
        d3().e.setSecondDescriptionVisible(clause2 != null);
        d3().f174558c.setTextClause(clause);
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = d3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
        screenRecyclerNavbarFooterNextbuttonFooterView.setVisibility(clause == null ? 8 : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().e.setHeaderTitleMode(j0.MULTILINE);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        screenRecyclerNavbarFooterNextbuttonButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new nuh.j(this, null, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, new o9a.e(rd0.e.b(d3().e.x0()), 1), null, new ob4.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new o9a.e(rd0.e.b(this.Q.p()), 2), null, new ob4.e(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
