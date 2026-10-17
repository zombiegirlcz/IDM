package com.revolut.camerakit.revolut.ui.flow.steps.camera;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleRegistry;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import ay.c;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.camerakit.revolut.ui.R$layout;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreen;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.camerakit.ui.views.view.debug.CameraKitDebugOverlayView;
import com.revolut.camerakit.ui.views.view.player.CameraKitPlayer;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jh.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import ny0.i;
import ryj.f;
import sx2.g;
import sy.b;
import sy.l;
import sy.n;
import sy.p;
import sy.r;
import sy.t;
import sy.u;
import tx0.d0;
import vc.s;
import vy.e;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvy/e;", "Lcli/w;", "Lsy/u;", "Lno/m;", "Lno/k;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraKitCameraScreen extends ViewController<e> implements w, m, k {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CameraKitCameraScreen.class, "binding", "getBinding()Lcom/revolut/camerakit/revolut/ui/databinding/ScreenCameraKitFlowCameraBinding;", 0))};
    public final vy.a K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public int R;
    public final AnalyticsProduct S;
    public AnalyticsContext T;

    public CameraKitCameraScreen(vy.a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_camera_kit_flow_camera;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: sy.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraKitCameraScreen f266531b;

            {
                this.f266531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CameraKitCameraScreen cameraKitCameraScreen = this.f266531b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CameraKitCameraScreen.U;
                        return n14.e.a(cameraKitCameraScreen, (k) cameraKitCameraScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = CameraKitCameraScreen.U;
                        pki.b bVarA = ((wy.a) cameraKitCameraScreen.P.getValue()).a();
                        Intrinsics.i(bVarA, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreenContract.ScreenModelApi");
                        return (k) bVarA;
                    case 2:
                        KProperty[] kPropertyArr3 = CameraKitCameraScreen.U;
                        qji.b bVarU2 = cameraKitCameraScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.di.CameraKitCameraScreenInjector<*>");
                        ey.c cVar = (ey.c) ((my.b) bVarU2).u().mo3808a(cameraKitCameraScreen);
                        vy.a aVar = cameraKitCameraScreen.K;
                        ey.c cVarB = cVar.c(aVar.f293108b).b(aVar.f293109c);
                        CameraKitView cameraKitCameraScreenCameraKitView = cameraKitCameraScreen.d3().f10994b;
                        Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenCameraKitView, "cameraKitCameraScreenCameraKitView");
                        return (wy.a) cVarB.d(cameraKitCameraScreenCameraKitView).i(aVar).mo3783build();
                    default:
                        KProperty[] kPropertyArr4 = CameraKitCameraScreen.U;
                        return ((wy.a) cameraKitCameraScreen.P.getValue()).K();
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: sy.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraKitCameraScreen f266531b;

            {
                this.f266531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CameraKitCameraScreen cameraKitCameraScreen = this.f266531b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CameraKitCameraScreen.U;
                        return n14.e.a(cameraKitCameraScreen, (k) cameraKitCameraScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = CameraKitCameraScreen.U;
                        pki.b bVarA = ((wy.a) cameraKitCameraScreen.P.getValue()).a();
                        Intrinsics.i(bVarA, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreenContract.ScreenModelApi");
                        return (k) bVarA;
                    case 2:
                        KProperty[] kPropertyArr3 = CameraKitCameraScreen.U;
                        qji.b bVarU2 = cameraKitCameraScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.di.CameraKitCameraScreenInjector<*>");
                        ey.c cVar = (ey.c) ((my.b) bVarU2).u().mo3808a(cameraKitCameraScreen);
                        vy.a aVar = cameraKitCameraScreen.K;
                        ey.c cVarB = cVar.c(aVar.f293108b).b(aVar.f293109c);
                        CameraKitView cameraKitCameraScreenCameraKitView = cameraKitCameraScreen.d3().f10994b;
                        Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenCameraKitView, "cameraKitCameraScreenCameraKitView");
                        return (wy.a) cVarB.d(cameraKitCameraScreenCameraKitView).i(aVar).mo3783build();
                    default:
                        KProperty[] kPropertyArr4 = CameraKitCameraScreen.U;
                        return ((wy.a) cameraKitCameraScreen.P.getValue()).K();
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: sy.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraKitCameraScreen f266531b;

            {
                this.f266531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CameraKitCameraScreen cameraKitCameraScreen = this.f266531b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CameraKitCameraScreen.U;
                        return n14.e.a(cameraKitCameraScreen, (k) cameraKitCameraScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = CameraKitCameraScreen.U;
                        pki.b bVarA = ((wy.a) cameraKitCameraScreen.P.getValue()).a();
                        Intrinsics.i(bVarA, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreenContract.ScreenModelApi");
                        return (k) bVarA;
                    case 2:
                        KProperty[] kPropertyArr3 = CameraKitCameraScreen.U;
                        qji.b bVarU2 = cameraKitCameraScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.di.CameraKitCameraScreenInjector<*>");
                        ey.c cVar = (ey.c) ((my.b) bVarU2).u().mo3808a(cameraKitCameraScreen);
                        vy.a aVar = cameraKitCameraScreen.K;
                        ey.c cVarB = cVar.c(aVar.f293108b).b(aVar.f293109c);
                        CameraKitView cameraKitCameraScreenCameraKitView = cameraKitCameraScreen.d3().f10994b;
                        Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenCameraKitView, "cameraKitCameraScreenCameraKitView");
                        return (wy.a) cVarB.d(cameraKitCameraScreenCameraKitView).i(aVar).mo3783build();
                    default:
                        KProperty[] kPropertyArr4 = CameraKitCameraScreen.U;
                        return ((wy.a) cameraKitCameraScreen.P.getValue()).K();
                }
            }
        });
        final int i5 = 3;
        this.Q = te0.w.y0(new Function0(this) { // from class: sy.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraKitCameraScreen f266531b;

            {
                this.f266531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CameraKitCameraScreen cameraKitCameraScreen = this.f266531b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CameraKitCameraScreen.U;
                        return n14.e.a(cameraKitCameraScreen, (k) cameraKitCameraScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = CameraKitCameraScreen.U;
                        pki.b bVarA = ((wy.a) cameraKitCameraScreen.P.getValue()).a();
                        Intrinsics.i(bVarA, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreenContract.ScreenModelApi");
                        return (k) bVarA;
                    case 2:
                        KProperty[] kPropertyArr3 = CameraKitCameraScreen.U;
                        qji.b bVarU2 = cameraKitCameraScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.steps.camera.di.CameraKitCameraScreenInjector<*>");
                        ey.c cVar = (ey.c) ((my.b) bVarU2).u().mo3808a(cameraKitCameraScreen);
                        vy.a aVar = cameraKitCameraScreen.K;
                        ey.c cVarB = cVar.c(aVar.f293108b).b(aVar.f293109c);
                        CameraKitView cameraKitCameraScreenCameraKitView = cameraKitCameraScreen.d3().f10994b;
                        Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenCameraKitView, "cameraKitCameraScreenCameraKitView");
                        return (wy.a) cVarB.d(cameraKitCameraScreenCameraKitView).i(aVar).mo3783build();
                    default:
                        KProperty[] kPropertyArr4 = CameraKitCameraScreen.U;
                        return ((wy.a) cameraKitCameraScreen.P.getValue()).K();
                }
            }
        });
        this.R = -1;
        this.S = inputData.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l lVar;
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        p pVarF = uiState.f();
        c cVarD3 = d3();
        if (pVarF instanceof n) {
            cVarD3.e.setTagContent(((n) pVarF).f266549a);
            BasicNavBar basicNavBar = cVarD3.e;
            m70.a.c(t0.f186434a);
            basicNavBar.setTitle(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        } else if (pVarF instanceof sy.m) {
            cVarD3.e.setTitle((Clause) null);
            cVarD3.e.setTagVisible(false);
        } else {
            if (!(pVarF instanceof sy.o)) {
                throw new NoWhenBranchMatchedException();
            }
            cVarD3.e.setTitle((Clause) ((sy.o) pVarF).f266551a);
            cVarD3.e.setTagVisible(false);
        }
        cVarD3.e.setMenuItems(pVarF.a());
        if (uiState instanceof sy.q) {
            sy.q qVar2 = (sy.q) uiState;
            lVar = qVar instanceof l ? (l) qVar : null;
            c cVarD32 = d3();
            CameraKitDebugOverlayView cameraKitDebugOverlayView = cVarD32.f10995c;
            CameraKitPlayer cameraKitCameraScreenPlayer = cVarD32.f;
            Iterable<wz.a> rects = qVar2.f266554b;
            Intrinsics.checkNotNullParameter(rects, "rects");
            cameraKitDebugOverlayView.f.setRects(rects);
            TextView textView = cameraKitDebugOverlayView.getTextView();
            ?? r132 = qVar2.f266553a;
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ty0.c.b(d.f(context).b0(), r132, textView, null, null, 12);
            cameraKitDebugOverlayView.setVisibility(true);
            CameraKitView cameraKitCameraScreenCameraKitView = cVarD32.f10994b;
            Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenCameraKitView, "cameraKitCameraScreenCameraKitView");
            cameraKitCameraScreenCameraKitView.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenPlayer, "cameraKitCameraScreenPlayer");
            cameraKitCameraScreenPlayer.setVisibility(8);
            if (lVar != null && lVar.f266547a) {
                cameraKitCameraScreenPlayer.d();
            }
        } else {
            if (!(uiState instanceof r)) {
                if (!(uiState instanceof t)) {
                    throw new NoWhenBranchMatchedException();
                }
                t tVar = (t) uiState;
                lVar = qVar instanceof l ? (l) qVar : null;
                c cVarD33 = d3();
                CameraKitDebugOverlayView cameraKitDebugOverlayView2 = cVarD33.f10995c;
                CameraKitPlayer cameraKitCameraScreenPlayer2 = cVarD33.f;
                cameraKitDebugOverlayView2.setVisibility(false);
                CameraKitView cameraKitCameraScreenCameraKitView2 = cVarD33.f10994b;
                Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenCameraKitView2, "cameraKitCameraScreenCameraKitView");
                cameraKitCameraScreenCameraKitView2.setVisibility(8);
                Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenPlayer2, "cameraKitCameraScreenPlayer");
                cameraKitCameraScreenPlayer2.setVisibility(0);
                if (lVar != null && lVar.f266547a) {
                    LifecycleRegistry lifecycle = this.F;
                    Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                    LifecycleRegistry lifecycleRegistry = cameraKitCameraScreenPlayer2.e;
                    if (lifecycleRegistry != null) {
                        lifecycleRegistry.removeObserver(cameraKitCameraScreenPlayer2);
                    }
                    cameraKitCameraScreenPlayer2.e = lifecycle;
                    if (lifecycle != null) {
                        lifecycle.addObserver(cameraKitCameraScreenPlayer2);
                    }
                    Uri fileUri = tVar.f266558b;
                    Intrinsics.checkNotNullParameter(fileUri, "fileUri");
                    cameraKitCameraScreenPlayer2.f50899c = fileUri;
                    cameraKitCameraScreenPlayer2.c();
                    cameraKitCameraScreenPlayer2.setRepeat(true);
                }
                if (!tVar.f266559c) {
                    cameraKitCameraScreenPlayer2.f50898b = false;
                    ExoPlayer exoPlayer = cameraKitCameraScreenPlayer2.f50897a;
                    if (exoPlayer != null) {
                        exoPlayer.setPlayWhenReady(false);
                        return;
                    }
                    return;
                }
                cameraKitCameraScreenPlayer2.f50898b = true;
                ExoPlayer exoPlayer2 = cameraKitCameraScreenPlayer2.f50897a;
                if (exoPlayer2 != null && exoPlayer2.getPlaybackState() != 1) {
                    ExoPlayer exoPlayer3 = cameraKitCameraScreenPlayer2.f50897a;
                    if (exoPlayer3 != null) {
                        exoPlayer3.setPlayWhenReady(cameraKitCameraScreenPlayer2.f50898b);
                        return;
                    }
                    return;
                }
                if (cameraKitCameraScreenPlayer2.f50897a == null) {
                    cameraKitCameraScreenPlayer2.f50897a = new ExoPlayer.Builder(cameraKitCameraScreenPlayer2.getContext()).build();
                }
                ExoPlayer exoPlayer4 = cameraKitCameraScreenPlayer2.f50897a;
                if (exoPlayer4 != null) {
                    exoPlayer4.setPlayWhenReady(cameraKitCameraScreenPlayer2.f50898b);
                }
                cameraKitCameraScreenPlayer2.c();
                ExoPlayer exoPlayer5 = cameraKitCameraScreenPlayer2.f50897a;
                if (exoPlayer5 != null) {
                    exoPlayer5.setRepeatMode(cameraKitCameraScreenPlayer2.d ? 1 : 0);
                }
                cameraKitCameraScreenPlayer2.setResizeMode(4);
                cameraKitCameraScreenPlayer2.setPlayer(cameraKitCameraScreenPlayer2.f50897a);
                return;
            }
            lVar = qVar instanceof l ? (l) qVar : null;
            c cVarD34 = d3();
            CameraKitDebugOverlayView cameraKitDebugOverlayView3 = cVarD34.f10995c;
            CameraKitPlayer cameraKitCameraScreenPlayer3 = cVarD34.f;
            cameraKitDebugOverlayView3.setVisibility(false);
            CameraKitView cameraKitCameraScreenCameraKitView3 = cVarD34.f10994b;
            Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenCameraKitView3, "cameraKitCameraScreenCameraKitView");
            cameraKitCameraScreenCameraKitView3.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenPlayer3, "cameraKitCameraScreenPlayer");
            cameraKitCameraScreenPlayer3.setVisibility(8);
            if (lVar != null && lVar.f266547a) {
                cameraKitCameraScreenPlayer3.d();
            }
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.T = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.S;
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
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (sy.k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewCompat.setOnApplyWindowInsetsListener(d3().f10993a, new sx4.c(this, 2));
        c cVarD3 = d3();
        CameraKitView cameraKitCameraScreenCameraKitView = cVarD3.f10994b;
        Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenCameraKitView, "cameraKitCameraScreenCameraKitView");
        i.e(cameraKitCameraScreenCameraKitView);
        CameraKitPlayer cameraKitCameraScreenPlayer = cVarD3.f;
        Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenPlayer, "cameraKitCameraScreenPlayer");
        i.e(cameraKitCameraScreenPlayer);
        CameraKitDebugOverlayView cameraKitCameraScreenDebugOverlay = cVarD3.f10995c;
        Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenDebugOverlay, "cameraKitCameraScreenDebugOverlay");
        i.e(cameraKitCameraScreenDebugOverlay);
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

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        m2().getWindow().addFlags(128);
        ((oy.a) this.Q.getValue()).R(true);
        Window window = m2().getWindow();
        WindowManager.LayoutParams attributes = m2().getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
        Continuation continuation = null;
        wkm.l lVarH = vkm.q.H(new rp1.c(2, 5, null), d3().f10995c.f50894b.f50892a);
        ?? r06 = this.O;
        ViewController.P2(this, lVarH, new f(2, (sy.k) r06.getValue(), sy.k.class, "onEvent", "onEvent(Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$Event;)V", 4, 11), 3);
        BasicNavBar basicNavBar = d3().e;
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow);
        vy.a aVar = this.K;
        if (!aVar.f293111h) {
            numValueOf = null;
        }
        basicNavBar.setNavigationButtonIcon(numValueOf);
        basicNavBar.setBackground(d0.OVERLAY);
        efm.r map = basicNavBar.f59210a.f57403b.map(new sx4.c(new g(22), 3));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new f(2, (sy.k) r06.getValue(), sy.k.class, "onEvent", "onEvent(Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$Event;)V", 4, 12), 3);
        ViewController.P2(this, rd0.e.b(basicNavBar.f59211b), new se4.c(this, continuation, 25), 3);
        d3().d.setTextClause(aVar.d.f258193b);
    }

    public final c d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
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
