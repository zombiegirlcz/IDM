package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerDataSource;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepMetadata;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import com.fourthline.vision.internal.da;
import com.google.mlkit.vision.text.Text;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class f5 extends j implements w2, CoroutineScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DocumentScannerStep f36159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentScannerConfig f36160c;
    private final da.a d;
    private final u e;
    private final u7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function0 f36161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Function0 f36162h;
    private final TimestampProvider i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LocationProvider f36163j;
    private final v2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q5 f36164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CoroutineScope f36165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e5 f36166n;

    public static final class a implements DocumentScannerDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f36167a;

        public a() {
            this.f36167a = f5.this.f36160c.getShouldStartAutomatically();
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public DocumentScannerConfig getConfig() {
            return f5.this.f36160c;
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public Rect getDocumentDetectionArea() {
            return RectHelper_androidKt.toAndroidRect((androidx.compose.ui.geometry.Rect) f5.this.f36162h.invoke());
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public boolean getShouldStartAutomatically() {
            return this.f36167a;
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36169a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return f5.this.new b(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36169a;
            if (i == 0) {
                yhm.o.b(obj2);
                sf callback = f5.this.getCallback();
                if (callback != null) {
                    f5 f5Var = f5.this;
                    me meVar = me.f36578a;
                    this.f36169a = 1;
                    if (callback.onStartVideoRecordingRequired(f5Var, meVar, this) == aVar) {
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
        int f36171a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return f5.this.new c(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36171a;
            if (i == 0) {
                yhm.o.b(obj2);
                sf callback = f5.this.getCallback();
                if (callback != null) {
                    f5 f5Var = f5.this;
                    me meVar = me.f36578a;
                    this.f36171a = 1;
                    if (callback.onStartVideoRecordingRequired(f5Var, meVar, this) == aVar) {
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

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36173a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return f5.this.new d(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36173a;
            try {
                if (i == 0) {
                    yhm.o.b(obj2);
                    u uVar = f5.this.e;
                    this.f36173a = 1;
                    obj2 = uVar.takePicture(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                o oVar = (o) obj2;
                c6 c6Var = new c6(new DocumentScannerStepResult(new ScannerImage(oVar.getBitmap(), y2.cropBitmap(oVar.getBitmap(), b2.translateScreenToTarget(ga.toRectangle(RectHelper_androidKt.toAndroidRect((androidx.compose.ui.geometry.Rect) f5.this.f36162h.invoke())), (od) f5.this.f36161g.invoke(), new od(oVar.getBitmap().getWidth(), oVar.getBitmap().getHeight()), oVar.getRotationDegrees(), true), oVar.getRotationDegrees())), new DocumentScannerStepMetadata(f5.this.i.getCurrentTime(), f5.this.f36163j.getLocation(), f5.this.getPublicStep().getFileSide(), f5.this.getPublicStep().isAngled()), zhm.h0.f322473a));
                f5.this.f36164l.addStepResult(f5.this, c6Var);
                sf callback = f5.this.getCallback();
                if (callback != null) {
                    sf.onComplete$default(callback, f5.this, c6Var, null, 4, null);
                }
                return Unit.f186387a;
            } catch (ImageCaptureException unused) {
                f5.this.handleError(DocumentScannerError.CAMERA_NOT_AVAILABLE);
                return Unit.f186387a;
            } catch (Exception unused2) {
                f5.this.handleEvent((DocumentScannerEvent) new DocumentScannerEvent.OnStepFail(DocumentScannerStepError.TAKE_SNAPSHOT_NOT_ALLOWED));
                return Unit.f186387a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public f5(@NotNull DocumentScannerStep publicStep, @NotNull DocumentScannerConfig config, @NotNull da.a recordingPlan, @NotNull u cameraEngine, @NotNull u7 isSteadyProvider, @NotNull Function0<od> screenSizeProvider, @NotNull Function0<androidx.compose.ui.geometry.Rect> detectionAreaProvider, @NotNull TimestampProvider timestampProvider, @NotNull LocationProvider locationProvider, @NotNull v2 documentAnalyzer, @NotNull q5 stepFlowRepository, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(publicStep, "publicStep");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(recordingPlan, "recordingPlan");
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(isSteadyProvider, "isSteadyProvider");
        Intrinsics.checkNotNullParameter(screenSizeProvider, "screenSizeProvider");
        Intrinsics.checkNotNullParameter(detectionAreaProvider, "detectionAreaProvider");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(documentAnalyzer, "documentAnalyzer");
        Intrinsics.checkNotNullParameter(stepFlowRepository, "stepFlowRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36159b = publicStep;
        this.f36160c = config;
        this.d = recordingPlan;
        this.e = cameraEngine;
        this.f = isSteadyProvider;
        this.f36161g = screenSizeProvider;
        this.f36162h = detectionAreaProvider;
        this.i = timestampProvider;
        this.f36163j = locationProvider;
        this.k = documentAnalyzer;
        this.f36164l = stepFlowRepository;
        this.f36165m = coroutineScope;
        this.f36166n = new e5(config, cameraEngine, new g3(new a()), stepFlowRepository, isSteadyProvider, new eg(this, 3), coroutineScope, new og(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mrzDetectionHandler$lambda$0(f5 f5Var, DocumentScannerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f5Var.handleEvent(event);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mrzDetectionHandler$lambda$1(f5 f5Var, d5 mrzCandidate) {
        Intrinsics.checkNotNullParameter(mrzCandidate, "mrzCandidate");
        f5Var.f36164l.addMrzResult(f5Var, mrzCandidate);
    }

    @Override // com.fourthline.vision.internal.j, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.k.analyze(image);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f36165m.getF74819h();
    }

    @Override // com.fourthline.vision.internal.j, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    @Override // com.fourthline.vision.internal.j, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // com.fourthline.vision.internal.w2
    public void onBarcodeDetected(@NotNull List<? extends fh.a> barcodes) {
        Intrinsics.checkNotNullParameter(barcodes, "barcodes");
        Objects.toString(barcodes);
        this.f36166n.handleDetectedBarcodes(this, barcodes);
    }

    @Override // com.fourthline.vision.internal.w2
    public void onTextDetected(@NotNull Text text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String str = text.f49675b;
        this.f36166n.handleDetectedText(this, text);
    }

    @Override // com.fourthline.vision.internal.j, com.fourthline.vision.internal.rf
    public void start() {
        this.k.setCallback(this);
        this.f.start();
        if (this.d.requiresRecordingOnStartStep(getPublicStep().getIndex())) {
            skm.e0.C(this, null, null, new b(null), 3);
        }
    }

    @Override // com.fourthline.vision.internal.j, com.fourthline.vision.internal.rf
    public void stop() {
        this.f36166n.cancel();
        this.k.setCallback(null);
        this.f.stop();
    }

    @Override // com.fourthline.vision.internal.j, com.fourthline.vision.internal.rf
    public void takePicture() {
        if (this.d.requiresRecordingOnTakePhoto(getPublicStep().getIndex())) {
            skm.e0.C(this, null, null, new c(null), 3);
        }
        skm.e0.C(this, null, null, new d(null), 3);
    }

    @Override // com.fourthline.vision.internal.j, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }

    @Override // com.fourthline.vision.internal.j, com.fourthline.vision.internal.rf
    @NotNull
    public DocumentScannerStep getPublicStep() {
        return this.f36159b;
    }
}
