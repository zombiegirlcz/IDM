package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1uSDK {
    private final boolean AFInAppEventParameterName;
    public final String AFInAppEventType;

    @NotNull
    public final String AFKeystoreWrapper;
    public final String values;

    public AFi1uSDK(@NotNull String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper = str;
        this.values = str2;
        this.AFInAppEventType = str3;
        this.AFInAppEventParameterName = z;
    }

    public final boolean valueOf() {
        return this.AFInAppEventParameterName;
    }
}
