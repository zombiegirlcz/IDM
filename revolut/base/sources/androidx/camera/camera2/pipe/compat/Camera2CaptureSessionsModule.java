package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import androidx.camera.camera2.pipe.CameraGraph;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CaptureSessionsModule;", "", "<init>", "()V", "Lphm/a;", "Landroidx/camera/camera2/pipe/compat/AndroidMSessionFactory;", "androidMProvider", "Landroidx/camera/camera2/pipe/compat/AndroidMHighSpeedSessionFactory;", "androidMHighSpeedProvider", "Landroidx/camera/camera2/pipe/compat/AndroidNSessionFactory;", "androidNProvider", "Landroidx/camera/camera2/pipe/compat/AndroidPSessionFactory;", "androidPProvider", "Landroidx/camera/camera2/pipe/compat/AndroidExtensionSessionFactory;", "androidExtensionProvider", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "provideSessionFactory", "(Lphm/a;Lphm/a;Lphm/a;Lphm/a;Lphm/a;Landroidx/camera/camera2/pipe/CameraGraph$Config;)Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CaptureSessionsModule {

    @NotNull
    public static final Camera2CaptureSessionsModule INSTANCE = new Camera2CaptureSessionsModule();

    private Camera2CaptureSessionsModule() {
    }

    @NotNull
    public final CaptureSessionFactory provideSessionFactory(@NotNull phm.a androidMProvider, @NotNull phm.a androidMHighSpeedProvider, @NotNull phm.a androidNProvider, @NotNull phm.a androidPProvider, @NotNull phm.a androidExtensionProvider, @NotNull CameraGraph.Config graphConfig) {
        Intrinsics.checkNotNullParameter(androidMProvider, "androidMProvider");
        Intrinsics.checkNotNullParameter(androidMHighSpeedProvider, "androidMHighSpeedProvider");
        Intrinsics.checkNotNullParameter(androidNProvider, "androidNProvider");
        Intrinsics.checkNotNullParameter(androidPProvider, "androidPProvider");
        Intrinsics.checkNotNullParameter(androidExtensionProvider, "androidExtensionProvider");
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        if (!CameraGraph.OperatingMode.m170equalsimpl0(graphConfig.getSessionMode(), CameraGraph.OperatingMode.INSTANCE.m174getEXTENSION2uNL3no())) {
            Object obj2 = androidPProvider.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            return (CaptureSessionFactory) obj2;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalStateException("Cannot use Extension sessions below Android S");
        }
        Object obj3 = androidExtensionProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
        return (CaptureSessionFactory) obj3;
    }
}
