package com.fourthline.vision.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.view.Surface;
import com.fourthline.vision.internal.w;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraManager f36832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f36833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f36834c;
    private String d;
    private CameraDevice e;
    private r6 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j0 f36835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f36836h;
    private MeteringRectangle i;

    public static final class a implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f36838b;

        public a(b bVar) {
            this.f36838b = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Throwable) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Throwable th10) {
            s.this.f36832a.unregisterAvailabilityCallback(this.f36838b);
        }
    }

    public static final class b extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f36840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f36841c;

        public b(String str, s sVar, CancellableContinuation cancellableContinuation) {
            this.f36839a = str;
            this.f36840b = sVar;
            this.f36841c = cancellableContinuation;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            this.f36840b.f36832a.unregisterAvailabilityCallback(this);
            if (this.f36841c.d()) {
                CancellableContinuation cancellableContinuation = this.f36841c;
                m.Companion companion = yhm.m.INSTANCE;
                cancellableContinuation.resumeWith(Boolean.TRUE);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            if (Intrinsics.f(id10, this.f36839a)) {
                this.f36840b.f36832a.unregisterAvailabilityCallback(this);
                CancellableContinuation cancellableContinuation = this.f36841c;
                m.Companion companion = yhm.m.INSTANCE;
                cancellableContinuation.resumeWith(Boolean.TRUE);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            if (Intrinsics.f(id10, this.f36839a)) {
                this.f36840b.f36832a.unregisterAvailabilityCallback(this);
                CancellableContinuation cancellableContinuation = this.f36841c;
                m.Companion companion = yhm.m.INSTANCE;
                cancellableContinuation.resumeWith(Boolean.FALSE);
            }
        }
    }

    public static final class c extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f36842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CameraDevice f36843b;

        public c(Continuation<? super CameraCaptureSession> continuation, CameraDevice cameraDevice) {
            this.f36842a = continuation;
            this.f36843b = cameraDevice;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            w.b bVar = new w.b("Camera " + this.f36843b.getId() + " session configuration failed");
            Continuation continuation = this.f36842a;
            m.Companion companion = yhm.m.INSTANCE;
            continuation.resumeWith(yhm.o.a(bVar));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            Continuation continuation = this.f36842a;
            m.Companion companion = yhm.m.INSTANCE;
            continuation.resumeWith(session);
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36846c;
        int d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f36847g;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.e = obj2;
            this.f36847g |= Integer.MIN_VALUE;
            return s.this.initializeCamera$fourthline_vision_release(null, this);
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36849b;
        final /* synthetic */ List d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<? extends Surface> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.d = list;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return s.this.new e(this.d, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        
            if (r2 == r1) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws android.hardware.camera2.CameraAccessException {
            /*
                Method dump skipped, instruction units count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.s.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super l0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class f extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f36852b;

        public f(String str, CancellableContinuation cancellableContinuation) {
            this.f36851a = str;
            this.f36852b = cancellableContinuation;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            w.a aVar = new w.a("Camera " + this.f36851a + " is closed");
            if (this.f36852b.d()) {
                CancellableContinuation cancellableContinuation = this.f36852b;
                m.Companion companion = yhm.m.INSTANCE;
                cancellableContinuation.resumeWith(yhm.o.a(aVar));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            if (this.f36852b.d()) {
                CancellableContinuation cancellableContinuation = this.f36852b;
                m.Companion companion = yhm.m.INSTANCE;
                cancellableContinuation.resumeWith(yhm.o.a(new w.a(null, 1, null)));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice device, int i) {
            Intrinsics.checkNotNullParameter(device, "device");
            String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "Fatal (service)" : "Fatal (device)" : "Device policy" : "Maximum cameras in use" : "Camera in use";
            w.a aVar = new w.a("Camera " + this.f36851a + " error: (" + i + ") " + str);
            if (this.f36852b.d()) {
                CancellableContinuation cancellableContinuation = this.f36852b;
                m.Companion companion = yhm.m.INSTANCE;
                cancellableContinuation.resumeWith(yhm.o.a(aVar));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            CancellableContinuation cancellableContinuation = this.f36852b;
            m.Companion companion = yhm.m.INSTANCE;
            cancellableContinuation.resumeWith(device);
        }
    }

    public static final class g extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36854b;
        int d;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36854b = obj2;
            this.d |= Integer.MIN_VALUE;
            return s.this.waitCameraCanOpen(null, this);
        }
    }

    public s(@NotNull CameraManager cameraManager, @NotNull Handler cameraHandler, @NotNull b0 cameraInfoProvider) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(cameraHandler, "cameraHandler");
        Intrinsics.checkNotNullParameter(cameraInfoProvider, "cameraInfoProvider");
        this.f36832a = cameraManager;
        this.f36833b = cameraHandler;
        this.f36834c = cameraInfoProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object canOpen(String str, Continuation<? super Boolean> frame) {
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        b bVar = new b(str, this, lVar);
        lVar.r(new a(bVar));
        this.f36832a.registerAvailabilityCallback(bVar, this.f36833b);
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createCaptureSession(CameraDevice cameraDevice, List<? extends Surface> list, Continuation<? super CameraCaptureSession> frame) throws CameraAccessException {
        eim.c cVar = new eim.c(fim.h.b(frame));
        cameraDevice.createCaptureSession(list, new c(cVar, cameraDevice), this.f36833b);
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object openCamera(CameraManager cameraManager, String str, Continuation<? super CameraDevice> frame) throws CameraAccessException {
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        cameraManager.openCamera(str, new f(str, lVar), this.f36833b);
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[PHI: r8 r9
      0x0049: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v6 java.lang.String) binds: [B:18:0x0046, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r9v3 java.lang.Object) = (r9v2 java.lang.Object), (r9v1 java.lang.Object) binds: [B:18:0x0046, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005b -> B:17:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitCameraCanOpen(java.lang.String r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.fourthline.vision.internal.s.g
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.vision.internal.s$g r0 = (com.fourthline.vision.internal.s.g) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.vision.internal.s$g r0 = new com.fourthline.vision.internal.s$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f36854b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L2a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.f36853a
            java.lang.String r8 = (java.lang.String) r8
        L2a:
            yhm.o.b(r9)
            goto L3e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.f36853a
            java.lang.String r8 = (java.lang.String) r8
            yhm.o.b(r9)
            goto L49
        L3e:
            r0.f36853a = r8
            r0.d = r4
            java.lang.Object r9 = r7.canOpen(r8, r0)
            if (r9 != r1) goto L49
            goto L5d
        L49:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5e
            r0.f36853a = r8
            r0.d = r3
            r5 = 50
            java.lang.Object r9 = skm.k0.b(r5, r0)
            if (r9 != r1) goto L3e
        L5d:
            return r1
        L5e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.s.waitCameraCanOpen(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void changeFocusArea$fourthline_vision_release(@NotNull Rect focusArea, @NotNull Rect cameraPreviewRect) {
        Intrinsics.checkNotNullParameter(focusArea, "focusArea");
        Intrinsics.checkNotNullParameter(cameraPreviewRect, "cameraPreviewRect");
        if (s.class.isAnonymousClass()) {
            String name = s.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        Objects.toString(focusArea);
        Objects.toString(cameraPreviewRect);
        if (focusArea.isEmpty() || cameraPreviewRect.isEmpty() || this.f36835g == null || this.f36836h == null) {
            return;
        }
        r6 r6Var = this.f;
        if (r6Var == null) {
            Intrinsics.r("focusingAreaCalculator");
            throw null;
        }
        MeteringRectangle meteringRectangleCalculateFocusArea = r6Var.calculateFocusArea(focusArea, cameraPreviewRect, this.f36834c.getOrientationHint());
        if (s.class.isAnonymousClass()) {
            String name2 = s.class.getName();
            if (name2.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        }
        Objects.toString(meteringRectangleCalculateFocusArea);
        if (meteringRectangleCalculateFocusArea == null || meteringRectangleCalculateFocusArea.equals((Object) this.i)) {
            return;
        }
        this.i = meteringRectangleCalculateFocusArea;
        j0 j0Var = this.f36835g;
        if (j0Var == null) {
            Intrinsics.r("cameraCaptureSession");
            throw null;
        }
        String str = this.d;
        if (str == null) {
            Intrinsics.r("cameraId");
            throw null;
        }
        List<? extends Surface> list = this.f36836h;
        if (list != null) {
            j0Var.setup$fourthline_vision_release(str, list, meteringRectangleCalculateFocusArea);
        } else {
            Intrinsics.r("targets");
            throw null;
        }
    }

    public final void closeCamera$fourthline_vision_release() {
        CameraDevice cameraDevice = this.e;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initializeCamera$fourthline_vision_release(@org.jetbrains.annotations.NotNull java.util.List<? extends android.view.Surface> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<com.fourthline.vision.internal.l0>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.vision.internal.s.d
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.vision.internal.s$d r0 = (com.fourthline.vision.internal.s.d) r0
            int r1 = r0.f36847g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36847g = r1
            goto L18
        L13:
            com.fourthline.vision.internal.s$d r0 = new com.fourthline.vision.internal.s$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.e
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f36847g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f36845b
            com.fourthline.core.internal.Try$Companion r6 = (com.fourthline.core.internal.Try.Companion) r6
            java.lang.Object r6 = r0.f36844a
            java.util.List r6 = (java.util.List) r6
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L2f:
            r6 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            yhm.o.b(r7)
            com.fourthline.core.internal.Try$Companion r7 = com.fourthline.core.internal.Try.INSTANCE
            r5.f36836h = r6     // Catch: java.lang.Throwable -> L2f
            com.fourthline.vision.internal.b0 r7 = r5.f36834c     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r7.getCameraId()     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L6e
            r5.d = r7     // Catch: java.lang.Throwable -> L2f
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2f
            tkm.e r7 = zkm.o.f323119a     // Catch: java.lang.Throwable -> L2f
            com.fourthline.vision.internal.s$e r2 = new com.fourthline.vision.internal.s$e     // Catch: java.lang.Throwable -> L2f
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L2f
            r0.f36844a = r4     // Catch: java.lang.Throwable -> L2f
            r0.f36845b = r4     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            r0.f36846c = r6     // Catch: java.lang.Throwable -> L2f
            r0.d = r6     // Catch: java.lang.Throwable -> L2f
            r0.f36847g = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L66
            return r1
        L66:
            com.fourthline.vision.internal.l0 r7 = (com.fourthline.vision.internal.l0) r7     // Catch: java.lang.Throwable -> L2f
            com.fourthline.core.internal.Try$Success r6 = new com.fourthline.core.internal.Try$Success     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            return r6
        L6e:
            com.fourthline.vision.internal.w$d r6 = com.fourthline.vision.internal.w.d.f37038a     // Catch: java.lang.Throwable -> L2f
            throw r6     // Catch: java.lang.Throwable -> L2f
        L71:
            boolean r7 = r6 instanceof java.lang.VirtualMachineError
            if (r7 != 0) goto L87
            boolean r7 = r6 instanceof java.lang.ThreadDeath
            if (r7 != 0) goto L87
            boolean r7 = r6 instanceof java.lang.InterruptedException
            if (r7 != 0) goto L87
            boolean r7 = r6 instanceof java.lang.LinkageError
            if (r7 != 0) goto L87
            com.fourthline.core.internal.Try$Failure r7 = new com.fourthline.core.internal.Try$Failure
            r7.<init>(r6)
            return r7
        L87:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.s.initializeCamera$fourthline_vision_release(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
