package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFb1aSDK {
    void AFInAppEventParameterName();

    void AFInAppEventParameterName(@NotNull String str, @NotNull String str2);

    void AFInAppEventParameterName(@NotNull String str, @NotNull String... strArr);

    boolean AFInAppEventType();

    void AFKeystoreWrapper();

    void AFKeystoreWrapper(@NotNull String str, int i, @NotNull String str2);

    void AFKeystoreWrapper(@NotNull Throwable th10);

    boolean e();

    void valueOf();

    void values();

    void values(String str, PackageManager packageManager);

    void values(@NotNull String str, @NotNull String str2);
}
