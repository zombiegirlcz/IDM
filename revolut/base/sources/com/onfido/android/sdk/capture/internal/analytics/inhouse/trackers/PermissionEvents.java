package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.common.permissions.PermissionRequestStatus;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsFlowStep;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.Event;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.EventType;
import com.onfido.android.sdk.capture.ui.CaptureType;
import j6.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001b\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0002\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/PermissionEvents;", "", "()V", "getFlowStep", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsFlowStep;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "getRequiredPermissions", "", "permissions", "", "([Ljava/lang/String;)Ljava/lang/String;", "PermissionDenied", "PermissionGranted", "PermissionSettingsClick", "PermissionsManagement", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PermissionEvents {

    @NotNull
    public static final PermissionEvents INSTANCE = new PermissionEvents();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/PermissionEvents$PermissionDenied;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;)V", "getCaptureType", "()Lcom/onfido/android/sdk/capture/ui/CaptureType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PermissionDenied extends AnalyticsEvent {

        @NotNull
        private final CaptureType captureType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PermissionDenied(@NotNull CaptureType captureType) {
            super(new Event("PERMISSION_DENIED", EventType.VIEW, null, null, 12, null), b.m("step", PermissionEvents.INSTANCE.getFlowStep(captureType)), null, 4, null);
            Intrinsics.checkNotNullParameter(captureType, "captureType");
            this.captureType = captureType;
        }

        public static /* synthetic */ PermissionDenied copy$default(PermissionDenied permissionDenied, CaptureType captureType, int i, Object obj2) {
            if ((i & 1) != 0) {
                captureType = permissionDenied.captureType;
            }
            return permissionDenied.copy(captureType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CaptureType getCaptureType() {
            return this.captureType;
        }

        @NotNull
        public final PermissionDenied copy(@NotNull CaptureType captureType) {
            Intrinsics.checkNotNullParameter(captureType, "captureType");
            return new PermissionDenied(captureType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PermissionDenied) && this.captureType == ((PermissionDenied) other).captureType;
        }

        @NotNull
        public final CaptureType getCaptureType() {
            return this.captureType;
        }

        public int hashCode() {
            return this.captureType.hashCode();
        }

        @NotNull
        public String toString() {
            return "PermissionDenied(captureType=" + this.captureType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/PermissionEvents$PermissionGranted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "permissionsGranted", "", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;Ljava/lang/String;)V", "getCaptureType", "()Lcom/onfido/android/sdk/capture/ui/CaptureType;", "getPermissionsGranted", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PermissionGranted extends AnalyticsEvent {

        @NotNull
        private final CaptureType captureType;

        @NotNull
        private final String permissionsGranted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PermissionGranted(@NotNull CaptureType captureType, @NotNull String permissionsGranted) {
            super(new Event("PERMISSION_GRANTED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", PermissionEvents.INSTANCE.getFlowStep(captureType)), new Pair("permissions_granted", permissionsGranted)), null, 4, null);
            Intrinsics.checkNotNullParameter(captureType, "captureType");
            Intrinsics.checkNotNullParameter(permissionsGranted, "permissionsGranted");
            this.captureType = captureType;
            this.permissionsGranted = permissionsGranted;
        }

        public static /* synthetic */ PermissionGranted copy$default(PermissionGranted permissionGranted, CaptureType captureType, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                captureType = permissionGranted.captureType;
            }
            if ((i & 2) != 0) {
                str = permissionGranted.permissionsGranted;
            }
            return permissionGranted.copy(captureType, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CaptureType getCaptureType() {
            return this.captureType;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPermissionsGranted() {
            return this.permissionsGranted;
        }

        @NotNull
        public final PermissionGranted copy(@NotNull CaptureType captureType, @NotNull String permissionsGranted) {
            Intrinsics.checkNotNullParameter(captureType, "captureType");
            Intrinsics.checkNotNullParameter(permissionsGranted, "permissionsGranted");
            return new PermissionGranted(captureType, permissionsGranted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PermissionGranted)) {
                return false;
            }
            PermissionGranted permissionGranted = (PermissionGranted) other;
            return this.captureType == permissionGranted.captureType && Intrinsics.f(this.permissionsGranted, permissionGranted.permissionsGranted);
        }

        @NotNull
        public final CaptureType getCaptureType() {
            return this.captureType;
        }

        @NotNull
        public final String getPermissionsGranted() {
            return this.permissionsGranted;
        }

        public int hashCode() {
            return this.permissionsGranted.hashCode() + (this.captureType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("PermissionGranted(captureType=");
            sb6.append(this.captureType);
            sb6.append(", permissionsGranted=");
            return a.u(sb6, this.permissionsGranted, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/PermissionEvents$PermissionSettingsClick;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;)V", "getCaptureType", "()Lcom/onfido/android/sdk/capture/ui/CaptureType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PermissionSettingsClick extends AnalyticsEvent {

        @NotNull
        private final CaptureType captureType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PermissionSettingsClick(@NotNull CaptureType captureType) {
            super(new Event("PERMISSION_SETTINGS_CLICK", EventType.ACTION, null, null, 12, null), b.m("step", PermissionEvents.INSTANCE.getFlowStep(captureType)), null, 4, null);
            Intrinsics.checkNotNullParameter(captureType, "captureType");
            this.captureType = captureType;
        }

        public static /* synthetic */ PermissionSettingsClick copy$default(PermissionSettingsClick permissionSettingsClick, CaptureType captureType, int i, Object obj2) {
            if ((i & 1) != 0) {
                captureType = permissionSettingsClick.captureType;
            }
            return permissionSettingsClick.copy(captureType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CaptureType getCaptureType() {
            return this.captureType;
        }

        @NotNull
        public final PermissionSettingsClick copy(@NotNull CaptureType captureType) {
            Intrinsics.checkNotNullParameter(captureType, "captureType");
            return new PermissionSettingsClick(captureType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PermissionSettingsClick) && this.captureType == ((PermissionSettingsClick) other).captureType;
        }

        @NotNull
        public final CaptureType getCaptureType() {
            return this.captureType;
        }

        public int hashCode() {
            return this.captureType.hashCode();
        }

        @NotNull
        public String toString() {
            return "PermissionSettingsClick(captureType=" + this.captureType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/PermissionEvents$PermissionsManagement;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "permissions", "", "", "permissionRequestStatus", "Lcom/onfido/android/sdk/capture/common/permissions/PermissionRequestStatus;", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;[Ljava/lang/String;Lcom/onfido/android/sdk/capture/common/permissions/PermissionRequestStatus;)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PermissionsManagement extends AnalyticsEvent {
        public PermissionsManagement(@NotNull CaptureType captureType, @NotNull String[] permissions, @NotNull PermissionRequestStatus permissionRequestStatus) {
            Intrinsics.checkNotNullParameter(captureType, "captureType");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(permissionRequestStatus, "permissionRequestStatus");
            Event event = new Event("PERMISSIONS_MANAGEMENT", EventType.SCREEN, null, null, 12, null);
            PermissionEvents permissionEvents = PermissionEvents.INSTANCE;
            super(event, r0.k(new Pair("step", permissionEvents.getFlowStep(captureType)), new Pair("permissions_required", permissionEvents.getRequiredPermissions(permissions)), new Pair("permission_status", permissionRequestStatus.getId())), null, 4, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CaptureType.values().length];
            try {
                iArr[CaptureType.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CaptureType.FACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CaptureType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PermissionEvents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnalyticsFlowStep getFlowStep(CaptureType captureType) {
        int i = WhenMappings.$EnumSwitchMapping$0[captureType.ordinal()];
        if (i == 1) {
            return AnalyticsFlowStep.DOCUMENT;
        }
        if (i == 2 || i == 3) {
            return AnalyticsFlowStep.FACE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRequiredPermissions(String[] permissions) {
        ArrayList arrayList = new ArrayList(permissions.length);
        for (String str : permissions) {
            arrayList.add(Intrinsics.f(str, "android.permission.CAMERA") ? "camera" : Intrinsics.f(str, "android.permission.RECORD_AUDIO") ? "microphone" : "unknown_hardware");
        }
        return d0.k0(arrayList, "|", null, null, 0, null, 62);
    }
}
