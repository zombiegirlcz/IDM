package androidx.camera.camera2.pipe;

import aim.f;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.config.CameraGraphConfigModule;
import androidx.camera.camera2.pipe.config.CameraPipeComponent;
import androidx.camera.camera2.pipe.config.CameraPipeModule;
import androidx.camera.camera2.pipe.core.Debug;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.d;
import x.a;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\"\u001a\u00020.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010/¨\u00060"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipeImpl;", "Landroidx/camera/camera2/pipe/CameraPipe;", "Landroidx/camera/camera2/pipe/config/CameraPipeComponent;", "component", "<init>", "(Landroidx/camera/camera2/pipe/config/CameraPipeComponent;)V", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "config", "Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphId", "Landroidx/camera/camera2/pipe/CameraGraph;", "createCameraGraphLocked", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraGraphId;)Landroidx/camera/camera2/pipe/CameraGraph;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraBackend;", "getBackend", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)Landroidx/camera/camera2/pipe/CameraBackend;", "createCameraGraph", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)Landroidx/camera/camera2/pipe/CameraGraph;", "Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;", "", "createCameraGraphs", "(Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;)Ljava/util/List;", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameras", "()Landroidx/camera/camera2/pipe/CameraDevices;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "cameraSurfaceManager", "()Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "Landroidx/camera/camera2/pipe/ConfigQueryResult;", "isConfigSupported-NpXggIU", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConfigSupported", "", "shutdown", "()V", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/config/CameraPipeComponent;", "", "debugId", "I", "", "lock", "Ljava/lang/Object;", "", "Z", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraPipeImpl implements CameraPipe {

    @NotNull
    private final CameraPipeComponent component;
    private final int debugId;

    @NotNull
    private final Object lock;
    private boolean shutdown;

    public CameraPipeImpl(@NotNull CameraPipeComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        d cameraPipeIds = CameraPipeKt.getCameraPipeIds();
        cameraPipeIds.getClass();
        this.debugId = d.f254895b.incrementAndGet(cameraPipeIds);
        this.lock = new Object();
    }

    private final CameraGraph createCameraGraphLocked(CameraGraph.Config config, CameraGraphId cameraGraphId) {
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) CameraId.m186toStringimpl(config.getCamera())));
            return this.component.cameraGraphComponentBuilder().cameraGraphConfigModule(new CameraGraphConfigModule(config, cameraGraphId)).build().cameraGraph();
        } finally {
            Trace.endSection();
        }
    }

    private final CameraBackend getBackend(CameraGraph.Config graphConfig) {
        CameraBackend cameraBackendProvideCameraBackends$lambda$2;
        synchronized (this.lock) {
            try {
                if (this.shutdown) {
                    throw new IllegalStateException("Check failed.");
                }
                CameraBackendFactory customCameraBackend = graphConfig.getCustomCameraBackend();
                if (customCameraBackend != null) {
                    cameraBackendProvideCameraBackends$lambda$2 = CameraPipeModule.Companion.provideCameraBackends$lambda$2(((a) customCameraBackend).f301436a, this.component.cameraContext());
                } else {
                    String cameraBackendId = graphConfig.getCameraBackendId();
                    if (cameraBackendId != null) {
                        CameraBackend cameraBackendMo112getSG3A4s8 = this.component.cameraBackends().mo112getSG3A4s8(cameraBackendId);
                        if (cameraBackendMo112getSG3A4s8 == null) {
                            throw new IllegalStateException(("Failed to initialize " + ((Object) CameraBackendId.m110toStringimpl(cameraBackendId)) + " from " + graphConfig).toString());
                        }
                        cameraBackendProvideCameraBackends$lambda$2 = cameraBackendMo112getSG3A4s8;
                    } else {
                        cameraBackendProvideCameraBackends$lambda$2 = this.component.cameraBackends().getDefault();
                    }
                }
            } finally {
            }
        }
        return cameraBackendProvideCameraBackends$lambda$2;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    @NotNull
    public CameraSurfaceManager cameraSurfaceManager() {
        CameraSurfaceManager cameraSurfaceManager;
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            cameraSurfaceManager = this.component.cameraSurfaceManager();
        }
        return cameraSurfaceManager;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    @NotNull
    public CameraDevices cameras() {
        CameraDevices cameraDevicesCameras;
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            cameraDevicesCameras = this.component.cameras();
        }
        return cameraDevicesCameras;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    @NotNull
    public CameraGraph createCameraGraph(@NotNull CameraGraph.Config config) {
        CameraGraph cameraGraphCreateCameraGraphLocked;
        Intrinsics.checkNotNullParameter(config, "config");
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            cameraGraphCreateCameraGraphLocked = createCameraGraphLocked(config, CameraGraphId.INSTANCE.nextId());
        }
        return cameraGraphCreateCameraGraphLocked;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    @NotNull
    public List<CameraGraph> createCameraGraphs(@NotNull CameraGraph.ConcurrentConfig config) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(config, "config");
        synchronized (this.lock) {
            try {
                if (this.shutdown) {
                    throw new IllegalStateException("Check failed.");
                }
                f builder = new f();
                Iterator<CameraGraph.Config> it8 = config.getGraphConfigs().iterator();
                while (it8.hasNext()) {
                    builder.put(it8.next(), CameraGraphId.INSTANCE.nextId());
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                f fVarB = builder.b();
                List<CameraGraph.Config> graphConfigs = config.getGraphConfigs();
                ArrayList arrayList2 = new ArrayList(w.t(graphConfigs, 10));
                Iterator<T> it9 = graphConfigs.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(CameraId.m181boximpl(((CameraGraph.Config) it9.next()).getCamera()));
                }
                ConcurrentCameraGraphs concurrentCameraGraphs = new ConcurrentCameraGraphs(d0.i1(fVarB.values()), d0.i1(arrayList2));
                List<CameraGraph.Config> graphConfigs2 = config.getGraphConfigs();
                arrayList = new ArrayList(w.t(graphConfigs2, 10));
                for (CameraGraph.Config config2 : graphConfigs2) {
                    config2.setConcurrentCameraGraphs$camera_camera2_pipe(concurrentCameraGraphs);
                    Object obj2 = fVarB.get(config2);
                    if (obj2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.add(createCameraGraphLocked(config2, (CameraGraphId) obj2));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    /* JADX INFO: renamed from: isConfigSupported-NpXggIU */
    public Object mo192isConfigSupportedNpXggIU(@NotNull CameraGraph.Config config, @NotNull Continuation<? super ConfigQueryResult> continuation) {
        CameraBackend backend = getBackend(config);
        if (backend != null) {
            return backend.mo104isConfigSupportedNpXggIU(config, continuation);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public void shutdown() {
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            this.component.cameraPipeLifetime().shutdown();
            this.shutdown = true;
            Unit unit = Unit.f186387a;
        }
    }

    @NotNull
    public String toString() {
        return "CameraPipe-" + this.debugId;
    }
}
