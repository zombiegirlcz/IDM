package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerConfigKt;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mc extends l implements g6, CoroutineScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SelfieScannerConfig f36566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f36567c;
    private final u7 d;
    private final Function0 e;
    private final f6 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final uc f36568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CoroutineScope f36569h;
    private final SelfieScannerStep i;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36571b;
        final /* synthetic */ fa d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fa faVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = faVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return mc.this.new a(this.d, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        
            if (r8.onStartVideoRecordingRequired(r1, r4, r7) != r0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:7:0x0010, B:34:0x0093, B:36:0x009b, B:11:0x001d, B:27:0x0070, B:29:0x007c, B:31:0x0084, B:14:0x0025, B:20:0x0043, B:22:0x0059, B:24:0x0061, B:17:0x002c), top: B:43:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: Exception -> 0x00a6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a6, blocks: (B:7:0x0010, B:34:0x0093, B:36:0x009b, B:11:0x001d, B:27:0x0070, B:29:0x007c, B:31:0x0084, B:14:0x0025, B:20:0x0043, B:22:0x0059, B:24:0x0061, B:17:0x002c), top: B:43:0x0008 }] */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r7.f36571b
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L29
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                yhm.o.b(r8)     // Catch: java.lang.Exception -> La6
                goto L93
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                yhm.o.b(r8)     // Catch: java.lang.Exception -> La6
                goto L70
            L21:
                java.lang.Object r1 = r7.f36570a
                com.fourthline.vision.internal.uc r1 = (com.fourthline.vision.internal.uc) r1
                yhm.o.b(r8)     // Catch: java.lang.Exception -> La6
                goto L43
            L29:
                yhm.o.b(r8)
                com.fourthline.vision.internal.mc r8 = com.fourthline.vision.internal.mc.this     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.internal.uc r1 = com.fourthline.vision.internal.mc.access$getStepFlowRepository$p(r8)     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.internal.mc r8 = com.fourthline.vision.internal.mc.this     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.internal.u r8 = com.fourthline.vision.internal.mc.access$getCameraEngine$p(r8)     // Catch: java.lang.Exception -> La6
                r7.f36570a = r1     // Catch: java.lang.Exception -> La6
                r7.f36571b = r5     // Catch: java.lang.Exception -> La6
                java.lang.Object r8 = r8.takePicture(r7)     // Catch: java.lang.Exception -> La6
                if (r8 != r0) goto L43
                goto L92
            L43:
                com.fourthline.vision.internal.fa r5 = r7.d     // Catch: java.lang.Exception -> La6
                kotlin.Pair r6 = new kotlin.Pair     // Catch: java.lang.Exception -> La6
                r6.<init>(r8, r5)     // Catch: java.lang.Exception -> La6
                r1.setLatestFullBitmap(r6)     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.internal.mc r8 = com.fourthline.vision.internal.mc.this     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.selfie.SelfieScannerConfig r8 = com.fourthline.vision.internal.mc.access$getConfig$p(r8)     // Catch: java.lang.Exception -> La6
                boolean r8 = com.fourthline.vision.selfie.SelfieScannerConfigKt.isPassiveLivenessAnalysisEnabled(r8)     // Catch: java.lang.Exception -> La6
                if (r8 == 0) goto L70
                com.fourthline.vision.internal.mc r8 = com.fourthline.vision.internal.mc.this     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.internal.sf r8 = r8.getCallback()     // Catch: java.lang.Exception -> La6
                if (r8 == 0) goto L70
                com.fourthline.vision.internal.mc r1 = com.fourthline.vision.internal.mc.this     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.internal.me r5 = com.fourthline.vision.internal.me.f36579b     // Catch: java.lang.Exception -> La6
                r7.f36570a = r2     // Catch: java.lang.Exception -> La6
                r7.f36571b = r4     // Catch: java.lang.Exception -> La6
                java.lang.Object r8 = r8.onStopVideoRecordingRequired(r1, r5, r7)     // Catch: java.lang.Exception -> La6
                if (r8 != r0) goto L70
                goto L92
            L70:
                com.fourthline.vision.internal.mc r8 = com.fourthline.vision.internal.mc.this     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.selfie.SelfieScannerConfig r8 = com.fourthline.vision.internal.mc.access$getConfig$p(r8)     // Catch: java.lang.Exception -> La6
                boolean r8 = com.fourthline.vision.selfie.SelfieScannerConfigKt.isBioAuthEnabled(r8)     // Catch: java.lang.Exception -> La6
                if (r8 != 0) goto L93
                com.fourthline.vision.internal.mc r8 = com.fourthline.vision.internal.mc.this     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.internal.sf r8 = r8.getCallback()     // Catch: java.lang.Exception -> La6
                if (r8 == 0) goto L93
                com.fourthline.vision.internal.mc r1 = com.fourthline.vision.internal.mc.this     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.internal.me r4 = com.fourthline.vision.internal.me.f36580c     // Catch: java.lang.Exception -> La6
                r7.f36570a = r2     // Catch: java.lang.Exception -> La6
                r7.f36571b = r3     // Catch: java.lang.Exception -> La6
                java.lang.Object r8 = r8.onStartVideoRecordingRequired(r1, r4, r7)     // Catch: java.lang.Exception -> La6
                if (r8 != r0) goto L93
            L92:
                return r0
            L93:
                com.fourthline.vision.internal.mc r8 = com.fourthline.vision.internal.mc.this     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.internal.sf r0 = r8.getCallback()     // Catch: java.lang.Exception -> La6
                if (r0 == 0) goto Lba
                com.fourthline.vision.internal.mc r1 = com.fourthline.vision.internal.mc.this     // Catch: java.lang.Exception -> La6
                com.fourthline.vision.internal.zc r2 = com.fourthline.vision.internal.zc.f37200a     // Catch: java.lang.Exception -> La6
                r4 = 4
                r5 = 0
                r3 = 0
                com.fourthline.vision.internal.sf.onComplete$default(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> La6
                goto Lba
            La6:
                com.fourthline.vision.internal.mc r8 = com.fourthline.vision.internal.mc.this
                com.fourthline.vision.internal.sf r8 = r8.getCallback()
                if (r8 == 0) goto Lba
                com.fourthline.vision.internal.mc r0 = com.fourthline.vision.internal.mc.this
                com.fourthline.vision.selfie.compose.SelfieScannerEvent$OnFail r1 = new com.fourthline.vision.selfie.compose.SelfieScannerEvent$OnFail
                com.fourthline.vision.selfie.SelfieScannerError r2 = com.fourthline.vision.selfie.SelfieScannerError.UNKNOWN
                r1.<init>(r2)
                r8.onEvent(r0, r1)
            Lba:
                kotlin.Unit r8 = kotlin.Unit.f186387a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.mc.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36573a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return mc.this.new b(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36573a;
            if (i == 0) {
                yhm.o.b(obj2);
                sf callback = mc.this.getCallback();
                if (callback != null) {
                    mc mcVar = mc.this;
                    me meVar = me.f36580c;
                    this.f36573a = 1;
                    if (callback.onStartVideoRecordingRequired(mcVar, meVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36575a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return mc.this.new c(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36575a;
            if (i == 0) {
                yhm.o.b(obj2);
                sf callback = mc.this.getCallback();
                if (callback != null) {
                    mc mcVar = mc.this;
                    me meVar = me.f36579b;
                    this.f36575a = 1;
                    if (callback.onStartVideoRecordingRequired(mcVar, meVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public mc(@NotNull SelfieScannerConfig config, @NotNull u cameraEngine, @NotNull u7 isSteadyProvider, @NotNull Function0<Rect> detectionAreaProvider, @NotNull f6 faceAnalyzer, @NotNull uc stepFlowRepository, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(isSteadyProvider, "isSteadyProvider");
        Intrinsics.checkNotNullParameter(detectionAreaProvider, "detectionAreaProvider");
        Intrinsics.checkNotNullParameter(faceAnalyzer, "faceAnalyzer");
        Intrinsics.checkNotNullParameter(stepFlowRepository, "stepFlowRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36566b = config;
        this.f36567c = cameraEngine;
        this.d = isSteadyProvider;
        this.e = detectionAreaProvider;
        this.f = faceAnalyzer;
        this.f36568g = stepFlowRepository;
        this.f36569h = coroutineScope;
        this.i = SelfieScannerStep.SELFIE;
    }

    private final void handleDetectedFace(mh.a aVar, fa faVar) {
        ArrayList arrayList = new ArrayList();
        if (!this.d.isSteady()) {
            arrayList.add(SelfieScannerWarning.DEVICE_NOT_STEADY);
        }
        if (aVar.f205336g > 6.0f) {
            arrayList.add(SelfieScannerWarning.FACE_YAW_TOO_BIG);
        }
        if (!RectHelper_androidKt.toAndroidRect((Rect) this.e.invoke()).contains(ga.toRect(faVar))) {
            arrayList.add(SelfieScannerWarning.FACE_NOT_IN_FRAME);
        }
        if (!arrayList.isEmpty()) {
            handleEvent((SelfieScannerEvent) new SelfieScannerEvent.OnWarnings(arrayList));
            return;
        }
        sf callback = getCallback();
        if (callback != null) {
            callback.onProcessingResult(this);
        }
        skm.e0.C(this, null, null, new a(faVar, null), 3);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f.analyze(image);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f36569h.getF74819h();
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // com.fourthline.vision.internal.g6
    public void onFacesDetection(@NotNull List<? extends mh.a> faces) {
        Intrinsics.checkNotNullParameter(faces, "faces");
        if (faces.size() > 1) {
            handleError(SelfieScannerError.MULTIPLE_FACES_DETECTED);
            return;
        }
        if (faces.isEmpty()) {
            handleEvent((SelfieScannerEvent) new SelfieScannerEvent.OnWarnings(zhm.u.c(SelfieScannerWarning.FACE_NOT_DETECTED)));
            return;
        }
        mh.a aVar = faces.get(0);
        Function1<fa, fa> boundingBoxToScreen = this.f36567c.getCoordinates().getBoundingBoxToScreen();
        android.graphics.Rect rect = aVar.f205333a;
        Intrinsics.checkNotNullExpressionValue(rect, "getBoundingBox(...)");
        fa faVar = (fa) boundingBoxToScreen.invoke(ga.toRectangle(rect));
        this.f36568g.setRecognizedBounds(faVar);
        this.f36568g.setLastFoundFaceTimestamp(System.currentTimeMillis());
        handleDetectedFace(aVar, faVar);
    }

    @Override // com.fourthline.vision.internal.g6
    public void onModelsMissing() {
        handleError(SelfieScannerError.RECOGNITION_MODELS_NOT_DOWNLOADED);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    public void start() {
        this.f.setCallback(this);
        this.d.start();
        if (SelfieScannerConfigKt.isBioAuthEnabled(this.f36566b)) {
            skm.e0.C(this, null, null, new b(null), 3);
        } else if (SelfieScannerConfigKt.isPassiveLivenessAnalysisEnabled(this.f36566b)) {
            skm.e0.C(this, null, null, new c(null), 3);
        }
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    public void stop() {
        this.f.setCallback(null);
        this.d.stop();
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    @NotNull
    public SelfieScannerStep getPublicStep() {
        return this.i;
    }
}
