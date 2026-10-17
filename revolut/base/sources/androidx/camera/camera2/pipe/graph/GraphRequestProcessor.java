package androidx.camera.camera2.pipe.graph;

import android.content.res.TypedArray;
import android.hardware.camera2.CameraAccessException;
import android.media.MediaMetadataRetriever;
import android.os.Trace;
import androidx.camera.camera2.pipe.CaptureSequence;
import androidx.camera.camera2.pipe.CaptureSequenceProcessor;
import androidx.camera.camera2.pipe.CaptureSequences;
import androidx.camera.camera2.pipe.InputRequest;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import fim.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.b;
import rkm.d;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\b\u0005*\u0001+\u0018\u0000 .2\u00020\u0001:\u0001.B#\b\u0002\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\r\u0010\u000eJo\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "", "Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;", "Landroidx/camera/camera2/pipe/CaptureSequence;", "captureSequenceProcessor", "<init>", "(Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;)V", "", "abortCaptures$camera_camera2_pipe", "()V", "abortCaptures", "stopRepeating$camera_camera2_pipe", "stopRepeating", "shutdown$camera_camera2_pipe", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shutdown", "", "isRepeating", "", "Landroidx/camera/camera2/pipe/Request;", "requests", "", "defaultParameters", "graphParameters", "requiredParameters", "Landroidx/camera/camera2/pipe/Request$Listener;", "listeners", "submit$camera_camera2_pipe", "(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z", "submit", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;", "", "debugId", "I", "Lrkm/b;", "closed", "Lrkm/b;", "", "activeCaptureSequences", "Ljava/util/List;", "androidx/camera/camera2/pipe/graph/GraphRequestProcessor$activeBurstListener$1", "activeBurstListener", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor$activeBurstListener$1;", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GraphRequestProcessor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final GraphRequestProcessor$activeBurstListener$1 activeBurstListener;

    @NotNull
    private final List<CaptureSequence<?>> activeCaptureSequences;

    @NotNull
    private final CaptureSequenceProcessor<Object, CaptureSequence<Object>> captureSequenceProcessor;

    @NotNull
    private final b closed;
    private final int debugId;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor$Companion;", "", "<init>", "()V", "from", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "captureSequenceProcessor", "Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GraphRequestProcessor from(@NotNull CaptureSequenceProcessor<?, ?> captureSequenceProcessor) {
            Intrinsics.checkNotNullParameter(captureSequenceProcessor, "captureSequenceProcessor");
            return new GraphRequestProcessor(captureSequenceProcessor, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ GraphRequestProcessor(CaptureSequenceProcessor captureSequenceProcessor, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureSequenceProcessor);
    }

    public final void abortCaptures$camera_camera2_pipe() {
        List<CaptureSequence> listD1;
        synchronized (this.activeCaptureSequences) {
            listD1 = d0.d1(this.activeCaptureSequences);
            this.activeCaptureSequences.clear();
        }
        for (CaptureSequence captureSequence : listD1) {
            CaptureSequences captureSequences = CaptureSequences.INSTANCE;
            Debug debug = Debug.INSTANCE;
            Trace.beginSection("InvokeInternalListeners");
            int size = captureSequence.getCaptureMetadataList().size();
            for (int i = 0; i < size; i++) {
                RequestMetadata requestMetadata = captureSequence.getCaptureMetadataList().get(i);
                int size2 = captureSequence.getListeners().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    captureSequence.getListeners().get(i2).onAborted(requestMetadata.getRequest());
                }
            }
            Debug debug2 = Debug.INSTANCE;
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = captureSequence.getCaptureMetadataList().size();
            for (int i3 = 0; i3 < size3; i3++) {
                RequestMetadata requestMetadata2 = captureSequence.getCaptureMetadataList().get(i3);
                int size4 = requestMetadata2.getRequest().getListeners().size();
                for (int i5 = 0; i5 < size4; i5++) {
                    requestMetadata2.getRequest().getListeners().get(i5).onAborted(requestMetadata2.getRequest());
                }
            }
            Debug debug3 = Debug.INSTANCE;
            Trace.endSection();
        }
        this.captureSequenceProcessor.abortCaptures();
    }

    public final Object shutdown$camera_camera2_pipe(@NotNull Continuation<? super Unit> continuation) {
        Object objShutdown;
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = "Closing " + this;
        }
        return (this.closed.a() && (objShutdown = this.captureSequenceProcessor.shutdown(continuation)) == a.COROUTINE_SUSPENDED) ? objShutdown : Unit.f186387a;
    }

    public final void stopRepeating$camera_camera2_pipe() {
        this.captureSequenceProcessor.stopRepeating();
    }

    public final boolean submit$camera_camera2_pipe(boolean isRepeating, @NotNull List<Request> requests, @NotNull Map<?, ? extends Object> defaultParameters, @NotNull Map<?, ? extends Object> graphParameters, @NotNull Map<?, ? extends Object> requiredParameters, @NotNull List<? extends Request.Listener> listeners) throws Exception {
        Throwable th10;
        boolean z;
        AutoCloseable image;
        boolean zIsTerminated;
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
        Intrinsics.checkNotNullParameter(graphParameters, "graphParameters");
        Intrinsics.checkNotNullParameter(requiredParameters, "requiredParameters");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        if (!this.closed.b()) {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection("CXCP#buildCaptureSequence");
                CaptureSequence<?> captureSequenceBuild = this.captureSequenceProcessor.build(isRepeating, requests, defaultParameters, graphParameters, requiredParameters, this.activeBurstListener, listeners);
                Trace.endSection();
                boolean z3 = true;
                if (captureSequenceBuild == null) {
                    List<Request> list = requests;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it8 = list.iterator();
                        while (it8.hasNext()) {
                            if (((Request) it8.next()).getInputRequest() != null) {
                                for (Request request : requests) {
                                    InputRequest inputRequest = request.getInputRequest();
                                    if (inputRequest != null && (image = inputRequest.getImage()) != null) {
                                        if (image instanceof AutoCloseable) {
                                            image.close();
                                        } else if (image instanceof ExecutorService) {
                                            ExecutorService executorService = (ExecutorService) image;
                                            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                                executorService.shutdown();
                                                boolean z4 = false;
                                                while (!zIsTerminated) {
                                                    try {
                                                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                    } catch (InterruptedException unused) {
                                                        if (!z4) {
                                                            executorService.shutdownNow();
                                                            z4 = true;
                                                        }
                                                    }
                                                }
                                                if (z4) {
                                                    Thread.currentThread().interrupt();
                                                }
                                            }
                                        } else if (image instanceof TypedArray) {
                                            ((TypedArray) image).recycle();
                                        } else {
                                            if (!(image instanceof MediaMetadataRetriever)) {
                                                throw new IllegalArgumentException();
                                            }
                                            ((MediaMetadataRetriever) image).release();
                                        }
                                        Unit unit = Unit.f186387a;
                                    }
                                    Iterator<Request.Listener> it9 = request.getListeners().iterator();
                                    while (it9.hasNext()) {
                                        it9.next().onAborted(request);
                                    }
                                }
                                return true;
                            }
                        }
                    }
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        String str = "Failed to submit " + requests + ": " + this + " failed to build CaptureSequence.";
                        return false;
                    }
                } else if (!this.closed.b()) {
                    if (!captureSequenceBuild.getRepeating()) {
                        synchronized (this.activeCaptureSequences) {
                            this.activeCaptureSequences.add(captureSequenceBuild);
                        }
                    }
                    try {
                        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                            String str2 = this + " submitting " + captureSequenceBuild;
                        }
                        CaptureSequences captureSequences = CaptureSequences.INSTANCE;
                        Trace.beginSection("InvokeInternalListeners");
                        int size = captureSequenceBuild.getCaptureMetadataList().size();
                        for (int i = 0; i < size; i++) {
                            RequestMetadata requestMetadata = captureSequenceBuild.getCaptureMetadataList().get(i);
                            int size2 = captureSequenceBuild.getListeners().size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                captureSequenceBuild.getListeners().get(i2).onRequestSequenceCreated(requestMetadata);
                            }
                        }
                        Debug debug2 = Debug.INSTANCE;
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size3 = captureSequenceBuild.getCaptureMetadataList().size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            RequestMetadata requestMetadata2 = captureSequenceBuild.getCaptureMetadataList().get(i3);
                            int size4 = requestMetadata2.getRequest().getListeners().size();
                            for (int i5 = 0; i5 < size4; i5++) {
                                requestMetadata2.getRequest().getListeners().get(i5).onRequestSequenceCreated(requestMetadata2);
                            }
                        }
                        Debug debug3 = Debug.INSTANCE;
                        synchronized (captureSequenceBuild) {
                            if (!this.closed.b()) {
                                try {
                                    Trace.beginSection("CXCP#submit(CaptureSequence)");
                                    Integer numSubmit = this.captureSequenceProcessor.submit(captureSequenceBuild);
                                    int iIntValue = numSubmit != null ? numSubmit.intValue() : -1;
                                    captureSequenceBuild.setSequenceNumber(iIntValue);
                                    if (iIntValue != -1) {
                                        CaptureSequences captureSequences2 = CaptureSequences.INSTANCE;
                                        Trace.beginSection("InvokeInternalListeners");
                                        int size5 = captureSequenceBuild.getCaptureMetadataList().size();
                                        for (int i6 = 0; i6 < size5; i6++) {
                                            RequestMetadata requestMetadata3 = captureSequenceBuild.getCaptureMetadataList().get(i6);
                                            int size6 = captureSequenceBuild.getListeners().size();
                                            for (int i21 = 0; i21 < size6; i21++) {
                                                captureSequenceBuild.getListeners().get(i21).onRequestSequenceSubmitted(requestMetadata3);
                                            }
                                        }
                                        Debug debug4 = Debug.INSTANCE;
                                        Trace.endSection();
                                        Trace.beginSection("InvokeRequestListeners");
                                        int size7 = captureSequenceBuild.getCaptureMetadataList().size();
                                        for (int i22 = 0; i22 < size7; i22++) {
                                            RequestMetadata requestMetadata4 = captureSequenceBuild.getCaptureMetadataList().get(i22);
                                            int size8 = requestMetadata4.getRequest().getListeners().size();
                                            for (int i32 = 0; i32 < size8; i32++) {
                                                requestMetadata4.getRequest().getListeners().get(i32).onRequestSequenceSubmitted(requestMetadata4);
                                            }
                                        }
                                        Debug debug5 = Debug.INSTANCE;
                                        try {
                                            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                                                String str3 = this + " submitted " + captureSequenceBuild;
                                            }
                                            z = true;
                                        } catch (CameraAccessException unused2) {
                                        } catch (Throwable th11) {
                                            th10 = th11;
                                            if (z3 || captureSequenceBuild.getRepeating()) {
                                                throw th10;
                                            }
                                            synchronized (this.activeCaptureSequences) {
                                                this.activeCaptureSequences.remove(captureSequenceBuild);
                                            }
                                            CaptureSequences captureSequences3 = CaptureSequences.INSTANCE;
                                            Debug debug6 = Debug.INSTANCE;
                                            Trace.beginSection("InvokeInternalListeners");
                                            int size9 = captureSequenceBuild.getCaptureMetadataList().size();
                                            for (int i33 = 0; i33 < size9; i33++) {
                                                RequestMetadata requestMetadata5 = captureSequenceBuild.getCaptureMetadataList().get(i33);
                                                int size10 = captureSequenceBuild.getListeners().size();
                                                for (int i43 = 0; i43 < size10; i43++) {
                                                    captureSequenceBuild.getListeners().get(i43).onAborted(requestMetadata5.getRequest());
                                                }
                                            }
                                            Debug debug7 = Debug.INSTANCE;
                                            Trace.endSection();
                                            Trace.beginSection("InvokeRequestListeners");
                                            int size11 = captureSequenceBuild.getCaptureMetadataList().size();
                                            for (int i59 = 0; i59 < size11; i59++) {
                                                RequestMetadata requestMetadata6 = captureSequenceBuild.getCaptureMetadataList().get(i59);
                                                int size12 = requestMetadata6.getRequest().getListeners().size();
                                                for (int i66 = 0; i66 < size12; i66++) {
                                                    requestMetadata6.getRequest().getListeners().get(i66).onAborted(requestMetadata6.getRequest());
                                                }
                                            }
                                            Debug debug8 = Debug.INSTANCE;
                                            throw th10;
                                        }
                                    } else {
                                        if (Log.INSTANCE.getWARN_LOGGABLE()) {
                                            String str4 = "Failed to submit " + captureSequenceBuild + ": " + this + " received -1 from submit.";
                                        }
                                        z = false;
                                        z3 = false;
                                    }
                                    if (z || captureSequenceBuild.getRepeating()) {
                                        return z3;
                                    }
                                    synchronized (this.activeCaptureSequences) {
                                        this.activeCaptureSequences.remove(captureSequenceBuild);
                                    }
                                    CaptureSequences captureSequences4 = CaptureSequences.INSTANCE;
                                    Trace.beginSection("InvokeInternalListeners");
                                    int size13 = captureSequenceBuild.getCaptureMetadataList().size();
                                    for (int i74 = 0; i74 < size13; i74++) {
                                        RequestMetadata requestMetadata7 = captureSequenceBuild.getCaptureMetadataList().get(i74);
                                        int size14 = captureSequenceBuild.getListeners().size();
                                        for (int i92 = 0; i92 < size14; i92++) {
                                            captureSequenceBuild.getListeners().get(i92).onAborted(requestMetadata7.getRequest());
                                        }
                                    }
                                    Debug debug9 = Debug.INSTANCE;
                                    Trace.endSection();
                                    Trace.beginSection("InvokeRequestListeners");
                                    int size15 = captureSequenceBuild.getCaptureMetadataList().size();
                                    for (int i96 = 0; i96 < size15; i96++) {
                                        RequestMetadata requestMetadata8 = captureSequenceBuild.getCaptureMetadataList().get(i96);
                                        int size16 = requestMetadata8.getRequest().getListeners().size();
                                        for (int i99 = 0; i99 < size16; i99++) {
                                            requestMetadata8.getRequest().getListeners().get(i99).onAborted(requestMetadata8.getRequest());
                                        }
                                    }
                                    Debug debug10 = Debug.INSTANCE;
                                    return z3;
                                } finally {
                                }
                            }
                            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                                String str5 = "Failed to submit " + captureSequenceBuild + ": " + this + " is closed.";
                            }
                            if (!captureSequenceBuild.getRepeating()) {
                                synchronized (this.activeCaptureSequences) {
                                    this.activeCaptureSequences.remove(captureSequenceBuild);
                                }
                                CaptureSequences captureSequences5 = CaptureSequences.INSTANCE;
                                Trace.beginSection("InvokeInternalListeners");
                                int size17 = captureSequenceBuild.getCaptureMetadataList().size();
                                for (int i100 = 0; i100 < size17; i100++) {
                                    RequestMetadata requestMetadata9 = captureSequenceBuild.getCaptureMetadataList().get(i100);
                                    int size18 = captureSequenceBuild.getListeners().size();
                                    for (int i101 = 0; i101 < size18; i101++) {
                                        captureSequenceBuild.getListeners().get(i101).onAborted(requestMetadata9.getRequest());
                                    }
                                }
                                Debug debug11 = Debug.INSTANCE;
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size19 = captureSequenceBuild.getCaptureMetadataList().size();
                                for (int i102 = 0; i102 < size19; i102++) {
                                    RequestMetadata requestMetadata10 = captureSequenceBuild.getCaptureMetadataList().get(i102);
                                    int size20 = requestMetadata10.getRequest().getListeners().size();
                                    for (int i103 = 0; i103 < size20; i103++) {
                                        requestMetadata10.getRequest().getListeners().get(i103).onAborted(requestMetadata10.getRequest());
                                    }
                                }
                                Debug debug12 = Debug.INSTANCE;
                                return false;
                            }
                        }
                    } catch (CameraAccessException unused3) {
                        if (!captureSequenceBuild.getRepeating()) {
                            synchronized (this.activeCaptureSequences) {
                                this.activeCaptureSequences.remove(captureSequenceBuild);
                                CaptureSequences captureSequences6 = CaptureSequences.INSTANCE;
                                Debug debug13 = Debug.INSTANCE;
                                Trace.beginSection("InvokeInternalListeners");
                                int size21 = captureSequenceBuild.getCaptureMetadataList().size();
                                for (int i104 = 0; i104 < size21; i104++) {
                                    RequestMetadata requestMetadata11 = captureSequenceBuild.getCaptureMetadataList().get(i104);
                                    int size22 = captureSequenceBuild.getListeners().size();
                                    for (int i105 = 0; i105 < size22; i105++) {
                                        captureSequenceBuild.getListeners().get(i105).onAborted(requestMetadata11.getRequest());
                                    }
                                }
                                Debug debug14 = Debug.INSTANCE;
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size23 = captureSequenceBuild.getCaptureMetadataList().size();
                                for (int i106 = 0; i106 < size23; i106++) {
                                    RequestMetadata requestMetadata12 = captureSequenceBuild.getCaptureMetadataList().get(i106);
                                    int size24 = requestMetadata12.getRequest().getListeners().size();
                                    for (int i107 = 0; i107 < size24; i107++) {
                                        requestMetadata12.getRequest().getListeners().get(i107).onAborted(requestMetadata12.getRequest());
                                    }
                                }
                                Debug debug15 = Debug.INSTANCE;
                            }
                        }
                    } catch (Throwable th12) {
                        th10 = th12;
                        z3 = false;
                    }
                } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str6 = "Failed to submit " + requests + ": " + this + " is closed.";
                    return false;
                }
            } finally {
                Trace.endSection();
            }
        } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
            String str7 = "Failed to submit " + requests + ": " + this + " is closed.";
            return false;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "GraphRequestProcessor-" + this.debugId;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.camera.camera2.pipe.graph.GraphRequestProcessor$activeBurstListener$1] */
    private GraphRequestProcessor(CaptureSequenceProcessor<? extends Object, CaptureSequence<Object>> captureSequenceProcessor) {
        this.captureSequenceProcessor = captureSequenceProcessor;
        d graphRequestProcessorIds = GraphRequestProcessorKt.getGraphRequestProcessorIds();
        graphRequestProcessorIds.getClass();
        this.debugId = d.f254895b.incrementAndGet(graphRequestProcessorIds);
        this.closed = hx7.b.g(false);
        this.activeCaptureSequences = new ArrayList();
        this.activeBurstListener = new CaptureSequence.CaptureSequenceListener() { // from class: androidx.camera.camera2.pipe.graph.GraphRequestProcessor$activeBurstListener$1
            @Override // androidx.camera.camera2.pipe.CaptureSequence.CaptureSequenceListener
            public void onCaptureSequenceComplete(CaptureSequence<?> captureSequence) {
                Intrinsics.checkNotNullParameter(captureSequence, "captureSequence");
                if (captureSequence.getRepeating()) {
                    return;
                }
                List list = this.this$0.activeCaptureSequences;
                GraphRequestProcessor graphRequestProcessor = this.this$0;
                synchronized (list) {
                    graphRequestProcessor.activeCaptureSequences.remove(captureSequence);
                }
            }
        };
    }
}
