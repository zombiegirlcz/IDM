package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class f7 extends l implements a7, CoroutineScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f36178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f36179c;
    private final z6 d;
    private final uc e;
    private final SelfieScannerStep f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Job f36180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36181h;
    private boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f36182j;
    private Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Long f36183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f36185n;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36186a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return f7.this.new a(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36186a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f36186a = 1;
                if (skm.k0.b(5000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            f7.this.f36181h = true;
            if (!f7.this.d.isProcessing()) {
                f7.this.handleStepCompleted();
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public f7(@NotNull u cameraEngine, @NotNull z6 handAnalyzer, @NotNull uc stepFlowRepository, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(handAnalyzer, "handAnalyzer");
        Intrinsics.checkNotNullParameter(stepFlowRepository, "stepFlowRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36178b = coroutineScope;
        this.f36179c = cameraEngine;
        this.d = handAnalyzer;
        this.e = stepFlowRepository;
        this.f = SelfieScannerStep.HAND_MOVEMENT;
        this.f36182j = System.currentTimeMillis();
    }

    private final void handleHandVisibilityDuration(d7 d7Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l2 = this.k;
        Long l3 = this.f36183l;
        if (!d7Var.getDetected()) {
            if (l3 == null || jCurrentTimeMillis - l3.longValue() <= 350) {
                return;
            }
            trackDetectionState(false);
            this.k = null;
            this.f36183l = null;
            return;
        }
        if (l2 == null) {
            this.k = Long.valueOf(jCurrentTimeMillis);
            trackDetectionState(true);
            return;
        }
        if (this.f36181h) {
            return;
        }
        this.f36183l = Long.valueOf(jCurrentTimeMillis);
        Long l4 = this.k;
        Intrinsics.h(l4);
        if (jCurrentTimeMillis - l4.longValue() >= 2000) {
            this.i = true;
            this.f36181h = true;
            Job job2 = this.f36180g;
            if (job2 != null) {
                job2.f(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStepCompleted() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.e.setLastFoundFaceTimestamp(jCurrentTimeMillis);
        Map<String, ? extends Object> mapK = zhm.r0.k(new Pair("detection_success", Boolean.valueOf(this.i)), new Pair("elapsed_time", Long.valueOf(jCurrentTimeMillis - this.f36182j)), new Pair("fps", Float.valueOf(this.f36185n)));
        sf callback = getCallback();
        if (callback != null) {
            callback.onComplete(this, zc.f37200a, mapK);
        }
    }

    private final void resetAutoContinueTimer() {
        this.f36181h = false;
        Job job2 = this.f36180g;
        if (job2 != null) {
            job2.f(null);
        }
        this.f36180g = skm.e0.C(this, null, null, new a(null), 3);
    }

    private final void trackDetectionState(boolean z) {
        pf pfVar = new pf(bd.getStepType(getPublicStep()), z);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(pfVar);
        }
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        if (this.d.isProcessing() || this.f36181h) {
            image.close();
        } else {
            this.d.analyze(image);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f36178b.getF74819h();
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // com.fourthline.vision.internal.a7
    public void onHandDetectionResult(d7 d7Var) {
        if (d7Var != null) {
            this.f36184m++;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f36182j;
            if (jCurrentTimeMillis > 0) {
                this.f36185n = (this.f36184m * 1000.0f) / jCurrentTimeMillis;
            }
            q boundingBox = d7Var.getBoundingBox();
            if (boundingBox != null) {
                od cameraResolution = this.f36179c.getCoordinates().getCameraResolution();
                this.e.setRecognizedBounds((fa) this.f36179c.getCoordinates().getBoundingBoxToScreen().invoke(new fa((int) (boundingBox.getLeft() * cameraResolution.getWidth()), (int) (boundingBox.getTop() * cameraResolution.getHeight()), (int) (boundingBox.getRight() * cameraResolution.getWidth()), (int) (boundingBox.getBottom() * cameraResolution.getHeight()))));
            }
            handleHandVisibilityDuration(d7Var);
        }
        if (this.f36181h) {
            handleStepCompleted();
        }
    }

    @Override // com.fourthline.vision.internal.a7
    public void onModelsMissing() {
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    public void start() {
        this.f36182j = System.currentTimeMillis();
        this.i = false;
        this.f36181h = false;
        this.f36184m = 0;
        this.f36185n = BitmapDescriptorFactory.HUE_RED;
        this.d.start();
        this.d.setCallback(this);
        resetAutoContinueTimer();
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    public void stop() {
        this.d.setCallback(null);
        this.d.stop();
        Job job2 = this.f36180g;
        if (job2 != null) {
            job2.f(null);
        }
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    @NotNull
    public SelfieScannerStep getPublicStep() {
        return this.f;
    }
}
