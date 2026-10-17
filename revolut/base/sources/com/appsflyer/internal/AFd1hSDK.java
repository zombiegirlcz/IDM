package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1hSDK {
    String AFInAppEventParameterName(@NotNull Throwable th10, @NotNull String str);

    @NotNull
    List<AFd1jSDK> AFInAppEventType();

    boolean AFKeystoreWrapper();

    boolean AFKeystoreWrapper(@NotNull String... strArr);

    int valueOf();

    void valueOf(int i, int i2);
}
