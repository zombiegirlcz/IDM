package com.revolut.biometric_verification.impl.ui.step.active_liveness.video_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.video_confirmation.BiometricVerificationActiveLivenessVideoConfirmationScreen;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.video_confirmation.BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
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
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import pr.n;
import q9c.v;
import rs.b;
import rs.l;
import rs.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/video_confirmation/BiometricVerificationActiveLivenessVideoConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrs/l;", "Lno/k;", "Ldli/a;", "Lrs/m;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationActiveLivenessVideoConfirmationScreen extends ViewController<l> implements k, a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BiometricVerificationActiveLivenessVideoConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public AnalyticsContext Q;

    public BiometricVerificationActiveLivenessVideoConfirmationScreen(BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: rs.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessVideoConfirmationScreen f256886b;

            {
                this.f256886b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationActiveLivenessVideoConfirmationScreen biometricVerificationActiveLivenessVideoConfirmationScreen = this.f256886b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationActiveLivenessVideoConfirmationScreen.R;
                        BiometricVerificationActiveLivenessVideoConfirmationScreen biometricVerificationActiveLivenessVideoConfirmationScreen2 = this.f256886b;
                        return dli.f.a(biometricVerificationActiveLivenessVideoConfirmationScreen2, (n) biometricVerificationActiveLivenessVideoConfirmationScreen2.N.getValue(), u.c(new SimpleMediaDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationActiveLivenessVideoConfirmationScreen.R;
                        return (n) ((pr.n) biometricVerificationActiveLivenessVideoConfirmationScreen.O.getValue()).f238864c.get();
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationActiveLivenessVideoConfirmationScreen.R;
                        qji.b bVarU2 = biometricVerificationActiveLivenessVideoConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.video_confirmation.di.BiometricVerificationActiveLivenessVideoConfirmationScreenInjector");
                        pr.m mVar = (pr.m) bVarU2;
                        pr.q qVar = mVar.f238861c;
                        pr.m mVar2 = mVar.d;
                        BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData = biometricVerificationActiveLivenessVideoConfirmationScreen.K;
                        biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.getClass();
                        return new pr.n(qVar, mVar2, biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: rs.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessVideoConfirmationScreen f256886b;

            {
                this.f256886b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationActiveLivenessVideoConfirmationScreen biometricVerificationActiveLivenessVideoConfirmationScreen = this.f256886b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationActiveLivenessVideoConfirmationScreen.R;
                        BiometricVerificationActiveLivenessVideoConfirmationScreen biometricVerificationActiveLivenessVideoConfirmationScreen2 = this.f256886b;
                        return dli.f.a(biometricVerificationActiveLivenessVideoConfirmationScreen2, (n) biometricVerificationActiveLivenessVideoConfirmationScreen2.N.getValue(), u.c(new SimpleMediaDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationActiveLivenessVideoConfirmationScreen.R;
                        return (n) ((pr.n) biometricVerificationActiveLivenessVideoConfirmationScreen.O.getValue()).f238864c.get();
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationActiveLivenessVideoConfirmationScreen.R;
                        qji.b bVarU2 = biometricVerificationActiveLivenessVideoConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.video_confirmation.di.BiometricVerificationActiveLivenessVideoConfirmationScreenInjector");
                        pr.m mVar = (pr.m) bVarU2;
                        pr.q qVar = mVar.f238861c;
                        pr.m mVar2 = mVar.d;
                        BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData = biometricVerificationActiveLivenessVideoConfirmationScreen.K;
                        biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.getClass();
                        return new pr.n(qVar, mVar2, biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: rs.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessVideoConfirmationScreen f256886b;

            {
                this.f256886b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationActiveLivenessVideoConfirmationScreen biometricVerificationActiveLivenessVideoConfirmationScreen = this.f256886b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationActiveLivenessVideoConfirmationScreen.R;
                        BiometricVerificationActiveLivenessVideoConfirmationScreen biometricVerificationActiveLivenessVideoConfirmationScreen2 = this.f256886b;
                        return dli.f.a(biometricVerificationActiveLivenessVideoConfirmationScreen2, (n) biometricVerificationActiveLivenessVideoConfirmationScreen2.N.getValue(), u.c(new SimpleMediaDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationActiveLivenessVideoConfirmationScreen.R;
                        return (n) ((pr.n) biometricVerificationActiveLivenessVideoConfirmationScreen.O.getValue()).f238864c.get();
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationActiveLivenessVideoConfirmationScreen.R;
                        qji.b bVarU2 = biometricVerificationActiveLivenessVideoConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.video_confirmation.di.BiometricVerificationActiveLivenessVideoConfirmationScreenInjector");
                        pr.m mVar = (pr.m) bVarU2;
                        pr.q qVar = mVar.f238861c;
                        pr.m mVar2 = mVar.d;
                        BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData = biometricVerificationActiveLivenessVideoConfirmationScreen.K;
                        biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.getClass();
                        return new pr.n(qVar, mVar2, biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = inputData.d;
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
        return (n) this.O.getValue();
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
        return (rs.n) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AnalyticsContext analyticsContext = this.Q;
        TextLocalisedClause title = new TextLocalisedClause(R$string.selfie_active_liveness_video_confirmation_title, null, null, 14);
        int i = R$string.selfie_active_liveness_confirmation_description;
        BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData = this.K;
        TextLocalisedClause secondDescription = new TextLocalisedClause(i, u.c(biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.f50516b), null, 12);
        NavBarWithToolbar navBarWithToolbar = d3().f174570b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "screenRecyclerNavbarTwin…alButtonNavBarWithToolbar");
        j0 headerTitleMode = j0.MULTILINE_LARGE;
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        if (!biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.f50517c) {
            numValueOf = null;
        }
        Intrinsics.checkNotNullParameter(headerTitleMode, "headerTitleMode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        navBarWithToolbar.setAnalyticsContext(analyticsContext);
        navBarWithToolbar.setHeaderTitleMode(headerTitleMode);
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        navBarWithToolbar.setToolbarTitle(title);
        navBarWithToolbar.setTitle(title, null);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionText(secondDescription);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinVerticalButton, "screenRecyclerNavbarTwin…lButtonTwinVerticalButton");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.selfie_active_liveness_confirmation_primary_button_title, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        rs.q primaryButton = new rs.q(textLocalisedClause, defaultFilledButton, "ACTIVE_LIVENESS_VIDEO_CONFIRMATION_SUBMIT");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.vision_upload_error_rejection_active_liveness_action, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        rs.q secondaryButton = new rs.q(textLocalisedClause2, defaultFilledButton2, "ACTIVE_LIVENESS_VIDEO_CONFIRMATION_RETAKE");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        twinVerticalButton.setMainButtonAnalyticsContext(analyticsContext);
        twinVerticalButton.setMainButtonText(textLocalisedClause);
        twinVerticalButton.setMainButtonStyle(defaultFilledButton);
        twinVerticalButton.setMainButtonLoadingTag("ACTIVE_LIVENESS_VIDEO_CONFIRMATION_SUBMIT");
        twinVerticalButton.setSecondaryButtonAnalyticsContext(analyticsContext);
        twinVerticalButton.setSecondaryButtonText(textLocalisedClause2);
        twinVerticalButton.setSecondaryButtonStyle(defaultFilledButton2);
        twinVerticalButton.setSecondaryButtonLoadingTag("ACTIVE_LIVENESS_VIDEO_CONFIRMATION_RETAKE");
        twinVerticalButton.setSecondaryButtonVisible(true);
        twinVerticalButton.setGradientBackgroundEnabled(true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(new r7b.e(rd0.e.b(d3().f174570b.f59410q), 13), new r7b.e(rd0.e.b(d3().d.o0()), 14), new r7b.e(rd0.e.b(d3().d.p0()), 15)), new v(2, (rs.n) this.N.getValue(), rs.n.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/video_confirmation/BiometricVerificationActiveLivenessVideoConfirmationScreenContract$Event;)V", 4, 21), 3);
    }

    public final jii.w d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.w) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
