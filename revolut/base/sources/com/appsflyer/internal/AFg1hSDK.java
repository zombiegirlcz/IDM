package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1hSDK extends AFf1xSDK<Void> {
    private final Throwable AFLogger;
    private final AFd1pSDK d;
    private final AFe1jSDK<String> e;

    public AFg1hSDK(AFf1fSDK aFf1fSDK, AFd1pSDK aFd1pSDK) {
        super(AFf1ySDK.GCDSDK, new AFf1ySDK[]{AFf1ySDK.RC_CDN}, "GCD-CHECK");
        this.AFLogger = aFf1fSDK.d();
        this.e = ((AFf1qSDK) aFf1fSDK).d;
        this.d = aFd1pSDK;
    }

    private Map<String, Object> e() {
        String strAFKeystoreWrapper = this.d.AFKeystoreWrapper("attributionId", (String) null);
        if (strAFKeystoreWrapper == null) {
            return null;
        }
        try {
            new AFe1lSDK();
            return AFe1lSDK.valueOf(strAFKeystoreWrapper);
        } catch (JSONException e) {
            StringBuilder sb6 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb6.append(e.getMessage());
            AFLogger.afErrorLog(sb6.toString(), e);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    @NonNull
    public final AFe1fSDK AFInAppEventParameterName() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.d.valueOf("appsFlyerCount", 0))));
        long jAFInAppEventParameterName = this.d.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", 0L);
        if (jAFInAppEventParameterName != 0 && System.currentTimeMillis() - jAFInAppEventParameterName > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.d.AFKeystoreWrapper("sixtyDayConversionData", true);
            this.d.AFInAppEventParameterName("attributionId", (String) null);
            this.d.values("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapE = e();
        if (mapE != null) {
            try {
                if (!mapE.containsKey("is_first_launch")) {
                    mapE.put("is_first_launch", Boolean.FALSE);
                }
                AFg1gSDK.AFInAppEventParameterName(mapE);
            } catch (Exception e) {
                StringBuilder sb6 = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb6.append(e.getLocalizedMessage());
                AFLogger.afErrorLog(sb6.toString(), e);
            }
            return AFe1fSDK.SUCCESS;
        }
        try {
        } catch (Exception e2) {
            StringBuilder sb9 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb9.append(e2.getLocalizedMessage());
            AFLogger.afErrorLog(sb9.toString(), e2);
        }
        if (this.AFLogger != null) {
            StringBuilder sb10 = new StringBuilder("Launch exception: ");
            sb10.append(this.AFLogger.getMessage());
            AFg1gSDK.values(sb10.toString());
            return AFe1fSDK.SUCCESS;
        }
        AFe1jSDK<String> aFe1jSDK = this.e;
        if (aFe1jSDK != null && !aFe1jSDK.isSuccessful()) {
            StringBuilder sb11 = new StringBuilder("Launch status code: ");
            sb11.append(this.e.getStatusCode());
            AFg1gSDK.values(sb11.toString());
            return AFe1fSDK.SUCCESS;
        }
        return AFe1fSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final long valueOf() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        return false;
    }
}
