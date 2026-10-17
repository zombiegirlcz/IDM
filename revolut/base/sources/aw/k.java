package aw;

import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.video.Recording;
import androidx.lifecycle.LifecycleOwner;
import au6.e2;
import com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings;
import com.revolut.camerakit.core.settings.VideoWatermark;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q0;
import vkm.z1;
import yhm.m;

/* JADX INFO: loaded from: classes16.dex */
public final class k implements xv.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f10176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f10177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yw.h f10178c;
    public final bw.n d;
    public final j0 e;
    public final w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ax.a f10179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ww.b f10180h;
    public final d4m.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d4m.a f10181j;
    public final d4m.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d4m.a f10182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gw.d0 f10183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gw.u f10184n;
    public final gw.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bw.i f10185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bw.c f10186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f10187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f10188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f10189t;
    public Camera u;

    public k(LifecycleOwner lifecycleOwner, l cameraProcessProvider, yw.h settings, bw.n imageCapturer, j0 videoCapture, w preview, ax.a cameraCharacteristicsProvider, ww.b cameraPerformanceTracker, d4m.a cameraEffect, d4m.a surfaceProcessor, d4m.a watermarkVideoEffect, d4m.a watermarkSurfaceProcessor, gw.d0 zoomCheck, gw.u twoCamerasCheck, gw.e exposureCheck, bw.i imageAnalysisManager, bw.c cameraSelectorProvider) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraProcessProvider, "cameraProcessProvider");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(imageCapturer, "imageCapturer");
        Intrinsics.checkNotNullParameter(videoCapture, "videoCapture");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(cameraCharacteristicsProvider, "cameraCharacteristicsProvider");
        Intrinsics.checkNotNullParameter(cameraPerformanceTracker, "cameraPerformanceTracker");
        Intrinsics.checkNotNullParameter(cameraEffect, "cameraEffect");
        Intrinsics.checkNotNullParameter(surfaceProcessor, "surfaceProcessor");
        Intrinsics.checkNotNullParameter(watermarkVideoEffect, "watermarkVideoEffect");
        Intrinsics.checkNotNullParameter(watermarkSurfaceProcessor, "watermarkSurfaceProcessor");
        Intrinsics.checkNotNullParameter(zoomCheck, "zoomCheck");
        Intrinsics.checkNotNullParameter(twoCamerasCheck, "twoCamerasCheck");
        Intrinsics.checkNotNullParameter(exposureCheck, "exposureCheck");
        Intrinsics.checkNotNullParameter(imageAnalysisManager, "imageAnalysisManager");
        Intrinsics.checkNotNullParameter(cameraSelectorProvider, "cameraSelectorProvider");
        this.f10176a = lifecycleOwner;
        this.f10177b = cameraProcessProvider;
        this.f10178c = settings;
        this.d = imageCapturer;
        this.e = videoCapture;
        this.f = preview;
        this.f10179g = cameraCharacteristicsProvider;
        this.f10180h = cameraPerformanceTracker;
        this.i = cameraEffect;
        this.f10181j = surfaceProcessor;
        this.k = watermarkVideoEffect;
        this.f10182l = watermarkSurfaceProcessor;
        this.f10183m = zoomCheck;
        this.f10184n = twoCamerasCheck;
        this.o = exposureCheck;
        this.f10185p = imageAnalysisManager;
        this.f10186q = cameraSelectorProvider;
        this.f10187r = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        this.f10188s = vkm.q.c(xv.a.DISABLED);
        this.f10189t = new AtomicBoolean(false);
        lifecycleOwner.getLifecycle().addObserver(new androidx.lifecycle.a(this, 1));
        c8g.a.f(preview.f10215a, new aqe.a(this, 17));
    }

    public static boolean n(Throwable th10) {
        Iterator it8 = nkm.t.g(th10, new e2(16)).iterator();
        while (it8.hasNext()) {
            if (((Throwable) it8.next()) instanceof IllegalArgumentException) {
                return true;
            }
        }
        return false;
    }

    @Override // xv.c
    public final j2 a() {
        return this.f10188s;
    }

    @Override // xv.c
    public final Object b(lv.a aVar) {
        Camera camera = this.u;
        if (camera != null) {
            return this.f10183m.c(camera, aVar);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xv.c
    public final Object c(lv.a aVar) {
        Camera camera = this.u;
        if (camera != null) {
            return this.o.e(camera, aVar);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xv.c
    public final Object d(long j2, yw.n storagePolicy, VideoImuDataCollectionSettings imuDataCollectionSettings, Continuation continuation) {
        Object objA;
        yw.h hVar = this.f10178c;
        if (hVar.e() == yw.b.PICTURE) {
            throw new UnsupportedOperationException("recordVideo in PICTURE mode is not supported");
        }
        Continuation continuation2 = null;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            Camera camera = this.u;
            if (camera != null) {
                Camera2CameraInfo.Companion companion2 = Camera2CameraInfo.INSTANCE;
                CameraInfo cameraInfo = camera.getCameraInfo();
                Intrinsics.checkNotNullExpressionValue(cameraInfo, "getCameraInfo(...)");
                objA = companion2.from(cameraInfo).cameraId;
            } else {
                objA = null;
            }
        } catch (Throwable th10) {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        String str = (String) objA;
        if (str == null) {
            str = "";
        }
        String cameraId = str;
        j0 j0Var = this.e;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(storagePolicy, "storagePolicy");
        Intrinsics.checkNotNullParameter(imuDataCollectionSettings, "imuDataCollectionSettings");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        int i = 1;
        vkm.y yVarE = rd0.e.e(new q0(vkm.q.m(new h0(j2, j0Var, imuDataCollectionSettings, cameraId, null, storagePolicy)), new a2c.c(2, 9, continuation2), 1), zhm.h0.f322473a, new i0(j2, j0Var, imuDataCollectionSettings, cameraId, null, storagePolicy));
        VideoWatermark videoWatermarkA = hVar.a();
        if (Intrinsics.f(videoWatermarkA, VideoWatermark.Disabled.f50745a)) {
            return yVarE;
        }
        if (videoWatermarkA instanceof VideoWatermark.Enabled) {
            return new vkm.t(new vkm.y(new f(this, (VideoWatermark.Enabled) videoWatermarkA, null), yVarE), new a0e.n(this, continuation2, i));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xv.c
    public final Object e(xv.l lVar, kv.k kVar) {
        return this.d.a(lVar, kVar);
    }

    @Override // xv.c
    public final z1 f() {
        return this.f10187r;
    }

    @Override // xv.c
    public final Unit g() throws Throwable {
        c0 c0Var = (c0) this.e.f.get();
        if (c0Var != null) {
            c0Var.d = true;
            Recording recording = c0Var.f10145c;
            if (recording != null) {
                recording.stop();
            }
        }
        return Unit.f186387a;
    }

    @Override // xv.c
    public final Object h(jv.m mVar) {
        Object objQ = q(false, mVar);
        return objQ == fim.a.COROUTINE_SUSPENDED ? objQ : Unit.f186387a;
    }

    @Override // xv.c
    public final Unit i(dw.a effect) {
        dw.b bVar = (dw.b) this.f10181j.get();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(effect, "effect");
        bVar.f118164b.d.execute(new d0.c(bVar, effect, 2));
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xv.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(boolean r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof aw.i
            if (r0 == 0) goto L13
            r0 = r7
            aw.i r0 = (aw.i) r0
            int r1 = r0.f10166w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10166w = r1
            goto L1a
        L13:
            aw.i r0 = new aw.i
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f10166w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L5b
        L2a:
            r6 = move-exception
            goto L60
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            androidx.camera.core.Camera r7 = r5.u
            if (r7 == 0) goto L79
            androidx.camera.core.CameraInfo r2 = r7.getCameraInfo()
            boolean r2 = r2.hasFlashUnit()
            if (r2 == 0) goto L46
            goto L47
        L46:
            r7 = r4
        L47:
            if (r7 == 0) goto L79
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            af3.f r2 = new af3.f     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r7, r6, r4, r3)     // Catch: java.lang.Throwable -> L2a
            r0.f10166w = r3     // Catch: java.lang.Throwable -> L2a
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = skm.h2.b(r6, r2, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L5b
            return r1
        L5b:
            java.lang.Void r7 = (java.lang.Void) r7     // Catch: java.lang.Throwable -> L2a
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            goto L66
        L60:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r6)
        L66:
            java.lang.Throwable r6 = yhm.m.a(r7)
            if (r6 == 0) goto L79
            boolean r7 = r6 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r7 != 0) goto L79
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r6, r7)
        L79:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.k.j(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // xv.c
    public final void k() {
        Camera camera = this.u;
        if (camera == null || !camera.getCameraInfo().hasFlashUnit()) {
            return;
        }
        camera.getCameraControl().enableTorch(this.f10188s.getValue() == xv.a.OFF);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xv.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof aw.g
            if (r0 == 0) goto L13
            r0 = r6
            aw.g r0 = (aw.g) r0
            int r1 = r0.f10160x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10160x = r1
            goto L1a
        L13:
            aw.g r0 = new aw.g
            gim.c r6 = (gim.c) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f10160x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.u
            yhm.o.b(r6)
            return r0
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            yhm.o.b(r6)
            goto L48
        L3a:
            yhm.o.b(r6)
            r0.f10160x = r4
            gw.u r6 = r5.f10184n
            java.io.Serializable r6 = r6.c(r0)
            if (r6 != r1) goto L48
            goto L55
        L48:
            r2 = r6
            iw.a r2 = (iw.a) r2
            r0.u = r6
            r0.f10160x = r3
            java.lang.Object r0 = r5.q(r4, r0)
            if (r0 != r1) goto L56
        L55:
            return r1
        L56:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.k.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(androidx.camera.core.CameraSelector r5, androidx.camera.core.UseCaseGroup r6, gim.c r7) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r7 instanceof aw.c
            if (r0 == 0) goto L13
            r0 = r7
            aw.c r0 = (aw.c) r0
            int r1 = r0.f10142y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10142y = r1
            goto L18
        L13:
            aw.c r0 = new aw.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f10140w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f10142y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.camera.core.UseCaseGroup r6 = r0.v
            androidx.camera.core.CameraSelector r5 = r0.u
            yhm.o.b(r7)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            r0.u = r5
            r0.v = r6
            r0.f10142y = r3
            aw.l r7 = r4.f10177b
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            androidx.camera.lifecycle.ProcessCameraProvider r7 = (androidx.camera.lifecycle.ProcessCameraProvider) r7
            androidx.lifecycle.LifecycleOwner r0 = r4.f10176a     // Catch: java.lang.Exception -> L4e
            androidx.camera.core.Camera r5 = r7.bindToLifecycle(r0, r5, r6)     // Catch: java.lang.Exception -> L4e
            return r5
        L4e:
            r5 = move-exception
            boolean r6 = n(r5)
            if (r6 == 0) goto L7f
            com.revolut.camerakit.core.errors.UnsupportedCameraInitException r6 = new com.revolut.camerakit.core.errors.UnsupportedCameraInitException
            yw.b r7 = yw.b.COMBINED
            yw.h r0 = r4.f10178c
            yw.a r0 = r0.d()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Device does not support camera mode = "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = ", lens="
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            ax.a r0 = r4.f10179g
            java.util.Map r0 = r0.a()
            r6.<init>(r7, r5, r0)
            throw r6
        L7f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.k.m(androidx.camera.core.CameraSelector, androidx.camera.core.UseCaseGroup, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x020b, code lost:
    
        if (r13.f10187r.emit(r14, r0) != r1) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[PHI: r2 r14 r15
      0x0086: PHI (r2v8 yw.b) = (r2v6 yw.b), (r2v14 yw.b) binds: [B:43:0x00b6, B:32:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r14v12 androidx.camera.core.CameraSelector) = (r14v10 androidx.camera.core.CameraSelector), (r14v15 androidx.camera.core.CameraSelector) binds: [B:43:0x00b6, B:32:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r15v10 java.lang.Object) = (r15v9 java.lang.Object), (r15v1 java.lang.Object) binds: [B:43:0x00b6, B:32:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2 A[Catch: Exception -> 0x00c5, TryCatch #2 {Exception -> 0x00c5, blocks: (B:79:0x01ad, B:81:0x01b1, B:83:0x01b7, B:85:0x01bd, B:86:0x01cf, B:54:0x00db, B:45:0x00ba, B:47:0x00c2, B:51:0x00ca, B:38:0x0096), top: B:101:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[Catch: Exception -> 0x00c5, TryCatch #2 {Exception -> 0x00c5, blocks: (B:79:0x01ad, B:81:0x01b1, B:83:0x01b7, B:85:0x01bd, B:86:0x01cf, B:54:0x00db, B:45:0x00ba, B:47:0x00c2, B:51:0x00ca, B:38:0x0096), top: B:101:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182 A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #3 {Exception -> 0x0072, blocks: (B:24:0x006d, B:58:0x0103, B:62:0x0127, B:64:0x0149, B:65:0x0154, B:71:0x017c, B:72:0x0181, B:73:0x0182), top: B:102:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1 A[Catch: Exception -> 0x00c5, TryCatch #2 {Exception -> 0x00c5, blocks: (B:79:0x01ad, B:81:0x01b1, B:83:0x01b7, B:85:0x01bd, B:86:0x01cf, B:54:0x00db, B:45:0x00ba, B:47:0x00c2, B:51:0x00ca, B:38:0x0096), top: B:101:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e0  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Enum, yw.b] */
    /* JADX WARN: Type inference failed for: r11v6, types: [yw.b] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [yw.b] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(yw.b r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.k.o(yw.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(3:12|48|49)(2:13|14))(1:15))(3:16|(0)|47)|19|50|20|24|(1:26)(1:27)|28|(1:30)(7:31|(1:33)|34|(1:36)|37|(1:44)(1:43)|45)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        r5 = yhm.m.INSTANCE;
        r2 = yhm.o.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
    
        if (r11.f10187r.emit(r2, r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(androidx.camera.core.CameraSelector r12, gim.c r13) throws android.hardware.camera2.CameraAccessException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.k.p(androidx.camera.core.CameraSelector, gim.c):java.lang.Object");
    }

    public final Object q(boolean z, gim.c cVar) {
        if (this.f10189t.get() || z) {
            Object objO = o(this.f10178c.e(), cVar);
            return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
        }
        Unit unitI = i(dw.a.NONE);
        return unitI == fim.a.COROUTINE_SUSPENDED ? unitI : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (r7.f10187r.emit(r2, r0) != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(gim.c r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.k.r(gim.c):java.lang.Object");
    }

    @Override // xv.c
    public final Unit stopVideoRecording() throws Throwable {
        Recording recording;
        c0 c0Var = (c0) this.e.f.get();
        if (c0Var != null && (recording = c0Var.f10145c) != null) {
            recording.stop();
        }
        return Unit.f186387a;
    }
}
