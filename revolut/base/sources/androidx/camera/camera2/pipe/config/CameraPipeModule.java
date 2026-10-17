package androidx.camera.camera2.pipe.config;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.AndroidDevicePolicyManagerWrapper;
import androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraBackendsImpl;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.camera2.pipe.media.ImageReaderImageSources;
import androidx.camera.camera2.pipe.media.ImageSources;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import phm.a;
import skm.e0;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/config/CameraPipeModule;", "", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CameraPipeModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010%\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0001\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u0002052\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"Landroidx/camera/camera2/pipe/config/CameraPipeModule$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraPipe$Config;", "config", "Landroid/content/Context;", "provideContext", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;)Landroid/content/Context;", "Lkotlinx/coroutines/Job;", "provideCameraPipeJob", "()Lkotlinx/coroutines/Job;", "Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "provideCameraMetadataConfig", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;)Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "cameraPipeContext", "Landroid/hardware/camera2/CameraManager;", "provideCameraManager", "(Landroid/content/Context;)Landroid/hardware/camera2/CameraManager;", "Landroidx/camera/camera2/pipe/compat/DevicePolicyManagerWrapper;", "provideDevicePolicyManagerWrapper", "(Landroid/content/Context;)Landroidx/camera/camera2/pipe/compat/DevicePolicyManagerWrapper;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraBackends;", "cameraBackends", "Landroidx/camera/camera2/pipe/CameraContext;", "provideCameraContext", "(Landroid/content/Context;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraBackends;)Landroidx/camera/camera2/pipe/CameraContext;", "Landroid/content/pm/PackageManager;", "providePackageManager", "(Landroid/content/Context;)Landroid/content/pm/PackageManager;", "Lphm/a;", "Landroidx/camera/camera2/pipe/CameraBackend;", "defaultCameraBackend", "Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "cameraPipeLifetime", "provideCameraBackends", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;Lphm/a;Landroid/content/Context;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;)Landroidx/camera/camera2/pipe/CameraBackends;", "Landroidx/camera/camera2/pipe/media/ImageReaderImageSources;", "imageReaderImageSources", "cameraPipeConfig", "Landroidx/camera/camera2/pipe/media/ImageSources;", "configureImageSources", "(Landroidx/camera/camera2/pipe/media/ImageReaderImageSources;Landroidx/camera/camera2/pipe/CameraPipe$Config;)Landroidx/camera/camera2/pipe/media/ImageSources;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "provideCameraSurfaceManager", "()Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "flags", "Landroidx/camera/camera2/pipe/StrictMode;", "provideStrictMode", "(Landroidx/camera/camera2/pipe/CameraPipe$Flags;)Landroidx/camera/camera2/pipe/StrictMode;", "Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;", "provideCameraDeviceSetupCompatFactory", "(Landroid/content/Context;)Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CameraBackend provideCameraBackends$lambda$2(CameraBackend cameraBackend, CameraContext it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            Intrinsics.h(cameraBackend);
            return cameraBackend;
        }

        @NotNull
        public final ImageSources configureImageSources(@NotNull ImageReaderImageSources imageReaderImageSources, @NotNull CameraPipe.Config cameraPipeConfig) {
            Intrinsics.checkNotNullParameter(imageReaderImageSources, "imageReaderImageSources");
            Intrinsics.checkNotNullParameter(cameraPipeConfig, "cameraPipeConfig");
            return cameraPipeConfig.getImageSources() != null ? cameraPipeConfig.getImageSources() : imageReaderImageSources;
        }

        @NotNull
        public final CameraBackends provideCameraBackends(@NotNull CameraPipe.Config config, @NotNull a defaultCameraBackend, @NotNull Context cameraPipeContext, @NotNull Threads threads, @NotNull CameraPipeLifetime cameraPipeLifetime) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(defaultCameraBackend, "defaultCameraBackend");
            Intrinsics.checkNotNullParameter(cameraPipeContext, "cameraPipeContext");
            Intrinsics.checkNotNullParameter(threads, "threads");
            Intrinsics.checkNotNullParameter(cameraPipeLifetime, "cameraPipeLifetime");
            CameraBackend internalBackend = config.getCameraBackendConfig().getInternalBackend();
            if (internalBackend == null) {
                Debug debug = Debug.INSTANCE;
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    internalBackend = (CameraBackend) defaultCameraBackend.get();
                } finally {
                    Trace.endSection();
                }
            }
            if (config.getCameraBackendConfig().getCameraBackends().containsKey(CameraBackendId.m105boximpl(internalBackend.mo103getIdQwmhuAM()))) {
                throw new IllegalStateException(("CameraBackendConfig#cameraBackends should not contain a backend with " + ((Object) CameraBackendId.m110toStringimpl(internalBackend.mo103getIdQwmhuAM())) + ". Use CameraBackendConfig#internalBackend field instead.").toString());
            }
            Map mapQ = r0.q(config.getCameraBackendConfig().getCameraBackends(), new Pair(CameraBackendId.m105boximpl(internalBackend.mo103getIdQwmhuAM()), new x.a(internalBackend)));
            String strM193getDefaultBackendAKmI2lo = config.getCameraBackendConfig().getDefaultBackend();
            if (strM193getDefaultBackendAKmI2lo == null) {
                strM193getDefaultBackendAKmI2lo = internalBackend.mo103getIdQwmhuAM();
            }
            String str = strM193getDefaultBackendAKmI2lo;
            if (mapQ.containsKey(CameraBackendId.m105boximpl(str))) {
                return new CameraBackendsImpl(str, mapQ, cameraPipeContext, threads, cameraPipeLifetime, null);
            }
            throw new IllegalStateException(("Failed to find " + ((Object) CameraBackendId.m110toStringimpl(str)) + " in the list of available CameraPipe backends! Available values are " + mapQ.keySet()).toString());
        }

        @NotNull
        public final CameraContext provideCameraContext(@NotNull final Context cameraPipeContext, @NotNull final Threads threads, @NotNull final CameraBackends cameraBackends) {
            Intrinsics.checkNotNullParameter(cameraPipeContext, "cameraPipeContext");
            Intrinsics.checkNotNullParameter(threads, "threads");
            Intrinsics.checkNotNullParameter(cameraBackends, "cameraBackends");
            return new CameraContext(cameraPipeContext, threads, cameraBackends) { // from class: androidx.camera.camera2.pipe.config.CameraPipeModule$Companion$provideCameraContext$1
                private final Context appContext;
                private final CameraBackends cameraBackends;
                private final Threads threads;

                {
                    this.appContext = cameraPipeContext;
                    this.threads = threads;
                    this.cameraBackends = cameraBackends;
                }
            };
        }

        @NotNull
        public final CameraDeviceSetupCompatFactory provideCameraDeviceSetupCompatFactory(@NotNull Context cameraPipeContext) {
            Intrinsics.checkNotNullParameter(cameraPipeContext, "cameraPipeContext");
            return new CameraDeviceSetupCompatFactory(cameraPipeContext);
        }

        @NotNull
        public final CameraManager provideCameraManager(@NotNull Context cameraPipeContext) {
            Intrinsics.checkNotNullParameter(cameraPipeContext, "cameraPipeContext");
            Object systemService = cameraPipeContext.getSystemService("camera");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            return (CameraManager) systemService;
        }

        @NotNull
        public final CameraPipe.CameraMetadataConfig provideCameraMetadataConfig(@NotNull CameraPipe.Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return config.getCameraMetadataConfig();
        }

        @NotNull
        public final Job provideCameraPipeJob() {
            return e0.d();
        }

        @NotNull
        public final CameraSurfaceManager provideCameraSurfaceManager() {
            return new CameraSurfaceManager();
        }

        @NotNull
        public final Context provideContext(@NotNull CameraPipe.Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return config.getAppContext();
        }

        @NotNull
        public final DevicePolicyManagerWrapper provideDevicePolicyManagerWrapper(@NotNull Context cameraPipeContext) {
            Intrinsics.checkNotNullParameter(cameraPipeContext, "cameraPipeContext");
            Object systemService = cameraPipeContext.getSystemService("device_policy");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
            return new AndroidDevicePolicyManagerWrapper((DevicePolicyManager) systemService);
        }

        @NotNull
        public final PackageManager providePackageManager(@NotNull Context cameraPipeContext) {
            Intrinsics.checkNotNullParameter(cameraPipeContext, "cameraPipeContext");
            PackageManager packageManager = cameraPipeContext.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            return packageManager;
        }

        @NotNull
        public final StrictMode provideStrictMode(@NotNull CameraPipe.Flags flags) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            return new StrictMode(flags.getStrictModeEnabled());
        }

        private Companion() {
        }
    }
}
