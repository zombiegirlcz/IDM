package com.appsflyer.internal;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Process;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1wSDK {
    Map<String, Object> AFInAppEventParameterName;

    @NonNull
    public final AFg1vSDK AFKeystoreWrapper;
    public volatile String AFLogger;
    public volatile String registerClient;

    @NonNull
    public final AFd1nSDK valueOf;
    public long values;
    public boolean AFInAppEventType = false;
    public volatile boolean unregisterClient = false;

    public AFg1wSDK(@NonNull AFd1nSDK aFd1nSDK, @NonNull AFg1vSDK aFg1vSDK) {
        this.valueOf = aFd1nSDK;
        this.AFKeystoreWrapper = aFg1vSDK;
    }

    private boolean AFKeystoreWrapper() {
        Map<String, Object> map = this.AFInAppEventParameterName;
        return (map == null || map.isEmpty()) ? false : true;
    }

    @NonNull
    public final Map<String, Object> AFInAppEventParameterName() {
        HashMap map = new HashMap();
        if (AFKeystoreWrapper()) {
            map.put("lvl", this.AFInAppEventParameterName);
            return map;
        }
        if (this.AFInAppEventType) {
            this.AFInAppEventParameterName = new HashMap();
            AFInAppEventType();
            this.AFInAppEventParameterName.put("error", "pending LVL response");
            map.put("lvl", this.AFInAppEventParameterName);
        }
        return map;
    }

    public final Map<String, Object> AFInAppEventType(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.valueOf.AFKeystoreWrapper};
                Map<Integer, Object> map2 = AFc1iSDK.afDebugLog;
                Object declaredConstructor = map2.get(-2078882085);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFc1iSDK.AFInAppEventParameterName(122 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (37616 - (Process.myTid() >> 22)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 35)).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(-2078882085, declaredConstructor);
                }
                return (Map) ((Constructor) declaredConstructor).newInstance(objArr);
            } catch (Throwable th10) {
                Throwable cause = th10.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th10;
            }
        } catch (Throwable th11) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th11);
            return new HashMap();
        }
    }

    public final boolean valueOf() {
        return this.unregisterClient;
    }

    public final boolean values() {
        return this.AFInAppEventType && !AFKeystoreWrapper();
    }

    private static boolean AFKeystoreWrapper(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) || AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) {
            return true;
        }
        AFb1rSDK.AFInAppEventParameterName();
        return !AFb1rSDK.AFKeystoreWrapper(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String valueOf(com.appsflyer.internal.AFd1pSDK r8) {
        /*
            r7 = this;
            java.lang.String r0 = "use cached IMEI: "
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "collectIMEI"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            java.lang.String r2 = "imeiCached"
            r3 = 0
            java.lang.String r4 = r8.AFKeystoreWrapper(r2, r3)
            if (r1 == 0) goto L9a
            java.lang.String r1 = r7.registerClient
            boolean r1 = com.appsflyer.internal.AFc1vSDK.valueOf(r1)
            if (r1 == 0) goto L9a
            com.appsflyer.internal.AFd1nSDK r1 = r7.valueOf
            android.content.Context r1 = r1.AFKeystoreWrapper
            if (r1 == 0) goto La1
            boolean r5 = AFKeystoreWrapper(r1)
            if (r5 == 0) goto La1
            java.lang.String r5 = "phone"
            java.lang.Object r1 = r1.getSystemService(r5)     // Catch: java.lang.Exception -> L51 java.lang.reflect.InvocationTargetException -> L53
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Exception -> L51 java.lang.reflect.InvocationTargetException -> L53
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Exception -> L51 java.lang.reflect.InvocationTargetException -> L53
            java.lang.String r6 = "getDeviceId"
            java.lang.reflect.Method r5 = r5.getMethod(r6, r3)     // Catch: java.lang.Exception -> L51 java.lang.reflect.InvocationTargetException -> L53
            java.lang.Object r1 = r5.invoke(r1, r3)     // Catch: java.lang.Exception -> L51 java.lang.reflect.InvocationTargetException -> L53
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L51 java.lang.reflect.InvocationTargetException -> L53
            if (r1 == 0) goto L47
            goto La2
        L47:
            if (r4 == 0) goto L55
            java.lang.String r1 = r0.concat(r4)     // Catch: java.lang.Exception -> L51 java.lang.reflect.InvocationTargetException -> L53
            com.appsflyer.AFLogger.afDebugLog(r1)     // Catch: java.lang.Exception -> L51 java.lang.reflect.InvocationTargetException -> L53
            goto L56
        L51:
            r1 = move-exception
            goto L58
        L53:
            r1 = move-exception
            goto L79
        L55:
            r4 = r3
        L56:
            r1 = r4
            goto La2
        L58:
            if (r4 == 0) goto L62
            java.lang.String r0 = r0.concat(r4)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto L63
        L62:
            r4 = r3
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "WARNING: Can't collect IMEI: other reason: "
            r0.<init>(r5)
            java.lang.String r5 = r1.getMessage()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
            goto L56
        L79:
            if (r4 == 0) goto L83
            java.lang.String r0 = r0.concat(r4)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto L84
        L83:
            r4 = r3
        L84:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "WARNING: Can't collect IMEI because of missing permissions: "
            r0.<init>(r5)
            java.lang.String r5 = r1.getMessage()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
            goto L56
        L9a:
            java.lang.String r0 = r7.registerClient
            if (r0 == 0) goto La1
            java.lang.String r1 = r7.registerClient
            goto La2
        La1:
            r1 = r3
        La2:
            boolean r0 = com.appsflyer.internal.AFc1vSDK.valueOf(r1)
            if (r0 != 0) goto Lac
            r8.AFInAppEventParameterName(r2, r1)
            return r1
        Lac:
            java.lang.String r8 = "IMEI was not collected."
            com.appsflyer.AFLogger.afInfoLog(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1wSDK.valueOf(com.appsflyer.internal.AFd1pSDK):java.lang.String");
    }

    public final void AFInAppEventType() {
        this.AFInAppEventParameterName.put("ttr", Long.valueOf(System.currentTimeMillis() - this.values));
        this.AFInAppEventParameterName.put("lvl_timestamp", Long.valueOf(this.values));
    }
}
