package com.revolut.biometric_verification.impl.ui.step.document.card_pin_enter;

import aee.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cbf.c;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.ui.step.document.card_pin_enter.BiometricVerificationMyNumberCardPinEnterScreen;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ct.b;
import ct.i;
import ct.j;
import ct.l;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import pr.z;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/card_pin_enter/BiometricVerificationMyNumberCardPinEnterScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lct/i;", "Lno/k;", "Ldli/a;", "Lct/j;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationMyNumberCardPinEnterScreen extends ViewController<i> implements k, a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BiometricVerificationMyNumberCardPinEnterScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final CodeEditorDelegate L;
    public final int M;
    public final Object N;
    public AnalyticsContext O;
    public final boolean P;
    public final Object Q;
    public final Object R;

    public BiometricVerificationMyNumberCardPinEnterScreen(BiometricVerificationMyNumberCardPinEnterScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new CodeEditorDelegate();
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ct.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberCardPinEnterScreen f108549b;

            {
                this.f108549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationMyNumberCardPinEnterScreen biometricVerificationMyNumberCardPinEnterScreen = this.f108549b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationMyNumberCardPinEnterScreen.S;
                        BiometricVerificationMyNumberCardPinEnterScreen biometricVerificationMyNumberCardPinEnterScreen2 = this.f108549b;
                        return dli.f.a(biometricVerificationMyNumberCardPinEnterScreen2, (l) biometricVerificationMyNumberCardPinEnterScreen2.R.getValue(), u.c(biometricVerificationMyNumberCardPinEnterScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationMyNumberCardPinEnterScreen.S;
                        qji.b bVarU2 = biometricVerificationMyNumberCardPinEnterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_pin_enter.di.BiometricVerificationMyNumberCardPinEnterScreenInjector");
                        z zVar = new z();
                        zVar.f238912a = e4m.b.b(new pl1.h(zVar, 1, 23));
                        zVar.f238913b = e4m.b.b(new pl1.h(zVar, 0, 23));
                        return zVar;
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationMyNumberCardPinEnterScreen.S;
                        return (l) ((z) biometricVerificationMyNumberCardPinEnterScreen.Q.getValue()).f238913b.get();
                }
            }
        });
        this.O = new AnalyticsContext(inputData.f50539a);
        this.P = true;
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ct.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberCardPinEnterScreen f108549b;

            {
                this.f108549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationMyNumberCardPinEnterScreen biometricVerificationMyNumberCardPinEnterScreen = this.f108549b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationMyNumberCardPinEnterScreen.S;
                        BiometricVerificationMyNumberCardPinEnterScreen biometricVerificationMyNumberCardPinEnterScreen2 = this.f108549b;
                        return dli.f.a(biometricVerificationMyNumberCardPinEnterScreen2, (l) biometricVerificationMyNumberCardPinEnterScreen2.R.getValue(), u.c(biometricVerificationMyNumberCardPinEnterScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationMyNumberCardPinEnterScreen.S;
                        qji.b bVarU2 = biometricVerificationMyNumberCardPinEnterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_pin_enter.di.BiometricVerificationMyNumberCardPinEnterScreenInjector");
                        z zVar = new z();
                        zVar.f238912a = e4m.b.b(new pl1.h(zVar, 1, 23));
                        zVar.f238913b = e4m.b.b(new pl1.h(zVar, 0, 23));
                        return zVar;
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationMyNumberCardPinEnterScreen.S;
                        return (l) ((z) biometricVerificationMyNumberCardPinEnterScreen.Q.getValue()).f238913b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ct.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberCardPinEnterScreen f108549b;

            {
                this.f108549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationMyNumberCardPinEnterScreen biometricVerificationMyNumberCardPinEnterScreen = this.f108549b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationMyNumberCardPinEnterScreen.S;
                        BiometricVerificationMyNumberCardPinEnterScreen biometricVerificationMyNumberCardPinEnterScreen2 = this.f108549b;
                        return dli.f.a(biometricVerificationMyNumberCardPinEnterScreen2, (l) biometricVerificationMyNumberCardPinEnterScreen2.R.getValue(), u.c(biometricVerificationMyNumberCardPinEnterScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationMyNumberCardPinEnterScreen.S;
                        qji.b bVarU2 = biometricVerificationMyNumberCardPinEnterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_pin_enter.di.BiometricVerificationMyNumberCardPinEnterScreenInjector");
                        z zVar = new z();
                        zVar.f238912a = e4m.b.b(new pl1.h(zVar, 1, 23));
                        zVar.f238913b = e4m.b.b(new pl1.h(zVar, 0, 23));
                        return zVar;
                    default:
                        KProperty[] kPropertyArr3 = BiometricVerificationMyNumberCardPinEnterScreen.S;
                        return (l) ((z) biometricVerificationMyNumberCardPinEnterScreen.Q.getValue()).f238913b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f108556a, null);
        navBarWithToolbar.setDescriptionText(uiState.f108557b);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.O = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.Q.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.P);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setAnalyticsContext(this.O);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        c cVar = new c(rd0.e.b(d3().f174539b.f59410q), 18);
        ?? r132 = this.R;
        ViewController.P2(this, cVar, new g(2, (l) r132.getValue(), l.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_pin_enter/BiometricVerificationMyNumberCardPinEnterScreenContract$Event;)V", 4, 27), 3);
        ViewController.P2(this, new c(rd0.e.b(this.L.p()), 19), new g(2, (l) r132.getValue(), l.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_pin_enter/BiometricVerificationMyNumberCardPinEnterScreenContract$Event;)V", 4, 28), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
