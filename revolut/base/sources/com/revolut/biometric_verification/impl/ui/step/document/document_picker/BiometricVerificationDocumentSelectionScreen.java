package com.revolut.biometric_verification.impl.ui.step.document.document_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.R$id;
import com.revolut.biometric_verification.impl.R$layout;
import com.revolut.biometric_verification.impl.ui.step.document.document_picker.BiometricVerificationDocumentSelectionScreen;
import com.revolut.biometric_verification.impl.ui.step.document.document_picker.BiometricVerificationDocumentSelectionScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ft.b;
import ft.d;
import ft.j;
import ft.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import pr.q;
import pr.t;
import pr.u;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/document_picker/BiometricVerificationDocumentSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lft/j;", "Lno/k;", "Ldli/a;", "Lft/l;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationDocumentSelectionScreen extends ViewController<j> implements k, a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(BiometricVerificationDocumentSelectionScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationIntroBinding;", 0))};
    public final BiometricVerificationDocumentSelectionScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public AnalyticsContext R;
    public final CellDetailsListDelegate S;
    public final SelectableDelegate T;

    public BiometricVerificationDocumentSelectionScreen(BiometricVerificationDocumentSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_biometric_verification_intro;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ft.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentSelectionScreen f137743b;

            {
                this.f137743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationDocumentSelectionScreen biometricVerificationDocumentSelectionScreen = this.f137743b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentSelectionScreen.U;
                        BiometricVerificationDocumentSelectionScreen biometricVerificationDocumentSelectionScreen2 = this.f137743b;
                        return dli.f.a(biometricVerificationDocumentSelectionScreen2, (k) biometricVerificationDocumentSelectionScreen2.Q.getValue(), v.k(biometricVerificationDocumentSelectionScreen2.S, biometricVerificationDocumentSelectionScreen2.T), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentSelectionScreen.U;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationDocumentSelectionScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentSelectionScreen.U;
                        qji.b bVarU2 = biometricVerificationDocumentSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.document_picker.di.BiometricVerificationDocumentSelectionScreenInjector");
                        u uVar = (u) bVarU2;
                        q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationDocumentSelectionScreenContract$InputData biometricVerificationDocumentSelectionScreenContract$InputData = biometricVerificationDocumentSelectionScreen.K;
                        biometricVerificationDocumentSelectionScreenContract$InputData.getClass();
                        return new t(qVar, uVar2, biometricVerificationDocumentSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationDocumentSelectionScreen.U;
                        return (k) ((t) biometricVerificationDocumentSelectionScreen.P.getValue()).f238894c.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ft.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentSelectionScreen f137743b;

            {
                this.f137743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationDocumentSelectionScreen biometricVerificationDocumentSelectionScreen = this.f137743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentSelectionScreen.U;
                        BiometricVerificationDocumentSelectionScreen biometricVerificationDocumentSelectionScreen2 = this.f137743b;
                        return dli.f.a(biometricVerificationDocumentSelectionScreen2, (k) biometricVerificationDocumentSelectionScreen2.Q.getValue(), v.k(biometricVerificationDocumentSelectionScreen2.S, biometricVerificationDocumentSelectionScreen2.T), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentSelectionScreen.U;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationDocumentSelectionScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentSelectionScreen.U;
                        qji.b bVarU2 = biometricVerificationDocumentSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.document_picker.di.BiometricVerificationDocumentSelectionScreenInjector");
                        u uVar = (u) bVarU2;
                        q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationDocumentSelectionScreenContract$InputData biometricVerificationDocumentSelectionScreenContract$InputData = biometricVerificationDocumentSelectionScreen.K;
                        biometricVerificationDocumentSelectionScreenContract$InputData.getClass();
                        return new t(qVar, uVar2, biometricVerificationDocumentSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationDocumentSelectionScreen.U;
                        return (k) ((t) biometricVerificationDocumentSelectionScreen.P.getValue()).f238894c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ft.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentSelectionScreen f137743b;

            {
                this.f137743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationDocumentSelectionScreen biometricVerificationDocumentSelectionScreen = this.f137743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentSelectionScreen.U;
                        BiometricVerificationDocumentSelectionScreen biometricVerificationDocumentSelectionScreen2 = this.f137743b;
                        return dli.f.a(biometricVerificationDocumentSelectionScreen2, (k) biometricVerificationDocumentSelectionScreen2.Q.getValue(), v.k(biometricVerificationDocumentSelectionScreen2.S, biometricVerificationDocumentSelectionScreen2.T), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentSelectionScreen.U;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationDocumentSelectionScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentSelectionScreen.U;
                        qji.b bVarU2 = biometricVerificationDocumentSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.document_picker.di.BiometricVerificationDocumentSelectionScreenInjector");
                        u uVar = (u) bVarU2;
                        q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationDocumentSelectionScreenContract$InputData biometricVerificationDocumentSelectionScreenContract$InputData = biometricVerificationDocumentSelectionScreen.K;
                        biometricVerificationDocumentSelectionScreenContract$InputData.getClass();
                        return new t(qVar, uVar2, biometricVerificationDocumentSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationDocumentSelectionScreen.U;
                        return (k) ((t) biometricVerificationDocumentSelectionScreen.P.getValue()).f238894c.get();
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: ft.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentSelectionScreen f137743b;

            {
                this.f137743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BiometricVerificationDocumentSelectionScreen biometricVerificationDocumentSelectionScreen = this.f137743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationDocumentSelectionScreen.U;
                        BiometricVerificationDocumentSelectionScreen biometricVerificationDocumentSelectionScreen2 = this.f137743b;
                        return dli.f.a(biometricVerificationDocumentSelectionScreen2, (k) biometricVerificationDocumentSelectionScreen2.Q.getValue(), v.k(biometricVerificationDocumentSelectionScreen2.S, biometricVerificationDocumentSelectionScreen2.T), R$id.biometricVerificationIntroScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationDocumentSelectionScreen.U;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationDocumentSelectionScreen.d3().f218483b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationDocumentSelectionScreen.U;
                        qji.b bVarU2 = biometricVerificationDocumentSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.document_picker.di.BiometricVerificationDocumentSelectionScreenInjector");
                        u uVar = (u) bVarU2;
                        q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationDocumentSelectionScreenContract$InputData biometricVerificationDocumentSelectionScreenContract$InputData = biometricVerificationDocumentSelectionScreen.K;
                        biometricVerificationDocumentSelectionScreenContract$InputData.getClass();
                        return new t(qVar, uVar2, biometricVerificationDocumentSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationDocumentSelectionScreen.U;
                        return (k) ((t) biometricVerificationDocumentSelectionScreen.P.getValue()).f238894c.get();
                }
            }
        });
        this.R = new AnalyticsContext(cs.b.b(inputData.f50540a));
        CellDetailsListDelegate cellDetailsListDelegate = new CellDetailsListDelegate();
        this.S = cellDetailsListDelegate;
        this.T = new SelectableDelegate(cellDetailsListDelegate);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ((FooterActionButtonView) this.O.getValue()).setButtonEnabled(uiState.f137751b);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.P.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ft.k) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f218484c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.vision_capture_document_selection_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.vision_capture_document_selection_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.vision_capture_document_reason_identity_verification, null, null, 14));
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        if (!this.K.f50541b) {
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        ((FooterActionButtonView) this.O.getValue()).setButtonText(new TextLocalisedClause(R$string.vision_capture_document_selection_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f218484c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(((FooterActionButtonView) this.O.getValue()).f0()), 6), new exe.k(2, (ft.k) this.Q.getValue(), ft.k.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/document_picker/BiometricVerificationDocumentSelectionScreenContract$Event;)V", 4, 11), 3);
        ViewController.P2(this, rd0.e.b(this.T.r()), new ft.e(this, null), 3);
    }

    public final nr.a d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
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
