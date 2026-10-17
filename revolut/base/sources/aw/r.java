package aw;

import androidx.camera.core.Camera;
import androidx.camera.video.Recording;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.z1;
import zhm.r0;

/* JADX INFO: loaded from: classes16.dex */
public final class r implements xv.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f10198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f10199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yw.h f10200c;
    public final bw.n d;
    public final j0 e;
    public final u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f10201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ax.a f10202h;
    public final ww.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vw.p f10203j;
    public final z1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j2 f10204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f10205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Camera f10206n;

    public r(LifecycleOwner lifecycleOwner, l cameraProcessProvider, yw.h settings, bw.n imageCapturer, j0 videoCapture, u imageAnalysis, w preview, ax.a cameraCharacteristicsProvider, ww.b cameraPerformanceTracker, vw.p videoPayloadFactory) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraProcessProvider, "cameraProcessProvider");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(imageCapturer, "imageCapturer");
        Intrinsics.checkNotNullParameter(videoCapture, "videoCapture");
        Intrinsics.checkNotNullParameter(imageAnalysis, "imageAnalysis");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(cameraCharacteristicsProvider, "cameraCharacteristicsProvider");
        Intrinsics.checkNotNullParameter(cameraPerformanceTracker, "cameraPerformanceTracker");
        Intrinsics.checkNotNullParameter(videoPayloadFactory, "videoPayloadFactory");
        this.f10198a = lifecycleOwner;
        this.f10199b = cameraProcessProvider;
        this.f10200c = settings;
        this.d = imageCapturer;
        this.e = videoCapture;
        this.f = imageAnalysis;
        this.f10201g = preview;
        this.f10202h = cameraCharacteristicsProvider;
        this.i = cameraPerformanceTracker;
        this.f10203j = videoPayloadFactory;
        this.k = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        this.f10204l = vkm.q.c(xv.a.DISABLED);
        this.f10205m = new AtomicBoolean(false);
        c8g.a.f(preview.f10215a, new aqe.a(this, 18));
    }

    @Override // xv.c
    public final j2 a() {
        return this.f10204l;
    }

    @Override // xv.c
    public final Object b(lv.a aVar) {
        return s.f10207a;
    }

    @Override // xv.c
    public final Object c(lv.a aVar) {
        return new iw.a(r0.g(), zhm.f0.f322471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xv.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r9, yw.n r11, com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings r12, kotlin.coroutines.Continuation r13) throws java.io.IOException {
        /*
            r8 = this;
            boolean r9 = r13 instanceof aw.p
            if (r9 == 0) goto L13
            r9 = r13
            aw.p r9 = (aw.p) r9
            int r10 = r9.f10196w
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r10 & r11
            if (r12 == 0) goto L13
            int r10 = r10 - r11
            r9.f10196w = r10
            goto L1a
        L13:
            aw.p r9 = new aw.p
            gim.c r13 = (gim.c) r13
            r9.<init>(r8, r13)
        L1a:
            java.lang.Object r10 = r9.u
            fim.a r11 = fim.a.COROUTINE_SUSPENDED
            int r12 = r9.f10196w
            r13 = 1
            if (r12 == 0) goto L31
            if (r12 != r13) goto L29
            yhm.o.b(r10)
            goto L49
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            yw.h r10 = r8.f10200c
            yw.b r10 = r10.e()
            yw.b r12 = yw.b.PICTURE
            if (r10 == r12) goto La5
            r9.f10196w = r13
            r12 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = skm.k0.b(r12, r9)
            if (r9 != r11) goto L49
            return r11
        L49:
            aw.w r9 = r8.f10201g
            androidx.camera.view.PreviewView r9 = r9.f10215a
            android.content.Context r9 = r9.getContext()
            java.lang.String r10 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            java.io.File r10 = new java.io.File
            java.io.File r11 = r9.getCacheDir()
            java.lang.String r12 = "stub_video.mp4"
            r10.<init>(r11, r12)
            android.content.res.AssetManager r9 = r9.getAssets()
            java.io.InputStream r9 = r9.open(r12)
            java.lang.String r11 = "open(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r11)
            java.io.FileOutputStream r11 = new java.io.FileOutputStream
            r11.<init>(r10)
            r12 = 8192(0x2000, float:1.148E-41)
            byte[] r12 = new byte[r12]
        L77:
            int r13 = r9.read(r12)
            r0 = -1
            if (r13 == r0) goto L83
            r0 = 0
            r11.write(r12, r0, r13)
            goto L77
        L83:
            r9.close()
            r11.close()
            xv.b r1 = new xv.b
            vw.p r9 = r8.f10203j
            vw.e r2 = vw.p.a(r9, r10)
            r4 = 1
            r5 = 0
            r3 = 1
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r7)
            aw.a0 r9 = new aw.a0
            r9.<init>(r1)
            go.g r10 = new go.g
            r11 = 2
            r10.<init>(r9, r11)
            return r10
        La5:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.String r10 = "recordVideo in PICTURE mode is not supported"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.r.d(long, yw.n, com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // xv.c
    public final Object e(xv.l lVar, kv.k kVar) {
        return this.d.a(lVar, kVar);
    }

    @Override // xv.c
    public final z1 f() {
        return this.k;
    }

    @Override // xv.c
    public final Unit g() throws Throwable {
        Recording recording;
        c0 c0Var = (c0) this.e.f.get();
        if (c0Var != null && (recording = c0Var.f10145c) != null) {
            recording.stop();
        }
        return Unit.f186387a;
    }

    @Override // xv.c
    public final Object h(jv.m mVar) {
        if (this.f10205m.get()) {
            Object objN = n(this.f10200c.e(), mVar);
            return objN == fim.a.COROUTINE_SUSPENDED ? objN : Unit.f186387a;
        }
        dw.a aVar = dw.a.NONE;
        Unit unit = Unit.f186387a;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        return unit;
    }

    @Override // xv.c
    public final Unit i(dw.a aVar) {
        return Unit.f186387a;
    }

    @Override // xv.c
    public final Object j(boolean z, Continuation continuation) {
        return Unit.f186387a;
    }

    @Override // xv.c
    public final void k() {
        Camera camera = this.f10206n;
        if (camera == null || !camera.getCameraInfo().hasFlashUnit()) {
            return;
        }
        camera.getCameraControl().enableTorch(this.f10204l.getValue() == xv.a.OFF);
    }

    @Override // xv.c
    public final Object l(Continuation continuation) {
        iw.a aVar = s.f10207a;
        return s.f10208b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(3:12|33|34)(2:13|14))(1:15))(3:16|(0)|32)|19|37|20|24|(1:26)(1:27)|28|(1:30)(2:35|36)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r4 = yhm.m.INSTANCE;
        r2 = yhm.o.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r8.k.emit(r4, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof aw.n
            if (r0 == 0) goto L13
            r0 = r9
            aw.n r0 = (aw.n) r0
            int r1 = r0.f10192w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10192w = r1
            goto L18
        L13:
            aw.n r0 = new aw.n
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f10192w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto Lb6
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            yhm.o.b(r9)
            goto L45
        L37:
            yhm.o.b(r9)
            r0.f10192w = r4
            aw.l r9 = r8.f10199b
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L45
            goto Lb5
        L45:
            androidx.camera.lifecycle.ProcessCameraProvider r9 = (androidx.camera.lifecycle.ProcessCameraProvider) r9
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L59
            androidx.camera.core.CameraSelector r2 = androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "DEFAULT_BACK_CAMERA"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch: java.lang.Throwable -> L59
            boolean r2 = r9.hasCamera(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            goto L60
        L59:
            r2 = move-exception
            yhm.m$a r4 = yhm.m.INSTANCE
            yhm.n r2 = yhm.o.a(r2)
        L60:
            boolean r4 = r2 instanceof yhm.n
            if (r4 == 0) goto L66
            r4 = 0
            goto L67
        L66:
            r4 = r2
        L67:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            if (r4 != 0) goto Lb9
            com.revolut.camerakit.core.errors.CameraXInitException r4 = new com.revolut.camerakit.core.errors.CameraXInitException
            yw.h r5 = r8.f10200c
            androidx.camera.core.CameraSelector r5 = yv.d.a(r5)
            java.lang.Integer r5 = r5.getLensFacing()
            java.util.List r9 = r9.getAvailableCameraInfos()
            int r9 = r9.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "device has no camera available for lens="
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " (cameras.size="
            r6.append(r5)
            r6.append(r9)
            java.lang.String r9 = ")"
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            java.lang.Throwable r2 = yhm.m.a(r2)
            ax.a r5 = r8.f10202h
            java.util.Map r5 = r5.a()
            r4.<init>(r9, r2, r5)
            r0.f10192w = r3
            vkm.z1 r9 = r8.k
            java.lang.Object r9 = r9.emit(r4, r0)
            if (r9 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lb9:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.r.m(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a0, code lost:
    
        if (r12.k.emit(r14, r0) != r1) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e A[Catch: Exception -> 0x0072, PHI: r13
      0x009e: PHI (r13v11 ??) = (r13v42 ??), (r13v43 ??) binds: [B:42:0x009a, B:32:0x0079] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x0072, blocks: (B:69:0x014f, B:71:0x0154, B:73:0x015a, B:75:0x0160, B:76:0x0171, B:27:0x006e, B:47:0x00ab, B:32:0x0079, B:44:0x009e, B:35:0x007f, B:41:0x0092, B:38:0x0086), top: B:83:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab A[Catch: Exception -> 0x0072, PHI: r13
      0x00ab: PHI (r13v13 ??) = (r13v40 ??), (r13v41 ??) binds: [B:45:0x00a7, B:27:0x006e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {Exception -> 0x0072, blocks: (B:69:0x014f, B:71:0x0154, B:73:0x015a, B:75:0x0160, B:76:0x0171, B:27:0x006e, B:47:0x00ab, B:32:0x0079, B:44:0x009e, B:35:0x007f, B:41:0x0092, B:38:0x0086), top: B:83:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121 A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #1 {Exception -> 0x0069, blocks: (B:22:0x0065, B:51:0x00c5, B:55:0x00eb, B:61:0x011b, B:62:0x0120, B:63:0x0121), top: B:84:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154 A[Catch: Exception -> 0x0072, TryCatch #2 {Exception -> 0x0072, blocks: (B:69:0x014f, B:71:0x0154, B:73:0x015a, B:75:0x0160, B:76:0x0171, B:27:0x006e, B:47:0x00ab, B:32:0x0079, B:44:0x009e, B:35:0x007f, B:41:0x0092, B:38:0x0086), top: B:83:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Enum, yw.b] */
    /* JADX WARN: Type inference failed for: r11v5, types: [yw.b] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r13v0, types: [yw.b] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11, types: [yw.b] */
    /* JADX WARN: Type inference failed for: r13v13, types: [yw.b] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v9, types: [yw.b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(yw.b r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.r.n(yw.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r7.k.emit(r2, r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof aw.q
            if (r0 == 0) goto L13
            r0 = r8
            aw.q r0 = (aw.q) r0
            int r1 = r0.f10197w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10197w = r1
            goto L18
        L13:
            aw.q r0 = new aw.q
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f10197w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto Lb7
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L37
            goto L47
        L37:
            r8 = move-exception
            goto L8d
        L39:
            yhm.o.b(r8)
            aw.l r8 = r7.f10199b     // Catch: java.lang.Exception -> L37
            r0.f10197w = r4     // Catch: java.lang.Exception -> L37
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Exception -> L37
            if (r8 != r1) goto L47
            goto Lb6
        L47:
            androidx.camera.lifecycle.ProcessCameraProvider r8 = (androidx.camera.lifecycle.ProcessCameraProvider) r8     // Catch: java.lang.Exception -> L37
            r8.unbindAll()     // Catch: java.lang.Exception -> L37
            r8 = 0
            r7.f10206n = r8     // Catch: java.lang.Exception -> L37
            vkm.j2 r2 = r7.f10204l     // Catch: java.lang.Exception -> L37
        L51:
            java.lang.Object r5 = r2.getValue()     // Catch: java.lang.Exception -> L37
            r6 = r5
            xv.a r6 = (xv.a) r6     // Catch: java.lang.Exception -> L37
            xv.a r6 = xv.a.DISABLED     // Catch: java.lang.Exception -> L37
            boolean r5 = r2.h(r5, r6)     // Catch: java.lang.Exception -> L37
            if (r5 == 0) goto L51
            aw.w r2 = r7.f10201g     // Catch: java.lang.Exception -> L37
            r2.getClass()     // Catch: java.lang.Exception -> L37
            aw.u r2 = r7.f     // Catch: java.lang.Exception -> L37
            androidx.camera.core.ImageAnalysis r5 = r2.f     // Catch: java.lang.Exception -> L37
            if (r5 == 0) goto L6e
            r5.clearAnalyzer()     // Catch: java.lang.Exception -> L37
        L6e:
            r2.f = r8     // Catch: java.lang.Exception -> L37
            aw.j0 r2 = r7.e     // Catch: java.lang.Exception -> L37
            r2.f10175h = r8     // Catch: java.lang.Exception -> L37
            java.util.concurrent.atomic.AtomicReference r2 = r2.f     // Catch: java.lang.Exception -> L37
            java.lang.Object r2 = r2.getAndSet(r8)     // Catch: java.lang.Exception -> L37
            aw.c0 r2 = (aw.c0) r2     // Catch: java.lang.Exception -> L37
            if (r2 == 0) goto Lb7
            r2.d = r4     // Catch: java.lang.Exception -> L37
            androidx.camera.video.Recording r4 = r2.f10145c     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L87
            r4.stop()     // Catch: java.lang.Exception -> L37
        L87:
            r2.f10145c = r8     // Catch: java.lang.Exception -> L37
            r2.a()     // Catch: java.lang.Exception -> L37
            goto Lb7
        L8d:
            com.revolut.camerakit.core.errors.CameraXException r2 = new com.revolut.camerakit.core.errors.CameraXException
            yw.h r4 = r7.f10200c
            yw.b r4 = r4.e()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to reset camera with mode = "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            ax.a r5 = r7.f10202h
            java.util.Map r5 = r5.a()
            r2.<init>(r4, r8, r5)
            r0.f10197w = r3
            vkm.z1 r8 = r7.k
            java.lang.Object r8 = r8.emit(r2, r0)
            if (r8 != r1) goto Lb7
        Lb6:
            return r1
        Lb7:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.r.o(gim.c):java.lang.Object");
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
