package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.OtpScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.OtpScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dw3.c1;
import dw3.h4;
import dw3.r4;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import se4.b;
import se4.c;
import se4.d;
import se4.i;
import se4.j;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/otp/OtpScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lse4/i;", "Ldli/a;", "Lse4/j;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtpScreen extends PluginScreenController<i> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(OtpScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final OtpScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final CounterTextDelegate Q;
    public final Object R;

    public OtpScreen(OtpScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: se4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpScreen f262099b;

            {
                this.f262099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OtpScreen otpScreen = this.f262099b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OtpScreen.S;
                        qji.b bVarU2 = otpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.di.OtpScreenInjector");
                        h4 h4Var = (h4) bVarU2;
                        c1 c1Var = h4Var.f118875c;
                        h4 h4Var2 = h4Var.d;
                        OtpScreenContract$InputData otpScreenContract$InputData = otpScreen.L;
                        otpScreenContract$InputData.getClass();
                        return new r4(c1Var, h4Var2, otpScreen, otpScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OtpScreen.S;
                        return (o) ((r4) otpScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = OtpScreen.S;
                        OtpScreen otpScreen2 = this.f262099b;
                        return dli.f.a(otpScreen2, (o) otpScreen2.O.getValue(), u.c(otpScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: se4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpScreen f262099b;

            {
                this.f262099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OtpScreen otpScreen = this.f262099b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OtpScreen.S;
                        qji.b bVarU2 = otpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.di.OtpScreenInjector");
                        h4 h4Var = (h4) bVarU2;
                        c1 c1Var = h4Var.f118875c;
                        h4 h4Var2 = h4Var.d;
                        OtpScreenContract$InputData otpScreenContract$InputData = otpScreen.L;
                        otpScreenContract$InputData.getClass();
                        return new r4(c1Var, h4Var2, otpScreen, otpScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OtpScreen.S;
                        return (o) ((r4) otpScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = OtpScreen.S;
                        OtpScreen otpScreen2 = this.f262099b;
                        return dli.f.a(otpScreen2, (o) otpScreen2.O.getValue(), u.c(otpScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new CounterTextDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: se4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpScreen f262099b;

            {
                this.f262099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OtpScreen otpScreen = this.f262099b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OtpScreen.S;
                        qji.b bVarU2 = otpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.di.OtpScreenInjector");
                        h4 h4Var = (h4) bVarU2;
                        c1 c1Var = h4Var.f118875c;
                        h4 h4Var2 = h4Var.d;
                        OtpScreenContract$InputData otpScreenContract$InputData = otpScreen.L;
                        otpScreenContract$InputData.getClass();
                        return new r4(c1Var, h4Var2, otpScreen, otpScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OtpScreen.S;
                        return (o) ((r4) otpScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = OtpScreen.S;
                        OtpScreen otpScreen2 = this.f262099b;
                        return dli.f.a(otpScreen2, (o) otpScreen2.O.getValue(), u.c(otpScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f262107b, null);
        d3().f174539b.setSecondDescriptionText(uiState.f262108c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r4) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (se4.o) this.O.getValue();
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
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52158h.f121375b), null, new d(this, null), 3);
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
