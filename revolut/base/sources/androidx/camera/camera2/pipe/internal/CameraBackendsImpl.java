package androidx.camera.camera2.pipe.internal;

import android.content.Context;
import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackendFactory;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.config.CameraPipeModule;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import x.a;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001$B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010 \u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraBackendsImpl;", "Landroidx/camera/camera2/pipe/CameraBackends;", "Landroidx/camera/camera2/pipe/CameraBackendId;", "defaultBackendId", "", "Landroidx/camera/camera2/pipe/CameraBackendFactory;", "cameraBackends", "Landroid/content/Context;", "cameraPipeContext", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "cameraPipeLifetime", "<init>", "(Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "shutdown", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backendId", "Landroidx/camera/camera2/pipe/CameraBackend;", "get-SG3A4s8", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraBackend;", "get", "Ljava/lang/String;", "Ljava/util/Map;", "Landroid/content/Context;", "Landroidx/camera/camera2/pipe/core/Threads;", "", "lock", "Ljava/lang/Object;", "", "activeCameraBackends", "default", "Landroidx/camera/camera2/pipe/CameraBackend;", "getDefault", "()Landroidx/camera/camera2/pipe/CameraBackend;", "CameraBackendContext", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraBackendsImpl implements CameraBackends {

    @NotNull
    private final Map<CameraBackendId, CameraBackend> activeCameraBackends;

    @NotNull
    private final Map<CameraBackendId, CameraBackendFactory> cameraBackends;

    @NotNull
    private final Context cameraPipeContext;

    @NotNull
    private final CameraBackend default;

    @NotNull
    private final String defaultBackendId;

    @NotNull
    private final Object lock;

    @NotNull
    private final Threads threads;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraBackendsImpl$CameraBackendContext;", "Landroidx/camera/camera2/pipe/CameraContext;", "Landroid/content/Context;", "appContext", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraBackends;", "cameraBackends", "<init>", "(Landroid/content/Context;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraBackends;)V", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "Landroidx/camera/camera2/pipe/core/Threads;", "getThreads", "()Landroidx/camera/camera2/pipe/core/Threads;", "Landroidx/camera/camera2/pipe/CameraBackends;", "getCameraBackends", "()Landroidx/camera/camera2/pipe/CameraBackends;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CameraBackendContext implements CameraContext {

        @NotNull
        private final Context appContext;

        @NotNull
        private final CameraBackends cameraBackends;

        @NotNull
        private final Threads threads;

        public CameraBackendContext(@NotNull Context appContext, @NotNull Threads threads, @NotNull CameraBackends cameraBackends) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(threads, "threads");
            Intrinsics.checkNotNullParameter(cameraBackends, "cameraBackends");
            this.appContext = appContext;
            this.threads = threads;
            this.cameraBackends = cameraBackends;
        }
    }

    public /* synthetic */ CameraBackendsImpl(String str, Map map, Context context, Threads threads, CameraPipeLifetime cameraPipeLifetime, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, context, threads, cameraPipeLifetime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CameraBackendsImpl cameraBackendsImpl) throws Throwable {
        e0.E(g.f186406a, new CameraBackendsImpl$1$1(cameraBackendsImpl, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    /* JADX INFO: renamed from: get-SG3A4s8 */
    public CameraBackend mo112getSG3A4s8(@NotNull String backendId) {
        CameraBackend cameraBackendProvideCameraBackends$lambda$2;
        Intrinsics.checkNotNullParameter(backendId, "backendId");
        synchronized (this.lock) {
            try {
                CameraBackend cameraBackend = this.activeCameraBackends.get(CameraBackendId.m105boximpl(backendId));
                if (cameraBackend != null) {
                    return cameraBackend;
                }
                CameraBackendFactory cameraBackendFactory = this.cameraBackends.get(CameraBackendId.m105boximpl(backendId));
                if (cameraBackendFactory != null) {
                    cameraBackendProvideCameraBackends$lambda$2 = CameraPipeModule.Companion.provideCameraBackends$lambda$2(((a) cameraBackendFactory).f301436a, new CameraBackendContext(this.cameraPipeContext, this.threads, this));
                } else {
                    cameraBackendProvideCameraBackends$lambda$2 = null;
                }
                if (cameraBackendProvideCameraBackends$lambda$2 != null) {
                    if (!CameraBackendId.m108equalsimpl0(backendId, cameraBackendProvideCameraBackends$lambda$2.mo103getIdQwmhuAM())) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) CameraBackendId.m110toStringimpl(backendId)) + " but it was actually " + ((Object) CameraBackendId.m110toStringimpl(cameraBackendProvideCameraBackends$lambda$2.mo103getIdQwmhuAM()))).toString());
                    }
                    this.activeCameraBackends.put(CameraBackendId.m105boximpl(backendId), cameraBackendProvideCameraBackends$lambda$2);
                }
                return cameraBackendProvideCameraBackends$lambda$2;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    @NotNull
    public CameraBackend getDefault() {
        return this.default;
    }

    public Object shutdown(@NotNull Continuation<? super Unit> continuation) {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
        }
        Map<CameraBackendId, CameraBackend> map = this.activeCameraBackends;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<CameraBackendId, CameraBackend>> it8 = map.entrySet().iterator();
        while (it8.hasNext()) {
            arrayList.add(it8.next().getValue().shutdownAsync());
        }
        Object objZ = e0.z(arrayList, continuation);
        return objZ == fim.a.COROUTINE_SUSPENDED ? objZ : Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CameraBackendsImpl(String defaultBackendId, Map<CameraBackendId, ? extends CameraBackendFactory> cameraBackends, Context cameraPipeContext, Threads threads, CameraPipeLifetime cameraPipeLifetime) {
        Intrinsics.checkNotNullParameter(defaultBackendId, "defaultBackendId");
        Intrinsics.checkNotNullParameter(cameraBackends, "cameraBackends");
        Intrinsics.checkNotNullParameter(cameraPipeContext, "cameraPipeContext");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(cameraPipeLifetime, "cameraPipeLifetime");
        this.defaultBackendId = defaultBackendId;
        this.cameraBackends = cameraBackends;
        this.cameraPipeContext = cameraPipeContext;
        this.threads = threads;
        this.lock = new Object();
        this.activeCameraBackends = new LinkedHashMap();
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.CAMERA, new a0.a(this, 0));
        CameraBackend cameraBackendMo112getSG3A4s8 = mo112getSG3A4s8(defaultBackendId);
        if (cameraBackendMo112getSG3A4s8 != null) {
            this.default = cameraBackendMo112getSG3A4s8;
            return;
        }
        throw new IllegalStateException(("Failed to load the default backend for " + ((Object) CameraBackendId.m110toStringimpl(defaultBackendId)) + "! Available backends are " + cameraBackends.keySet()).toString());
    }
}
