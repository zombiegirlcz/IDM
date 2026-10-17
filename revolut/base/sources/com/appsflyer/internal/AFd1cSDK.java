package com.appsflyer.internal;

import grl.b4;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AFd1cSDK implements AFd1eSDK {

    @NotNull
    private final AFd1hSDK valueOf;

    public AFd1cSDK(@NotNull AFd1hSDK aFd1hSDK) {
        Intrinsics.checkNotNullParameter(aFd1hSDK, "");
        this.valueOf = aFd1hSDK;
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void AFInAppEventType(@NotNull byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1dSDK(bArr, map, b4.EXPIRED_OR_INVALID_KEY_VALUE).values()) {
            this.valueOf.AFKeystoreWrapper();
        }
    }
}
