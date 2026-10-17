package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import com.onfido.android.sdk.capture.common.permissions.PermissionRequestStatus;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.PermissionEvents;
import com.onfido.android.sdk.capture.ui.CaptureType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0010¢\u0006\u0002\b\tJ%\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0010¢\u0006\u0002\b\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/PermissionsTracker;", "", "onfidoAnalytics", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;)V", "trackPermissionsDenied", "", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "trackPermissionsDenied$onfido_capture_sdk_core_release", "trackPermissionsGranted", "permissionsGranted", "", "", "trackPermissionsGranted$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;[Ljava/lang/String;)V", "trackPermissionsManagementScreen", "permissions", "permissionRequestStatus", "Lcom/onfido/android/sdk/capture/common/permissions/PermissionRequestStatus;", "trackPermissionsManagementScreen$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;[Ljava/lang/String;Lcom/onfido/android/sdk/capture/common/permissions/PermissionRequestStatus;)V", "trackPermissionsSettingsButtonClick", "trackPermissionsSettingsButtonClick$onfido_capture_sdk_core_release", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class PermissionsTracker {

    @NotNull
    private final OnfidoAnalytics onfidoAnalytics;

    @Deprecated
    @NotNull
    public static final String CAMERA = "camera";

    @Deprecated
    @NotNull
    public static final String MICROPHONE = "microphone";

    @Deprecated
    @NotNull
    public static final String UNKNOWN = "unknwon";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/PermissionsTracker$Companion;", "", "()V", "CAMERA", "", "MICROPHONE", "UNKNOWN", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PermissionsTracker(@NotNull OnfidoAnalytics onfidoAnalytics) {
        Intrinsics.checkNotNullParameter(onfidoAnalytics, "onfidoAnalytics");
        this.onfidoAnalytics = onfidoAnalytics;
    }

    public void trackPermissionsDenied$onfido_capture_sdk_core_release(@NotNull CaptureType captureType) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        this.onfidoAnalytics.track(new PermissionEvents.PermissionDenied(captureType));
    }

    public void trackPermissionsGranted$onfido_capture_sdk_core_release(@NotNull CaptureType captureType, @NotNull String[] permissionsGranted) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(permissionsGranted, "permissionsGranted");
        ArrayList arrayList = new ArrayList(permissionsGranted.length);
        for (String str : permissionsGranted) {
            arrayList.add(Intrinsics.f(str, "android.permission.CAMERA") ? "camera" : Intrinsics.f(str, "android.permission.RECORD_AUDIO") ? "microphone" : "unknwon");
        }
        this.onfidoAnalytics.track(new PermissionEvents.PermissionGranted(captureType, d0.k0(arrayList, "|", null, null, 0, null, 62)));
    }

    public void trackPermissionsManagementScreen$onfido_capture_sdk_core_release(@NotNull CaptureType captureType, @NotNull String[] permissions, @NotNull PermissionRequestStatus permissionRequestStatus) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(permissionRequestStatus, "permissionRequestStatus");
        this.onfidoAnalytics.track(new PermissionEvents.PermissionsManagement(captureType, permissions, permissionRequestStatus));
    }

    public void trackPermissionsSettingsButtonClick$onfido_capture_sdk_core_release(@NotNull CaptureType captureType) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        this.onfidoAnalytics.track(new PermissionEvents.PermissionSettingsClick(captureType));
    }
}
