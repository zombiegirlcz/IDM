package androidx.camera.camera2.pipe.compat;

import android.content.Context;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.config.Camera2ControllerComponent;
import androidx.camera.camera2.pipe.config.Camera2ControllerConfig;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import gim.d;
import gim.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g0;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010%\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b#\u0010$J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b(\u0010)J?\u00105\u001a\u0002042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020'2\u0006\u00107\u001a\u000204H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010:R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010>R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u0002040C8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR \u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00130J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2Backend;", "Landroidx/camera/camera2/pipe/CameraBackend;", "Landroidx/camera/camera2/pipe/compat/Camera2CameraController$ShutdownListener;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCache;", "camera2DeviceCache", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataCache;", "camera2MetadataCache", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceManager;", "camera2DeviceManager", "Landroidx/camera/camera2/pipe/config/Camera2ControllerComponent$Builder;", "camera2CameraControllerComponent", "Landroid/content/Context;", "cameraPipeContext", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/compat/Camera2DeviceCache;Landroidx/camera/camera2/pipe/compat/Camera2MetadataCache;Landroidx/camera/camera2/pipe/compat/Camera2DeviceManager;Landroidx/camera/camera2/pipe/config/Camera2ControllerComponent$Builder;Landroid/content/Context;)V", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "", "Landroid/hardware/camera2/params/OutputConfiguration;", "buildOutputConfiguration", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)Ljava/util/List;", "Landroidx/camera/camera2/pipe/CameraId;", "awaitCameraIds", "()Ljava/util/List;", "", "awaitConcurrentCameraIds", "()Ljava/util/Set;", "cameraId", "Landroidx/camera/camera2/pipe/CameraMetadata;", "awaitCameraMetadata-EfqyGwQ", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraMetadata;", "awaitCameraMetadata", "Landroidx/camera/camera2/pipe/ConfigQueryResult;", "isConfigSupported-NpXggIU", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConfigSupported", "Lskm/g0;", "", "shutdownAsync", "()Lskm/g0;", "Landroidx/camera/camera2/pipe/CameraContext;", "cameraContext", "Landroidx/camera/camera2/pipe/CameraGraphId;", "graphId", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "graphListener", "Landroidx/camera/camera2/pipe/StreamGraph;", "streamGraph", "Landroidx/camera/camera2/pipe/SurfaceTracker;", "surfaceTracker", "Landroidx/camera/camera2/pipe/CameraController;", "createCameraController", "(Landroidx/camera/camera2/pipe/CameraContext;Landroidx/camera/camera2/pipe/CameraGraphId;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/GraphListener;Landroidx/camera/camera2/pipe/StreamGraph;Landroidx/camera/camera2/pipe/SurfaceTracker;)Landroidx/camera/camera2/pipe/CameraController;", "cameraController", "onControllerClosed", "(Landroidx/camera/camera2/pipe/CameraController;)V", "Landroidx/camera/camera2/pipe/core/Threads;", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCache;", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataCache;", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceManager;", "Landroidx/camera/camera2/pipe/config/Camera2ControllerComponent$Builder;", "Landroid/content/Context;", "", "lock", "Ljava/lang/Object;", "", "activeCameraControllers", "Ljava/util/Set;", "Landroidx/camera/camera2/pipe/CameraBackendId;", "getId-QwmhuAM", "()Ljava/lang/String;", "id", "Lkotlinx/coroutines/flow/Flow;", "getCameraIds", "()Lkotlinx/coroutines/flow/Flow;", "cameraIds", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2Backend implements CameraBackend, Camera2CameraController.ShutdownListener {

    @NotNull
    private final Set<CameraController> activeCameraControllers;

    @NotNull
    private final Camera2ControllerComponent.Builder camera2CameraControllerComponent;

    @NotNull
    private final Camera2DeviceCache camera2DeviceCache;

    @NotNull
    private final Camera2DeviceManager camera2DeviceManager;

    @NotNull
    private final Camera2MetadataCache camera2MetadataCache;

    @NotNull
    private final Context cameraPipeContext;

    @NotNull
    private final Object lock;

    @NotNull
    private final Threads threads;

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2Backend$shutdownAsync$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2Backend$shutdownAsync$2", f = "Camera2Backend.kt", l = {190, 196}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return Camera2Backend.this.new AnonymousClass2(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        
            if (r8 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
        
            if (r8.i(r7) == r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:23:0x006e). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                yhm.o.b(r8)
                goto Lba
            L11:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L19:
                java.lang.Object r1 = r7.L$1
                androidx.camera.camera2.pipe.CameraController r1 = (androidx.camera.camera2.pipe.CameraController) r1
                java.lang.Object r4 = r7.L$0
                java.util.Iterator r4 = (java.util.Iterator) r4
                yhm.o.b(r8)
                goto L6e
            L25:
                yhm.o.b(r8)
                androidx.camera.camera2.pipe.compat.Camera2Backend r8 = androidx.camera.camera2.pipe.compat.Camera2Backend.this
                java.lang.Object r8 = androidx.camera.camera2.pipe.compat.Camera2Backend.access$getLock$p(r8)
                androidx.camera.camera2.pipe.compat.Camera2Backend r1 = androidx.camera.camera2.pipe.compat.Camera2Backend.this
                monitor-enter(r8)
                java.util.Set r1 = androidx.camera.camera2.pipe.compat.Camera2Backend.access$getActiveCameraControllers$p(r1)     // Catch: java.lang.Throwable -> Lbd
                monitor-exit(r8)
                java.util.Iterator r8 = r1.iterator()
                r4 = r8
            L3b:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L95
                java.lang.Object r8 = r4.next()
                r1 = r8
                androidx.camera.camera2.pipe.CameraController r1 = (androidx.camera.camera2.pipe.CameraController) r1
                androidx.camera.camera2.pipe.core.Log r8 = androidx.camera.camera2.pipe.core.Log.INSTANCE
                boolean r8 = r8.getDEBUG_LOGGABLE()
                if (r8 == 0) goto L61
                java.lang.String r8 = "CXCP"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Camera2Backend#shutdownAsync: Awaiting closure from "
                r5.<init>(r6)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
            L61:
                r7.L$0 = r4
                r7.L$1 = r1
                r7.label = r3
                java.lang.Object r8 = r1.awaitClosed(r7)
                if (r8 != r0) goto L6e
                goto Lb9
            L6e:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L3b
                androidx.camera.camera2.pipe.core.Log r8 = androidx.camera.camera2.pipe.core.Log.INSTANCE
                boolean r8 = r8.getWARN_LOGGABLE()
                if (r8 == 0) goto L3b
                java.lang.String r8 = "CXCP"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Failed to await closure from "
                r5.<init>(r6)
                r5.append(r1)
                r1 = 33
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                goto L3b
            L95:
                androidx.camera.camera2.pipe.core.Log r8 = androidx.camera.camera2.pipe.core.Log.INSTANCE
                boolean r8 = r8.getDEBUG_LOGGABLE()
                if (r8 == 0) goto La2
                java.lang.String r8 = "CXCP"
                java.lang.String r1 = "Camera2Backend#shutdownAsync: Closing all cameras (if any)"
            La2:
                androidx.camera.camera2.pipe.compat.Camera2Backend r8 = androidx.camera.camera2.pipe.compat.Camera2Backend.this
                androidx.camera.camera2.pipe.compat.Camera2DeviceManager r8 = androidx.camera.camera2.pipe.compat.Camera2Backend.access$getCamera2DeviceManager$p(r8)
                skm.g0 r8 = r8.closeAll(r3)
                r1 = 0
                r7.L$0 = r1
                r7.L$1 = r1
                r7.label = r2
                java.lang.Object r8 = r8.i(r7)
                if (r8 != r0) goto Lba
            Lb9:
                return r0
            Lba:
                kotlin.Unit r8 = kotlin.Unit.f186387a
                return r8
            Lbd:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2Backend.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public Camera2Backend(@NotNull Threads threads, @NotNull Camera2DeviceCache camera2DeviceCache, @NotNull Camera2MetadataCache camera2MetadataCache, @NotNull Camera2DeviceManager camera2DeviceManager, @NotNull Camera2ControllerComponent.Builder camera2CameraControllerComponent, @NotNull Context cameraPipeContext) {
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(camera2DeviceCache, "camera2DeviceCache");
        Intrinsics.checkNotNullParameter(camera2MetadataCache, "camera2MetadataCache");
        Intrinsics.checkNotNullParameter(camera2DeviceManager, "camera2DeviceManager");
        Intrinsics.checkNotNullParameter(camera2CameraControllerComponent, "camera2CameraControllerComponent");
        Intrinsics.checkNotNullParameter(cameraPipeContext, "cameraPipeContext");
        this.threads = threads;
        this.camera2DeviceCache = camera2DeviceCache;
        this.camera2MetadataCache = camera2MetadataCache;
        this.camera2DeviceManager = camera2DeviceManager;
        this.camera2CameraControllerComponent = camera2CameraControllerComponent;
        this.cameraPipeContext = cameraPipeContext;
        this.lock = new Object();
        this.activeCameraControllers = new LinkedHashSet();
    }

    private final List<OutputConfiguration> buildOutputConfiguration(CameraGraph.Config graphConfig) {
        OutputConfiguration outputConfiguration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<CameraStream.Config> it8 = graphConfig.getStreams().iterator();
        while (it8.hasNext()) {
            for (OutputStream.Config config : it8.next().getOutputs()) {
                AndroidOutputConfiguration.Companion companion = AndroidOutputConfiguration.INSTANCE;
                Integer numValueOf = Integer.valueOf(config.getFormat());
                OutputStream.OutputType sURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe = OutputStream.OutputType.INSTANCE.getSURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe();
                OutputStream.MirrorMode mirrorMode = config.getMirrorMode();
                config.m276getTimestampBasepcPfPbY();
                OutputStream.DynamicRangeProfile dynamicRangeProfile = config.getDynamicRangeProfile();
                OutputStream.StreamUseCase streamUseCase = config.getStreamUseCase();
                List<Object> sensorPixelModes = config.getSensorPixelModes();
                Size size = config.getSize();
                String camera = config.getCamera();
                OutputConfigurationWrapper outputConfigurationWrapperM374creategWWoySg$default = AndroidOutputConfiguration.Companion.m374creategWWoySg$default(companion, null, numValueOf, sURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe, mirrorMode, null, dynamicRangeProfile, streamUseCase, sensorPixelModes, size, false, 0, !(camera == null ? false : CameraId.m184equalsimpl0(camera, graphConfig.getCamera())) ? config.getCamera() : null, 1536, null);
                if (outputConfigurationWrapperM374creategWWoySg$default != null && (outputConfiguration = (OutputConfiguration) outputConfigurationWrapperM374creategWWoySg$default.unwrapAs(o0.f186429a.b(OutputConfiguration.class))) != null) {
                    linkedHashSet.add(outputConfiguration);
                }
            }
        }
        return d0.d1(linkedHashSet);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public List<CameraId> awaitCameraIds() {
        return this.camera2DeviceCache.awaitCameraIds();
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    @NotNull
    /* JADX INFO: renamed from: awaitCameraMetadata-EfqyGwQ */
    public CameraMetadata mo102awaitCameraMetadataEfqyGwQ(@NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        return this.camera2MetadataCache.mo405awaitCameraMetadataEfqyGwQ(cameraId);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public Set<Set<CameraId>> awaitConcurrentCameraIds() {
        return this.camera2DeviceCache.awaitConcurrentCameraIds();
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    @NotNull
    public CameraController createCameraController(@NotNull CameraContext cameraContext, @NotNull CameraGraphId graphId, @NotNull CameraGraph.Config graphConfig, @NotNull GraphListener graphListener, @NotNull StreamGraph streamGraph, @NotNull SurfaceTracker surfaceTracker) {
        Intrinsics.checkNotNullParameter(cameraContext, "cameraContext");
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        Intrinsics.checkNotNullParameter(graphListener, "graphListener");
        Intrinsics.checkNotNullParameter(streamGraph, "streamGraph");
        Intrinsics.checkNotNullParameter(surfaceTracker, "surfaceTracker");
        CameraController cameraController = this.camera2CameraControllerComponent.camera2ControllerConfig(new Camera2ControllerConfig(this, graphId, graphConfig, graphListener, (StreamGraphImpl) streamGraph, surfaceTracker, this)).build().cameraController();
        synchronized (this.lock) {
            this.activeCameraControllers.add(cameraController);
        }
        return cameraController;
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    @NotNull
    public Flow getCameraIds() {
        return this.camera2DeviceCache.getCameraIds();
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    @NotNull
    /* JADX INFO: renamed from: getId-QwmhuAM */
    public String mo103getIdQwmhuAM() {
        return CameraBackendId.m106constructorimpl("CXCP-Camera2");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraBackend
    /* JADX INFO: renamed from: isConfigSupported-NpXggIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo104isConfigSupportedNpXggIU(@org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.CameraGraph.Config r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.ConfigQueryResult> r9) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2Backend.mo104isConfigSupportedNpXggIU(androidx.camera.camera2.pipe.CameraGraph$Config, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CameraController.ShutdownListener
    public void onControllerClosed(@NotNull CameraController cameraController) {
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = cameraController + " finalized";
        }
        synchronized (this.lock) {
            this.activeCameraControllers.remove(cameraController);
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    @NotNull
    public g0 shutdownAsync() {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
        }
        this.camera2DeviceCache.shutdown();
        return e0.g(this.threads.getCameraPipeScope(), null, null, new AnonymousClass2(null), 3);
    }
}
