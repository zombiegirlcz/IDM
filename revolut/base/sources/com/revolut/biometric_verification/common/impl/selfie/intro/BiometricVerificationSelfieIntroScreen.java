package com.revolut.biometric_verification.common.impl.selfie.intro;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.common.api.factory.BiometricVerificationSelfieIntroScreenFactory$InputData;
import com.revolut.biometric_verification.common.impl.R$id;
import com.revolut.biometric_verification.common.impl.R$layout;
import com.revolut.biometric_verification.common.impl.selfie.intro.BiometricVerificationSelfieIntroScreen;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
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
import no.m;
import pu.e;
import te0.w;
import tx0.j0;
import vc.s;
import vge.z1;
import vq.b;
import vq.f;
import vq.g;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/biometric_verification/common/impl/selfie/intro/BiometricVerificationSelfieIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpu/e;", "Ldli/a;", "Lvq/f;", "Lno/k;", "Lno/m;", "biometric_verification_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationSelfieIntroScreen extends ViewController<e> implements a, k, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(BiometricVerificationSelfieIntroScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/common/impl/databinding/ScreenBiometricVerificationCommonIntroBinding;", 0))};
    public final BiometricVerificationSelfieIntroScreenFactory$InputData K;
    public final int L;
    public AnalyticsContext M;
    public final AnalyticsProduct N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public BiometricVerificationSelfieIntroScreen(BiometricVerificationSelfieIntroScreenFactory$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_biometric_verification_common_intro;
        this.M = inputData.f50463b;
        this.N = inputData.f50464c;
        this.O = s.t(this, b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: vq.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationSelfieIntroScreen f291276b;

            {
                this.f291276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationSelfieIntroScreen biometricVerificationSelfieIntroScreen = this.f291276b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationSelfieIntroScreen.T;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationSelfieIntroScreen.d3().f256429b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationSelfieIntroScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(biometricVerificationSelfieIntroScreen.m2()).a().get(tq.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tq.a.class, " is not found"));
                        }
                        tq.a aVar3 = ((tq.a) aVar2.b()).f273440b;
                        biometricVerificationSelfieIntroScreen.K.getClass();
                        tq.b bVar = new tq.b();
                        bVar.f273442a = e4m.b.b(new tg5.h(aVar3, bVar, 1, 5));
                        bVar.f273443b = e4m.b.b(new tg5.h(aVar3, bVar, 0, 5));
                        return bVar;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationSelfieIntroScreen.T;
                        return (g) ((tq.b) biometricVerificationSelfieIntroScreen.Q.getValue()).f273443b.get();
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationSelfieIntroScreen.T;
                        int i3 = R$id.biometricVerificationIntroScreen_recyclerView;
                        BiometricVerificationSelfieIntroScreen biometricVerificationSelfieIntroScreen2 = this.f291276b;
                        return dli.f.a(biometricVerificationSelfieIntroScreen2, (g) biometricVerificationSelfieIntroScreen2.R.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: vq.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationSelfieIntroScreen f291276b;

            {
                this.f291276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationSelfieIntroScreen biometricVerificationSelfieIntroScreen = this.f291276b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationSelfieIntroScreen.T;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationSelfieIntroScreen.d3().f256429b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationSelfieIntroScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(biometricVerificationSelfieIntroScreen.m2()).a().get(tq.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tq.a.class, " is not found"));
                        }
                        tq.a aVar3 = ((tq.a) aVar2.b()).f273440b;
                        biometricVerificationSelfieIntroScreen.K.getClass();
                        tq.b bVar = new tq.b();
                        bVar.f273442a = e4m.b.b(new tg5.h(aVar3, bVar, 1, 5));
                        bVar.f273443b = e4m.b.b(new tg5.h(aVar3, bVar, 0, 5));
                        return bVar;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationSelfieIntroScreen.T;
                        return (g) ((tq.b) biometricVerificationSelfieIntroScreen.Q.getValue()).f273443b.get();
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationSelfieIntroScreen.T;
                        int i3 = R$id.biometricVerificationIntroScreen_recyclerView;
                        BiometricVerificationSelfieIntroScreen biometricVerificationSelfieIntroScreen2 = this.f291276b;
                        return dli.f.a(biometricVerificationSelfieIntroScreen2, (g) biometricVerificationSelfieIntroScreen2.R.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), i3, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: vq.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationSelfieIntroScreen f291276b;

            {
                this.f291276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationSelfieIntroScreen biometricVerificationSelfieIntroScreen = this.f291276b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationSelfieIntroScreen.T;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationSelfieIntroScreen.d3().f256429b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationSelfieIntroScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(biometricVerificationSelfieIntroScreen.m2()).a().get(tq.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tq.a.class, " is not found"));
                        }
                        tq.a aVar3 = ((tq.a) aVar2.b()).f273440b;
                        biometricVerificationSelfieIntroScreen.K.getClass();
                        tq.b bVar = new tq.b();
                        bVar.f273442a = e4m.b.b(new tg5.h(aVar3, bVar, 1, 5));
                        bVar.f273443b = e4m.b.b(new tg5.h(aVar3, bVar, 0, 5));
                        return bVar;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationSelfieIntroScreen.T;
                        return (g) ((tq.b) biometricVerificationSelfieIntroScreen.Q.getValue()).f273443b.get();
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationSelfieIntroScreen.T;
                        int i32 = R$id.biometricVerificationIntroScreen_recyclerView;
                        BiometricVerificationSelfieIntroScreen biometricVerificationSelfieIntroScreen2 = this.f291276b;
                        return dli.f.a(biometricVerificationSelfieIntroScreen2, (g) biometricVerificationSelfieIntroScreen2.R.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), i32, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: vq.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationSelfieIntroScreen f291276b;

            {
                this.f291276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BiometricVerificationSelfieIntroScreen biometricVerificationSelfieIntroScreen = this.f291276b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BiometricVerificationSelfieIntroScreen.T;
                        FooterActionButtonView biometricVerificationIntroScreenButton = biometricVerificationSelfieIntroScreen.d3().f256429b;
                        Intrinsics.checkNotNullExpressionValue(biometricVerificationIntroScreenButton, "biometricVerificationIntroScreenButton");
                        return biometricVerificationIntroScreenButton;
                    case 1:
                        KProperty[] kPropertyArr2 = BiometricVerificationSelfieIntroScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(biometricVerificationSelfieIntroScreen.m2()).a().get(tq.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tq.a.class, " is not found"));
                        }
                        tq.a aVar3 = ((tq.a) aVar2.b()).f273440b;
                        biometricVerificationSelfieIntroScreen.K.getClass();
                        tq.b bVar = new tq.b();
                        bVar.f273442a = e4m.b.b(new tg5.h(aVar3, bVar, 1, 5));
                        bVar.f273443b = e4m.b.b(new tg5.h(aVar3, bVar, 0, 5));
                        return bVar;
                    case 2:
                        KProperty[] kPropertyArr3 = BiometricVerificationSelfieIntroScreen.T;
                        return (g) ((tq.b) biometricVerificationSelfieIntroScreen.Q.getValue()).f273443b.get();
                    default:
                        KProperty[] kPropertyArr4 = BiometricVerificationSelfieIntroScreen.T;
                        int i32 = R$id.biometricVerificationIntroScreen_recyclerView;
                        BiometricVerificationSelfieIntroScreen biometricVerificationSelfieIntroScreen2 = this.f291276b;
                        return dli.f.a(biometricVerificationSelfieIntroScreen2, (g) biometricVerificationSelfieIntroScreen2.R.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7)), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.M = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (tq.b) this.Q.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f256430c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        if (!this.K.f50462a) {
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.selfie_animated_intro_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.selfie_animated_intro_title, null, null, 14), null);
        FooterActionButtonView footerActionButtonView = (FooterActionButtonView) this.P.getValue();
        footerActionButtonView.setBackgroundColorAttr(R$attr.uikit_colorTransparent);
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.selfie_intro_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f256430c.f59410q), null, new z1(this, null, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, new v2e.h0(rd0.e.b(((FooterActionButtonView) this.P.getValue()).f0()), 15), null, new u36.g(2, (g) this.R.getValue(), g.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/common/impl/selfie/intro/BiometricVerificationSelfieIntroScreenContract$Event;)V", 4, 17), 3);
    }

    public final rq.a d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rq.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
