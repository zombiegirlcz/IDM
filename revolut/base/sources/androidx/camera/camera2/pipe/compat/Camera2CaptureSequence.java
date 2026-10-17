package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.CameraTimestamp;
import androidx.camera.camera2.pipe.CaptureSequence;
import androidx.camera.camera2.pipe.CaptureSequences;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.SensorTimestamp;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import ib.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.f;
import skm.e0;
import skm.q;
import skm.r;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0081\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010)\u001a\u0004\u0018\u00010\u00132\u0006\u0010&\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,J/\u00102\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0016¢\u0006\u0004\b2\u00103J'\u00102\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00042\u0006\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b2\u00104J'\u00107\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u00042\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00107\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00042\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00109J/\u0010;\u001a\u00020\"2\u0006\u0010:\u001a\u00020-2\u0006\u0010*\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0016¢\u0006\u0004\b;\u00103J'\u0010>\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J'\u0010>\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ'\u0010H\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010H\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bJ\u0010KJ/\u0010M\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00122\u0006\u0010L\u001a\u00020/H\u0016¢\u0006\u0004\bM\u0010NJ'\u0010P\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010O\u001a\u00020B2\u0006\u00101\u001a\u00020/H\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010P\u001a\u00020\"2\u0006\u0010O\u001a\u00020B2\u0006\u00101\u001a\u00020/H\u0016¢\u0006\u0004\bP\u0010RJ\u001f\u0010S\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010O\u001a\u00020BH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010S\u001a\u00020\"2\u0006\u0010O\u001a\u00020BH\u0016¢\u0006\u0004\bS\u0010UJ\u0010\u0010X\u001a\u00020\"H\u0080@¢\u0006\u0004\bV\u0010WJ\u000f\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\bZ\u0010[R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\\\u001a\u0004\b]\u0010[R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010^\u001a\u0004\b_\u0010`R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bb\u0010cR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010a\u001a\u0004\bd\u0010cR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010a\u001a\u0004\be\u0010cR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010f\u001a\u0004\bg\u0010hR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010iR \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010iR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010jR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010kR\u0014\u0010l\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\"0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010q\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR$\u0010w\u001a\u00020B2\u0006\u0010s\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010U¨\u0006x"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequence;", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureCallback;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Landroidx/camera/camera2/pipe/CaptureSequence;", "Landroid/hardware/camera2/CaptureRequest;", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "", "repeating", "", "captureRequestList", "Landroidx/camera/camera2/pipe/RequestMetadata;", "captureMetadataList", "Landroidx/camera/camera2/pipe/Request$Listener;", "listeners", "Landroidx/camera/camera2/pipe/CaptureSequence$CaptureSequenceListener;", "sequenceListener", "", "Landroid/view/Surface;", "Landroidx/camera/camera2/pipe/StreamId;", "surfaceToStreamMap", "Landroidx/camera/camera2/pipe/OutputId;", "surfaceToOutputMap", "Landroidx/camera/camera2/pipe/StreamGraph;", "streamGraph", "Landroidx/camera/camera2/pipe/StrictMode;", "strictMode", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/CaptureSequence$CaptureSequenceListener;Ljava/util/Map;Ljava/util/Map;Landroidx/camera/camera2/pipe/StreamGraph;Landroidx/camera/camera2/pipe/StrictMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "request", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/RequestFailure;", "requestFailure", "", "invokeCaptureFailure-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/RequestFailure;)V", "invokeCaptureFailure", "surface", "getStreamId-Lfjdq8s", "(Landroid/view/Surface;)Landroidx/camera/camera2/pipe/StreamId;", "getStreamId", "captureRequest", "readRequestMetadata", "(Landroid/hardware/camera2/CaptureRequest;)Landroidx/camera/camera2/pipe/RequestMetadata;", "Landroid/hardware/camera2/CameraCaptureSession;", "captureSession", "", "captureTimestamp", "captureFrameNumber", "onCaptureStarted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V", "(Landroid/hardware/camera2/CaptureRequest;JJ)V", "Landroid/hardware/camera2/CaptureResult;", "partialCaptureResult", "onCaptureProgressed", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V", b.Session, "onReadoutStarted", "Landroid/hardware/camera2/TotalCaptureResult;", "captureResult", "onCaptureCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V", "onCaptureCompleted-rmrZIYk", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;J)V", "", "progress", "onCaptureProcessProgressed", "(Landroid/hardware/camera2/CaptureRequest;I)V", "Landroid/hardware/camera2/CaptureFailure;", "captureFailure", "onCaptureFailed", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V", "onCaptureFailed-RuT0dZU", "(Landroid/hardware/camera2/CaptureRequest;J)V", "frameId", "onCaptureBufferLost", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V", "captureSequenceId", "onCaptureSequenceCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;IJ)V", "(IJ)V", "onCaptureSequenceAborted", "(Landroid/hardware/camera2/CameraCaptureSession;I)V", "(I)V", "awaitStarted$camera_camera2_pipe", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitStarted", "", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCameraId-Dz_R5H8", "Z", "getRepeating", "()Z", "Ljava/util/List;", "getCaptureRequestList", "()Ljava/util/List;", "getCaptureMetadataList", "getListeners", "Landroidx/camera/camera2/pipe/CaptureSequence$CaptureSequenceListener;", "getSequenceListener", "()Landroidx/camera/camera2/pipe/CaptureSequence$CaptureSequenceListener;", "Ljava/util/Map;", "Landroidx/camera/camera2/pipe/StreamGraph;", "Landroidx/camera/camera2/pipe/StrictMode;", "debugId", "J", "Lskm/q;", "hasStarted", "Lskm/q;", "_sequenceNumber", "Ljava/lang/Integer;", "value", "getSequenceNumber", "()I", "setSequenceNumber", "sequenceNumber", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CaptureSequence extends CameraCaptureSession.CaptureCallback implements Camera2CaptureCallback, CaptureSequence<CaptureRequest> {
    private volatile Integer _sequenceNumber;

    @NotNull
    private final String cameraId;

    @NotNull
    private final List<RequestMetadata> captureMetadataList;

    @NotNull
    private final List<CaptureRequest> captureRequestList;
    private final long debugId;

    @NotNull
    private final q hasStarted;

    @NotNull
    private final List<Request.Listener> listeners;
    private final boolean repeating;

    @NotNull
    private final CaptureSequence.CaptureSequenceListener sequenceListener;

    @NotNull
    private final StreamGraph streamGraph;

    @NotNull
    private final StrictMode strictMode;

    @NotNull
    private final Map<Surface, OutputId> surfaceToOutputMap;

    @NotNull
    private final Map<Surface, StreamId> surfaceToStreamMap;

    public /* synthetic */ Camera2CaptureSequence(String str, boolean z, List list, List list2, List list3, CaptureSequence.CaptureSequenceListener captureSequenceListener, Map map, Map map2, StreamGraph streamGraph, StrictMode strictMode, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, list, list2, list3, captureSequenceListener, map, map2, streamGraph, strictMode);
    }

    /* JADX INFO: renamed from: getStreamId-Lfjdq8s, reason: not valid java name */
    private final StreamId m388getStreamIdLfjdq8s(Surface surface) {
        CameraStream stream;
        StreamId streamId = this.surfaceToStreamMap.get(surface);
        if (streamId != null) {
            return streamId;
        }
        OutputId outputId = this.surfaceToOutputMap.get(surface);
        OutputStream outputStreamM354getiYJqvbA = outputId != null ? this.streamGraph.m354getiYJqvbA(outputId.getValue()) : null;
        if (outputStreamM354getiYJqvbA == null || (stream = outputStreamM354getiYJqvbA.getStream()) == null) {
            return null;
        }
        return StreamId.m355boximpl(stream.getId());
    }

    /* JADX INFO: renamed from: invokeCaptureFailure-CcXjc1I, reason: not valid java name */
    private final void m389invokeCaptureFailureCcXjc1I(RequestMetadata request, long frameNumber, RequestFailure requestFailure) {
        getSequenceListener().onCaptureSequenceComplete(this);
        CaptureSequences captureSequences = CaptureSequences.INSTANCE;
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size = getListeners().size();
        for (int i = 0; i < size; i++) {
            getListeners().get(i).mo7onFailedCcXjc1I(request, frameNumber, requestFailure);
        }
        Debug debug2 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = request.getRequest().getListeners().size();
        for (int i2 = 0; i2 < size2; i2++) {
            request.getRequest().getListeners().get(i2).mo7onFailedCcXjc1I(request, frameNumber, requestFailure);
        }
        Debug debug3 = Debug.INSTANCE;
        Trace.endSection();
    }

    private final RequestMetadata readRequestMetadata(CaptureRequest captureRequest) {
        int size = getCaptureRequestList().size();
        for (int i = 0; i < size; i++) {
            if (getCaptureRequestList().get(i) == captureRequest) {
                return getCaptureMetadataList().get(i);
            }
        }
        throw new IllegalArgumentException("Failed to find CaptureRequest " + captureRequest + " in " + getCaptureRequestList());
    }

    public final Object awaitStarted$camera_camera2_pipe(@NotNull Continuation<? super Unit> continuation) {
        Object objY = ((r) this.hasStarted).y(continuation);
        return objY == fim.a.COROUTINE_SUSPENDED ? objY : Unit.f186387a;
    }

    @NotNull
    /* JADX INFO: renamed from: getCameraId-Dz_R5H8, reason: not valid java name and from getter */
    public String getCameraId() {
        return this.cameraId;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    @NotNull
    public List<RequestMetadata> getCaptureMetadataList() {
        return this.captureMetadataList;
    }

    @NotNull
    public List<CaptureRequest> getCaptureRequestList() {
        return this.captureRequestList;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    @NotNull
    public List<Request.Listener> getListeners() {
        return this.listeners;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    public boolean getRepeating() {
        return this.repeating;
    }

    @NotNull
    public CaptureSequence.CaptureSequenceListener getSequenceListener() {
        return this.sequenceListener;
    }

    public int getSequenceNumber() {
        int iIntValue;
        if (this._sequenceNumber != null) {
            Integer num = this._sequenceNumber;
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
        }
        synchronized (this) {
            Integer num2 = this._sequenceNumber;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(@NotNull CameraCaptureSession captureSession, @NotNull CaptureRequest captureRequest, @NotNull Surface surface, long frameId) {
        Intrinsics.checkNotNullParameter(captureSession, "captureSession");
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("onCaptureBufferLost");
        long jM222constructorimpl = FrameNumber.m222constructorimpl(frameId);
        StreamId streamIdM388getStreamIdLfjdq8s = m388getStreamIdLfjdq8s(surface);
        OutputId outputId = this.surfaceToOutputMap.get(surface);
        if (streamIdM388getStreamIdLfjdq8s == null) {
            throw new IllegalStateException(("Unable to find the streamId for " + surface + " on " + ((Object) FrameNumber.m226toStringimpl(jM222constructorimpl))).toString());
        }
        if (outputId == null) {
            throw new IllegalStateException(("Unable to find the outputId for " + surface + " on " + ((Object) FrameNumber.m226toStringimpl(jM222constructorimpl))).toString());
        }
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        CaptureSequences captureSequences = CaptureSequences.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size = getListeners().size();
        for (int i = 0; i < size; i++) {
            getListeners().get(i).m317onBufferLostDlC0U5Y(requestMetadata, jM222constructorimpl, streamIdM388getStreamIdLfjdq8s.getValue());
        }
        Debug debug2 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i2 = 0; i2 < size2; i2++) {
            requestMetadata.getRequest().getListeners().get(i2).m317onBufferLostDlC0U5Y(requestMetadata, jM222constructorimpl, streamIdM388getStreamIdLfjdq8s.getValue());
        }
        Debug debug3 = Debug.INSTANCE;
        Trace.endSection();
        CaptureSequences captureSequences2 = CaptureSequences.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size3 = getListeners().size();
        for (int i3 = 0; i3 < size3; i3++) {
            getListeners().get(i3).mo15onBufferLostiiEMlm4(requestMetadata, jM222constructorimpl, streamIdM388getStreamIdLfjdq8s.getValue(), outputId.getValue());
        }
        Debug debug4 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = requestMetadata.getRequest().getListeners().size();
        for (int i5 = 0; i5 < size4; i5++) {
            requestMetadata.getRequest().getListeners().get(i5).mo15onBufferLostiiEMlm4(requestMetadata, jM222constructorimpl, streamIdM388getStreamIdLfjdq8s.getValue(), outputId.getValue());
        }
        Debug debug5 = Debug.INSTANCE;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(@NotNull CameraCaptureSession captureSession, @NotNull CaptureRequest captureRequest, @NotNull TotalCaptureResult captureResult) {
        Intrinsics.checkNotNullParameter(captureSession, "captureSession");
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Intrinsics.checkNotNullParameter(captureResult, "captureResult");
        mo386onCaptureCompletedrmrZIYk(captureRequest, captureResult, FrameNumber.m222constructorimpl(captureResult.getFrameNumber()));
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    /* JADX INFO: renamed from: onCaptureCompleted-rmrZIYk */
    public void mo386onCaptureCompletedrmrZIYk(@NotNull CaptureRequest captureRequest, @NotNull TotalCaptureResult captureResult, long frameNumber) {
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Intrinsics.checkNotNullParameter(captureResult, "captureResult");
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        getSequenceListener().onCaptureSequenceComplete(this);
        Trace.endSection();
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        AndroidFrameInfo androidFrameInfo = new AndroidFrameInfo(captureResult, getCameraId(), requestMetadata, null);
        Trace.beginSection("onTotalCaptureResult");
        CaptureSequences captureSequences = CaptureSequences.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size = getListeners().size();
        for (int i = 0; i < size; i++) {
            getListeners().get(i).mo8onTotalCaptureResultCcXjc1I(requestMetadata, frameNumber, androidFrameInfo);
        }
        Debug debug2 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i2 = 0; i2 < size2; i2++) {
            requestMetadata.getRequest().getListeners().get(i2).mo8onTotalCaptureResultCcXjc1I(requestMetadata, frameNumber, androidFrameInfo);
        }
        Debug debug3 = Debug.INSTANCE;
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        CaptureSequences captureSequences2 = CaptureSequences.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size3 = getListeners().size();
        for (int i3 = 0; i3 < size3; i3++) {
            getListeners().get(i3).mo6onCompleteCcXjc1I(requestMetadata, frameNumber, androidFrameInfo);
        }
        Debug debug4 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = requestMetadata.getRequest().getListeners().size();
        for (int i5 = 0; i5 < size4; i5++) {
            requestMetadata.getRequest().getListeners().get(i5).mo6onCompleteCcXjc1I(requestMetadata, frameNumber, androidFrameInfo);
        }
        Debug debug5 = Debug.INSTANCE;
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(@NotNull CameraCaptureSession captureSession, @NotNull CaptureRequest captureRequest, @NotNull CaptureFailure captureFailure) {
        Intrinsics.checkNotNullParameter(captureSession, "captureSession");
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Intrinsics.checkNotNullParameter(captureFailure, "captureFailure");
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("onCaptureFailed");
        ((r) this.hasStarted).U(Unit.f186387a);
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        m389invokeCaptureFailureCcXjc1I(requestMetadata, FrameNumber.m222constructorimpl(captureFailure.getFrameNumber()), new AndroidCaptureFailure(requestMetadata, captureFailure));
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    /* JADX INFO: renamed from: onCaptureFailed-RuT0dZU */
    public void mo387onCaptureFailedRuT0dZU(@NotNull CaptureRequest captureRequest, long frameNumber) {
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("onCaptureFailed");
        ((r) this.hasStarted).U(Unit.f186387a);
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        m389invokeCaptureFailureCcXjc1I(requestMetadata, frameNumber, new ExtensionRequestFailure(requestMetadata, false, frameNumber, 0, null));
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    public void onCaptureProcessProgressed(@NotNull CaptureRequest captureRequest, int progress) {
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("onCaptureProcessProgressed");
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        CaptureSequences captureSequences = CaptureSequences.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size = getListeners().size();
        for (int i = 0; i < size; i++) {
            getListeners().get(i).onCaptureProgress(requestMetadata, progress);
        }
        Debug debug2 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i2 = 0; i2 < size2; i2++) {
            requestMetadata.getRequest().getListeners().get(i2).onCaptureProgress(requestMetadata, progress);
        }
        Debug debug3 = Debug.INSTANCE;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(@NotNull CameraCaptureSession captureSession, @NotNull CaptureRequest captureRequest, @NotNull CaptureResult partialCaptureResult) {
        Intrinsics.checkNotNullParameter(captureSession, "captureSession");
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Intrinsics.checkNotNullParameter(partialCaptureResult, "partialCaptureResult");
        onCaptureProgressed(captureRequest, partialCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(@NotNull CameraCaptureSession captureSession, int captureSequenceId) {
        Intrinsics.checkNotNullParameter(captureSession, "captureSession");
        onCaptureSequenceAborted(captureSequenceId);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(@NotNull CameraCaptureSession captureSession, int captureSequenceId, long captureFrameNumber) {
        Intrinsics.checkNotNullParameter(captureSession, "captureSession");
        onCaptureSequenceCompleted(captureSequenceId, captureFrameNumber);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(@NotNull CameraCaptureSession captureSession, @NotNull CaptureRequest captureRequest, long captureTimestamp, long captureFrameNumber) {
        Intrinsics.checkNotNullParameter(captureSession, "captureSession");
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        onCaptureStarted(captureRequest, captureFrameNumber, captureTimestamp);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(@NotNull CameraCaptureSession session, @NotNull CaptureRequest captureRequest, long captureTimestamp, long captureFrameNumber) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("onReadoutStarted");
        long jM342constructorimpl = SensorTimestamp.m342constructorimpl(captureTimestamp);
        long jM222constructorimpl = FrameNumber.m222constructorimpl(captureFrameNumber);
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        CaptureSequences captureSequences = CaptureSequences.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size = getListeners().size();
        for (int i = 0; i < size; i++) {
            getListeners().get(i).mo17onReadoutStartedmP9r9w(requestMetadata, jM222constructorimpl, jM342constructorimpl);
        }
        Debug debug2 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i2 = 0; i2 < size2; i2++) {
            requestMetadata.getRequest().getListeners().get(i2).mo17onReadoutStartedmP9r9w(requestMetadata, jM222constructorimpl, jM342constructorimpl);
        }
        Debug debug3 = Debug.INSTANCE;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    public void setSequenceNumber(int i) {
        this._sequenceNumber = Integer.valueOf(i);
    }

    @NotNull
    public String toString() {
        return "Camera2CaptureSequence-" + this.debugId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2CaptureSequence(String cameraId, boolean z, List<CaptureRequest> captureRequestList, List<? extends RequestMetadata> captureMetadataList, List<? extends Request.Listener> listeners, CaptureSequence.CaptureSequenceListener sequenceListener, Map<Surface, StreamId> surfaceToStreamMap, Map<Surface, OutputId> surfaceToOutputMap, StreamGraph streamGraph, StrictMode strictMode) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(captureRequestList, "captureRequestList");
        Intrinsics.checkNotNullParameter(captureMetadataList, "captureMetadataList");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        Intrinsics.checkNotNullParameter(sequenceListener, "sequenceListener");
        Intrinsics.checkNotNullParameter(surfaceToStreamMap, "surfaceToStreamMap");
        Intrinsics.checkNotNullParameter(surfaceToOutputMap, "surfaceToOutputMap");
        Intrinsics.checkNotNullParameter(streamGraph, "streamGraph");
        Intrinsics.checkNotNullParameter(strictMode, "strictMode");
        this.cameraId = cameraId;
        this.repeating = z;
        this.captureRequestList = captureRequestList;
        this.captureMetadataList = captureMetadataList;
        this.listeners = listeners;
        this.sequenceListener = sequenceListener;
        this.surfaceToStreamMap = surfaceToStreamMap;
        this.surfaceToOutputMap = surfaceToOutputMap;
        this.streamGraph = streamGraph;
        this.strictMode = strictMode;
        f captureSequenceDebugIds = Camera2CaptureSequenceProcessorKt.getCaptureSequenceDebugIds();
        captureSequenceDebugIds.getClass();
        this.debugId = f.f254897b.incrementAndGet(captureSequenceDebugIds);
        this.hasStarted = e0.b();
        if (getCaptureRequestList().size() != getCaptureMetadataList().size()) {
            throw new IllegalStateException("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        }
    }

    public void onCaptureProgressed(@NotNull CaptureRequest captureRequest, @NotNull CaptureResult partialCaptureResult) {
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Intrinsics.checkNotNullParameter(partialCaptureResult, "partialCaptureResult");
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("onCaptureProgressed");
        long jM222constructorimpl = FrameNumber.m222constructorimpl(partialCaptureResult.getFrameNumber());
        AndroidFrameMetadata androidFrameMetadata = new AndroidFrameMetadata(partialCaptureResult, getCameraId(), null);
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        CaptureSequences captureSequences = CaptureSequences.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size = getListeners().size();
        for (int i = 0; i < size; i++) {
            getListeners().get(i).mo16onPartialCaptureResultCcXjc1I(requestMetadata, jM222constructorimpl, androidFrameMetadata);
        }
        Debug debug2 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i2 = 0; i2 < size2; i2++) {
            requestMetadata.getRequest().getListeners().get(i2).mo16onPartialCaptureResultCcXjc1I(requestMetadata, jM222constructorimpl, androidFrameMetadata);
        }
        Debug debug3 = Debug.INSTANCE;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    public void onCaptureSequenceAborted(int captureSequenceId) {
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("onCaptureSequenceAborted");
        ((r) this.hasStarted).U(Unit.f186387a);
        getSequenceListener().onCaptureSequenceComplete(this);
        StrictMode strictMode = this.strictMode;
        if (!(getSequenceNumber() == captureSequenceId)) {
            String str = "onCaptureSequenceAborted was invoked on " + getSequenceNumber() + ", but expected " + captureSequenceId + '!';
            if (strictMode.getEnabled()) {
                throw new IllegalStateException(str);
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
            }
        }
        CaptureSequences captureSequences = CaptureSequences.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size = getCaptureMetadataList().size();
        for (int i = 0; i < size; i++) {
            RequestMetadata requestMetadata = getCaptureMetadataList().get(i);
            int size2 = getListeners().size();
            for (int i2 = 0; i2 < size2; i2++) {
                getListeners().get(i2).onRequestSequenceAborted(requestMetadata);
            }
        }
        Debug debug2 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = getCaptureMetadataList().size();
        for (int i3 = 0; i3 < size3; i3++) {
            RequestMetadata requestMetadata2 = getCaptureMetadataList().get(i3);
            int size4 = requestMetadata2.getRequest().getListeners().size();
            for (int i5 = 0; i5 < size4; i5++) {
                requestMetadata2.getRequest().getListeners().get(i5).onRequestSequenceAborted(requestMetadata2);
            }
        }
        Debug debug3 = Debug.INSTANCE;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    public void onCaptureSequenceCompleted(int captureSequenceId, long captureFrameNumber) {
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("onCaptureSequenceCompleted");
        ((r) this.hasStarted).U(Unit.f186387a);
        getSequenceListener().onCaptureSequenceComplete(this);
        StrictMode strictMode = this.strictMode;
        if (!(getSequenceNumber() == captureSequenceId)) {
            String str = "onCaptureSequenceCompleted was invoked on " + getSequenceNumber() + ", but expected " + captureSequenceId + '!';
            if (strictMode.getEnabled()) {
                throw new IllegalStateException(str);
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
            }
        }
        long jM222constructorimpl = FrameNumber.m222constructorimpl(captureFrameNumber);
        CaptureSequences captureSequences = CaptureSequences.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size = getCaptureMetadataList().size();
        for (int i = 0; i < size; i++) {
            RequestMetadata requestMetadata = getCaptureMetadataList().get(i);
            int size2 = getListeners().size();
            for (int i2 = 0; i2 < size2; i2++) {
                getListeners().get(i2).mo18onRequestSequenceCompletedRuT0dZU(requestMetadata, jM222constructorimpl);
            }
        }
        Debug debug2 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = getCaptureMetadataList().size();
        for (int i3 = 0; i3 < size3; i3++) {
            RequestMetadata requestMetadata2 = getCaptureMetadataList().get(i3);
            int size4 = requestMetadata2.getRequest().getListeners().size();
            for (int i5 = 0; i5 < size4; i5++) {
                requestMetadata2.getRequest().getListeners().get(i5).mo18onRequestSequenceCompletedRuT0dZU(requestMetadata2, jM222constructorimpl);
            }
        }
        Debug debug3 = Debug.INSTANCE;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    public void onCaptureStarted(@NotNull CaptureRequest captureRequest, long captureFrameNumber, long captureTimestamp) {
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Debug debug = Debug.INSTANCE;
        Trace.beginSection("onCaptureStarted");
        long jM196constructorimpl = CameraTimestamp.m196constructorimpl(captureTimestamp);
        long jM222constructorimpl = FrameNumber.m222constructorimpl(captureFrameNumber);
        ((r) this.hasStarted).U(Unit.f186387a);
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        CaptureSequences captureSequences = CaptureSequences.INSTANCE;
        Trace.beginSection("InvokeInternalListeners");
        int size = getListeners().size();
        for (int i = 0; i < size; i++) {
            getListeners().get(i).mo19onStarteduGKBvU4(requestMetadata, jM222constructorimpl, jM196constructorimpl);
        }
        Debug debug2 = Debug.INSTANCE;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i2 = 0; i2 < size2; i2++) {
            requestMetadata.getRequest().getListeners().get(i2).mo19onStarteduGKBvU4(requestMetadata, jM222constructorimpl, jM196constructorimpl);
        }
        Debug debug3 = Debug.INSTANCE;
        Trace.endSection();
        Trace.endSection();
    }
}
