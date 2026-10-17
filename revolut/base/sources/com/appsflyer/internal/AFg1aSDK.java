package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AFg1aSDK extends AFg1cSDK {

    @NotNull
    private final AFd1fSDK AFInAppEventParameterName;

    public AFg1aSDK(@NotNull AFd1fSDK aFd1fSDK) {
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        this.AFInAppEventParameterName = aFd1fSDK;
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th10, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th10, "");
        if (z4) {
            if (d0.W(str)) {
                str = "missing label";
            }
            this.AFInAppEventParameterName.getPrice().AFInAppEventParameterName(th10, withTag$SDK_prodRelease(str, aFg1bSDK));
        }
    }
}
