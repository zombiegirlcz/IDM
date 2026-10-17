package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.CaptureSequence;
import androidx.camera.camera2.pipe.CaptureSequenceProcessor;
import androidx.camera.camera2.pipe.InputStream;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.media.AndroidImageWriter;
import androidx.camera.camera2.pipe.media.ImageWriterWrapper;
import gim.d;
import gim.i;
import ib.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import v1.c;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001EBa\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017Jr\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0012\u0010$\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u000b2\u0012\u0010%\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u000b2\u0012\u0010&\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u000b2\u0006\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\"H\u0016J\u0017\u0010+\u001a\u0004\u0018\u00010\u001a2\u0006\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020/H\u0016J\u000e\u00101\u001a\u00020/H\u0096@¢\u0006\u0002\u00102J\r\u00103\u001a\u00020/H\u0000¢\u0006\u0002\b4J\b\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020/2\u0006\u0010,\u001a\u00020\u0003H\u0002J\u001e\u0010:\u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002JR\u0010;\u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\f0=2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0=2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0=H\u0002J!\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010DR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessor;", "Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;", "Landroid/hardware/camera2/CaptureRequest;", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequence;", b.Session, "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "threads", "Landroidx/camera/camera2/pipe/core/Threads;", "template", "Landroidx/camera/camera2/pipe/RequestTemplate;", "streamToSurfaceMap", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "outputToSurfaceMap", "Landroidx/camera/camera2/pipe/OutputId;", "streamGraph", "Landroidx/camera/camera2/pipe/StreamGraph;", "strictMode", "Landroidx/camera/camera2/pipe/StrictMode;", "awaitRepeatingRequestOnDisconnect", "", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;Landroidx/camera/camera2/pipe/core/Threads;ILjava/util/Map;Ljava/util/Map;Landroidx/camera/camera2/pipe/StreamGraph;Landroidx/camera/camera2/pipe/StrictMode;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "debugId", "", "lock", "", "disconnected", "lastSingleRepeatingRequestSequence", "build", "isRepeating", "requests", "", "Landroidx/camera/camera2/pipe/Request;", "defaultParameters", "graphParameters", "requiredParameters", "sequenceListener", "Landroidx/camera/camera2/pipe/CaptureSequence$CaptureSequenceListener;", "listeners", "Landroidx/camera/camera2/pipe/Request$Listener;", "submit", "captureSequence", "(Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequence;)Ljava/lang/Integer;", "abortCaptures", "", "stopRepeating", "shutdown", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "disconnect$camera_camera2_pipe", "toString", "", "awaitRepeatingRequestStarted", "imageWriter", "Landroidx/camera/camera2/pipe/media/ImageWriterWrapper;", "validateRequestList", "buildSurfaceMaps", "surfaceToStreamMap", "", "surfaceToOutputMap", "buildCaptureRequestBuilder", "Landroid/hardware/camera2/CaptureRequest$Builder;", "request", "requestTemplate", "buildCaptureRequestBuilder-0UCm73U", "(Landroidx/camera/camera2/pipe/Request;I)Landroid/hardware/camera2/CaptureRequest$Builder;", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CaptureSequenceProcessor implements CaptureSequenceProcessor<CaptureRequest, Camera2CaptureSequence> {
    private final boolean awaitRepeatingRequestOnDisconnect;
    private final int debugId;
    private boolean disconnected;
    private final ImageWriterWrapper imageWriter;
    private Camera2CaptureSequence lastSingleRepeatingRequestSequence;

    @NotNull
    private final Object lock;

    @NotNull
    private final Map<OutputId, Surface> outputToSurfaceMap;

    @NotNull
    private final CameraCaptureSessionWrapper session;

    @NotNull
    private final StreamGraph streamGraph;

    @NotNull
    private final Map<StreamId, Surface> streamToSurfaceMap;

    @NotNull
    private final StrictMode strictMode;
    private final int template;

    @NotNull
    private final Threads threads;

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor$awaitRepeatingRequestStarted$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor$awaitRepeatingRequestStarted$2", f = "Camera2CaptureSequenceProcessor.kt", l = {395}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Camera2CaptureSequence $captureSequence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Camera2CaptureSequence camera2CaptureSequence, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$captureSequence = camera2CaptureSequence;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$captureSequence, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                Camera2CaptureSequence camera2CaptureSequence = this.$captureSequence;
                this.label = 1;
                if (camera2CaptureSequence.awaitStarted$camera_camera2_pipe(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public /* synthetic */ Camera2CaptureSequenceProcessor(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, Threads threads, int i, Map map, Map map2, StreamGraph streamGraph, StrictMode strictMode, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraCaptureSessionWrapper, threads, i, map, map2, streamGraph, strictMode, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void awaitRepeatingRequestStarted(Camera2CaptureSequence captureSequence) {
        Log log2 = Log.INSTANCE;
        if (log2.getDEBUG_LOGGABLE()) {
            String str = "Waiting for the last repeating request sequence: " + captureSequence;
        }
        if (((Unit) this.threads.runBlockingCheckedOrNull(2000L, new AnonymousClass2(captureSequence, null))) == null && log2.getERROR_LOGGABLE()) {
            String str2 = this + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + captureSequence;
        }
    }

    /* JADX INFO: renamed from: buildCaptureRequestBuilder-0UCm73U, reason: not valid java name */
    private final CaptureRequest.Builder m391buildCaptureRequestBuilder0UCm73U(Request request, int requestTemplate) {
        CaptureRequest.Builder builderMo364createCaptureRequest2PPcXtw;
        if (request.getInputRequest() != null) {
            TotalCaptureResult totalCaptureResult = (TotalCaptureResult) request.getInputRequest().getFrameInfo().unwrapAs(o0.f186429a.b(TotalCaptureResult.class));
            if (totalCaptureResult == null) {
                throw new IllegalStateException(("Failed to unwrap FrameInfo " + request.getInputRequest().getFrameInfo() + " as TotalCaptureResult").toString());
            }
            builderMo364createCaptureRequest2PPcXtw = this.session.getDevice().createReprocessCaptureRequest(totalCaptureResult);
        } else {
            builderMo364createCaptureRequest2PPcXtw = this.session.getDevice().mo364createCaptureRequest2PPcXtw(requestTemplate);
        }
        if (builderMo364createCaptureRequest2PPcXtw != null) {
            return builderMo364createCaptureRequest2PPcXtw;
        }
        if (request.getInputRequest() != null) {
            if (!Log.INSTANCE.getINFO_LOGGABLE()) {
                return null;
            }
            String str = "Failed to create a ReprocessingCaptureRequest.Builder from " + request.getInputRequest().getFrameInfo() + '!';
            return null;
        }
        if (!Log.INSTANCE.getINFO_LOGGABLE()) {
            return null;
        }
        String str2 = "Failed to create a CaptureRequest.Builder from " + ((Object) RequestTemplate.m330toStringimpl(requestTemplate)) + '!';
        return null;
    }

    private final boolean buildSurfaceMaps(List<Request> requests, Map<Surface, StreamId> surfaceToStreamMap, Map<Surface, OutputId> surfaceToOutputMap, Map<StreamId, Surface> streamToSurfaceMap) {
        if (requests.isEmpty()) {
            throw new IllegalStateException("build(...) should never be called with an empty request list!");
        }
        for (Request request : requests) {
            Iterator<StreamId> it8 = request.getStreams().iterator();
            boolean z = false;
            while (it8.hasNext()) {
                int value = it8.next().getValue();
                if (!streamToSurfaceMap.containsKey(StreamId.m355boximpl(value))) {
                    Surface surface = this.streamToSurfaceMap.get(StreamId.m355boximpl(value));
                    if (surface != null) {
                        surfaceToStreamMap.put(surface, StreamId.m355boximpl(value));
                        streamToSurfaceMap.put(StreamId.m355boximpl(value), surface);
                        CameraStream cameraStreamM353getaKI5c8E = this.streamGraph.m353getaKI5c8E(value);
                        if (cameraStreamM353getaKI5c8E == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        for (OutputStream outputStream : cameraStreamM353getaKI5c8E.getOutputs()) {
                            Surface surface2 = this.outputToSurfaceMap.get(OutputId.m244boximpl(outputStream.getId()));
                            if (surface2 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            surfaceToOutputMap.put(surface2, OutputId.m244boximpl(outputStream.getId()));
                        }
                    } else {
                        continue;
                    }
                }
                z = true;
            }
            if (!z) {
                if (Log.INSTANCE.getINFO_LOGGABLE()) {
                    String str = "  Failed to bind any surfaces for " + request + '!';
                }
                return false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.");
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[LOOP:2: B:57:0x0101->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[LOOP:4: B:15:0x003b->B:130:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean validateRequestList(java.util.List<androidx.camera.camera2.pipe.Request> r14, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper r15) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor.validateRequestList(java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper):boolean");
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    public void abortCaptures() {
        synchronized (this.lock) {
            try {
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    String str = this + "#abortCaptures";
                }
                this.session.abortCaptures();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    public /* bridge */ /* synthetic */ CaptureSequence build(boolean z, List list, Map map, Map map2, Map map3, CaptureSequence.CaptureSequenceListener captureSequenceListener, List list2) {
        return build(z, (List<Request>) list, (Map<?, ? extends Object>) map, (Map<?, ? extends Object>) map2, (Map<?, ? extends Object>) map3, captureSequenceListener, (List<? extends Request.Listener>) list2);
    }

    public final void disconnect$camera_camera2_pipe() {
        Camera2CaptureSequence camera2CaptureSequence;
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.lock) {
                try {
                    if (this.disconnected) {
                        camera2CaptureSequence = null;
                    } else {
                        this.disconnected = true;
                        ImageWriterWrapper imageWriterWrapper = this.imageWriter;
                        if (imageWriterWrapper != null) {
                            c.y(imageWriterWrapper);
                        }
                        Surface inputSurface = this.session.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        camera2CaptureSequence = this.lastSingleRepeatingRequestSequence;
                    }
                } finally {
                }
            }
            if (this.awaitRepeatingRequestOnDisconnect && camera2CaptureSequence != null) {
                awaitRepeatingRequestStarted(camera2CaptureSequence);
            }
            Unit unit = Unit.f186387a;
            Trace.endSection();
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    public Object shutdown(@NotNull Continuation<? super Unit> continuation) {
        disconnect$camera_camera2_pipe();
        return Unit.f186387a;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    public void stopRepeating() {
        synchronized (this.lock) {
            try {
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    String str = this + "#stopRepeating";
                }
                this.session.stopRepeating();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @NotNull
    public String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.debugId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2CaptureSequenceProcessor(CameraCaptureSessionWrapper session, Threads threads, int i, Map<StreamId, ? extends Surface> streamToSurfaceMap, Map<OutputId, ? extends Surface> outputToSurfaceMap, StreamGraph streamGraph, StrictMode strictMode, boolean z) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(streamToSurfaceMap, "streamToSurfaceMap");
        Intrinsics.checkNotNullParameter(outputToSurfaceMap, "outputToSurfaceMap");
        Intrinsics.checkNotNullParameter(streamGraph, "streamGraph");
        Intrinsics.checkNotNullParameter(strictMode, "strictMode");
        this.session = session;
        this.threads = threads;
        this.template = i;
        this.streamToSurfaceMap = streamToSurfaceMap;
        this.outputToSurfaceMap = outputToSurfaceMap;
        this.streamGraph = streamGraph;
        this.strictMode = strictMode;
        this.awaitRepeatingRequestOnDisconnect = z;
        rkm.d captureSequenceProcessorDebugIds = Camera2CaptureSequenceProcessorKt.getCaptureSequenceProcessorDebugIds();
        captureSequenceProcessorDebugIds.getClass();
        this.debugId = rkm.d.f254895b.incrementAndGet(captureSequenceProcessorDebugIds);
        this.lock = new Object();
        ImageWriterWrapper imageWriterWrapperM513createU86x6Zg = null;
        if (!streamGraph.getInputs().isEmpty()) {
            InputStream inputStream = (InputStream) d0.b0(streamGraph.getInputs());
            Surface inputSurface = session.getInputSurface();
            if (inputSurface == null) {
                throw new IllegalStateException("inputSurface is required to create instance of imageWriter.");
            }
            try {
                imageWriterWrapperM513createU86x6Zg = AndroidImageWriter.INSTANCE.m513createU86x6Zg(inputSurface, inputStream.getId(), inputStream.getMaxImages(), StreamFormat.m343boximpl(inputStream.getFormat()), threads.getCamera2Handler());
            } catch (RuntimeException e) {
                if (Log.INSTANCE.getERROR_LOGGABLE()) {
                    String str = "Failed to create ImageWriter for session " + this.session + "! Reprocessing will not be supported!";
                }
            }
            if (imageWriterWrapperM513createU86x6Zg != null && Log.INSTANCE.getDEBUG_LOGGABLE()) {
                String str2 = "Created ImageWriter " + imageWriterWrapperM513createU86x6Zg + " for session " + this.session;
            }
        }
        this.imageWriter = imageWriterWrapperM513createU86x6Zg;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027c A[LOOP:3: B:81:0x01f4->B:109:0x027c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028a A[EDGE_INSN: B:141:0x028a->B:110:0x028a BREAK  A[LOOP:3: B:81:0x01f4->B:109:0x027c], SYNTHETIC] */
    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.camera.camera2.pipe.compat.Camera2CaptureSequence build(boolean r27, @org.jetbrains.annotations.NotNull java.util.List<androidx.camera.camera2.pipe.Request> r28, @org.jetbrains.annotations.NotNull java.util.Map<?, ? extends java.lang.Object> r29, @org.jetbrains.annotations.NotNull java.util.Map<?, ? extends java.lang.Object> r30, @org.jetbrains.annotations.NotNull java.util.Map<?, ? extends java.lang.Object> r31, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.CaptureSequence.CaptureSequenceListener r32, @org.jetbrains.annotations.NotNull java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> r33) {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor.build(boolean, java.util.List, java.util.Map, java.util.Map, java.util.Map, androidx.camera.camera2.pipe.CaptureSequence$CaptureSequenceListener, java.util.List):androidx.camera.camera2.pipe.compat.Camera2CaptureSequence");
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    public Integer submit(@NotNull Camera2CaptureSequence captureSequence) {
        Integer repeatingBurst;
        Intrinsics.checkNotNullParameter(captureSequence, "captureSequence");
        synchronized (this.lock) {
            if (this.disconnected) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str = this + " disconnected. " + captureSequence + " won't be submitted";
                }
                return null;
            }
            if (captureSequence.getCaptureRequestList().size() != 1 || (this.session instanceof CameraConstrainedHighSpeedCaptureSessionWrapper)) {
                repeatingBurst = captureSequence.getRepeating() ? this.session.setRepeatingBurst(captureSequence.getCaptureRequestList(), captureSequence) : this.session.captureBurst(captureSequence.getCaptureRequestList(), captureSequence);
            } else if (captureSequence.getRepeating()) {
                if (this.awaitRepeatingRequestOnDisconnect) {
                    this.lastSingleRepeatingRequestSequence = captureSequence;
                }
                repeatingBurst = this.session.setRepeatingRequest(captureSequence.getCaptureRequestList().get(0), captureSequence);
            } else {
                repeatingBurst = this.session.capture(captureSequence.getCaptureRequestList().get(0), captureSequence);
            }
            return repeatingBurst;
        }
    }
}
