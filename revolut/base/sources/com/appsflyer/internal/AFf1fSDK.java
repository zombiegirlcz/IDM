package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFi1bSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1fSDK extends AFf1gSDK {

    @NonNull
    private final AFg1ySDK afDebugLog;

    @NonNull
    private final AppsFlyerProperties afErrorLog;

    @NonNull
    private final AFh1wSDK afRDLog;

    @NonNull
    private final AFc1pSDK afWarnLog;
    public Map<String, Object> i;

    @NonNull
    private final AFd1pSDK v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    private final AFi1cSDK f26023w;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1fSDK$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[AFi1bSDK.AFa1uSDK.values().length];
            valueOf = iArr;
            try {
                iArr[AFi1bSDK.AFa1uSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[AFi1bSDK.AFa1uSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1fSDK(@NonNull AFa1pSDK aFa1pSDK, @NonNull AFd1fSDK aFd1fSDK) {
        super(aFa1pSDK, aFd1fSDK);
        this.f26023w = aFd1fSDK.force();
        this.v = aFd1fSDK.AFInAppEventType();
        this.afRDLog = aFd1fSDK.registerClient();
        this.afDebugLog = aFd1fSDK.e();
        this.afErrorLog = AppsFlyerProperties.getInstance();
        this.afWarnLog = aFd1fSDK.getPurchaseToken();
        this.valueOf.add(AFf1ySDK.RESOLVE_ESP);
        this.valueOf.add(AFf1ySDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFh1wSDK aFh1wSDK = this.afRDLog;
        int i = ((AFf1gSDK) this).AFLogger.registerClient;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            long j2 = aFh1wSDK.d;
            if (j2 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1wSDK.AFKeystoreWrapper.put("net", Long.valueOf(jCurrentTimeMillis - j2));
            aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(aFh1wSDK.AFKeystoreWrapper).toString());
        }
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void AFKeystoreWrapper(AFa1pSDK aFa1pSDK) {
        super.AFKeystoreWrapper(aFa1pSDK);
        int i = aFa1pSDK.registerClient;
        this.afRDLog.AFKeystoreWrapper(i);
        Map map = (Map) aFa1pSDK.AFInAppEventType().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1pSDK.AFInAppEventType().put("meta", map);
        }
        if (!aFa1pSDK.AFInAppEventType().containsKey("af_deeplink")) {
            aFa1pSDK.AFInAppEventType(this.afWarnLog.AFInAppEventType());
        }
        AFi1zSDK aFi1zSDKAFInAppEventParameterName = this.afDebugLog.AFInAppEventParameterName();
        if (aFi1zSDKAFInAppEventParameterName != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", aFi1zSDKAFInAppEventParameterName.AFKeystoreWrapper);
            String str = aFi1zSDKAFInAppEventParameterName.AFInAppEventParameterName;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j2 = aFi1zSDKAFInAppEventParameterName.values;
            if (j2 > 0) {
                map2.put("latency", Long.valueOf(j2));
            }
            long j3 = aFi1zSDKAFInAppEventParameterName.AFInAppEventType;
            if (j3 > 0) {
                map2.put("delay", Long.valueOf(j3));
            }
            int i2 = aFi1zSDKAFInAppEventParameterName.valueOf;
            if (i2 > 0) {
                map2.put("res_code", Integer.valueOf(i2));
            }
            if (aFi1zSDKAFInAppEventParameterName.e != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(aFi1zSDKAFInAppEventParameterName.e.getClass().getSimpleName());
                sb6.append(": ");
                sb6.append(aFi1zSDKAFInAppEventParameterName.e.getMessage());
                map2.put("error", sb6.toString());
            }
            AFh1cSDK aFh1cSDK = aFi1zSDKAFInAppEventParameterName.registerClient;
            if (aFh1cSDK != null) {
                map2.put("sig", aFh1cSDK.toString());
            }
            String str2 = aFi1zSDKAFInAppEventParameterName.unregisterClient;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        ((AFf1gSDK) this).force.AFKeystoreWrapper(aFa1pSDK.AFInAppEventType());
        if (i == 1) {
            if (this.afErrorLog.getBoolean("waitForCustomerId", false)) {
                aFa1pSDK.AFInAppEventType().put("wait_cid", Boolean.toString(true));
            }
            HashMap map3 = new HashMap(this.afRDLog.values);
            this.afRDLog.AFInAppEventParameterName.AFInAppEventParameterName("ddl");
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.afRDLog.AFKeystoreWrapper);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
        } else if (i == 2) {
            HashMap map5 = new HashMap(this.afRDLog.AFKeystoreWrapper);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            this.afRDLog.AFInAppEventParameterName.AFInAppEventParameterName("first_launch");
        }
        if (map.isEmpty()) {
            aFa1pSDK.AFInAppEventType().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFi1bSDK aFi1bSDK : this.f26023w.valueOf()) {
                boolean z = aFi1bSDK instanceof AFi1lSDK;
                int i3 = AnonymousClass3.valueOf[aFi1bSDK.AFInAppEventType.ordinal()];
                if (i3 == 1) {
                    if (z) {
                        aFa1pSDK.values("rfr", ((AFi1lSDK) aFi1bSDK).values);
                        this.v.AFKeystoreWrapper("newGPReferrerSent", true);
                    }
                    arrayList.add(aFi1bSDK.valueOf);
                } else if (i3 == 2 && i == 2 && !z) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFi1bSDK.AFInAppEventParameterName);
                    map6.put("response", "TIMEOUT");
                    map6.put("type", aFi1bSDK.e);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1pSDK.values("referrers", arrayList);
            }
            Object obj2 = this.i;
            if (obj2 != null) {
                aFa1pSDK.values("fb_ddl", obj2);
            }
        }
        ((AFf1gSDK) this).force.AFInAppEventType(aFa1pSDK);
    }
}
