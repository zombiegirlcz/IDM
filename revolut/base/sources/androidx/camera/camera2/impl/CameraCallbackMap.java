package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.adapter.CaptureResultAdapter;
import androidx.camera.camera2.compat.Api24Compat;
import androidx.camera.camera2.compat.Api34Compat;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.TagBundle;
import b0.e;
import com.google.android.material.sidesheet.b;
import ie.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import org.jetbrains.annotations.NotNull;
import q4.d;
import rwg.e0;
import s.a;
import s.c;
import yhm.j;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J/\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\f\u0010%\u001a\u00020&*\u00020\u0017H\u0002J'\u0010'\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.H\u0016J'\u0010/\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00100\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001f\u00105\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00109\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010>\u001a\u00020&H\u0016J'\u0010?\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00109\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010<J\u0012\u0010B\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Landroidx/camera/camera2/impl/CameraCallbackMap;", "Landroidx/camera/camera2/pipe/Request$Listener;", "<init>", "()V", "callbackMap", "", "Landroidx/camera/core/impl/CameraCaptureCallback;", "Ljava/util/concurrent/Executor;", "rejectOperationCameraCaptureSession", "Landroid/hardware/camera2/CameraCaptureSession;", "getRejectOperationCameraCaptureSession", "()Landroid/hardware/camera2/CameraCaptureSession;", "rejectOperationCameraCaptureSession$delegate", "Lkotlin/Lazy;", "callbacks", "", "addCaptureCallback", "", "callback", "executor", "removeCaptureCallback", "onBufferLost", "requestMetadata", "Landroidx/camera/camera2/pipe/RequestMetadata;", "frameNumber", "Landroidx/camera/camera2/pipe/FrameNumber;", "streamId", "Landroidx/camera/camera2/pipe/StreamId;", "outputId", "Landroidx/camera/camera2/pipe/OutputId;", "onBufferLost-iiEMlm4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JII)V", "onComplete", "result", "Landroidx/camera/camera2/pipe/FrameInfo;", "onComplete-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "getCaptureConfigId", "", "onFailed", "requestFailure", "Landroidx/camera/camera2/pipe/RequestFailure;", "onFailed-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/RequestFailure;)V", "onAborted", "request", "Landroidx/camera/camera2/pipe/Request;", "onPartialCaptureResult", "captureResult", "Landroidx/camera/camera2/pipe/FrameMetadata;", "onPartialCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameMetadata;)V", "onRequestSequenceAborted", "onRequestSequenceCompleted", "onRequestSequenceCompleted-RuT0dZU", "(Landroidx/camera/camera2/pipe/RequestMetadata;J)V", "onStarted", "timestamp", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "onStarted-uGKBvU4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JJ)V", "onCaptureProgress", "progress", "onReadoutStarted", "Landroidx/camera/camera2/pipe/SensorTimestamp;", "onReadoutStarted-mP9r-9w", "getCameraCaptureSession", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraCallbackMap implements Request.Listener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<CameraCaptureCallback, Executor> callbackMap = new LinkedHashMap();

    /* JADX INFO: renamed from: rejectOperationCameraCaptureSession$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rejectOperationCameraCaptureSession = j.b(new e0(17));

    @NotNull
    private volatile Map<CameraCaptureCallback, ? extends Executor> callbacks = r0.g();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Landroidx/camera/camera2/impl/CameraCallbackMap$Companion;", "", "<init>", "()V", "createFor", "Landroidx/camera/camera2/impl/CameraCallbackMap;", "callbacks", "", "Landroidx/camera/core/impl/CameraCaptureCallback;", "executor", "Ljava/util/concurrent/Executor;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CameraCallbackMap createFor(@NotNull Collection<? extends CameraCaptureCallback> callbacks, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(callbacks, "callbacks");
            Intrinsics.checkNotNullParameter(executor, "executor");
            CameraCallbackMap cameraCallbackMap = new CameraCallbackMap();
            Iterator<T> it8 = callbacks.iterator();
            while (it8.hasNext()) {
                cameraCallbackMap.addCaptureCallback((CameraCaptureCallback) it8.next(), executor);
            }
            return cameraCallbackMap;
        }

        private Companion() {
        }
    }

    private final CameraCaptureSession getCameraCaptureSession(RequestMetadata requestMetadata) {
        p0 p0Var = o0.f186429a;
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(p0Var.b(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || d.l(requestMetadata.unwrapAs(p0Var.b(d.u()))) == null) {
            return null;
        }
        return getRejectOperationCameraCaptureSession();
    }

    private final int getCaptureConfigId(RequestMetadata requestMetadata) {
        TagBundle tagBundle = (TagBundle) requestMetadata.get(TagsKt.getCAMERAX_TAG_BUNDLE());
        Object tag2 = tagBundle != null ? tagBundle.getTag("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private final CameraCaptureSession getRejectOperationCameraCaptureSession() {
        return (CameraCaptureSession) this.rejectOperationCameraCaptureSession.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBufferLost_iiEMlm4$lambda$0(CameraCaptureCallback cameraCaptureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
        Api24Compat.onCaptureBufferLost(((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback(), cameraCaptureSession, captureRequest, surface, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCaptureProgress$lambda$0(CameraCaptureCallback cameraCaptureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        ((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCaptureProgress$lambda$1(CameraCaptureCallback cameraCaptureCallback, CameraCallbackMap cameraCallbackMap, RequestMetadata requestMetadata, int i) {
        cameraCaptureCallback.onCaptureProcessProgressed(cameraCallbackMap.getCaptureConfigId(requestMetadata), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete_CcXjc1I$lambda$0(CameraCaptureCallback cameraCaptureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        ((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete_CcXjc1I$lambda$1(CameraCaptureCallback cameraCaptureCallback, CameraCallbackMap cameraCallbackMap, RequestMetadata requestMetadata, CaptureResultAdapter captureResultAdapter) {
        cameraCaptureCallback.onCaptureCompleted(cameraCallbackMap.getCaptureConfigId(requestMetadata), captureResultAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFailed_CcXjc1I$lambda$0(CameraCaptureCallback cameraCaptureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        ((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFailed_CcXjc1I$lambda$1(CameraCaptureCallback cameraCaptureCallback, CameraCallbackMap cameraCallbackMap, RequestMetadata requestMetadata, CameraCaptureFailure cameraCaptureFailure) {
        cameraCaptureCallback.onCaptureFailed(cameraCallbackMap.getCaptureConfigId(requestMetadata), cameraCaptureFailure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPartialCaptureResult_CcXjc1I$lambda$0(CameraCaptureCallback cameraCaptureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        ((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReadoutStarted_mP9r_9w$lambda$0(CameraCaptureCallback cameraCaptureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
        Api34Compat.onReadoutStarted(((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback(), cameraCaptureSession, captureRequest, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRequestSequenceAborted$lambda$0(CameraCaptureCallback cameraCaptureCallback, CameraCaptureSession cameraCaptureSession) {
        ((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback().onCaptureSequenceAborted(cameraCaptureSession, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRequestSequenceAborted$lambda$1(CameraCaptureCallback cameraCaptureCallback, CameraCallbackMap cameraCallbackMap, RequestMetadata requestMetadata) {
        cameraCaptureCallback.onCaptureCancelled(cameraCallbackMap.getCaptureConfigId(requestMetadata));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRequestSequenceCompleted_RuT0dZU$lambda$0(CameraCaptureCallback cameraCaptureCallback, CameraCaptureSession cameraCaptureSession, long j2) {
        ((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback().onCaptureSequenceCompleted(cameraCaptureSession, -1, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStarted_uGKBvU4$lambda$0(CameraCaptureCallback cameraCaptureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
        ((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback().onCaptureStarted(cameraCaptureSession, captureRequest, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStarted_uGKBvU4$lambda$1(CameraCaptureCallback cameraCaptureCallback, CameraCallbackMap cameraCallbackMap, RequestMetadata requestMetadata) {
        cameraCaptureCallback.onCaptureStarted(cameraCallbackMap.getCaptureConfigId(requestMetadata));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RejectOperationCameraCaptureSession rejectOperationCameraCaptureSession_delegate$lambda$0() {
        return new RejectOperationCameraCaptureSession();
    }

    public final void addCaptureCallback(@NotNull CameraCaptureCallback callback, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (this.callbacks.containsKey(callback)) {
            throw new IllegalStateException((callback + " was already registered!").toString());
        }
        synchronized (this.callbackMap) {
            this.callbackMap.put(callback, executor);
            this.callbacks = r0.u(this.callbackMap);
            Unit unit = Unit.f186387a;
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onAborted(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            Object obj2 = request.getExtras().get(TagsKt.getCAMERAX_TAG_BUNDLE());
            TagBundle tagBundle = obj2 instanceof TagBundle ? (TagBundle) obj2 : null;
            Object tag2 = tagBundle != null ? tagBundle.getTag("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = tag2 instanceof Integer ? (Integer) tag2 : null;
            value.execute(new b(key, num != null ? num.intValue() : -1, 13));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onBufferLost-iiEMlm4, reason: not valid java name */
    public void mo15onBufferLostiiEMlm4(@NotNull RequestMetadata requestMetadata, final long frameNumber, int streamId, int outputId) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                p0 p0Var = o0.f186429a;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(p0Var.b(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(p0Var.b(CaptureRequest.class));
                final Surface surface = requestMetadata.getStreams().get(StreamId.m355boximpl(streamId));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    final CameraUseCaseAdapter.CaptureCallbackContainer captureCallbackContainer = (CameraUseCaseAdapter.CaptureCallbackContainer) key;
                    value.execute(new Runnable() { // from class: s.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraCallbackMap.onBufferLost_iiEMlm4$lambda$0(captureCallbackContainer, cameraCaptureSession, captureRequest, surface, frameNumber);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onCaptureProgress(@NotNull RequestMetadata requestMetadata, int progress) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                p0 p0Var = o0.f186429a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(p0Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(p0Var.b(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) requestMetadata.unwrapAs(p0Var.b(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    value.execute(new s.b((CameraUseCaseAdapter.CaptureCallbackContainer) key, cameraCaptureSession, captureRequest, captureResult, 0));
                }
            } else {
                value.execute(new c(key, this, requestMetadata, progress));
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onComplete-CcXjc1I */
    public void mo6onCompleteCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull FrameInfo result) {
        RequestMetadata requestMetadata2 = requestMetadata;
        FrameInfo result2 = result;
        Intrinsics.checkNotNullParameter(requestMetadata2, "requestMetadata");
        Intrinsics.checkNotNullParameter(result2, "result");
        CameraCallbackMap cameraCallbackMap = this;
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : cameraCallbackMap.callbacks.entrySet()) {
            CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                p0 p0Var = o0.f186429a;
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata2.unwrapAs(p0Var.b(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) result2.unwrapAs(p0Var.b(TotalCaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && totalCaptureResult != null) {
                    value.execute(new e((CameraUseCaseAdapter.CaptureCallbackContainer) key, cameraCaptureSession, captureRequest, totalCaptureResult, 8));
                }
            } else {
                value.execute(new e(key, cameraCallbackMap, requestMetadata, new CaptureResultAdapter(requestMetadata2, frameNumber, result2, null), 9));
                cameraCallbackMap = this;
                requestMetadata2 = requestMetadata;
                result2 = result;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onFailed-CcXjc1I */
    public void mo7onFailedCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull RequestFailure requestFailure) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(requestFailure, "requestFailure");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                p0 p0Var = o0.f186429a;
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(p0Var.b(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) requestFailure.unwrapAs(p0Var.b(CaptureFailure.class));
                if (cameraCaptureSession != null && captureRequest != null && captureFailure != null) {
                    value.execute(new e((CameraUseCaseAdapter.CaptureCallbackContainer) key, cameraCaptureSession, captureRequest, captureFailure, 10));
                }
            } else {
                value.execute(new e(key, this, requestMetadata, new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR), 11));
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onPartialCaptureResult-CcXjc1I, reason: not valid java name */
    public void mo16onPartialCaptureResultCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull FrameMetadata captureResult) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(captureResult, "captureResult");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                p0 p0Var = o0.f186429a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(p0Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(p0Var.b(CaptureRequest.class));
                CaptureResult captureResult2 = (CaptureResult) captureResult.unwrapAs(p0Var.b(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult2 != null) {
                    value.execute(new s.b((CameraUseCaseAdapter.CaptureCallbackContainer) key, cameraCaptureSession, captureRequest, captureResult2, 1));
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onReadoutStarted-mP9r-9w, reason: not valid java name */
    public void mo17onReadoutStartedmP9r9w(@NotNull RequestMetadata requestMetadata, long frameNumber, long timestamp) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                p0 p0Var = o0.f186429a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(p0Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(p0Var.b(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new s.d((CameraUseCaseAdapter.CaptureCallbackContainer) key, cameraCaptureSession, captureRequest, timestamp, frameNumber, 0));
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceAborted(@NotNull RequestMetadata requestMetadata) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                p0 p0Var = o0.f186429a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(p0Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(p0Var.b(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new p6.e((CameraUseCaseAdapter.CaptureCallbackContainer) key, cameraCaptureSession, 13));
                }
            } else {
                value.execute(new a(key, this, requestMetadata, 0));
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onRequestSequenceCompleted-RuT0dZU, reason: not valid java name */
    public void mo18onRequestSequenceCompletedRuT0dZU(@NotNull RequestMetadata requestMetadata, long frameNumber) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(o0.f186429a.b(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new q((CameraUseCaseAdapter.CaptureCallbackContainer) key, cameraCaptureSession, frameNumber, 1));
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onStarted-uGKBvU4, reason: not valid java name */
    public void mo19onStarteduGKBvU4(@NotNull RequestMetadata requestMetadata, long frameNumber, long timestamp) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(o0.f186429a.b(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new s.d((CameraUseCaseAdapter.CaptureCallbackContainer) key, cameraCaptureSession, captureRequest, timestamp, frameNumber, 1));
                }
            } else {
                value.execute(new a(key, this, requestMetadata, 1));
            }
        }
    }

    public final void removeCaptureCallback(@NotNull CameraCaptureCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.callbackMap) {
            this.callbackMap.remove(callback);
            this.callbacks = r0.u(this.callbackMap);
            Unit unit = Unit.f186387a;
        }
    }
}
