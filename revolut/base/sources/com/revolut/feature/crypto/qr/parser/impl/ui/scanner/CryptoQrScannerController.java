package com.revolut.feature.crypto.qr.parser.impl.ui.scanner;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ScanView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.qr.parser.impl.R$id;
import com.revolut.feature.crypto.qr.parser.impl.R$layout;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import f2i.x;
import ff4.z;
import fj5.c;
import io.fotoapparat.view.CameraView;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import vc.s;
import xki.e;
import xu.f;
import zi5.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzi5/d;", "Lcli/w;", "Lfj5/d;", "<init>", "()V", "feature_crypto_qr_parser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoQrScannerController extends ViewController<d> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CryptoQrScannerController.class, "binding", "getBinding()Lcom/revolut/feature/crypto/qr/parser/impl/databinding/ControllerCryptoQrScannerBinding;", 0))};
    public final int K = R$layout.controller_crypto_qr_scanner;
    public final h L = s.t(this, a.f);
    public final int M = R$style.UiKitTheme_Mono;
    public final boolean N = true;
    public final Object O;
    public final Object P;
    public final Object Q;
    public f R;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, bj5.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/crypto/qr/parser/impl/databinding/ControllerCryptoQrScannerBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.cryptoQrScanner_cameraView;
            CameraView cameraView = (CameraView) ViewBindings.findChildViewById(p0, i);
            if (cameraView != null) {
                i = R$id.cryptoQrScanner_messageLabel;
                TextView textView = (TextView) ViewBindings.findChildViewById(p0, i);
                if (textView != null) {
                    i = R$id.cryptoQrScanner_messageLabelContainer;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
                    if (frameLayout != null) {
                        i = R$id.cryptoQrScanner_navBarWithToolbar;
                        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                        if (navBarWithToolbar != null) {
                            i = R$id.cryptoQrScanner_scanView;
                            ScanView scanView = (ScanView) ViewBindings.findChildViewById(p0, i);
                            if (scanView != null) {
                                return new bj5.a((ControllerContainerConstraintLayout) p0, cameraView, textView, frameLayout, navBarWithToolbar, scanView);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public CryptoQrScannerController() {
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: fj5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoQrScannerController f135534b;

            {
                this.f135534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoQrScannerController cryptoQrScannerController = this.f135534b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoQrScannerController.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoQrScannerController.m2()).a().get(dj5.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new dj5.f(((dj5.e) ((dj5.a) aVar2.b())).f115102c, cryptoQrScannerController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", dj5.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoQrScannerController.S;
                        return (c) ((dj5.f) cryptoQrScannerController.O.getValue()).f115117g.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoQrScannerController.S;
                        return n14.e.a(cryptoQrScannerController, (c) cryptoQrScannerController.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: fj5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoQrScannerController f135534b;

            {
                this.f135534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoQrScannerController cryptoQrScannerController = this.f135534b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoQrScannerController.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoQrScannerController.m2()).a().get(dj5.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new dj5.f(((dj5.e) ((dj5.a) aVar2.b())).f115102c, cryptoQrScannerController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", dj5.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoQrScannerController.S;
                        return (c) ((dj5.f) cryptoQrScannerController.O.getValue()).f115117g.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoQrScannerController.S;
                        return n14.e.a(cryptoQrScannerController, (c) cryptoQrScannerController.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: fj5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoQrScannerController f135534b;

            {
                this.f135534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoQrScannerController cryptoQrScannerController = this.f135534b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoQrScannerController.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoQrScannerController.m2()).a().get(dj5.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new dj5.f(((dj5.e) ((dj5.a) aVar2.b())).f115102c, cryptoQrScannerController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", dj5.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoQrScannerController.S;
                        return (c) ((dj5.f) cryptoQrScannerController.O.getValue()).f115117g.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoQrScannerController.S;
                        return n14.e.a(cryptoQrScannerController, (c) cryptoQrScannerController.P.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getX() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        fj5.d uiState = (fj5.d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        bj5.a aVarD3 = d3();
        aVarD3.e.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        aVarD3.f.setState(uiState.f135536a);
        TextView textView = aVarD3.f15563c;
        textView.setText(uiState.f135537b);
        textView.setBackgroundResource(uiState.f135538c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dj5.f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CameraView cryptoQrScannerCameraView = d3().f15562b;
        Intrinsics.checkNotNullExpressionValue(cryptoQrScannerCameraView, "cryptoQrScannerCameraView");
        ?? r2 = this.O;
        this.R = new f(context, cryptoQrScannerCameraView, (cv.c) ((dj5.f) r2.getValue()).f115118h.get(), new x(1, (ar2.c) ((dj5.f) r2.getValue()).f.get(), ar2.c.class, "onFrameProcess", "onFrameProcess(Lcom/revolut/camera/PhotoVideoCameraFrame;)V", 0, 19));
        FrameLayout frameLayout = d3().d;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        frameLayout.setLayoutTransition(layoutTransition);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        f fVar = this.R;
        if (fVar != null) {
            fVar.b();
        } else {
            Intrinsics.r("cameraDelegate");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, vkm.q.q(((com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a) ((c) this.P.getValue())).f70905r), new a2g.q(this, (Continuation) null, 21), 3);
        f fVar = this.R;
        if (fVar == null) {
            Intrinsics.r("cameraDelegate");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(fVar.f308843h), new f9d.c(this, continuation, 21), 3);
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new z(this, continuation, 8), 3);
    }

    public final bj5.a d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (bj5.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
