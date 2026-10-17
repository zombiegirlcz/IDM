package com.revolut.biometric_verification.impl.ui.step.document.before_you_proceed;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.R$id;
import com.revolut.biometric_verification.impl.R$layout;
import com.revolut.biometric_verification.impl.ui.step.document.before_you_proceed.BiometricVerificationBeforeYouProceedScreen;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
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
import org.jetbrains.annotations.NotNull;
import pr.o;
import t9l.f;
import te0.w;
import ts.b;
import ts.i;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/before_you_proceed/BiometricVerificationBeforeYouProceedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lno/k;", "Ldli/a;", "Lts/h;", "Companion", "a", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationBeforeYouProceedScreen extends ViewController<q> implements k, a {
    public final BiometricVerificationBeforeYouProceedScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public AnalyticsContext P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BiometricVerificationBeforeYouProceedScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationIntroBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final LargeActionButton.ButtonStyle.BlackOrWhiteButton.Plain T = LargeActionButton.ButtonStyle.e;

    /* JADX INFO: renamed from: com.revolut.biometric_verification.impl.ui.step.document.before_you_proceed.BiometricVerificationBeforeYouProceedScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public BiometricVerificationBeforeYouProceedScreen(BiometricVerificationBeforeYouProceedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_biometric_verification_intro;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ts.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationBeforeYouProceedScreen f273846b;

            {
                this.f273846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationBeforeYouProceedScreen biometricVerificationBeforeYouProceedScreen = this.f273846b;
                switch (i2) {
                    case 0:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        BiometricVerificationBeforeYouProceedScreen biometricVerificationBeforeYouProceedScreen2 = this.f273846b;
                        return dli.f.a(biometricVerificationBeforeYouProceedScreen2, (i) biometricVerificationBeforeYouProceedScreen2.R.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion2 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationBeforeYouProceedScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion3 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        qji.b bVarU2 = biometricVerificationBeforeYouProceedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.before_you_proceed.di.BiometricVerificationBeforeYouProceedScreenInjector");
                        biometricVerificationBeforeYouProceedScreen.K.getClass();
                        o oVar = new o();
                        oVar.f238865a = e4m.b.b(new pl1.h(oVar, 1, 18));
                        oVar.f238866b = e4m.b.b(new pl1.h(oVar, 0, 18));
                        return oVar;
                    default:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion4 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        return (i) ((o) biometricVerificationBeforeYouProceedScreen.Q.getValue()).f238866b.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ts.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationBeforeYouProceedScreen f273846b;

            {
                this.f273846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationBeforeYouProceedScreen biometricVerificationBeforeYouProceedScreen = this.f273846b;
                switch (i22) {
                    case 0:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        BiometricVerificationBeforeYouProceedScreen biometricVerificationBeforeYouProceedScreen2 = this.f273846b;
                        return dli.f.a(biometricVerificationBeforeYouProceedScreen2, (i) biometricVerificationBeforeYouProceedScreen2.R.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion2 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationBeforeYouProceedScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion3 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        qji.b bVarU2 = biometricVerificationBeforeYouProceedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.before_you_proceed.di.BiometricVerificationBeforeYouProceedScreenInjector");
                        biometricVerificationBeforeYouProceedScreen.K.getClass();
                        o oVar = new o();
                        oVar.f238865a = e4m.b.b(new pl1.h(oVar, 1, 18));
                        oVar.f238866b = e4m.b.b(new pl1.h(oVar, 0, 18));
                        return oVar;
                    default:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion4 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        return (i) ((o) biometricVerificationBeforeYouProceedScreen.Q.getValue()).f238866b.get();
                }
            }
        });
        this.P = new AnalyticsContext(inputData.f50519b);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ts.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationBeforeYouProceedScreen f273846b;

            {
                this.f273846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationBeforeYouProceedScreen biometricVerificationBeforeYouProceedScreen = this.f273846b;
                switch (i22) {
                    case 0:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        BiometricVerificationBeforeYouProceedScreen biometricVerificationBeforeYouProceedScreen2 = this.f273846b;
                        return dli.f.a(biometricVerificationBeforeYouProceedScreen2, (i) biometricVerificationBeforeYouProceedScreen2.R.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion2 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationBeforeYouProceedScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion3 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        qji.b bVarU2 = biometricVerificationBeforeYouProceedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.before_you_proceed.di.BiometricVerificationBeforeYouProceedScreenInjector");
                        biometricVerificationBeforeYouProceedScreen.K.getClass();
                        o oVar = new o();
                        oVar.f238865a = e4m.b.b(new pl1.h(oVar, 1, 18));
                        oVar.f238866b = e4m.b.b(new pl1.h(oVar, 0, 18));
                        return oVar;
                    default:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion4 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        return (i) ((o) biometricVerificationBeforeYouProceedScreen.Q.getValue()).f238866b.get();
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: ts.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationBeforeYouProceedScreen f273846b;

            {
                this.f273846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BiometricVerificationBeforeYouProceedScreen biometricVerificationBeforeYouProceedScreen = this.f273846b;
                switch (i22) {
                    case 0:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        BiometricVerificationBeforeYouProceedScreen biometricVerificationBeforeYouProceedScreen2 = this.f273846b;
                        return dli.f.a(biometricVerificationBeforeYouProceedScreen2, (i) biometricVerificationBeforeYouProceedScreen2.R.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion2 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationBeforeYouProceedScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion3 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        qji.b bVarU2 = biometricVerificationBeforeYouProceedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.before_you_proceed.di.BiometricVerificationBeforeYouProceedScreenInjector");
                        biometricVerificationBeforeYouProceedScreen.K.getClass();
                        o oVar = new o();
                        oVar.f238865a = e4m.b.b(new pl1.h(oVar, 1, 18));
                        oVar.f238866b = e4m.b.b(new pl1.h(oVar, 0, 18));
                        return oVar;
                    default:
                        BiometricVerificationBeforeYouProceedScreen.Companion companion4 = BiometricVerificationBeforeYouProceedScreen.INSTANCE;
                        return (i) ((o) biometricVerificationBeforeYouProceedScreen.Q.getValue()).f238866b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        ts.h uiState = (ts.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f218484c;
        navBarWithToolbar.setTitle(uiState.f273851a, null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f273852b);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.P = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.Q.getValue();
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
        return (i) this.R.getValue();
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
        if (!this.K.f50518a) {
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        navBarWithToolbar.setDescriptionVisible(true);
        FooterActionButtonView footerActionButtonView = (FooterActionButtonView) this.O.getValue();
        footerActionButtonView.setAnalyticsContext(analyticsContext);
        footerActionButtonView.setBackgroundColorAttr(R$attr.uikit_colorTransparent);
        footerActionButtonView.setButtonStyle(T);
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.vision_common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f fVar = new f(rd0.e.b(d3().f218484c.f59410q), 21);
        ?? r132 = this.R;
        ViewController.P2(this, fVar, new ryj.f(2, (i) r132.getValue(), i.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/before_you_proceed/BiometricVerificationBeforeYouProceedScreenContract$Event;)V", 4, 26), 3);
        ViewController.P2(this, new f(rd0.e.b(((FooterActionButtonView) this.O.getValue()).f0()), 22), new ryj.f(2, (i) r132.getValue(), i.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/before_you_proceed/BiometricVerificationBeforeYouProceedScreenContract$Event;)V", 4, 27), 3);
    }

    public final nr.a d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
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
