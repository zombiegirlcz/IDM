package androidx.camera.camera2.pipe;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.config.CameraPipeComponent;
import androidx.camera.camera2.pipe.config.CameraPipeConfigModule;
import androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent;
import androidx.camera.camera2.pipe.config.ThreadConfigModule;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.media.ImageSources;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\bg\u0018\u0000 \u00192\u00020\u0001:\u0007\u001a\u001b\u001c\u001d\u001e\u001f\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe;", "", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "config", "Landroidx/camera/camera2/pipe/CameraGraph;", "createCameraGraph", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)Landroidx/camera/camera2/pipe/CameraGraph;", "Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;", "", "createCameraGraphs", "(Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;)Ljava/util/List;", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameras", "()Landroidx/camera/camera2/pipe/CameraDevices;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "cameraSurfaceManager", "()Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "graphConfig", "Landroidx/camera/camera2/pipe/ConfigQueryResult;", "isConfigSupported-NpXggIU", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConfigSupported", "", "shutdown", "()V", "Companion", "Config", "Flags", "CameraInteropConfig", "ThreadConfig", "CameraMetadataConfig", "CameraBackendConfig", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CameraPipe {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;", "", "internalBackend", "Landroidx/camera/camera2/pipe/CameraBackend;", "defaultBackend", "Landroidx/camera/camera2/pipe/CameraBackendId;", "cameraBackends", "", "Landroidx/camera/camera2/pipe/CameraBackendFactory;", "<init>", "(Landroidx/camera/camera2/pipe/CameraBackend;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getInternalBackend", "()Landroidx/camera/camera2/pipe/CameraBackend;", "getDefaultBackend-AKmI2lo", "()Ljava/lang/String;", "Ljava/lang/String;", "getCameraBackends", "()Ljava/util/Map;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CameraBackendConfig {

        @NotNull
        private final Map<CameraBackendId, CameraBackendFactory> cameraBackends;
        private final String defaultBackend;
        private final CameraBackend internalBackend;

        public /* synthetic */ CameraBackendConfig(CameraBackend cameraBackend, String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(cameraBackend, str, map);
        }

        @NotNull
        public final Map<CameraBackendId, CameraBackendFactory> getCameraBackends() {
            return this.cameraBackends;
        }

        /* JADX INFO: renamed from: getDefaultBackend-AKmI2lo, reason: not valid java name and from getter */
        public final String getDefaultBackend() {
            return this.defaultBackend;
        }

        public final CameraBackend getInternalBackend() {
            return this.internalBackend;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private CameraBackendConfig(CameraBackend cameraBackend, String str, Map<CameraBackendId, ? extends CameraBackendFactory> cameraBackends) {
            Intrinsics.checkNotNullParameter(cameraBackends, "cameraBackends");
            this.internalBackend = cameraBackend;
            this.defaultBackend = str;
            this.cameraBackends = cameraBackends;
            if (str != null) {
                if (cameraBackends.containsKey(str != null ? CameraBackendId.m105boximpl(str) : null)) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append((Object) (str == null ? "null" : CameraBackendId.m110toStringimpl(str)));
                sb6.append(" does not exist in cameraBackends! Available backends are: ");
                sb6.append(cameraBackends.keySet());
                throw new IllegalStateException(sb6.toString().toString());
            }
        }

        public /* synthetic */ CameraBackendConfig(CameraBackend cameraBackend, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cameraBackend, (i & 2) != 0 ? null : str, (i & 4) != 0 ? r0.g() : map, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "cameraDeviceStateCallback", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "cameraCaptureSessionListener", "Landroidx/camera/camera2/pipe/core/DurationNs;", "cameraOpenRetryMaxTimeoutNs", "<init>", "(Landroid/hardware/camera2/CameraDevice$StateCallback;Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;Landroidx/camera/camera2/pipe/core/DurationNs;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "getCameraDeviceStateCallback", "()Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "getCameraCaptureSessionListener", "()Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "Landroidx/camera/camera2/pipe/core/DurationNs;", "getCameraOpenRetryMaxTimeoutNs-QWez1Bs", "()Landroidx/camera/camera2/pipe/core/DurationNs;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CameraInteropConfig {
        private final CameraInterop.CaptureSessionListener cameraCaptureSessionListener;
        private final CameraDevice.StateCallback cameraDeviceStateCallback;
        private final DurationNs cameraOpenRetryMaxTimeoutNs;

        public /* synthetic */ CameraInteropConfig(CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, DurationNs durationNs, DefaultConstructorMarker defaultConstructorMarker) {
            this(stateCallback, captureSessionListener, durationNs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraInteropConfig)) {
                return false;
            }
            CameraInteropConfig cameraInteropConfig = (CameraInteropConfig) other;
            return Intrinsics.f(this.cameraDeviceStateCallback, cameraInteropConfig.cameraDeviceStateCallback) && Intrinsics.f(this.cameraCaptureSessionListener, cameraInteropConfig.cameraCaptureSessionListener) && Intrinsics.f(this.cameraOpenRetryMaxTimeoutNs, cameraInteropConfig.cameraOpenRetryMaxTimeoutNs);
        }

        public final CameraInterop.CaptureSessionListener getCameraCaptureSessionListener() {
            return this.cameraCaptureSessionListener;
        }

        public final CameraDevice.StateCallback getCameraDeviceStateCallback() {
            return this.cameraDeviceStateCallback;
        }

        /* JADX INFO: renamed from: getCameraOpenRetryMaxTimeoutNs-QWez1Bs, reason: not valid java name and from getter */
        public final DurationNs getCameraOpenRetryMaxTimeoutNs() {
            return this.cameraOpenRetryMaxTimeoutNs;
        }

        public int hashCode() {
            CameraDevice.StateCallback stateCallback = this.cameraDeviceStateCallback;
            int iHashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
            CameraInterop.CaptureSessionListener captureSessionListener = this.cameraCaptureSessionListener;
            int iHashCode2 = (iHashCode + (captureSessionListener == null ? 0 : captureSessionListener.hashCode())) * 31;
            DurationNs durationNs = this.cameraOpenRetryMaxTimeoutNs;
            return iHashCode2 + (durationNs != null ? DurationNs.m438hashCodeimpl(durationNs.getValue()) : 0);
        }

        @NotNull
        public String toString() {
            return "CameraInteropConfig(cameraDeviceStateCallback=" + this.cameraDeviceStateCallback + ", cameraCaptureSessionListener=" + this.cameraCaptureSessionListener + ", cameraOpenRetryMaxTimeoutNs=" + this.cameraOpenRetryMaxTimeoutNs + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        private CameraInteropConfig(CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, DurationNs durationNs) {
            this.cameraDeviceStateCallback = stateCallback;
            this.cameraCaptureSessionListener = captureSessionListener;
            this.cameraOpenRetryMaxTimeoutNs = durationNs;
        }

        public /* synthetic */ CameraInteropConfig(CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, DurationNs durationNs, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stateCallback, (i & 2) != 0 ? null : captureSessionListener, (i & 4) != 0 ? null : durationNs, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$Companion;", "", "<init>", "()V", "create", "Landroidx/camera/camera2/pipe/CameraPipe;", "config", "Landroidx/camera/camera2/pipe/CameraPipe$Config;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final CameraPipe create(@NotNull Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection("CameraPipe");
                CameraPipeComponent cameraPipeComponentBuild = DaggerCameraPipeComponent.builder().cameraPipeConfigModule(new CameraPipeConfigModule(config)).threadConfigModule(new ThreadConfigModule(config.getThreadConfig())).build();
                Trace.endSection();
                Intrinsics.h(cameraPipeComponentBuild);
                return new CameraPipeImpl(cameraPipeComponentBuild);
            } catch (Throwable th10) {
                Trace.endSection();
                throw th10;
            }
        }
    }

    @NotNull
    CameraSurfaceManager cameraSurfaceManager();

    @NotNull
    CameraDevices cameras();

    @NotNull
    CameraGraph createCameraGraph(@NotNull CameraGraph.Config config);

    @NotNull
    List<CameraGraph> createCameraGraphs(@NotNull CameraGraph.ConcurrentConfig config);

    /* JADX INFO: renamed from: isConfigSupported-NpXggIU, reason: not valid java name */
    Object mo192isConfigSupportedNpXggIU(@NotNull CameraGraph.Config config, @NotNull Continuation<? super ConfigQueryResult> continuation);

    void shutdown();

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "", "", "strictModeEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getStrictModeEnabled", "()Z", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Flags {
        private final boolean strictModeEnabled;

        public Flags(boolean z) {
            this.strictModeEnabled = z;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Flags) && this.strictModeEnabled == ((Flags) other).strictModeEnabled;
        }

        public final boolean getStrictModeEnabled() {
            return this.strictModeEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.strictModeEnabled);
        }

        @NotNull
        public String toString() {
            return a.x(new StringBuilder("Flags(strictModeEnabled="), this.strictModeEnabled, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public /* synthetic */ Flags(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "", "cacheBlocklist", "", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "cameraCacheBlocklist", "", "Landroidx/camera/camera2/pipe/CameraId;", "<init>", "(Ljava/util/Set;Ljava/util/Map;)V", "getCacheBlocklist", "()Ljava/util/Set;", "getCameraCacheBlocklist", "()Ljava/util/Map;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CameraMetadataConfig {

        @NotNull
        private final Set<CameraCharacteristics.Key<?>> cacheBlocklist;

        @NotNull
        private final Map<CameraId, Set<CameraCharacteristics.Key<?>>> cameraCacheBlocklist;

        public CameraMetadataConfig(Set set, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? h0.f322473a : set, (i & 2) != 0 ? r0.g() : map);
        }

        @NotNull
        public final Set<CameraCharacteristics.Key<?>> getCacheBlocklist() {
            return this.cacheBlocklist;
        }

        @NotNull
        public final Map<CameraId, Set<CameraCharacteristics.Key<?>>> getCameraCacheBlocklist() {
            return this.cameraCacheBlocklist;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CameraMetadataConfig(@NotNull Set<? extends CameraCharacteristics.Key<?>> cacheBlocklist, @NotNull Map<CameraId, ? extends Set<? extends CameraCharacteristics.Key<?>>> cameraCacheBlocklist) {
            Intrinsics.checkNotNullParameter(cacheBlocklist, "cacheBlocklist");
            Intrinsics.checkNotNullParameter(cameraCacheBlocklist, "cameraCacheBlocklist");
            this.cacheBlocklist = cacheBlocklist;
            this.cameraCacheBlocklist = cameraCacheBlocklist;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$Config;", "", "Landroid/content/Context;", "appContext", "Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "threadConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "cameraMetadataConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;", "cameraBackendConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "cameraInteropConfig", "Landroidx/camera/camera2/pipe/media/ImageSources;", "imageSources", "Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "flags", "Landroidx/camera/camera2/pipe/PlatformApiCompat;", "platformApiCompat", "<init>", "(Landroid/content/Context;Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;Landroidx/camera/camera2/pipe/media/ImageSources;Landroidx/camera/camera2/pipe/CameraPipe$Flags;Landroidx/camera/camera2/pipe/PlatformApiCompat;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "getThreadConfig", "()Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "getCameraMetadataConfig", "()Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;", "getCameraBackendConfig", "()Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;", "Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "getCameraInteropConfig", "()Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "Landroidx/camera/camera2/pipe/media/ImageSources;", "getImageSources", "()Landroidx/camera/camera2/pipe/media/ImageSources;", "Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "getFlags", "()Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "Landroidx/camera/camera2/pipe/PlatformApiCompat;", "getPlatformApiCompat", "()Landroidx/camera/camera2/pipe/PlatformApiCompat;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config {

        @NotNull
        private final Context appContext;

        @NotNull
        private final CameraBackendConfig cameraBackendConfig;

        @NotNull
        private final CameraInteropConfig cameraInteropConfig;

        @NotNull
        private final CameraMetadataConfig cameraMetadataConfig;

        @NotNull
        private final Flags flags;
        private final ImageSources imageSources;

        @NotNull
        private final ThreadConfig threadConfig;

        public Config(@NotNull Context appContext, @NotNull ThreadConfig threadConfig, @NotNull CameraMetadataConfig cameraMetadataConfig, @NotNull CameraBackendConfig cameraBackendConfig, @NotNull CameraInteropConfig cameraInteropConfig, ImageSources imageSources, @NotNull Flags flags, PlatformApiCompat platformApiCompat) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(threadConfig, "threadConfig");
            Intrinsics.checkNotNullParameter(cameraMetadataConfig, "cameraMetadataConfig");
            Intrinsics.checkNotNullParameter(cameraBackendConfig, "cameraBackendConfig");
            Intrinsics.checkNotNullParameter(cameraInteropConfig, "cameraInteropConfig");
            Intrinsics.checkNotNullParameter(flags, "flags");
            this.appContext = appContext;
            this.threadConfig = threadConfig;
            this.cameraMetadataConfig = cameraMetadataConfig;
            this.cameraBackendConfig = cameraBackendConfig;
            this.cameraInteropConfig = cameraInteropConfig;
            this.imageSources = imageSources;
            this.flags = flags;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.f(this.appContext, config.appContext) && Intrinsics.f(this.threadConfig, config.threadConfig) && Intrinsics.f(this.cameraMetadataConfig, config.cameraMetadataConfig) && Intrinsics.f(this.cameraBackendConfig, config.cameraBackendConfig) && Intrinsics.f(this.cameraInteropConfig, config.cameraInteropConfig) && Intrinsics.f(this.imageSources, config.imageSources) && Intrinsics.f(this.flags, config.flags);
        }

        @NotNull
        public final Context getAppContext() {
            return this.appContext;
        }

        @NotNull
        public final CameraBackendConfig getCameraBackendConfig() {
            return this.cameraBackendConfig;
        }

        @NotNull
        public final CameraInteropConfig getCameraInteropConfig() {
            return this.cameraInteropConfig;
        }

        @NotNull
        public final CameraMetadataConfig getCameraMetadataConfig() {
            return this.cameraMetadataConfig;
        }

        @NotNull
        public final Flags getFlags() {
            return this.flags;
        }

        public final ImageSources getImageSources() {
            return this.imageSources;
        }

        public final PlatformApiCompat getPlatformApiCompat() {
            return null;
        }

        @NotNull
        public final ThreadConfig getThreadConfig() {
            return this.threadConfig;
        }

        public int hashCode() {
            int iHashCode = (this.cameraInteropConfig.hashCode() + ((this.cameraBackendConfig.hashCode() + ((this.cameraMetadataConfig.hashCode() + ((this.threadConfig.hashCode() + (this.appContext.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
            ImageSources imageSources = this.imageSources;
            return (this.flags.hashCode() + ((iHashCode + (imageSources == null ? 0 : imageSources.hashCode())) * 31)) * 31;
        }

        @NotNull
        public String toString() {
            return "Config(appContext=" + this.appContext + ", threadConfig=" + this.threadConfig + ", cameraMetadataConfig=" + this.cameraMetadataConfig + ", cameraBackendConfig=" + this.cameraBackendConfig + ", cameraInteropConfig=" + this.cameraInteropConfig + ", imageSources=" + this.imageSources + ", flags=" + this.flags + ", platformApiCompat=null)";
        }

        public /* synthetic */ Config(Context context, ThreadConfig threadConfig, CameraMetadataConfig cameraMetadataConfig, CameraBackendConfig cameraBackendConfig, CameraInteropConfig cameraInteropConfig, ImageSources imageSources, Flags flags, PlatformApiCompat platformApiCompat, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? new ThreadConfig(null, null, null, null, null, null, null, CertificateBody.profileType, null) : threadConfig, (i & 4) != 0 ? new CameraMetadataConfig(null, null, 3, null) : cameraMetadataConfig, (i & 8) != 0 ? new CameraBackendConfig(null, null, null, 7, null) : cameraBackendConfig, (i & 16) != 0 ? new CameraInteropConfig(null, null, null, 7, null) : cameraInteropConfig, (i & 32) != 0 ? null : imageSources, (i & 64) != 0 ? new Flags(false, 1, null) : flags, (i & 128) != 0 ? null : platformApiCompat);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "", "Ljava/util/concurrent/Executor;", "defaultLightweightExecutor", "defaultBackgroundExecutor", "defaultBlockingExecutor", "defaultCameraExecutor", "Landroid/os/Handler;", "defaultCameraHandler", "Lkotlin/Function0;", "defaultCameraHandlerFn", "Lkotlinx/coroutines/CoroutineScope;", "testOnlyScope", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/concurrent/Executor;", "getDefaultLightweightExecutor", "()Ljava/util/concurrent/Executor;", "getDefaultBackgroundExecutor", "getDefaultBlockingExecutor", "getDefaultCameraExecutor", "Landroid/os/Handler;", "getDefaultCameraHandler", "()Landroid/os/Handler;", "Lkotlin/jvm/functions/Function0;", "getDefaultCameraHandlerFn", "()Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "getTestOnlyScope", "()Lkotlinx/coroutines/CoroutineScope;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ThreadConfig {
        private final Executor defaultBackgroundExecutor;
        private final Executor defaultBlockingExecutor;
        private final Executor defaultCameraExecutor;
        private final Handler defaultCameraHandler;
        private final Function0<Handler> defaultCameraHandlerFn;
        private final Executor defaultLightweightExecutor;
        private final CoroutineScope testOnlyScope;

        /* JADX WARN: Multi-variable type inference failed */
        public ThreadConfig(Executor executor, Executor executor2, Executor executor3, Executor executor4, Handler handler, Function0<? extends Handler> function0, CoroutineScope coroutineScope) {
            this.defaultLightweightExecutor = executor;
            this.defaultBackgroundExecutor = executor2;
            this.defaultBlockingExecutor = executor3;
            this.defaultCameraExecutor = executor4;
            this.defaultCameraHandler = handler;
            this.defaultCameraHandlerFn = function0;
            this.testOnlyScope = coroutineScope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThreadConfig)) {
                return false;
            }
            ThreadConfig threadConfig = (ThreadConfig) other;
            return Intrinsics.f(this.defaultLightweightExecutor, threadConfig.defaultLightweightExecutor) && Intrinsics.f(this.defaultBackgroundExecutor, threadConfig.defaultBackgroundExecutor) && Intrinsics.f(this.defaultBlockingExecutor, threadConfig.defaultBlockingExecutor) && Intrinsics.f(this.defaultCameraExecutor, threadConfig.defaultCameraExecutor) && Intrinsics.f(this.defaultCameraHandler, threadConfig.defaultCameraHandler) && Intrinsics.f(this.defaultCameraHandlerFn, threadConfig.defaultCameraHandlerFn) && Intrinsics.f(this.testOnlyScope, threadConfig.testOnlyScope);
        }

        public final Executor getDefaultBackgroundExecutor() {
            return this.defaultBackgroundExecutor;
        }

        public final Executor getDefaultBlockingExecutor() {
            return this.defaultBlockingExecutor;
        }

        public final Executor getDefaultCameraExecutor() {
            return this.defaultCameraExecutor;
        }

        public final Handler getDefaultCameraHandler() {
            return this.defaultCameraHandler;
        }

        public final Function0<Handler> getDefaultCameraHandlerFn() {
            return this.defaultCameraHandlerFn;
        }

        public final Executor getDefaultLightweightExecutor() {
            return this.defaultLightweightExecutor;
        }

        public final CoroutineScope getTestOnlyScope() {
            return this.testOnlyScope;
        }

        public int hashCode() {
            Executor executor = this.defaultLightweightExecutor;
            int iHashCode = (executor == null ? 0 : executor.hashCode()) * 31;
            Executor executor2 = this.defaultBackgroundExecutor;
            int iHashCode2 = (iHashCode + (executor2 == null ? 0 : executor2.hashCode())) * 31;
            Executor executor3 = this.defaultBlockingExecutor;
            int iHashCode3 = (iHashCode2 + (executor3 == null ? 0 : executor3.hashCode())) * 31;
            Executor executor4 = this.defaultCameraExecutor;
            int iHashCode4 = (iHashCode3 + (executor4 == null ? 0 : executor4.hashCode())) * 31;
            Handler handler = this.defaultCameraHandler;
            int iHashCode5 = (iHashCode4 + (handler == null ? 0 : handler.hashCode())) * 31;
            Function0<Handler> function0 = this.defaultCameraHandlerFn;
            int iHashCode6 = (iHashCode5 + (function0 == null ? 0 : function0.hashCode())) * 31;
            CoroutineScope coroutineScope = this.testOnlyScope;
            return iHashCode6 + (coroutineScope != null ? coroutineScope.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ThreadConfig(defaultLightweightExecutor=" + this.defaultLightweightExecutor + ", defaultBackgroundExecutor=" + this.defaultBackgroundExecutor + ", defaultBlockingExecutor=" + this.defaultBlockingExecutor + ", defaultCameraExecutor=" + this.defaultCameraExecutor + ", defaultCameraHandler=" + this.defaultCameraHandler + ", defaultCameraHandlerFn=" + this.defaultCameraHandlerFn + ", testOnlyScope=" + this.testOnlyScope + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ ThreadConfig(Executor executor, Executor executor2, Executor executor3, Executor executor4, Handler handler, Function0 function0, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : executor, (i & 2) != 0 ? null : executor2, (i & 4) != 0 ? null : executor3, (i & 8) != 0 ? null : executor4, (i & 16) != 0 ? null : handler, (i & 32) != 0 ? null : function0, (i & 64) != 0 ? null : coroutineScope);
        }
    }
}
