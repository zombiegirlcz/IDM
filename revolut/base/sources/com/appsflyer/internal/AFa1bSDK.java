package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass4;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class AFa1bSDK implements Runnable {
    final String AFInAppEventParameterName;
    private final String AFInAppEventType;
    final String AFKeystoreWrapper;
    private final String AFLogger;
    private final Map<String, String> d;
    private final String e;
    private final AFd1sSDK registerClient;
    final String valueOf;
    private final WeakReference<Context> values;

    public AFa1bSDK(Context context, String str, AFd1sSDK aFd1sSDK, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.values = new WeakReference<>(context);
        this.AFInAppEventType = str;
        this.e = str2;
        this.valueOf = str4;
        this.AFKeystoreWrapper = str5;
        this.AFInAppEventParameterName = str6;
        this.d = map;
        this.AFLogger = str3;
        this.registerClient = aFd1sSDK;
    }

    private static AFf1gSDK AFInAppEventParameterName(Context context, @NonNull AFh1jSDK aFh1jSDK) {
        AFb1rSDK.AFInAppEventParameterName().valueOf(context);
        AFd1fSDK aFd1fSDKAFInAppEventType = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType();
        aFh1jSDK.AFKeystoreWrapper(aFd1fSDKAFInAppEventType.valueOf().values.valueOf("appsFlyerCount", 0));
        AFf1gSDK aFf1gSDK = new AFf1gSDK(aFh1jSDK, aFd1fSDKAFInAppEventType);
        AFe1aSDK aFe1aSDKW = aFd1fSDKAFInAppEventType.w();
        aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(aFf1gSDK));
        return aFf1gSDK;
    }

    public static void AFInAppEventType(boolean z, String str, String str2, String str3, String str4) {
        if (AFb1rSDK.AFKeystoreWrapper != null) {
            StringBuilder sbM = v0.a.m("Validate callback parameters: ", str, " ", str2, " ");
            sbM.append(str3);
            AFLogger.afDebugLog(sbM.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1rSDK.AFKeystoreWrapper.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1rSDK.AFKeystoreWrapper;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFInAppEventType;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.values.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.e);
            map.put("sig-data", this.valueOf);
            map.put("signature", this.AFLogger);
            Object map2 = new HashMap(map);
            Object obj2 = this.d;
            String strAFKeystoreWrapper = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().AFInAppEventType().AFKeystoreWrapper("referrer", "");
            AFh1iSDK aFh1iSDK = new AFh1iSDK();
            aFh1iSDK.d = strAFKeystoreWrapper;
            AFb1rSDK aFb1rSDKAFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName();
            Map<String, Object> mapValues = aFb1rSDKAFInAppEventParameterName.values(aFh1iSDK);
            mapValues.put("price", this.AFKeystoreWrapper);
            mapValues.put("currency", this.AFInAppEventParameterName);
            mapValues.put("receipt_data", map2);
            if (obj2 != null) {
                mapValues.put("extra_prms", obj2);
            }
            mapValues.putAll(aFb1rSDKAFInAppEventParameterName.AFInAppEventType().v().AFInAppEventParameterName());
            aFh1iSDK.AFInAppEventType((Map<String, ?>) mapValues);
            aFh1iSDK.AFInAppEventType(new AFj1uSDK(this.registerClient).AFKeystoreWrapper(aFh1iSDK));
            AFInAppEventParameterName(context, aFh1iSDK);
            map.put("dev_key", this.AFInAppEventType);
            map.put("app_id", context.getPackageName());
            map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1tSDK aFh1tSDK = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().valueOf().AFInAppEventType.AFLogger;
            AFa1cSDK aFa1cSDK = aFh1tSDK != null ? new AFa1cSDK(aFh1tSDK.AFInAppEventType, aFh1tSDK.unregisterClient) : null;
            String str2 = aFa1cSDK != null ? aFa1cSDK.valueOf : null;
            if (str2 != null) {
                map.put("advertiserId", str2);
            }
            AFh1fSDK aFh1fSDK = (AFh1fSDK) new AFh1fSDK().AFInAppEventType(map);
            aFh1fSDK.AFInAppEventType(new AFj1uSDK(this.registerClient).AFKeystoreWrapper(aFh1fSDK));
            final AFf1gSDK aFf1gSDKAFInAppEventParameterName = AFInAppEventParameterName(context, aFh1fSDK);
            aFh1fSDK.AFInAppEventParameterName = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1bSDK.3
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, @NonNull String str3) {
                    ResponseNetwork responseNetwork;
                    if (i == 50 && (responseNetwork = ((AFf1qSDK) aFf1gSDKAFInAppEventParameterName).d) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                    AFa1bSDK.AFInAppEventType(false, aFa1bSDK.valueOf, aFa1bSDK.AFKeystoreWrapper, aFa1bSDK.AFInAppEventParameterName, str3);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFf1qSDK) aFf1gSDKAFInAppEventParameterName).d.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        boolean zOptBoolean = jSONObject.optBoolean("result");
                        AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                        AFa1bSDK.AFInAppEventType(zOptBoolean, aFa1bSDK.valueOf, aFa1bSDK.AFKeystoreWrapper, aFa1bSDK.AFInAppEventParameterName, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFa1bSDK aFa1bSDK2 = AFa1bSDK.this;
                        AFa1bSDK.AFInAppEventType(false, aFa1bSDK2.valueOf, aFa1bSDK2.AFKeystoreWrapper, aFa1bSDK2.AFInAppEventParameterName, e.getMessage());
                    }
                }
            };
        } catch (Throwable th10) {
            if (AFb1rSDK.AFKeystoreWrapper != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th10);
                AFInAppEventType(false, this.valueOf, this.AFKeystoreWrapper, this.AFInAppEventParameterName, th10.getMessage());
            }
            AFLogger.afErrorLog(th10.getMessage(), th10);
        }
    }
}
