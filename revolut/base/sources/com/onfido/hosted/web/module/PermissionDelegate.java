package com.onfido.hosted.web.module;

import com.onfido.android.sdk.capture.common.permissions.PermissionResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/onfido/hosted/web/module/PermissionDelegate;", "", "", "", "permissions", "", "requestPermission", "([Ljava/lang/String;)V", "Lkotlin/Function1;", "Lcom/onfido/android/sdk/capture/common/permissions/PermissionResult;", "callback", "registerForResult", "(Lkotlin/jvm/functions/Function1;)V", "permission", "", "hasPermission", "(Ljava/lang/String;)Z", "registerForPermission", "([Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PermissionDelegate {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void registerForPermission(@NotNull PermissionDelegate permissionDelegate, @NotNull String[] permissions, @NotNull Function1<? super PermissionResult, Unit> callback) {
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(callback, "callback");
            permissionDelegate.registerForResult(callback);
            permissionDelegate.requestPermission(permissions);
        }
    }

    boolean hasPermission(@NotNull String permission);

    void registerForPermission(@NotNull String[] permissions, @NotNull Function1<? super PermissionResult, Unit> callback);

    void registerForResult(@NotNull Function1<? super PermissionResult, Unit> callback);

    void requestPermission(@NotNull String[] permissions);
}
