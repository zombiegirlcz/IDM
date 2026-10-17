package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.CameraStream;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/StreamGraph;", "", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "config", "Landroidx/camera/camera2/pipe/CameraStream;", "get", "(Landroidx/camera/camera2/pipe/CameraStream$Config;)Landroidx/camera/camera2/pipe/CameraStream;", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "get-aKI5c8E", "(I)Landroidx/camera/camera2/pipe/CameraStream;", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "Landroidx/camera/camera2/pipe/OutputStream;", "get-iYJqvbA", "(I)Landroidx/camera/camera2/pipe/OutputStream;", "", "getStreams", "()Ljava/util/List;", "streams", "Landroidx/camera/camera2/pipe/InputStream;", "getInputs", "inputs", "getOutputs", "outputs", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface StreamGraph {
    CameraStream get(@NotNull CameraStream.Config config);

    /* JADX INFO: renamed from: get-aKI5c8E, reason: not valid java name */
    default CameraStream m353getaKI5c8E(int streamId) {
        Object next;
        Iterator<T> it8 = getStreams().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (StreamId.m358equalsimpl0(((CameraStream) next).getId(), streamId)) {
                break;
            }
        }
        return (CameraStream) next;
    }

    /* JADX INFO: renamed from: get-iYJqvbA, reason: not valid java name */
    default OutputStream m354getiYJqvbA(int outputId) {
        Object next;
        Iterator<T> it8 = getOutputs().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (OutputId.m247equalsimpl0(((OutputStream) next).getId(), outputId)) {
                break;
            }
        }
        return (OutputStream) next;
    }

    @NotNull
    List<InputStream> getInputs();

    @NotNull
    List<OutputStream> getOutputs();

    @NotNull
    List<CameraStream> getStreams();
}
