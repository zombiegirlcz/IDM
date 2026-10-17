package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFf1qSDK<Result> extends AFf1xSDK<AFe1jSDK<Result>> {
    private AFb1tSDK AFLogger;
    public AFe1jSDK<Result> d;
    protected final AFe1rSDK e;
    private String force;
    protected final AFb1aSDK registerClient;
    public final AFg1wSDK unregisterClient;

    private AFf1qSDK(@NonNull AFf1ySDK aFf1ySDK, @NonNull AFf1ySDK[] aFf1ySDKArr, @NonNull AFe1rSDK aFe1rSDK, @NonNull AFg1wSDK aFg1wSDK, @NonNull AFb1aSDK aFb1aSDK, @NonNull AFb1tSDK aFb1tSDK, String str) {
        super(aFf1ySDK, aFf1ySDKArr, str);
        this.e = aFe1rSDK;
        this.unregisterClient = aFg1wSDK;
        this.registerClient = aFb1aSDK;
        this.AFLogger = aFb1tSDK;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    @NonNull
    public AFe1fSDK AFInAppEventParameterName() throws Exception {
        if (a_() && this.unregisterClient.valueOf()) {
            AppsFlyerRequestListener appsFlyerRequestListenerE = e();
            if (appsFlyerRequestListenerE != null) {
                appsFlyerRequestListenerE.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFf1vSDK();
        }
        String str = this.unregisterClient.AFLogger;
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener appsFlyerRequestListenerE2 = e();
            if (appsFlyerRequestListenerE2 != null) {
                appsFlyerRequestListenerE2.onError(41, "No dev key");
            }
            throw new AFf1zSDK();
        }
        AFe1uSDK<Result> aFe1uSDKAFKeystoreWrapper = AFKeystoreWrapper(str);
        if (aFe1uSDKAFKeystoreWrapper == null) {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
            return AFe1fSDK.FAILURE;
        }
        if (force()) {
            values(aFe1uSDKAFKeystoreWrapper.AFKeystoreWrapper);
        }
        AFe1jSDK<Result> aFe1jSDKAFKeystoreWrapper = aFe1uSDKAFKeystoreWrapper.AFKeystoreWrapper();
        this.d = aFe1jSDKAFKeystoreWrapper;
        this.registerClient.AFKeystoreWrapper(aFe1uSDKAFKeystoreWrapper.AFKeystoreWrapper.AFKeystoreWrapper, aFe1jSDKAFKeystoreWrapper.getStatusCode(), aFe1jSDKAFKeystoreWrapper.getBody().toString());
        AppsFlyerRequestListener appsFlyerRequestListenerE3 = e();
        if (appsFlyerRequestListenerE3 != null) {
            if (aFe1jSDKAFKeystoreWrapper.isSuccessful()) {
                appsFlyerRequestListenerE3.onSuccess();
            } else {
                StringBuilder sb6 = new StringBuilder("Status code failure ");
                sb6.append(aFe1jSDKAFKeystoreWrapper.getStatusCode());
                appsFlyerRequestListenerE3.onError(50, sb6.toString());
            }
        }
        return aFe1jSDKAFKeystoreWrapper.isSuccessful() ? AFe1fSDK.SUCCESS : AFe1fSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public void AFInAppEventType() {
        String str;
        if (this.values == AFe1fSDK.SUCCESS) {
            String str2 = this.force;
            if (str2 != null) {
                this.AFLogger.valueOf(str2);
                return;
            }
            return;
        }
        if (values() || (str = this.force) == null) {
            return;
        }
        this.AFLogger.valueOf(str);
    }

    public abstract AFe1uSDK<Result> AFKeystoreWrapper(@NonNull String str);

    @Override // com.appsflyer.internal.AFf1xSDK
    public final void AFKeystoreWrapper() {
        String str;
        super.AFKeystoreWrapper();
        if (!force() || (str = this.unregisterClient.AFLogger) == null || str.trim().isEmpty()) {
            return;
        }
        AFe1uSDK<Result> aFe1uSDKAFKeystoreWrapper = AFKeystoreWrapper(str);
        if (aFe1uSDKAFKeystoreWrapper != null) {
            values(aFe1uSDKAFKeystoreWrapper.AFKeystoreWrapper);
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
        }
    }

    public boolean a_() {
        return true;
    }

    public abstract AppsFlyerRequestListener e();

    public abstract boolean force();

    @Override // com.appsflyer.internal.AFf1xSDK
    public long valueOf() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public boolean values() {
        if (d() instanceof AFf1vSDK) {
            return false;
        }
        if (this.values == AFe1fSDK.TIMEOUT) {
            return true;
        }
        Throwable thD = d();
        return (thD instanceof IOException) && !(thD instanceof ParsingException);
    }

    public AFf1qSDK(@NonNull AFf1ySDK aFf1ySDK, @NonNull AFf1ySDK[] aFf1ySDKArr, @NonNull AFd1fSDK aFd1fSDK, String str) {
        this(aFf1ySDK, aFf1ySDKArr, aFd1fSDK.values(), aFd1fSDK.v(), aFd1fSDK.i(), aFd1fSDK.afWarnLog(), str);
    }

    private void values(AFe1hSDK aFe1hSDK) {
        String str = this.force;
        this.force = this.AFLogger.AFInAppEventType(new AFb1qSDK(aFe1hSDK.AFKeystoreWrapper, aFe1hSDK.values(), "6.14.2", this.AFKeystoreWrapper));
        if (str != null) {
            this.AFLogger.valueOf(str);
        }
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final void AFKeystoreWrapper(Throwable th10) {
        Throwable th11;
        boolean z = !(th10 instanceof HttpException);
        if (th10 instanceof AFf1vSDK) {
            th11 = th10;
            AFLogger.INSTANCE.e(AFg1bSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th11, true, false);
        } else {
            th11 = th10;
            AFLogger.INSTANCE.e(AFg1bSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th11)), th11, true, true, z);
        }
        AppsFlyerRequestListener appsFlyerRequestListenerE = e();
        if (appsFlyerRequestListenerE != null) {
            String message = th11.getMessage();
            if (message == null) {
                message = "";
            }
            appsFlyerRequestListenerE.onError(40, message);
        }
    }

    public AFf1qSDK(@NonNull AFf1ySDK aFf1ySDK, @NonNull AFf1ySDK[] aFf1ySDKArr, @NonNull AFd1fSDK aFd1fSDK, String str, String str2) {
        this(aFf1ySDK, aFf1ySDKArr, aFd1fSDK.values(), aFd1fSDK.v(), aFd1fSDK.i(), aFd1fSDK.afWarnLog(), str);
        this.force = str2;
    }
}
