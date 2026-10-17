package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFg1mSDK {
    void AFInAppEventParameterName(@NotNull AFa1pSDK aFa1pSDK);

    void AFInAppEventParameterName(@NotNull Map<String, Object> map);

    long AFInAppEventType();

    void AFInAppEventType(@NotNull AFa1pSDK aFa1pSDK);

    void AFKeystoreWrapper(@NotNull AFa1pSDK aFa1pSDK);

    void AFKeystoreWrapper(@NotNull Map<String, Object> map);

    void valueOf(@NotNull Map<String, Object> map, int i, int i2);

    Long values();

    void values(@NotNull AFa1pSDK aFa1pSDK);

    void values(@NotNull Map<String, Object> map);

    void values(@NotNull Map<String, Object> map, boolean z, @NotNull Function0<String> function0);
}
