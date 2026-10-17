package com.revolut.biometric_verification.impl.ui.step.nfc.manual_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputViewController;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dmj.k;
import dt4.p;
import du.i;
import du.m;
import du.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pr.j0;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldu/a;", "Ldli/a;", "Ldu/b;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationManualInputViewController extends ViewController<du.a> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(BiometricVerificationManualInputViewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object K;
    public final Object L;
    public final InputTextDelegate M;
    public final Object N;
    public final h O;

    public BiometricVerificationManualInputViewController(BiometricVerificationManualInputContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new dgg.b(this, inputData, 18));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: du.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationManualInputViewController f117499b;

            {
                this.f117499b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationManualInputViewController.P;
                        j0 j0Var = (j0) this.f117499b.K.getValue();
                        switch (j0Var.f238852a) {
                            case 0:
                                return (i) j0Var.f238854c.get();
                            default:
                                return (i) j0Var.f238854c.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = BiometricVerificationManualInputViewController.P;
                        BiometricVerificationManualInputViewController biometricVerificationManualInputViewController = this.f117499b;
                        return dli.f.a(biometricVerificationManualInputViewController, biometricVerificationManualInputViewController.d(), u.c(biometricVerificationManualInputViewController.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = new InputTextDelegate(new p(this, 3));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: du.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationManualInputViewController f117499b;

            {
                this.f117499b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationManualInputViewController.P;
                        j0 j0Var = (j0) this.f117499b.K.getValue();
                        switch (j0Var.f238852a) {
                            case 0:
                                return (i) j0Var.f238854c.get();
                            default:
                                return (i) j0Var.f238854c.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = BiometricVerificationManualInputViewController.P;
                        BiometricVerificationManualInputViewController biometricVerificationManualInputViewController = this.f117499b;
                        return dli.f.a(biometricVerificationManualInputViewController, biometricVerificationManualInputViewController.d(), u.c(biometricVerificationManualInputViewController.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = s.t(this, m.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        du.b uiState = (du.b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174565c.setDescriptionText(uiState.f117489b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j0) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174564b.setText(new TextLocalisedClause(R$string.vision_common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new du.q(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new du.q(this, null, 1), 3);
        InputTextDelegate inputTextDelegate = this.M;
        ViewController.P2(this, new k(rd0.e.b(inputTextDelegate.f52577j.f121375b), 7), new a(this, null), 3);
        ViewController.P2(this, new k(rd0.e.b(inputTextDelegate.f52577j.f121375b), 8), new b(this, null), 3);
        ViewController.P2(this, new k(rd0.e.b(inputTextDelegate.e.f121375b), 9), new r(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getK() {
        return R$layout.screen_recycler_navbar_nextbutton;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
