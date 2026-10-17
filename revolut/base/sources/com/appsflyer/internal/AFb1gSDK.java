package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1gSDK implements AFb1aSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int AFKeystoreWrapper;
    private static long e = 0;
    private static int unregisterClient = 0;
    private static int v = 1;
    private final AFd1fSDK AFLogger;
    private List<String> values = new ArrayList();
    private boolean AFInAppEventParameterName = true;

    @NonNull
    private final Map<String, Object> AFInAppEventType = new HashMap();
    private boolean d = true ^ AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
    private int valueOf = 0;
    private boolean registerClient = false;

    static {
        AFLogger();
        AFKeystoreWrapper = 98166;
        unregisterClient = (v + 45) % 128;
    }

    public AFb1gSDK(AFd1fSDK aFd1fSDK) {
        this.AFLogger = aFd1fSDK;
    }

    public static void AFLogger() {
        e = 6393963433167026020L;
    }

    private static void a(String str, int i, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            $10 = ($11 + 87) % 128;
            charArray = str.toCharArray();
        }
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        char[] cArrValues = AFj1eSDK.values(e ^ 5867573198490634018L, (char[]) charArray, i);
        aFj1eSDK.AFInAppEventParameterName = 4;
        while (true) {
            int i2 = aFj1eSDK.AFInAppEventParameterName;
            if (i2 >= cArrValues.length) {
                String str2 = new String(cArrValues, 4, cArrValues.length - 4);
                $10 = ($11 + 113) % 128;
                objArr[0] = str2;
                return;
            } else {
                int i3 = ($11 + 59) % 128;
                $10 = i3;
                aFj1eSDK.values = i2 - 4;
                cArrValues[i2] = (char) (((long) (cArrValues[i2] ^ cArrValues[i2 % 4])) ^ (((long) r5) * (e ^ 5867573198490634018L)));
                aFj1eSDK.AFInAppEventParameterName = i2 + 1;
                $11 = (i3 + 27) % 128;
            }
        }
    }

    private boolean afInfoLog() {
        unregisterClient = (v + 101) % 128;
        boolean zAFKeystoreWrapper = this.AFLogger.AFInAppEventType().AFKeystoreWrapper("participantInProxy");
        int i = unregisterClient + 59;
        v = i % 128;
        if (i % 2 != 0) {
            return zAFKeystoreWrapper;
        }
        throw null;
    }

    private static float d() {
        float fNextFloat = new Random().nextFloat();
        unregisterClient = (v + 29) % 128;
        return fNextFloat;
    }

    private void force() {
        v = (unregisterClient + 121) % 128;
        this.AFLogger.AFInAppEventType().AFInAppEventParameterName("participantInProxy");
        int i = unregisterClient + 23;
        v = i % 128;
        if (i % 2 == 0) {
            int i2 = 0 / 0;
        }
    }

    private boolean i() {
        if (this.d) {
            int i = unregisterClient + 53;
            int i2 = i % 128;
            v = i2;
            if (i % 2 == 0) {
                throw null;
            }
            if (this.AFInAppEventParameterName) {
                return true;
            }
            unregisterClient = (i2 + 83) % 128;
            if (this.registerClient) {
                return true;
            }
        }
        int i3 = unregisterClient + 59;
        v = i3 % 128;
        if (i3 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return false;
    }

    private synchronized void registerClient() {
        int i = v;
        int i2 = i + LDSFile.EF_DG2_TAG;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.registerClient) {
            int i3 = i + 39;
            unregisterClient = i3 % 128;
            if (i3 % 2 != 0) {
                int i5 = 72 / 0;
                return;
            }
            return;
        }
        this.registerClient = true;
        try {
            AFKeystoreWrapper("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            return;
        } catch (Throwable th10) {
            AFLogger.INSTANCE.e(AFg1bSDK.PROXY, "Error while starting remote debugger", th10, true, true, true);
            return;
        }
    }

    private static String unregisterClient() {
        int i = (unregisterClient + 97) % 128;
        v = i;
        unregisterClient = (i + LDSFile.EF_DG13_TAG) % 128;
        return "6.14.2";
    }

    private synchronized void v() {
        this.values = new ArrayList();
        this.valueOf = 0;
        int i = unregisterClient + 31;
        v = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @NonNull
    private synchronized Map<String, Object> w() {
        Map<String, Object> map;
        try {
            int i = unregisterClient + 65;
            v = i % 128;
            if (i % 2 == 0) {
                this.AFInAppEventType.put("data", this.values);
                v();
                map = this.AFInAppEventType;
                int i2 = 53 / 0;
            } else {
                this.AFInAppEventType.put("data", this.values);
                v();
                map = this.AFInAppEventType;
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return map;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void AFInAppEventParameterName(String str, String... strArr) {
        int i = unregisterClient + 59;
        v = i % 128;
        int i2 = i % 2;
        AFKeystoreWrapper("public_api_call", str, strArr);
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean AFInAppEventType() {
        boolean zValueOf = valueOf(AFInAppEventType(this.AFLogger.e().AFInAppEventType.AFKeystoreWrapper), AFInAppEventType(this.AFLogger.e().AFInAppEventType.AFInAppEventParameterName));
        if (!zValueOf) {
            valueOf();
            AFKeystoreWrapper();
            unregisterClient = (v + LDSFile.EF_DG15_TAG) % 128;
            return zValueOf;
        }
        int i = v + 69;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
            registerClient();
            return zValueOf;
        }
        registerClient();
        int i2 = 17 / 0;
        return zValueOf;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final synchronized void AFKeystoreWrapper() {
        try {
            int i = (v + 11) % 128;
            unregisterClient = i;
            if (!this.registerClient && !this.AFInAppEventParameterName) {
                int i2 = i + 1;
                v = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                } else {
                    throw null;
                }
            }
            this.registerClient = false;
            this.AFInAppEventParameterName = false;
            try {
                AFKeystoreWrapper("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                return;
            } catch (Throwable th10) {
                AFLogger.INSTANCE.e(AFg1bSDK.PROXY, "Error while stopping remote debugger", th10, true, true, true);
                return;
            }
        } catch (Throwable th11) {
            throw th11;
        }
        throw th11;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean e() {
        int i = unregisterClient + 97;
        v = i % 128;
        if (i % 2 != 0) {
            return this.registerClient;
        }
        int i2 = 72 / 0;
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final synchronized void valueOf() {
        try {
            int i = unregisterClient + 57;
            v = i % 128;
            if (i % 2 == 0) {
                this.AFInAppEventParameterName = false;
            } else {
                this.AFInAppEventParameterName = false;
            }
            values();
            v();
            v = (unregisterClient + 25) % 128;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final synchronized void values() {
        List<String> list;
        try {
            int i = unregisterClient + 91;
            v = i % 128;
            if (i % 2 == 0) {
                this.AFInAppEventType.clear();
                list = this.values;
            } else {
                this.AFInAppEventType.clear();
                list = this.values;
            }
            list.clear();
            this.valueOf = 0;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void AFInAppEventParameterName(String str, String str2) {
        v = (unregisterClient + 11) % 128;
        AFKeystoreWrapper((String) null, str, str2);
        v = (unregisterClient + 123) % 128;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void AFInAppEventParameterName() {
        int i = v + LDSFile.EF_DG13_TAG;
        unregisterClient = i % 128;
        int i2 = i % 2;
        this.d = false;
    }

    private synchronized void AFInAppEventParameterName(String str, PackageManager packageManager, AFg1wSDK aFg1wSDK, AFd1oSDK aFd1oSDK) {
        try {
            v = (unregisterClient + 27) % 128;
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.AFInAppEventType.clear();
            if (string != null) {
                try {
                    this.AFInAppEventType.putAll(AFa1mSDK.AFInAppEventParameterName(new JSONObject(string)));
                } catch (Throwable unused) {
                }
            } else {
                AFb1rSDK aFb1rSDKAFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName();
                AFh1tSDK aFh1tSDK = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().valueOf().AFInAppEventType.AFLogger;
                String str2 = null;
                AFa1cSDK aFa1cSDK = aFh1tSDK != null ? new AFa1cSDK(aFh1tSDK.AFInAppEventType, aFh1tSDK.unregisterClient) : null;
                if (aFa1cSDK != null) {
                    v = (unregisterClient + 73) % 128;
                    str2 = aFa1cSDK.valueOf;
                }
                valueOf(str2, aFg1wSDK.registerClient, aFd1oSDK.AFInAppEventType);
                StringBuilder sb6 = new StringBuilder("6.14.2.");
                sb6.append(AFb1rSDK.values);
                values(sb6.toString(), aFb1rSDKAFInAppEventParameterName.AFInAppEventType().v().AFLogger, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                try {
                    AFInAppEventType(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString("channel"), appsFlyerProperties.getString("preInstallName"));
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFInAppEventType).toString());
                v = (unregisterClient + 43) % 128;
            }
            this.AFInAppEventType.put("launch_counter", String.valueOf(this.AFLogger.valueOf().values.valueOf("appsFlyerCount", 0)));
        } catch (Throwable th10) {
            throw th10;
        }
    }

    private synchronized void valueOf(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.AFInAppEventType;
            Object[] objArr = new Object[1];
            a("ྦྷ࿅ꓫ哟齜\uf45b羱ⓧ컛", ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.AFInAppEventType.put("model", Build.MODEL);
            this.AFInAppEventType.put("platform", "Android");
            this.AFInAppEventType.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    int i = unregisterClient + LDSFile.EF_DG2_TAG;
                    v = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 22 / 0;
                        if (str.length() > 0) {
                            this.AFInAppEventType.put("advertiserId", str);
                        }
                    } else if (str.length() > 0) {
                        this.AFInAppEventType.put("advertiserId", str);
                    }
                } finally {
                }
            }
            if (str2 != null && str2.length() > 0) {
                int i3 = unregisterClient + 121;
                v = i3 % 128;
                if (i3 % 2 == 0) {
                    this.AFInAppEventType.put("imei", str2);
                    throw null;
                }
                this.AFInAppEventType.put("imei", str2);
            }
            if (str3 != null && str3.length() > 0) {
                int i5 = unregisterClient + 87;
                v = i5 % 128;
                if (i5 % 2 == 0) {
                    this.AFInAppEventType.put("android_id", str3);
                    int i6 = 75 / 0;
                } else {
                    this.AFInAppEventType.put("android_id", str3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void AFKeystoreWrapper(Throwable th10) {
        String message;
        int i = v + LDSFile.EF_DG13_TAG;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
            Throwable cause = th10.getCause();
            String simpleName = th10.getClass().getSimpleName();
            if (cause == null) {
                int i2 = v + 105;
                unregisterClient = i2 % 128;
                if (i2 % 2 == 0) {
                    message = th10.getMessage();
                } else {
                    th10.getMessage();
                    throw null;
                }
            } else {
                message = cause.getMessage();
                v = (unregisterClient + 35) % 128;
            }
            AFKeystoreWrapper("exception", simpleName, AFInAppEventParameterName(message, cause == null ? th10.getStackTrace() : cause.getStackTrace()));
            return;
        }
        th10.getCause();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r3 == null) goto L11;
     */
    @Override // com.appsflyer.internal.AFb1aSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void values(java.lang.String r3, android.content.pm.PackageManager r4) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFb1gSDK.unregisterClient
            int r0 = r0 + 23
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1gSDK.v = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L2b
            java.util.Map r3 = r2.AFInAppEventType(r3, r4)     // Catch: java.lang.Throwable -> L29
            com.appsflyer.internal.AFd1fSDK r4 = r2.AFLogger     // Catch: java.lang.Throwable -> L29
            com.appsflyer.internal.AFg1wSDK r4 = r4.v()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r4.AFLogger     // Catch: java.lang.Throwable -> L29
            com.appsflyer.internal.AFd1fSDK r0 = r2.AFLogger     // Catch: java.lang.Throwable -> L29
            com.appsflyer.internal.AFe1rSDK r0 = r0.values()     // Catch: java.lang.Throwable -> L29
            com.appsflyer.internal.AFe1vSDK r3 = r0.valueOf(r3, r4)     // Catch: java.lang.Throwable -> L29
            r4 = 61
            int r4 = r4 / 0
            if (r3 != 0) goto L60
            goto L43
        L29:
            r3 = move-exception
            goto L71
        L2b:
            java.util.Map r3 = r2.AFInAppEventType(r3, r4)     // Catch: java.lang.Throwable -> L29
            com.appsflyer.internal.AFd1fSDK r4 = r2.AFLogger     // Catch: java.lang.Throwable -> L29
            com.appsflyer.internal.AFg1wSDK r4 = r4.v()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r4.AFLogger     // Catch: java.lang.Throwable -> L29
            com.appsflyer.internal.AFd1fSDK r0 = r2.AFLogger     // Catch: java.lang.Throwable -> L29
            com.appsflyer.internal.AFe1rSDK r0 = r0.values()     // Catch: java.lang.Throwable -> L29
            com.appsflyer.internal.AFe1vSDK r3 = r0.valueOf(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L60
        L43:
            java.lang.String r3 = "could not send null proxy data"
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "request was null"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L29
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r4)     // Catch: java.lang.Throwable -> L29
            int r3 = com.appsflyer.internal.AFb1gSDK.v
            int r3 = r3 + 3
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1gSDK.unregisterClient = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L5f
            r3 = 6
            int r3 = r3 / 0
        L5f:
            return
        L60:
            com.appsflyer.internal.AFd1fSDK r4 = r2.AFLogger     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.ExecutorService r4 = r4.AFKeystoreWrapper()     // Catch: java.lang.Throwable -> L29
            a0.a r0 = new a0.a     // Catch: java.lang.Throwable -> L29
            r1 = 10
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L29
            r4.execute(r0)     // Catch: java.lang.Throwable -> L29
            return
        L71:
            java.lang.String r4 = "could not send proxy data"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1gSDK.values(java.lang.String, android.content.pm.PackageManager):void");
    }

    private Map<String, Object> AFInAppEventType(String str, PackageManager packageManager) {
        unregisterClient = (v + 45) % 128;
        AFInAppEventParameterName(str, packageManager, this.AFLogger.v(), this.AFLogger.getLevel());
        Map<String, Object> mapW = w();
        unregisterClient = (v + 27) % 128;
        return mapW;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: all -> 0x001f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0004, B:14:0x0023, B:17:0x0031, B:23:0x004f, B:26:0x005d), top: B:43:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: all -> 0x001f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0004, B:14:0x0023, B:17:0x0031, B:23:0x004f, B:26:0x005d), top: B:43:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void AFInAppEventType(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 == 0) goto L21
            int r1 = com.appsflyer.internal.AFb1gSDK.unregisterClient     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1gSDK.v = r2     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 % 2
            if (r1 == 0) goto L1e
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L8c
            if (r1 <= 0) goto L21
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.AFInAppEventType     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "app_id"
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L8c
            goto L21
        L1e:
            throw r0     // Catch: java.lang.Throwable -> L8c
        L1f:
            r4 = move-exception
            goto L79
        L21:
            if (r5 == 0) goto L4d
            int r4 = com.appsflyer.internal.AFb1gSDK.unregisterClient     // Catch: java.lang.Throwable -> L1f
            int r4 = r4 + 115
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1gSDK.v = r4     // Catch: java.lang.Throwable -> L1f
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L8c
            if (r4 <= 0) goto L4d
            int r4 = com.appsflyer.internal.AFb1gSDK.v     // Catch: java.lang.Throwable -> L1f
            int r4 = r4 + 53
            int r1 = r4 % 128
            com.appsflyer.internal.AFb1gSDK.unregisterClient = r1     // Catch: java.lang.Throwable -> L1f
            int r4 = r4 % 2
            if (r4 != 0) goto L45
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.AFInAppEventType     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = "app_version"
            r4.put(r1, r5)     // Catch: java.lang.Throwable -> L8c
            goto L4d
        L45:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.AFInAppEventType     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = "app_version"
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        L4d:
            if (r6 == 0) goto L7b
            int r4 = com.appsflyer.internal.AFb1gSDK.unregisterClient     // Catch: java.lang.Throwable -> L1f
            int r4 = r4 + 7
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1gSDK.v = r4     // Catch: java.lang.Throwable -> L1f
            int r4 = r6.length()     // Catch: java.lang.Throwable -> L8c
            if (r4 <= 0) goto L7b
            int r4 = com.appsflyer.internal.AFb1gSDK.unregisterClient     // Catch: java.lang.Throwable -> L1f
            int r4 = r4 + 85
            int r5 = r4 % 128
            com.appsflyer.internal.AFb1gSDK.v = r5     // Catch: java.lang.Throwable -> L1f
            int r4 = r4 % 2
            if (r4 == 0) goto L71
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.AFInAppEventType     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = "channel"
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L8c
            goto L7b
        L71:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.AFInAppEventType     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = "channel"
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        L79:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r4
        L7b:
            if (r7 == 0) goto L8e
            int r4 = r7.length()     // Catch: java.lang.Throwable -> L8c
            if (r4 <= 0) goto L8e
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.AFInAppEventType     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = "preInstall"
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L8c
            goto L8e
        L8c:
            monitor-exit(r3)
            return
        L8e:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1gSDK.AFInAppEventType(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void AFKeystoreWrapper(String str, int i, String str2) {
        int i2 = v + 61;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFKeystoreWrapper("server_response", str, str2, String.valueOf(i));
        } else {
            AFKeystoreWrapper("server_response", str, String.valueOf(i), str2);
        }
        int i3 = unregisterClient + 67;
        v = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String... strArr) {
        String string;
        try {
            int i = v + 113;
            unregisterClient = i % 128;
            if (i % 2 != 0) {
                i();
                throw null;
            }
            if (!i() || this.valueOf >= 98304) {
                return;
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strJoin = TextUtils.join(", ", strArr);
                if (str != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(jCurrentTimeMillis);
                    sb6.append(" ");
                    sb6.append(Thread.currentThread().getId());
                    sb6.append(" _/AppsFlyer_6.14.2 [");
                    sb6.append(str);
                    sb6.append("] ");
                    sb6.append(str2);
                    sb6.append(" ");
                    sb6.append(strJoin);
                    string = sb6.toString();
                } else {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(jCurrentTimeMillis);
                    sb9.append(" ");
                    sb9.append(Thread.currentThread().getId());
                    sb9.append(" ");
                    sb9.append(str2);
                    sb9.append("/AppsFlyer_6.14.2 ");
                    sb9.append(strJoin);
                    string = sb9.toString();
                }
                int length = this.valueOf + (string.length() << 1);
                int i2 = AFKeystoreWrapper;
                boolean z = false;
                if (length > i2) {
                    unregisterClient = (v + 55) % 128;
                    string = string.substring(0, (i2 - this.valueOf) / 2);
                    z = true;
                }
                this.values.add(string);
                this.valueOf += string.length() << 1;
                if (z) {
                    int i3 = unregisterClient + ISO781611.SMT_TAG;
                    v = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.values.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.valueOf %= 23327;
                    } else {
                        this.values.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.valueOf += 138;
                    }
                }
            } catch (Throwable unused) {
            }
        } finally {
        }
    }

    private synchronized boolean valueOf(AFh1dSDK aFh1dSDK, AFh1dSDK aFh1dSDK2) {
        if (aFh1dSDK == null) {
            unregisterClient = (v + LDSFile.EF_DG15_TAG) % 128;
            force();
            return false;
        }
        if (!aFh1dSDK.AFInAppEventType()) {
            int i = v + 107;
            unregisterClient = i % 128;
            return i % 2 != 0;
        }
        if (this.AFLogger.valueOf().values.valueOf("appsFlyerCount", 0) > aFh1dSDK.AFInAppEventType) {
            return false;
        }
        v = (unregisterClient + 17) % 128;
        if (!AFInAppEventParameterName(aFh1dSDK, aFh1dSDK2)) {
            return false;
        }
        if (!AFKeystoreWrapper(aFh1dSDK.AFKeystoreWrapper)) {
            return false;
        }
        if (AFInAppEventParameterName(aFh1dSDK.values)) {
            return true;
        }
        unregisterClient = (v + 35) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void values(String str, String str2) {
        v = (unregisterClient + 95) % 128;
        AFKeystoreWrapper("server_request", str, str2);
        v = (unregisterClient + 49) % 128;
    }

    private synchronized void values(String str, String str2, String str3, String str4) {
        int i = v + 95;
        unregisterClient = i % 128;
        try {
            if (i % 2 == 0) {
                this.AFInAppEventType.put("sdk_version", str);
                if (str2 != null && str2.length() > 0) {
                    this.AFInAppEventType.put("devkey", str2);
                }
                if (str3 != null && str3.length() > 0) {
                    int i2 = unregisterClient + 67;
                    v = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.AFInAppEventType.put("originalAppsFlyerId", str3);
                        int i3 = 46 / 0;
                    } else {
                        this.AFInAppEventType.put("originalAppsFlyerId", str3);
                    }
                }
                if (str4 != null) {
                    unregisterClient = (v + 11) % 128;
                    if (str4.length() > 0) {
                        this.AFInAppEventType.put("uid", str4);
                    }
                }
            } else {
                this.AFInAppEventType.put("sdk_version", str);
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean AFInAppEventType(float f) {
        double d = f;
        if (d >= 1.0d) {
            return true;
        }
        if (d <= 0.0d) {
            int i = unregisterClient + 103;
            v = i % 128;
            return i % 2 == 0;
        }
        if (d() <= f) {
            unregisterClient = (v + 37) % 128;
            return true;
        }
        unregisterClient = (v + 47) % 128;
        return false;
    }

    private void values(boolean z) {
        v = (unregisterClient + 81) % 128;
        this.AFLogger.AFInAppEventType().AFKeystoreWrapper("participantInProxy", z);
        int i = v + 39;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static String[] AFInAppEventParameterName(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            String[] strArr = {str};
            int i = v + 37;
            unregisterClient = i % 128;
            if (i % 2 != 0) {
                int i2 = 40 / 0;
            }
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        v = (unregisterClient + 49) % 128;
        for (int i3 = 1; i3 < stackTraceElementArr.length; i3++) {
            v = (unregisterClient + ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG) % 128;
            strArr2[i3] = stackTraceElementArr[i3].toString();
        }
        return strArr2;
    }

    private static AFh1dSDK AFInAppEventType(AFh1aSDK aFh1aSDK) {
        int i = v;
        unregisterClient = (i + 77) % 128;
        if (aFh1aSDK == null) {
            return null;
        }
        unregisterClient = (i + 17) % 128;
        AFh1hSDK aFh1hSDK = aFh1aSDK.AFInAppEventParameterName;
        if (aFh1hSDK != null) {
            return aFh1hSDK.values;
        }
        return null;
    }

    private boolean AFKeystoreWrapper(String str) {
        unregisterClient = (v + 57) % 128;
        if (AFc1vSDK.AFInAppEventType(str)) {
            int i = v + 107;
            unregisterClient = i % 128;
            if (i % 2 == 0) {
                return true;
            }
            throw null;
        }
        Context context = this.AFLogger.valueOf().valueOf.AFKeystoreWrapper;
        return str.equals(AFb1vSDK.values(context, context.getPackageName()));
    }

    private boolean AFInAppEventParameterName(@NonNull AFh1dSDK aFh1dSDK, AFh1dSDK aFh1dSDK2) {
        boolean zAFInAppEventType;
        int i = v + 7;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            aFh1dSDK.equals(aFh1dSDK2);
            throw null;
        }
        if (aFh1dSDK.equals(aFh1dSDK2)) {
            zAFInAppEventType = afInfoLog();
        } else {
            zAFInAppEventType = AFInAppEventType(aFh1dSDK.valueOf);
            values(zAFInAppEventType);
        }
        v = (unregisterClient + 31) % 128;
        return zAFInAppEventType;
    }

    private static boolean AFInAppEventParameterName(String str) {
        int i = unregisterClient + 71;
        v = i % 128;
        if (i % 2 != 0) {
            if (AFc1vSDK.AFInAppEventType(str)) {
                return true;
            }
            new AFe1xSDK();
            boolean zValueOf = AFe1xSDK.valueOf(unregisterClient(), str);
            int i2 = v + 11;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 0;
            }
            return zValueOf;
        }
        AFc1vSDK.AFInAppEventType(str);
        throw null;
    }
}
