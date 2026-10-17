package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1eSDK extends AFf1qSDK<Map<String, Object>> {
    private static final List<String> AFLogger = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFd1sSDK afInfoLog;
    private String afWarnLog;
    private final AFe1rSDK force;
    private final AFh1wSDK i;
    private Map<String, Object> v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AFd1pSDK f26033w;

    public AFg1eSDK(@NonNull AFd1fSDK aFd1fSDK) {
        super(AFf1ySDK.GCDSDK, new AFf1ySDK[]{AFf1ySDK.RC_CDN}, aFd1fSDK, "GCD-FETCH");
        this.force = aFd1fSDK.values();
        this.f26033w = aFd1fSDK.AFInAppEventType();
        this.i = aFd1fSDK.registerClient();
        this.afInfoLog = aFd1fSDK.valueOf();
        this.valueOf.add(AFf1ySDK.CONVERSION);
        this.valueOf.add(AFf1ySDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    @NonNull
    public final AFe1fSDK AFInAppEventParameterName() throws Exception {
        AFe1fSDK aFe1fSDKAFInAppEventParameterName;
        AFe1fSDK aFe1fSDK;
        if (((AFf1qSDK) this).unregisterClient.valueOf()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.afWarnLog = "'isStopTracking' enabled";
            throw new AFf1vSDK();
        }
        AFe1fSDK aFe1fSDK2 = AFe1fSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z3 = i >= 2;
            this.i.force = System.currentTimeMillis();
            try {
                try {
                    aFe1fSDKAFInAppEventParameterName = super.AFInAppEventParameterName();
                    ResponseNetwork responseNetwork = ((AFf1qSDK) this).d;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z = false;
                        }
                        if (responseNetwork.isSuccessful() || statusCode == 404) {
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.f26033w.values("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey("af_channel")) {
                                    StringBuilder sb6 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb6.append(map.get("af_channel"));
                                    AFLogger.afDebugLog(sb6.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.f26033w.AFInAppEventParameterName("attributionId", new JSONObject(map).toString());
                            if (!this.f26033w.AFKeystoreWrapper("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.v = map;
                            aFe1fSDK = AFe1fSDK.SUCCESS;
                        } else {
                            if (!z3) {
                                if (!z) {
                                }
                            }
                            this.afWarnLog = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1fSDK = AFe1fSDK.FAILURE;
                        }
                        return aFe1fSDK;
                    }
                } catch (AFf1zSDK e) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.afWarnLog = "AppsFlyer dev key is missing";
                    throw e;
                } catch (Exception e2) {
                    StringBuilder sb9 = new StringBuilder("[GCD] Error: ");
                    sb9.append(e2.getMessage());
                    AFLogger.afErrorLog(sb9.toString(), e2, false, false);
                    aFe1fSDKAFInAppEventParameterName = AFe1fSDK.FAILURE;
                    if (z3) {
                        this.afWarnLog = e2.getMessage();
                        throw e2;
                    }
                }
                aFe1fSDK2 = aFe1fSDKAFInAppEventParameterName;
                i++;
            } finally {
                this.i.values(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1fSDK2;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        Map<String, Object> map = this.v;
        String str = this.afWarnLog;
        if (map != null) {
            AFg1gSDK.AFInAppEventParameterName(map);
        } else if (str == null || str.isEmpty()) {
            AFg1gSDK.values("Unknown error");
        } else {
            AFg1gSDK.values(str);
        }
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AFe1uSDK<Map<String, Object>> AFKeystoreWrapper(@NonNull String str) {
        String strConcat;
        String strAFInAppEventType = AFb1rSDK.AFInAppEventType(this.f26033w, this.afInfoLog.AFLogger());
        if (strAFInAppEventType == null || strAFInAppEventType.trim().isEmpty()) {
            strConcat = "";
        } else if (AFLogger.contains(strAFInAppEventType.toLowerCase(Locale.getDefault()))) {
            AFLogger.afWarnLog("[GCD] AF detected using redundant Google-Play channel for attribution - " + strAFInAppEventType + ". Using without channel postfix.");
            strConcat = "";
        } else {
            strConcat = "-".concat(strAFInAppEventType);
        }
        AFe1uSDK<Map<String, Object>> aFe1uSDKValues = this.force.values(strConcat, str);
        StringBuilder sb6 = new StringBuilder("[GCD-B01] URL: ");
        sb6.append(aFe1uSDKValues.AFKeystoreWrapper.AFKeystoreWrapper);
        AFb1kSDK.AFInAppEventType(sb6.toString());
        return aFe1uSDKValues;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final boolean force() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        return false;
    }
}
