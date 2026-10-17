package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass4;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1ySDK implements AFe1eSDK {
    private final Object AFInAppEventParameterName = new Object();
    public final AFg1sSDK AFInAppEventType;
    private final AFg1wSDK AFKeystoreWrapper;
    private AFg1zSDK AFLogger;
    private final AFg1tSDK d;
    private final AFe1rSDK e;
    private AFi1zSDK registerClient;
    private final AFe1aSDK unregisterClient;
    private final AFg1xSDK valueOf;
    private final AFd1sSDK values;

    public AFg1ySDK(AFg1xSDK aFg1xSDK, AFd1sSDK aFd1sSDK, AFg1wSDK aFg1wSDK, AFg1sSDK aFg1sSDK, AFe1rSDK aFe1rSDK, AFg1tSDK aFg1tSDK, AFe1aSDK aFe1aSDK) {
        this.valueOf = aFg1xSDK;
        this.values = aFd1sSDK;
        this.AFKeystoreWrapper = aFg1wSDK;
        this.AFInAppEventType = aFg1sSDK;
        this.e = aFe1rSDK;
        this.d = aFg1tSDK;
        this.unregisterClient = aFe1aSDK;
        aFe1aSDK.values.add(this);
    }

    public final AFi1zSDK AFInAppEventParameterName() {
        AFi1zSDK aFi1zSDK;
        synchronized (this.AFInAppEventParameterName) {
            aFi1zSDK = this.registerClient;
            this.registerClient = null;
        }
        return aFi1zSDK;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final void AFKeystoreWrapper(AFf1xSDK<?> aFf1xSDK) {
    }

    public final void values(AFf1aSDK aFf1aSDK) {
        AFf1eSDK aFf1eSDK = new AFf1eSDK(this.valueOf, this.values, this.AFKeystoreWrapper, this.AFInAppEventType, this.e, this.d, "v1", aFf1aSDK);
        AFe1aSDK aFe1aSDK = this.unregisterClient;
        aFe1aSDK.AFInAppEventParameterName.execute(aFe1aSDK.new AnonymousClass4(aFf1eSDK));
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final void AFKeystoreWrapper(AFf1xSDK<?> aFf1xSDK, AFe1fSDK aFe1fSDK) {
        if (aFf1xSDK instanceof AFf1eSDK) {
            AFf1eSDK aFf1eSDK = (AFf1eSDK) aFf1xSDK;
            AFg1zSDK aFg1zSDK = aFf1eSDK.registerClient;
            if (aFg1zSDK == null) {
                AFLogger.INSTANCE.w(AFg1bSDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFg1zSDK = AFg1zSDK.FAILURE;
            }
            if (aFg1zSDK != AFg1zSDK.USE_CACHED) {
                AFi1zSDK aFi1zSDK = aFf1eSDK.unregisterClient;
                synchronized (this.AFInAppEventParameterName) {
                    this.registerClient = aFi1zSDK;
                }
            }
            values(aFg1zSDK, aFf1eSDK.d);
        }
    }

    private void values(@NonNull AFg1zSDK aFg1zSDK, AFf1aSDK aFf1aSDK) {
        synchronized (this.AFInAppEventParameterName) {
            this.AFLogger = aFg1zSDK;
        }
        if (aFf1aSDK != null) {
            aFf1aSDK.onRemoteConfigUpdateFinished(aFg1zSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final void values(AFf1xSDK<?> aFf1xSDK) {
        if (aFf1xSDK instanceof AFf1eSDK) {
            AFf1eSDK aFf1eSDK = (AFf1eSDK) aFf1xSDK;
            synchronized (this.AFInAppEventParameterName) {
                this.registerClient = null;
            }
            values(AFg1zSDK.FAILURE, aFf1eSDK.d);
        }
    }
}
