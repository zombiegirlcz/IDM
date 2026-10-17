package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1fSDK {
    @NonNull
    ScheduledExecutorService AFInAppEventParameterName();

    @NonNull
    AFd1pSDK AFInAppEventType();

    @NonNull
    ExecutorService AFKeystoreWrapper();

    @NonNull
    AFg1mSDK AFLogger();

    @NonNull
    AFh1ySDK AFLogger$LogLevel();

    @NonNull
    AFi1vSDK AFPurchaseDetails();

    @NonNull
    AFc1tSDK afDebugLog();

    @NonNull
    AFc1fSDK afErrorLog();

    @NonNull
    AFd1uSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFd1nSDK afInfoLog();

    @NonNull
    AFi1rSDK afLogForce();

    @NonNull
    AFe1bSDK afRDLog();

    @NonNull
    AFi1pSDK afVerboseLog();

    @NonNull
    AFb1tSDK afWarnLog();

    @NonNull
    PurchaseHandler d();

    @NonNull
    AFg1ySDK e();

    @NonNull
    AFi1cSDK force();

    @NonNull
    AFg1uSDK getCurrency();

    @NonNull
    AFd1oSDK getLevel();

    @NonNull
    AFd1aSDK getPrice();

    @NonNull
    AFc1pSDK getPurchaseToken();

    @NonNull
    AFb1aSDK i();

    @NonNull
    AFh1wSDK registerClient();

    @NonNull
    AFj1zSDK unregisterClient();

    @NonNull
    AFg1wSDK v();

    @NonNull
    AFd1sSDK valueOf();

    @NonNull
    AFe1rSDK values();

    @NonNull
    AFe1aSDK w();
}
