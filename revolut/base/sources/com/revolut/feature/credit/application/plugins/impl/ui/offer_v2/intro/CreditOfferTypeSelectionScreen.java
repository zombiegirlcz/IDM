package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro;

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
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.CreditOfferTypeSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.CreditOfferTypeSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dw3.c1;
import dw3.n1;
import dw3.q4;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import w65.c;
import wf4.b;
import wf4.d;
import wf4.f;
import wf4.g;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/intro/CreditOfferTypeSelectionScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lwf4/f;", "Ldli/a;", "Lwf4/g;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditOfferTypeSelectionScreen extends PluginScreenController<f> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditOfferTypeSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CreditOfferTypeSelectionScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final ProductSelectionDelegate Q;
    public final Object R;

    public CreditOfferTypeSelectionScreen(CreditOfferTypeSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditOfferTypeSelectionScreen f296963b;

            {
                this.f296963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditOfferTypeSelectionScreen creditOfferTypeSelectionScreen = this.f296963b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditOfferTypeSelectionScreen.S;
                        qji.b bVarU2 = creditOfferTypeSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.di.CreditOfferTypeSelectionScreenInjector");
                        q4 q4Var = (q4) bVarU2;
                        c1 c1Var = q4Var.f119568c;
                        q4 q4Var2 = q4Var.d;
                        CreditOfferTypeSelectionScreenContract$InputData creditOfferTypeSelectionScreenContract$InputData = creditOfferTypeSelectionScreen.L;
                        creditOfferTypeSelectionScreenContract$InputData.getClass();
                        return new n1(c1Var, q4Var2, creditOfferTypeSelectionScreen, creditOfferTypeSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditOfferTypeSelectionScreen.S;
                        return (h) ((n1) creditOfferTypeSelectionScreen.N.getValue()).f119326h.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditOfferTypeSelectionScreen.S;
                        CreditOfferTypeSelectionScreen creditOfferTypeSelectionScreen2 = this.f296963b;
                        return dli.f.a(creditOfferTypeSelectionScreen2, (h) creditOfferTypeSelectionScreen2.O.getValue(), u.c(creditOfferTypeSelectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditOfferTypeSelectionScreen f296963b;

            {
                this.f296963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditOfferTypeSelectionScreen creditOfferTypeSelectionScreen = this.f296963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditOfferTypeSelectionScreen.S;
                        qji.b bVarU2 = creditOfferTypeSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.di.CreditOfferTypeSelectionScreenInjector");
                        q4 q4Var = (q4) bVarU2;
                        c1 c1Var = q4Var.f119568c;
                        q4 q4Var2 = q4Var.d;
                        CreditOfferTypeSelectionScreenContract$InputData creditOfferTypeSelectionScreenContract$InputData = creditOfferTypeSelectionScreen.L;
                        creditOfferTypeSelectionScreenContract$InputData.getClass();
                        return new n1(c1Var, q4Var2, creditOfferTypeSelectionScreen, creditOfferTypeSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditOfferTypeSelectionScreen.S;
                        return (h) ((n1) creditOfferTypeSelectionScreen.N.getValue()).f119326h.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditOfferTypeSelectionScreen.S;
                        CreditOfferTypeSelectionScreen creditOfferTypeSelectionScreen2 = this.f296963b;
                        return dli.f.a(creditOfferTypeSelectionScreen2, (h) creditOfferTypeSelectionScreen2.O.getValue(), u.c(creditOfferTypeSelectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new ProductSelectionDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: wf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditOfferTypeSelectionScreen f296963b;

            {
                this.f296963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditOfferTypeSelectionScreen creditOfferTypeSelectionScreen = this.f296963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditOfferTypeSelectionScreen.S;
                        qji.b bVarU2 = creditOfferTypeSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.di.CreditOfferTypeSelectionScreenInjector");
                        q4 q4Var = (q4) bVarU2;
                        c1 c1Var = q4Var.f119568c;
                        q4 q4Var2 = q4Var.d;
                        CreditOfferTypeSelectionScreenContract$InputData creditOfferTypeSelectionScreenContract$InputData = creditOfferTypeSelectionScreen.L;
                        creditOfferTypeSelectionScreenContract$InputData.getClass();
                        return new n1(c1Var, q4Var2, creditOfferTypeSelectionScreen, creditOfferTypeSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditOfferTypeSelectionScreen.S;
                        return (h) ((n1) creditOfferTypeSelectionScreen.N.getValue()).f119326h.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditOfferTypeSelectionScreen.S;
                        CreditOfferTypeSelectionScreen creditOfferTypeSelectionScreen2 = this.f296963b;
                        return dli.f.a(creditOfferTypeSelectionScreen2, (h) creditOfferTypeSelectionScreen2.O.getValue(), u.c(creditOfferTypeSelectionScreen2.Q), 0, null, null, null, 60);
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
        navBarWithToolbar.setTitle(uiState.f296969b, null);
        d3().f174539b.setSecondDescriptionText(uiState.f296970c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((wf4.h) this.O.getValue()).C2(d.f296965a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wf4.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setHeaderTitleMode(j0.MULTILINE);
        d3().f174539b.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174539b.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, new wa3.d(rd0.e.b(this.Q.p()), 2), null, new w50.g(this, (Continuation) null, 19), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
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
