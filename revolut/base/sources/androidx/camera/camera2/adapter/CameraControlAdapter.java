package androidx.camera.camera2.adapter;

import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.EvCompControl;
import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseCamera;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.impl.VideoUsageControl;
import androidx.camera.camera2.impl.ZoomControl;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import fim.a;
import gim.d;
import gim.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020/0)2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u00106\u001a\u000202H\u0016¢\u0006\u0004\b7\u00105J\u0017\u0010:\u001a\u00020 2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020 2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u0002080)2\u0006\u0010@\u001a\u000208H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020 2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020 H\u0016¢\u0006\u0004\bG\u0010$J;\u0010M\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010*0H0)2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H2\u0006\u0010K\u001a\u0002082\u0006\u0010L\u001a\u000208H\u0016¢\u0006\u0004\bM\u0010NJ%\u0010P\u001a\b\u0012\u0004\u0012\u00020O0)2\u0006\u0010K\u001a\u0002082\u0006\u0010L\u001a\u000208H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020 H\u0016¢\u0006\u0004\bR\u0010$J\u000f\u0010S\u001a\u00020 H\u0016¢\u0006\u0004\bS\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010TR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010XR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010YR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010[R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\\R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010`R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010aR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010b¨\u0006c"}, d2 = {"Landroidx/camera/camera2/adapter/CameraControlAdapter;", "Landroidx/camera/core/impl/CameraControlInternal;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/EvCompControl;", "evCompControl", "Landroidx/camera/camera2/impl/FlashControl;", "flashControl", "Landroidx/camera/camera2/impl/FocusMeteringControl;", "focusMeteringControl", "Landroidx/camera/camera2/impl/StillCaptureRequestControl;", "stillCaptureRequestControl", "Landroidx/camera/camera2/impl/TorchControl;", "torchControl", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "lowLightBoostControl", "Landroidx/camera/camera2/impl/ZoomControl;", "zoomControl", "Landroidx/camera/camera2/adapter/ZslControl;", "zslControl", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "camera2cameraControl", "Landroidx/camera/camera2/impl/UseCaseManager;", "useCaseManager", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/VideoUsageControl;", "videoUsageControl", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/EvCompControl;Landroidx/camera/camera2/impl/FlashControl;Landroidx/camera/camera2/impl/FocusMeteringControl;Landroidx/camera/camera2/impl/StillCaptureRequestControl;Landroidx/camera/camera2/impl/TorchControl;Landroidx/camera/camera2/impl/LowLightBoostControl;Landroidx/camera/camera2/impl/ZoomControl;Landroidx/camera/camera2/adapter/ZslControl;Landroidx/camera/camera2/interop/Camera2CameraControl;Landroidx/camera/camera2/impl/UseCaseManager;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/VideoUsageControl;)V", "Landroidx/camera/core/impl/Config;", "config", "", "addInteropConfig", "(Landroidx/camera/core/impl/Config;)V", "clearInteropConfig", "()V", "getInteropConfig", "()Landroidx/camera/core/impl/Config;", "", "torch", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "enableTorch", "(Z)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/FocusMeteringAction;", "action", "Landroidx/camera/core/FocusMeteringResult;", "startFocusAndMetering", "(Landroidx/camera/core/FocusMeteringAction;)Lcom/google/common/util/concurrent/ListenableFuture;", "", "ratio", "setZoomRatio", "(F)Lcom/google/common/util/concurrent/ListenableFuture;", "linearZoom", "setLinearZoom", "", "flashMode", "setFlashMode", "(I)V", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "screenFlash", "setScreenFlash", "(Landroidx/camera/core/ImageCapture$ScreenFlash;)V", "exposure", "setExposureCompensationIndex", "(I)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/impl/SessionConfig$Builder;", "sessionConfigBuilder", "addZslConfig", "(Landroidx/camera/core/impl/SessionConfig$Builder;)V", "clearZslConfig", "", "Landroidx/camera/core/impl/CaptureConfig;", "captureConfigs", "captureMode", "flashType", "submitStillCaptureRequests", "(Ljava/util/List;II)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "getCameraCapturePipelineAsync", "(II)Lcom/google/common/util/concurrent/ListenableFuture;", "incrementVideoUsage", "decrementVideoUsage", "Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/camera2/impl/EvCompControl;", "Landroidx/camera/camera2/impl/FlashControl;", "Landroidx/camera/camera2/impl/FocusMeteringControl;", "Landroidx/camera/camera2/impl/StillCaptureRequestControl;", "Landroidx/camera/camera2/impl/TorchControl;", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "Landroidx/camera/camera2/impl/ZoomControl;", "Landroidx/camera/camera2/adapter/ZslControl;", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "getCamera2cameraControl", "()Landroidx/camera/camera2/interop/Camera2CameraControl;", "Landroidx/camera/camera2/impl/UseCaseManager;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/impl/VideoUsageControl;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraControlAdapter implements CameraControlInternal {

    @NotNull
    private final Camera2CameraControl camera2cameraControl;

    @NotNull
    private final CameraProperties cameraProperties;

    @NotNull
    private final EvCompControl evCompControl;

    @NotNull
    private final FlashControl flashControl;

    @NotNull
    private final FocusMeteringControl focusMeteringControl;

    @NotNull
    private final LowLightBoostControl lowLightBoostControl;

    @NotNull
    private final StillCaptureRequestControl stillCaptureRequestControl;

    @NotNull
    private final UseCaseThreads threads;

    @NotNull
    private final TorchControl torchControl;

    @NotNull
    private final UseCaseManager useCaseManager;

    @NotNull
    private final VideoUsageControl videoUsageControl;

    @NotNull
    private final ZoomControl zoomControl;

    @NotNull
    private final ZslControl zslControl;

    public CameraControlAdapter(@NotNull CameraProperties cameraProperties, @NotNull EvCompControl evCompControl, @NotNull FlashControl flashControl, @NotNull FocusMeteringControl focusMeteringControl, @NotNull StillCaptureRequestControl stillCaptureRequestControl, @NotNull TorchControl torchControl, @NotNull LowLightBoostControl lowLightBoostControl, @NotNull ZoomControl zoomControl, @NotNull ZslControl zslControl, @NotNull Camera2CameraControl camera2cameraControl, @NotNull UseCaseManager useCaseManager, @NotNull UseCaseThreads threads, @NotNull VideoUsageControl videoUsageControl) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(evCompControl, "evCompControl");
        Intrinsics.checkNotNullParameter(flashControl, "flashControl");
        Intrinsics.checkNotNullParameter(focusMeteringControl, "focusMeteringControl");
        Intrinsics.checkNotNullParameter(stillCaptureRequestControl, "stillCaptureRequestControl");
        Intrinsics.checkNotNullParameter(torchControl, "torchControl");
        Intrinsics.checkNotNullParameter(lowLightBoostControl, "lowLightBoostControl");
        Intrinsics.checkNotNullParameter(zoomControl, "zoomControl");
        Intrinsics.checkNotNullParameter(zslControl, "zslControl");
        Intrinsics.checkNotNullParameter(camera2cameraControl, "camera2cameraControl");
        Intrinsics.checkNotNullParameter(useCaseManager, "useCaseManager");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(videoUsageControl, "videoUsageControl");
        this.cameraProperties = cameraProperties;
        this.evCompControl = evCompControl;
        this.flashControl = flashControl;
        this.focusMeteringControl = focusMeteringControl;
        this.stillCaptureRequestControl = stillCaptureRequestControl;
        this.torchControl = torchControl;
        this.lowLightBoostControl = lowLightBoostControl;
        this.zoomControl = zoomControl;
        this.zslControl = zslControl;
        this.camera2cameraControl = camera2cameraControl;
        this.useCaseManager = useCaseManager;
        this.threads = threads;
        this.videoUsageControl = videoUsageControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(@NotNull Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.camera2cameraControl.addCaptureRequestOptions(CaptureRequestOptions.Builder.INSTANCE.from(config).build());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(@NotNull SessionConfig.Builder sessionConfigBuilder) {
        Intrinsics.checkNotNullParameter(sessionConfigBuilder, "sessionConfigBuilder");
        this.zslControl.addZslConfig(sessionConfigBuilder);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.camera2cameraControl.clearCaptureRequestOptions();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearZslConfig() {
        this.zslControl.clearZslConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.videoUsageControl.decrementUsage();
    }

    @Override // androidx.camera.core.CameraControl
    @NotNull
    public ListenableFuture<Void> enableTorch(boolean torch) {
        Integer value;
        if (!CameraMetadata.INSTANCE.getSupportsLowLightBoost(this.cameraProperties.getMetadata()) || ((value = this.lowLightBoostControl.getLowLightBoostStateLiveData().getValue()) != null && value.intValue() == -1)) {
            ListenableFuture<Void> listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asVoidListenableFuture(TorchControl.setTorchAsync$default(this.torchControl, torch, false, false, 6, null)));
            Intrinsics.checkNotNullExpressionValue(listenableFutureNonCancellationPropagating, "nonCancellationPropagating(...)");
            return listenableFutureNonCancellationPropagating;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
        }
        ListenableFuture<Void> listenableFutureImmediateFailedFuture = Futures.immediateFailedFuture(new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"));
        Intrinsics.checkNotNullExpressionValue(listenableFutureImmediateFailedFuture, "immediateFailedFuture(...)");
        return listenableFutureImmediateFailedFuture;
    }

    @NotNull
    public final Camera2CameraControl getCamera2cameraControl() {
        return this.camera2cameraControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NotNull
    public ListenableFuture<CameraCapturePipeline> getCameraCapturePipelineAsync(final int captureMode, final int flashType) {
        final UseCaseCamera camera = this.useCaseManager.getCamera();
        if (camera == null) {
            ListenableFuture<CameraCapturePipeline> listenableFutureImmediateFailedFuture = Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
            Intrinsics.checkNotNullExpressionValue(listenableFutureImmediateFailedFuture, "immediateFailedFuture(...)");
            return listenableFutureImmediateFailedFuture;
        }
        final CoroutineScope sequentialScope = this.threads.getSequentialScope();
        ListenableFuture<CameraCapturePipeline> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1

            /* JADX INFO: renamed from: androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1$1, reason: invalid class name */
            @d(c = "androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1$1", f = "CameraControlAdapter.kt", l = {106, 104}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
            public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ UseCaseCamera $camera$inlined;
                final /* synthetic */ int $captureMode$inlined;
                final /* synthetic */ CallbackToFutureAdapter.Completer $completer;
                final /* synthetic */ int $flashType$inlined;
                int I$0;
                Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ CameraControlAdapter this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(CallbackToFutureAdapter.Completer completer, Continuation continuation, UseCaseCamera useCaseCamera, int i, CameraControlAdapter cameraControlAdapter, int i2) {
                    super(2, continuation);
                    this.$completer = completer;
                    this.$camera$inlined = useCaseCamera;
                    this.$captureMode$inlined = i;
                    this.this$0 = cameraControlAdapter;
                    this.$flashType$inlined = i2;
                }

                @Override // gim.a
                public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$completer, continuation, this.$camera$inlined, this.$captureMode$inlined, this.this$0, this.$flashType$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    CallbackToFutureAdapter.Completer completer;
                    UseCaseCamera useCaseCamera;
                    int i;
                    CallbackToFutureAdapter.Completer completer2;
                    a aVar = a.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        o.b(obj2);
                        CallbackToFutureAdapter.Completer completer3 = this.$completer;
                        UseCaseCamera useCaseCamera2 = this.$camera$inlined;
                        int i3 = this.$captureMode$inlined;
                        FlashControl flashControl = this.this$0.flashControl;
                        this.L$0 = completer3;
                        this.L$1 = useCaseCamera2;
                        this.I$0 = i3;
                        this.label = 1;
                        Object objAwaitFlashModeUpdate = flashControl.awaitFlashModeUpdate(this);
                        if (objAwaitFlashModeUpdate != aVar) {
                            completer = completer3;
                            obj2 = objAwaitFlashModeUpdate;
                            useCaseCamera = useCaseCamera2;
                            i = i3;
                        }
                        return aVar;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        CallbackToFutureAdapter.Completer completer4 = (CallbackToFutureAdapter.Completer) this.L$0;
                        o.b(obj2);
                        completer2 = completer4;
                        completer2.set(obj2);
                        return Unit.f186387a;
                    }
                    i = this.I$0;
                    useCaseCamera = (UseCaseCamera) this.L$1;
                    completer = (CallbackToFutureAdapter.Completer) this.L$0;
                    o.b(obj2);
                    int iIntValue = ((Number) obj2).intValue();
                    int i5 = this.$flashType$inlined;
                    this.L$0 = completer;
                    this.L$1 = null;
                    this.label = 2;
                    obj2 = useCaseCamera.getCameraCapturePipeline(i, iIntValue, i5, this);
                    if (obj2 != aVar) {
                        completer2 = completer;
                        completer2.set(obj2);
                        return Unit.f186387a;
                    }
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                }
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer<T> completer) {
                Intrinsics.checkNotNullParameter(completer, "completer");
                return e0.C(sequentialScope, null, null, new AnonymousClass1(completer, null, camera, captureMode, this, flashType), 3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NotNull
    public Config getInteropConfig() {
        return this.camera2cameraControl.getCaptureRequestOptions();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.videoUsageControl.incrementUsage();
    }

    @Override // androidx.camera.core.CameraControl
    @NotNull
    public ListenableFuture<Integer> setExposureCompensationIndex(int exposure) {
        ListenableFuture<Integer> listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asListenableFuture$default(EvCompControl.updateAsync$default(this.evCompControl, exposure, false, 2, null), (Object) null, 1, (Object) null));
        Intrinsics.checkNotNullExpressionValue(listenableFutureNonCancellationPropagating, "nonCancellationPropagating(...)");
        return listenableFutureNonCancellationPropagating;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int flashMode) {
        FlashControl.setFlashAsync$default(this.flashControl, flashMode, false, 2, null);
        this.zslControl.setZslDisabledByFlashMode(flashMode == 1 || flashMode == 0);
    }

    @Override // androidx.camera.core.CameraControl
    @NotNull
    public ListenableFuture<Void> setLinearZoom(float linearZoom) {
        return this.zoomControl.setLinearZoom(linearZoom);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        this.flashControl.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.CameraControl
    @NotNull
    public ListenableFuture<Void> setZoomRatio(float ratio) {
        return this.zoomControl.setZoomRatio(ratio);
    }

    @Override // androidx.camera.core.CameraControl
    @NotNull
    public ListenableFuture<FocusMeteringResult> startFocusAndMetering(@NotNull FocusMeteringAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ListenableFuture<FocusMeteringResult> listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(FocusMeteringControl.startFocusAndMetering$default(this.focusMeteringControl, action, 0L, 2, null));
        Intrinsics.checkNotNullExpressionValue(listenableFutureNonCancellationPropagating, "nonCancellationPropagating(...)");
        return listenableFutureNonCancellationPropagating;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NotNull
    public ListenableFuture<List<Void>> submitStillCaptureRequests(@NotNull List<CaptureConfig> captureConfigs, int captureMode, int flashType) {
        Intrinsics.checkNotNullParameter(captureConfigs, "captureConfigs");
        return this.stillCaptureRequestControl.issueCaptureRequests(captureConfigs, captureMode, flashType);
    }
}
