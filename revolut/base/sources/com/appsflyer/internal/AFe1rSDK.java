package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static String AFKeystoreWrapper = null;
    private static boolean AFLogger = false;
    private static int afInfoLog = 0;
    private static int d = 0;
    private static boolean e = false;
    private static char[] unregisterClient = null;
    public static String valueOf = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f26020w = 1;
    private final AppsFlyerProperties AFInAppEventParameterName;
    private final AFe1tSDK AFInAppEventType;
    private final AFe1bSDK registerClient;
    private final AFd1sSDK values;

    static {
        AFKeystoreWrapper();
        valueOf = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFKeystoreWrapper = "https://%sonelink.%s/shortlink-sdk/v2";
        int i = f26020w + 97;
        afInfoLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public AFe1rSDK(AFe1tSDK aFe1tSDK, AFd1sSDK aFd1sSDK, AppsFlyerProperties appsFlyerProperties, AFe1bSDK aFe1bSDK) {
        this.AFInAppEventType = aFe1tSDK;
        this.values = aFd1sSDK;
        this.AFInAppEventParameterName = appsFlyerProperties;
        this.registerClient = aFe1bSDK;
    }

    public static void AFKeystoreWrapper() {
        AFLogger = true;
        e = true;
        d = 1875983374;
        unregisterClient = new char[]{15437, 15456, 15417, 15443, 15461, 15463, 15480, 15469, 15474, 15473, 15484, 15457, 15468, 15458};
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r10, int[] r11, java.lang.String r12, int r13, java.lang.Object[] r14) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1rSDK.a(java.lang.String, int[], java.lang.String, int, java.lang.Object[]):void");
    }

    @NonNull
    public final AFe1uSDK<AFc1jSDK> AFInAppEventParameterName(AFc1qSDK aFc1qSDK) {
        AFe1uSDK<AFc1jSDK> aFe1uSDKValues = values(new AFe1hSDK(aFc1qSDK.unregisterClient, AFa1mSDK.valueOf((Map<String, ?>) aFc1qSDK.AFInAppEventType()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFc1qSDK.valueOf()), new AFc1kSDK());
        int i = f26020w + ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG;
        afInfoLog = i % 128;
        if (i % 2 == 0) {
            return aFe1uSDKValues;
        }
        throw null;
    }

    public final AFe1uSDK<String> AFInAppEventType(Map<String, Object> map, String str, String str2) throws Throwable {
        String strAFInAppEventParameterName;
        try {
            Object[] objArr = {map, str};
            Map<Integer, Object> map2 = AFa1tSDK.afVerboseLog;
            Object method = map2.get(-606898412);
            if (method == null) {
                method = ((Class) AFa1tSDK.valueOf(ExpandableListView.getPackedPositionType(0L) + 74, 38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (15874 - (ViewConfiguration.getPressedStateDuration() >> 16)))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                map2.put(-606898412, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            AFj1uSDK aFj1uSDK = new AFj1uSDK(this.values);
            if (str2 == null || str2.length() == 0 || ch.qos.logback.core.util.a.x("4.?(\\d+)?.?(\\d+)", str2) || ch.qos.logback.core.util.a.x("3.?(\\d+)?.?(\\d+)", str2)) {
                afInfoLog = (f26020w + 89) % 128;
                strAFInAppEventParameterName = aFj1uSDK.valueOf.AFInAppEventParameterName("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                f26020w = (afInfoLog + 27) % 128;
            } else {
                strAFInAppEventParameterName = aFj1uSDK.valueOf.AFInAppEventParameterName("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
            }
            StringBuilder sbS = p.a.s(strAFInAppEventParameterName);
            sbS.append(aFj1uSDK.AFKeystoreWrapper.valueOf.AFKeystoreWrapper.getPackageName());
            return values(new AFe1hSDK(aFj1uSDK.values(sbS.toString()), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1nSDK());
        } catch (Throwable th10) {
            try {
                Throwable cause = th10.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th10;
            } catch (Exception e2) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e2);
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        if (r13 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (r13 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new java.lang.IllegalArgumentException("failed to create bytes from proxyData"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        com.appsflyer.internal.AFe1rSDK.afInfoLog = (com.appsflyer.internal.AFe1rSDK.f26020w + 49) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        return new com.appsflyer.internal.AFe1vSDK(r12.values, r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFe1vSDK valueOf(java.util.Map<java.lang.String, java.lang.Object> r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1rSDK.valueOf(java.util.Map, java.lang.String):com.appsflyer.internal.AFe1vSDK");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFe1uSDK<java.lang.String> values(java.util.Map<java.lang.String, java.lang.Object> r10, java.lang.String r11, java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1rSDK.values(java.util.Map, java.lang.String, java.lang.String):com.appsflyer.internal.AFe1uSDK");
    }

    public final AFe1uSDK<String> AFKeystoreWrapper(AFh1mSDK aFh1mSDK) {
        AFe1uSDK<String> aFe1uSDKValues = values(new AFe1hSDK(aFh1mSDK.unregisterClient, aFh1mSDK.AFKeystoreWrapper(), "POST", Collections.EMPTY_MAP, true), new AFe1nSDK());
        afInfoLog = (f26020w + LDSFile.EF_DG13_TAG) % 128;
        return aFe1uSDKValues;
    }

    public final AFe1uSDK<String> AFKeystoreWrapper(@NonNull String str, @NonNull Map<String, String> map, String str2, @NonNull UUID uuid, @NonNull String str3) throws UnsupportedEncodingException {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", "-1");
        map2.put("uuid", string);
        map2.put("data", map);
        map2.put("meta", AFInAppEventParameterName());
        if (str2 != null) {
            afInfoLog = (f26020w + 51) % 128;
            map2.put("brand_domain", str2);
        }
        String string2 = AFa1mSDK.valueOf((Map<String, ?>) map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a("\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, (ViewConfiguration.getJumpTapTimeout() >> 16) + CertificateBody.profileType, objArr);
        map3.put(((String) objArr[0]).intern(), AFInAppEventType(str3, string, "POST", string2));
        StringBuilder sb6 = new StringBuilder();
        sb6.append(String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.AFInAppEventParameterName().getHostName()));
        sb6.append("/");
        sb6.append(str);
        AFe1uSDK<String> aFe1uSDKAFInAppEventParameterName = AFInAppEventParameterName(new AFe1hSDK(sb6.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), new AFe1nSDK(), true);
        int i = f26020w + 121;
        afInfoLog = i % 128;
        if (i % 2 == 0) {
            return aFe1uSDKAFInAppEventParameterName;
        }
        throw null;
    }

    public final AFe1uSDK<Map<String, String>> AFInAppEventParameterName(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) throws UnsupportedEncodingException {
        String string = uuid.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.AFInAppEventParameterName().getHostName()));
        sb6.append("/");
        sb6.append(str);
        sb6.append("?id=");
        sb6.append(str2);
        String string2 = sb6.toString();
        Map<String, Object> mapAFInAppEventParameterName = AFInAppEventParameterName();
        String strValueOf = String.valueOf(mapAFInAppEventParameterName.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(mapAFInAppEventParameterName.get("counter")));
        map.put("Af-Meta-Model", String.valueOf(mapAFInAppEventParameterName.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(mapAFInAppEventParameterName.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(mapAFInAppEventParameterName.get("sdk")));
        Object[] objArr = new Object[1];
        a("\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - Color.argb(0, 0, 0, 0), objArr);
        map.put(((String) objArr[0]).intern(), AFInAppEventType(str3, string, "GET", string, str, str2, strValueOf));
        AFe1uSDK<Map<String, String>> aFe1uSDKValues = values(new AFe1hSDK(string2, null, "GET", map, false), new AFe1gSDK());
        afInfoLog = (f26020w + 107) % 128;
        return aFe1uSDKValues;
    }

    public final AFe1uSDK<String> AFKeystoreWrapper(@NonNull String str) {
        AFe1hSDK aFe1hSDK = new AFe1hSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFe1hSDK.registerClient = 10000;
        aFe1hSDK.values = false;
        AFe1uSDK<String> aFe1uSDKValues = values(aFe1hSDK, new AFe1nSDK());
        f26020w = (afInfoLog + 47) % 128;
        return aFe1uSDKValues;
    }

    private Map<String, Object> AFInAppEventParameterName() throws UnsupportedEncodingException {
        HashMap map = new HashMap();
        map.put("build_number", "6.14.2");
        map.put("counter", Integer.valueOf(this.values.values.valueOf("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a("\u008e\u0087\u0088\u008b\u008d", null, null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + CertificateBody.profileType, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.values.valueOf.AFKeystoreWrapper;
        map.put("app_version_name", AFb1vSDK.values(context, context.getPackageName()));
        map.put("app_id", this.values.valueOf.AFKeystoreWrapper.getPackageName());
        map.put("platformextension", new AFb1cSDK().AFKeystoreWrapper());
        int i = afInfoLog + 121;
        f26020w = i % 128;
        if (i % 2 == 0) {
            int i2 = 43 / 0;
        }
        return map;
    }

    public final AFe1uSDK<String> values(AFa1pSDK aFa1pSDK, String str, AFd1nSDK aFd1nSDK) {
        afInfoLog = (f26020w + LDSFile.EF_SOD_TAG) % 128;
        try {
            Object[] objArr = {aFa1pSDK, str, aFd1nSDK};
            Map<Integer, Object> map = AFa1tSDK.afVerboseLog;
            Object method = map.get(1431570785);
            if (method == null) {
                method = ((Class) AFa1tSDK.valueOf(74 - Color.blue(0), 37 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 15874))).getMethod("AFInAppEventType", AFa1pSDK.class, String.class, AFd1nSDK.class);
                map.put(1431570785, method);
            }
            AFe1uSDK<String> aFe1uSDKValues = values(new AFe1hSDK(aFa1pSDK.unregisterClient, (byte[]) ((Method) method).invoke(null, objArr), "POST", Collections.EMPTY_MAP, aFa1pSDK.valueOf()), new AFe1nSDK());
            f26020w = (afInfoLog + 29) % 128;
            return aFe1uSDKValues;
        } catch (Throwable th10) {
            try {
                Throwable cause = th10.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th10;
            } catch (Throwable th11) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th11);
                return null;
            }
        }
    }

    public final AFe1uSDK<String> AFInAppEventType(Map<String, Object> map, String str) {
        int i = afInfoLog + 45;
        f26020w = i % 128;
        try {
            if (i % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map<Integer, Object> map2 = AFa1tSDK.afVerboseLog;
                    Object method = map2.get(-606898412);
                    if (method == null) {
                        method = ((Class) AFa1tSDK.valueOf(75 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 37 - (Process.myPid() >> 22), (char) (AndroidCharacter.getMirror('0') + 15826))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        map2.put(-606898412, method);
                    }
                    byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                    AFj1uSDK aFj1uSDK = new AFj1uSDK(this.values);
                    StringBuilder sbS = p.a.s(aFj1uSDK.valueOf.AFInAppEventParameterName("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id="));
                    sbS.append(aFj1uSDK.AFKeystoreWrapper.valueOf.AFKeystoreWrapper.getPackageName());
                    return values(new AFe1hSDK(sbS.toString(), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1nSDK());
                } catch (Throwable th10) {
                    Throwable cause = th10.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th10;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map<Integer, Object> map3 = AFa1tSDK.afVerboseLog;
                Object method2 = map3.get(-606898412);
                if (method2 == null) {
                    method2 = ((Class) AFa1tSDK.valueOf(74 - KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionGroup(0L) + 37, (char) (View.combineMeasuredStates(0, 0) + 15874))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map3.put(-606898412, method2);
                }
                throw null;
            } catch (Throwable th11) {
                Throwable cause2 = th11.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th11;
            }
        } catch (Throwable th12) {
            AFLogger.INSTANCE.e(AFg1bSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th12, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(AFg1bSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th12, false, false);
        return null;
    }

    public final AFe1uSDK<Map<String, Object>> values(String str, String str2) {
        String packageName = this.values.valueOf.AFKeystoreWrapper.getPackageName();
        AFd1sSDK aFd1sSDK = this.values;
        AFe1uSDK<Map<String, Object>> aFe1uSDKValues = values(AFe1qSDK.AFInAppEventParameterName(packageName, AFb1jSDK.AFInAppEventType(aFd1sSDK.valueOf, aFd1sSDK.values), str, str2), new AFe1lSDK());
        int i = f26020w + LDSFile.EF_DG15_TAG;
        afInfoLog = i % 128;
        if (i % 2 == 0) {
            return aFe1uSDKValues;
        }
        throw null;
    }

    private <T> AFe1uSDK<T> AFInAppEventParameterName(AFe1hSDK aFe1hSDK, AFe1iSDK<T> aFe1iSDK, boolean z) {
        aFe1hSDK.AFInAppEventParameterName = z;
        AFe1tSDK aFe1tSDK = this.AFInAppEventType;
        AFe1uSDK<T> aFe1uSDK = new AFe1uSDK<>(aFe1hSDK, aFe1tSDK.AFKeystoreWrapper, aFe1tSDK.valueOf, aFe1iSDK);
        int i = afInfoLog + 59;
        f26020w = i % 128;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
        return aFe1uSDK;
    }

    private <T> AFe1uSDK<T> values(AFe1hSDK aFe1hSDK, AFe1iSDK<T> aFe1iSDK) {
        int i = afInfoLog + 51;
        f26020w = i % 128;
        if (i % 2 == 0) {
            AFe1uSDK<T> aFe1uSDKAFInAppEventParameterName = AFInAppEventParameterName(aFe1hSDK, aFe1iSDK, values());
            int i2 = 99 / 0;
            return aFe1uSDKAFInAppEventParameterName;
        }
        return AFInAppEventParameterName(aFe1hSDK, aFe1iSDK, values());
    }

    private boolean values() {
        f26020w = (afInfoLog + 25) % 128;
        if (this.AFInAppEventParameterName.getBoolean("http_cache", true)) {
            afInfoLog = (f26020w + 31) % 128;
            return false;
        }
        int i = f26020w + 79;
        afInfoLog = i % 128;
        if (i % 2 == 0) {
            return true;
        }
        throw null;
    }

    @NonNull
    public final AFe1uSDK<AFh1aSDK> AFInAppEventType(boolean z, boolean z3, @NonNull String str, int i) {
        String str2;
        String str3;
        AFe1bSDK aFe1bSDK = this.registerClient;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = z ? AFe1bSDK.AFInAppEventType : AFe1bSDK.AFInAppEventParameterName;
        if (z3) {
            afInfoLog = (f26020w + 99) % 128;
            str2 = "stg";
        } else {
            str2 = "";
        }
        if (AFe1bSDK.valueOf()) {
            afInfoLog = (f26020w + 27) % 128;
            str3 = (String) aFe1bSDK.AFInAppEventParameterName.getValue();
        } else {
            afInfoLog = (f26020w + 57) % 128;
            str3 = "";
        }
        AFe1hSDK aFe1hSDK = new AFe1hSDK(a0.d.v(new Object[]{str3, str2, aFe1bSDK.AFInAppEventType(), str}, 4, str4, ""), "GET");
        aFe1hSDK.registerClient = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        return values(aFe1hSDK, new AFe1pSDK());
    }

    private static String AFInAppEventType(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(str2);
        sb6.append("v2");
        String strAFInAppEventParameterName = AFb1mSDK.AFInAppEventParameterName(strJoin, sb6.toString());
        int i = afInfoLog + 45;
        f26020w = i % 128;
        if (i % 2 != 0) {
            return strAFInAppEventParameterName;
        }
        throw null;
    }
}
