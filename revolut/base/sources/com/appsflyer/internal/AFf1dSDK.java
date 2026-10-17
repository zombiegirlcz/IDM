package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes16.dex */
public final class AFf1dSDK extends AFf1qSDK<String> {
    private final AFh1mSDK AFLogger;

    public AFf1dSDK(@NonNull AFh1mSDK aFh1mSDK, @NonNull AFd1fSDK aFd1fSDK) {
        AFf1ySDK aFf1ySDK = aFh1mSDK.force;
        AFf1ySDK aFf1ySDK2 = aFf1ySDK == null ? AFf1ySDK.CACHED_EVENT : aFf1ySDK;
        AFf1ySDK[] aFf1ySDKArr = {AFf1ySDK.RC_CDN};
        StringBuilder sb6 = new StringBuilder();
        sb6.append(aFh1mSDK.AFInAppEventType);
        sb6.append("-");
        sb6.append(valueOf(aFh1mSDK));
        super(aFf1ySDK2, aFf1ySDKArr, aFd1fSDK, sb6.toString(), aFh1mSDK.AFInAppEventType);
        this.AFLogger = aFh1mSDK;
    }

    private static String valueOf(AFh1mSDK aFh1mSDK) {
        try {
            return new URL(aFh1mSDK.unregisterClient).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AFe1uSDK<String> AFKeystoreWrapper(@NonNull String str) {
        String strEncodeToString = Base64.encodeToString(this.AFLogger.AFKeystoreWrapper(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        ((AFf1qSDK) this).registerClient.values(this.AFLogger.unregisterClient, strEncodeToString);
        return this.e.AFKeystoreWrapper(this.AFLogger);
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AppsFlyerRequestListener e() {
        return this.AFLogger.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final boolean force() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        ResponseNetwork responseNetwork;
        AFf1ySDK aFf1ySDK = this.AFLogger.force;
        if (aFf1ySDK == null) {
            aFf1ySDK = AFf1ySDK.CACHED_EVENT;
        }
        return (aFf1ySDK == AFf1ySDK.ARS_VALIDATE && (responseNetwork = ((AFf1qSDK) this).d) != null && responseNetwork.getStatusCode() == 424) || super.values();
    }
}
