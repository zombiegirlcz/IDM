package androidx.camera.camera2.pipe.compat;

import a0.d;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Permissions;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.core.Timestamps;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import zhm.a1;
import zhm.d0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010)\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b.\u0010/J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u0016012\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020&0:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020-0:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010=R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u001c0:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010=¨\u0006@"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2MetadataCache;", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "Landroid/content/Context;", "cameraPipeContext", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/core/Permissions;", "permissions", "Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "cameraMetadataConfig", "Landroidx/camera/camera2/pipe/core/TimeSource;", "timeSource", "<init>", "(Landroid/content/Context;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/core/Permissions;Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;Landroidx/camera/camera2/pipe/core/TimeSource;)V", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "", "redacted", "Landroidx/camera/camera2/pipe/compat/Camera2CameraMetadata;", "createCameraMetadata-0r8Bogc", "(Ljava/lang/String;Z)Landroidx/camera/camera2/pipe/compat/Camera2CameraMetadata;", "createCameraMetadata", "", "extension", "Landroidx/camera/camera2/pipe/compat/Camera2CameraExtensionMetadata;", "createCameraExtensionMetadata-RzXb1QE", "(Ljava/lang/String;ZI)Landroidx/camera/camera2/pipe/compat/Camera2CameraExtensionMetadata;", "createCameraExtensionMetadata", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "getCameraExtensionCharacteristics-EfqyGwQ", "(Ljava/lang/String;)Landroid/hardware/camera2/CameraExtensionCharacteristics;", "getCameraExtensionCharacteristics", "isMetadataRedacted", "()Z", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "shouldBlockSensorOrientationCache", "(Landroid/hardware/camera2/CameraCharacteristics;)Z", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getCameraMetadata-0r8Bogc", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCameraMetadata", "awaitCameraMetadata-EfqyGwQ", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraMetadata;", "awaitCameraMetadata", "Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "awaitCameraExtensionMetadata-0r8Bogc", "(Ljava/lang/String;I)Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "awaitCameraExtensionMetadata", "", "getSupportedCameraExtensions-EfqyGwQ", "(Ljava/lang/String;)Ljava/util/Set;", "getSupportedCameraExtensions", "Landroid/content/Context;", "Landroidx/camera/camera2/pipe/core/Threads;", "Landroidx/camera/camera2/pipe/core/Permissions;", "Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "Landroidx/camera/camera2/pipe/core/TimeSource;", "Landroid/util/ArrayMap;", "", "cache", "Landroid/util/ArrayMap;", "extensionCache", "extensionCharacteristicsCache", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2MetadataCache implements Camera2MetadataProvider {

    @NotNull
    private final ArrayMap<String, CameraMetadata> cache;

    @NotNull
    private final CameraPipe.CameraMetadataConfig cameraMetadataConfig;

    @NotNull
    private final Context cameraPipeContext;

    @NotNull
    private final ArrayMap<String, CameraExtensionMetadata> extensionCache;

    @NotNull
    private final ArrayMap<String, CameraExtensionCharacteristics> extensionCharacteristicsCache;

    @NotNull
    private final Permissions permissions;

    @NotNull
    private final Threads threads;

    @NotNull
    private final TimeSource timeSource;

    public Camera2MetadataCache(@NotNull Context cameraPipeContext, @NotNull Threads threads, @NotNull Permissions permissions, @NotNull CameraPipe.CameraMetadataConfig cameraMetadataConfig, @NotNull TimeSource timeSource) {
        Intrinsics.checkNotNullParameter(cameraPipeContext, "cameraPipeContext");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(cameraMetadataConfig, "cameraMetadataConfig");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.cameraPipeContext = cameraPipeContext;
        this.threads = threads;
        this.permissions = permissions;
        this.cameraMetadataConfig = cameraMetadataConfig;
        this.timeSource = timeSource;
        this.cache = new ArrayMap<>();
        this.extensionCache = new ArrayMap<>();
        this.extensionCharacteristicsCache = new ArrayMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createCameraExtensionMetadata-RzXb1QE, reason: not valid java name */
    public final Camera2CameraExtensionMetadata m401createCameraExtensionMetadataRzXb1QE(String cameraId, boolean redacted, int extension) {
        String str;
        Timestamps timestamps = Timestamps.INSTANCE;
        long jMo441nowvQl9yQU = this.timeSource.mo441nowvQl9yQU();
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection(((Object) CameraId.m186toStringimpl(cameraId)) + "#readCameraExtensionMetadata");
            try {
                Log log2 = Log.INSTANCE;
                if (log2.getDEBUG_LOGGABLE()) {
                    String str2 = "Loading extension metadata for " + ((Object) CameraId.m186toStringimpl(cameraId));
                }
                Camera2CameraExtensionMetadata camera2CameraExtensionMetadata = new Camera2CameraExtensionMetadata(cameraId, redacted, extension, m403getCameraExtensionCharacteristicsEfqyGwQ(cameraId), r0.g(), null);
                if (log2.getINFO_LOGGABLE()) {
                    long jM436constructorimpl = DurationNs.m436constructorimpl(this.timeSource.mo441nowvQl9yQU() - jMo441nowvQl9yQU);
                    if (!redacted) {
                        str = "";
                    } else {
                        if (!redacted) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = " (redacted)";
                    }
                    StringBuilder sb6 = new StringBuilder("Loaded extension metadata for ");
                    sb6.append((Object) CameraId.m186toStringimpl(cameraId));
                    sb6.append(" in ");
                    String str3 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jM436constructorimpl / 1000000.0d)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    sb6.append(str3);
                    sb6.append(str);
                    sb6.toString();
                }
                return camera2CameraExtensionMetadata;
            } catch (Throwable th10) {
                throw new IllegalStateException("Failed to load extension metadata for " + ((Object) CameraId.m186toStringimpl(cameraId)) + '!', th10);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createCameraMetadata-0r8Bogc, reason: not valid java name */
    public final Camera2CameraMetadata m402createCameraMetadata0r8Bogc(String cameraId, boolean redacted) {
        Set<CameraCharacteristics.Key<?>> setM;
        String str;
        Timestamps timestamps = Timestamps.INSTANCE;
        long jMo441nowvQl9yQU = this.timeSource.mo441nowvQl9yQU();
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection(((Object) CameraId.m186toStringimpl(cameraId)) + "#readCameraMetadata");
            try {
                Log log2 = Log.INSTANCE;
                if (log2.getDEBUG_LOGGABLE()) {
                    String str2 = "Loading metadata for " + ((Object) CameraId.m186toStringimpl(cameraId));
                }
                Object systemService = this.cameraPipeContext.getSystemService("camera");
                Intrinsics.i(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                CameraCharacteristics cameraCharacteristics = ((CameraManager) systemService).getCameraCharacteristics(cameraId);
                Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
                if (cameraCharacteristics == null) {
                    throw new IllegalStateException(("Failed to get CameraCharacteristics for " + ((Object) CameraId.m186toStringimpl(cameraId)) + '!').toString());
                }
                if (shouldBlockSensorOrientationCache(cameraCharacteristics)) {
                    Set<CameraCharacteristics.Key<?>> set = this.cameraMetadataConfig.getCameraCacheBlocklist().get(CameraId.m181boximpl(cameraId));
                    if (set == null) {
                        set = h0.f322473a;
                    }
                    setM = a1.m(set, CameraCharacteristics.SENSOR_ORIENTATION);
                } else {
                    setM = this.cameraMetadataConfig.getCameraCacheBlocklist().get(CameraId.m181boximpl(cameraId));
                }
                Camera2CameraMetadata camera2CameraMetadata = new Camera2CameraMetadata(cameraId, redacted, cameraCharacteristics, this, r0.g(), setM == null ? this.cameraMetadataConfig.getCacheBlocklist() : a1.l(this.cameraMetadataConfig.getCacheBlocklist(), setM), null);
                if (log2.getINFO_LOGGABLE()) {
                    long jM436constructorimpl = DurationNs.m436constructorimpl(this.timeSource.mo441nowvQl9yQU() - jMo441nowvQl9yQU);
                    if (!redacted) {
                        str = "";
                    } else {
                        if (!redacted) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = " (redacted)";
                    }
                    StringBuilder sb6 = new StringBuilder("Loaded metadata for ");
                    sb6.append((Object) CameraId.m186toStringimpl(cameraId));
                    sb6.append(" in ");
                    String str3 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jM436constructorimpl / 1000000.0d)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    sb6.append(str3);
                    sb6.append(str);
                    sb6.toString();
                }
                Trace.endSection();
                return camera2CameraMetadata;
            } catch (Throwable th10) {
                if (CameraError.INSTANCE.shouldHandleDoNotDisturbException$camera_camera2_pipe(th10)) {
                    throw new DoNotDisturbException("Failed to load metadata: Do Not Disturb mode is on!");
                }
                throw new IllegalStateException("Failed to load metadata for " + ((Object) CameraId.m186toStringimpl(cameraId)) + '!', th10);
            }
        } catch (Throwable th11) {
            Trace.endSection();
            throw th11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCameraExtensionCharacteristics-EfqyGwQ, reason: not valid java name */
    public final CameraExtensionCharacteristics m403getCameraExtensionCharacteristicsEfqyGwQ(String cameraId) throws CameraAccessException {
        synchronized (this.extensionCharacteristicsCache) {
            CameraExtensionCharacteristics cameraExtensionCharacteristicsD = u3.a.d(this.extensionCharacteristicsCache.get(cameraId));
            if (cameraExtensionCharacteristicsD != null) {
                return cameraExtensionCharacteristicsD;
            }
            Unit unit = Unit.f186387a;
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                String str = "Retrieving CameraExtensionCharacteristics for " + ((Object) CameraId.m186toStringimpl(cameraId));
            }
            Object systemService = this.cameraPipeContext.getSystemService("camera");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraExtensionCharacteristics cameraExtensionCharacteristics = Api31Compat.getCameraExtensionCharacteristics((CameraManager) systemService, cameraId);
            if (cameraExtensionCharacteristics != null) {
                return cameraExtensionCharacteristics;
            }
            throw new IllegalStateException(("Failed to get CameraExtensionCharacteristics for " + ((Object) CameraId.m186toStringimpl(cameraId)) + '!').toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMetadataRedacted() {
        return !this.permissions.getHasCameraPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldBlockSensorOrientationCache(CameraCharacteristics characteristics) {
        return Build.VERSION.SDK_INT >= 32 && characteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) != null;
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2MetadataProvider
    @NotNull
    /* JADX INFO: renamed from: awaitCameraExtensionMetadata-0r8Bogc, reason: not valid java name */
    public CameraExtensionMetadata mo404awaitCameraExtensionMetadata0r8Bogc(@NotNull String cameraId, int extension) throws Exception {
        CameraExtensionMetadata cameraExtensionMetadataM401createCameraExtensionMetadataRzXb1QE;
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            throw new Exception(d.n("Extension sessions are only supported on Android S or higher. Device SDK is ", i));
        }
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection(((Object) CameraId.m186toStringimpl(cameraId)) + "#awaitExtensionMetadata");
            synchronized (this.extensionCache) {
                try {
                    cameraExtensionMetadataM401createCameraExtensionMetadataRzXb1QE = (CameraExtensionMetadata) this.extensionCache.get(cameraId);
                    if (cameraExtensionMetadataM401createCameraExtensionMetadataRzXb1QE == null) {
                        if (isMetadataRedacted()) {
                            Unit unit = Unit.f186387a;
                            cameraExtensionMetadataM401createCameraExtensionMetadataRzXb1QE = m401createCameraExtensionMetadataRzXb1QE(cameraId, true, extension);
                        } else {
                            cameraExtensionMetadataM401createCameraExtensionMetadataRzXb1QE = m401createCameraExtensionMetadataRzXb1QE(cameraId, false, extension);
                            this.extensionCache.put(cameraId, cameraExtensionMetadataM401createCameraExtensionMetadataRzXb1QE);
                        }
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return cameraExtensionMetadataM401createCameraExtensionMetadataRzXb1QE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2MetadataProvider
    @NotNull
    /* JADX INFO: renamed from: awaitCameraMetadata-EfqyGwQ, reason: not valid java name */
    public CameraMetadata mo405awaitCameraMetadataEfqyGwQ(@NotNull String cameraId) {
        CameraMetadata cameraMetadataM402createCameraMetadata0r8Bogc;
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection(((Object) CameraId.m186toStringimpl(cameraId)) + "#awaitMetadata");
            synchronized (this.cache) {
                try {
                    cameraMetadataM402createCameraMetadata0r8Bogc = (CameraMetadata) this.cache.get(cameraId);
                    if (cameraMetadataM402createCameraMetadata0r8Bogc == null) {
                        if (isMetadataRedacted()) {
                            Unit unit = Unit.f186387a;
                            cameraMetadataM402createCameraMetadata0r8Bogc = m402createCameraMetadata0r8Bogc(cameraId, true);
                        } else {
                            cameraMetadataM402createCameraMetadata0r8Bogc = m402createCameraMetadata0r8Bogc(cameraId, false);
                            this.cache.put(cameraId, cameraMetadataM402createCameraMetadata0r8Bogc);
                        }
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return cameraMetadataM402createCameraMetadata0r8Bogc;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2MetadataProvider
    /* JADX INFO: renamed from: getCameraMetadata-0r8Bogc, reason: not valid java name */
    public Object mo406getCameraMetadata0r8Bogc(@NotNull String str, @NotNull Continuation<? super CameraMetadata> continuation) {
        synchronized (this.cache) {
            CameraMetadata cameraMetadata = this.cache.get(str);
            if (cameraMetadata != null) {
                return cameraMetadata;
            }
            Unit unit = Unit.f186387a;
            return e0.J(this.threads.getBackgroundDispatcher(), new Camera2MetadataCache$getCameraMetadata$3(this, str, null), continuation);
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2MetadataProvider
    @NotNull
    /* JADX INFO: renamed from: getSupportedCameraExtensions-EfqyGwQ, reason: not valid java name */
    public Set<Integer> mo407getSupportedCameraExtensionsEfqyGwQ(@NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        return Build.VERSION.SDK_INT >= 31 ? d0.i1(Api31Compat.getSupportedExtensions(m403getCameraExtensionCharacteristicsEfqyGwQ(cameraId))) : h0.f322473a;
    }
}
