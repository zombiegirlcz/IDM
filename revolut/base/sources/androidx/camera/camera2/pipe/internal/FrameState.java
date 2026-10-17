package androidx.camera.camera2.pipe.internal;

import aim.e;
import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.FrameId;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.internal.OutputDistributor;
import androidx.camera.camera2.pipe.internal.OutputResult;
import androidx.camera.camera2.pipe.media.OutputImage;
import androidx.camera.camera2.pipe.media.SharedOutputImage;
import ch.qos.logback.core.CoreConstants;
import hx7.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import rkm.d;
import rkm.f;
import rkm.h;
import skm.e0;
import skm.q;
import skm.r;
import skm.r1;
import v0.a;
import vc.s;
import zhm.d0;
import zhm.u;
import zhm.w;
import zsc.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 82\u00020\u0001:\u00059:;<8B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001b\u0010$\u001a\u00060#R\u00020\u00008\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R!\u0010*\u001a\f\u0012\b\u0012\u00060)R\u00020\u00000(8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006="}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameState;", "", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "frameTimestamp", "", "Landroidx/camera/camera2/pipe/CameraStream;", "imageStreams", "<init>", "(Landroidx/camera/camera2/pipe/RequestMetadata;JJLjava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "invokeOnFrameComplete", "()V", "onFrameInfoComplete", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "onStreamResultComplete-aKI5c8E", "(I)V", "onStreamResultComplete", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "getRequestMetadata", "()Landroidx/camera/camera2/pipe/RequestMetadata;", "J", "getFrameNumber-Ugla2oM", "()J", "getFrameTimestamp-LS1Wq50", "Landroidx/camera/camera2/pipe/FrameId;", "frameId", "getFrameId-OMxQvVY", "Landroidx/camera/camera2/pipe/internal/FrameState$FrameInfoOutput;", "frameInfoOutput", "Landroidx/camera/camera2/pipe/internal/FrameState$FrameInfoOutput;", "getFrameInfoOutput", "()Landroidx/camera/camera2/pipe/internal/FrameState$FrameInfoOutput;", "", "Landroidx/camera/camera2/pipe/internal/FrameState$ImageOutput;", "imageOutputs", "Ljava/util/List;", "getImageOutputs", "()Ljava/util/List;", "Lrkm/h;", "Landroidx/camera/camera2/pipe/internal/FrameState$State;", "state", "Lrkm/h;", "Lrkm/d;", "remainingStreamCount", "Lrkm/d;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listenerStates", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Companion", "State", "FrameOutput", "FrameInfoOutput", "ImageOutput", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final f frameIds = b.i();
    private final long frameId;

    @NotNull
    private final FrameInfoOutput frameInfoOutput;
    private final long frameNumber;
    private final long frameTimestamp;

    @NotNull
    private final List<ImageOutput> imageOutputs;

    @NotNull
    private final CopyOnWriteArrayList<Object> listenerStates;

    @NotNull
    private final d remainingStreamCount;

    @NotNull
    private final RequestMetadata requestMetadata;

    @NotNull
    private final h state;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameState$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/FrameId;", "nextFrameId-OMxQvVY", "()J", "nextFrameId", "Lrkm/f;", "frameIds", "Lrkm/f;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: nextFrameId-OMxQvVY, reason: not valid java name */
        public final long m494nextFrameIdOMxQvVY() {
            f fVar = FrameState.frameIds;
            fVar.getClass();
            return FrameId.m217constructorimpl(f.f254897b.incrementAndGet(fVar));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameState$FrameInfoOutput;", "Landroidx/camera/camera2/pipe/internal/FrameState$FrameOutput;", "Landroidx/camera/camera2/pipe/FrameInfo;", "Landroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;", "<init>", "(Landroidx/camera/camera2/pipe/internal/FrameState;)V", "Landroidx/camera/camera2/pipe/FrameNumber;", "cameraFrameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "cameraTimestamp", "", "cameraOutputSequence", "outputNumber", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "outputResult", "", "onOutputComplete-3ejhThk", "(JJJJLjava/lang/Object;)V", "onOutputComplete", "release", "()V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class FrameInfoOutput extends FrameOutput<FrameInfo> implements OutputDistributor.OutputListener<FrameInfo> {
        public FrameInfoOutput() {
        }

        @Override // androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener
        /* JADX INFO: renamed from: onOutputComplete-3ejhThk, reason: not valid java name */
        public void mo495onOutputComplete3ejhThk(long cameraFrameNumber, long cameraTimestamp, long cameraOutputSequence, long outputNumber, @NotNull Object outputResult) {
            ((r) getInternalResult()).U(OutputResult.m505boximpl(outputResult));
            FrameState.this.onFrameInfoComplete();
        }

        @Override // androidx.camera.camera2.pipe.internal.FrameState.FrameOutput
        public void release() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H$¢\u0006\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameState$FrameOutput;", "", "T", "<init>", "()V", "", "decrement", "release", "Lrkm/d;", "count", "Lrkm/d;", "Lskm/q;", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "internalResult", "Lskm/q;", "getInternalResult", "()Lskm/q;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class FrameOutput<T> {

        @NotNull
        private final d count = b.h(1);

        @NotNull
        private final q internalResult = e0.b();

        public final void decrement() {
            d dVar = this.count;
            dVar.getClass();
            if (d.f254895b.decrementAndGet(dVar) == 0) {
                OutputResult.Companion companion = OutputResult.INSTANCE;
                ((r) this.internalResult).U(OutputResult.m505boximpl(OutputResult.m506constructorimpl(OutputStatus.m251boximpl(OutputStatus.INSTANCE.m261getUNAVAILABLEU7r42EA()))));
                release();
            }
        }

        @NotNull
        public final q getInternalResult() {
            return this.internalResult;
        }

        public abstract void release();
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 ¨\u0006!"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameState$ImageOutput;", "Landroidx/camera/camera2/pipe/internal/FrameState$FrameOutput;", "Landroidx/camera/camera2/pipe/media/SharedOutputImage;", "Landroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;", "Landroidx/camera/camera2/pipe/media/OutputImage;", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "Lrkm/d;", "remainingOutputResults", "<init>", "(Landroidx/camera/camera2/pipe/internal/FrameState;IILrkm/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/camera/camera2/pipe/FrameNumber;", "cameraFrameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "cameraTimestamp", "", "cameraOutputSequence", "outputNumber", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "outputResult", "", "onOutputComplete-3ejhThk", "(JJJJLjava/lang/Object;)V", "onOutputComplete", "release", "()V", "I", "getStreamId-ptHMqGs", "()I", "getOutputId-4LaLFng", "Lrkm/d;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ImageOutput extends FrameOutput<SharedOutputImage> implements OutputDistributor.OutputListener<OutputImage> {
        private final int outputId;

        @NotNull
        private final d remainingOutputResults;
        private final int streamId;
        final /* synthetic */ FrameState this$0;

        public /* synthetic */ ImageOutput(FrameState frameState, int i, int i2, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(frameState, i, i2, dVar);
        }

        /* JADX INFO: renamed from: getOutputId-4LaLFng, reason: not valid java name and from getter */
        public final int getOutputId() {
            return this.outputId;
        }

        /* JADX INFO: renamed from: getStreamId-ptHMqGs, reason: not valid java name and from getter */
        public final int getStreamId() {
            return this.streamId;
        }

        @Override // androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener
        /* JADX INFO: renamed from: onOutputComplete-3ejhThk */
        public void mo495onOutputComplete3ejhThk(long cameraFrameNumber, long cameraTimestamp, long cameraOutputSequence, long outputNumber, @NotNull Object outputResult) throws Exception {
            boolean zIsTerminated;
            OutputImage outputImage = (OutputImage) (OutputResult.m508getAvailableimpl(outputResult) ? outputResult : null);
            if (outputImage != null) {
                AutoCloseable autoCloseableFrom = SharedOutputImage.INSTANCE.from(outputImage);
                if (!((r) getInternalResult()).U(OutputResult.m505boximpl(OutputResult.m506constructorimpl(autoCloseableFrom)))) {
                    if (autoCloseableFrom instanceof AutoCloseable) {
                        autoCloseableFrom.close();
                    } else if (autoCloseableFrom instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseableFrom;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
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
                    } else if (autoCloseableFrom instanceof TypedArray) {
                        ((TypedArray) autoCloseableFrom).recycle();
                    } else {
                        if (!(autoCloseableFrom instanceof MediaMetadataRetriever)) {
                            throw new IllegalArgumentException();
                        }
                        ((MediaMetadataRetriever) autoCloseableFrom).release();
                    }
                }
            } else {
                ((r) getInternalResult()).U(OutputResult.m505boximpl(OutputResult.m506constructorimpl(OutputStatus.m251boximpl(OutputResult.m508getAvailableimpl(outputResult) ? OutputStatus.INSTANCE.m257getAVAILABLEU7r42EA() : outputResult == null ? OutputStatus.INSTANCE.m261getUNAVAILABLEU7r42EA() : ((OutputStatus) outputResult).getValue()))));
            }
            d dVar = this.remainingOutputResults;
            dVar.getClass();
            if (d.f254895b.decrementAndGet(dVar) == 0) {
                Iterator it8 = this.this$0.listenerStates.iterator();
                Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
                if (it8.hasNext()) {
                    throw a.e(it8);
                }
                this.this$0.m492onStreamResultCompleteaKI5c8E(this.streamId);
            }
        }

        @Override // androidx.camera.camera2.pipe.internal.FrameState.FrameOutput
        public void release() throws Exception {
            boolean zIsTerminated;
            OutputResult.Companion companion = OutputResult.INSTANCE;
            Job internalResult = getInternalResult();
            Object obj2 = null;
            if (((r1) internalResult).isCompleted() && !((r1) internalResult).isCancelled()) {
                Object result = ((OutputResult) ((r) internalResult).I()).getResult();
                if (OutputResult.m508getAvailableimpl(result)) {
                    obj2 = result;
                }
            }
            AutoCloseable autoCloseable = (SharedOutputImage) obj2;
            if (autoCloseable != null) {
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
        }

        private ImageOutput(FrameState frameState, int i, int i2, d remainingOutputResults) {
            Intrinsics.checkNotNullParameter(remainingOutputResults, "remainingOutputResults");
            this.this$0 = frameState;
            this.streamId = i;
            this.outputId = i2;
            this.remainingOutputResults = remainingOutputResults;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameState$State;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "FRAME_INFO_COMPLETE", "STREAM_RESULTS_COMPLETE", "COMPLETE", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State STARTED = new State("STARTED", 0);
        public static final State FRAME_INFO_COMPLETE = new State("FRAME_INFO_COMPLETE", 1);
        public static final State STREAM_RESULTS_COMPLETE = new State("STREAM_RESULTS_COMPLETE", 2);
        public static final State COMPLETE = new State("COMPLETE", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{STARTED, FRAME_INFO_COMPLETE, STREAM_RESULTS_COMPLETE, COMPLETE};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = s.n(stateArr$values);
        }

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.FRAME_INFO_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.STREAM_RESULTS_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FrameState(RequestMetadata requestMetadata, long j2, long j3, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(requestMetadata, j2, j3, set);
    }

    private final void invokeOnFrameComplete() {
        Iterator<Object> it8 = this.listenerStates.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        if (it8.hasNext()) {
            throw a.e(it8);
        }
    }

    @NotNull
    public final FrameInfoOutput getFrameInfoOutput() {
        return this.frameInfoOutput;
    }

    /* JADX INFO: renamed from: getFrameNumber-Ugla2oM, reason: not valid java name and from getter */
    public final long getFrameNumber() {
        return this.frameNumber;
    }

    @NotNull
    public final List<ImageOutput> getImageOutputs() {
        return this.imageOutputs;
    }

    public final void onFrameInfoComplete() {
        Object obj2;
        State state;
        h hVar = this.state;
        do {
            obj2 = hVar.f254900a;
            State state2 = (State) obj2;
            int i = WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
            if (i == 1) {
                state = State.FRAME_INFO_COMPLETE;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("Unexpected frame state for " + this + "! State is " + state2 + p.SPACE_CHAR);
                }
                state = State.COMPLETE;
            }
        } while (!hVar.a(obj2, state));
        Iterator<Object> it8 = this.listenerStates.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        if (it8.hasNext()) {
            throw a.e(it8);
        }
        if (state == State.COMPLETE) {
            invokeOnFrameComplete();
        }
    }

    /* JADX INFO: renamed from: onStreamResultComplete-aKI5c8E, reason: not valid java name */
    public final void m492onStreamResultCompleteaKI5c8E(int streamId) {
        Object obj2;
        State state;
        d dVar = this.remainingStreamCount;
        dVar.getClass();
        if (d.f254895b.decrementAndGet(dVar) != 0) {
            return;
        }
        h hVar = this.state;
        do {
            obj2 = hVar.f254900a;
            State state2 = (State) obj2;
            int i = WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
            if (i == 1) {
                state = State.STREAM_RESULTS_COMPLETE;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Unexpected frame state for " + this + "! State is " + state2 + p.SPACE_CHAR);
                }
                state = State.COMPLETE;
            }
        } while (!hVar.a(obj2, state));
        Iterator<Object> it8 = this.listenerStates.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        if (it8.hasNext()) {
            throw a.e(it8);
        }
        if (state == State.COMPLETE) {
            invokeOnFrameComplete();
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("Frame-");
        sb6.append((Object) FrameId.m218toStringimpl(this.frameId));
        sb6.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb6.append(this.frameNumber);
        sb6.append('@');
        return a0.d.t(sb6, this.frameTimestamp, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    private FrameState(RequestMetadata requestMetadata, long j2, long j3, Set<CameraStream> imageStreams) {
        Object next;
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(imageStreams, "imageStreams");
        this.requestMetadata = requestMetadata;
        this.frameNumber = j2;
        this.frameTimestamp = j3;
        this.frameId = INSTANCE.m494nextFrameIdOMxQvVY();
        this.frameInfoOutput = new FrameInfoOutput();
        e eVarB = u.b();
        Iterator<StreamId> it8 = requestMetadata.getStreams().keySet().iterator();
        while (it8.hasNext()) {
            int value = it8.next().getValue();
            Iterator<T> it9 = imageStreams.iterator();
            while (true) {
                if (it9.hasNext()) {
                    next = it9.next();
                    if (StreamId.m358equalsimpl0(((CameraStream) next).getId(), value)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            CameraStream cameraStream = (CameraStream) next;
            if (cameraStream != null) {
                List<OutputStream> outputs = cameraStream.getOutputs();
                d dVarH = b.h(outputs.size());
                int size = outputs.size();
                for (int i = 0; i < size; i++) {
                    eVarB.add(new ImageOutput(this, value, outputs.get(i).getId(), dVarH, null));
                }
            }
        }
        e eVarA = u.a(eVarB);
        this.imageOutputs = eVarA;
        this.state = b.j(State.STARTED);
        ArrayList arrayList = new ArrayList(w.t(eVarA, 10));
        Iterator<E> it10 = eVarA.iterator();
        while (it10.hasNext()) {
            arrayList.add(StreamId.m355boximpl(((ImageOutput) it10.next()).getStreamId()));
        }
        this.remainingStreamCount = b.h(d0.U(arrayList).size());
        this.listenerStates = new CopyOnWriteArrayList<>();
    }
}
