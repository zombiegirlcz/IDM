package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1uSDK<ResponseBody> {
    private final ExecutorService AFInAppEventParameterName;
    private final AFe1iSDK<ResponseBody> AFInAppEventType;
    public final AFe1hSDK AFKeystoreWrapper;
    private final AFe1oSDK valueOf;
    private final AtomicBoolean values = new AtomicBoolean(false);

    public AFe1uSDK(AFe1hSDK aFe1hSDK, ExecutorService executorService, AFe1oSDK aFe1oSDK, AFe1iSDK<ResponseBody> aFe1iSDK) {
        this.AFKeystoreWrapper = aFe1hSDK;
        this.AFInAppEventParameterName = executorService;
        this.valueOf = aFe1oSDK;
        this.AFInAppEventType = aFe1iSDK;
    }

    public final AFe1jSDK<ResponseBody> AFKeystoreWrapper() throws Throwable {
        if (this.values.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        AFe1jSDK<String> aFe1jSDKValues = this.valueOf.values(this.AFKeystoreWrapper);
        try {
            return new AFe1jSDK<>(this.AFInAppEventType.AFKeystoreWrapper(aFe1jSDKValues.getBody()), aFe1jSDKValues.AFKeystoreWrapper, aFe1jSDKValues.values, aFe1jSDKValues.valueOf, aFe1jSDKValues.AFInAppEventParameterName);
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
            throw new ParsingException(e.getMessage(), e, aFe1jSDKValues);
        }
    }
}
