package androidx.camera.core.streamsharing;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ForwardingCameraControl;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import n0.b;

/* JADX INFO: loaded from: classes15.dex */
public class VirtualCameraControl extends ForwardingCameraControl {
    private final StreamSharing.Control mStreamSharingControl;

    public VirtualCameraControl(CameraControlInternal cameraControlInternal, StreamSharing.Control control) {
        super(cameraControlInternal);
        this.mStreamSharingControl = control;
    }

    private int getJpegQuality(CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int getRotationDegrees(CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_ROTATION, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ListenableFuture lambda$submitStillCaptureRequests$0(ListenableFuture listenableFuture, CameraCapturePipeline cameraCapturePipeline) throws Exception {
        return ((CameraCapturePipeline) listenableFuture.get()).invokePreCapture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ListenableFuture lambda$submitStillCaptureRequests$1(List list, Void r4) throws Exception {
        StreamSharing.Control control = this.mStreamSharingControl;
        return ((a) control).f6881a.lambda$new$0(getJpegQuality((CaptureConfig) list.get(0)), getRotationDegrees((CaptureConfig) list.get(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ListenableFuture lambda$submitStillCaptureRequests$2(ListenableFuture listenableFuture, Void r110) throws Exception {
        return ((CameraCapturePipeline) listenableFuture.get()).invokePostCapture();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture<List<Void>> submitStillCaptureRequests(final List<CaptureConfig> list, int i, int i2) {
        Preconditions.checkArgument(list.size() == 1, "Only support one capture config.");
        ListenableFuture<CameraCapturePipeline> cameraCapturePipelineAsync = getCameraCapturePipelineAsync(i, 1);
        return Futures.allAsList(Collections.singletonList(FutureChain.from(cameraCapturePipelineAsync).transformAsync(new b(cameraCapturePipelineAsync, 0), CameraXExecutors.directExecutor()).transformAsync(new AsyncFunction() { // from class: n0.c
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj2) {
                return this.f210834a.lambda$submitStillCaptureRequests$1(list, (Void) obj2);
            }
        }, CameraXExecutors.directExecutor()).transformAsync(new b(cameraCapturePipelineAsync, 1), CameraXExecutors.directExecutor())));
    }
}
