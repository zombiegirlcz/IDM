package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1gSDK {
    public static void AFInAppEventParameterName(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            StringBuilder sb6 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb6.append(map.toString());
            AFLogger.afDebugLog(sb6.toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    public static void values(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }
}
