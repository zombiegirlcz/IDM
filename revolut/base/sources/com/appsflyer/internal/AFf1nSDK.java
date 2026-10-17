package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class AFf1nSDK extends AFf1sSDK {
    public AFf1nSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1fSDK aFd1fSDK) {
        super(AFf1ySDK.PURCHASE_VALIDATE, new AFf1ySDK[]{AFf1ySDK.RC_CDN, AFf1ySDK.FETCH_ADVERTISING_ID}, aFd1fSDK, map, purchaseValidationCallback);
        this.valueOf.add(AFf1ySDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final AFe1uSDK<String> values(@NonNull Map<String, Object> map, @NonNull String str, String str2) {
        return this.e.AFInAppEventType(map, str, str2);
    }
}
