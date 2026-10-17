package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1zSDK implements AFh1ySDK {
    private AFh1vSDK AFInAppEventParameterName;

    @NotNull
    private final AFd1fSDK AFInAppEventType;
    private AFg1dSDK AFKeystoreWrapper;
    private AFg1aSDK valueOf;

    public AFh1zSDK(@NotNull AFd1fSDK aFd1fSDK) {
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        this.AFInAppEventType = aFd1fSDK;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void AFInAppEventParameterName() {
        AFh1vSDK aFh1vSDK = this.AFInAppEventParameterName;
        if (aFh1vSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK.v$default(aFLogger, AFg1bSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1vSDK);
            this.AFInAppEventParameterName = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void AFInAppEventType() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.valueOf == null) {
            this.valueOf = new AFg1aSDK(this.AFInAppEventType);
        }
        AFg1aSDK aFg1aSDK = this.valueOf;
        Intrinsics.h(aFg1aSDK);
        aFLogger.registerClient(aFg1aSDK);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void AFKeystoreWrapper() {
        AFg1aSDK aFg1aSDK = this.valueOf;
        if (aFg1aSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK.v$default(aFLogger, AFg1bSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1aSDK);
            this.valueOf = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void AFLogger() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFKeystoreWrapper == null) {
            this.AFKeystoreWrapper = new AFg1dSDK();
        }
        AFg1dSDK aFg1dSDK = this.AFKeystoreWrapper;
        Intrinsics.h(aFg1dSDK);
        aFLogger.registerClient(aFg1dSDK);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void valueOf() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFInAppEventParameterName == null) {
            this.AFInAppEventParameterName = new AFh1vSDK(this.AFInAppEventType);
        }
        AFh1vSDK aFh1vSDK = this.AFInAppEventParameterName;
        Intrinsics.h(aFh1vSDK);
        aFLogger.registerClient(aFh1vSDK);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void values() {
        AFg1dSDK aFg1dSDK = this.AFKeystoreWrapper;
        if (aFg1dSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK.v$default(aFLogger, AFg1bSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1dSDK);
            this.AFKeystoreWrapper = null;
        }
    }
}
