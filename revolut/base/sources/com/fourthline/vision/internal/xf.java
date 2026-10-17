package com.fourthline.vision.internal;

import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.util.Size;
import android.view.Surface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.internal.z;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class xf extends ViewModel implements z.a, ja, pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zf f37112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k7 f37113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final df f37114c;
    private final ja d;
    private final x e;
    private final la f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c9 f37115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Function1 f37116h;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37117a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f37119c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SurfaceTexture surfaceTexture, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37119c = surfaceTexture;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return xf.this.new a(this.f37119c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Function1 function1;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f37117a;
            if (i == 0) {
                yhm.o.b(obj2);
                xf.this.f37113b.start();
                zf zfVar = xf.this.f37112a;
                List<? extends Surface> listK = zhm.v.k(new Surface(this.f37119c), xf.this.f37113b.getSurface());
                this.f37117a = 1;
                obj2 = zfVar.start(listK, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            Try r56 = (Try) obj2;
            xf xfVar = xf.this;
            if (r56 instanceof Try.Failure) {
                xfVar.d.getScannerCallback().onScannerResult(TryKt.failure(((Try.Failure) r56).getException()));
            } else {
                if (!(r56 instanceof Try.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                l0 l0Var = (l0) ((Try.Success) r56).getValue();
                if (xfVar.f.getShouldStartAutomatically()) {
                    xfVar.d.start();
                }
                if (l0Var != null && (function1 = xfVar.f37116h) != null) {
                    function1.invoke(l0Var);
                }
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public xf(@NotNull zf imageProducer, @NotNull k7 imageDataSource, @NotNull df visionInfoProvider, @NotNull ja scanner, @NotNull x cameraFocusManager, @NotNull la scannerConfig, @NotNull c9 detector, Function1<? super l0, Unit> function1) {
        Intrinsics.checkNotNullParameter(imageProducer, "imageProducer");
        Intrinsics.checkNotNullParameter(imageDataSource, "imageDataSource");
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        Intrinsics.checkNotNullParameter(scanner, "scanner");
        Intrinsics.checkNotNullParameter(cameraFocusManager, "cameraFocusManager");
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.f37112a = imageProducer;
        this.f37113b = imageDataSource;
        this.f37114c = visionInfoProvider;
        this.d = scanner;
        this.e = cameraFocusManager;
        this.f = scannerConfig;
        this.f37115g = detector;
        this.f37116h = function1;
    }

    @Override // com.fourthline.vision.internal.ja
    public o8 getMediaRecorderManager() {
        return this.d.getMediaRecorderManager();
    }

    @Override // com.fourthline.vision.internal.ja
    @NotNull
    public ka getScannerCallback() {
        return this.d.getScannerCallback();
    }

    @Override // com.fourthline.vision.internal.ja
    public sd getStepConfig() {
        return this.d.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.ja
    public int getStepsCount() {
        return this.d.getStepsCount();
    }

    @Override // com.fourthline.vision.internal.ja
    public boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // com.fourthline.vision.internal.ja
    public void moveToNextStep() {
        this.d.moveToNextStep();
    }

    @Override // com.fourthline.vision.internal.z.a
    public void onSurfaceCreated(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (xf.class.isAnonymousClass()) {
            String name = xf.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        Objects.toString(surface);
        Size previewSize = this.f37114c.getPreviewSize();
        surface.setDefaultBufferSize(previewSize.getWidth(), previewSize.getHeight());
        skm.e0.C(ViewModelKt.getViewModelScope(this), null, null, new a(surface, null), 3);
    }

    @Override // com.fourthline.vision.internal.z.a
    public void onSurfaceDestroyed() {
    }

    @Override // com.fourthline.vision.internal.ja
    public void resetCurrentStep() {
        this.d.resetCurrentStep();
    }

    @Override // com.fourthline.vision.internal.ja
    public void resetScanner() {
        this.d.resetScanner();
    }

    @Override // com.fourthline.vision.internal.ja, com.fourthline.vision.internal.pd
    public void start() {
        this.d.start();
    }

    @Override // com.fourthline.vision.internal.ja, com.fourthline.vision.internal.pd
    public void stop() {
        boolean zIsTerminated;
        if (xf.class.isAnonymousClass()) {
            String name = xf.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        this.d.stop();
        this.f37112a.stop();
        this.f37113b.stop();
        this.e.stop();
        AutoCloseable autoCloseable = this.f37115g;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else {
                if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.fourthline.vision.internal.ja
    public void takeSnapshot() {
        this.d.takeSnapshot();
    }

    public /* synthetic */ xf(zf zfVar, k7 k7Var, df dfVar, ja jaVar, x xVar, la laVar, c9 c9Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(zfVar, k7Var, dfVar, jaVar, xVar, laVar, c9Var, (i & 128) != 0 ? null : function1);
    }
}
