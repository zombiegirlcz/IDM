package androidx.camera.camera2.pipe.compat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.c;
import com.youTransactor.uCube.rpc.Constants;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.b0;
import skm.c2;
import skm.e0;
import skm.g0;
import t70.x;
import ukm.y;
import vkm.d2;
import vkm.q;
import yhm.j;
import yhm.o;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001BY\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010 \u001a\u00020\u001f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J7\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b$\u0010%J-\u0010'\u001a\u00020\u001f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0004\u0018\u0001002\u0006\u0010\u001c\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b1\u00102J\u001a\u00106\u001a\u0004\u0018\u0001042\u0006\u0010\u001c\u001a\u00020\u0017H\u0087@¢\u0006\u0004\b5\u00102J\u0015\u00107\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b7\u0010*J\u001b\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001708\u0018\u000108¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u001f¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010=R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010>R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010=R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR$\u0010H\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001708\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010IR(\u0010L\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000K0J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR(\u0010N\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001040K0J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010O\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158\u0006¢\u0006\f\n\u0004\b&\u0010Q\u001a\u0004\bR\u0010\u0019R#\u0010X\u001a\n S*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2DeviceCache;", "", "Lphm/a;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroid/content/Context;", "context", "Landroid/content/pm/PackageManager;", "packageManager", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;", "cameraDeviceSetupCompatFactoryProvider", "Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "cameraPipeLifetime", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "<init>", "(Lphm/a;Landroidx/camera/camera2/pipe/core/Threads;Landroid/content/Context;Landroid/content/pm/PackageManager;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Lphm/a;Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;Lkotlinx/coroutines/Job;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/camera/camera2/pipe/CameraId;", "createCameraIdListFlow", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/channels/ProducerScope;", "", "cameraId", "", "isAvailable", "", "onCameraAvailabilityChanged", "(Lkotlinx/coroutines/channels/ProducerScope;Ljava/lang/String;Z)V", "cachedCameraIds", "cameraIdsRead", "getUpdatedCameraIds", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "cameraIds", "sendCameraIdList", "(Lkotlinx/coroutines/channels/ProducerScope;Ljava/util/List;)V", "readCameraIds", "()Ljava/util/List;", "", "estimateMinInternalCameraCount", "(Landroid/content/pm/PackageManager;)I", "isValidCameraIds", "(Ljava/util/List;)Z", "Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat;", "getOrInitializeDeviceSetupCompat-0r8Bogc", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrInitializeDeviceSetupCompat", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceSetupWrapper;", "getOrInitializeDeviceSetupWrapper-0r8Bogc", "getOrInitializeDeviceSetupWrapper", "awaitCameraIds", "", "awaitConcurrentCameraIds", "()Ljava/util/Set;", "shutdown", "()V", "Lphm/a;", "Landroidx/camera/camera2/pipe/core/Threads;", "Landroid/content/Context;", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "lock", "Ljava/lang/Object;", "openableCameras", "Ljava/util/List;", "concurrentCameras", "Ljava/util/Set;", "", "Lskm/g0;", "cameraDeviceSetupCache", "Ljava/util/Map;", "camera2DeviceSetupWrapperCache", "minimumCameraCount", "I", "Lkotlinx/coroutines/flow/Flow;", "getCameraIds", "kotlin.jvm.PlatformType", "cameraDeviceSetupCompatFactory$delegate", "Lkotlin/Lazy;", "getCameraDeviceSetupCompatFactory", "()Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;", "cameraDeviceSetupCompatFactory", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2DeviceCache {

    @NotNull
    private final Map<CameraId, g0> camera2DeviceSetupWrapperCache;

    @NotNull
    private final Map<CameraId, g0> cameraDeviceSetupCache;

    /* JADX INFO: renamed from: cameraDeviceSetupCompatFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cameraDeviceSetupCompatFactory;

    @NotNull
    private final phm.a cameraDeviceSetupCompatFactoryProvider;

    @NotNull
    private final CameraErrorListener cameraErrorListener;

    @NotNull
    private final Flow cameraIds;

    @NotNull
    private final phm.a cameraManager;
    private Set<? extends Set<CameraId>> concurrentCameras;

    @NotNull
    private final Context context;

    @NotNull
    private final Object lock;
    private final int minimumCameraCount;
    private List<CameraId> openableCameras;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final Threads threads;

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1", f = "Camera2DeviceCache.kt", l = {Constants.TAG_EMV_NFC_CONFIG_VERSION}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Landroidx/camera/camera2/pipe/CameraId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<ProducerScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(CameraManager cameraManager, Camera2DeviceCache$createCameraIdListFlow$1$callback$1 camera2DeviceCache$createCameraIdListFlow$1$callback$1) {
            cameraManager.unregisterAvailabilityCallback(camera2DeviceCache$createCameraIdListFlow$1$callback$1);
            return Unit.f186387a;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = Camera2DeviceCache.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj2;
            return anonymousClass1;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            List list;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final Camera2DeviceCache camera2DeviceCache = Camera2DeviceCache.this;
                CameraManager.AvailabilityCallback availabilityCallback = new CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1$callback$1
                    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                    public void onCameraAvailable(String cameraId) {
                        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
                        camera2DeviceCache.onCameraAvailabilityChanged(producerScope, cameraId, true);
                    }

                    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                    public void onCameraUnavailable(String cameraId) {
                        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
                        camera2DeviceCache.onCameraAvailabilityChanged(producerScope, cameraId, false);
                    }
                };
                CameraManager cameraManager = (CameraManager) Camera2DeviceCache.this.cameraManager.get();
                cameraManager.registerAvailabilityCallback(availabilityCallback, Camera2DeviceCache.this.threads.getCamera2Handler());
                Object obj3 = Camera2DeviceCache.this.lock;
                Camera2DeviceCache camera2DeviceCache2 = Camera2DeviceCache.this;
                synchronized (obj3) {
                    list = camera2DeviceCache2.openableCameras;
                }
                if (list != null) {
                    Camera2DeviceCache.this.sendCameraIdList(producerScope, list);
                } else {
                    List cameraIds = Camera2DeviceCache.this.readCameraIds();
                    if (cameraIds != null) {
                        Camera2DeviceCache.this.sendCameraIdList(producerScope, cameraIds);
                    }
                }
                a aVar2 = new a(cameraManager, availabilityCallback, 2);
                this.label = 1;
                if (com.bumptech.glide.d.d(producerScope, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public Camera2DeviceCache(@NotNull phm.a cameraManager, @NotNull Threads threads, @NotNull Context context, @NotNull PackageManager packageManager, @NotNull CameraErrorListener cameraErrorListener, @NotNull phm.a cameraDeviceSetupCompatFactoryProvider, @NotNull CameraPipeLifetime cameraPipeLifetime, @NotNull Job cameraPipeJob) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(cameraErrorListener, "cameraErrorListener");
        Intrinsics.checkNotNullParameter(cameraDeviceSetupCompatFactoryProvider, "cameraDeviceSetupCompatFactoryProvider");
        Intrinsics.checkNotNullParameter(cameraPipeLifetime, "cameraPipeLifetime");
        Intrinsics.checkNotNullParameter(cameraPipeJob, "cameraPipeJob");
        this.cameraManager = cameraManager;
        this.threads = threads;
        this.context = context;
        this.cameraErrorListener = cameraErrorListener;
        this.cameraDeviceSetupCompatFactoryProvider = cameraDeviceSetupCompatFactoryProvider;
        zkm.d dVarC = e0.c(e.d(new c2(cameraPipeJob), threads.getLightweightDispatcher()).plus(new b0("Camera2DeviceCache")));
        this.scope = dVarC;
        this.lock = new Object();
        this.cameraDeviceSetupCache = new LinkedHashMap();
        this.camera2DeviceSetupWrapperCache = new LinkedHashMap();
        this.minimumCameraCount = estimateMinInternalCameraCount(packageManager);
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = "Camera2DeviceCache: Expected minimum camera count = " + this.minimumCameraCount;
        }
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.SCOPE, new x(this, 23));
        this.cameraIds = q.M(q.q(createCameraIdListFlow()), dVarC, vkm.c2.a(d2.Companion, 0L, 3), 1);
        this.cameraDeviceSetupCompatFactory = j.b(new vt3.a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(Camera2DeviceCache camera2DeviceCache) {
        e0.k(camera2DeviceCache.scope, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraDeviceSetupCompatFactory cameraDeviceSetupCompatFactory_delegate$lambda$0(Camera2DeviceCache camera2DeviceCache) {
        return (CameraDeviceSetupCompatFactory) camera2DeviceCache.cameraDeviceSetupCompatFactoryProvider.get();
    }

    private final Flow createCameraIdListFlow() {
        return q.k(new AnonymousClass1(null));
    }

    private final int estimateMinInternalCameraCount(PackageManager packageManager) {
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        return packageManager.hasSystemFeature("android.hardware.camera.front") ? (zHasSystemFeature ? 1 : 0) + 1 : zHasSystemFeature ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraDeviceSetupCompatFactory getCameraDeviceSetupCompatFactory() {
        return (CameraDeviceSetupCompatFactory) this.cameraDeviceSetupCompatFactory.getValue();
    }

    private final List<CameraId> getUpdatedCameraIds(List<CameraId> cachedCameraIds, List<CameraId> cameraIdsRead) {
        return (cameraIdsRead == null || !(isValidCameraIds(cameraIdsRead) || cachedCameraIds == null)) ? cachedCameraIds : cameraIdsRead;
    }

    private final boolean isValidCameraIds(List<CameraId> cameraIds) {
        return cameraIds.size() >= this.minimumCameraCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCameraAvailabilityChanged(kotlinx.coroutines.channels.ProducerScope r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            java.util.List<androidx.camera.camera2.pipe.CameraId> r1 = r3.openableCameras     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r0)
            r0 = 1
            r2 = 0
            if (r6 != r0) goto L5c
            if (r1 == 0) goto L39
            r6 = r1
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L1d
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            goto L39
        L1d:
            java.util.Iterator r6 = r6.iterator()
        L21:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r6.next()
            androidx.camera.camera2.pipe.CameraId r0 = (androidx.camera.camera2.pipe.CameraId) r0
            java.lang.String r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r5)
            if (r0 == 0) goto L21
            goto Lad
        L39:
            androidx.camera.camera2.pipe.core.Log r6 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r6 = r6.getINFO_LOGGABLE()
            if (r6 == 0) goto L57
            java.lang.String r6 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "New camera "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r5 = " detected"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L57:
            java.util.List r2 = r3.readCameraIds()
            goto Lad
        L5c:
            if (r6 != 0) goto Lb7
            if (r1 == 0) goto L8b
            r6 = r1
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L71
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L71
            goto Lad
        L71:
            java.util.Iterator r6 = r6.iterator()
        L75:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r6.next()
            androidx.camera.camera2.pipe.CameraId r0 = (androidx.camera.camera2.pipe.CameraId) r0
            java.lang.String r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r5)
            if (r0 == 0) goto L75
        L8b:
            androidx.camera.camera2.pipe.core.Log r6 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r6 = r6.getINFO_LOGGABLE()
            if (r6 == 0) goto La9
            java.lang.String r6 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unavailable camera "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r5 = " detected"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        La9:
            java.util.List r2 = r3.readCameraIds()
        Lad:
            java.util.List r5 = r3.getUpdatedCameraIds(r1, r2)
            if (r5 == 0) goto Lb6
            r3.sendCameraIdList(r4, r5)
        Lb6:
            return
        Lb7:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        Lbd:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceCache.onCameraAvailabilityChanged(kotlinx.coroutines.channels.ProducerScope, java.lang.String, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CameraId> readCameraIds() {
        try {
            String[] cameraIdList = ((CameraManager) this.cameraManager.get()).getCameraIdList();
            Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                Intrinsics.h(str);
                String strM182constructorimpl = CameraId.m182constructorimpl(str);
                CameraId cameraIdM181boximpl = strM182constructorimpl != null ? CameraId.m181boximpl(strM182constructorimpl) : null;
                if (cameraIdM181boximpl != null) {
                    arrayList.add(cameraIdM181boximpl);
                }
            }
            if (isValidCameraIds(arrayList)) {
                synchronized (this.lock) {
                    this.openableCameras = arrayList;
                    Unit unit = Unit.f186387a;
                }
                if (Log.INSTANCE.getINFO_LOGGABLE()) {
                    String str2 = "Loaded CameraIdList " + arrayList;
                    return arrayList;
                }
            } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str3 = "Failed to query camera ID list: Invalid list returned: " + arrayList + CoreConstants.DOT;
            }
            return arrayList;
        } catch (CameraAccessException e) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
            }
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
            }
            return null;
        } catch (NullPointerException e4) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCameraIdList(ProducerScope producerScope, List<CameraId> list) {
        Log log2 = Log.INSTANCE;
        if (log2.getDEBUG_LOGGABLE()) {
            String str = "Emitting camera ID list: " + list;
        }
        if ((c.E(producerScope, list) instanceof y) && log2.getERROR_LOGGABLE()) {
            String str2 = "Failed to send camera ID list: " + list + '!';
        }
    }

    public final List<CameraId> awaitCameraIds() {
        List<CameraId> list;
        synchronized (this.lock) {
            list = this.openableCameras;
        }
        return list != null ? list : readCameraIds();
    }

    public final Set<Set<CameraId>> awaitConcurrentCameraIds() {
        Set set;
        if (Build.VERSION.SDK_INT < 30) {
            return h0.f322473a;
        }
        synchronized (this.lock) {
            set = this.concurrentCameras;
        }
        Set set2 = set;
        if (set2 != null && !set2.isEmpty()) {
            return set;
        }
        CameraManager cameraManager = (CameraManager) this.cameraManager.get();
        try {
            Intrinsics.h(cameraManager);
            Set<Set<String>> concurrentCameraIds = Api30Compat.getConcurrentCameraIds(cameraManager);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                String str = "Loaded ConcurrentCameraIdsSet " + concurrentCameraIds;
            }
            Set<Set<String>> set3 = concurrentCameraIds;
            ArrayList arrayList = new ArrayList(w.t(set3, 10));
            Iterator<T> it8 = set3.iterator();
            while (it8.hasNext()) {
                Set set4 = (Set) it8.next();
                ArrayList arrayList2 = new ArrayList(w.t(set4, 10));
                Iterator it9 = set4.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(CameraId.m181boximpl(CameraId.m182constructorimpl((String) it9.next())));
                }
                arrayList.add(d0.i1(arrayList2));
            }
            return d0.i1(arrayList);
        } catch (CameraAccessException e) {
            return Log.INSTANCE.getWARN_LOGGABLE() ? null : null;
        }
    }

    @NotNull
    public final Flow getCameraIds() {
        return this.cameraIds;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getOrInitializeDeviceSetupCompat-0r8Bogc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m392getOrInitializeDeviceSetupCompat0r8Bogc(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.L$1
            skm.g0 r11 = (skm.g0) r11
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            yhm.o.b(r12)
            r2 = r11
            r11 = r0
            goto L7c
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            yhm.o.b(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            r4 = 0
            if (r12 >= r2) goto L44
            return r4
        L44:
            java.lang.Object r12 = r10.lock
            monitor-enter(r12)
            java.util.Map<androidx.camera.camera2.pipe.CameraId, skm.g0> r2 = r10.cameraDeviceSetupCache     // Catch: java.lang.Throwable -> L69
            androidx.camera.camera2.pipe.CameraId r5 = androidx.camera.camera2.pipe.CameraId.m181boximpl(r11)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L6b
            kotlinx.coroutines.CoroutineScope r6 = r10.scope     // Catch: java.lang.Throwable -> L69
            androidx.camera.camera2.pipe.core.Threads r7 = r10.threads     // Catch: java.lang.Throwable -> L69
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.getBackgroundDispatcher()     // Catch: java.lang.Throwable -> L69
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1 r8 = new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1     // Catch: java.lang.Throwable -> L69
            r8.<init>(r11, r10, r4)     // Catch: java.lang.Throwable -> L69
            r9 = 2
            skm.h0 r6 = skm.e0.g(r6, r7, r4, r8, r9)     // Catch: java.lang.Throwable -> L69
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L69
            goto L6b
        L69:
            r11 = move-exception
            goto Laf
        L6b:
            r2 = r6
            skm.g0 r2 = (skm.g0) r2     // Catch: java.lang.Throwable -> L69
            monitor-exit(r12)
            r0.L$0 = r11
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r12 = r2.i(r0)
            if (r12 != r1) goto L7c
            return r1
        L7c:
            androidx.camera.featurecombinationquery.CameraDeviceSetupCompat r12 = (androidx.camera.featurecombinationquery.CameraDeviceSetupCompat) r12
            if (r12 != 0) goto Lae
            androidx.camera.camera2.pipe.core.Log r0 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r0 = r0.getDEBUG_LOGGABLE()
            if (r0 == 0) goto L9d
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing null CameraDeviceSetupCompat from cache for "
            r1.<init>(r3)
            java.lang.String r3 = androidx.camera.camera2.pipe.CameraId.m186toStringimpl(r11)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L9d:
            java.lang.Object r0 = r10.lock
            monitor-enter(r0)
            java.util.Map<androidx.camera.camera2.pipe.CameraId, skm.g0> r1 = r10.cameraDeviceSetupCache     // Catch: java.lang.Throwable -> Lab
            androidx.camera.camera2.pipe.CameraId r11 = androidx.camera.camera2.pipe.CameraId.m181boximpl(r11)     // Catch: java.lang.Throwable -> Lab
            r1.remove(r11, r2)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r0)
            return r12
        Lab:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        Lae:
            return r12
        Laf:
            monitor-exit(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceCache.m392getOrInitializeDeviceSetupCompat0r8Bogc(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getOrInitializeDeviceSetupWrapper-0r8Bogc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m393getOrInitializeDeviceSetupWrapper0r8Bogc(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.L$1
            skm.g0 r11 = (skm.g0) r11
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            yhm.o.b(r12)
            r2 = r11
            r11 = r0
            goto L75
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.lock
            monitor-enter(r12)
            java.util.Map<androidx.camera.camera2.pipe.CameraId, skm.g0> r2 = r10.camera2DeviceSetupWrapperCache     // Catch: java.lang.Throwable -> L62
            androidx.camera.camera2.pipe.CameraId r4 = androidx.camera.camera2.pipe.CameraId.m181boximpl(r11)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L64
            kotlinx.coroutines.CoroutineScope r5 = r10.scope     // Catch: java.lang.Throwable -> L62
            androidx.camera.camera2.pipe.core.Threads r6 = r10.threads     // Catch: java.lang.Throwable -> L62
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.getBackgroundDispatcher()     // Catch: java.lang.Throwable -> L62
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1 r7 = new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1     // Catch: java.lang.Throwable -> L62
            r8 = 0
            r7.<init>(r11, r10, r8)     // Catch: java.lang.Throwable -> L62
            r9 = 2
            skm.h0 r5 = skm.e0.g(r5, r6, r8, r7, r9)     // Catch: java.lang.Throwable -> L62
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r11 = move-exception
            goto La8
        L64:
            r2 = r5
            skm.g0 r2 = (skm.g0) r2     // Catch: java.lang.Throwable -> L62
            monitor-exit(r12)
            r0.L$0 = r11
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r12 = r2.i(r0)
            if (r12 != r1) goto L75
            return r1
        L75:
            androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper r12 = (androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper) r12
            if (r12 != 0) goto La7
            androidx.camera.camera2.pipe.core.Log r0 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r0 = r0.getDEBUG_LOGGABLE()
            if (r0 == 0) goto L96
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing null camera2DeviceSetupWrapper from cache for "
            r1.<init>(r3)
            java.lang.String r3 = androidx.camera.camera2.pipe.CameraId.m186toStringimpl(r11)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L96:
            java.lang.Object r0 = r10.lock
            monitor-enter(r0)
            java.util.Map<androidx.camera.camera2.pipe.CameraId, skm.g0> r1 = r10.camera2DeviceSetupWrapperCache     // Catch: java.lang.Throwable -> La4
            androidx.camera.camera2.pipe.CameraId r11 = androidx.camera.camera2.pipe.CameraId.m181boximpl(r11)     // Catch: java.lang.Throwable -> La4
            r1.remove(r11, r2)     // Catch: java.lang.Throwable -> La4
            monitor-exit(r0)
            return r12
        La4:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        La7:
            return r12
        La8:
            monitor-exit(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceCache.m393getOrInitializeDeviceSetupWrapper0r8Bogc(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void shutdown() {
        e0.k(this.scope, null);
    }
}
