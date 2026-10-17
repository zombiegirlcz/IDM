package com.revolut.biometric_verification.impl.ui.step.active_liveness.digits_selfie_intro;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.digits_selfie_intro.BiometricVerificationActiveLivenessDigitsSelfieIntroScreen;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import iqh.d;
import is.b;
import is.l;
import is.m;
import is.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/digits_selfie_intro/BiometricVerificationActiveLivenessDigitsSelfieIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lis/l;", "Lno/k;", "Ldli/a;", "Lis/m;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationActiveLivenessDigitsSelfieIntroScreen extends ViewController<l> implements k, a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BiometricVerificationActiveLivenessDigitsSelfieIntroScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public AnalyticsContext Q;

    public BiometricVerificationActiveLivenessDigitsSelfieIntroScreen(BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: is.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessDigitsSelfieIntroScreen f168066b;

            {
                this.f168066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationActiveLivenessDigitsSelfieIntroScreen biometricVerificationActiveLivenessDigitsSelfieIntroScreen = this.f168066b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationActiveLivenessDigitsSelfieIntroScreen.R;
                        BiometricVerificationActiveLivenessDigitsSelfieIntroScreen biometricVerificationActiveLivenessDigitsSelfieIntroScreen2 = this.f168066b;
                        return dli.f.a(biometricVerificationActiveLivenessDigitsSelfieIntroScreen2, (n) biometricVerificationActiveLivenessDigitsSelfieIntroScreen2.N.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationActiveLivenessDigitsSelfieIntroScreen.R;
                        return (n) ((pr.k) biometricVerificationActiveLivenessDigitsSelfieIntroScreen.O.getValue()).f238856b.get();
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationActiveLivenessDigitsSelfieIntroScreen.R;
                        qji.b bVarU2 = biometricVerificationActiveLivenessDigitsSelfieIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.digits_selfie_intro.di.BiometricVerificationActiveLivenessDigitsSelfieIntroScreenInjector");
                        pr.k kVar = new pr.k();
                        kVar.f238855a = e4m.b.b(new pl1.h(kVar, 1, 15));
                        kVar.f238856b = e4m.b.b(new pl1.h(kVar, 0, 15));
                        return kVar;
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: is.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessDigitsSelfieIntroScreen f168066b;

            {
                this.f168066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationActiveLivenessDigitsSelfieIntroScreen biometricVerificationActiveLivenessDigitsSelfieIntroScreen = this.f168066b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationActiveLivenessDigitsSelfieIntroScreen.R;
                        BiometricVerificationActiveLivenessDigitsSelfieIntroScreen biometricVerificationActiveLivenessDigitsSelfieIntroScreen2 = this.f168066b;
                        return dli.f.a(biometricVerificationActiveLivenessDigitsSelfieIntroScreen2, (n) biometricVerificationActiveLivenessDigitsSelfieIntroScreen2.N.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationActiveLivenessDigitsSelfieIntroScreen.R;
                        return (n) ((pr.k) biometricVerificationActiveLivenessDigitsSelfieIntroScreen.O.getValue()).f238856b.get();
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationActiveLivenessDigitsSelfieIntroScreen.R;
                        qji.b bVarU2 = biometricVerificationActiveLivenessDigitsSelfieIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.digits_selfie_intro.di.BiometricVerificationActiveLivenessDigitsSelfieIntroScreenInjector");
                        pr.k kVar = new pr.k();
                        kVar.f238855a = e4m.b.b(new pl1.h(kVar, 1, 15));
                        kVar.f238856b = e4m.b.b(new pl1.h(kVar, 0, 15));
                        return kVar;
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: is.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessDigitsSelfieIntroScreen f168066b;

            {
                this.f168066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationActiveLivenessDigitsSelfieIntroScreen biometricVerificationActiveLivenessDigitsSelfieIntroScreen = this.f168066b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationActiveLivenessDigitsSelfieIntroScreen.R;
                        BiometricVerificationActiveLivenessDigitsSelfieIntroScreen biometricVerificationActiveLivenessDigitsSelfieIntroScreen2 = this.f168066b;
                        return dli.f.a(biometricVerificationActiveLivenessDigitsSelfieIntroScreen2, (n) biometricVerificationActiveLivenessDigitsSelfieIntroScreen2.N.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationActiveLivenessDigitsSelfieIntroScreen.R;
                        return (n) ((pr.k) biometricVerificationActiveLivenessDigitsSelfieIntroScreen.O.getValue()).f238856b.get();
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationActiveLivenessDigitsSelfieIntroScreen.R;
                        qji.b bVarU2 = biometricVerificationActiveLivenessDigitsSelfieIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.digits_selfie_intro.di.BiometricVerificationActiveLivenessDigitsSelfieIntroScreenInjector");
                        pr.k kVar = new pr.k();
                        kVar.f238855a = e4m.b.b(new pl1.h(kVar, 1, 15));
                        kVar.f238856b = e4m.b.b(new pl1.h(kVar, 0, 15));
                        return kVar;
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = inputData.f50494b;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((m) oVar);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Q = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pr.k) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AnalyticsContext analyticsContext = this.Q;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.selfie_active_liveness_intro_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174570b;
        navBarWithToolbar.setAnalyticsContext(analyticsContext);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        if (!this.K.f50493a) {
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonAnalyticsContext(analyticsContext);
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.selfie_intro_continue, null, null, 14));
        twinVerticalButton.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinVerticalButton.setMainButtonLoadingTag("BiometricVerificationActiveLivenessIntroScreenContract_BUTTON_TAG");
        twinVerticalButton.setSecondaryButtonAnalyticsContext(analyticsContext);
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.selfie_active_liveness_intro_hand_signs, null, null, 14));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.o);
        twinVerticalButton.setSecondaryButtonLoadingTag("BiometricVerificationActiveLivenessIntroScreenContract_SPEECHLESS_MODE_BUTTON_TAG");
        twinVerticalButton.setSecondaryButtonVisible(true);
        twinVerticalButton.setGradientBackgroundEnabled(true);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(new d(rd0.e.b(d3().f174570b.f59410q), 2), new d(rd0.e.b(d3().d.o0()), 3), new d(rd0.e.b(d3().d.p0()), 4)), new hp4.e(2, (n) this.N.getValue(), n.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/digits_selfie_intro/BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$Event;)V", 4, 21), 3);
    }

    public final jii.w d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.w) value;
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
