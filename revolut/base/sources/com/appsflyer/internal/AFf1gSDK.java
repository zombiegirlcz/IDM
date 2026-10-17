package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.d0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AFf1gSDK extends AFf1qSDK<String> {
    private static final AFf1ySDK[] afErrorLog = {AFf1ySDK.DLSDK, AFf1ySDK.ONELINK, AFf1ySDK.REGISTER};
    public final AFa1pSDK AFLogger;
    private final AFd1nSDK afDebugLog;
    protected final AFd1pSDK afInfoLog;
    private final AFg1uSDK afVerboseLog;
    protected final AFg1mSDK force;
    private final AFg1ySDK i;

    @NonNull
    private final AFd1sSDK v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AFe1bSDK f26024w;

    public AFf1gSDK(@NonNull AFa1pSDK aFa1pSDK, @NonNull AFd1fSDK aFd1fSDK) {
        this(aFa1pSDK, aFd1fSDK, null);
    }

    @NonNull
    private static Map<String, Object> unregisterClient(AFa1pSDK aFa1pSDK) {
        Map<String, Object> map = (Map) aFa1pSDK.AFInAppEventType().get("meta");
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        aFa1pSDK.AFInAppEventType().put("meta", map2);
        return map2;
    }

    public void AFInAppEventParameterName(AFa1pSDK aFa1pSDK) {
        this.force.values(aFa1pSDK.AFInAppEventType());
    }

    public void AFInAppEventType(AFa1pSDK aFa1pSDK) {
        this.force.AFInAppEventParameterName(aFa1pSDK);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    @Override // com.appsflyer.internal.AFf1qSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFe1uSDK<java.lang.String> AFKeystoreWrapper(@androidx.annotation.NonNull java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1gSDK.AFKeystoreWrapper(java.lang.String):com.appsflyer.internal.AFe1uSDK");
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AppsFlyerRequestListener e() {
        return this.AFLogger.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public boolean force() {
        return true;
    }

    public void valueOf(AFa1pSDK aFa1pSDK) {
        this.force.AFKeystoreWrapper(aFa1pSDK);
    }

    public void values(AFa1pSDK aFa1pSDK) {
        this.force.values(aFa1pSDK);
    }

    public AFf1gSDK(@NonNull AFa1pSDK aFa1pSDK, @NonNull AFd1fSDK aFd1fSDK, String str) {
        super(aFa1pSDK.values(), new AFf1ySDK[]{AFf1ySDK.RC_CDN, AFf1ySDK.FETCH_ADVERTISING_ID}, aFd1fSDK, str);
        this.AFLogger = aFa1pSDK;
        this.f26024w = aFd1fSDK.afRDLog();
        this.afInfoLog = aFd1fSDK.AFInAppEventType();
        this.i = aFd1fSDK.e();
        this.afDebugLog = aFd1fSDK.afInfoLog();
        this.v = aFd1fSDK.valueOf();
        this.force = aFd1fSDK.AFLogger();
        this.afVerboseLog = aFd1fSDK.getCurrency();
        for (AFf1ySDK aFf1ySDK : afErrorLog) {
            if (this.AFKeystoreWrapper == aFf1ySDK) {
                return;
            }
        }
        int i = this.AFLogger.registerClient;
        AFf1ySDK aFf1ySDK2 = this.AFKeystoreWrapper;
        if (i > 0) {
            this.valueOf.add(AFf1ySDK.CONVERSION);
        } else {
            AFf1ySDK aFf1ySDK3 = AFf1ySDK.CONVERSION;
            if (aFf1ySDK2 != aFf1ySDK3) {
                this.AFInAppEventParameterName.add(aFf1ySDK3);
            }
        }
    }

    public void AFKeystoreWrapper(AFa1pSDK aFa1pSDK) {
        AFe1cSDK aFe1cSDK;
        try {
            try {
                AFInAppEventParameterName(aFa1pSDK);
                AFInAppEventType(aFa1pSDK);
                values(aFa1pSDK);
                valueOf(aFa1pSDK);
            } catch (Throwable th10) {
                AFLogger.afErrorLog("Error while collecting payload params", th10, true, false);
            }
            if (aFa1pSDK.registerClient()) {
                aFa1pSDK.AFInAppEventType(new AFd1mSDK(aFa1pSDK.AFInAppEventType(), ((AFf1qSDK) this).unregisterClient.valueOf.AFKeystoreWrapper));
                aFa1pSDK.AFInAppEventType((Map<String, ?>) ((AFf1qSDK) this).unregisterClient.AFInAppEventType(aFa1pSDK.AFInAppEventType()));
                if (this.v.values("com.appsflyer.security.enable")) {
                    try {
                        new AFb1sSDK(aFa1pSDK).afInfoLog();
                    } catch (Exception e) {
                        AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
                    }
                }
            }
            if (aFa1pSDK.e()) {
                aFa1pSDK.AFInAppEventType((Map<String, ?>) ((AFf1qSDK) this).unregisterClient.AFInAppEventParameterName());
            }
            Set<AFf1ySDK> set = this.AFInAppEventParameterName;
            boolean z = set.contains(AFf1ySDK.LAUNCH) || set.contains(AFf1ySDK.CONVERSION);
            if (unregisterClient() && z) {
                aFa1pSDK.AFKeystoreWrapper(this.afInfoLog.valueOf("appsFlyerCount", 0));
            }
            if (aFa1pSDK.AFLogger()) {
                Map<String, Object> mapUnregisterClient = unregisterClient(aFa1pSDK);
                AFe1bSDK aFe1bSDK = this.f26024w;
                String strAFInAppEventType = aFe1bSDK.AFInAppEventType();
                String strAFKeystoreWrapper = aFe1bSDK.AFKeystoreWrapper();
                if (AFe1bSDK.valueOf()) {
                    aFe1cSDK = AFe1cSDK.DEFAULT;
                } else {
                    aFe1cSDK = AFe1cSDK.API;
                }
                AFe1dSDK aFe1dSDK = new AFe1dSDK(strAFInAppEventType, strAFKeystoreWrapper, aFe1cSDK);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", aFe1dSDK.AFKeystoreWrapper);
                AFe1cSDK aFe1cSDK2 = aFe1dSDK.AFInAppEventType;
                if (aFe1cSDK2 != AFe1cSDK.DEFAULT) {
                    jSONObject.put("method", aFe1cSDK2.AFInAppEventParameterName);
                }
                String str = aFe1dSDK.valueOf;
                if (str != null && !d0.W(str)) {
                    jSONObject.put("prefix", aFe1dSDK.valueOf);
                }
                mapUnregisterClient.put("host", jSONObject);
            }
            if (this.v.values("AF_PREINSTALL_DISABLED")) {
                unregisterClient(aFa1pSDK).put("preinstall_disabled", Boolean.TRUE);
            }
            this.afVerboseLog.valueOf(aFa1pSDK.AFInAppEventType(), aFa1pSDK.values());
        } catch (Throwable th11) {
            AFLogger.afErrorLog("Error while preparing to send event", th11, true, false);
        }
    }
}
