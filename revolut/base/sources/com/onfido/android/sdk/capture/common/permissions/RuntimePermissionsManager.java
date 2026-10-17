package com.onfido.android.sdk.capture.common.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.CaptureType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001*B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0012J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0017J#\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\t\u001a\u00020\nH\u0017¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0012J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0012J-\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0010¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0010¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020(H\u0010¢\u0006\u0002\b)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "", "context", "Landroid/content/Context;", "sharedPreferencesDataSource", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "(Landroid/content/Context;Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;)V", "arePermissionsRevoked", "", "activity", "Landroid/app/Activity;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "getPermissionStatus", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager$PermissionStatus;", "permission", "", "getPermissionsForCaptureType", "", "getPermissionsStatus", "Lcom/onfido/android/sdk/capture/common/permissions/PermissionRequestStatus;", "permissions", "", "([Ljava/lang/String;Landroid/app/Activity;)Lcom/onfido/android/sdk/capture/common/permissions/PermissionRequestStatus;", "hasPermission", "hasPermissionsForCaptureType", "isPermanentlyDenied", "isTemporarilyDenied", "requestPermissions", "", "requestCode", "", "requestPermissions$onfido_capture_sdk_core_release", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "requestPermissionsFromFragment", "fragment", "Landroidx/fragment/app/Fragment;", "requestPermissionsFromFragment$onfido_capture_sdk_core_release", "werePermissionsGranted", "grantResults", "", "werePermissionsGranted$onfido_capture_sdk_core_release", "PermissionStatus", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class RuntimePermissionsManager {

    @NotNull
    private final Context context;

    @NotNull
    private final SharedPreferencesDataSource sharedPreferencesDataSource;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager$PermissionStatus;", "", "alreadyRequested", "", "shouldAsk", "(ZZ)V", "getAlreadyRequested", "()Z", "getShouldAsk", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PermissionStatus {
        private final boolean alreadyRequested;
        private final boolean shouldAsk;

        public PermissionStatus(boolean z, boolean z3) {
            this.alreadyRequested = z;
            this.shouldAsk = z3;
        }

        public static /* synthetic */ PermissionStatus copy$default(PermissionStatus permissionStatus, boolean z, boolean z3, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = permissionStatus.alreadyRequested;
            }
            if ((i & 2) != 0) {
                z3 = permissionStatus.shouldAsk;
            }
            return permissionStatus.copy(z, z3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getAlreadyRequested() {
            return this.alreadyRequested;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShouldAsk() {
            return this.shouldAsk;
        }

        @NotNull
        public final PermissionStatus copy(boolean alreadyRequested, boolean shouldAsk) {
            return new PermissionStatus(alreadyRequested, shouldAsk);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PermissionStatus)) {
                return false;
            }
            PermissionStatus permissionStatus = (PermissionStatus) other;
            return this.alreadyRequested == permissionStatus.alreadyRequested && this.shouldAsk == permissionStatus.shouldAsk;
        }

        public final boolean getAlreadyRequested() {
            return this.alreadyRequested;
        }

        public final boolean getShouldAsk() {
            return this.shouldAsk;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldAsk) + (Boolean.hashCode(this.alreadyRequested) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("PermissionStatus(alreadyRequested=");
            sb6.append(this.alreadyRequested);
            sb6.append(", shouldAsk=");
            return j6.a.x(sb6, this.shouldAsk, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public RuntimePermissionsManager(@ApplicationContext @NotNull Context context, @NotNull SharedPreferencesDataSource sharedPreferencesDataSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesDataSource, "sharedPreferencesDataSource");
        this.context = context;
        this.sharedPreferencesDataSource = sharedPreferencesDataSource;
    }

    private PermissionStatus getPermissionStatus(String permission, Activity activity) {
        return new PermissionStatus(this.sharedPreferencesDataSource.hasRequestedPermission$onfido_capture_sdk_core_release(permission), ActivityCompat.shouldShowRequestPermissionRationale(activity, permission));
    }

    private boolean isPermanentlyDenied(String permission, Activity activity) {
        PermissionStatus permissionStatus = getPermissionStatus(permission, activity);
        return permissionStatus.getAlreadyRequested() && permissionStatus.getShouldAsk();
    }

    private boolean isTemporarilyDenied(String permission, Activity activity) {
        PermissionStatus permissionStatus = getPermissionStatus(permission, activity);
        return permissionStatus.getAlreadyRequested() && !permissionStatus.getShouldAsk();
    }

    @InternalOnfidoApi
    public boolean arePermissionsRevoked(@NotNull Activity activity, @NotNull CaptureType captureType) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        List<String> permissionsForCaptureType = getPermissionsForCaptureType(captureType);
        if ((permissionsForCaptureType instanceof Collection) && permissionsForCaptureType.isEmpty()) {
            return false;
        }
        for (String str : permissionsForCaptureType) {
            if (!hasPermission(str) && ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                return true;
            }
        }
        return false;
    }

    @InternalOnfidoApi
    @NotNull
    public List<String> getPermissionsForCaptureType(@NotNull CaptureType captureType) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        return captureType == CaptureType.VIDEO ? v.k("android.permission.CAMERA", "android.permission.RECORD_AUDIO") : u.c("android.permission.CAMERA");
    }

    @InternalOnfidoApi
    @NotNull
    public PermissionRequestStatus getPermissionsStatus(@NotNull String[] permissions, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(activity, "activity");
        for (String str : permissions) {
            if (isPermanentlyDenied(str, activity)) {
                return PermissionRequestStatus.PERMANENTLY_DENIED;
            }
        }
        for (String str2 : permissions) {
            if (isTemporarilyDenied(str2, activity)) {
                return PermissionRequestStatus.TEMPORARILY_DENIED;
            }
        }
        return PermissionRequestStatus.FIRST_REQUEST;
    }

    @InternalOnfidoApi
    public boolean hasPermission(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(this.context, permission) == 0;
    }

    @InternalOnfidoApi
    public boolean hasPermissionsForCaptureType(@NotNull CaptureType captureType) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        List<String> permissionsForCaptureType = getPermissionsForCaptureType(captureType);
        if ((permissionsForCaptureType instanceof Collection) && permissionsForCaptureType.isEmpty()) {
            return true;
        }
        Iterator<T> it8 = permissionsForCaptureType.iterator();
        while (it8.hasNext()) {
            if (!hasPermission((String) it8.next())) {
                return false;
            }
        }
        return true;
    }

    public void requestPermissions$onfido_capture_sdk_core_release(@NotNull Activity activity, @NotNull String[] permissions, int requestCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        for (String str : permissions) {
            this.sharedPreferencesDataSource.setHasRequestedPermission$onfido_capture_sdk_core_release(str);
        }
        ActivityCompat.requestPermissions(activity, permissions, requestCode);
    }

    public void requestPermissionsFromFragment$onfido_capture_sdk_core_release(@NotNull Fragment fragment, @NotNull List<String> permissions, int requestCode) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Iterator<T> it8 = permissions.iterator();
        while (it8.hasNext()) {
            this.sharedPreferencesDataSource.setHasRequestedPermission$onfido_capture_sdk_core_release((String) it8.next());
        }
        fragment.requestPermissions((String[]) permissions.toArray(new String[0]), requestCode);
    }

    public boolean werePermissionsGranted$onfido_capture_sdk_core_release(@NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        for (int i : grantResults) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
