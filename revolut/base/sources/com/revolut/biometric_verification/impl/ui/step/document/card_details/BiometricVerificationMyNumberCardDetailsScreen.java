package com.revolut.biometric_verification.impl.ui.step.document.card_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.ui.step.document.card_details.BiometricVerificationMyNumberCardDetailsScreen;
import com.revolut.biometric_verification.impl.ui.step.document.card_details.BiometricVerificationMyNumberCardDetailsScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
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
import pr.y;
import te0.w;
import tx0.j0;
import u36.g;
import vc.s;
import vs.b;
import vs.m;
import vs.n;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/card_details/BiometricVerificationMyNumberCardDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvs/m;", "Lno/k;", "Ldli/a;", "Lvs/n;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationMyNumberCardDetailsScreen extends ViewController<m> implements k, a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(BiometricVerificationMyNumberCardDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final BiometricVerificationMyNumberCardDetailsScreenContract$InputData K;
    public final h L;
    public final CellDetailsDelegate M;
    public final Object N;
    public final int O;
    public final Object P;
    public AnalyticsContext Q;
    public final Object R;
    public final Object S;

    public BiometricVerificationMyNumberCardDetailsScreen(BiometricVerificationMyNumberCardDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new CellDetailsDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: vs.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberCardDetailsScreen f291695b;

            {
                this.f291695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationMyNumberCardDetailsScreen biometricVerificationMyNumberCardDetailsScreen = this.f291695b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationMyNumberCardDetailsScreen.T;
                        LargeActionButton goToButton = biometricVerificationMyNumberCardDetailsScreen.d3().f174564b;
                        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
                        return goToButton;
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        BiometricVerificationMyNumberCardDetailsScreen biometricVerificationMyNumberCardDetailsScreen2 = this.f291695b;
                        return dli.f.a(biometricVerificationMyNumberCardDetailsScreen2, (o) biometricVerificationMyNumberCardDetailsScreen2.S.getValue(), u.c(biometricVerificationMyNumberCardDetailsScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        qji.b bVarU2 = biometricVerificationMyNumberCardDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_details.di.BiometricVerificationMyNumberCardDetailsScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationMyNumberCardDetailsScreenContract$InputData biometricVerificationMyNumberCardDetailsScreenContract$InputData = biometricVerificationMyNumberCardDetailsScreen.K;
                        biometricVerificationMyNumberCardDetailsScreenContract$InputData.getClass();
                        return new y(qVar, uVar2, biometricVerificationMyNumberCardDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        return (o) ((y) biometricVerificationMyNumberCardDetailsScreen.R.getValue()).f238911c.get();
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: vs.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberCardDetailsScreen f291695b;

            {
                this.f291695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationMyNumberCardDetailsScreen biometricVerificationMyNumberCardDetailsScreen = this.f291695b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationMyNumberCardDetailsScreen.T;
                        LargeActionButton goToButton = biometricVerificationMyNumberCardDetailsScreen.d3().f174564b;
                        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
                        return goToButton;
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        BiometricVerificationMyNumberCardDetailsScreen biometricVerificationMyNumberCardDetailsScreen2 = this.f291695b;
                        return dli.f.a(biometricVerificationMyNumberCardDetailsScreen2, (o) biometricVerificationMyNumberCardDetailsScreen2.S.getValue(), u.c(biometricVerificationMyNumberCardDetailsScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        qji.b bVarU2 = biometricVerificationMyNumberCardDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_details.di.BiometricVerificationMyNumberCardDetailsScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationMyNumberCardDetailsScreenContract$InputData biometricVerificationMyNumberCardDetailsScreenContract$InputData = biometricVerificationMyNumberCardDetailsScreen.K;
                        biometricVerificationMyNumberCardDetailsScreenContract$InputData.getClass();
                        return new y(qVar, uVar2, biometricVerificationMyNumberCardDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        return (o) ((y) biometricVerificationMyNumberCardDetailsScreen.R.getValue()).f238911c.get();
                }
            }
        });
        this.Q = new AnalyticsContext(inputData.f50521b);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: vs.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberCardDetailsScreen f291695b;

            {
                this.f291695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationMyNumberCardDetailsScreen biometricVerificationMyNumberCardDetailsScreen = this.f291695b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationMyNumberCardDetailsScreen.T;
                        LargeActionButton goToButton = biometricVerificationMyNumberCardDetailsScreen.d3().f174564b;
                        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
                        return goToButton;
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        BiometricVerificationMyNumberCardDetailsScreen biometricVerificationMyNumberCardDetailsScreen2 = this.f291695b;
                        return dli.f.a(biometricVerificationMyNumberCardDetailsScreen2, (o) biometricVerificationMyNumberCardDetailsScreen2.S.getValue(), u.c(biometricVerificationMyNumberCardDetailsScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        qji.b bVarU2 = biometricVerificationMyNumberCardDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_details.di.BiometricVerificationMyNumberCardDetailsScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationMyNumberCardDetailsScreenContract$InputData biometricVerificationMyNumberCardDetailsScreenContract$InputData = biometricVerificationMyNumberCardDetailsScreen.K;
                        biometricVerificationMyNumberCardDetailsScreenContract$InputData.getClass();
                        return new y(qVar, uVar2, biometricVerificationMyNumberCardDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        return (o) ((y) biometricVerificationMyNumberCardDetailsScreen.R.getValue()).f238911c.get();
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: vs.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberCardDetailsScreen f291695b;

            {
                this.f291695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BiometricVerificationMyNumberCardDetailsScreen biometricVerificationMyNumberCardDetailsScreen = this.f291695b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationMyNumberCardDetailsScreen.T;
                        LargeActionButton goToButton = biometricVerificationMyNumberCardDetailsScreen.d3().f174564b;
                        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
                        return goToButton;
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        BiometricVerificationMyNumberCardDetailsScreen biometricVerificationMyNumberCardDetailsScreen2 = this.f291695b;
                        return dli.f.a(biometricVerificationMyNumberCardDetailsScreen2, (o) biometricVerificationMyNumberCardDetailsScreen2.S.getValue(), u.c(biometricVerificationMyNumberCardDetailsScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        qji.b bVarU2 = biometricVerificationMyNumberCardDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_details.di.BiometricVerificationMyNumberCardDetailsScreenInjector");
                        pr.u uVar = (pr.u) bVarU2;
                        pr.q qVar = uVar.f238897c;
                        pr.u uVar2 = uVar.d;
                        BiometricVerificationMyNumberCardDetailsScreenContract$InputData biometricVerificationMyNumberCardDetailsScreenContract$InputData = biometricVerificationMyNumberCardDetailsScreen.K;
                        biometricVerificationMyNumberCardDetailsScreenContract$InputData.getClass();
                        return new y(qVar, uVar2, biometricVerificationMyNumberCardDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationMyNumberCardDetailsScreen.T;
                        return (o) ((y) biometricVerificationMyNumberCardDetailsScreen.R.getValue()).f238911c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f291704a, null);
        navBarWithToolbar.setDescriptionText(uiState.f291705b);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Q = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.R.getValue();
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
        return (vs.o) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setAnalyticsContext(this.Q);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        LargeActionButton largeActionButton = (LargeActionButton) this.N.getValue();
        largeActionButton.setAnalyticsContext(this.Q);
        largeActionButton.setText(new TextLocalisedClause(R$string.vision_common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        v2e.h0 h0Var = new v2e.h0(rd0.e.b(d3().f174565c.f59410q), 16);
        ?? r132 = this.S;
        ViewController.P2(this, h0Var, new g(2, (vs.o) r132.getValue(), vs.o.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details/BiometricVerificationMyNumberCardDetailsScreenContract$Event;)V", 4, 18), 3);
        int i = 4;
        int i2 = 2;
        ViewController.P2(this, new v2e.h0(rd0.e.b(((LargeActionButton) this.N.getValue()).o), 17), new g(i2, (vs.o) r132.getValue(), vs.o.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details/BiometricVerificationMyNumberCardDetailsScreenContract$Event;)V", i, 19), 3);
        ViewController.P2(this, new v2e.h0(rd0.e.b(this.M.e), 18), new g(i2, (vs.o) r132.getValue(), vs.o.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details/BiometricVerificationMyNumberCardDetailsScreenContract$Event;)V", i, 20), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
