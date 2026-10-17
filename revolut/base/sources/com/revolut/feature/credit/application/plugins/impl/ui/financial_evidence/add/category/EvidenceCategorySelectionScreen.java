package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.EvidenceCategorySelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.EvidenceCategorySelectionScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.q;
import dw3.w2;
import java.util.List;
import jii.m;
import k22.c;
import kb4.b;
import kb4.d;
import kb4.e;
import kb4.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/category/EvidenceCategorySelectionScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lkb4/d;", "Ldli/a;", "Lkb4/e;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EvidenceCategorySelectionScreen extends PluginScreenController<d> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EvidenceCategorySelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final EvidenceCategorySelectionScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final ProductSelectionDelegate Q;
    public final Object R;

    public EvidenceCategorySelectionScreen(EvidenceCategorySelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: kb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceCategorySelectionScreen f182516b;

            {
                this.f182516b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EvidenceCategorySelectionScreen evidenceCategorySelectionScreen = this.f182516b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceCategorySelectionScreen.S;
                        qji.b bVarU2 = evidenceCategorySelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.di.EvidenceCategorySelectionScreenInjector");
                        q qVar = (q) bVarU2;
                        c1 c1Var = qVar.f119541c;
                        q qVar2 = qVar.d;
                        EvidenceCategorySelectionScreenContract$InputData evidenceCategorySelectionScreenContract$InputData = evidenceCategorySelectionScreen.L;
                        evidenceCategorySelectionScreenContract$InputData.getClass();
                        return new w2(c1Var, qVar2, evidenceCategorySelectionScreen, evidenceCategorySelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceCategorySelectionScreen.S;
                        return (f) ((w2) evidenceCategorySelectionScreen.N.getValue()).f120056g.get();
                    default:
                        KProperty[] kPropertyArr3 = EvidenceCategorySelectionScreen.S;
                        EvidenceCategorySelectionScreen evidenceCategorySelectionScreen2 = this.f182516b;
                        return dli.f.a(evidenceCategorySelectionScreen2, (f) evidenceCategorySelectionScreen2.O.getValue(), u.c(evidenceCategorySelectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: kb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceCategorySelectionScreen f182516b;

            {
                this.f182516b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EvidenceCategorySelectionScreen evidenceCategorySelectionScreen = this.f182516b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceCategorySelectionScreen.S;
                        qji.b bVarU2 = evidenceCategorySelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.di.EvidenceCategorySelectionScreenInjector");
                        q qVar = (q) bVarU2;
                        c1 c1Var = qVar.f119541c;
                        q qVar2 = qVar.d;
                        EvidenceCategorySelectionScreenContract$InputData evidenceCategorySelectionScreenContract$InputData = evidenceCategorySelectionScreen.L;
                        evidenceCategorySelectionScreenContract$InputData.getClass();
                        return new w2(c1Var, qVar2, evidenceCategorySelectionScreen, evidenceCategorySelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceCategorySelectionScreen.S;
                        return (f) ((w2) evidenceCategorySelectionScreen.N.getValue()).f120056g.get();
                    default:
                        KProperty[] kPropertyArr3 = EvidenceCategorySelectionScreen.S;
                        EvidenceCategorySelectionScreen evidenceCategorySelectionScreen2 = this.f182516b;
                        return dli.f.a(evidenceCategorySelectionScreen2, (f) evidenceCategorySelectionScreen2.O.getValue(), u.c(evidenceCategorySelectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new ProductSelectionDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: kb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceCategorySelectionScreen f182516b;

            {
                this.f182516b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EvidenceCategorySelectionScreen evidenceCategorySelectionScreen = this.f182516b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceCategorySelectionScreen.S;
                        qji.b bVarU2 = evidenceCategorySelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.di.EvidenceCategorySelectionScreenInjector");
                        q qVar = (q) bVarU2;
                        c1 c1Var = qVar.f119541c;
                        q qVar2 = qVar.d;
                        EvidenceCategorySelectionScreenContract$InputData evidenceCategorySelectionScreenContract$InputData = evidenceCategorySelectionScreen.L;
                        evidenceCategorySelectionScreenContract$InputData.getClass();
                        return new w2(c1Var, qVar2, evidenceCategorySelectionScreen, evidenceCategorySelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceCategorySelectionScreen.S;
                        return (f) ((w2) evidenceCategorySelectionScreen.N.getValue()).f120056g.get();
                    default:
                        KProperty[] kPropertyArr3 = EvidenceCategorySelectionScreen.S;
                        EvidenceCategorySelectionScreen evidenceCategorySelectionScreen2 = this.f182516b;
                        return dli.f.a(evidenceCategorySelectionScreen2, (f) evidenceCategorySelectionScreen2.O.getValue(), u.c(evidenceCategorySelectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f182520b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174539b.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (w2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.O.getValue();
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
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 16), 3);
        ViewController.P2(this, new jij.d(rd0.e.b(this.Q.p()), 26), new kae.d(this, null, 2), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
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
