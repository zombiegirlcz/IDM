package androidx.camera.camera2.config;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import androidx.camera.camera2.adapter.EncoderProfilesProviderAdapter;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.adapter.ZslControlImpl;
import androidx.camera.camera2.compat.Camera2CameraControlCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.camera.core.impl.EncoderProfilesProvider;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import skm.b0;
import skm.e0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/config/CameraModule;", "", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CameraModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020(2\b\b\u0001\u0010%\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroidx/camera/camera2/config/CameraModule$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/config/CameraConfig;", "cameraConfig", "Landroidx/camera/core/impl/CameraThreadConfig;", "cameraThreadConfig", "Landroidx/camera/camera2/impl/UseCaseThreads;", "provideUseCaseThreads", "(Landroidx/camera/camera2/config/CameraConfig;Landroidx/camera/core/impl/CameraThreadConfig;)Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/compat/Camera2CameraControlCompat;", "compat", "threads", "Landroidx/camera/camera2/impl/ComboRequestListener;", "requestListener", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "provideCamera2CameraControl", "(Landroidx/camera/camera2/compat/Camera2CameraControlCompat;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/ComboRequestListener;)Landroidx/camera/camera2/interop/Camera2CameraControl;", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraPipe", "config", "Landroidx/camera/camera2/pipe/CameraMetadata;", "provideCameraMetadata", "(Landroidx/camera/camera2/pipe/CameraPipe;Landroidx/camera/camera2/config/CameraConfig;)Landroidx/camera/camera2/pipe/CameraMetadata;", "", "provideCameraIdString", "(Landroidx/camera/camera2/config/CameraConfig;)Ljava/lang/String;", "cameraMetadata", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "provideStreamConfigurationMap", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Landroid/hardware/camera2/params/StreamConfigurationMap;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/adapter/ZslControl;", "provideZslControl", "(Landroidx/camera/camera2/impl/CameraProperties;)Landroidx/camera/camera2/adapter/ZslControl;", "cameraIdString", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "provideEncoderProfilesProvider", "(Ljava/lang/String;Landroidx/camera/camera2/compat/quirk/CameraQuirks;)Landroidx/camera/core/impl/EncoderProfilesProvider;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Camera2CameraControl provideCamera2CameraControl(@NotNull Camera2CameraControlCompat compat, @NotNull UseCaseThreads threads, @NotNull ComboRequestListener requestListener) {
            Intrinsics.checkNotNullParameter(compat, "compat");
            Intrinsics.checkNotNullParameter(threads, "threads");
            Intrinsics.checkNotNullParameter(requestListener, "requestListener");
            return Camera2CameraControl.INSTANCE.create(compat, threads, requestListener);
        }

        @NotNull
        public final String provideCameraIdString(@NotNull CameraConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return config.getCameraId();
        }

        public final CameraMetadata provideCameraMetadata(@NotNull CameraPipe cameraPipe, @NotNull CameraConfig config) {
            Intrinsics.checkNotNullParameter(cameraPipe, "cameraPipe");
            Intrinsics.checkNotNullParameter(config, "config");
            try {
                return CameraDevices.m122awaitCameraMetadataFpsL5FU$default(cameraPipe.cameras(), config.getCameraId(), null, 2, null);
            } catch (DoNotDisturbException unused) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isErrorEnabled("CXCP")) {
                    String unused2 = Camera2Logger.TRUNCATED_TAG;
                }
                return null;
            }
        }

        @NotNull
        public final EncoderProfilesProvider provideEncoderProfilesProvider(@NotNull String cameraIdString, @NotNull CameraQuirks cameraQuirks) {
            Intrinsics.checkNotNullParameter(cameraIdString, "cameraIdString");
            Intrinsics.checkNotNullParameter(cameraQuirks, "cameraQuirks");
            return new EncoderProfilesProviderAdapter(cameraIdString, cameraQuirks.getQuirks());
        }

        public final StreamConfigurationMap provideStreamConfigurationMap(CameraMetadata cameraMetadata) {
            if (cameraMetadata == null) {
                return null;
            }
            CameraCharacteristics.Key SCALER_STREAM_CONFIGURATION_MAP = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
            Intrinsics.checkNotNullExpressionValue(SCALER_STREAM_CONFIGURATION_MAP, "SCALER_STREAM_CONFIGURATION_MAP");
            return (StreamConfigurationMap) cameraMetadata.get(SCALER_STREAM_CONFIGURATION_MAP);
        }

        @NotNull
        public final UseCaseThreads provideUseCaseThreads(@NotNull CameraConfig cameraConfig, @NotNull CameraThreadConfig cameraThreadConfig) {
            Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
            Intrinsics.checkNotNullParameter(cameraThreadConfig, "cameraThreadConfig");
            Executor cameraExecutor = cameraThreadConfig.getCameraExecutor();
            Intrinsics.checkNotNullExpressionValue(cameraExecutor, "getCameraExecutor(...)");
            Executor cameraExecutor2 = cameraThreadConfig.getCameraExecutor();
            Intrinsics.checkNotNullExpressionValue(cameraExecutor2, "getCameraExecutor(...)");
            CoroutineDispatcher coroutineDispatcherR = e0.r(cameraExecutor2);
            return new UseCaseThreads(e0.c(e.d(e0.e(), coroutineDispatcherR).plus(new b0("CXCP-UseCase-" + cameraConfig.getCameraId()))), cameraExecutor, coroutineDispatcherR);
        }

        @NotNull
        public final ZslControl provideZslControl(@NotNull CameraProperties cameraProperties) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new ZslControlImpl(cameraProperties);
        }

        private Companion() {
        }
    }
}
