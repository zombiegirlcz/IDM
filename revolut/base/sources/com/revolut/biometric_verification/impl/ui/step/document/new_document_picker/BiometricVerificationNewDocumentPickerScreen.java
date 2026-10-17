package com.revolut.biometric_verification.impl.ui.step.document.new_document_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.R$id;
import com.revolut.biometric_verification.impl.R$layout;
import com.revolut.biometric_verification.impl.ui.step.document.new_document_picker.BiometricVerificationNewDocumentPickerScreen;
import com.revolut.biometric_verification.impl.ui.step.document.new_document_picker.BiometricVerificationNewDocumentPickerScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
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
import no.k;
import pr.c0;
import pr.u;
import t4j.c;
import te0.w;
import tx0.j0;
import u36.g;
import urd.n;
import ut.b;
import ut.o;
import ut.p;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/new_document_picker/BiometricVerificationNewDocumentPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lut/o;", "Lno/k;", "Ldli/a;", "Lut/p;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationNewDocumentPickerScreen extends ViewController<o> implements k, a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(BiometricVerificationNewDocumentPickerScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationNewDocumentPickerBinding;", 0))};
    public final BiometricVerificationNewDocumentPickerScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public AnalyticsContext T;

    public BiometricVerificationNewDocumentPickerScreen(BiometricVerificationNewDocumentPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_biometric_verification_new_document_picker;
        this.M = s.t(this, b.f);
        this.N = w.y0(new us4.b(8));
        this.O = w.y0(new us4.b(9));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ut.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationNewDocumentPickerScreen f282995b;

            {
                this.f282995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationNewDocumentPickerScreen biometricVerificationNewDocumentPickerScreen = this.f282995b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationNewDocumentPickerScreen.U;
                        return new SelectableDelegate((CellDetailsListDelegate) biometricVerificationNewDocumentPickerScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationNewDocumentPickerScreen.U;
                        BiometricVerificationNewDocumentPickerScreen biometricVerificationNewDocumentPickerScreen2 = this.f282995b;
                        return dli.f.a(biometricVerificationNewDocumentPickerScreen2, biometricVerificationNewDocumentPickerScreen2.R2(), v.k((InputTextDelegate) biometricVerificationNewDocumentPickerScreen2.N.getValue(), new ListSubheaderDelegate(), (CellDetailsListDelegate) biometricVerificationNewDocumentPickerScreen2.O.getValue(), (SelectableDelegate) biometricVerificationNewDocumentPickerScreen2.P.getValue()), R$id.biometricVerificationNewDocumentPicker_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationNewDocumentPickerScreen.U;
                        qji.b bVarU2 = biometricVerificationNewDocumentPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.new_document_picker.di.BiometricVerificationNewDocumentPickerScreenInjector");
                        u uVar = (u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationNewDocumentPickerScreenContract$InputData biometricVerificationNewDocumentPickerScreenContract$InputData = biometricVerificationNewDocumentPickerScreen.K;
                        biometricVerificationNewDocumentPickerScreenContract$InputData.getClass();
                        return new c0(qVar, uVar2, biometricVerificationNewDocumentPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationNewDocumentPickerScreen.U;
                        return (q) ((c0) biometricVerificationNewDocumentPickerScreen.R.getValue()).f238835c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ut.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationNewDocumentPickerScreen f282995b;

            {
                this.f282995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationNewDocumentPickerScreen biometricVerificationNewDocumentPickerScreen = this.f282995b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationNewDocumentPickerScreen.U;
                        return new SelectableDelegate((CellDetailsListDelegate) biometricVerificationNewDocumentPickerScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationNewDocumentPickerScreen.U;
                        BiometricVerificationNewDocumentPickerScreen biometricVerificationNewDocumentPickerScreen2 = this.f282995b;
                        return dli.f.a(biometricVerificationNewDocumentPickerScreen2, biometricVerificationNewDocumentPickerScreen2.R2(), v.k((InputTextDelegate) biometricVerificationNewDocumentPickerScreen2.N.getValue(), new ListSubheaderDelegate(), (CellDetailsListDelegate) biometricVerificationNewDocumentPickerScreen2.O.getValue(), (SelectableDelegate) biometricVerificationNewDocumentPickerScreen2.P.getValue()), R$id.biometricVerificationNewDocumentPicker_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationNewDocumentPickerScreen.U;
                        qji.b bVarU2 = biometricVerificationNewDocumentPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.new_document_picker.di.BiometricVerificationNewDocumentPickerScreenInjector");
                        u uVar = (u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationNewDocumentPickerScreenContract$InputData biometricVerificationNewDocumentPickerScreenContract$InputData = biometricVerificationNewDocumentPickerScreen.K;
                        biometricVerificationNewDocumentPickerScreenContract$InputData.getClass();
                        return new c0(qVar, uVar2, biometricVerificationNewDocumentPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationNewDocumentPickerScreen.U;
                        return (q) ((c0) biometricVerificationNewDocumentPickerScreen.R.getValue()).f238835c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ut.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationNewDocumentPickerScreen f282995b;

            {
                this.f282995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationNewDocumentPickerScreen biometricVerificationNewDocumentPickerScreen = this.f282995b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationNewDocumentPickerScreen.U;
                        return new SelectableDelegate((CellDetailsListDelegate) biometricVerificationNewDocumentPickerScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationNewDocumentPickerScreen.U;
                        BiometricVerificationNewDocumentPickerScreen biometricVerificationNewDocumentPickerScreen2 = this.f282995b;
                        return dli.f.a(biometricVerificationNewDocumentPickerScreen2, biometricVerificationNewDocumentPickerScreen2.R2(), v.k((InputTextDelegate) biometricVerificationNewDocumentPickerScreen2.N.getValue(), new ListSubheaderDelegate(), (CellDetailsListDelegate) biometricVerificationNewDocumentPickerScreen2.O.getValue(), (SelectableDelegate) biometricVerificationNewDocumentPickerScreen2.P.getValue()), R$id.biometricVerificationNewDocumentPicker_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationNewDocumentPickerScreen.U;
                        qji.b bVarU2 = biometricVerificationNewDocumentPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.new_document_picker.di.BiometricVerificationNewDocumentPickerScreenInjector");
                        u uVar = (u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationNewDocumentPickerScreenContract$InputData biometricVerificationNewDocumentPickerScreenContract$InputData = biometricVerificationNewDocumentPickerScreen.K;
                        biometricVerificationNewDocumentPickerScreenContract$InputData.getClass();
                        return new c0(qVar, uVar2, biometricVerificationNewDocumentPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationNewDocumentPickerScreen.U;
                        return (q) ((c0) biometricVerificationNewDocumentPickerScreen.R.getValue()).f238835c.get();
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: ut.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationNewDocumentPickerScreen f282995b;

            {
                this.f282995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BiometricVerificationNewDocumentPickerScreen biometricVerificationNewDocumentPickerScreen = this.f282995b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationNewDocumentPickerScreen.U;
                        return new SelectableDelegate((CellDetailsListDelegate) biometricVerificationNewDocumentPickerScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationNewDocumentPickerScreen.U;
                        BiometricVerificationNewDocumentPickerScreen biometricVerificationNewDocumentPickerScreen2 = this.f282995b;
                        return dli.f.a(biometricVerificationNewDocumentPickerScreen2, biometricVerificationNewDocumentPickerScreen2.R2(), v.k((InputTextDelegate) biometricVerificationNewDocumentPickerScreen2.N.getValue(), new ListSubheaderDelegate(), (CellDetailsListDelegate) biometricVerificationNewDocumentPickerScreen2.O.getValue(), (SelectableDelegate) biometricVerificationNewDocumentPickerScreen2.P.getValue()), R$id.biometricVerificationNewDocumentPicker_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationNewDocumentPickerScreen.U;
                        qji.b bVarU2 = biometricVerificationNewDocumentPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.new_document_picker.di.BiometricVerificationNewDocumentPickerScreenInjector");
                        u uVar = (u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        u uVar2 = uVar.d;
                        BiometricVerificationNewDocumentPickerScreenContract$InputData biometricVerificationNewDocumentPickerScreenContract$InputData = biometricVerificationNewDocumentPickerScreen.K;
                        biometricVerificationNewDocumentPickerScreenContract$InputData.getClass();
                        return new c0(qVar, uVar2, biometricVerificationNewDocumentPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationNewDocumentPickerScreen.U;
                        return (q) ((c0) biometricVerificationNewDocumentPickerScreen.R.getValue()).f238835c.get();
                }
            }
        });
        AnalyticsContext analyticsContext = inputData.f50613c;
        this.T = new AnalyticsContext(analyticsContext != null ? analyticsContext.f50296a : cs.b.b(inputData.f50611a));
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f218497c;
        navBarWithToolbar.setTitle(uiState.f283010b, null);
        navBarWithToolbar.setDescriptionText(uiState.f283011c);
        d3().f218496b.setButtonEnabled(uiState.d);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.T = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.R.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.T;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f218497c;
        navBarWithToolbar.setAnalyticsContext(this.T);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionVisible(true);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        if (!this.K.f50612b) {
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        FooterActionButtonView footerActionButtonView = d3().f218496b;
        footerActionButtonView.setAnalyticsContext(this.T);
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.vision_capture_document_selection_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r122 = this.N;
        ViewController.P2(this, new c(vkm.q.J(rd0.e.b(((InputTextDelegate) r122.getValue()).f52575g.f121375b), rd0.e.b(((InputTextDelegate) r122.getValue()).i.f121375b)), 3), new g(2, R2(), ut.q.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/new_document_picker/BiometricVerificationNewDocumentPickerScreenContract$Event;)V", 4, 5), 3);
        int i = 4;
        int i2 = 2;
        ViewController.P2(this, new n(rd0.e.b(((SelectableDelegate) this.P.getValue()).r()), 7), new g(i2, R2(), ut.q.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/new_document_picker/BiometricVerificationNewDocumentPickerScreenContract$Event;)V", i, 6), 3);
        ViewController.P2(this, new n(rd0.e.b(d3().f218496b.f0()), 5), new g(i2, R2(), ut.q.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/new_document_picker/BiometricVerificationNewDocumentPickerScreenContract$Event;)V", i, 7), 3);
        ViewController.P2(this, new n(rd0.e.b(d3().f218497c.f59410q), 6), new g(i2, R2(), ut.q.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/new_document_picker/BiometricVerificationNewDocumentPickerScreenContract$Event;)V", i, 8), 3);
    }

    public final nr.e d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nr.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ut.q d() {
        return (ut.q) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
