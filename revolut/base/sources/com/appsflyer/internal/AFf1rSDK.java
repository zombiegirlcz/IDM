package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class AFf1rSDK extends AFf1sSDK {
    public AFf1rSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1fSDK aFd1fSDK) {
        super(AFf1ySDK.ARS_VALIDATE, new AFf1ySDK[]{AFf1ySDK.RC_CDN, AFf1ySDK.FETCH_ADVERTISING_ID}, aFd1fSDK, map, purchaseValidationCallback);
        this.valueOf.add(AFf1ySDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final AFe1uSDK<String> values(@NonNull Map<String, Object> map, @NonNull String str, String str2) {
        return this.e.values(map, str, str2);
    }

    @Override // com.appsflyer.internal.AFf1sSDK, com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        ResponseNetwork responseNetwork = ((AFf1qSDK) this).d;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.values();
        }
        return true;
    }
}
