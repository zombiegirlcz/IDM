package com.revolut.biometric_verification.impl.ui.step.document.intro;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.R$id;
import com.revolut.biometric_verification.impl.R$layout;
import com.revolut.biometric_verification.impl.ui.step.document.intro.BiometricVerificationDocumentIntroScreen;
import com.revolut.biometric_verification.impl.ui.step.document.intro.BiometricVerificationDocumentIntroScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpl.c;
import lt.b;
import lt.d;
import lt.f;
import lt.g;
import no.k;
import pr.r;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/intro/BiometricVerificationDocumentIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lno/k;", "Ldli/a;", "Llt/f;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationDocumentIntroScreen extends ViewController<q> implements k, a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BiometricVerificationDocumentIntroScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationIntroBinding;", 0))};
    public final BiometricVerificationDocumentIntroScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public AnalyticsContext P;
    public final Object Q;
    public final Object R;

    public BiometricVerificationDocumentIntroScreen(BiometricVerificationDocumentIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_biometric_verification_intro;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentIntroScreen f199718b;

            {
                this.f199718b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationDocumentIntroScreen biometricVerificationDocumentIntroScreen = this.f199718b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentIntroScreen.S;
                        BiometricVerificationDocumentIntroScreen biometricVerificationDocumentIntroScreen2 = this.f199718b;
                        return dli.f.a(biometricVerificationDocumentIntroScreen2, (g) biometricVerificationDocumentIntroScreen2.R.getValue(), u.c(new SimpleMediaDelegate()), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentIntroScreen.S;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationDocumentIntroScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentIntroScreen.S;
                        qji.b bVarU2 = biometricVerificationDocumentIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.intro.di.BiometricVerificationDocumentIntroScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationDocumentIntroScreenContract$InputData biometricVerificationDocumentIntroScreenContract$InputData = biometricVerificationDocumentIntroScreen.K;
                        biometricVerificationDocumentIntroScreenContract$InputData.getClass();
                        return new r(qVar, uVar2, biometricVerificationDocumentIntroScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationDocumentIntroScreen.S;
                        return (g) ((r) biometricVerificationDocumentIntroScreen.Q.getValue()).f238888c.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: lt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentIntroScreen f199718b;

            {
                this.f199718b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationDocumentIntroScreen biometricVerificationDocumentIntroScreen = this.f199718b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentIntroScreen.S;
                        BiometricVerificationDocumentIntroScreen biometricVerificationDocumentIntroScreen2 = this.f199718b;
                        return dli.f.a(biometricVerificationDocumentIntroScreen2, (g) biometricVerificationDocumentIntroScreen2.R.getValue(), u.c(new SimpleMediaDelegate()), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentIntroScreen.S;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationDocumentIntroScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentIntroScreen.S;
                        qji.b bVarU2 = biometricVerificationDocumentIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.intro.di.BiometricVerificationDocumentIntroScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationDocumentIntroScreenContract$InputData biometricVerificationDocumentIntroScreenContract$InputData = biometricVerificationDocumentIntroScreen.K;
                        biometricVerificationDocumentIntroScreenContract$InputData.getClass();
                        return new r(qVar, uVar2, biometricVerificationDocumentIntroScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationDocumentIntroScreen.S;
                        return (g) ((r) biometricVerificationDocumentIntroScreen.Q.getValue()).f238888c.get();
                }
            }
        });
        this.P = inputData.f50597c;
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: lt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentIntroScreen f199718b;

            {
                this.f199718b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationDocumentIntroScreen biometricVerificationDocumentIntroScreen = this.f199718b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentIntroScreen.S;
                        BiometricVerificationDocumentIntroScreen biometricVerificationDocumentIntroScreen2 = this.f199718b;
                        return dli.f.a(biometricVerificationDocumentIntroScreen2, (g) biometricVerificationDocumentIntroScreen2.R.getValue(), u.c(new SimpleMediaDelegate()), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentIntroScreen.S;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationDocumentIntroScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentIntroScreen.S;
                        qji.b bVarU2 = biometricVerificationDocumentIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.intro.di.BiometricVerificationDocumentIntroScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationDocumentIntroScreenContract$InputData biometricVerificationDocumentIntroScreenContract$InputData = biometricVerificationDocumentIntroScreen.K;
                        biometricVerificationDocumentIntroScreenContract$InputData.getClass();
                        return new r(qVar, uVar2, biometricVerificationDocumentIntroScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationDocumentIntroScreen.S;
                        return (g) ((r) biometricVerificationDocumentIntroScreen.Q.getValue()).f238888c.get();
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: lt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentIntroScreen f199718b;

            {
                this.f199718b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BiometricVerificationDocumentIntroScreen biometricVerificationDocumentIntroScreen = this.f199718b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentIntroScreen.S;
                        BiometricVerificationDocumentIntroScreen biometricVerificationDocumentIntroScreen2 = this.f199718b;
                        return dli.f.a(biometricVerificationDocumentIntroScreen2, (g) biometricVerificationDocumentIntroScreen2.R.getValue(), u.c(new SimpleMediaDelegate()), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentIntroScreen.S;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationDocumentIntroScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentIntroScreen.S;
                        qji.b bVarU2 = biometricVerificationDocumentIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.intro.di.BiometricVerificationDocumentIntroScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationDocumentIntroScreenContract$InputData biometricVerificationDocumentIntroScreenContract$InputData = biometricVerificationDocumentIntroScreen.K;
                        biometricVerificationDocumentIntroScreenContract$InputData.getClass();
                        return new r(qVar, uVar2, biometricVerificationDocumentIntroScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationDocumentIntroScreen.S;
                        return (g) ((r) biometricVerificationDocumentIntroScreen.Q.getValue()).f238888c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f218484c;
        TextLocalisedClause textLocalisedClause = uiState.f199724b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.P = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.Q.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AnalyticsContext analyticsContext = this.P;
        NavBarWithToolbar navBarWithToolbar = d3().f218484c;
        navBarWithToolbar.setAnalyticsContext(analyticsContext);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        if (!this.K.f50596b) {
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.vision_capture_document_reason_identity_verification, null, null, 14));
        FooterActionButtonView footerActionButtonView = (FooterActionButtonView) this.O.getValue();
        footerActionButtonView.setAnalyticsContext(analyticsContext);
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.vision_capture_document_intro_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f218484c.f59410q), new c(this, null, 4), 3);
        ViewController.P2(this, new d(rd0.e.b(((FooterActionButtonView) this.O.getValue()).f0()), 0), new jl6.b(2, (g) this.R.getValue(), g.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/intro/BiometricVerificationDocumentIntroScreenContract$Event;)V", 4, 23), 3);
    }

    public final nr.a d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nr.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
