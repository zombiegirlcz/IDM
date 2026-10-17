package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.FrameReference;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.FrameState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.b;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameImpl;", "", "Landroidx/camera/camera2/pipe/internal/FrameState;", "frameState", "", "Landroidx/camera/camera2/pipe/StreamId;", "imageStreams", "<init>", "(Landroidx/camera/camera2/pipe/internal/FrameState;Ljava/util/Set;)V", "", "release", "()Z", "", "close", "()V", "finalize", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/internal/FrameState;", "Ljava/util/Set;", "getImageStreams", "()Ljava/util/Set;", "Landroidx/camera/camera2/pipe/OutputId;", "outputStreams", "Lrkm/b;", "closed", "Lrkm/b;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameImpl implements FrameReference, AutoCloseable {

    @NotNull
    private final b closed;

    @NotNull
    private final FrameState frameState;

    @NotNull
    private final Set<StreamId> imageStreams;

    @NotNull
    private final Set<OutputId> outputStreams;

    public FrameImpl(@NotNull FrameState frameState, @NotNull Set<StreamId> imageStreams) {
        Intrinsics.checkNotNullParameter(frameState, "frameState");
        Intrinsics.checkNotNullParameter(imageStreams, "imageStreams");
        this.frameState = frameState;
        this.imageStreams = imageStreams;
        List<FrameState.ImageOutput> imageOutputs = frameState.getImageOutputs();
        ArrayList arrayList = new ArrayList(w.t(imageOutputs, 10));
        Iterator<T> it8 = imageOutputs.iterator();
        while (it8.hasNext()) {
            arrayList.add(OutputId.m244boximpl(((FrameState.ImageOutput) it8.next()).getOutputId()));
        }
        this.outputStreams = d0.i1(arrayList);
        this.closed = hx7.b.g(false);
    }

    private final boolean release() {
        if (!this.closed.a()) {
            return false;
        }
        this.frameState.getFrameInfoOutput().decrement();
        int size = this.frameState.getImageOutputs().size();
        for (int i = 0; i < size; i++) {
            FrameState.ImageOutput imageOutput = this.frameState.getImageOutputs().get(i);
            if (getImageStreams().contains(StreamId.m355boximpl(imageOutput.getStreamId()))) {
                imageOutput.decrement();
            }
        }
        return true;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        release();
    }

    public final void finalize() {
        if (release() && Log.INSTANCE.getERROR_LOGGABLE()) {
            String str = "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.";
        }
    }

    @NotNull
    public Set<StreamId> getImageStreams() {
        return this.imageStreams;
    }

    @NotNull
    public String toString() {
        return this.frameState.toString();
    }

    public /* synthetic */ FrameImpl(FrameState frameState, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            List<FrameState.ImageOutput> imageOutputs = frameState.getImageOutputs();
            ArrayList arrayList = new ArrayList(w.t(imageOutputs, 10));
            Iterator<T> it8 = imageOutputs.iterator();
            while (it8.hasNext()) {
                arrayList.add(StreamId.m355boximpl(((FrameState.ImageOutput) it8.next()).getStreamId()));
            }
            set = d0.i1(arrayList);
        }
        this(frameState, set);
    }
}
