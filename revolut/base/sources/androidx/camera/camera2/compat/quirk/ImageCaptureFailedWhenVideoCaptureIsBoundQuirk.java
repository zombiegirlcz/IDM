package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;", "Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "<init>", "()V", "workaroundByCaptureIntentPreview", "", "workaroundBySurfaceProcessing", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk$Companion;", "", "<init>", "()V", "isEnabled", "", "isBluStudioX10", "()Z", "isItelW6004", "isVivo1805", "isPositivoTwist2Pro", "isPixel4XLApi29", "isMotoE13", "isSamsungTabA8", "isSamsungA53", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBluStudioX10() {
            return Device.INSTANCE.isBluDevice() && "studio x10".equalsIgnoreCase(Build.MODEL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isItelW6004() {
            return Device.INSTANCE.isItelDevice() && "itel w6004".equalsIgnoreCase(Build.MODEL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isMotoE13() {
            return Device.INSTANCE.isMotorolaDevice() && "moto e13".equalsIgnoreCase(Build.MODEL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPixel4XLApi29() {
            return "pixel 4 xl".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT == 29;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPositivoTwist2Pro() {
            return Device.INSTANCE.isPositivoDevice() && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSamsungA53() {
            if (Device.INSTANCE.isSamsungDevice()) {
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (a0.H(MODEL, "SM-A536", false)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSamsungTabA8() {
            if (!Device.INSTANCE.isSamsungDevice()) {
                return false;
            }
            String str = Build.DEVICE;
            return "gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isVivo1805() {
            return Device.INSTANCE.isVivoDevice() && "vivo 1805".equalsIgnoreCase(Build.MODEL);
        }

        public final boolean isEnabled() {
            return isBluStudioX10() || isItelW6004() || isVivo1805() || isPositivoTwist2Pro() || isPixel4XLApi29() || isMotoE13() || isSamsungTabA8() || isSamsungA53() || Device.INSTANCE.isUniSocChipsetDevice();
        }

        private Companion() {
        }
    }

    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public boolean workaroundByCaptureIntentPreview() {
        Companion companion = INSTANCE;
        return companion.isBluStudioX10() || companion.isItelW6004() || companion.isVivo1805() || companion.isPositivoTwist2Pro();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public boolean workaroundBySurfaceProcessing() {
        Companion companion = INSTANCE;
        return companion.isBluStudioX10() || companion.isItelW6004() || companion.isVivo1805() || companion.isPositivoTwist2Pro() || companion.isPixel4XLApi29() || companion.isMotoE13() || companion.isSamsungTabA8() || companion.isSamsungA53() || Device.INSTANCE.isUniSocChipsetDevice();
    }
}
