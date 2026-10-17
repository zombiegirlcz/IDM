package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraPresenceListener;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.CompositionSettings;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import e0.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.b;
import org.jetbrains.annotations.NotNull;
import pth.l;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u000e2\u0016\u0010\u001c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u001b\"\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b\u001d\u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\"\u0010\u0004J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J7\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0016\u0010\u001c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u001b\"\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b*\u0010+J'\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b*\u0010.J'\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b*\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0017¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\u00020\u000e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020403H\u0017¢\u0006\u0004\b9\u00107J\u000f\u0010:\u001a\u00020\u000eH\u0003¢\u0006\u0004\b:\u0010\u0004J#\u0010>\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010;2\b\u0010=\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b>\u0010?JG\u0010E\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010@\u001a\u00020#2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010C\u001a\u00020B2\b\b\u0002\u0010D\u001a\u00020B2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bE\u0010FJ7\u0010H\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010#0G2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010@\u001a\u00020#2\b\u0010A\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020K2\u0006\u0010$\u001a\u00020#2\u0006\u0010J\u001a\u000200H\u0002¢\u0006\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR*\u0010Q\u001a\u0004\u0018\u00010P8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bW\u0010\u0004\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010YR$\u0010[\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010\n0\n0\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010a\u0012\u0004\bf\u0010\u0004\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR \u0010i\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020h0g8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010n\u001a\u0012\u0012\u0004\u0012\u00020l0kj\b\u0012\u0004\u0012\u00020l`m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u0002000p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR$\u0010w\u001a\u00020v2\u0006\u0010w\u001a\u00020v8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006|"}, d2 = {"Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;", "", "Landroidx/camera/core/CameraPresenceListener;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "initAsync$camera_lifecycle", "(Landroid/content/Context;Landroidx/camera/core/CameraXConfig;)Lcom/google/common/util/concurrent/ListenableFuture;", "initAsync", "", "configure$camera_lifecycle", "(Landroidx/camera/core/CameraXConfig;)V", "configure", "", "clearConfigProvider", "shutdownAsync$camera_lifecycle", "(Z)Lcom/google/common/util/concurrent/ListenableFuture;", "shutdownAsync", "Landroidx/camera/core/UseCase;", "useCase", "isBound", "(Landroidx/camera/core/UseCase;)Z", "", "useCases", "unbind", "([Landroidx/camera/core/UseCase;)V", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "(Landroidx/camera/core/SessionConfig;)V", "unbindAll", "Landroidx/camera/core/CameraSelector;", "cameraSelector", "hasCamera", "(Landroidx/camera/core/CameraSelector;)Z", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/camera/core/Camera;", "bindToLifecycle", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "Landroidx/camera/core/UseCaseGroup;", "useCaseGroup", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;)Landroidx/camera/core/Camera;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/SessionConfig;)Landroidx/camera/core/Camera;", "Landroidx/camera/core/CameraInfo;", "getCameraInfo", "(Landroidx/camera/core/CameraSelector;)Landroidx/camera/core/CameraInfo;", "", "Landroidx/camera/core/CameraIdentifier;", "addedCameraIds", "onCamerasAdded", "(Ljava/util/Set;)V", "removedCameraIds", "onCamerasRemoved", "shutdownInternal", "Landroidx/camera/core/CameraX;", "newCameraX", "newContext", "initInternal", "(Landroidx/camera/core/CameraX;Landroid/content/Context;)V", "primaryCameraSelector", "secondaryCameraSelector", "Landroidx/camera/core/CompositionSettings;", "primaryCompositionSettings", "secondaryCompositionSettings", "bindToLifecycleInternal", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CompositionSettings;Landroidx/camera/core/CompositionSettings;Landroidx/camera/core/SessionConfig;)Landroidx/camera/core/Camera;", "Lkotlin/Pair;", "getSelectorsWithSessionFilter", "(Landroidx/camera/core/SessionConfig;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CameraSelector;)Lkotlin/Pair;", "cameraInfo", "Landroidx/camera/core/impl/CameraConfig;", "getCameraConfig", "(Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CameraInfo;)Landroidx/camera/core/impl/CameraConfig;", "lock", "Ljava/lang/Object;", "Landroidx/camera/core/CameraXConfig$Provider;", "cameraXConfigProvider", "Landroidx/camera/core/CameraXConfig$Provider;", "getCameraXConfigProvider$camera_lifecycle", "()Landroidx/camera/core/CameraXConfig$Provider;", "setCameraXConfigProvider$camera_lifecycle", "(Landroidx/camera/core/CameraXConfig$Provider;)V", "getCameraXConfigProvider$camera_lifecycle$annotations", "cameraXInitializeFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "kotlin.jvm.PlatformType", "cameraXShutdownFuture", "cameraX", "Landroidx/camera/core/CameraX;", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "lifecycleCameraRepository", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "Landroid/content/Context;", "getContext$camera_lifecycle", "()Landroid/content/Context;", "setContext$camera_lifecycle", "(Landroid/content/Context;)V", "getContext$camera_lifecycle$annotations", "", "Landroidx/camera/core/impl/AdapterCameraInfo;", "cameraInfoMap", "Ljava/util/Map;", "Ljava/util/HashSet;", "Landroidx/camera/lifecycle/LifecycleCameraRepository$Key;", "Lkotlin/collections/HashSet;", "lifecycleCameraKeys", "Ljava/util/HashSet;", "", "getAvailableCameraInfos", "()Ljava/util/List;", "availableCameraInfos", "isInitialized", "()Z", "", "cameraOperatingMode", "getCameraOperatingMode", "()I", "setCameraOperatingMode", "(I)V", "camera-lifecycle"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LifecycleCameraProviderImpl implements CameraProvider, CameraPresenceListener {

    @NotNull
    private final Map<CameraIdentifier, AdapterCameraInfo> cameraInfoMap;
    private CameraX cameraX;
    private CameraXConfig.Provider cameraXConfigProvider;
    private ListenableFuture<Void> cameraXInitializeFuture;

    @NotNull
    private ListenableFuture<Void> cameraXShutdownFuture;
    private Context context;

    @NotNull
    private final HashSet<LifecycleCameraRepository.Key> lifecycleCameraKeys;
    private LifecycleCameraRepository lifecycleCameraRepository;

    @NotNull
    private final Object lock = new Object();

    public LifecycleCameraProviderImpl() {
        ListenableFuture<Void> listenableFutureImmediateFuture = Futures.immediateFuture(null);
        Intrinsics.checkNotNullExpressionValue(listenableFutureImmediateFuture, "immediateFuture(...)");
        this.cameraXShutdownFuture = listenableFutureImmediateFuture;
        this.cameraInfoMap = new HashMap();
        this.lifecycleCameraKeys = new HashSet<>();
    }

    private final Camera bindToLifecycleInternal(LifecycleOwner lifecycleOwner, CameraSelector primaryCameraSelector, CameraSelector secondaryCameraSelector, CompositionSettings primaryCompositionSettings, CompositionSettings secondaryCompositionSettings, SessionConfig sessionConfig) {
        CameraInternal cameraInternal;
        AdapterCameraInfo adapterCameraInfo;
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            Threads.checkMainThread();
            Pair selectorsWithSessionFilter = getSelectorsWithSessionFilter(sessionConfig, primaryCameraSelector, secondaryCameraSelector);
            CameraSelector cameraSelector = (CameraSelector) selectorsWithSessionFilter.f186385a;
            CameraSelector cameraSelector2 = (CameraSelector) selectorsWithSessionFilter.f186386b;
            CameraX cameraX = this.cameraX;
            Intrinsics.h(cameraX);
            CameraInternal cameraInternalSelect = cameraSelector.select(cameraX.getCameraRepository().getCameras());
            Intrinsics.checkNotNullExpressionValue(cameraInternalSelect, "select(...)");
            cameraInternalSelect.setPrimary(true);
            CameraInfo cameraInfo = getCameraInfo(cameraSelector);
            Intrinsics.i(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
            AdapterCameraInfo adapterCameraInfo2 = (AdapterCameraInfo) cameraInfo;
            if (cameraSelector2 != null) {
                CameraX cameraX2 = this.cameraX;
                Intrinsics.h(cameraX2);
                CameraInternal cameraInternalSelect2 = cameraSelector2.select(cameraX2.getCameraRepository().getCameras());
                cameraInternalSelect2.setPrimary(false);
                CameraInfo cameraInfo2 = getCameraInfo(cameraSelector2);
                Intrinsics.i(cameraInfo2, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
                adapterCameraInfo = (AdapterCameraInfo) cameraInfo2;
                cameraInternal = cameraInternalSelect2;
            } else {
                cameraInternal = null;
                adapterCameraInfo = null;
            }
            CameraIdentifier cameraIdentifierFromAdapterInfos = CameraIdentifier.Factory.fromAdapterInfos(adapterCameraInfo2, adapterCameraInfo);
            LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
            Intrinsics.h(lifecycleCameraRepository);
            LifecycleCamera lifecycleCamera = lifecycleCameraRepository.getLifecycleCamera(lifecycleOwner, cameraIdentifierFromAdapterInfos);
            LifecycleCameraRepository lifecycleCameraRepository2 = this.lifecycleCameraRepository;
            Intrinsics.h(lifecycleCameraRepository2);
            Collection<LifecycleCamera> lifecycleCameras = lifecycleCameraRepository2.getLifecycleCameras();
            for (UseCase useCase : sessionConfig.getUseCases()) {
                for (LifecycleCamera lifecycleCamera2 : lifecycleCameras) {
                    Intrinsics.checkNotNullExpressionValue(lifecycleCamera2, "next(...)");
                    LifecycleCamera lifecycleCamera3 = lifecycleCamera2;
                    if (lifecycleCamera3.isBound(useCase) && !Intrinsics.f(lifecycleCamera3.getLifecycleOwner(), lifecycleOwner)) {
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository3 = this.lifecycleCameraRepository;
                Intrinsics.h(lifecycleCameraRepository3);
                CameraX cameraX3 = this.cameraX;
                Intrinsics.h(cameraX3);
                CameraUseCaseAdapter cameraUseCaseAdapterProvide = cameraX3.getCameraUseCaseAdapterProvider().provide(cameraInternalSelect, cameraInternal, adapterCameraInfo2, adapterCameraInfo, primaryCompositionSettings, secondaryCompositionSettings);
                CameraX cameraX4 = this.cameraX;
                Intrinsics.h(cameraX4);
                lifecycleCamera = lifecycleCameraRepository3.createLifecycleCamera(lifecycleOwner, cameraUseCaseAdapterProvide, cameraX4.getRotationProvider());
            }
            if (sessionConfig.getUseCases().isEmpty()) {
                Intrinsics.h(lifecycleCamera);
            } else {
                LifecycleCameraRepository lifecycleCameraRepository4 = this.lifecycleCameraRepository;
                Intrinsics.h(lifecycleCameraRepository4);
                Intrinsics.h(lifecycleCamera);
                CameraX cameraX5 = this.cameraX;
                Intrinsics.h(cameraX5);
                lifecycleCameraRepository4.bindToLifecycleCamera(lifecycleCamera, sessionConfig, cameraX5.getCameraFactory().getCameraCoordinator());
                this.lifecycleCameraKeys.add(LifecycleCameraRepository.Key.create(lifecycleOwner, cameraIdentifierFromAdapterInfos));
            }
            Trace.endSection();
            return lifecycleCamera;
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }

    public static /* synthetic */ Camera bindToLifecycleInternal$default(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, CameraSelector cameraSelector2, CompositionSettings DEFAULT, CompositionSettings DEFAULT2, SessionConfig sessionConfig, int i, Object obj2) {
        if ((i & 4) != 0) {
            cameraSelector2 = null;
        }
        CameraSelector cameraSelector3 = cameraSelector2;
        if ((i & 8) != 0) {
            DEFAULT = CompositionSettings.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        }
        CompositionSettings compositionSettings = DEFAULT;
        if ((i & 16) != 0) {
            DEFAULT2 = CompositionSettings.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT2, "DEFAULT");
        }
        return lifecycleCameraProviderImpl.bindToLifecycleInternal(lifecycleOwner, cameraSelector, cameraSelector3, compositionSettings, DEFAULT2, sessionConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraConfig getCameraConfig(CameraSelector cameraSelector, CameraInfo cameraInfo) {
        Iterator<CameraFilter> it8 = cameraSelector.getCameraFilterSet().iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        CameraConfig cameraConfig = null;
        while (it8.hasNext()) {
            CameraFilter next = it8.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            CameraFilter cameraFilter = next;
            if (!Intrinsics.f(cameraFilter.getIdentifier(), CameraFilter.DEFAULT_ID)) {
                CameraConfigProvider configProvider = ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter.getIdentifier());
                Context context = this.context;
                Intrinsics.h(context);
                ((a) configProvider).getClass();
                CameraConfig cameraConfigLambda$static$0 = CameraConfigProvider.lambda$static$0(cameraInfo, context);
                if (cameraConfigLambda$static$0 == null) {
                    continue;
                } else {
                    if (cameraConfig != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = cameraConfigLambda$static$0;
                }
            }
        }
        return cameraConfig == null ? CameraConfigs.defaultConfig() : cameraConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCameraOperatingMode() {
        if (!isInitialized()) {
            return 0;
        }
        CameraX cameraX = this.cameraX;
        Intrinsics.h(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<CameraSelector, CameraSelector> getSelectorsWithSessionFilter(SessionConfig sessionConfig, CameraSelector primaryCameraSelector, CameraSelector secondaryCameraSelector) {
        CameraFilter cameraFilter = sessionConfig.getCameraFilter();
        if (cameraFilter == null) {
            return new Pair<>(primaryCameraSelector, secondaryCameraSelector);
        }
        CameraSelector cameraSelectorBuild = CameraSelector.Builder.fromSelector(primaryCameraSelector).addCameraFilter(cameraFilter).build();
        Intrinsics.checkNotNullExpressionValue(cameraSelectorBuild, "build(...)");
        return new Pair<>(cameraSelectorBuild, secondaryCameraSelector != null ? CameraSelector.Builder.fromSelector(secondaryCameraSelector).addCameraFilter(cameraFilter).build() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListenableFuture initAsync$lambda$0$1(CameraX cameraX, Void r110) {
        return cameraX.getInitializeFuture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListenableFuture initAsync$lambda$0$2(Function1 function1, Object obj2) {
        return (ListenableFuture) function1.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void initAsync$lambda$0$3(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, CameraX cameraX, Context context, Void r3) {
        lifecycleCameraProviderImpl.initInternal(cameraX, ContextUtil.getPersistentApplicationContext(context));
        return r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void initAsync$lambda$0$4(Function1 function1, Object obj2) {
        return (Void) function1.invoke(obj2);
    }

    private final void initInternal(CameraX newCameraX, Context newContext) {
        CameraPresenceProvider cameraAvailabilityProvider;
        synchronized (this.lock) {
            this.cameraX = newCameraX;
            this.context = newContext;
            if (newCameraX != null && (cameraAvailabilityProvider = newCameraX.getCameraAvailabilityProvider()) != null) {
                ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceMainThreadExecutor, "mainThreadExecutor(...)");
                cameraAvailabilityProvider.addCameraPresenceListener(this, scheduledExecutorServiceMainThreadExecutor);
                Unit unit = Unit.f186387a;
            }
        }
    }

    private final boolean isInitialized() {
        return this.cameraX != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraOperatingMode(int i) {
        if (isInitialized()) {
            CameraX cameraX = this.cameraX;
            Intrinsics.h(cameraX);
            cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i);
        }
    }

    public static /* synthetic */ ListenableFuture shutdownAsync$camera_lifecycle$default(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = true;
        }
        return lifecycleCameraProviderImpl.shutdownAsync$camera_lifecycle(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdownAsync$lambda$0(LifecycleCameraProviderImpl lifecycleCameraProviderImpl) {
        if (lifecycleCameraProviderImpl.isInitialized()) {
            lifecycleCameraProviderImpl.unbindAll();
            LifecycleCameraRepository lifecycleCameraRepository = lifecycleCameraProviderImpl.lifecycleCameraRepository;
            Intrinsics.h(lifecycleCameraRepository);
            lifecycleCameraRepository.removeLifecycleCameras(lifecycleCameraProviderImpl.lifecycleCameraKeys);
        }
    }

    private final void shutdownInternal() {
        initInternal(null, null);
    }

    @NotNull
    public Camera bindToLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull CameraSelector cameraSelector, @NotNull UseCase... useCases) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection("CX:bindToLifecycle");
        try {
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            setCameraOperatingMode(1);
            Camera cameraBindToLifecycleInternal$default = bindToLifecycleInternal$default(this, lifecycleOwner, cameraSelector, null, null, null, new LegacySessionConfig(d.L(useCases), null, null, 6, null), 28, null);
            Trace.endSection();
            return cameraBindToLifecycleInternal$default;
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }

    public final void configure$camera_lifecycle(@NotNull final CameraXConfig cameraXConfig) {
        Intrinsics.checkNotNullParameter(cameraXConfig, "cameraXConfig");
        Trace.beginSection("CX:configureInstanceInternal");
        try {
            synchronized (this.lock) {
                Preconditions.checkNotNull(cameraXConfig);
                Preconditions.checkState(getCameraXConfigProvider() == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                setCameraXConfigProvider$camera_lifecycle(new CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$configure$1$1$1
                    @Override // androidx.camera.core.CameraXConfig.Provider
                    public final CameraXConfig getCameraXConfig() {
                        return cameraXConfig;
                    }
                });
                Unit unit = Unit.f186387a;
            }
        } finally {
            Trace.endSection();
        }
    }

    @NotNull
    public List<CameraInfo> getAvailableCameraInfos() {
        Trace.beginSection("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            CameraX cameraX = this.cameraX;
            Intrinsics.h(cameraX);
            LinkedHashSet<CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
            Intrinsics.checkNotNullExpressionValue(cameras, "getCameras(...)");
            Iterator<CameraInternal> it8 = cameras.iterator();
            while (it8.hasNext()) {
                CameraInfo cameraInfo = it8.next().getCameraInfo();
                Intrinsics.checkNotNullExpressionValue(cameraInfo, "getCameraInfo(...)");
                arrayList.add(cameraInfo);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @NotNull
    public CameraInfo getCameraInfo(@NotNull CameraSelector cameraSelector) {
        Object adapterCameraInfo;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:getCameraInfo");
        try {
            CameraX cameraX = this.cameraX;
            Intrinsics.h(cameraX);
            CameraInfoInternal cameraInfoInternal = cameraSelector.select(cameraX.getCameraRepository().getCameras()).getCameraInfo();
            Intrinsics.checkNotNullExpressionValue(cameraInfoInternal, "getCameraInfoInternal(...)");
            CameraConfig cameraConfig = getCameraConfig(cameraSelector, cameraInfoInternal);
            String cameraId = cameraInfoInternal.getCameraId();
            Intrinsics.checkNotNullExpressionValue(cameraId, "getCameraId(...)");
            CameraIdentifier cameraIdentifierCreate = CameraIdentifier.Factory.create(cameraId, null, cameraConfig.getCompatibilityId());
            synchronized (this.lock) {
                try {
                    adapterCameraInfo = this.cameraInfoMap.get(cameraIdentifierCreate);
                    if (adapterCameraInfo == null) {
                        adapterCameraInfo = new AdapterCameraInfo(cameraInfoInternal, cameraConfig);
                        this.cameraInfoMap.put(cameraIdentifierCreate, adapterCameraInfo);
                    }
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return (AdapterCameraInfo) adapterCameraInfo;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: getCameraXConfigProvider$camera_lifecycle, reason: from getter */
    public final CameraXConfig.Provider getCameraXConfigProvider() {
        return this.cameraXConfigProvider;
    }

    public boolean hasCamera(@NotNull CameraSelector cameraSelector) throws CameraInfoUnavailableException {
        boolean z;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:hasCamera");
        try {
            CameraX cameraX = this.cameraX;
            Intrinsics.h(cameraX);
            cameraSelector.select(cameraX.getCameraRepository().getCameras());
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
        Trace.endSection();
        return z;
    }

    @NotNull
    public final ListenableFuture<Void> initAsync$camera_lifecycle(@NotNull Context context, CameraXConfig cameraXConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this.lock) {
            try {
                this.lifecycleCameraRepository = LifecycleCameraRepositories.getInstance$camera_lifecycle(ContextUtil.getDeviceId(context));
                ListenableFuture<Void> listenableFuture = this.cameraXInitializeFuture;
                if (listenableFuture != null) {
                    return listenableFuture;
                }
                if (cameraXConfig != null) {
                    configure$camera_lifecycle(cameraXConfig);
                }
                CameraX cameraX = new CameraX(context, this.cameraXConfigProvider);
                FutureChain futureChainTransform = FutureChain.from(this.cameraXShutdownFuture).transformAsync(new b(new l(cameraX, 29), 2), CameraXExecutors.directExecutor()).transform(new pz4.a(20, new pza.d(this, 1, cameraX, context)), CameraXExecutors.directExecutor());
                Intrinsics.checkNotNullExpressionValue(futureChainTransform, "transform(...)");
                this.cameraXInitializeFuture = futureChainTransform;
                Futures.addCallback(futureChainTransform, new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$initAsync$1$2
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable t2) {
                        Intrinsics.checkNotNullParameter(t2, "t");
                        this.this$0.shutdownAsync$camera_lifecycle(false);
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(Void r110) {
                    }
                }, CameraXExecutors.directExecutor());
                ListenableFuture<Void> listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(futureChainTransform);
                Intrinsics.checkNotNullExpressionValue(listenableFutureNonCancellationPropagating, "nonCancellationPropagating(...)");
                return listenableFutureNonCancellationPropagating;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public boolean isBound(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
        Intrinsics.h(lifecycleCameraRepository);
        for (LifecycleCamera lifecycleCamera : lifecycleCameraRepository.getLifecycleCameras()) {
            Intrinsics.checkNotNullExpressionValue(lifecycleCamera, "next(...)");
            if (lifecycleCamera.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraPresenceListener
    public void onCamerasAdded(@NotNull Set<CameraIdentifier> addedCameraIds) {
        Intrinsics.checkNotNullParameter(addedCameraIds, "addedCameraIds");
    }

    @Override // androidx.camera.core.CameraPresenceListener
    public void onCamerasRemoved(@NotNull Set<CameraIdentifier> removedCameraIds) {
        Intrinsics.checkNotNullParameter(removedCameraIds, "removedCameraIds");
        Threads.checkMainThread();
        synchronized (this.lock) {
            try {
                for (CameraIdentifier cameraIdentifier : removedCameraIds) {
                    Set<CameraIdentifier> setKeySet = this.cameraInfoMap.keySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : setKeySet) {
                        if (Intrinsics.f(((CameraIdentifier) obj2).getCameraIds(), cameraIdentifier.getCameraIds())) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        this.cameraInfoMap.remove((CameraIdentifier) it8.next());
                    }
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void setCameraXConfigProvider$camera_lifecycle(CameraXConfig.Provider provider) {
        this.cameraXConfigProvider = provider;
    }

    @NotNull
    public final ListenableFuture<Void> shutdownAsync$camera_lifecycle(boolean clearConfigProvider) {
        ListenableFuture<Void> listenableFutureImmediateFuture;
        Threads.runOnMainSync(new o6.a(this, 10));
        if (isInitialized()) {
            CameraX cameraX = this.cameraX;
            Intrinsics.h(cameraX);
            cameraX.getCameraAvailabilityProvider().removeCameraPresenceListener(this);
            CameraX cameraX2 = this.cameraX;
            Intrinsics.h(cameraX2);
            listenableFutureImmediateFuture = cameraX2.shutdown();
        } else {
            listenableFutureImmediateFuture = Futures.immediateFuture(null);
        }
        Intrinsics.h(listenableFutureImmediateFuture);
        synchronized (this.lock) {
            if (clearConfigProvider) {
                try {
                    this.cameraXConfigProvider = null;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            this.cameraXInitializeFuture = null;
            this.cameraXShutdownFuture = listenableFutureImmediateFuture;
            this.cameraInfoMap.clear();
            this.lifecycleCameraKeys.clear();
            Unit unit = Unit.f186387a;
        }
        shutdownInternal();
        return listenableFutureImmediateFuture;
    }

    public void unbind(@NotNull UseCase... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection("CX:unbind");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
            Intrinsics.h(lifecycleCameraRepository);
            lifecycleCameraRepository.unbind(new LegacySessionConfig(d.L(useCases), null, null, 6, null), this.lifecycleCameraKeys);
            Unit unit = Unit.f186387a;
            Trace.endSection();
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }

    public void unbindAll() {
        Trace.beginSection("CX:unbindAll");
        try {
            Threads.checkMainThread();
            setCameraOperatingMode(0);
            LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
            Intrinsics.h(lifecycleCameraRepository);
            lifecycleCameraRepository.unbindAll(this.lifecycleCameraKeys);
            Unit unit = Unit.f186387a;
        } finally {
            Trace.endSection();
        }
    }

    @NotNull
    public Camera bindToLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull CameraSelector cameraSelector, @NotNull UseCaseGroup useCaseGroup) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                Camera cameraBindToLifecycleInternal$default = bindToLifecycleInternal$default(this, lifecycleOwner, cameraSelector, null, null, null, new LegacySessionConfig(useCaseGroup), 28, null);
                Trace.endSection();
                return cameraBindToLifecycleInternal$default;
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }

    public void unbind(@NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        Trace.beginSection("CX:unbind-sessionConfig");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() != 2) {
                LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
                Intrinsics.h(lifecycleCameraRepository);
                lifecycleCameraRepository.unbind(sessionConfig, this.lifecycleCameraKeys);
                Unit unit = Unit.f186387a;
                return;
            }
            throw new UnsupportedOperationException("Unbind SessionConfig is not supported in concurrent camera mode call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }

    @NotNull
    public Camera bindToLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull CameraSelector cameraSelector, @NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        Trace.beginSection("CX:bindToLifecycle-SessionConfig");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                Camera cameraBindToLifecycleInternal$default = bindToLifecycleInternal$default(this, lifecycleOwner, cameraSelector, null, null, null, sessionConfig, 28, null);
                Trace.endSection();
                return cameraBindToLifecycleInternal$default;
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }
}
