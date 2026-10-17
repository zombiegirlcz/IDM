package androidx.camera.camera2.pipe.internal;

import a0.b;
import aim.f;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.ImageSourceConfig;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.internal.FrameState;
import androidx.camera.camera2.pipe.internal.OutputResult;
import androidx.camera.camera2.pipe.media.ClosingFinalizer;
import androidx.camera.camera2.pipe.media.ImageListener;
import androidx.camera.camera2.pipe.media.ImageSource;
import androidx.camera.camera2.pipe.media.NoOpFinalizer;
import androidx.camera.camera2.pipe.media.OutputImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 C2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002DCB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010#\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0018018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R2\u00106\u001a \u0012\u0004\u0012\u00020\u001d\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002050104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroidx/camera/camera2/pipe/Request$Listener;", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraphImpl", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "frameCaptureQueue", "", "isCameraTimebaseRealtime", "", "realtimeToMonotonicOffsetNs", "<init>", "(Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;ZJ)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "timestamp", "", "onStarted-uGKBvU4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JJ)V", "onStarted", "Landroidx/camera/camera2/pipe/FrameInfo;", "result", "onComplete-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onComplete", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "onBufferLost-iiEMlm4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JII)V", "onBufferLost", "Landroidx/camera/camera2/pipe/RequestFailure;", "requestFailure", "onFailed-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/RequestFailure;)V", "onFailed", "Landroidx/camera/camera2/pipe/Request;", "request", "onAborted", "(Landroidx/camera/camera2/pipe/Request;)V", "close", "()V", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "Landroidx/camera/camera2/pipe/internal/OutputDistributor;", "frameInfoDistributor", "Landroidx/camera/camera2/pipe/internal/OutputDistributor;", "", "Landroidx/camera/camera2/pipe/media/OutputImage;", "imageDistributors", "Ljava/util/Map;", "", "Landroidx/camera/camera2/pipe/CameraStream;", "imageStreams", "Ljava/util/Set;", "Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;", "frameStartedListener", "Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;", "getFrameStartedListener", "()Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;", "setFrameStartedListener", "(Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;)V", "Companion", "FrameStartedListener", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameDistributor implements AutoCloseable, Request.Listener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final FrameCaptureQueue frameCaptureQueue;

    @NotNull
    private final OutputDistributor<FrameInfo> frameInfoDistributor;

    @NotNull
    private FrameStartedListener frameStartedListener;

    @NotNull
    private final Map<StreamId, Map<OutputId, OutputDistributor<OutputImage>>> imageDistributors;

    @NotNull
    private final Set<CameraStream> imageStreams;

    @NotNull
    private final StreamGraphImpl streamGraphImpl;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameDistributor$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/StreamId;", "cameraStreamId", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "cameraStreamConfig", "Landroidx/camera/camera2/pipe/ImageSourceConfig;", "imageSourceConfig", "", "isCameraTimebaseRealtime", "", "realtimeToMonotonicOffsetNs", "Landroidx/camera/camera2/pipe/internal/OutputMatcher;", "selectTimestampMatcher-5y4XNsE", "(ILandroidx/camera/camera2/pipe/CameraStream$Config;Landroidx/camera/camera2/pipe/ImageSourceConfig;ZJ)Landroidx/camera/camera2/pipe/internal/OutputMatcher;", "selectTimestampMatcher", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: selectTimestampMatcher-5y4XNsE, reason: not valid java name */
        public final OutputMatcher m490selectTimestampMatcher5y4XNsE(int cameraStreamId, CameraStream.Config cameraStreamConfig, ImageSourceConfig imageSourceConfig, boolean isCameraTimebaseRealtime, long realtimeToMonotonicOffsetNs) {
            if (!isCameraTimebaseRealtime) {
                if (Build.VERSION.SDK_INT >= 33) {
                    List<OutputStream.Config> outputs = cameraStreamConfig.getOutputs();
                    if (!(outputs instanceof Collection) || !outputs.isEmpty()) {
                        Iterator<T> it8 = outputs.iterator();
                        while (it8.hasNext()) {
                            ((OutputStream.Config) it8.next()).m276getTimestampBasepcPfPbY();
                            OutputStream.TimestampBase.INSTANCE.m315getTIMESTAMP_BASE_REALTIME6HVI0MA();
                        }
                    }
                }
                return OutputMatcher.INSTANCE.getEXACT();
            }
            if (Build.VERSION.SDK_INT >= 33) {
                List<OutputStream.Config> outputs2 = cameraStreamConfig.getOutputs();
                if (!(outputs2 instanceof Collection) || !outputs2.isEmpty()) {
                    Iterator<T> it9 = outputs2.iterator();
                    while (it9.hasNext()) {
                        ((OutputStream.Config) it9.next()).m276getTimestampBasepcPfPbY();
                    }
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 || i >= 33) {
                throw null;
            }
            return OutputMatcher.INSTANCE.getEXACT();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;", "", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface FrameStartedListener {
    }

    public FrameDistributor(@NotNull StreamGraphImpl streamGraphImpl, @NotNull FrameCaptureQueue frameCaptureQueue, boolean z, long j2) {
        Intrinsics.checkNotNullParameter(streamGraphImpl, "streamGraphImpl");
        Intrinsics.checkNotNullParameter(frameCaptureQueue, "frameCaptureQueue");
        this.streamGraphImpl = streamGraphImpl;
        this.frameCaptureQueue = frameCaptureQueue;
        this.frameInfoDistributor = new OutputDistributor<>(0, NoOpFinalizer.INSTANCE, OutputMatcher.INSTANCE.getEXACT(), 1, null);
        Map<StreamId, ImageSource> imageSourceMap$camera_camera2_pipe = streamGraphImpl.getImageSourceMap$camera_camera2_pipe();
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(imageSourceMap$camera_camera2_pipe.size()));
        Iterator<T> it8 = imageSourceMap$camera_camera2_pipe.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            Object key = entry.getKey();
            int value = ((StreamId) entry.getKey()).getValue();
            final ImageSource imageSource = (ImageSource) entry.getValue();
            CameraStream cameraStreamM353getaKI5c8E = this.streamGraphImpl.m353getaKI5c8E(value);
            if (cameraStreamM353getaKI5c8E == null) {
                throw new IllegalStateException("Required value was null.");
            }
            CameraStream.Config configM473getCameraStreamConfigaKI5c8E = this.streamGraphImpl.m473getCameraStreamConfigaKI5c8E(value);
            Intrinsics.h(configM473getCameraStreamConfigaKI5c8E);
            configM473getCameraStreamConfigaKI5c8E.getImageSourceConfig();
            Intrinsics.h(null);
            OutputMatcher outputMatcherM490selectTimestampMatcher5y4XNsE = INSTANCE.m490selectTimestampMatcher5y4XNsE(value, configM473getCameraStreamConfigaKI5c8E, null, z, j2);
            f builder = new f();
            for (OutputStream outputStream : cameraStreamM353getaKI5c8E.getOutputs()) {
                builder.put(OutputId.m244boximpl(outputStream.getId()), new OutputDistributor(0, ClosingFinalizer.INSTANCE, outputMatcherM490selectTimestampMatcher5y4XNsE, 1, null));
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            final f fVarB = builder.b();
            imageSource.setImageListener(new ImageListener() { // from class: androidx.camera.camera2.pipe.internal.FrameDistributor$imageDistributors$1$1
            });
            imageSource.setExpectedOutputsListener(new b(cameraStreamM353getaKI5c8E, fVarB));
            linkedHashMap.put(key, fVarB);
        }
        this.imageDistributors = linkedHashMap;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(w.t(setKeySet, 10));
        Iterator it9 = setKeySet.iterator();
        while (it9.hasNext()) {
            CameraStream cameraStreamM353getaKI5c8E2 = this.streamGraphImpl.m353getaKI5c8E(((StreamId) it9.next()).getValue());
            if (cameraStreamM353getaKI5c8E2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(cameraStreamM353getaKI5c8E2);
        }
        this.imageStreams = d0.i1(arrayList);
        this.frameStartedListener = new b(1);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.frameCaptureQueue.close();
        this.frameInfoDistributor.close();
        Iterator<Map<OutputId, OutputDistributor<OutputImage>>> it8 = this.imageDistributors.values().iterator();
        while (it8.hasNext()) {
            Iterator<OutputDistributor<OutputImage>> it9 = it8.next().values().iterator();
            while (it9.hasNext()) {
                it9.next().close();
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onAborted(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.frameCaptureQueue.remove(request);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onBufferLost-iiEMlm4 */
    public void mo15onBufferLostiiEMlm4(@NotNull RequestMetadata requestMetadata, long frameNumber, int streamId, int outputId) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Map<OutputId, OutputDistributor<OutputImage>> map = this.imageDistributors.get(StreamId.m355boximpl(streamId));
        if (map == null) {
            return;
        }
        CameraStream.Config configM473getCameraStreamConfigaKI5c8E = this.streamGraphImpl.m473getCameraStreamConfigaKI5c8E(streamId);
        if (configM473getCameraStreamConfigaKI5c8E == null) {
            throw new IllegalStateException("Required value was null.");
        }
        configM473getCameraStreamConfigaKI5c8E.getImageSourceConfig();
        if (!map.containsKey(OutputId.m244boximpl(outputId))) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator<OutputDistributor<OutputImage>> it8 = map.values().iterator();
        while (it8.hasNext()) {
            it8.next().m498onOutputFailureVw7M1qk(frameNumber);
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onComplete-CcXjc1I */
    public void mo6onCompleteCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull FrameInfo result) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(result, "result");
        this.frameInfoDistributor.m499onOutputResultDvZWqE8(frameNumber, OutputResult.m506constructorimpl(result));
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onFailed-CcXjc1I */
    public void mo7onFailedCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull RequestFailure requestFailure) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(requestFailure, "requestFailure");
        OutputDistributor<FrameInfo> outputDistributor = this.frameInfoDistributor;
        OutputResult.Companion companion = OutputResult.INSTANCE;
        outputDistributor.m499onOutputResultDvZWqE8(frameNumber, OutputResult.m506constructorimpl(OutputStatus.m251boximpl(OutputStatus.INSTANCE.m259getERROR_OUTPUT_FAILEDU7r42EA())));
        if (requestFailure.getWasImageCaptured()) {
            return;
        }
        Iterator<StreamId> it8 = requestMetadata.getStreams().keySet().iterator();
        while (it8.hasNext()) {
            Map<OutputId, OutputDistributor<OutputImage>> map = this.imageDistributors.get(StreamId.m355boximpl(it8.next().getValue()));
            if (map != null) {
                Iterator<OutputDistributor<OutputImage>> it9 = map.values().iterator();
                while (it9.hasNext()) {
                    it9.next().m498onOutputFailureVw7M1qk(frameNumber);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onStarted-uGKBvU4 */
    public void mo19onStarteduGKBvU4(@NotNull RequestMetadata requestMetadata, long frameNumber, long timestamp) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        FrameState frameState = new FrameState(requestMetadata, frameNumber, timestamp, this.imageStreams, null);
        this.frameInfoDistributor.m500onOutputStartedqGubWw0(frameNumber, timestamp, frameNumber, frameState.getFrameInfoOutput());
        int size = frameState.getImageOutputs().size();
        for (int i = 0; i < size; i++) {
            FrameState.ImageOutput imageOutput = frameState.getImageOutputs().get(i);
            Map<OutputId, OutputDistributor<OutputImage>> map = this.imageDistributors.get(StreamId.m355boximpl(imageOutput.getStreamId()));
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            OutputDistributor<OutputImage> outputDistributor = map.get(OutputId.m244boximpl(imageOutput.getOutputId()));
            if (outputDistributor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            OutputDistributor<OutputImage> outputDistributor2 = outputDistributor;
            outputDistributor2.m500onOutputStartedqGubWw0(frameNumber, timestamp, timestamp, imageOutput);
            if (!requestMetadata.getStreams().keySet().contains(StreamId.m355boximpl(imageOutput.getStreamId()))) {
                outputDistributor2.m498onOutputFailureVw7M1qk(frameState.getFrameNumber());
            }
        }
        FrameImpl frameImpl = new FrameImpl(frameState, null, 2, 0 == true ? 1 : 0);
        ((b) this.frameStartedListener).getClass();
        Intrinsics.checkNotNullParameter(frameImpl, "it");
        if (!requestMetadata.getRepeating()) {
            this.frameCaptureQueue.remove(requestMetadata.getRequest());
        }
        frameImpl.close();
    }
}
