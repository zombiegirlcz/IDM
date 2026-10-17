package com.revolut.biometric_verification.impl.ui.step.active_liveness.intro;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.R$id;
import com.revolut.biometric_verification.impl.R$layout;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.intro.BiometricVerificationActiveLivenessIntroScreen;
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
import no.k;
import os.b;
import os.h;
import os.i;
import os.j;
import pr.l;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/intro/BiometricVerificationActiveLivenessIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Los/h;", "Lno/k;", "Ldli/a;", "Los/i;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationActiveLivenessIntroScreen extends ViewController<h> implements k, a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BiometricVerificationActiveLivenessIntroScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationIntroBinding;", 0))};
    public final BiometricVerificationActiveLivenessIntroScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final ao.h P;
    public final Object Q;
    public AnalyticsContext R;

    public BiometricVerificationActiveLivenessIntroScreen(BiometricVerificationActiveLivenessIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_biometric_verification_intro;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: os.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessIntroScreen f229208b;

            {
                this.f229208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationActiveLivenessIntroScreen biometricVerificationActiveLivenessIntroScreen = this.f229208b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationActiveLivenessIntroScreen.S;
                        BiometricVerificationActiveLivenessIntroScreen biometricVerificationActiveLivenessIntroScreen2 = this.f229208b;
                        return dli.f.a(biometricVerificationActiveLivenessIntroScreen2, (j) biometricVerificationActiveLivenessIntroScreen2.N.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationActiveLivenessIntroScreen.S;
                        return (j) ((l) biometricVerificationActiveLivenessIntroScreen.O.getValue()).f238858b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationActiveLivenessIntroScreen.S;
                        qji.b bVarU2 = biometricVerificationActiveLivenessIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.intro.di.BiometricVerificationActiveLivenessIntroScreenInjector");
                        l lVar = new l();
                        lVar.f238857a = e4m.b.b(new pl1.h(lVar, 1, 16));
                        lVar.f238858b = e4m.b.b(new pl1.h(lVar, 0, 16));
                        return lVar;
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationActiveLivenessIntroScreen.S;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationActiveLivenessIntroScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: os.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessIntroScreen f229208b;

            {
                this.f229208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationActiveLivenessIntroScreen biometricVerificationActiveLivenessIntroScreen = this.f229208b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationActiveLivenessIntroScreen.S;
                        BiometricVerificationActiveLivenessIntroScreen biometricVerificationActiveLivenessIntroScreen2 = this.f229208b;
                        return dli.f.a(biometricVerificationActiveLivenessIntroScreen2, (j) biometricVerificationActiveLivenessIntroScreen2.N.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationActiveLivenessIntroScreen.S;
                        return (j) ((l) biometricVerificationActiveLivenessIntroScreen.O.getValue()).f238858b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationActiveLivenessIntroScreen.S;
                        qji.b bVarU2 = biometricVerificationActiveLivenessIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.intro.di.BiometricVerificationActiveLivenessIntroScreenInjector");
                        l lVar = new l();
                        lVar.f238857a = e4m.b.b(new pl1.h(lVar, 1, 16));
                        lVar.f238858b = e4m.b.b(new pl1.h(lVar, 0, 16));
                        return lVar;
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationActiveLivenessIntroScreen.S;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationActiveLivenessIntroScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: os.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessIntroScreen f229208b;

            {
                this.f229208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationActiveLivenessIntroScreen biometricVerificationActiveLivenessIntroScreen = this.f229208b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationActiveLivenessIntroScreen.S;
                        BiometricVerificationActiveLivenessIntroScreen biometricVerificationActiveLivenessIntroScreen2 = this.f229208b;
                        return dli.f.a(biometricVerificationActiveLivenessIntroScreen2, (j) biometricVerificationActiveLivenessIntroScreen2.N.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationActiveLivenessIntroScreen.S;
                        return (j) ((l) biometricVerificationActiveLivenessIntroScreen.O.getValue()).f238858b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationActiveLivenessIntroScreen.S;
                        qji.b bVarU2 = biometricVerificationActiveLivenessIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.intro.di.BiometricVerificationActiveLivenessIntroScreenInjector");
                        l lVar = new l();
                        lVar.f238857a = e4m.b.b(new pl1.h(lVar, 1, 16));
                        lVar.f238858b = e4m.b.b(new pl1.h(lVar, 0, 16));
                        return lVar;
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationActiveLivenessIntroScreen.S;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationActiveLivenessIntroScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: os.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessIntroScreen f229208b;

            {
                this.f229208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BiometricVerificationActiveLivenessIntroScreen biometricVerificationActiveLivenessIntroScreen = this.f229208b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationActiveLivenessIntroScreen.S;
                        BiometricVerificationActiveLivenessIntroScreen biometricVerificationActiveLivenessIntroScreen2 = this.f229208b;
                        return dli.f.a(biometricVerificationActiveLivenessIntroScreen2, (j) biometricVerificationActiveLivenessIntroScreen2.N.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationActiveLivenessIntroScreen.S;
                        return (j) ((l) biometricVerificationActiveLivenessIntroScreen.O.getValue()).f238858b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationActiveLivenessIntroScreen.S;
                        qji.b bVarU2 = biometricVerificationActiveLivenessIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.intro.di.BiometricVerificationActiveLivenessIntroScreenInjector");
                        l lVar = new l();
                        lVar.f238857a = e4m.b.b(new pl1.h(lVar, 1, 16));
                        lVar.f238858b = e4m.b.b(new pl1.h(lVar, 0, 16));
                        return lVar;
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationActiveLivenessIntroScreen.S;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationActiveLivenessIntroScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                }
            }
        });
        this.R = inputData.f50514b;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AnalyticsContext analyticsContext = this.R;
        NavBarWithToolbar navBarWithToolbar = d3().f218484c;
        navBarWithToolbar.setAnalyticsContext(analyticsContext);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        if (!this.K.f50513a) {
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.selfie_active_liveness_intro_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.selfie_active_liveness_intro_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.selfie_active_liveness_intro_caption, null, null, 14));
        FooterActionButtonView footerActionButtonView = (FooterActionButtonView) this.Q.getValue();
        footerActionButtonView.setAnalyticsContext(analyticsContext);
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.selfie_active_liveness_intro_action_button, null, null, 14));
        footerActionButtonView.setDescription(new TextLocalisedClause(R$string.selfie_active_liveness_intro_footer, null, null, 14));
        footerActionButtonView.setLoadingButtonTag("BiometricVerificationActiveLivenessIntroScreenContract_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(new o9a.e(rd0.e.b(d3().f218484c.f59410q), 18), new o9a.e(rd0.e.b(((FooterActionButtonView) this.Q.getValue()).f0()), 19)), new nt.e(2, (j) this.N.getValue(), j.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/intro/BiometricVerificationActiveLivenessIntroScreenContract$Event;)V", 4, 21), 3);
    }

    public final nr.a d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nr.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
