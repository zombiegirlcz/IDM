package com.revolut.camerakit.revolut.ui.flow.steps.camera.terminal_ui;

import aee.g;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import az.f;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.camerakit.revolut.ui.R$layout;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.terminal_ui.CameraKitTerminalCameraViewController;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.camerakit.ui.views.view.debug.CameraKitDebugOverlayView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jh.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import no.k;
import no.m;
import ny0.i;
import pki.b;
import ty0.c;
import vc.s;
import vy.a;
import vy.e;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/terminal_ui/CameraKitTerminalCameraViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvy/e;", "Lcli/w;", "Laz/f;", "Lno/m;", "Lno/k;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraKitTerminalCameraViewController extends ViewController<e> implements w, m, k {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CameraKitTerminalCameraViewController.class, "binding", "getBinding()Lcom/revolut/camerakit/revolut/ui/databinding/ScreenCameraKitFlowTerminalCameraBinding;", 0))};
    public final a K;
    public final h L;
    public final AnalyticsProduct M;
    public AnalyticsContext N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CameraKitTerminalCameraViewController(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, az.h.f);
        this.M = inputData.f;
        this.O = R$layout.screen_camera_kit_flow_terminal_camera;
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: az.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraKitTerminalCameraViewController f11280b;

            {
                this.f11280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CameraKitTerminalCameraViewController cameraKitTerminalCameraViewController = this.f11280b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CameraKitTerminalCameraViewController.S;
                        qji.b bVarU2 = cameraKitTerminalCameraViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.di.CameraKitCameraScreenInjector<*>");
                        ey.c cVar = (ey.c) ((my.b) bVarU2).u().mo3808a(cameraKitTerminalCameraViewController);
                        vy.a aVar = cameraKitTerminalCameraViewController.K;
                        ey.c cVarB = cVar.c(aVar.f293108b).b(aVar.f293109c);
                        CameraKitView cameraKitTerminalCameraScreenCameraKitView = cameraKitTerminalCameraViewController.d3().f10997b;
                        Intrinsics.checkNotNullExpressionValue(cameraKitTerminalCameraScreenCameraKitView, "cameraKitTerminalCameraScreenCameraKitView");
                        return (wy.a) cVarB.d(cameraKitTerminalCameraScreenCameraKitView).i(aVar).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CameraKitTerminalCameraViewController.S;
                        pki.b bVarA = ((wy.a) cameraKitTerminalCameraViewController.P.getValue()).a();
                        Intrinsics.i(bVarA, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.terminal_ui.CameraKitTerminalCameraContract.ScreenModelApi");
                        return (k) bVarA;
                    default:
                        KProperty[] kPropertyArr3 = CameraKitTerminalCameraViewController.S;
                        return n14.e.a(cameraKitTerminalCameraViewController, (k) cameraKitTerminalCameraViewController.Q.getValue());
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: az.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraKitTerminalCameraViewController f11280b;

            {
                this.f11280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CameraKitTerminalCameraViewController cameraKitTerminalCameraViewController = this.f11280b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CameraKitTerminalCameraViewController.S;
                        qji.b bVarU2 = cameraKitTerminalCameraViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.di.CameraKitCameraScreenInjector<*>");
                        ey.c cVar = (ey.c) ((my.b) bVarU2).u().mo3808a(cameraKitTerminalCameraViewController);
                        vy.a aVar = cameraKitTerminalCameraViewController.K;
                        ey.c cVarB = cVar.c(aVar.f293108b).b(aVar.f293109c);
                        CameraKitView cameraKitTerminalCameraScreenCameraKitView = cameraKitTerminalCameraViewController.d3().f10997b;
                        Intrinsics.checkNotNullExpressionValue(cameraKitTerminalCameraScreenCameraKitView, "cameraKitTerminalCameraScreenCameraKitView");
                        return (wy.a) cVarB.d(cameraKitTerminalCameraScreenCameraKitView).i(aVar).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CameraKitTerminalCameraViewController.S;
                        pki.b bVarA = ((wy.a) cameraKitTerminalCameraViewController.P.getValue()).a();
                        Intrinsics.i(bVarA, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.terminal_ui.CameraKitTerminalCameraContract.ScreenModelApi");
                        return (k) bVarA;
                    default:
                        KProperty[] kPropertyArr3 = CameraKitTerminalCameraViewController.S;
                        return n14.e.a(cameraKitTerminalCameraViewController, (k) cameraKitTerminalCameraViewController.Q.getValue());
                }
            }
        });
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: az.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraKitTerminalCameraViewController f11280b;

            {
                this.f11280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CameraKitTerminalCameraViewController cameraKitTerminalCameraViewController = this.f11280b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CameraKitTerminalCameraViewController.S;
                        qji.b bVarU2 = cameraKitTerminalCameraViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.di.CameraKitCameraScreenInjector<*>");
                        ey.c cVar = (ey.c) ((my.b) bVarU2).u().mo3808a(cameraKitTerminalCameraViewController);
                        vy.a aVar = cameraKitTerminalCameraViewController.K;
                        ey.c cVarB = cVar.c(aVar.f293108b).b(aVar.f293109c);
                        CameraKitView cameraKitTerminalCameraScreenCameraKitView = cameraKitTerminalCameraViewController.d3().f10997b;
                        Intrinsics.checkNotNullExpressionValue(cameraKitTerminalCameraScreenCameraKitView, "cameraKitTerminalCameraScreenCameraKitView");
                        return (wy.a) cVarB.d(cameraKitTerminalCameraScreenCameraKitView).i(aVar).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CameraKitTerminalCameraViewController.S;
                        pki.b bVarA = ((wy.a) cameraKitTerminalCameraViewController.P.getValue()).a();
                        Intrinsics.i(bVarA, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.terminal_ui.CameraKitTerminalCameraContract.ScreenModelApi");
                        return (k) bVarA;
                    default:
                        KProperty[] kPropertyArr3 = CameraKitTerminalCameraViewController.S;
                        return n14.e.a(cameraKitTerminalCameraViewController, (k) cameraKitTerminalCameraViewController.Q.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState == null) {
            throw new NoWhenBranchMatchedException();
        }
        d3().e.setContent(new c7(uiState.f11277a, true, null, 4));
        az.e eVar = uiState.f11278b;
        if (eVar == null) {
            d3().d.setVisibility(false);
            return;
        }
        d3().d.setVisibility(true);
        CameraKitDebugOverlayView cameraKitDebugOverlayView = d3().d;
        Iterable<wz.a> rects = eVar.f11276b;
        Intrinsics.checkNotNullParameter(rects, "rects");
        cameraKitDebugOverlayView.f.setRects(rects);
        TextView textView = d3().d.getTextView();
        ?? r110 = eVar.f11275a;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c.b(d.f(context).b0(), r110, textView, null, null, 12);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (wy.a) this.P.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (az.k) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ay.d dVarD3 = d3();
        CameraKitView cameraKitTerminalCameraScreenCameraKitView = dVarD3.f10997b;
        Intrinsics.checkNotNullExpressionValue(cameraKitTerminalCameraScreenCameraKitView, "cameraKitTerminalCameraScreenCameraKitView");
        i.e(cameraKitTerminalCameraScreenCameraKitView);
        CameraKitDebugOverlayView cameraKitTerminalCameraScreenDebugOverlay = dVarD3.d;
        Intrinsics.checkNotNullExpressionValue(cameraKitTerminalCameraScreenDebugOverlay, "cameraKitTerminalCameraScreenDebugOverlay");
        i.e(cameraKitTerminalCameraScreenDebugOverlay);
        LargeActionButton cameraKitTerminalCameraScreenClose = dVarD3.f10998c;
        Intrinsics.checkNotNullExpressionValue(cameraKitTerminalCameraScreenClose, "cameraKitTerminalCameraScreenClose");
        i.e(cameraKitTerminalCameraScreenClose);
        d3().f10998c.setIcon(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        CameraKitDebugOverlayView cameraKitTerminalCameraScreenDebugOverlay2 = d3().d;
        Intrinsics.checkNotNullExpressionValue(cameraKitTerminalCameraScreenDebugOverlay2, "cameraKitTerminalCameraScreenDebugOverlay");
        od0.a aVar = od0.a.f224253a;
        cameraKitTerminalCameraScreenDebugOverlay2.setVisibility(od0.a.e() ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f10998c.o), null, new az.i(this, null, 0), 3);
        ViewController.P2(this, vkm.q.H(new akl.o(2, 5, null), d3().d.f50894b.f50892a), new g(2, (az.k) this.Q.getValue(), az.k.class, "onEvent", "onEvent(Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/terminal_ui/CameraKitTerminalCameraContract$Event;)V", 4, 9), 3);
    }

    public final ay.d d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ay.d) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.R.getValue();
    }
}
