package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFb1mSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFd1sSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class PurchaseHandler {

    @NonNull
    private final AFd1sSDK AFInAppEventType;

    @NonNull
    public final AFd1fSDK AFKeystoreWrapper;

    @NonNull
    public final AFe1aSDK valueOf;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th10);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFd1fSDK aFd1fSDK) {
        this.AFKeystoreWrapper = aFd1fSDK;
        this.AFInAppEventType = aFd1fSDK.valueOf();
        this.valueOf = aFd1fSDK.w();
    }

    public final boolean AFInAppEventType(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean zValueOf = AFb1mSDK.valueOf(map, strArr, this.AFInAppEventType);
        if (!zValueOf && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return zValueOf;
    }
}
