package com.revolut.feature.kyc.impl.web_id.web_id_portal;

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
import com.revolut.feature.kyc.impl.web_id.web_id_portal.WebIdPortalScreen;
import com.revolut.feature.kyc.impl.web_id.web_id_portal.WebIdPortalScreenContract$ModalStep;
import com.revolut.feature.kyc.shared.R$layout;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qx8.d;
import qx8.l;
import qx8.m;
import vc.s;
import xki.e;
import zu8.c0;
import zu8.j0;
import zu8.k0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/web_id/web_id_portal/WebIdPortalScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqx8/l;", "Lcli/w;", "Lqx8/o;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebIdPortalScreen extends ViewController<l> implements w {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(WebIdPortalScreen.class, "binding", "getBinding()Lcom/revolut/feature/kyc/shared/databinding/ScreenWebKycBinding;", 0))};
    public final WebIdPortalScreenContract$InputData K;
    public final int L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public WebIdPortalScreen(WebIdPortalScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_web_kyc;
        this.M = R$style.UiKitTheme_Day;
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: qx8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebIdPortalScreen f250033b;

            {
                this.f250033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WebIdPortalScreen webIdPortalScreen = this.f250033b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WebIdPortalScreen.T;
                        return (m) ((k0) webIdPortalScreen.O.getValue()).f325308c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WebIdPortalScreen.T;
                        qji.b bVarU2 = webIdPortalScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.web_id.web_id_portal.di.WebIdPortalScreenInjector");
                        }
                        j0 j0Var = (j0) bVarU2;
                        c0 c0Var = j0Var.f325301b;
                        j0 j0Var2 = j0Var.f325302c;
                        webIdPortalScreen.K.getClass();
                        return new k0(c0Var, j0Var2);
                    case 2:
                        KProperty[] kPropertyArr3 = WebIdPortalScreen.T;
                        return n14.e.a(webIdPortalScreen, webIdPortalScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = WebIdPortalScreen.T;
                        k0 k0Var = (k0) webIdPortalScreen.O.getValue();
                        k0Var.getClass();
                        return new ay8.a((yx8.a) k0Var.f325307b.get(), (dy8.a) k0Var.d.get());
                    default:
                        KProperty[] kPropertyArr5 = WebIdPortalScreen.T;
                        k0 k0Var2 = (k0) webIdPortalScreen.O.getValue();
                        k0Var2.getClass();
                        return new zx8.a((yx8.a) k0Var2.f325307b.get());
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: qx8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebIdPortalScreen f250033b;

            {
                this.f250033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WebIdPortalScreen webIdPortalScreen = this.f250033b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WebIdPortalScreen.T;
                        return (m) ((k0) webIdPortalScreen.O.getValue()).f325308c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WebIdPortalScreen.T;
                        qji.b bVarU2 = webIdPortalScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.web_id.web_id_portal.di.WebIdPortalScreenInjector");
                        }
                        j0 j0Var = (j0) bVarU2;
                        c0 c0Var = j0Var.f325301b;
                        j0 j0Var2 = j0Var.f325302c;
                        webIdPortalScreen.K.getClass();
                        return new k0(c0Var, j0Var2);
                    case 2:
                        KProperty[] kPropertyArr3 = WebIdPortalScreen.T;
                        return n14.e.a(webIdPortalScreen, webIdPortalScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = WebIdPortalScreen.T;
                        k0 k0Var = (k0) webIdPortalScreen.O.getValue();
                        k0Var.getClass();
                        return new ay8.a((yx8.a) k0Var.f325307b.get(), (dy8.a) k0Var.d.get());
                    default:
                        KProperty[] kPropertyArr5 = WebIdPortalScreen.T;
                        k0 k0Var2 = (k0) webIdPortalScreen.O.getValue();
                        k0Var2.getClass();
                        return new zx8.a((yx8.a) k0Var2.f325307b.get());
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: qx8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebIdPortalScreen f250033b;

            {
                this.f250033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WebIdPortalScreen webIdPortalScreen = this.f250033b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WebIdPortalScreen.T;
                        return (m) ((k0) webIdPortalScreen.O.getValue()).f325308c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WebIdPortalScreen.T;
                        qji.b bVarU2 = webIdPortalScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.web_id.web_id_portal.di.WebIdPortalScreenInjector");
                        }
                        j0 j0Var = (j0) bVarU2;
                        c0 c0Var = j0Var.f325301b;
                        j0 j0Var2 = j0Var.f325302c;
                        webIdPortalScreen.K.getClass();
                        return new k0(c0Var, j0Var2);
                    case 2:
                        KProperty[] kPropertyArr3 = WebIdPortalScreen.T;
                        return n14.e.a(webIdPortalScreen, webIdPortalScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = WebIdPortalScreen.T;
                        k0 k0Var = (k0) webIdPortalScreen.O.getValue();
                        k0Var.getClass();
                        return new ay8.a((yx8.a) k0Var.f325307b.get(), (dy8.a) k0Var.d.get());
                    default:
                        KProperty[] kPropertyArr5 = WebIdPortalScreen.T;
                        k0 k0Var2 = (k0) webIdPortalScreen.O.getValue();
                        k0Var2.getClass();
                        return new zx8.a((yx8.a) k0Var2.f325307b.get());
                }
            }
        });
        this.Q = s.t(this, d.f);
        final int i5 = 3;
        this.R = te0.w.y0(new Function0(this) { // from class: qx8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebIdPortalScreen f250033b;

            {
                this.f250033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                WebIdPortalScreen webIdPortalScreen = this.f250033b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WebIdPortalScreen.T;
                        return (m) ((k0) webIdPortalScreen.O.getValue()).f325308c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WebIdPortalScreen.T;
                        qji.b bVarU2 = webIdPortalScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.web_id.web_id_portal.di.WebIdPortalScreenInjector");
                        }
                        j0 j0Var = (j0) bVarU2;
                        c0 c0Var = j0Var.f325301b;
                        j0 j0Var2 = j0Var.f325302c;
                        webIdPortalScreen.K.getClass();
                        return new k0(c0Var, j0Var2);
                    case 2:
                        KProperty[] kPropertyArr3 = WebIdPortalScreen.T;
                        return n14.e.a(webIdPortalScreen, webIdPortalScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = WebIdPortalScreen.T;
                        k0 k0Var = (k0) webIdPortalScreen.O.getValue();
                        k0Var.getClass();
                        return new ay8.a((yx8.a) k0Var.f325307b.get(), (dy8.a) k0Var.d.get());
                    default:
                        KProperty[] kPropertyArr5 = WebIdPortalScreen.T;
                        k0 k0Var2 = (k0) webIdPortalScreen.O.getValue();
                        k0Var2.getClass();
                        return new zx8.a((yx8.a) k0Var2.f325307b.get());
                }
            }
        });
        final int i6 = 4;
        this.S = te0.w.y0(new Function0(this) { // from class: qx8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebIdPortalScreen f250033b;

            {
                this.f250033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                WebIdPortalScreen webIdPortalScreen = this.f250033b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WebIdPortalScreen.T;
                        return (m) ((k0) webIdPortalScreen.O.getValue()).f325308c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WebIdPortalScreen.T;
                        qji.b bVarU2 = webIdPortalScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.web_id.web_id_portal.di.WebIdPortalScreenInjector");
                        }
                        j0 j0Var = (j0) bVarU2;
                        c0 c0Var = j0Var.f325301b;
                        j0 j0Var2 = j0Var.f325302c;
                        webIdPortalScreen.K.getClass();
                        return new k0(c0Var, j0Var2);
                    case 2:
                        KProperty[] kPropertyArr3 = WebIdPortalScreen.T;
                        return n14.e.a(webIdPortalScreen, webIdPortalScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = WebIdPortalScreen.T;
                        k0 k0Var = (k0) webIdPortalScreen.O.getValue();
                        k0Var.getClass();
                        return new ay8.a((yx8.a) k0Var.f325307b.get(), (dy8.a) k0Var.d.get());
                    default:
                        KProperty[] kPropertyArr5 = WebIdPortalScreen.T;
                        k0 k0Var2 = (k0) webIdPortalScreen.O.getValue();
                        k0Var2.getClass();
                        return new zx8.a((yx8.a) k0Var2.f325307b.get());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        qx8.o uiState = (qx8.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f292848b.i0(uiState.f250042a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        oki.h.v2(((a) d()).u, WebIdPortalScreenContract$ModalStep.CloseVideoCall.f77894a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WebPortalLoadingView webPortalLoadingView = d3().f292848b;
        webPortalLoadingView.setWebViewClient((WebViewClient) this.R.getValue());
        webPortalLoadingView.setWebChromeClient((WebChromeClient) this.S.getValue());
        webPortalLoadingView.g0(this.K.f77893a);
        webPortalLoadingView.setNavbarBackNavigationButtonVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, d3().f292848b.h0(), null, new qx8.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, d3().f292848b.f77907n, null, new qx8.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(((a) d()).f77899s), null, new qx8.e(this, continuation, 2), 3);
    }

    public final vx8.a d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (vx8.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
