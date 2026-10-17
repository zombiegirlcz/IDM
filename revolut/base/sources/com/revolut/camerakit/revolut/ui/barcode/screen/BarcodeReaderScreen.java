package com.revolut.camerakit.revolut.ui.barcode.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.camerakit.revolut.ui.R$layout;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$InputData;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$OutputData;
import com.revolut.camerakit.revolut.ui.barcode.screen.BarcodeReaderScreen;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oy.a;
import px.f;
import rz.l;
import rz.r;
import tx0.d0;
import uwi.v;
import ux.b;
import ux.g;
import vc.s;
import vkm.d;
import xki.e;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/barcode/screen/BarcodeReaderScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/camerakit/revolut/ui/barcode/BarcodeReaderFlowContract$OutputData;", "Lcli/w;", "Lux/h;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BarcodeReaderScreen extends ViewController<BarcodeReaderFlowContract$OutputData> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BarcodeReaderScreen.class, "binding", "getBinding()Lcom/revolut/camerakit/revolut/ui/databinding/ScreenBarcodeReaderBinding;", 0))};
    public final BarcodeReaderFlowContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public int R;

    public BarcodeReaderScreen(BarcodeReaderFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_barcode_reader;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: ux.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeReaderScreen f283705b;

            {
                this.f283705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BarcodeReaderScreen barcodeReaderScreen = this.f283705b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeReaderScreen.S;
                        return n14.e.a(barcodeReaderScreen, (g) barcodeReaderScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeReaderScreen.S;
                        return (g) ((px.f) barcodeReaderScreen.P.getValue()).f240526s.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BarcodeReaderScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(barcodeReaderScreen.m2()).a().get(px.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", px.g.class, " is not found"));
                        }
                        px.g gVar = ((px.g) aVar2.b()).f240531h;
                        BarcodeReaderFlowContract$InputData barcodeReaderFlowContract$InputData = barcodeReaderScreen.K;
                        barcodeReaderFlowContract$InputData.getClass();
                        return new px.f(gVar, new oy.b(), barcodeReaderScreen, barcodeReaderFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BarcodeReaderScreen.S;
                        return (oy.a) ((px.f) barcodeReaderScreen.P.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: ux.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeReaderScreen f283705b;

            {
                this.f283705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BarcodeReaderScreen barcodeReaderScreen = this.f283705b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeReaderScreen.S;
                        return n14.e.a(barcodeReaderScreen, (g) barcodeReaderScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeReaderScreen.S;
                        return (g) ((px.f) barcodeReaderScreen.P.getValue()).f240526s.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BarcodeReaderScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(barcodeReaderScreen.m2()).a().get(px.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", px.g.class, " is not found"));
                        }
                        px.g gVar = ((px.g) aVar2.b()).f240531h;
                        BarcodeReaderFlowContract$InputData barcodeReaderFlowContract$InputData = barcodeReaderScreen.K;
                        barcodeReaderFlowContract$InputData.getClass();
                        return new px.f(gVar, new oy.b(), barcodeReaderScreen, barcodeReaderFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BarcodeReaderScreen.S;
                        return (oy.a) ((px.f) barcodeReaderScreen.P.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: ux.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeReaderScreen f283705b;

            {
                this.f283705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BarcodeReaderScreen barcodeReaderScreen = this.f283705b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeReaderScreen.S;
                        return n14.e.a(barcodeReaderScreen, (g) barcodeReaderScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeReaderScreen.S;
                        return (g) ((px.f) barcodeReaderScreen.P.getValue()).f240526s.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BarcodeReaderScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(barcodeReaderScreen.m2()).a().get(px.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", px.g.class, " is not found"));
                        }
                        px.g gVar = ((px.g) aVar2.b()).f240531h;
                        BarcodeReaderFlowContract$InputData barcodeReaderFlowContract$InputData = barcodeReaderScreen.K;
                        barcodeReaderFlowContract$InputData.getClass();
                        return new px.f(gVar, new oy.b(), barcodeReaderScreen, barcodeReaderFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BarcodeReaderScreen.S;
                        return (oy.a) ((px.f) barcodeReaderScreen.P.getValue()).e.get();
                }
            }
        });
        final int i5 = 3;
        this.Q = te0.w.y0(new Function0(this) { // from class: ux.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeReaderScreen f283705b;

            {
                this.f283705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BarcodeReaderScreen barcodeReaderScreen = this.f283705b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeReaderScreen.S;
                        return n14.e.a(barcodeReaderScreen, (g) barcodeReaderScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeReaderScreen.S;
                        return (g) ((px.f) barcodeReaderScreen.P.getValue()).f240526s.get();
                    case 2:
                        KProperty[] kPropertyArr3 = BarcodeReaderScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(barcodeReaderScreen.m2()).a().get(px.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", px.g.class, " is not found"));
                        }
                        px.g gVar = ((px.g) aVar2.b()).f240531h;
                        BarcodeReaderFlowContract$InputData barcodeReaderFlowContract$InputData = barcodeReaderScreen.K;
                        barcodeReaderFlowContract$InputData.getClass();
                        return new px.f(gVar, new oy.b(), barcodeReaderScreen, barcodeReaderFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BarcodeReaderScreen.S;
                        return (oy.a) ((px.f) barcodeReaderScreen.P.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ux.h uiState = (ux.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ay.b bVarD3 = d3();
        BasicNavBar basicNavBar = bVarD3.d;
        basicNavBar.setTitle(uiState.f283709a);
        basicNavBar.setMenuItems(uiState.f283710b);
        LargeActionButton largeActionButton = bVarD3.f10991b;
        Clause clause = uiState.f283711c;
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        if (clause != null) {
            largeActionButton.setText(clause);
            largeActionButton.o(LargeActionButton.ButtonStyle.f58727c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.R = m2().getRequestedOrientation();
        CameraKitView cameraKitView = d3().f10992c;
        cameraKitView.setMask(this.K.f50754a.f50764c);
        cameraKitView.setHint(null, l.Default);
        cameraKitView.setShutterButtonState(r.f258455a);
        cameraKitView.setMaskHintMargin(16.0f);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        m2().getWindow().clearFlags(128);
        ((a) this.Q.getValue()).R(false);
        m2().setRequestedOrientation(this.R);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        m2().getWindow().addFlags(128);
        ((a) this.Q.getValue()).R(true);
        m2().setRequestedOrientation(0);
        BasicNavBar basicNavBar = d3().d;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        basicNavBar.setBackground(d0.OVERLAY);
        efm.r map = basicNavBar.f59210a.f57403b.map(new uwf.b(4, new v(4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        d dVarB = rd0.e.b(map);
        ?? r122 = this.O;
        ViewController.P2(this, dVarB, new u36.g(2, (g) r122.getValue(), g.class, "onEvent", "onEvent(Lcom/revolut/camerakit/revolut/ui/barcode/screen/BarcodeReaderScreenContract$Event;)V", 4, 9), 3);
        ViewController.P2(this, rd0.e.b(basicNavBar.f59211b), new uwe.f(this, null, 1), 3);
        efm.r map2 = d3().f10991b.o.map(new uwf.b(5, new v(5)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        ViewController.P2(this, rd0.e.b(map2), new u36.g(2, (g) r122.getValue(), g.class, "onEvent", "onEvent(Lcom/revolut/camerakit/revolut/ui/barcode/screen/BarcodeReaderScreenContract$Event;)V", 4, 10), 3);
    }

    public final ay.b d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ay.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
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
