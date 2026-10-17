package jv;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CaptureMode;
import com.revolut.camerakit.client.api.models.HintMessage;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.e0;
import vkm.j2;
import vkm.q0;
import vkm.z1;

/* JADX INFO: loaded from: classes16.dex */
public final class r implements dv.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dv.m f178717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv.h f178718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LifecycleOwner f178719c;
    public final kv.p d;
    public final uc.d e;
    public final sv.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p56.a f178720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xv.c f178721h;
    public final kv.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mv.c f178722j;
    public final ww.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dx.m f178723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CameraKitClientSettings f178724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lv.b f178725n;
    public final a5h.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iv.c f178726p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f178727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f178728r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f178729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public uv.e f178730t;
    public a2 u;
    public a2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f178731w;

    public r(dv.m cameraKitUiDelegate, xv.h detector, LifecycleOwner lifecycleOwner, kv.p mediaCaptureProvider, uc.d hintMessageTimer, sv.a uiStateUpdater, p56.a cameraKitEventsHandler, xv.c cameraCoreDelegate, kv.a captureState, mv.c cameraKitFlashStateDelegate, ww.b cameraPerformanceTracker, dx.m previewWithMaskMetadata, CameraKitClientSettings cameraKitClientSettings, lv.b cameraChecksDelegate, a5h.g detectionResultsTelemetryManager, iv.c qualityNetFrameSelector) {
        Intrinsics.checkNotNullParameter(cameraKitUiDelegate, "cameraKitUiDelegate");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(mediaCaptureProvider, "mediaCaptureProvider");
        Intrinsics.checkNotNullParameter(hintMessageTimer, "hintMessageTimer");
        Intrinsics.checkNotNullParameter(uiStateUpdater, "uiStateUpdater");
        Intrinsics.checkNotNullParameter(cameraKitEventsHandler, "cameraKitEventsHandler");
        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
        Intrinsics.checkNotNullParameter(captureState, "captureState");
        Intrinsics.checkNotNullParameter(cameraKitFlashStateDelegate, "cameraKitFlashStateDelegate");
        Intrinsics.checkNotNullParameter(cameraPerformanceTracker, "cameraPerformanceTracker");
        Intrinsics.checkNotNullParameter(previewWithMaskMetadata, "previewWithMaskMetadata");
        Intrinsics.checkNotNullParameter(cameraKitClientSettings, "cameraKitClientSettings");
        Intrinsics.checkNotNullParameter(cameraChecksDelegate, "cameraChecksDelegate");
        Intrinsics.checkNotNullParameter(detectionResultsTelemetryManager, "detectionResultsTelemetryManager");
        Intrinsics.checkNotNullParameter(qualityNetFrameSelector, "qualityNetFrameSelector");
        this.f178717a = cameraKitUiDelegate;
        this.f178718b = detector;
        this.f178719c = lifecycleOwner;
        this.d = mediaCaptureProvider;
        this.e = hintMessageTimer;
        this.f = uiStateUpdater;
        this.f178720g = cameraKitEventsHandler;
        this.f178721h = cameraCoreDelegate;
        this.i = captureState;
        this.f178722j = cameraKitFlashStateDelegate;
        this.k = cameraPerformanceTracker;
        this.f178723l = previewWithMaskMetadata;
        this.f178724m = cameraKitClientSettings;
        this.f178725n = cameraChecksDelegate;
        this.o = detectionResultsTelemetryManager;
        this.f178726p = qualityNetFrameSelector;
        int i = 0;
        int i2 = 2;
        this.f178727q = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        Continuation continuation = null;
        z1 z1VarB = vkm.q.b(0, 7, null);
        this.f178728r = z1VarB;
        this.f178729s = vkm.q.b(0, 7, null);
        e();
        CaptureMode captureMode = cameraKitClientSettings.f50707b;
        int i3 = 3;
        if (captureMode instanceof CaptureMode.AutoCaptureTimeout) {
            e0.C(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new n(captureMode, this, null), 3);
        }
        CameraKitView cameraKitView = ((lv.c) cameraKitUiDelegate).f200270a;
        View view = cameraKitView.f50862j;
        Intrinsics.checkNotNullParameter(view, "<this>");
        vkm.q.G(new q0(new tse.c(vkm.q.k(new tqh.j(view, continuation, 21)), cameraKitView, 29), new g(this, continuation, i2), 1), LifecycleOwnerKt.getLifecycleScope(lifecycleOwner));
        vkm.q.G(new q0(vkm.q.J(cameraCoreDelegate.f()), new g(this, continuation, i), 1), LifecycleOwnerKt.getLifecycleScope(lifecycleOwner));
        vkm.q.G(vkm.q.Q(z1VarB, new iw6.l(continuation, this, 27)), LifecycleOwnerKt.getLifecycleScope(lifecycleOwner));
        lifecycleOwner.getLifecycle().addObserver(new j(this));
        vkm.q.G(new q0(new q0(cameraKitFlashStateDelegate.f209068c, new mkk.q(cameraKitFlashStateDelegate, continuation, 23), 1), new g(this, continuation, 1), 1), LifecycleOwnerKt.getLifecycleScope(lifecycleOwner));
        vkm.q.G(new q0(detector.a(), new e(this, continuation, i3), 1), LifecycleOwnerKt.getLifecycleScope(lifecycleOwner));
        e0.C(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new e(this, continuation, i2), 3);
        vkm.q.G(new q0(detector.a(), new o(this, continuation, i), 1), LifecycleOwnerKt.getLifecycleScope(lifecycleOwner));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r6.emit(dv.g.f118007a, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(jv.r r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof jv.b
            if (r0 == 0) goto L13
            r0 = r7
            jv.b r0 = (jv.b) r0
            int r1 = r0.f178697w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178697w = r1
            goto L18
        L13:
            jv.b r0 = new jv.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178697w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)
            goto L68
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r7)
            goto L5b
        L39:
            yhm.o.b(r7)
            goto L4e
        L3d:
            yhm.o.b(r7)
            r6.h()
            kv.p r7 = r6.d
            r0.f178697w = r5
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L4e
            goto L67
        L4e:
            vkm.z1 r7 = r6.f178727q
            r0.f178697w = r4
            uv.c r2 = uv.c.f283253a
            java.lang.Object r7 = r7.emit(r2, r0)
            if (r7 != r1) goto L5b
            goto L67
        L5b:
            vkm.z1 r6 = r6.f178729s
            r0.f178697w = r3
            dv.g r7 = dv.g.f118007a
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.r.a(jv.r, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0153, code lost:
    
        if (r9.emit(uv.c.f283253a, r0) != r1) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(jv.r r9, xv.l r10, gim.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.r.b(jv.r, xv.l, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(jv.r r5, gv.m r6, xv.l r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof jv.l
            if (r0 == 0) goto L13
            r0 = r8
            jv.l r0 = (jv.l) r0
            int r1 = r0.f178710x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178710x = r1
            goto L18
        L13:
            jv.l r0 = new jv.l
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178710x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gv.m r6 = r0.u
            yhm.o.b(r8)
            goto L64
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r8)
            if (r7 != 0) goto L37
            goto L4a
        L37:
            com.revolut.camerakit.client.api.models.CameraKitClientSettings r8 = r5.f178724m
            com.revolut.camerakit.client.api.models.CameraCaptureSettings r8 = r8.f50706a
            com.revolut.camerakit.client.api.models.CameraCaptureSettings$Photo r8 = f(r8)
            if (r8 != 0) goto L42
            goto L4a
        L42:
            boolean r2 = r6 instanceof gv.k
            if (r2 != 0) goto L4b
            boolean r2 = r6 instanceof gv.i
            if (r2 != 0) goto L4b
        L4a:
            return r6
        L4b:
            kv.p r5 = r5.d
            vkm.y r5 = r5.d(r8, r7)
            ie6.q r7 = new ie6.q
            r8 = 2
            r2 = 7
            r4 = 0
            r7.<init>(r8, r2, r4)
            r0.u = r6
            r0.f178710x = r3
            java.lang.Object r8 = vkm.q.A(r5, r7, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            kv.g r8 = (kv.g) r8
            if (r8 == 0) goto L91
            kv.d r8 = (kv.d) r8
            gv.m r5 = r8.f189888a
            java.lang.String r7 = "null cannot be cast to non-null type com.revolut.camerakit.client.api.models.Media.Picture"
            kotlin.jvm.internal.Intrinsics.i(r5, r7)
            gv.k r5 = (gv.k) r5
            boolean r7 = r6 instanceof gv.k
            if (r7 == 0) goto L78
            return r5
        L78:
            boolean r7 = r6 instanceof gv.i
            if (r7 == 0) goto L91
            gv.i r6 = (gv.i) r6
            gv.l r6 = r6.f147014b
            java.lang.String r7 = "picture"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            java.lang.String r7 = "video"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            gv.i r7 = new gv.i
            r7.<init>(r5, r6)
            return r7
        L91:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.r.c(jv.r, gv.m, xv.l, gim.c):java.lang.Object");
    }

    public static CameraCaptureSettings.Photo f(CameraCaptureSettings cameraCaptureSettings) {
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Photo) {
            return (CameraCaptureSettings.Photo) cameraCaptureSettings;
        }
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Compound) {
            return ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50694a;
        }
        if ((cameraCaptureSettings instanceof CameraCaptureSettings.Video) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.FaceEmbedding.f50696a) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.CompactSelfie.f50693a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long d() {
        CaptureMode captureMode = this.f178724m.f50707b;
        if (captureMode instanceof CaptureMode.AutoCapture) {
            return ((CaptureMode.AutoCapture) captureMode).f50713b;
        }
        if (captureMode instanceof CaptureMode.AutoCaptureTimeout) {
            return ((CaptureMode.AutoCaptureTimeout) captureMode).f50715b;
        }
        return 0L;
    }

    public final void e() {
        a2 a2Var = this.v;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.v = e0.C(LifecycleOwnerKt.getLifecycleScope(this.f178719c), null, null, new f(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (r9.f178721h.h(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof jv.m
            if (r0 == 0) goto L13
            r0 = r10
            jv.m r0 = (jv.m) r0
            int r1 = r0.f178711w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178711w = r1
            goto L18
        L13:
            jv.m r0 = new jv.m
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178711w
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r10)
            goto L98
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L34:
            yhm.o.b(r10)
            goto L73
        L38:
            yhm.o.b(r10)
            r9.h()
            xv.h r10 = r9.f178718b
            r10.resume()
            kv.a r10 = r9.i
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.f189883a
            r2.set(r6)
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.f189884b
            r2.set(r6)
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.d
            r10.set(r6)
            r0.f178711w = r5
            mv.c r10 = r9.f178722j
            java.util.concurrent.atomic.AtomicLong r2 = r10.d
            r7 = 0
            r2.set(r7)
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.e
            r2.set(r6)
            vkm.j2 r10 = r10.f209068c
            r10.getClass()
            gv.a r2 = gv.a.f147001a
            r10.g(r3, r2)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            if (r10 != r1) goto L73
            goto L97
        L73:
            a5h.g r10 = r9.o
            java.lang.Object r2 = r10.d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r5 = r10.f1406b
            iv.a r5 = (iv.a) r5
            r5.f168661a = r6
            r2.clear()
            gv.q r5 = new gv.q
            java.lang.Object r6 = r10.e
            gv.o r6 = (gv.o) r6
            r5.<init>(r3, r2, r6)
            r10.f = r5
            r0.f178711w = r4
            xv.c r10 = r9.f178721h
            java.lang.Object r10 = r10.h(r0)
            if (r10 != r1) goto L98
        L97:
            return r1
        L98:
            dv.m r10 = r9.f178717a
            lv.c r10 = (lv.c) r10
            com.revolut.camerakit.ui.views.view.CameraKitView r10 = r10.f200270a
            com.revolut.camerakit.ui.views.view.CameraKitPreviewView r0 = r10.k
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.widget.ImageView r10 = r10.f50864m
            r0 = 8
            r10.setVisibility(r0)
            r10.setImageBitmap(r3)
            r9.e()
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.r.g(gim.c):java.lang.Object");
    }

    public final void h() {
        a2 a2Var = this.f178731w;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f178731w = null;
        iv.c cVar = this.f178726p;
        cVar.f168664a = null;
        cVar.f168665b = Double.NEGATIVE_INFINITY;
    }

    public final void i(HintMessage hintMessage) {
        Intrinsics.checkNotNullParameter(hintMessage, "hintMessage");
        Intrinsics.checkNotNullParameter(hintMessage, "hintMessage");
        this.f.f265808c.i.setValue(hintMessage);
    }

    public final Unit j(boolean z) {
        Unit unit;
        j2 j2Var = this.f178722j.f209068c;
        if ((((gv.d) j2Var.getValue()) instanceof gv.a) && !z) {
            unit = Unit.f186387a;
        } else if (z) {
            j2Var.g(null, new gv.c(false));
            unit = Unit.f186387a;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        } else if (z) {
            unit = Unit.f186387a;
        } else {
            j2Var.g(null, gv.b.f147002a);
            unit = Unit.f186387a;
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        }
        return unit == fim.a.COROUTINE_SUSPENDED ? unit : Unit.f186387a;
    }
}
