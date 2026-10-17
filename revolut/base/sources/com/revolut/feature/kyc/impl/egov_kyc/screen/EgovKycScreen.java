package com.revolut.feature.kyc.impl.egov_kyc.screen;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.kyc.impl.egov_kyc.screen.EgovKycScreen;
import com.revolut.feature.kyc.impl.egov_kyc.screen.EgovKycScreenContract$InputData;
import com.revolut.feature.kyc.shared.R$layout;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import gv8.d;
import gv8.j;
import gv8.k;
import gv8.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import vc.s;
import xki.e;
import zu8.c0;
import zu8.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/egov_kyc/screen/EgovKycScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgv8/j;", "Lcli/w;", "Lgv8/k;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EgovKycScreen extends ViewController<j> implements w {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EgovKycScreen.class, "binding", "getBinding()Lcom/revolut/feature/kyc/shared/databinding/ScreenWebKycBinding;", 0))};
    public final EgovKycScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final int O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public EgovKycScreen(EgovKycScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: gv8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EgovKycScreen f147078b;

            {
                this.f147078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EgovKycScreen egovKycScreen = this.f147078b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EgovKycScreen.T;
                        qji.b bVarU2 = egovKycScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.egov_kyc.screen.di.EgovKycScreenComponentInjector");
                        }
                        zu8.k kVar = (zu8.k) bVarU2;
                        c0 c0Var = kVar.f325304b;
                        zu8.k kVar2 = kVar.f325305c;
                        EgovKycScreenContract$InputData egovKycScreenContract$InputData = egovKycScreen.K;
                        egovKycScreenContract$InputData.getClass();
                        return new zu8.l(c0Var, kVar2, egovKycScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EgovKycScreen.T;
                        return (m) ((zu8.l) egovKycScreen.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EgovKycScreen.T;
                        return n14.e.a(egovKycScreen, (m) egovKycScreen.M.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = EgovKycScreen.T;
                        zu8.l lVar = (zu8.l) egovKycScreen.L.getValue();
                        lVar.getClass();
                        return new ay8.a((yx8.a) lVar.f325311c.get(), (dy8.a) lVar.e.get());
                    default:
                        KProperty[] kPropertyArr5 = EgovKycScreen.T;
                        zu8.l lVar2 = (zu8.l) egovKycScreen.L.getValue();
                        lVar2.getClass();
                        return new zx8.a((yx8.a) lVar2.f325311c.get());
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: gv8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EgovKycScreen f147078b;

            {
                this.f147078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EgovKycScreen egovKycScreen = this.f147078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EgovKycScreen.T;
                        qji.b bVarU2 = egovKycScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.egov_kyc.screen.di.EgovKycScreenComponentInjector");
                        }
                        zu8.k kVar = (zu8.k) bVarU2;
                        c0 c0Var = kVar.f325304b;
                        zu8.k kVar2 = kVar.f325305c;
                        EgovKycScreenContract$InputData egovKycScreenContract$InputData = egovKycScreen.K;
                        egovKycScreenContract$InputData.getClass();
                        return new zu8.l(c0Var, kVar2, egovKycScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EgovKycScreen.T;
                        return (m) ((zu8.l) egovKycScreen.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EgovKycScreen.T;
                        return n14.e.a(egovKycScreen, (m) egovKycScreen.M.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = EgovKycScreen.T;
                        zu8.l lVar = (zu8.l) egovKycScreen.L.getValue();
                        lVar.getClass();
                        return new ay8.a((yx8.a) lVar.f325311c.get(), (dy8.a) lVar.e.get());
                    default:
                        KProperty[] kPropertyArr5 = EgovKycScreen.T;
                        zu8.l lVar2 = (zu8.l) egovKycScreen.L.getValue();
                        lVar2.getClass();
                        return new zx8.a((yx8.a) lVar2.f325311c.get());
                }
            }
        });
        this.N = R$layout.screen_web_kyc;
        this.O = R$style.UiKitTheme_Day;
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: gv8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EgovKycScreen f147078b;

            {
                this.f147078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EgovKycScreen egovKycScreen = this.f147078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EgovKycScreen.T;
                        qji.b bVarU2 = egovKycScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.egov_kyc.screen.di.EgovKycScreenComponentInjector");
                        }
                        zu8.k kVar = (zu8.k) bVarU2;
                        c0 c0Var = kVar.f325304b;
                        zu8.k kVar2 = kVar.f325305c;
                        EgovKycScreenContract$InputData egovKycScreenContract$InputData = egovKycScreen.K;
                        egovKycScreenContract$InputData.getClass();
                        return new zu8.l(c0Var, kVar2, egovKycScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EgovKycScreen.T;
                        return (m) ((zu8.l) egovKycScreen.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EgovKycScreen.T;
                        return n14.e.a(egovKycScreen, (m) egovKycScreen.M.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = EgovKycScreen.T;
                        zu8.l lVar = (zu8.l) egovKycScreen.L.getValue();
                        lVar.getClass();
                        return new ay8.a((yx8.a) lVar.f325311c.get(), (dy8.a) lVar.e.get());
                    default:
                        KProperty[] kPropertyArr5 = EgovKycScreen.T;
                        zu8.l lVar2 = (zu8.l) egovKycScreen.L.getValue();
                        lVar2.getClass();
                        return new zx8.a((yx8.a) lVar2.f325311c.get());
                }
            }
        });
        this.Q = s.t(this, d.f);
        final int i5 = 3;
        this.R = te0.w.y0(new Function0(this) { // from class: gv8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EgovKycScreen f147078b;

            {
                this.f147078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                EgovKycScreen egovKycScreen = this.f147078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EgovKycScreen.T;
                        qji.b bVarU2 = egovKycScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.egov_kyc.screen.di.EgovKycScreenComponentInjector");
                        }
                        zu8.k kVar = (zu8.k) bVarU2;
                        c0 c0Var = kVar.f325304b;
                        zu8.k kVar2 = kVar.f325305c;
                        EgovKycScreenContract$InputData egovKycScreenContract$InputData = egovKycScreen.K;
                        egovKycScreenContract$InputData.getClass();
                        return new zu8.l(c0Var, kVar2, egovKycScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EgovKycScreen.T;
                        return (m) ((zu8.l) egovKycScreen.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EgovKycScreen.T;
                        return n14.e.a(egovKycScreen, (m) egovKycScreen.M.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = EgovKycScreen.T;
                        zu8.l lVar = (zu8.l) egovKycScreen.L.getValue();
                        lVar.getClass();
                        return new ay8.a((yx8.a) lVar.f325311c.get(), (dy8.a) lVar.e.get());
                    default:
                        KProperty[] kPropertyArr5 = EgovKycScreen.T;
                        zu8.l lVar2 = (zu8.l) egovKycScreen.L.getValue();
                        lVar2.getClass();
                        return new zx8.a((yx8.a) lVar2.f325311c.get());
                }
            }
        });
        final int i6 = 4;
        this.S = te0.w.y0(new Function0(this) { // from class: gv8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EgovKycScreen f147078b;

            {
                this.f147078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                EgovKycScreen egovKycScreen = this.f147078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EgovKycScreen.T;
                        qji.b bVarU2 = egovKycScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.egov_kyc.screen.di.EgovKycScreenComponentInjector");
                        }
                        zu8.k kVar = (zu8.k) bVarU2;
                        c0 c0Var = kVar.f325304b;
                        zu8.k kVar2 = kVar.f325305c;
                        EgovKycScreenContract$InputData egovKycScreenContract$InputData = egovKycScreen.K;
                        egovKycScreenContract$InputData.getClass();
                        return new zu8.l(c0Var, kVar2, egovKycScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EgovKycScreen.T;
                        return (m) ((zu8.l) egovKycScreen.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EgovKycScreen.T;
                        return n14.e.a(egovKycScreen, (m) egovKycScreen.M.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = EgovKycScreen.T;
                        zu8.l lVar = (zu8.l) egovKycScreen.L.getValue();
                        lVar.getClass();
                        return new ay8.a((yx8.a) lVar.f325311c.get(), (dy8.a) lVar.e.get());
                    default:
                        KProperty[] kPropertyArr5 = EgovKycScreen.T;
                        zu8.l lVar2 = (zu8.l) egovKycScreen.L.getValue();
                        lVar2.getClass();
                        return new zx8.a((yx8.a) lVar2.f325311c.get());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.O);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f292848b.i0(uiState.f147084a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WebPortalLoadingView webPortalLoadingView = d3().f292848b;
        webPortalLoadingView.setWebViewClient((WebViewClient) this.R.getValue());
        webPortalLoadingView.setWebChromeClient((WebChromeClient) this.S.getValue());
        webPortalLoadingView.g0(this.K.f77638a);
        webPortalLoadingView.setNavbarBackNavigationButtonVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, d3().f292848b.f77907n, null, new gv8.e(this, null, 0), 3);
        a.g2(this, d3().f292848b.h0(), null, new gv8.e(this, null, 1), 3);
    }

    public final vx8.a d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (vx8.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
