package com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import g12.l;
import g12.q;
import io.fotoapparat.view.CameraView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m12.i;
import p12.g;
import p12.k;
import vc.s;
import wrj.m;
import x32.e;
import xu.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/qr/scanner/screen/QrScanningScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg12/q;", "Lcli/w;", "Lx32/e;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrScanningScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(QrScanningScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenQrScannerBinding;", 0))};
    public final boolean K;
    public final int L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public f R;

    public QrScanningScreen(l qrHandler) {
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        this.K = true;
        this.L = R$layout.screen_qr_scanner;
        this.M = R$style.UiKitTheme_Transparent;
        this.N = s.t(this, x32.b.f);
        this.O = te0.w.y0(new m(this, qrHandler, 16));
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: x32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrScanningScreen f302621b;

            {
                this.f302621b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                QrScanningScreen qrScanningScreen = this.f302621b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = QrScanningScreen.S;
                        k kVar = (k) qrScanningScreen.O.getValue();
                        switch (kVar.f231691a) {
                            case 0:
                                return (d) kVar.f231694g.get();
                            default:
                                return (d) kVar.f231694g.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = QrScanningScreen.S;
                        return n14.e.a(qrScanningScreen, (d) qrScanningScreen.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: x32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrScanningScreen f302621b;

            {
                this.f302621b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                QrScanningScreen qrScanningScreen = this.f302621b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QrScanningScreen.S;
                        k kVar = (k) qrScanningScreen.O.getValue();
                        switch (kVar.f231691a) {
                            case 0:
                                return (d) kVar.f231694g.get();
                            default:
                                return (d) kVar.f231694g.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = QrScanningScreen.S;
                        return n14.e.a(qrScanningScreen, (d) qrScanningScreen.P.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        i iVarD3 = d3();
        ProgressBar qrScannerScannerProgress = iVarD3.f;
        Intrinsics.checkNotNullExpressionValue(qrScannerScannerProgress, "qrScannerScannerProgress");
        knm.b.z(qrScannerScannerProgress, uiState.f302623a, null, 14);
        iVarD3.e.setState(uiState.f302624b);
        TextView textView = iVarD3.f201214c;
        textView.setText(uiState.f302625c);
        textView.setBackgroundResource(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (x32.d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        cv.c cVar;
        ar2.c cVar2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CameraView qrScannerCameraView = d3().f201213b;
        Intrinsics.checkNotNullExpressionValue(qrScannerCameraView, "qrScannerCameraView");
        ?? r2 = this.O;
        k kVar = (k) r2.getValue();
        switch (kVar.f231691a) {
            case 0:
                cVar = (cv.c) ((g) kVar.f231695h).f231670r.get();
                break;
            default:
                cVar = (cv.c) ((p12.f) kVar.f231695h).f231655s.get();
                break;
        }
        k kVar2 = (k) r2.getValue();
        switch (kVar2.f231691a) {
            case 0:
                cVar2 = (ar2.c) kVar2.e.get();
                break;
            default:
                cVar2 = (ar2.c) kVar2.e.get();
                break;
        }
        this.R = new f(context, qrScannerCameraView, cVar, new wma.e(1, cVar2, ar2.c.class, "onFrameProcess", "onFrameProcess(Lcom/revolut/camera/PhotoVideoCameraFrame;)V", 0, 9));
        FrameLayout frameLayout = d3().d;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        frameLayout.setLayoutTransition(layoutTransition);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        f fVar = this.R;
        if (fVar != null) {
            fVar.b();
        } else {
            Intrinsics.r("cameraDelegate");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f fVar = this.R;
        if (fVar == null) {
            Intrinsics.r("cameraDelegate");
            throw null;
        }
        xu.d.a(fVar);
        f fVar2 = this.R;
        if (fVar2 != null) {
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fVar2.f308843h), null, new wuh.q(this, (Continuation) null, 23), 3);
        } else {
            Intrinsics.r("cameraDelegate");
            throw null;
        }
    }

    public final i d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
