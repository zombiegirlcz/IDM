package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1bSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1cSDK {
    public final AFd1fSDK AFInAppEventType;
    public final List<AFi1bSDK> AFKeystoreWrapper = new ArrayList();

    public AFi1cSDK(AFd1fSDK aFd1fSDK) {
        this.AFInAppEventType = aFd1fSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventType() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient(Runnable runnable) {
        AFi1iSDK aFi1iSDK = new AFi1iSDK(this.AFInAppEventType.valueOf(), this.AFInAppEventType.AFKeystoreWrapper(), AFi1fSDK.INSTAGRAM, runnable, new l(this, runnable, 2));
        AFInAppEventParameterName(aFi1iSDK);
        aFi1iSDK.values(this.AFInAppEventType.afInfoLog().AFKeystoreWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(Runnable runnable) {
        AFj1qSDK.AFInAppEventParameterName(this.AFInAppEventType.AFInAppEventParameterName(), new l(this, runnable, 3), 0L, TimeUnit.MILLISECONDS);
    }

    public final synchronized void AFInAppEventParameterName(AFi1bSDK aFi1bSDK) {
        this.AFKeystoreWrapper.add(aFi1bSDK);
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType.valueOf().values("AF_PREINSTALL_DISABLED");
    }

    @NonNull
    public final synchronized AFi1bSDK[] valueOf() {
        return (AFi1bSDK[]) this.AFKeystoreWrapper.toArray(new AFi1bSDK[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(Runnable runnable) {
        AFi1iSDK aFi1iSDK = new AFi1iSDK(this.AFInAppEventType.valueOf(), this.AFInAppEventType.AFKeystoreWrapper(), AFi1fSDK.FACEBOOK_LITE, runnable, new m());
        AFInAppEventParameterName(aFi1iSDK);
        aFi1iSDK.values(this.AFInAppEventType.afInfoLog().AFKeystoreWrapper);
    }

    public final void AFInAppEventType(Runnable runnable) {
        AFInAppEventParameterName(new AFi1iSDK(this.AFInAppEventType.valueOf(), this.AFInAppEventType.AFKeystoreWrapper(), AFi1fSDK.FACEBOOK, runnable, new l(this, runnable, 1)));
    }

    public final AFi1lSDK valueOf(Runnable runnable) {
        return new AFi1lSDK(new l(this, runnable, 0), this.AFInAppEventType.AFKeystoreWrapper(), this.AFInAppEventType.valueOf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(Runnable runnable) {
        try {
            if (AFInAppEventType(new AFh1oSDK())) {
                runnable.run();
            }
        } catch (Throwable th10) {
            AFLogger.afErrorLog(th10.getMessage(), th10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(AFi1lSDK aFi1lSDK, Runnable runnable) {
        AFd1pSDK aFd1pSDKAFInAppEventType = this.AFInAppEventType.AFInAppEventType();
        int iValueOf = this.AFInAppEventType.valueOf().values.valueOf("appsFlyerCount", 0);
        boolean zAFKeystoreWrapper = aFd1pSDKAFInAppEventType.AFKeystoreWrapper("newGPReferrerSent");
        boolean z = aFi1lSDK.AFInAppEventType == AFi1bSDK.AFa1uSDK.NOT_STARTED;
        if (iValueOf == 1) {
            if (z || zAFKeystoreWrapper) {
                runnable.run();
            }
        }
    }

    public final boolean AFInAppEventType(AFa1pSDK aFa1pSDK) {
        int iValueOf = this.AFInAppEventType.valueOf().values.valueOf("appsFlyerCount", 0);
        return (!this.AFInAppEventType.AFInAppEventType().AFKeystoreWrapper("newGPReferrerSent") && iValueOf == 1) || (iValueOf == 1 && !(aFa1pSDK instanceof AFh1oSDK));
    }

    public final Runnable AFInAppEventType(AFi1lSDK aFi1lSDK, Runnable runnable) {
        return new ag.n(this, 1, aFi1lSDK, runnable);
    }
}
