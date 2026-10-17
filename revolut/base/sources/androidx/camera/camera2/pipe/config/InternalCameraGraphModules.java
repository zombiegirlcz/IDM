package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackendFactory;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.config.CameraPipeModule;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x.a;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/config/InternalCameraGraphModules;", "", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class InternalCameraGraphModules {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0007J@\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u0019"}, d2 = {"Landroidx/camera/camera2/pipe/config/InternalCameraGraphModules$Companion;", "", "<init>", "()V", "provideCameraBackend", "Landroidx/camera/camera2/pipe/CameraBackend;", "cameraBackends", "Landroidx/camera/camera2/pipe/CameraBackends;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "cameraContext", "Landroidx/camera/camera2/pipe/CameraContext;", "provideCameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraBackend", "provideCameraController", "Landroidx/camera/camera2/pipe/CameraController;", "graphId", "Landroidx/camera/camera2/pipe/CameraGraphId;", "graphProcessor", "Landroidx/camera/camera2/pipe/graph/GraphProcessorImpl;", "streamGraph", "Landroidx/camera/camera2/pipe/StreamGraph;", "surfaceTracker", "Landroidx/camera/camera2/pipe/SurfaceTracker;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CameraBackend provideCameraBackend(@NotNull CameraBackends cameraBackends, @NotNull CameraGraph.Config graphConfig, @NotNull CameraContext cameraContext) {
            Intrinsics.checkNotNullParameter(cameraBackends, "cameraBackends");
            Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
            Intrinsics.checkNotNullParameter(cameraContext, "cameraContext");
            CameraBackendFactory customCameraBackend = graphConfig.getCustomCameraBackend();
            if (customCameraBackend != null) {
                return CameraPipeModule.Companion.provideCameraBackends$lambda$2(((a) customCameraBackend).f301436a, cameraContext);
            }
            String cameraBackendId = graphConfig.getCameraBackendId();
            if (cameraBackendId == null) {
                return cameraBackends.getDefault();
            }
            CameraBackend cameraBackendMo112getSG3A4s8 = cameraBackends.mo112getSG3A4s8(cameraBackendId);
            if (cameraBackendMo112getSG3A4s8 != null) {
                return cameraBackendMo112getSG3A4s8;
            }
            throw new IllegalStateException(("Failed to initialize " + ((Object) CameraBackendId.m110toStringimpl(cameraBackendId)) + " from " + graphConfig).toString());
        }

        @NotNull
        public final CameraController provideCameraController(@NotNull CameraGraphId graphId, @NotNull CameraGraph.Config graphConfig, @NotNull CameraBackend cameraBackend, @NotNull CameraContext cameraContext, @NotNull GraphProcessorImpl graphProcessor, @NotNull StreamGraph streamGraph, @NotNull SurfaceTracker surfaceTracker) {
            Intrinsics.checkNotNullParameter(graphId, "graphId");
            Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
            Intrinsics.checkNotNullParameter(cameraBackend, "cameraBackend");
            Intrinsics.checkNotNullParameter(cameraContext, "cameraContext");
            Intrinsics.checkNotNullParameter(graphProcessor, "graphProcessor");
            Intrinsics.checkNotNullParameter(streamGraph, "streamGraph");
            Intrinsics.checkNotNullParameter(surfaceTracker, "surfaceTracker");
            return cameraBackend.createCameraController(cameraContext, graphId, graphConfig, graphProcessor, streamGraph, surfaceTracker);
        }

        @NotNull
        public final CameraMetadata provideCameraMetadata(@NotNull CameraGraph.Config graphConfig, @NotNull CameraBackend cameraBackend) {
            Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
            Intrinsics.checkNotNullParameter(cameraBackend, "cameraBackend");
            CameraMetadata cameraMetadataMo102awaitCameraMetadataEfqyGwQ = cameraBackend.mo102awaitCameraMetadataEfqyGwQ(graphConfig.getCamera());
            if (cameraMetadataMo102awaitCameraMetadataEfqyGwQ != null) {
                return cameraMetadataMo102awaitCameraMetadataEfqyGwQ;
            }
            throw new IllegalStateException(("Failed to load metadata for " + ((Object) CameraId.m186toStringimpl(graphConfig.getCamera())) + '!').toString());
        }

        private Companion() {
        }
    }
}
