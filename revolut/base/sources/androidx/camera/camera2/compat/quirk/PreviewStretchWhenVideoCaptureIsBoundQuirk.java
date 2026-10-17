package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/camera/camera2/compat/quirk/PreviewStretchWhenVideoCaptureIsBoundQuirk;", "Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk;", "<init>", "()V", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewStretchWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Landroidx/camera/camera2/compat/quirk/PreviewStretchWhenVideoCaptureIsBoundQuirk$Companion;", "", "<init>", "()V", "isEnabled", "", "isHuaweiP8Lite", "isSamsungJ3", "isSamsungJ5", "isSamsungJ7", "isSamsungJ1AceNeo", "isOppoA37F", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isHuaweiP8Lite() {
            return Device.INSTANCE.isHuaweiDevice() && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL);
        }

        private final boolean isOppoA37F() {
            return Device.INSTANCE.isOppoDevice() && "A37F".equalsIgnoreCase(Build.MODEL);
        }

        private final boolean isSamsungJ1AceNeo() {
            return Device.INSTANCE.isSamsungDevice() && "sm-j111f".equalsIgnoreCase(Build.MODEL);
        }

        private final boolean isSamsungJ3() {
            return Device.INSTANCE.isSamsungDevice() && "sm-j320f".equalsIgnoreCase(Build.MODEL);
        }

        private final boolean isSamsungJ5() {
            return Device.INSTANCE.isSamsungDevice() && "sm-j510fn".equalsIgnoreCase(Build.MODEL);
        }

        private final boolean isSamsungJ7() {
            return Device.INSTANCE.isSamsungDevice() && "sm-j700f".equalsIgnoreCase(Build.MODEL);
        }

        public final boolean isEnabled() {
            return isHuaweiP8Lite() || isSamsungJ3() || isSamsungJ7() || isSamsungJ1AceNeo() || isOppoA37F() || isSamsungJ5();
        }

        private Companion() {
        }
    }
}
