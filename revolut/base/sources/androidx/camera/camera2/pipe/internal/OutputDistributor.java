package androidx.camera.camera2.pipe.internal;

import a0.d;
import androidx.camera.camera2.pipe.CameraTimestamp;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.internal.OutputResult;
import androidx.camera.camera2.pipe.media.Finalizer;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.b;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u000278B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\"\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a022\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0003J,\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a022\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0002J\b\u00106\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Landroidx/camera/camera2/pipe/internal/OutputDistributor;", "T", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "maximumCachedOutputs", "", "outputFinalizer", "Landroidx/camera/camera2/pipe/media/Finalizer;", "outputMatcher", "Landroidx/camera/camera2/pipe/internal/OutputMatcher;", "<init>", "(ILandroidx/camera/camera2/pipe/media/Finalizer;Landroidx/camera/camera2/pipe/internal/OutputMatcher;)V", "lock", "", "closed", "", "cameraOutputSequenceNumbers", "", "newestCameraOutputNumber", "newestFrameNumber", "Landroidx/camera/camera2/pipe/FrameNumber;", "J", "lastFailedFrameNumber", "lastFailedCameraOutputNumber", "startedOutputs", "", "Landroidx/camera/camera2/pipe/internal/OutputDistributor$StartedOutput;", "availableOutputs", "", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "onOutputStarted", "", "cameraFrameNumber", "cameraTimestamp", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "cameraOutputNumber", "outputListener", "Landroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;", "onOutputStarted-qGubWw0", "(JJJLandroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;)V", "onOutputResult", "outputNumber", "outputResult", "onOutputResult-DvZWqE8", "(JLjava/lang/Object;)V", "onOutputFailure", "frameNumber", "onOutputFailure-Vw7M1qk", "(J)V", "removeOutputsOlderThan", "", "output", "isOutOfOrder", "cameraOutputSequence", "close", "OutputListener", "StartedOutput", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutputDistributor<T> implements AutoCloseable {

    @NotNull
    private final Map<Long, OutputResult<T>> availableOutputs;
    private long cameraOutputSequenceNumbers;
    private boolean closed;
    private long lastFailedCameraOutputNumber;
    private long lastFailedFrameNumber;

    @NotNull
    private final Object lock;
    private final int maximumCachedOutputs;
    private long newestCameraOutputNumber;
    private long newestFrameNumber;

    @NotNull
    private final Finalizer<T> outputFinalizer;

    @NotNull
    private final OutputMatcher outputMatcher;

    @NotNull
    private final List<StartedOutput<T>> startedOutputs;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;", "T", "", "onOutputComplete", "", "cameraFrameNumber", "Landroidx/camera/camera2/pipe/FrameNumber;", "cameraTimestamp", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "cameraOutputSequence", "", "outputNumber", "outputResult", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "onOutputComplete-3ejhThk", "(JJJJLjava/lang/Object;)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OutputListener<T> {
        /* JADX INFO: renamed from: onOutputComplete-3ejhThk */
        void mo495onOutputComplete3ejhThk(long cameraFrameNumber, long cameraTimestamp, long cameraOutputSequence, long outputNumber, @NotNull Object outputResult);
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b\u0004\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b,\u0010)R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Landroidx/camera/camera2/pipe/internal/OutputDistributor$StartedOutput;", "T", "", "", "isOutOfOrder", "Landroidx/camera/camera2/pipe/FrameNumber;", "cameraFrameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "cameraTimestamp", "", "cameraOutputSequence", "cameraOutputNumber", "Landroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;", "outputListener", "<init>", "(ZJJJJLandroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/camera/camera2/pipe/OutputStatus;", "failureReason", "", "completeWithFailure-tXNfJfc", "(I)V", "completeWithFailure", "outputNumber", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "outputResult", "completeWith-DvZWqE8", "(JLjava/lang/Object;)V", "completeWith", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "J", "getCameraFrameNumber-Ugla2oM", "()J", "getCameraTimestamp-LS1Wq50", "getCameraOutputSequence", "getCameraOutputNumber", "Landroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;", "Lrkm/b;", "complete", "Lrkm/b;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StartedOutput<T> {
        private final long cameraFrameNumber;
        private final long cameraOutputNumber;
        private final long cameraOutputSequence;
        private final long cameraTimestamp;

        @NotNull
        private final b complete;
        private final boolean isOutOfOrder;

        @NotNull
        private final OutputListener<T> outputListener;

        public /* synthetic */ StartedOutput(boolean z, long j2, long j3, long j5, long j16, OutputListener outputListener, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, j2, j3, j5, j16, outputListener);
        }

        /* JADX INFO: renamed from: completeWith-DvZWqE8, reason: not valid java name */
        public final void m501completeWithDvZWqE8(long outputNumber, @NotNull Object outputResult) {
            if (this.complete.a()) {
                this.outputListener.mo495onOutputComplete3ejhThk(this.cameraFrameNumber, this.cameraTimestamp, this.cameraOutputSequence, outputNumber, outputResult);
                return;
            }
            StringBuilder sb6 = new StringBuilder("Output ");
            sb6.append(this.cameraOutputSequence);
            sb6.append(" at ");
            sb6.append((Object) FrameNumber.m226toStringimpl(this.cameraFrameNumber));
            sb6.append(" for ");
            throw new IllegalStateException(d.j(outputNumber, " was completed multiple times!", sb6).toString());
        }

        /* JADX INFO: renamed from: completeWithFailure-tXNfJfc, reason: not valid java name */
        public final void m502completeWithFailuretXNfJfc(int failureReason) {
            OutputResult.Companion companion = OutputResult.INSTANCE;
            m501completeWithDvZWqE8(-1L, OutputResult.m506constructorimpl(OutputStatus.m251boximpl(failureReason)));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartedOutput)) {
                return false;
            }
            StartedOutput startedOutput = (StartedOutput) other;
            return this.isOutOfOrder == startedOutput.isOutOfOrder && FrameNumber.m224equalsimpl0(this.cameraFrameNumber, startedOutput.cameraFrameNumber) && CameraTimestamp.m197equalsimpl0(this.cameraTimestamp, startedOutput.cameraTimestamp) && this.cameraOutputSequence == startedOutput.cameraOutputSequence && this.cameraOutputNumber == startedOutput.cameraOutputNumber && Intrinsics.f(this.outputListener, startedOutput.outputListener);
        }

        /* JADX INFO: renamed from: getCameraFrameNumber-Ugla2oM, reason: not valid java name and from getter */
        public final long getCameraFrameNumber() {
            return this.cameraFrameNumber;
        }

        public final long getCameraOutputNumber() {
            return this.cameraOutputNumber;
        }

        public final long getCameraOutputSequence() {
            return this.cameraOutputSequence;
        }

        public int hashCode() {
            return this.outputListener.hashCode() + d.c(d.c((CameraTimestamp.m198hashCodeimpl(this.cameraTimestamp) + ((FrameNumber.m225hashCodeimpl(this.cameraFrameNumber) + (Boolean.hashCode(this.isOutOfOrder) * 31)) * 31)) * 31, 31, this.cameraOutputSequence), 31, this.cameraOutputNumber);
        }

        /* JADX INFO: renamed from: isOutOfOrder, reason: from getter */
        public final boolean getIsOutOfOrder() {
            return this.isOutOfOrder;
        }

        @NotNull
        public String toString() {
            return "StartedOutput(isOutOfOrder=" + this.isOutOfOrder + ", cameraFrameNumber=" + ((Object) FrameNumber.m226toStringimpl(this.cameraFrameNumber)) + ", cameraTimestamp=" + ((Object) CameraTimestamp.m199toStringimpl(this.cameraTimestamp)) + ", cameraOutputSequence=" + this.cameraOutputSequence + ", cameraOutputNumber=" + this.cameraOutputNumber + ", outputListener=" + this.outputListener + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        private StartedOutput(boolean z, long j2, long j3, long j5, long j16, OutputListener<T> outputListener) {
            Intrinsics.checkNotNullParameter(outputListener, "outputListener");
            this.isOutOfOrder = z;
            this.cameraFrameNumber = j2;
            this.cameraTimestamp = j3;
            this.cameraOutputSequence = j5;
            this.cameraOutputNumber = j16;
            this.outputListener = outputListener;
            this.complete = hx7.b.g(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OutputDistributor(int i, @NotNull Finalizer<? super T> outputFinalizer, @NotNull OutputMatcher outputMatcher) {
        Intrinsics.checkNotNullParameter(outputFinalizer, "outputFinalizer");
        Intrinsics.checkNotNullParameter(outputMatcher, "outputMatcher");
        this.maximumCachedOutputs = i;
        this.outputFinalizer = outputFinalizer;
        this.outputMatcher = outputMatcher;
        this.lock = new Object();
        this.cameraOutputSequenceNumbers = 1L;
        this.newestCameraOutputNumber = Long.MIN_VALUE;
        this.newestFrameNumber = FrameNumber.m222constructorimpl(Long.MIN_VALUE);
        this.lastFailedFrameNumber = Long.MIN_VALUE;
        this.lastFailedCameraOutputNumber = Long.MIN_VALUE;
        this.startedOutputs = new ArrayList();
        this.availableOutputs = new LinkedHashMap();
    }

    private final List<StartedOutput<T>> removeOutputsOlderThan(StartedOutput<T> output) {
        return removeOutputsOlderThan(output.getIsOutOfOrder(), output.getCameraOutputSequence(), output.getCameraOutputNumber());
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ArrayList arrayListF1 = d0.f1(this.availableOutputs.values());
            this.availableOutputs.clear();
            ArrayList arrayListF12 = d0.f1(this.startedOutputs);
            this.startedOutputs.clear();
            Unit unit = Unit.f186387a;
            Iterator it8 = arrayListF1.iterator();
            while (it8.hasNext()) {
                Object result = ((OutputResult) it8.next()).getResult();
                Finalizer<T> finalizer = this.outputFinalizer;
                if (!OutputResult.m508getAvailableimpl(result)) {
                    result = null;
                }
                finalizer.finalize((T) result);
            }
            Iterator it9 = arrayListF12.iterator();
            while (it9.hasNext()) {
                ((StartedOutput) it9.next()).m502completeWithFailuretXNfJfc(OutputStatus.INSTANCE.m258getERROR_OUTPUT_ABORTEDU7r42EA());
            }
        }
    }

    /* JADX INFO: renamed from: onOutputFailure-Vw7M1qk, reason: not valid java name */
    public final void m498onOutputFailureVw7M1qk(long frameNumber) {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.lastFailedFrameNumber = frameNumber;
                Iterator<T> it8 = this.startedOutputs.iterator();
                StartedOutput startedOutput = null;
                boolean z = false;
                StartedOutput startedOutput2 = null;
                while (true) {
                    if (it8.hasNext()) {
                        T next = it8.next();
                        if (FrameNumber.m224equalsimpl0(((StartedOutput) next).getCameraFrameNumber(), frameNumber)) {
                            if (z) {
                                break;
                            }
                            z = true;
                            startedOutput2 = next;
                        }
                    } else if (!z) {
                    }
                }
                startedOutput2 = null;
                StartedOutput startedOutput3 = startedOutput2;
                if (startedOutput3 != null) {
                    this.lastFailedCameraOutputNumber = startedOutput3.getCameraOutputNumber();
                    this.startedOutputs.remove(startedOutput3);
                    Unit unit = Unit.f186387a;
                    startedOutput = startedOutput3;
                }
                if (startedOutput != null) {
                    startedOutput.m502completeWithFailuretXNfJfc(OutputStatus.INSTANCE.m259getERROR_OUTPUT_FAILEDU7r42EA());
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX INFO: renamed from: onOutputResult-DvZWqE8, reason: not valid java name */
    public final void m499onOutputResultDvZWqE8(long outputNumber, @NotNull Object outputResult) {
        OutputResult<T> outputResultM505boximpl;
        List<StartedOutput<T>> listRemoveOutputsOlderThan;
        T next;
        synchronized (this.lock) {
            try {
                if (this.closed || this.outputMatcher.fuzzyEqual(this.lastFailedCameraOutputNumber, outputNumber)) {
                    outputResultM505boximpl = OutputResult.m505boximpl(outputResult);
                } else {
                    Iterator<T> it8 = this.startedOutputs.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next = (T) null;
                            break;
                        } else {
                            next = it8.next();
                            if (this.outputMatcher.fuzzyEqual(((StartedOutput) next).getCameraOutputNumber(), outputNumber)) {
                                break;
                            }
                        }
                    }
                    StartedOutput<T> startedOutput = next;
                    if (startedOutput != null) {
                        listRemoveOutputsOlderThan = removeOutputsOlderThan(startedOutput);
                        startedOutput.m501completeWithDvZWqE8(outputNumber, outputResult);
                        this.startedOutputs.remove(startedOutput);
                        outputResultM505boximpl = null;
                    } else {
                        this.availableOutputs.put(Long.valueOf(outputNumber), OutputResult.m505boximpl(outputResult));
                        if (this.availableOutputs.size() > this.maximumCachedOutputs) {
                            outputResultM505boximpl = this.availableOutputs.remove(Long.valueOf(((Number) d0.a0(this.availableOutputs.keySet())).longValue()));
                        } else {
                            outputResultM505boximpl = null;
                            listRemoveOutputsOlderThan = null;
                        }
                    }
                    Unit unit = Unit.f186387a;
                }
                listRemoveOutputsOlderThan = null;
                Unit unit2 = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        OutputResult<T> outputResult2 = outputResultM505boximpl;
        if (outputResult2 != null) {
            Object result = outputResult2.getResult();
            Object obj2 = OutputResult.m508getAvailableimpl(result) ? result : null;
            if (obj2 != null) {
                this.outputFinalizer.finalize((T) obj2);
            }
        }
        if (listRemoveOutputsOlderThan != null) {
            Iterator<T> it9 = listRemoveOutputsOlderThan.iterator();
            while (it9.hasNext()) {
                ((StartedOutput) it9.next()).m502completeWithFailuretXNfJfc(OutputStatus.INSTANCE.m260getERROR_OUTPUT_MISSINGU7r42EA());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0192  */
    /* JADX INFO: renamed from: onOutputStarted-qGubWw0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m500onOutputStartedqGubWw0(long r22, long r24, long r26, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener<T> r28) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.OutputDistributor.m500onOutputStartedqGubWw0(long, long, long, androidx.camera.camera2.pipe.internal.OutputDistributor$OutputListener):void");
    }

    private final List<StartedOutput<T>> removeOutputsOlderThan(boolean isOutOfOrder, long cameraOutputSequence, long cameraOutputNumber) {
        List<StartedOutput<T>> list = this.startedOutputs;
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            StartedOutput startedOutput = (StartedOutput) t2;
            if (startedOutput.getIsOutOfOrder() == isOutOfOrder && startedOutput.getCameraOutputSequence() < cameraOutputSequence && startedOutput.getCameraOutputNumber() < cameraOutputNumber) {
                arrayList.add(t2);
            }
        }
        this.startedOutputs.removeAll(arrayList);
        return arrayList;
    }

    public /* synthetic */ OutputDistributor(int i, Finalizer finalizer, OutputMatcher outputMatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i, finalizer, outputMatcher);
    }
}
