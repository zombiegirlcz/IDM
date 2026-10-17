package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.core.ResolutionInfo;
import androidx.camera.core.ViewPort;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.LifecycleOwner;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.vision.internal.p0;
import com.fourthline.vision.internal.r0;
import com.google.common.util.concurrent.ListenableFuture;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class p0 implements u, CoroutineScope {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f36647q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CameraSelector f36649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineScope f36650c;
    private final v d;
    private ProcessCameraProvider e;
    private final ExecutorService f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f36651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Size f36652h;
    private Preview i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ImageCapture f36653j;
    private ImageAnalysis k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VideoCapture f36654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Recording f36656n;
    private boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageAnalysis.Analyzer f36657p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36659b;
        final /* synthetic */ PreviewView d;
        final /* synthetic */ LifecycleOwner e;
        final /* synthetic */ Function1 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PreviewView previewView, LifecycleOwner lifecycleOwner, Function1<? super l0, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = previewView;
            this.e = lifecycleOwner;
            this.f = function1;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return p0.this.new b(this.d, this.e, this.f, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            p0 p0Var;
            l0 l0Var;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36659b;
            if (i == 0) {
                yhm.o.b(obj2);
                p0 p0Var2 = p0.this;
                ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.INSTANCE.getInstance(p0Var2.f36648a);
                this.f36658a = p0Var2;
                this.f36659b = 1;
                Object objAwait = ListenableFutureKt.await(companion, this);
                if (objAwait == aVar) {
                    return aVar;
                }
                p0Var = p0Var2;
                obj2 = objAwait;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p0Var = (p0) this.f36658a;
                yhm.o.b(obj2);
            }
            p0Var.e = (ProcessCameraProvider) obj2;
            p0 p0Var3 = p0.this;
            ViewPort viewPort = this.d.getViewPort();
            p0Var3.initializeCameraProvider(viewPort != null ? viewPort.getRotation() : 0, new Size(this.d.getWidth(), this.d.getHeight()));
            ProcessCameraProvider processCameraProvider = p0.this.e;
            if (processCameraProvider != null) {
                processCameraProvider.unbindAll();
            }
            Preview preview = p0.this.i;
            if (preview != null) {
                preview.setSurfaceProvider(this.d.getSurfaceProvider());
            }
            try {
                ProcessCameraProvider processCameraProvider2 = p0.this.e;
                Camera cameraBindToLifecycle = processCameraProvider2 != null ? processCameraProvider2.bindToLifecycle(this.e, p0.this.f36649b, p0.this.i, p0.this.f36653j, p0.this.k, p0.this.f36654l) : null;
                if (cameraBindToLifecycle != null) {
                    p0 p0Var4 = p0.this;
                    try {
                        String cameraId = Camera2CameraInfo.from(cameraBindToLifecycle.getCameraInfo()).getCameraId();
                        Intrinsics.checkNotNullExpressionValue(cameraId, "getCameraId(...)");
                        ImageAnalysis imageAnalysis = p0Var4.k;
                        ResolutionInfo resolutionInfo = imageAnalysis != null ? imageAnalysis.getResolutionInfo() : null;
                        Size resolution = resolutionInfo != null ? resolutionInfo.getResolution() : null;
                        l0Var = new l0(cameraId, resolution != null ? resolution.getWidth() : 640, resolution != null ? resolution.getHeight() : DefaultFrameSampler.DESIRED_FRAME_WIDTH, null);
                    } catch (Exception unused) {
                        l0Var = null;
                    }
                    this.f.invoke(l0Var);
                } else {
                    l0Var = null;
                    this.f.invoke(l0Var);
                }
            } catch (Exception unused2) {
                this.f.invoke(null);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class c implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f36661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final od f36662b = new od(DefaultFrameSampler.DESIRED_FRAME_WIDTH, 640);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f36663c;
        private final Function1 d;

        public c(final p0 p0Var) {
            final int i = 0;
            this.f36663c = new Function1() { // from class: com.fourthline.vision.internal.hh
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            return p0.c.boundingBoxToScreen$lambda$0(p0Var, this, (fa) obj2);
                        default:
                            return p0.c.screenToBoundingBox$lambda$1(p0Var, this, (fa) obj2);
                    }
                }
            };
            final int i2 = 1;
            this.d = new Function1() { // from class: com.fourthline.vision.internal.hh
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            return p0.c.boundingBoxToScreen$lambda$0(p0Var, this, (fa) obj2);
                        default:
                            return p0.c.screenToBoundingBox$lambda$1(p0Var, this, (fa) obj2);
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fa boundingBoxToScreen$lambda$0(p0 p0Var, c cVar, fa box) {
            Intrinsics.checkNotNullParameter(box, "box");
            return b2.translateTargetToScreen(box, new od(p0Var.f36652h.getWidth(), p0Var.f36652h.getHeight()), cVar.getCameraResolution(), 0, Intrinsics.f(p0Var.f36649b, CameraSelector.DEFAULT_FRONT_CAMERA));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fa screenToBoundingBox$lambda$1(p0 p0Var, c cVar, fa box) {
            Intrinsics.checkNotNullParameter(box, "box");
            return b2.translateScreenToTarget$default(box, new od(p0Var.f36652h.getWidth(), p0Var.f36652h.getHeight()), cVar.getCameraResolution(), 0, false, 16, (Object) null);
        }

        @Override // com.fourthline.vision.internal.v
        public int getAnalyzerTargetCoordinateSystem() {
            return this.f36661a;
        }

        @Override // com.fourthline.vision.internal.v
        public Function1<fa, fa> getBoundingBoxToScreen() {
            return this.f36663c;
        }

        @Override // com.fourthline.vision.internal.v
        public od getCameraResolution() {
            return this.f36662b;
        }

        @Override // com.fourthline.vision.internal.v
        public Function1<fa, fa> getScreenToBoundingBox() {
            return this.d;
        }
    }

    public static final class d implements ke {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ukm.u f36664a = vc.s.a(Integer.MAX_VALUE, null, null, 6);

        public static final class a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f36666a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0 f36668c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r0 r0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f36668c = r0Var;
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                return d.this.new a(this.f36668c, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f36666a;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ukm.u uVar = d.this.f36664a;
                    r0 r0Var = this.f36668c;
                    this.f36666a = 1;
                    if (uVar.send(r0Var, this) == aVar) {
                        return aVar;
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
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public static final class b extends gim.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f36669a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f36671c;

            public b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                this.f36669a = obj2;
                this.f36671c |= Integer.MIN_VALUE;
                return d.this.stop(this);
            }
        }

        public d() {
        }

        public final void sendResult(r0 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            skm.e0.C(p0.this.f36650c, null, null, new a(result, null), 3);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.fourthline.vision.internal.ke
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object stop(kotlin.coroutines.Continuation<? super android.net.Uri> r5) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r5 instanceof com.fourthline.vision.internal.p0.d.b
                if (r0 == 0) goto L13
                r0 = r5
                com.fourthline.vision.internal.p0$d$b r0 = (com.fourthline.vision.internal.p0.d.b) r0
                int r1 = r0.f36671c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36671c = r1
                goto L18
            L13:
                com.fourthline.vision.internal.p0$d$b r0 = new com.fourthline.vision.internal.p0$d$b
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f36669a
                fim.a r1 = fim.a.COROUTINE_SUSPENDED
                int r2 = r0.f36671c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                yhm.o.b(r5)
                goto L42
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L2f:
                yhm.o.b(r5)
                com.fourthline.vision.internal.p0 r5 = com.fourthline.vision.internal.p0.this
                com.fourthline.vision.internal.p0.access$stopRecording(r5)
                ukm.u r5 = r4.f36664a
                r0.f36671c = r3
                java.lang.Object r5 = r5.j(r0)
                if (r5 != r1) goto L42
                return r1
            L42:
                com.fourthline.vision.internal.r0 r5 = (com.fourthline.vision.internal.r0) r5
                boolean r0 = r5 instanceof com.fourthline.vision.internal.r0.a
                if (r0 != 0) goto L63
                boolean r0 = r5 instanceof com.fourthline.vision.internal.r0.b
                if (r0 == 0) goto L5d
                com.fourthline.vision.internal.r0$b r5 = (com.fourthline.vision.internal.r0.b) r5
                android.net.Uri r5 = r5.getSavedUri()
                if (r5 == 0) goto L55
                return r5
            L55:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "No URI returned"
                r5.<init>(r0)
                throw r5
            L5d:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L63:
                com.fourthline.vision.internal.ke$a r0 = new com.fourthline.vision.internal.ke$a
                com.fourthline.vision.internal.r0$a r5 = (com.fourthline.vision.internal.r0.a) r5
                java.lang.Throwable r5 = r5.getThrowable()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.p0.d.stop(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36674c;
        final /* synthetic */ ImageCapture d;
        final /* synthetic */ p0 e;

        public static final class a extends ImageCapture.OnImageCapturedCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Continuation f36675a;

            public a(Continuation<? super o> continuation) {
                this.f36675a = continuation;
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy imageProxy) {
                Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
                try {
                    Bitmap bitmap = imageProxy.toBitmap();
                    imageProxy.close();
                    Intrinsics.checkNotNullExpressionValue(bitmap, "apply(...)");
                    Bitmap bitmapRotate = rotate(bitmap, imageProxy.getImageInfo().getRotationDegrees());
                    Continuation continuation = this.f36675a;
                    m.Companion companion = yhm.m.INSTANCE;
                    continuation.resumeWith(new o(bitmapRotate, 0));
                } catch (Exception e) {
                    imageProxy.close();
                    Continuation continuation2 = this.f36675a;
                    m.Companion companion2 = yhm.m.INSTANCE;
                    continuation2.resumeWith(yhm.o.a(e));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                Continuation continuation = this.f36675a;
                m.Companion companion = yhm.m.INSTANCE;
                continuation.resumeWith(yhm.o.a(exception));
            }

            public final Bitmap rotate(Bitmap bitmap, int i) {
                Intrinsics.checkNotNullParameter(bitmap, "<this>");
                if (i == 0) {
                    return bitmap;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(i);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                return bitmapCreateBitmap;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ImageCapture imageCapture, p0 p0Var, Continuation<? super e> continuation) {
            super(2, continuation);
            this.d = imageCapture;
            this.e = p0Var;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new e(this.d, this.e, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36674c;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                return obj2;
            }
            yhm.o.b(obj2);
            ImageCapture imageCapture = this.d;
            p0 p0Var = this.e;
            this.f36672a = imageCapture;
            this.f36673b = p0Var;
            this.f36674c = 1;
            eim.c cVar = new eim.c(fim.h.b(this));
            imageCapture.lambda$takePicture$1(p0Var.f36651g, new a(cVar));
            Object objB = cVar.b();
            if (objB == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            return objB == aVar ? aVar : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public p0(@NotNull Context context, @NotNull CameraSelector cameraSelector, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36648a = context;
        this.f36649b = cameraSelector;
        this.f36650c = coroutineScope;
        this.d = new c(this);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f = executorServiceNewSingleThreadExecutor;
        Executor mainExecutor = ContextCompat.getMainExecutor(context);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(...)");
        this.f36651g = mainExecutor;
        this.f36652h = new Size(0, 0);
        this.f36655m = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeCameraProvider(int i, Size size) {
        try {
            ProcessCameraProvider processCameraProvider = this.e;
            if (processCameraProvider != null) {
                processCameraProvider.unbindAll();
            }
            this.i = new Preview.Builder().build();
            this.f36653j = new ImageCapture.Builder().setCaptureMode(1).build();
            ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setBackpressureStrategy(0).setOutputImageFormat(1).setResolutionSelector(new ResolutionSelector.Builder().setResolutionStrategy(new ResolutionStrategy(new Size(640, DefaultFrameSampler.DESIRED_FRAME_WIDTH), 1)).build()).setTargetRotation(i).build();
            imageAnalysisBuild.setAnalyzer(this.f, new og(this));
            this.k = imageAnalysisBuild;
            Recorder.Builder executor = new Recorder.Builder().setExecutor(this.f36651g);
            if (getVideoRecordingBitrate() != -1) {
                executor.setTargetVideoEncodingBitRate(getVideoRecordingBitrate());
            }
            Recorder recorderBuild = executor.build();
            Intrinsics.checkNotNullExpressionValue(recorderBuild, "build(...)");
            this.f36654l = VideoCapture.withOutput(recorderBuild);
            this.f36652h = size;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeCameraProvider$lambda$0$0(p0 p0Var, ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        ImageAnalysis.Analyzer analyzer = p0Var.f36657p;
        if (analyzer != null) {
            analyzer.analyze(imageProxy);
        } else {
            imageProxy.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordVideo$lambda$1(d dVar, r0 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        dVar.sendResult(result);
        return Unit.f186387a;
    }

    private final void startRecording(VideoCapture<Recorder> videoCapture, FileOutputOptions fileOutputOptions, final Function1<? super r0, Unit> function1) {
        if (this.o) {
            return;
        }
        this.o = true;
        this.f36656n = ((Recorder) videoCapture.getOutput()).prepareRecording(this.f36648a, fileOutputOptions).start(this.f36651g, new Consumer() { // from class: com.fourthline.vision.internal.gh
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj2) {
                p0.startRecording$lambda$0(this.f36288a, function1, (VideoRecordEvent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecording$lambda$0(p0 p0Var, Function1 function1, VideoRecordEvent recordEvent) {
        Intrinsics.checkNotNullParameter(recordEvent, "recordEvent");
        if (!(recordEvent instanceof VideoRecordEvent.Start) && (recordEvent instanceof VideoRecordEvent.Finalize)) {
            p0Var.o = false;
            VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) recordEvent;
            function1.invoke(!finalize.hasError() ? new r0.b(finalize.getOutputResults().getOutputUri()) : new r0.a(finalize.getCause()));
            p0Var.f36656n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopRecording() throws Throwable {
        if (this.o) {
            Recording recording = this.f36656n;
            if (recording != null) {
                recording.stop();
            }
            this.f36656n = null;
            this.o = false;
        }
    }

    @Override // com.fourthline.vision.internal.u
    public void bindToPreview(@NotNull PreviewView previewView, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super l0, Unit> onCameraReady) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onCameraReady, "onCameraReady");
        skm.e0.C(this, null, null, new b(previewView, lifecycleOwner, onCameraReady, null), 3);
    }

    @Override // com.fourthline.vision.internal.u
    @NotNull
    public v getCoordinates() {
        return this.d;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f36650c.getF74819h();
    }

    @Override // com.fourthline.vision.internal.u
    public int getVideoRecordingBitrate() {
        return this.f36655m;
    }

    @Override // com.fourthline.vision.internal.u
    @NotNull
    public ke recordVideo() throws IOException {
        File file = new File(new File(ContextExtensionsKt.getFourthlineDirectory(this.f36648a)), "video_" + UUID.randomUUID() + ".mp4");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        file.createNewFile();
        FileOutputOptions fileOutputOptionsBuild = new FileOutputOptions.Builder(file).build();
        Intrinsics.checkNotNullExpressionValue(fileOutputOptionsBuild, "build(...)");
        VideoCapture<Recorder> videoCapture = this.f36654l;
        if (videoCapture == null) {
            throw new IllegalStateException("VideoCapture not ready");
        }
        d dVar = new d();
        startRecording(videoCapture, fileOutputOptionsBuild, new eg(dVar, 6));
        return dVar;
    }

    @Override // com.fourthline.vision.internal.u
    public void setAnalyzer(ImageAnalysis.Analyzer analyzer) {
        this.f36657p = analyzer;
    }

    @Override // com.fourthline.vision.internal.u
    public void setVideoRecordingBitrate(int i) {
        this.f36655m = i;
    }

    @Override // com.fourthline.vision.internal.u
    public Object takePicture(@NotNull Continuation<? super o> continuation) {
        ImageCapture imageCapture = this.f36653j;
        if (imageCapture == null) {
            throw new IllegalStateException("ImageCapture not ready");
        }
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(zkm.o.f323119a, new e(imageCapture, this, null), continuation);
    }
}
