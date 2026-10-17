package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.adapter.CameraFactoryProvider;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.CameraThreadConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m.a;
import m.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Landroidx/camera/camera2/Camera2Config;", "", "Companion", "DefaultProvider", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Camera2Config {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J,\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/Camera2Config$Companion;", "", "<init>", "()V", "defaultConfig", "Landroidx/camera/core/CameraXConfig;", "from", "sharedCameraPipe", "Landroidx/camera/camera2/pipe/CameraPipe;", "sharedAppContext", "Landroid/content/Context;", "sharedThreadConfig", "Landroidx/camera/core/impl/CameraThreadConfig;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CameraXConfig from$default(Companion companion, CameraPipe cameraPipe, Context context, CameraThreadConfig cameraThreadConfig, int i, Object obj2) {
            if ((i & 1) != 0) {
                cameraPipe = null;
            }
            if ((i & 2) != 0) {
                context = null;
            }
            if ((i & 4) != 0) {
                cameraThreadConfig = null;
            }
            return companion.from(cameraPipe, context, cameraThreadConfig);
        }

        @NotNull
        public final CameraXConfig defaultConfig() {
            return from$default(this, null, null, null, 7, null);
        }

        @NotNull
        public final CameraXConfig from(CameraPipe sharedCameraPipe, Context sharedAppContext, CameraThreadConfig sharedThreadConfig) {
            CameraXConfig cameraXConfigBuild = new CameraXConfig.Builder().setCameraFactoryProvider(new CameraFactoryProvider(sharedCameraPipe, sharedAppContext, sharedThreadConfig)).setDeviceSurfaceManagerProvider(new a()).setUseCaseConfigFactoryProvider(new b()).setRepeatingStreamForced(true).build();
            Intrinsics.checkNotNullExpressionValue(cameraXConfigBuild, "build(...)");
            return cameraXConfigBuild;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Landroidx/camera/camera2/Camera2Config$DefaultProvider;", "Landroidx/camera/core/CameraXConfig$Provider;", "<init>", "()V", "getCameraXConfig", "Landroidx/camera/core/CameraXConfig;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultProvider implements CameraXConfig.Provider {
        @Override // androidx.camera.core.CameraXConfig.Provider
        @NotNull
        public CameraXConfig getCameraXConfig() {
            return Camera2Config.INSTANCE.defaultConfig();
        }
    }
}
