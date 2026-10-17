package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import ie.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kp0.g0;
import org.jetbrains.annotations.NotNull;
import p6.e;
import s.f;
import s.g;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010$\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010+J\u0017\u00100\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010+J'\u00105\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J'\u00108\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u001bH\u0016¢\u0006\u0004\b7\u0010\u001eR \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R<\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050<2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050<8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"Landroidx/camera/camera2/impl/ComboRequestListener;", "Landroidx/camera/camera2/pipe/Request$Listener;", "<init>", "()V", "listener", "Ljava/util/concurrent/Executor;", "executor", "", "addListener", "(Landroidx/camera/camera2/pipe/Request$Listener;Ljava/util/concurrent/Executor;)V", "removeListener", "(Landroidx/camera/camera2/pipe/Request$Listener;)V", "Landroidx/camera/camera2/pipe/Request;", "request", "onAborted", "(Landroidx/camera/camera2/pipe/Request;)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "onBufferLost-iiEMlm4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JII)V", "onBufferLost", "Landroidx/camera/camera2/pipe/FrameInfo;", "result", "onComplete-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onComplete", "Landroidx/camera/camera2/pipe/RequestFailure;", "requestFailure", "onFailed-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/RequestFailure;)V", "onFailed", "Landroidx/camera/camera2/pipe/FrameMetadata;", "captureResult", "onPartialCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameMetadata;)V", "onPartialCaptureResult", "onRequestSequenceAborted", "(Landroidx/camera/camera2/pipe/RequestMetadata;)V", "onRequestSequenceCompleted-RuT0dZU", "(Landroidx/camera/camera2/pipe/RequestMetadata;J)V", "onRequestSequenceCompleted", "onRequestSequenceCreated", "onRequestSequenceSubmitted", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "timestamp", "onStarted-uGKBvU4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JJ)V", "onStarted", "totalCaptureResult", "onTotalCaptureResult-CcXjc1I", "onTotalCaptureResult", "", "requestListeners", "Ljava/util/Map;", "", "value", "listeners", "getListeners", "()Ljava/util/Map;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComboRequestListener implements Request.Listener {

    @NotNull
    private final Map<Request.Listener, Executor> requestListeners = new LinkedHashMap();

    @NotNull
    private volatile Map<Request.Listener, ? extends Executor> listeners = r0.g();

    public final void addListener(@NotNull Request.Listener listener, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (this.listeners.containsKey(listener)) {
            throw new IllegalStateException((listener + " was already registered!").toString());
        }
        synchronized (this.requestListeners) {
            this.requestListeners.put(listener, executor);
            this.listeners = r0.u(this.requestListeners);
            Unit unit = Unit.f186387a;
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onAborted(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            entry.getValue().execute(new e(entry.getKey(), request, 14));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onBufferLost-iiEMlm4 */
    public void mo15onBufferLostiiEMlm4(@NotNull final RequestMetadata requestMetadata, final long frameNumber, final int streamId, final int outputId) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            final Request.Listener key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: s.h
                @Override // java.lang.Runnable
                public final void run() {
                    key.mo15onBufferLostiiEMlm4(requestMetadata, frameNumber, streamId, outputId);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onComplete-CcXjc1I */
    public void mo6onCompleteCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull FrameInfo result) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(result, "result");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            entry.getValue().execute(new g(entry.getKey(), requestMetadata, frameNumber, result, 1));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onFailed-CcXjc1I */
    public void mo7onFailedCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull RequestFailure requestFailure) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(requestFailure, "requestFailure");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            entry.getValue().execute(new g0(entry.getKey(), frameNumber, requestMetadata, requestFailure, 1));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onPartialCaptureResult-CcXjc1I */
    public void mo16onPartialCaptureResultCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull FrameMetadata captureResult) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(captureResult, "captureResult");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            entry.getValue().execute(new g0(entry.getKey(), frameNumber, requestMetadata, captureResult, 2));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceAborted(@NotNull RequestMetadata requestMetadata) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            entry.getValue().execute(new f(entry.getKey(), requestMetadata, 0));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onRequestSequenceCompleted-RuT0dZU */
    public void mo18onRequestSequenceCompletedRuT0dZU(@NotNull RequestMetadata requestMetadata, long frameNumber) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            entry.getValue().execute(new q(entry.getKey(), requestMetadata, frameNumber, 2));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceCreated(@NotNull RequestMetadata requestMetadata) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            entry.getValue().execute(new f(entry.getKey(), requestMetadata, 1));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceSubmitted(@NotNull RequestMetadata requestMetadata) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            entry.getValue().execute(new f(entry.getKey(), requestMetadata, 2));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onStarted-uGKBvU4 */
    public void mo19onStarteduGKBvU4(@NotNull RequestMetadata requestMetadata, long frameNumber, long timestamp) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            entry.getValue().execute(new o4.e(entry.getKey(), requestMetadata, 1, frameNumber, timestamp));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onTotalCaptureResult-CcXjc1I */
    public void mo8onTotalCaptureResultCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull FrameInfo totalCaptureResult) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(totalCaptureResult, "totalCaptureResult");
        for (Map.Entry<Request.Listener, ? extends Executor> entry : this.listeners.entrySet()) {
            entry.getValue().execute(new g(entry.getKey(), requestMetadata, frameNumber, totalCaptureResult, 0));
        }
    }

    public final void removeListener(@NotNull Request.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.requestListeners) {
            this.requestListeners.remove(listener);
            this.listeners = r0.u(this.requestListeners);
            Unit unit = Unit.f186387a;
        }
    }
}
