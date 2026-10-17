package androidx.camera.camera2.compat.quirk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;", "Landroidx/camera/camera2/compat/quirk/UseTorchAsFlashQuirk;", "<init>", "()V", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<String> BUILD_MODELS = v.k("itel w6004", "sm-j700m");

    @NotNull
    private static final List<String> BUILD_MODELS_FRONT_CAMERA = v.k("sm-j700f", "sm-j710f");

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk$Companion;", "", "<init>", "()V", "BUILD_MODELS", "", "", "BUILD_MODELS_FRONT_CAMERA", "isEnabled", "", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean isEnabled(@org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.CameraMetadata r9) {
            /*
                r8 = this;
                java.lang.String r0 = "cameraMetadata"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.util.List r0 = androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.access$getBUILD_MODELS_FRONT_CAMERA$cp()
                java.lang.String r1 = android.os.Build.MODEL
                java.lang.String r2 = "MODEL"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.util.Locale r3 = java.util.Locale.ROOT
                java.lang.String r4 = r1.toLowerCase(r3)
                java.lang.String r5 = "toLowerCase(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                boolean r0 = r0.contains(r4)
                r4 = 0
                r6 = 1
                if (r0 == 0) goto L3b
                android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
                java.lang.String r7 = "LENS_FACING"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
                java.lang.Object r9 = r9.get(r0)
                java.lang.Integer r9 = (java.lang.Integer) r9
                if (r9 != 0) goto L33
                goto L3b
            L33:
                int r9 = r9.intValue()
                if (r9 != 0) goto L3b
                r9 = r6
                goto L3c
            L3b:
                r9 = r4
            L3c:
                java.util.List r0 = androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.access$getBUILD_MODELS$cp()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.String r1 = r1.toLowerCase(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                boolean r0 = r0.contains(r1)
                if (r9 != 0) goto L54
                if (r0 == 0) goto L53
                goto L54
            L53:
                return r4
            L54:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.Companion.isEnabled(androidx.camera.camera2.pipe.CameraMetadata):boolean");
        }

        private Companion() {
        }
    }
}
