package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "shouldCloseCameraDevice", "", "isExtensions", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements Quirk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean isSamsungExynos7570Device;
    private static final boolean isSamsungExynos7870Device;
    private static final boolean isSamsungProblematicDevice;
    private static final boolean isSonyProblematicDevice;
    private static final boolean isXiaomiProblematicDevice;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk$Companion;", "", "<init>", "()V", "isEnabled", "", "isSamsungExynos7570Device", "isSamsungExynos7870Device", "isXiaomiProblematicDevice", "isSonyProblematicDevice", "isSamsungProblematicDevice", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isEnabled() {
            if (CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7570Device || CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7870Device) {
                return true;
            }
            int i = Build.VERSION.SDK_INT;
            if (30 <= i && i < 34) {
                Device device = Device.INSTANCE;
                if (device.isOppoDevice() || device.isOnePlusDevice() || device.isRealmeDevice()) {
                    return true;
                }
            }
            return Device.INSTANCE.isVivoDevice() || CloseCameraDeviceOnCameraGraphCloseQuirk.isXiaomiProblematicDevice || CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungProblematicDevice || CloseCameraDeviceOnCameraGraphCloseQuirk.isSonyProblematicDevice;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    static {
        /*
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk$Companion r0 = new androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.INSTANCE = r0
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "samsungexynos7570"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7570Device = r1
            java.lang.String r1 = "samsungexynos7870"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7870Device = r0
            androidx.camera.camera2.compat.quirk.Device r0 = androidx.camera.camera2.compat.quirk.Device.INSTANCE
            boolean r1 = r0.isXiaomiDevice()
            java.lang.String r2 = "DEVICE"
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L46
            java.lang.String r1 = "aurora"
            java.lang.String r5 = "houji"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}
            java.lang.String r5 = android.os.Build.DEVICE
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r6)
            java.lang.String r6 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            boolean r1 = kotlin.collections.d.I(r1, r5)
            if (r1 == 0) goto L46
            r1 = r4
            goto L47
        L46:
            r1 = r3
        L47:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.isXiaomiProblematicDevice = r1
            boolean r0 = r0.isSonyDevice()
            if (r0 == 0) goto L8a
            java.lang.String r0 = "SO"
            java.lang.String r1 = "A301SO"
            java.lang.String r5 = "XQ-DQ"
            java.lang.String[] r0 = new java.lang.String[]{r5, r0, r1}
            java.util.List r0 = zhm.v.k(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L6d
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L6d
            goto L8a
        L6d:
            java.util.Iterator r0 = r0.iterator()
        L71:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = android.os.Build.DEVICE
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            boolean r1 = kotlin.text.a0.H(r5, r1, r4)
            if (r1 == 0) goto L71
            r0 = r4
            goto L8b
        L8a:
            r0 = r3
        L8b:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.isSonyProblematicDevice = r0
            androidx.camera.camera2.compat.quirk.Device r0 = androidx.camera.camera2.compat.quirk.Device.INSTANCE
            boolean r0 = r0.isSamsungDevice()
            if (r0 == 0) goto La0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto La0
            r1 = 34
            if (r0 > r1) goto La0
            r3 = r4
        La0:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungProblematicDevice = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.<clinit>():void");
    }

    public final boolean shouldCloseCameraDevice(boolean isExtensions) {
        if (isXiaomiProblematicDevice) {
            return isExtensions;
        }
        if (!isSamsungProblematicDevice || isSamsungExynos7570Device || isSamsungExynos7870Device) {
            return true;
        }
        return isExtensions;
    }
}
