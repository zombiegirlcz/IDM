package androidx.camera.camera2.pipe.compat;

import android.view.Surface;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.InputStream;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidPSessionFactory;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "threads", "Landroidx/camera/camera2/pipe/core/Threads;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "streamGraph", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;)V", "create", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "cameraDevice", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "surfaces", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "captureSessionState", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidPSessionFactory implements CaptureSessionFactory {

    @NotNull
    private final CameraGraph.Config graphConfig;

    @NotNull
    private final StreamGraphImpl streamGraph;

    @NotNull
    private final Threads threads;

    public AndroidPSessionFactory(@NotNull Threads threads, @NotNull CameraGraph.Config graphConfig, @NotNull StreamGraphImpl streamGraph) {
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        Intrinsics.checkNotNullParameter(streamGraph, "streamGraph");
        this.threads = threads;
        this.graphConfig = graphConfig;
        this.streamGraph = streamGraph;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    @NotNull
    public CaptureSessionFactory.Result create(@NotNull CameraDeviceWrapper cameraDevice, @NotNull Map<StreamId, ? extends Surface> surfaces, @NotNull CaptureSessionState captureSessionState) throws Exception {
        int sessionMode;
        int i;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        Intrinsics.checkNotNullParameter(surfaces, "surfaces");
        Intrinsics.checkNotNullParameter(captureSessionState, "captureSessionState");
        int sessionMode2 = this.graphConfig.getSessionMode();
        CameraGraph.OperatingMode.Companion companion = CameraGraph.OperatingMode.INSTANCE;
        if (CameraGraph.OperatingMode.m170equalsimpl0(sessionMode2, companion.m176getNORMAL2uNL3no())) {
            i = 0;
        } else {
            if (CameraGraph.OperatingMode.m170equalsimpl0(sessionMode2, companion.m175getHIGH_SPEED2uNL3no())) {
                sessionMode = 1;
            } else {
                if (CameraGraph.OperatingMode.m170equalsimpl0(sessionMode2, companion.m174getEXTENSION2uNL3no())) {
                    throw new IllegalArgumentException("Unsupported session mode: " + ((Object) CameraGraph.OperatingMode.m172toStringimpl(this.graphConfig.getSessionMode())));
                }
                sessionMode = this.graphConfig.getSessionMode();
            }
            i = sessionMode;
        }
        OutputConfigurations outputConfigurationsBuildOutputConfigurations = CaptureSessionFactoryKt.buildOutputConfigurations(this.graphConfig, this.streamGraph, surfaces);
        if (outputConfigurationsBuildOutputConfigurations.getAll().isEmpty()) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Failed to create OutputConfigurations for " + this.graphConfig;
            }
            captureSessionState.onSessionFinalized();
            return CaptureSessionFactory.Result.Failed.INSTANCE;
        }
        List<InputStream.Config> input = this.graphConfig.getInput();
        if (input != null) {
            List<InputStream.Config> list = input;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                OutputStream.Config config = (OutputStream.Config) d0.K0(((InputStream.Config) it8.next()).getStream().getOutputs());
                arrayList.add(new InputConfigData(config.getSize().getWidth(), config.getSize().getHeight(), config.getFormat()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                if (((InputConfigData) it9.next()).getFormat() != ((InputConfigData) arrayList.get(0)).getFormat()) {
                    throw new IllegalStateException("All InputStream.Config objects must have the same format for multi resolution");
                }
            }
        }
        if (cameraDevice.createCaptureSession(new SessionConfigData(i, arrayList, outputConfigurationsBuildOutputConfigurations.getAll(), this.threads.getCamera2Executor(), captureSessionState, this.graphConfig.getSessionTemplate(), this.graphConfig.getSessionParameters(), this.graphConfig.getSessionColorSpace(), null))) {
            return new CaptureSessionFactory.Result.Success(outputConfigurationsBuildOutputConfigurations.getDeferred(), outputConfigurationsBuildOutputConfigurations.getOutputSurfaceMap());
        }
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            String str2 = "Failed to create capture session from " + cameraDevice + " for " + captureSessionState + '!';
        }
        captureSessionState.onSessionFinalized();
        return CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}
