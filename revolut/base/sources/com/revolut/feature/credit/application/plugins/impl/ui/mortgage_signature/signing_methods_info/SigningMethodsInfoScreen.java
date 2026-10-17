package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.SigningMethodsInfoScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.SigningMethodsInfoScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import dw3.c1;
import dw3.h4;
import dw3.m6;
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
import xe4.b;
import xe4.f;
import xe4.g;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/signing_methods_info/SigningMethodsInfoScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Laii/q;", "Ldli/a;", "Lxe4/g;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SigningMethodsInfoScreen extends PluginScreenController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SigningMethodsInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SigningMethodsInfoScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final PlainTextDelegate Q;
    public final Object R;

    public SigningMethodsInfoScreen(SigningMethodsInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xe4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SigningMethodsInfoScreen f304529b;

            {
                this.f304529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SigningMethodsInfoScreen signingMethodsInfoScreen = this.f304529b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SigningMethodsInfoScreen.S;
                        qji.b bVarU2 = signingMethodsInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.di.SigningMethodsInfoScreenInjector");
                        h4 h4Var = (h4) bVarU2;
                        c1 c1Var = h4Var.f118875c;
                        h4 h4Var2 = h4Var.d;
                        SigningMethodsInfoScreenContract$InputData signingMethodsInfoScreenContract$InputData = signingMethodsInfoScreen.L;
                        signingMethodsInfoScreenContract$InputData.getClass();
                        return new m6(c1Var, h4Var2, signingMethodsInfoScreen, signingMethodsInfoScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SigningMethodsInfoScreen.S;
                        return (f) ((m6) signingMethodsInfoScreen.N.getValue()).f119296h.get();
                    default:
                        KProperty[] kPropertyArr3 = SigningMethodsInfoScreen.S;
                        SigningMethodsInfoScreen signingMethodsInfoScreen2 = this.f304529b;
                        return dli.f.a(signingMethodsInfoScreen2, (f) signingMethodsInfoScreen2.O.getValue(), u.c(signingMethodsInfoScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xe4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SigningMethodsInfoScreen f304529b;

            {
                this.f304529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SigningMethodsInfoScreen signingMethodsInfoScreen = this.f304529b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SigningMethodsInfoScreen.S;
                        qji.b bVarU2 = signingMethodsInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.di.SigningMethodsInfoScreenInjector");
                        h4 h4Var = (h4) bVarU2;
                        c1 c1Var = h4Var.f118875c;
                        h4 h4Var2 = h4Var.d;
                        SigningMethodsInfoScreenContract$InputData signingMethodsInfoScreenContract$InputData = signingMethodsInfoScreen.L;
                        signingMethodsInfoScreenContract$InputData.getClass();
                        return new m6(c1Var, h4Var2, signingMethodsInfoScreen, signingMethodsInfoScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SigningMethodsInfoScreen.S;
                        return (f) ((m6) signingMethodsInfoScreen.N.getValue()).f119296h.get();
                    default:
                        KProperty[] kPropertyArr3 = SigningMethodsInfoScreen.S;
                        SigningMethodsInfoScreen signingMethodsInfoScreen2 = this.f304529b;
                        return dli.f.a(signingMethodsInfoScreen2, (f) signingMethodsInfoScreen2.O.getValue(), u.c(signingMethodsInfoScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new PlainTextDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: xe4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SigningMethodsInfoScreen f304529b;

            {
                this.f304529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SigningMethodsInfoScreen signingMethodsInfoScreen = this.f304529b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SigningMethodsInfoScreen.S;
                        qji.b bVarU2 = signingMethodsInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.di.SigningMethodsInfoScreenInjector");
                        h4 h4Var = (h4) bVarU2;
                        c1 c1Var = h4Var.f118875c;
                        h4 h4Var2 = h4Var.d;
                        SigningMethodsInfoScreenContract$InputData signingMethodsInfoScreenContract$InputData = signingMethodsInfoScreen.L;
                        signingMethodsInfoScreenContract$InputData.getClass();
                        return new m6(c1Var, h4Var2, signingMethodsInfoScreen, signingMethodsInfoScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SigningMethodsInfoScreen.S;
                        return (f) ((m6) signingMethodsInfoScreen.N.getValue()).f119296h.get();
                    default:
                        KProperty[] kPropertyArr3 = SigningMethodsInfoScreen.S;
                        SigningMethodsInfoScreen signingMethodsInfoScreen2 = this.f304529b;
                        return dli.f.a(signingMethodsInfoScreen2, (f) signingMethodsInfoScreen2.O.getValue(), u.c(signingMethodsInfoScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f304533b, null);
        d3().f174539b.setSecondDescriptionText(uiState.f304534c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m6) this.N.getValue();
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
        d3().f174539b.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174539b.setHeaderTitleMode(j0.MULTILINE);
        d3().f174539b.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new x0f.g(this, null, 11), 3);
        ViewController.P2(this, rd0.e.b(this.Q.e.f121375b), new x64.b(this, null, 17), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
