package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import ib.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import q4.d;
import rkm.f;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u00002\u00020\u0001:\u0002@AB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001a\u001a\u0004\u0018\u00010\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0004\u0018\u00010\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010%\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCameraExtensionSession;", "Landroidx/camera/camera2/pipe/compat/CameraExtensionSessionWrapper;", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "device", "Landroid/hardware/camera2/CameraExtensionSession;", "cameraExtensionSession", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "Ljava/util/concurrent/Executor;", "callbackExecutor", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroid/hardware/camera2/CameraExtensionSession;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Ljava/util/concurrent/Executor;)V", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "listener", "", "capture", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;", "setRepeatingRequest", "", "stopRepeating", "()Z", "abortCaptures", "", "requests", "captureBurst", "(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;", "setRepeatingBurst", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "outputConfigs", "finalizeOutputConfigurations", "(Ljava/util/List;)Z", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "close", "()V", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "getDevice", "()Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "Landroid/hardware/camera2/CameraExtensionSession;", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "Ljava/util/concurrent/Executor;", "Landroidx/camera/camera2/pipe/CameraInterop$CameraCaptureSessionId;", "id", "I", "getId-159jkk4", "()I", "Lrkm/f;", "frameNumbers", "Lrkm/f;", "", "", "extensionSessionMap", "Ljava/util/Map;", "Landroid/view/Surface;", "getInputSurface", "()Landroid/view/Surface;", "inputSurface", "Camera2CaptureSessionCallbackToExtensionCaptureCallback", "Camera2CaptureSessionCallbackToExtensionCaptureCallbackAndroidS", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AndroidCameraExtensionSession implements CameraExtensionSessionWrapper {

    @NotNull
    private final Executor callbackExecutor;

    @NotNull
    private final CameraErrorListener cameraErrorListener;

    @NotNull
    private final CameraExtensionSession cameraExtensionSession;

    @NotNull
    private final CameraDeviceWrapper device;

    @NotNull
    private final Map<CameraExtensionSession, Long> extensionSessionMap;

    @NotNull
    private final f frameNumbers;
    private final int id;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCameraExtensionSession$Camera2CaptureSessionCallbackToExtensionCaptureCallback;", "Landroid/hardware/camera2/CameraExtensionSession$ExtensionCaptureCallback;", "captureCallback", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureCallback;", "<init>", "(Landroidx/camera/camera2/pipe/compat/AndroidCameraExtensionSession;Landroidx/camera/camera2/pipe/compat/Camera2CaptureCallback;)V", "frameQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "onCaptureStarted", "", b.Session, "Landroid/hardware/camera2/CameraExtensionSession;", "request", "Landroid/hardware/camera2/CaptureRequest;", "timestamp", "onCaptureProcessStarted", "onCaptureProcessProgressed", "progress", "", "onCaptureFailed", "onCaptureSequenceCompleted", "sequenceId", "onCaptureSequenceAborted", "onCaptureResultAvailable", "result", "Landroid/hardware/camera2/TotalCaptureResult;", "incrementAndGetNextFrameNumber", "dequeueFrameNumber", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Camera2CaptureSessionCallbackToExtensionCaptureCallback extends CameraExtensionSession$ExtensionCaptureCallback {

        @NotNull
        private final Camera2CaptureCallback captureCallback;

        @NotNull
        private final ConcurrentLinkedQueue<Long> frameQueue;
        final /* synthetic */ AndroidCameraExtensionSession this$0;

        public Camera2CaptureSessionCallbackToExtensionCaptureCallback(@NotNull AndroidCameraExtensionSession androidCameraExtensionSession, Camera2CaptureCallback captureCallback) {
            Intrinsics.checkNotNullParameter(captureCallback, "captureCallback");
            this.this$0 = androidCameraExtensionSession;
            this.captureCallback = captureCallback;
            this.frameQueue = new ConcurrentLinkedQueue<>();
        }

        private final long dequeueFrameNumber(CameraExtensionSession session) {
            if (this.frameQueue.isEmpty()) {
                incrementAndGetNextFrameNumber(session);
            }
            Long lRemove = this.frameQueue.remove();
            Intrinsics.checkNotNullExpressionValue(lRemove, "remove(...)");
            return lRemove.longValue();
        }

        private final long incrementAndGetNextFrameNumber(CameraExtensionSession session) {
            f fVar = this.this$0.frameNumbers;
            fVar.getClass();
            long jIncrementAndGet = f.f254897b.incrementAndGet(fVar);
            this.this$0.extensionSessionMap.put(session, Long.valueOf(jIncrementAndGet));
            this.frameQueue.add(Long.valueOf(jIncrementAndGet));
            return jIncrementAndGet;
        }

        public void onCaptureFailed(@NotNull CameraExtensionSession session, @NotNull CaptureRequest request) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            this.captureCallback.mo387onCaptureFailedRuT0dZU(request, FrameNumber.m222constructorimpl(dequeueFrameNumber(session)));
        }

        public void onCaptureProcessProgressed(@NotNull CameraExtensionSession session, @NotNull CaptureRequest request, int progress) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            this.captureCallback.onCaptureProcessProgressed(request, progress);
        }

        public void onCaptureProcessStarted(@NotNull CameraExtensionSession session, @NotNull CaptureRequest request) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
        }

        public void onCaptureResultAvailable(@NotNull CameraExtensionSession session, @NotNull CaptureRequest request, @NotNull TotalCaptureResult result) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            this.captureCallback.mo386onCaptureCompletedrmrZIYk(request, result, FrameNumber.m222constructorimpl(dequeueFrameNumber(session)));
        }

        public void onCaptureSequenceAborted(@NotNull CameraExtensionSession session, int sequenceId) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.captureCallback.onCaptureSequenceAborted(sequenceId);
        }

        public void onCaptureSequenceCompleted(@NotNull CameraExtensionSession session, int sequenceId) {
            Intrinsics.checkNotNullParameter(session, "session");
            Long l2 = (Long) this.this$0.extensionSessionMap.get(session);
            Camera2CaptureCallback camera2CaptureCallback = this.captureCallback;
            Intrinsics.h(l2);
            camera2CaptureCallback.onCaptureSequenceCompleted(sequenceId, l2.longValue());
        }

        public void onCaptureStarted(@NotNull CameraExtensionSession session, @NotNull CaptureRequest request, long timestamp) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            this.captureCallback.onCaptureStarted(request, incrementAndGetNextFrameNumber(session), timestamp);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J \u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCameraExtensionSession$Camera2CaptureSessionCallbackToExtensionCaptureCallbackAndroidS;", "Landroid/hardware/camera2/CameraExtensionSession$ExtensionCaptureCallback;", "captureCallback", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureCallback;", "captureRequestMap", "", "Landroid/hardware/camera2/CaptureRequest;", "", "", "<init>", "(Landroidx/camera/camera2/pipe/compat/AndroidCameraExtensionSession;Landroidx/camera/camera2/pipe/compat/Camera2CaptureCallback;Ljava/util/Map;)V", "onCaptureStarted", "", b.Session, "Landroid/hardware/camera2/CameraExtensionSession;", "request", "timestamp", "onCaptureProcessStarted", "onCaptureFailed", "onCaptureProcessProgressed", "progress", "", "onCaptureSequenceCompleted", "sequenceId", "onCaptureSequenceAborted", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Camera2CaptureSessionCallbackToExtensionCaptureCallbackAndroidS extends CameraExtensionSession$ExtensionCaptureCallback {

        @NotNull
        private final Camera2CaptureCallback captureCallback;

        @NotNull
        private final Map<CaptureRequest, List<Long>> captureRequestMap;
        final /* synthetic */ AndroidCameraExtensionSession this$0;

        public Camera2CaptureSessionCallbackToExtensionCaptureCallbackAndroidS(@NotNull AndroidCameraExtensionSession androidCameraExtensionSession, @NotNull Camera2CaptureCallback captureCallback, Map<CaptureRequest, List<Long>> captureRequestMap) {
            Intrinsics.checkNotNullParameter(captureCallback, "captureCallback");
            Intrinsics.checkNotNullParameter(captureRequestMap, "captureRequestMap");
            this.this$0 = androidCameraExtensionSession;
            this.captureCallback = captureCallback;
            this.captureRequestMap = captureRequestMap;
        }

        public void onCaptureFailed(@NotNull CameraExtensionSession session, @NotNull CaptureRequest request) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            List<Long> list = this.captureRequestMap.get(request);
            Intrinsics.h(list);
            if (list.size() == 1) {
                List<Long> list2 = this.captureRequestMap.get(request);
                Intrinsics.h(list2);
                this.captureCallback.mo387onCaptureFailedRuT0dZU(request, FrameNumber.m222constructorimpl(list2.get(0).longValue()));
                return;
            }
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                StringBuilder sb6 = new StringBuilder("onCaptureFailed is not triggered for repeating requests. Request frame numbers: ");
                Object obj2 = this.captureRequestMap.get(request);
                Intrinsics.h(obj2);
                sb6.append(((List) obj2).stream());
                sb6.toString();
            }
        }

        public void onCaptureProcessProgressed(@NotNull CameraExtensionSession session, @NotNull CaptureRequest request, int progress) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            this.captureCallback.onCaptureProcessProgressed(request, progress);
        }

        public void onCaptureProcessStarted(@NotNull CameraExtensionSession session, @NotNull CaptureRequest request) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
        }

        public void onCaptureSequenceAborted(@NotNull CameraExtensionSession session, int sequenceId) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.captureCallback.onCaptureSequenceAborted(sequenceId);
        }

        public void onCaptureSequenceCompleted(@NotNull CameraExtensionSession session, int sequenceId) {
            Intrinsics.checkNotNullParameter(session, "session");
            Long l2 = (Long) this.this$0.extensionSessionMap.get(session);
            Camera2CaptureCallback camera2CaptureCallback = this.captureCallback;
            Intrinsics.h(l2);
            camera2CaptureCallback.onCaptureSequenceCompleted(sequenceId, l2.longValue());
        }

        public void onCaptureStarted(@NotNull CameraExtensionSession session, @NotNull CaptureRequest request, long timestamp) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            f fVar = this.this$0.frameNumbers;
            fVar.getClass();
            long jIncrementAndGet = f.f254897b.incrementAndGet(fVar);
            this.this$0.extensionSessionMap.put(session, Long.valueOf(jIncrementAndGet));
            Map<CaptureRequest, List<Long>> map = this.captureRequestMap;
            List<Long> arrayList = map.get(request);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(request, arrayList);
            }
            arrayList.add(Long.valueOf(jIncrementAndGet));
            this.captureCallback.onCaptureStarted(request, jIncrementAndGet, timestamp);
        }
    }

    public AndroidCameraExtensionSession(@NotNull CameraDeviceWrapper device, @NotNull CameraExtensionSession cameraExtensionSession, @NotNull CameraErrorListener cameraErrorListener, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(cameraExtensionSession, "cameraExtensionSession");
        Intrinsics.checkNotNullParameter(cameraErrorListener, "cameraErrorListener");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.device = device;
        this.cameraExtensionSession = cameraExtensionSession;
        this.cameraErrorListener = cameraErrorListener;
        this.callbackExecutor = callbackExecutor;
        this.id = CameraInterop.m188nextCameraCaptureSessionId159jkk4$camera_camera2_pipe();
        this.frameNumbers = hx7.b.i();
        this.extensionSessionMap = new HashMap();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean abortCaptures() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer capture(@NotNull CaptureRequest request, @NotNull CameraCaptureSession.CaptureCallback listener) throws Exception {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String cameraId = getDevice().getCameraId();
        CameraErrorListener cameraErrorListener = this.cameraErrorListener;
        try {
            return Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? this.cameraExtensionSession.capture(request, this.callbackExecutor, new Camera2CaptureSessionCallbackToExtensionCaptureCallback(this, (Camera2CaptureCallback) listener)) : this.cameraExtensionSession.capture(request, this.callbackExecutor, new Camera2CaptureSessionCallbackToExtensionCaptureCallbackAndroidS(this, (Camera2CaptureCallback) listener, new LinkedHashMap())));
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str = "Failed to execute call: Camera encountered an error: " + e.getMessage();
                }
                cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m138fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e), true);
                return null;
            }
            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                if (e instanceof IllegalStateException) {
                    return Log.INSTANCE.getDEBUG_LOGGABLE() ? null : null;
                }
                throw e;
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str2 = "Failed to execute call: Unexpected exception: " + e.getMessage();
            }
            cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m149getERROR_GRAPH_CONFIGv7Vf74A(), false);
            return null;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer captureBurst(@NotNull List<CaptureRequest> requests, @NotNull CameraCaptureSession.CaptureCallback listener) throws Exception {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Iterator<T> it8 = requests.iterator();
        while (it8.hasNext()) {
            capture((CaptureRequest) it8.next(), listener);
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws CameraAccessException {
        this.cameraExtensionSession.close();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean finalizeOutputConfigurations(@NotNull List<? extends OutputConfigurationWrapper> outputConfigs) {
        Intrinsics.checkNotNullParameter(outputConfigs, "outputConfigs");
        return Log.INSTANCE.getWARN_LOGGABLE() ? false : false;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    @NotNull
    public CameraDeviceWrapper getDevice() {
        return this.device;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    /* JADX INFO: renamed from: getId-159jkk4, reason: from getter */
    public int getId() {
        return this.id;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Surface getInputSurface() {
        return null;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer setRepeatingBurst(@NotNull List<CaptureRequest> requests, @NotNull CameraCaptureSession.CaptureCallback listener) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (requests.size() == 1) {
            return setRepeatingRequest((CaptureRequest) d0.K0(requests), listener);
        }
        throw new IllegalStateException("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer setRepeatingRequest(@NotNull CaptureRequest request, @NotNull CameraCaptureSession.CaptureCallback listener) throws Exception {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String cameraId = getDevice().getCameraId();
        CameraErrorListener cameraErrorListener = this.cameraErrorListener;
        try {
            return Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? this.cameraExtensionSession.setRepeatingRequest(request, this.callbackExecutor, new Camera2CaptureSessionCallbackToExtensionCaptureCallback(this, (Camera2CaptureCallback) listener)) : this.cameraExtensionSession.setRepeatingRequest(request, this.callbackExecutor, new Camera2CaptureSessionCallbackToExtensionCaptureCallbackAndroidS(this, (Camera2CaptureCallback) listener, new LinkedHashMap())));
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str = "Failed to execute call: Camera encountered an error: " + e.getMessage();
                }
                cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m138fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e), true);
                return null;
            }
            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                if (e instanceof IllegalStateException) {
                    return Log.INSTANCE.getDEBUG_LOGGABLE() ? null : null;
                }
                throw e;
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str2 = "Failed to execute call: Unexpected exception: " + e.getMessage();
            }
            cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m149getERROR_GRAPH_CONFIGv7Vf74A(), false);
            return null;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean stopRepeating() throws Exception {
        Unit unit;
        String cameraId = getDevice().getCameraId();
        CameraErrorListener cameraErrorListener = this.cameraErrorListener;
        try {
            this.cameraExtensionSession.stopRepeating();
            unit = Unit.f186387a;
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str = "Failed to execute call: Camera encountered an error: " + e.getMessage();
                }
                cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m138fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e), true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str2 = "Failed to execute call: Unexpected exception: " + e.getMessage();
                }
                cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m149getERROR_GRAPH_CONFIGv7Vf74A(), false);
            } else {
                if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                }
            }
            unit = null;
        }
        return unit != null;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.f(type, o0.f186429a.b(d.u()))) {
            return (T) this.cameraExtensionSession;
        }
        return null;
    }
}
