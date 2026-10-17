package com.revolut.camerakit.revolut.ui.barcodeqr.screen;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay.a;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.camerakit.revolut.ui.R$layout;
import com.revolut.camerakit.revolut.ui.barcodeqr.models.BarcodeQrReaderScreenSettings;
import com.revolut.camerakit.revolut.ui.barcodeqr.screen.BarcodeQrReaderScreen;
import com.revolut.camerakit.revolut.ui.barcodeqr.screen.BarcodeQrReaderScreenContract$InputData;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import px.d;
import rz.f;
import vc.s;
import xki.e;
import ys.i;
import yv8.j;
import yx.b;
import yx.c;
import yx.l;
import yx.m;
import yx.r;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/barcodeqr/screen/BarcodeQrReaderScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyx/l;", "Lcli/w;", "Lyx/m;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BarcodeQrReaderScreen extends ViewController<l> implements w {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BarcodeQrReaderScreen.class, "binding", "getBinding()Lcom/revolut/camerakit/revolut/ui/databinding/ScreenBarcodeQrReaderBinding;", 0))};
    public final BarcodeQrReaderScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public BarcodeQrReaderScreen(BarcodeQrReaderScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_barcode_qr_reader;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: yx.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeQrReaderScreen f317501b;

            {
                this.f317501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BarcodeQrReaderScreen barcodeQrReaderScreen = this.f317501b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeQrReaderScreen.R;
                        return n14.e.a(barcodeQrReaderScreen, (r) barcodeQrReaderScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeQrReaderScreen.R;
                        return (r) ((px.d) barcodeQrReaderScreen.P.getValue()).u.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BarcodeQrReaderScreen.R;
                        BarcodeQrReaderScreen barcodeQrReaderScreen2 = this.f317501b;
                        qji.b bVarU2 = barcodeQrReaderScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.barcodeqr.screen.di.BarcodeQrReaderScreenInjector");
                        px.c cVar = (px.c) bVarU2;
                        px.g gVar = cVar.f240496b;
                        px.c cVar2 = cVar.f240497c;
                        BarcodeQrReaderScreenContract$InputData barcodeQrReaderScreenContract$InputData = barcodeQrReaderScreen2.K;
                        barcodeQrReaderScreenContract$InputData.getClass();
                        return new px.d(gVar, cVar2, new oy.b(), barcodeQrReaderScreen2, barcodeQrReaderScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BarcodeQrReaderScreen.R;
                        return (oy.a) ((px.d) barcodeQrReaderScreen.P.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: yx.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeQrReaderScreen f317501b;

            {
                this.f317501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BarcodeQrReaderScreen barcodeQrReaderScreen = this.f317501b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeQrReaderScreen.R;
                        return n14.e.a(barcodeQrReaderScreen, (r) barcodeQrReaderScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeQrReaderScreen.R;
                        return (r) ((px.d) barcodeQrReaderScreen.P.getValue()).u.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BarcodeQrReaderScreen.R;
                        BarcodeQrReaderScreen barcodeQrReaderScreen2 = this.f317501b;
                        qji.b bVarU2 = barcodeQrReaderScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.barcodeqr.screen.di.BarcodeQrReaderScreenInjector");
                        px.c cVar = (px.c) bVarU2;
                        px.g gVar = cVar.f240496b;
                        px.c cVar2 = cVar.f240497c;
                        BarcodeQrReaderScreenContract$InputData barcodeQrReaderScreenContract$InputData = barcodeQrReaderScreen2.K;
                        barcodeQrReaderScreenContract$InputData.getClass();
                        return new px.d(gVar, cVar2, new oy.b(), barcodeQrReaderScreen2, barcodeQrReaderScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BarcodeQrReaderScreen.R;
                        return (oy.a) ((px.d) barcodeQrReaderScreen.P.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: yx.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeQrReaderScreen f317501b;

            {
                this.f317501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BarcodeQrReaderScreen barcodeQrReaderScreen = this.f317501b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeQrReaderScreen.R;
                        return n14.e.a(barcodeQrReaderScreen, (r) barcodeQrReaderScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeQrReaderScreen.R;
                        return (r) ((px.d) barcodeQrReaderScreen.P.getValue()).u.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BarcodeQrReaderScreen.R;
                        BarcodeQrReaderScreen barcodeQrReaderScreen2 = this.f317501b;
                        qji.b bVarU2 = barcodeQrReaderScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.barcodeqr.screen.di.BarcodeQrReaderScreenInjector");
                        px.c cVar = (px.c) bVarU2;
                        px.g gVar = cVar.f240496b;
                        px.c cVar2 = cVar.f240497c;
                        BarcodeQrReaderScreenContract$InputData barcodeQrReaderScreenContract$InputData = barcodeQrReaderScreen2.K;
                        barcodeQrReaderScreenContract$InputData.getClass();
                        return new px.d(gVar, cVar2, new oy.b(), barcodeQrReaderScreen2, barcodeQrReaderScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BarcodeQrReaderScreen.R;
                        return (oy.a) ((px.d) barcodeQrReaderScreen.P.getValue()).e.get();
                }
            }
        });
        final int i5 = 3;
        this.Q = te0.w.y0(new Function0(this) { // from class: yx.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeQrReaderScreen f317501b;

            {
                this.f317501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BarcodeQrReaderScreen barcodeQrReaderScreen = this.f317501b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeQrReaderScreen.R;
                        return n14.e.a(barcodeQrReaderScreen, (r) barcodeQrReaderScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeQrReaderScreen.R;
                        return (r) ((px.d) barcodeQrReaderScreen.P.getValue()).u.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BarcodeQrReaderScreen.R;
                        BarcodeQrReaderScreen barcodeQrReaderScreen2 = this.f317501b;
                        qji.b bVarU2 = barcodeQrReaderScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.barcodeqr.screen.di.BarcodeQrReaderScreenInjector");
                        px.c cVar = (px.c) bVarU2;
                        px.g gVar = cVar.f240496b;
                        px.c cVar2 = cVar.f240497c;
                        BarcodeQrReaderScreenContract$InputData barcodeQrReaderScreenContract$InputData = barcodeQrReaderScreen2.K;
                        barcodeQrReaderScreenContract$InputData.getClass();
                        return new px.d(gVar, cVar2, new oy.b(), barcodeQrReaderScreen2, barcodeQrReaderScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BarcodeQrReaderScreen.R;
                        return (oy.a) ((px.d) barcodeQrReaderScreen.P.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a aVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = aVarD3.f10989c;
        List<? extends NavBarMenuItem> list = uiState.f317510b;
        BarcodeQrReaderScreenSettings.ButtonConfiguration buttonConfiguration = uiState.d;
        navBarWithToolbar.setMenuItems(list);
        TwinVerticalButton twinVerticalButton = aVarD3.d;
        BarcodeQrReaderScreenSettings.ButtonConfiguration buttonConfiguration2 = uiState.f317511c;
        if (buttonConfiguration2 != null) {
            twinVerticalButton.setMainButtonText(buttonConfiguration2.f50774a);
            twinVerticalButton.setMainButtonStyle(buttonConfiguration2.f50776c);
            twinVerticalButton.setMainButtonIcon(buttonConfiguration2.f50775b);
            String str = buttonConfiguration2.d;
            if (str != null) {
                twinVerticalButton.setMainButtonLoadingTag(str);
            }
            twinVerticalButton.setMainButtonVisible(true);
        } else {
            twinVerticalButton.setMainButtonVisible(false);
        }
        if (buttonConfiguration == null) {
            twinVerticalButton.setSecondaryButtonVisible(false);
            return;
        }
        twinVerticalButton.setSecondaryButtonText(buttonConfiguration.f50774a);
        twinVerticalButton.setSecondaryButtonStyle(buttonConfiguration.f50776c);
        twinVerticalButton.setSecondaryButtonIcon(buttonConfiguration.f50775b);
        String str2 = buttonConfiguration.d;
        if (str2 != null) {
            twinVerticalButton.setSecondaryButtonLoadingTag(str2);
        }
        twinVerticalButton.setSecondaryButtonVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (r) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        CameraKitView cameraKitView = d3().f10988b;
        cameraKitView.setMask(this.K.f50777a.f50773c);
        cameraKitView.setHint(new f(null, null, null, 12), rz.l.Default);
        cameraKitView.setShutterButtonState(rz.r.f258455a);
        cameraKitView.setMaskHintMargin(16.0f);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        m2().getWindow().clearFlags(128);
        ((oy.a) this.Q.getValue()).R(false);
        Window window = m2().getWindow();
        WindowManager.LayoutParams attributes = m2().getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        window.setAttributes(attributes);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        m2().getWindow().addFlags(128);
        ((oy.a) this.Q.getValue()).R(true);
        NavBarWithToolbar navBarWithToolbar = d3().f10989c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setExpanded(true);
        BarcodeQrReaderScreenContract$InputData barcodeQrReaderScreenContract$InputData = this.K;
        navBarWithToolbar.setTitle(barcodeQrReaderScreenContract$InputData.f50777a.f50771a, null);
        Clause clause = barcodeQrReaderScreenContract$InputData.f50777a.f50772b;
        if (clause != null) {
            navBarWithToolbar.setDescriptionText(clause);
            navBarWithToolbar.setDescriptionVisible(true);
        } else {
            navBarWithToolbar.setDescriptionVisible(false);
        }
        efm.r map = navBarWithToolbar.o.f57403b.map(new yua.h(new j(11), 18));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new i(2, (r) this.O.getValue(), r.class, "onEvent", "onEvent(Lcom/revolut/camerakit/revolut/ui/barcodeqr/screen/BarcodeQrReaderScreenContract$Event;)V", 4, 3), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o0()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().d.p0()), new c(this, null, 2), 3);
        d3().d.setGradientBackgroundEnabled(false);
    }

    public final a d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }
}
