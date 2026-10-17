package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.core.SystemClockOffsets;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.Listener3A;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.graph.SurfaceGraph;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import phm.a;
import skm.b0;
import skm.c2;
import skm.e0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/config/SharedCameraGraphModules;", "", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SharedCameraGraphModules {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010%\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020#H\u0007¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/camera/camera2/pipe/config/SharedCameraGraphModules$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "Lkotlinx/coroutines/CoroutineScope;", "provideCameraGraphCoroutineScope", "(Landroidx/camera/camera2/pipe/core/Threads;Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CoroutineScope;", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/graph/Listener3A;", "listener3A", "Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "frameDistributor", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "provideRequestListeners", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/Listener3A;Landroidx/camera/camera2/pipe/internal/FrameDistributor;)Ljava/util/List;", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraphImpl", "Lphm/a;", "Landroidx/camera/camera2/pipe/CameraController;", "cameraController", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "cameraSurfaceManager", "Landroidx/camera/camera2/pipe/graph/SurfaceGraph;", "provideSurfaceGraph", "(Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Lphm/a;Landroidx/camera/camera2/pipe/CameraSurfaceManager;)Landroidx/camera/camera2/pipe/graph/SurfaceGraph;", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "frameCaptureQueue", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/camera2/pipe/core/SystemClockOffsets;", "systemClockOffsets", "provideFrameDistributor", "(Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/core/SystemClockOffsets;)Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "provideSystemClockOffsets", "()Landroidx/camera/camera2/pipe/core/SystemClockOffsets;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineScope provideCameraGraphCoroutineScope(@NotNull Threads threads, @NotNull Job cameraPipeJob) {
            Intrinsics.checkNotNullParameter(threads, "threads");
            Intrinsics.checkNotNullParameter(cameraPipeJob, "cameraPipeJob");
            return e0.c(e.d(new c2(cameraPipeJob), threads.getLightweightDispatcher().plus(new b0("CXCP-Graph"))));
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.camera.camera2.pipe.internal.FrameDistributor provideFrameDistributor(@org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.graph.StreamGraphImpl r8, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.internal.FrameCaptureQueue r9, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.CameraMetadata r10, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.core.SystemClockOffsets r11) {
            /*
                r7 = this;
                java.lang.String r0 = "streamGraphImpl"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "frameCaptureQueue"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = "cameraMetadata"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "systemClockOffsets"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE
                java.lang.String r1 = "SENSOR_INFO_TIMESTAMP_SOURCE"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.Object r10 = r10.get(r0)
                java.lang.Integer r10 = (java.lang.Integer) r10
                if (r10 != 0) goto L26
                goto L2f
            L26:
                int r10 = r10.intValue()
                r0 = 1
                if (r10 != r0) goto L2f
            L2d:
                r4 = r0
                goto L31
            L2f:
                r0 = 0
                goto L2d
            L31:
                androidx.camera.camera2.pipe.internal.FrameDistributor r1 = new androidx.camera.camera2.pipe.internal.FrameDistributor
                long r5 = r11.getRealtimeNsToMonotonicNs()
                r2 = r8
                r3 = r9
                r1.<init>(r2, r3, r4, r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.config.SharedCameraGraphModules.Companion.provideFrameDistributor(androidx.camera.camera2.pipe.graph.StreamGraphImpl, androidx.camera.camera2.pipe.internal.FrameCaptureQueue, androidx.camera.camera2.pipe.CameraMetadata, androidx.camera.camera2.pipe.core.SystemClockOffsets):androidx.camera.camera2.pipe.internal.FrameDistributor");
        }

        @NotNull
        public final List<Request.Listener> provideRequestListeners(@NotNull CameraGraph.Config graphConfig, @NotNull Listener3A listener3A, @NotNull FrameDistributor frameDistributor) {
            Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
            Intrinsics.checkNotNullParameter(listener3A, "listener3A");
            Intrinsics.checkNotNullParameter(frameDistributor, "frameDistributor");
            ArrayList arrayListN = v.n(listener3A);
            arrayListN.add(listener3A);
            arrayListN.add(frameDistributor);
            arrayListN.addAll(graphConfig.getDefaultListeners());
            return arrayListN;
        }

        @NotNull
        public final SurfaceGraph provideSurfaceGraph(@NotNull StreamGraphImpl streamGraphImpl, @NotNull a cameraController, @NotNull CameraSurfaceManager cameraSurfaceManager) {
            Intrinsics.checkNotNullParameter(streamGraphImpl, "streamGraphImpl");
            Intrinsics.checkNotNullParameter(cameraController, "cameraController");
            Intrinsics.checkNotNullParameter(cameraSurfaceManager, "cameraSurfaceManager");
            return new SurfaceGraph(streamGraphImpl, cameraController, cameraSurfaceManager, streamGraphImpl.getImageSourceMap$camera_camera2_pipe());
        }

        @NotNull
        public final SystemClockOffsets provideSystemClockOffsets() {
            return SystemClockOffsets.INSTANCE.estimate();
        }

        private Companion() {
        }
    }
}
