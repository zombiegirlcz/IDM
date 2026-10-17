package com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.R$id;
import com.revolut.biometric_verification.impl.R$layout;
import com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.BiometricVerificationManualDocumentSelectionScreen;
import com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.BiometricVerificationManualDocumentSelectionScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import p73.d;
import pr.q;
import pt.b;
import pt.l;
import pt.m;
import pt.n;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpt/l;", "Lno/k;", "Ltki/c;", "Lpt/n;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationManualDocumentSelectionScreen extends ViewController<l> implements k, c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BiometricVerificationManualDocumentSelectionScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationManualDocumentSelectionBinding;", 0))};
    public final BiometricVerificationManualDocumentSelectionScreenContract$InputData K;
    public final h L;
    public final Object M;
    public AnalyticsContext N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public BiometricVerificationManualDocumentSelectionScreen(BiometricVerificationManualDocumentSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new pni.a(10));
        this.N = inputData.d;
        this.O = R$layout.screen_biometric_verification_manual_document_selection;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: pt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationManualDocumentSelectionScreen f239552b;

            {
                this.f239552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationManualDocumentSelectionScreen biometricVerificationManualDocumentSelectionScreen = this.f239552b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationManualDocumentSelectionScreen.S;
                        BiometricVerificationManualDocumentSelectionScreen biometricVerificationManualDocumentSelectionScreen2 = this.f239552b;
                        return tki.g.a(biometricVerificationManualDocumentSelectionScreen2, biometricVerificationManualDocumentSelectionScreen2.R2(), u.c((InputTextDelegate) biometricVerificationManualDocumentSelectionScreen2.M.getValue()), R$id.biometricVerificationManualDocumentSelectionScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationManualDocumentSelectionScreen.S;
                        qji.b bVarU2 = biometricVerificationManualDocumentSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.di.BiometricVerificationManualDocumentSelectionScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationManualDocumentSelectionScreenContract$InputData biometricVerificationManualDocumentSelectionScreenContract$InputData = biometricVerificationManualDocumentSelectionScreen.K;
                        biometricVerificationManualDocumentSelectionScreenContract$InputData.getClass();
                        return new pr.w(qVar, uVar2, biometricVerificationManualDocumentSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationManualDocumentSelectionScreen.S;
                        return (m) ((pr.w) biometricVerificationManualDocumentSelectionScreen.Q.getValue()).f238905c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: pt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationManualDocumentSelectionScreen f239552b;

            {
                this.f239552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationManualDocumentSelectionScreen biometricVerificationManualDocumentSelectionScreen = this.f239552b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationManualDocumentSelectionScreen.S;
                        BiometricVerificationManualDocumentSelectionScreen biometricVerificationManualDocumentSelectionScreen2 = this.f239552b;
                        return tki.g.a(biometricVerificationManualDocumentSelectionScreen2, biometricVerificationManualDocumentSelectionScreen2.R2(), u.c((InputTextDelegate) biometricVerificationManualDocumentSelectionScreen2.M.getValue()), R$id.biometricVerificationManualDocumentSelectionScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationManualDocumentSelectionScreen.S;
                        qji.b bVarU2 = biometricVerificationManualDocumentSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.di.BiometricVerificationManualDocumentSelectionScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationManualDocumentSelectionScreenContract$InputData biometricVerificationManualDocumentSelectionScreenContract$InputData = biometricVerificationManualDocumentSelectionScreen.K;
                        biometricVerificationManualDocumentSelectionScreenContract$InputData.getClass();
                        return new pr.w(qVar, uVar2, biometricVerificationManualDocumentSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationManualDocumentSelectionScreen.S;
                        return (m) ((pr.w) biometricVerificationManualDocumentSelectionScreen.Q.getValue()).f238905c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: pt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationManualDocumentSelectionScreen f239552b;

            {
                this.f239552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationManualDocumentSelectionScreen biometricVerificationManualDocumentSelectionScreen = this.f239552b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationManualDocumentSelectionScreen.S;
                        BiometricVerificationManualDocumentSelectionScreen biometricVerificationManualDocumentSelectionScreen2 = this.f239552b;
                        return tki.g.a(biometricVerificationManualDocumentSelectionScreen2, biometricVerificationManualDocumentSelectionScreen2.R2(), u.c((InputTextDelegate) biometricVerificationManualDocumentSelectionScreen2.M.getValue()), R$id.biometricVerificationManualDocumentSelectionScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationManualDocumentSelectionScreen.S;
                        qji.b bVarU2 = biometricVerificationManualDocumentSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.di.BiometricVerificationManualDocumentSelectionScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationManualDocumentSelectionScreenContract$InputData biometricVerificationManualDocumentSelectionScreenContract$InputData = biometricVerificationManualDocumentSelectionScreen.K;
                        biometricVerificationManualDocumentSelectionScreenContract$InputData.getClass();
                        return new pr.w(qVar, uVar2, biometricVerificationManualDocumentSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationManualDocumentSelectionScreen.S;
                        return (m) ((pr.w) biometricVerificationManualDocumentSelectionScreen.Q.getValue()).f238905c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((n) oVar);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pr.w) this.Q.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AnalyticsContext analyticsContext = this.N;
        NavBarWithToolbar navBarWithToolbar = d3().f218487c;
        navBarWithToolbar.setAnalyticsContext(analyticsContext);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.vision_manual_document_selection_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.vision_manual_document_selection_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.vision_manual_document_selection_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        FooterActionButtonView footerActionButtonView = d3().f218486b;
        footerActionButtonView.setAnalyticsContext(analyticsContext);
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.vision_manual_document_selection_submit_button, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r122 = this.M;
        ViewController.P2(this, vkm.q.J(rd0.e.b(((InputTextDelegate) r122.getValue()).f52575g.f121375b), rd0.e.b(((InputTextDelegate) r122.getValue()).i.f121375b)), new pt.e(this, null), 3);
        int i = 4;
        int i2 = 2;
        ViewController.P2(this, new d(rd0.e.b(d3().f218487c.f59410q), 25), new pp4.h(i2, R2(), m.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreenContract$Event;)V", i, 5), 3);
        ViewController.P2(this, new d(rd0.e.b(d3().f218486b.f0()), 26), new pp4.h(i2, R2(), m.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreenContract$Event;)V", i, 6), 3);
    }

    public final nr.b d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nr.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
