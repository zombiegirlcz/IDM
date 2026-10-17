package com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au.b;
import au.c;
import au.l;
import au.u;
import au.v;
import cli.o;
import cli.q;
import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreen;
import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pr.e0;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/intro_v2/BiometricVerificationNfcV2ConsolidatedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lau/l;", "Ldli/a;", "Lau/v;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationNfcV2ConsolidatedScreen extends ViewController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BiometricVerificationNfcV2ConsolidatedScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final BiometricVerificationNfcV2ConsolidatedScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public boolean Q;

    public BiometricVerificationNfcV2ConsolidatedScreen(BiometricVerificationNfcV2ConsolidatedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: au.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationNfcV2ConsolidatedScreen f9097b;

            {
                this.f9097b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationNfcV2ConsolidatedScreen biometricVerificationNfcV2ConsolidatedScreen = this.f9097b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationNfcV2ConsolidatedScreen.R;
                        qji.b bVarU2 = biometricVerificationNfcV2ConsolidatedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.di.BiometricVerificationNfcV2ConsolidatedScreenInjector");
                        pr.d0 d0Var = (pr.d0) bVarU2;
                        pr.q qVar = d0Var.f238837b;
                        pr.d0 d0Var2 = d0Var.f238838c;
                        BiometricVerificationNfcV2ConsolidatedScreenContract$InputData biometricVerificationNfcV2ConsolidatedScreenContract$InputData = biometricVerificationNfcV2ConsolidatedScreen.K;
                        biometricVerificationNfcV2ConsolidatedScreenContract$InputData.getClass();
                        return new pr.e0(qVar, d0Var2, biometricVerificationNfcV2ConsolidatedScreen, biometricVerificationNfcV2ConsolidatedScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationNfcV2ConsolidatedScreen.R;
                        return (u) ((pr.e0) biometricVerificationNfcV2ConsolidatedScreen.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationNfcV2ConsolidatedScreen.R;
                        BiometricVerificationNfcV2ConsolidatedScreen biometricVerificationNfcV2ConsolidatedScreen2 = this.f9097b;
                        return dli.f.a(biometricVerificationNfcV2ConsolidatedScreen2, (u) biometricVerificationNfcV2ConsolidatedScreen2.N.getValue(), zhm.v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: au.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationNfcV2ConsolidatedScreen f9097b;

            {
                this.f9097b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationNfcV2ConsolidatedScreen biometricVerificationNfcV2ConsolidatedScreen = this.f9097b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationNfcV2ConsolidatedScreen.R;
                        qji.b bVarU2 = biometricVerificationNfcV2ConsolidatedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.di.BiometricVerificationNfcV2ConsolidatedScreenInjector");
                        pr.d0 d0Var = (pr.d0) bVarU2;
                        pr.q qVar = d0Var.f238837b;
                        pr.d0 d0Var2 = d0Var.f238838c;
                        BiometricVerificationNfcV2ConsolidatedScreenContract$InputData biometricVerificationNfcV2ConsolidatedScreenContract$InputData = biometricVerificationNfcV2ConsolidatedScreen.K;
                        biometricVerificationNfcV2ConsolidatedScreenContract$InputData.getClass();
                        return new pr.e0(qVar, d0Var2, biometricVerificationNfcV2ConsolidatedScreen, biometricVerificationNfcV2ConsolidatedScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationNfcV2ConsolidatedScreen.R;
                        return (u) ((pr.e0) biometricVerificationNfcV2ConsolidatedScreen.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationNfcV2ConsolidatedScreen.R;
                        BiometricVerificationNfcV2ConsolidatedScreen biometricVerificationNfcV2ConsolidatedScreen2 = this.f9097b;
                        return dli.f.a(biometricVerificationNfcV2ConsolidatedScreen2, (u) biometricVerificationNfcV2ConsolidatedScreen2.N.getValue(), zhm.v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: au.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationNfcV2ConsolidatedScreen f9097b;

            {
                this.f9097b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationNfcV2ConsolidatedScreen biometricVerificationNfcV2ConsolidatedScreen = this.f9097b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationNfcV2ConsolidatedScreen.R;
                        qji.b bVarU2 = biometricVerificationNfcV2ConsolidatedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.di.BiometricVerificationNfcV2ConsolidatedScreenInjector");
                        pr.d0 d0Var = (pr.d0) bVarU2;
                        pr.q qVar = d0Var.f238837b;
                        pr.d0 d0Var2 = d0Var.f238838c;
                        BiometricVerificationNfcV2ConsolidatedScreenContract$InputData biometricVerificationNfcV2ConsolidatedScreenContract$InputData = biometricVerificationNfcV2ConsolidatedScreen.K;
                        biometricVerificationNfcV2ConsolidatedScreenContract$InputData.getClass();
                        return new pr.e0(qVar, d0Var2, biometricVerificationNfcV2ConsolidatedScreen, biometricVerificationNfcV2ConsolidatedScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationNfcV2ConsolidatedScreen.R;
                        return (u) ((pr.e0) biometricVerificationNfcV2ConsolidatedScreen.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationNfcV2ConsolidatedScreen.R;
                        BiometricVerificationNfcV2ConsolidatedScreen biometricVerificationNfcV2ConsolidatedScreen2 = this.f9097b;
                        return dli.f.a(biometricVerificationNfcV2ConsolidatedScreen2, (u) biometricVerificationNfcV2ConsolidatedScreen2.N.getValue(), zhm.v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = true;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v uiState = (v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        TextLocalisedClause textLocalisedClause = uiState.f9131b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        this.Q = uiState.d;
        d3().f174573b.setEnabled(uiState.e);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(uiState.f9132c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (u) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.vision_nfc_intro_v2_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f174573b.setText(new TextLocalisedClause(R$string.vision_nfc_scan_action_scan, null, null, 14));
        LargeActionButton largeActionButton = d3().e;
        largeActionButton.setText(new TextLocalisedClause(R$string.vision_nfc_intro_v2_action_verify_manually, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174574c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174573b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o), new c(this, null, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
