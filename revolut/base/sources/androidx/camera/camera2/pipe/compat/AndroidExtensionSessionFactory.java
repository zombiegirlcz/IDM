package androidx.camera.camera2.pipe.compat;

import android.view.Surface;
import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.HandlerExecutor;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidExtensionSessionFactory;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "threads", "Landroidx/camera/camera2/pipe/core/Threads;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "streamGraph", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "camera2MetadataProvider", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "strictMode", "Landroidx/camera/camera2/pipe/StrictMode;", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;Landroidx/camera/camera2/pipe/StrictMode;)V", "create", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "cameraDevice", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "surfaces", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "captureSessionState", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidExtensionSessionFactory implements CaptureSessionFactory {

    @NotNull
    private final Camera2MetadataProvider camera2MetadataProvider;

    @NotNull
    private final CameraGraph.Config graphConfig;

    @NotNull
    private final StreamGraphImpl streamGraph;

    @NotNull
    private final StrictMode strictMode;

    @NotNull
    private final Threads threads;

    public AndroidExtensionSessionFactory(@NotNull Threads threads, @NotNull CameraGraph.Config graphConfig, @NotNull StreamGraphImpl streamGraph, @NotNull Camera2MetadataProvider camera2MetadataProvider, @NotNull StrictMode strictMode) {
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        Intrinsics.checkNotNullParameter(streamGraph, "streamGraph");
        Intrinsics.checkNotNullParameter(camera2MetadataProvider, "camera2MetadataProvider");
        Intrinsics.checkNotNullParameter(strictMode, "strictMode");
        this.threads = threads;
        this.graphConfig = graphConfig;
        this.streamGraph = streamGraph;
        this.camera2MetadataProvider = camera2MetadataProvider;
        this.strictMode = strictMode;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    @NotNull
    public CaptureSessionFactory.Result create(@NotNull CameraDeviceWrapper cameraDevice, @NotNull Map<StreamId, ? extends Surface> surfaces, @NotNull CaptureSessionState captureSessionState) throws Exception {
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        Intrinsics.checkNotNullParameter(surfaces, "surfaces");
        Intrinsics.checkNotNullParameter(captureSessionState, "captureSessionState");
        if (!CameraGraph.OperatingMode.m170equalsimpl0(this.graphConfig.getSessionMode(), CameraGraph.OperatingMode.INSTANCE.m174getEXTENSION2uNL3no())) {
            throw new IllegalArgumentException("Unsupported session mode: " + ((Object) CameraGraph.OperatingMode.m172toStringimpl(this.graphConfig.getSessionMode())) + " for Extension CameraGraph");
        }
        Object obj2 = this.graphConfig.getSessionParameters().get(CameraPipeKeys.INSTANCE.getCamera2ExtensionMode());
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num == null) {
            throw new IllegalStateException("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
        }
        int iIntValue = num.intValue();
        if (this.graphConfig.getInput() != null) {
            throw new IllegalStateException("Reprocessing is not supported for Extensions");
        }
        CameraMetadata cameraMetadataMo405awaitCameraMetadataEfqyGwQ = this.camera2MetadataProvider.mo405awaitCameraMetadataEfqyGwQ(cameraDevice.getCameraId());
        Set<Integer> supportedExtensions = cameraMetadataMo405awaitCameraMetadataEfqyGwQ.getSupportedExtensions();
        StrictMode strictMode = this.strictMode;
        if (!supportedExtensions.contains(Integer.valueOf(iIntValue))) {
            String str = cameraDevice + " does not support extension mode " + iIntValue + ". Supported extensions are " + supportedExtensions;
            if (strictMode.getEnabled()) {
                throw new IllegalStateException(str);
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
            }
        }
        if (this.graphConfig.getPostviewStream() != null) {
            CameraExtensionMetadata cameraExtensionMetadataAwaitExtensionMetadata = cameraMetadataMo405awaitCameraMetadataEfqyGwQ.awaitExtensionMetadata(iIntValue);
            StrictMode strictMode2 = this.strictMode;
            if (!cameraExtensionMetadataAwaitExtensionMetadata.isPostviewSupported()) {
                String str2 = cameraDevice + " does not support Postview streams";
                if (strictMode2.getEnabled()) {
                    throw new IllegalStateException(str2);
                }
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                }
            }
            if (this.graphConfig.getPostviewStream().getOutputs().size() != 1) {
                throw new IllegalStateException("Postview streams can only have one OutputStream.config object");
            }
        }
        OutputConfigurations outputConfigurationsBuildOutputConfigurations = CaptureSessionFactoryKt.buildOutputConfigurations(this.graphConfig, this.streamGraph, surfaces);
        if (outputConfigurationsBuildOutputConfigurations.getAll().isEmpty()) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str3 = "Failed to create OutputConfigurations for " + this.graphConfig;
            }
            captureSessionState.onSessionFinalized();
            return CaptureSessionFactory.Result.Failed.INSTANCE;
        }
        if (!outputConfigurationsBuildOutputConfigurations.getDeferred().isEmpty()) {
            throw new IllegalStateException("Deferred output is not supported for Extensions");
        }
        if (cameraDevice.createExtensionSession(new ExtensionSessionConfigData(2, outputConfigurationsBuildOutputConfigurations.getAll(), new HandlerExecutor(this.threads.getCamera2Handler()), captureSessionState, this.graphConfig.getSessionTemplate(), this.graphConfig.getSessionParameters(), Integer.valueOf(iIntValue), new ExtensionSessionState(captureSessionState), outputConfigurationsBuildOutputConfigurations.getPostviewOutput()))) {
            return new CaptureSessionFactory.Result.Success(outputConfigurationsBuildOutputConfigurations.getDeferred(), outputConfigurationsBuildOutputConfigurations.getOutputSurfaceMap());
        }
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            String str4 = "Failed to create ExtensionCaptureSession from " + cameraDevice + " for " + captureSessionState + '!';
        }
        captureSessionState.onSessionFinalized();
        return CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}
