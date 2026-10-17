package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1wSDK {
    public final AFd1pSDK AFInAppEventParameterName;
    public long AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public long AFLogger;
    public long d;
    public final long[] e;
    public long force;
    public final long[] registerClient;
    public final long[] unregisterClient;
    public final Map<String, Object> valueOf;
    public final Map<String, Object> values;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f26036w;

    public AFh1wSDK(AFd1pSDK aFd1pSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.values = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.valueOf = concurrentHashMap3;
        this.AFInAppEventType = 0L;
        this.AFLogger = 0L;
        this.unregisterClient = new long[2];
        this.e = new long[2];
        this.registerClient = new long[2];
        this.d = 0L;
        this.force = 0L;
        this.AFInAppEventParameterName = aFd1pSDK;
        concurrentHashMap.putAll(AFInAppEventParameterName("first_launch"));
        concurrentHashMap2.putAll(AFInAppEventParameterName("ddl"));
        concurrentHashMap3.putAll(AFInAppEventParameterName("gcd"));
        this.f26036w = aFd1pSDK.AFInAppEventParameterName("prev_session_dur", 0L);
    }

    private Map<String, Object> AFInAppEventParameterName(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String strAFKeystoreWrapper = this.AFInAppEventParameterName.AFKeystoreWrapper(str, (String) null);
        if (strAFKeystoreWrapper != null) {
            try {
                return AFa1mSDK.AFInAppEventParameterName(new JSONObject(strAFKeystoreWrapper));
            } catch (Exception e) {
                AFLogger.afErrorLog("Error while parsing cached json data", e, true);
            }
        }
        return map;
    }

    public final void AFInAppEventType() {
        this.AFLogger = System.currentTimeMillis();
        if (values()) {
            long j2 = this.AFInAppEventType;
            if (j2 == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.AFKeystoreWrapper.put("init_to_fg", Long.valueOf(this.AFLogger - j2));
            this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final void AFKeystoreWrapper(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.d = jCurrentTimeMillis;
        if (i == 1) {
            long j2 = this.AFLogger;
            if (j2 == 0) {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
                return;
            }
            this.AFKeystoreWrapper.put("from_fg", Long.valueOf(jCurrentTimeMillis - j2));
            this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final void values(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.force;
        if (j2 != 0) {
            this.valueOf.put("net", Long.valueOf(jCurrentTimeMillis - j2));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.valueOf.put("retries", Integer.valueOf(i));
        this.AFInAppEventParameterName.AFInAppEventParameterName("gcd", new JSONObject(this.valueOf).toString());
    }

    public final void AFInAppEventType(AFh1uSDK aFh1uSDK) {
        if (values()) {
            this.AFKeystoreWrapper.put("start_with", aFh1uSDK.toString());
            this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final boolean values() {
        return this.AFInAppEventParameterName.valueOf("appsFlyerCount", 0) == 0;
    }

    public final void AFInAppEventType(DeepLinkResult deepLinkResult, long j2) {
        this.values.put("status", deepLinkResult.getStatus().toString());
        this.values.put("timeout_value", Long.valueOf(j2));
        this.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(this.values).toString());
    }
}
