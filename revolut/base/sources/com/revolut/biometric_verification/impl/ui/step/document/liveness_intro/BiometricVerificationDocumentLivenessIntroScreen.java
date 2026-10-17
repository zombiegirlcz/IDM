package com.revolut.biometric_verification.impl.ui.step.document.liveness_intro;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.R$id;
import com.revolut.biometric_verification.impl.R$layout;
import com.revolut.biometric_verification.impl.ui.step.document.liveness_intro.BiometricVerificationDocumentLivenessIntroScreen;
import com.revolut.biometric_verification.impl.ui.step.document.liveness_intro.BiometricVerificationDocumentLivenessIntroScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import njj.n;
import no.k;
import nt.b;
import nt.i;
import nt.j;
import pr.s;
import pr.u;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/liveness_intro/BiometricVerificationDocumentLivenessIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lno/k;", "Ldli/a;", "Lnt/i;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationDocumentLivenessIntroScreen extends ViewController<q> implements k, a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BiometricVerificationDocumentLivenessIntroScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationIntroBinding;", 0))};
    public final BiometricVerificationDocumentLivenessIntroScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public AnalyticsContext O;
    public final Object P;
    public final Object Q;

    public BiometricVerificationDocumentLivenessIntroScreen(BiometricVerificationDocumentLivenessIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_biometric_verification_intro;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentLivenessIntroScreen f218932b;

            {
                this.f218932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationDocumentLivenessIntroScreen biometricVerificationDocumentLivenessIntroScreen = this.f218932b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentLivenessIntroScreen.R;
                        BiometricVerificationDocumentLivenessIntroScreen biometricVerificationDocumentLivenessIntroScreen2 = this.f218932b;
                        return dli.f.a(biometricVerificationDocumentLivenessIntroScreen2, (j) biometricVerificationDocumentLivenessIntroScreen2.Q.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentLivenessIntroScreen.R;
                        qji.b bVarU2 = biometricVerificationDocumentLivenessIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.liveness_intro.di.BiometricVerificationDocumentLivenessIntroScreenInjector");
                        u uVar = (u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationDocumentLivenessIntroScreenContract$InputData biometricVerificationDocumentLivenessIntroScreenContract$InputData = biometricVerificationDocumentLivenessIntroScreen.K;
                        biometricVerificationDocumentLivenessIntroScreenContract$InputData.getClass();
                        return new s(qVar, uVar2, biometricVerificationDocumentLivenessIntroScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentLivenessIntroScreen.R;
                        return (j) ((s) biometricVerificationDocumentLivenessIntroScreen.P.getValue()).f238891c.get();
                }
            }
        });
        this.N = vc.s.t(this, b.f);
        this.O = inputData.f50600c;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: nt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentLivenessIntroScreen f218932b;

            {
                this.f218932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationDocumentLivenessIntroScreen biometricVerificationDocumentLivenessIntroScreen = this.f218932b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentLivenessIntroScreen.R;
                        BiometricVerificationDocumentLivenessIntroScreen biometricVerificationDocumentLivenessIntroScreen2 = this.f218932b;
                        return dli.f.a(biometricVerificationDocumentLivenessIntroScreen2, (j) biometricVerificationDocumentLivenessIntroScreen2.Q.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentLivenessIntroScreen.R;
                        qji.b bVarU2 = biometricVerificationDocumentLivenessIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.liveness_intro.di.BiometricVerificationDocumentLivenessIntroScreenInjector");
                        u uVar = (u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationDocumentLivenessIntroScreenContract$InputData biometricVerificationDocumentLivenessIntroScreenContract$InputData = biometricVerificationDocumentLivenessIntroScreen.K;
                        biometricVerificationDocumentLivenessIntroScreenContract$InputData.getClass();
                        return new s(qVar, uVar2, biometricVerificationDocumentLivenessIntroScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentLivenessIntroScreen.R;
                        return (j) ((s) biometricVerificationDocumentLivenessIntroScreen.P.getValue()).f238891c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: nt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentLivenessIntroScreen f218932b;

            {
                this.f218932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationDocumentLivenessIntroScreen biometricVerificationDocumentLivenessIntroScreen = this.f218932b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentLivenessIntroScreen.R;
                        BiometricVerificationDocumentLivenessIntroScreen biometricVerificationDocumentLivenessIntroScreen2 = this.f218932b;
                        return dli.f.a(biometricVerificationDocumentLivenessIntroScreen2, (j) biometricVerificationDocumentLivenessIntroScreen2.Q.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentLivenessIntroScreen.R;
                        qji.b bVarU2 = biometricVerificationDocumentLivenessIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.liveness_intro.di.BiometricVerificationDocumentLivenessIntroScreenInjector");
                        u uVar = (u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationDocumentLivenessIntroScreenContract$InputData biometricVerificationDocumentLivenessIntroScreenContract$InputData = biometricVerificationDocumentLivenessIntroScreen.K;
                        biometricVerificationDocumentLivenessIntroScreenContract$InputData.getClass();
                        return new s(qVar, uVar2, biometricVerificationDocumentLivenessIntroScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentLivenessIntroScreen.R;
                        return (j) ((s) biometricVerificationDocumentLivenessIntroScreen.P.getValue()).f238891c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f218484c;
        navBarWithToolbar.setTitle(uiState.f218938a, null);
        TextLocalisedClause textLocalisedClause = uiState.f218939b;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(textLocalisedClause);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.O = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s) this.P.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AnalyticsContext analyticsContext = this.O;
        NavBarWithToolbar navBarWithToolbar = d3().f218484c;
        navBarWithToolbar.setAnalyticsContext(analyticsContext);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        if (!this.K.f50599b) {
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        FooterActionButtonView footerActionButtonView = d3().f218483b;
        footerActionButtonView.setAnalyticsContext(analyticsContext);
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.vision_capture_document_intro_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        n nVar = new n(rd0.e.b(d3().f218484c.f59410q), 11);
        ?? r132 = this.Q;
        ViewController.P2(this, nVar, new nt.e(2, (j) r132.getValue(), j.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/liveness_intro/BiometricVerificationDocumentLivenessIntroScreenContract$Event;)V", 4, 0), 3);
        ViewController.P2(this, new n(rd0.e.b(d3().f218483b.f0()), 12), new nt.e(2, (j) r132.getValue(), j.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/liveness_intro/BiometricVerificationDocumentLivenessIntroScreenContract$Event;)V", 4, 1), 3);
    }

    public final nr.a d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nr.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
