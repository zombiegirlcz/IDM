package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1vSDK extends AFg1cSDK {
    private final boolean AFInAppEventParameterName;

    @NotNull
    private final AFd1fSDK AFInAppEventType;

    public AFh1vSDK(@NotNull AFd1fSDK aFd1fSDK) {
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        this.AFInAppEventType = aFd1fSDK;
        this.AFInAppEventParameterName = true;
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void d(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.i().AFInAppEventParameterName("D", AFInAppEventParameterName(str, aFg1bSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th10, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th10, "");
        if (z6) {
            this.AFInAppEventType.i().AFInAppEventParameterName("E", AFInAppEventParameterName(str, aFg1bSDK));
        }
        if (z6) {
            this.AFInAppEventType.i().AFKeystoreWrapper(th10);
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void force(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AFInAppEventType.i().AFInAppEventParameterName("F", AFInAppEventParameterName(str, aFg1bSDK));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final boolean getShouldExtendMsg() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void i(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.i().AFInAppEventParameterName("I", AFInAppEventParameterName(str, aFg1bSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void v(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.i().AFInAppEventParameterName("V", AFInAppEventParameterName(str, aFg1bSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void w(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.i().AFInAppEventParameterName("W", AFInAppEventParameterName(str, aFg1bSDK));
        }
    }
}
