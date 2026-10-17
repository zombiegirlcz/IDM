package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1xSDK;
import com.youTransactor.uCube.rpc.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import org.json.JSONObject;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1iSDK implements AFg1mSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afDebugLog = 0;
    private static int afVerboseLog = -538585038;
    private static int afWarnLog = 1;

    @NotNull
    private final AFi1pSDK AFInAppEventParameterName;

    @NotNull
    private final AFd1xSDK AFInAppEventType;

    @NotNull
    private final AFj1zSDK AFKeystoreWrapper;

    @NotNull
    private final AFd1sSDK AFLogger;

    @NotNull
    private final AFg1qSDK afInfoLog;

    @NotNull
    private final Lazy afRDLog;

    @NotNull
    private final AFg1wSDK d;

    @NotNull
    private final AFd1pSDK e;

    @NotNull
    private final AFd1nSDK force;

    @NotNull
    private final Lazy i;

    @NotNull
    private final AFi1vSDK registerClient;

    @NotNull
    private final AFh1wSDK unregisterClient;

    @NotNull
    private final AFd1oSDK v;

    @NotNull
    private final AFb1ySDK valueOf;

    @NotNull
    private final Context values;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFb1cSDK f26034w;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1iSDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "AFInAppEventParameterName", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function0<SimpleDateFormat> {
        public static final AnonymousClass2 AFKeystoreWrapper = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1iSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "AFKeystoreWrapper", "()Lcom/appsflyer/AppsFlyerProperties;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass4 valueOf = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1iSDK(@NotNull Context context, @NotNull AFi1pSDK aFi1pSDK, @NotNull AFd1xSDK aFd1xSDK, @NotNull AFj1zSDK aFj1zSDK, @NotNull AFb1ySDK aFb1ySDK, @NotNull AFh1wSDK aFh1wSDK, @NotNull AFd1pSDK aFd1pSDK, @NotNull AFd1sSDK aFd1sSDK, @NotNull AFi1vSDK aFi1vSDK, @NotNull AFg1wSDK aFg1wSDK, @NotNull AFb1cSDK aFb1cSDK, @NotNull AFd1nSDK aFd1nSDK, @NotNull AFg1qSDK aFg1qSDK, @NotNull AFd1oSDK aFd1oSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1xSDK, "");
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(aFb1ySDK, "");
        Intrinsics.checkNotNullParameter(aFh1wSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFi1vSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1oSDK, "");
        this.values = context;
        this.AFInAppEventParameterName = aFi1pSDK;
        this.AFInAppEventType = aFd1xSDK;
        this.AFKeystoreWrapper = aFj1zSDK;
        this.valueOf = aFb1ySDK;
        this.unregisterClient = aFh1wSDK;
        this.e = aFd1pSDK;
        this.AFLogger = aFd1sSDK;
        this.registerClient = aFi1vSDK;
        this.d = aFg1wSDK;
        this.f26034w = aFb1cSDK;
        this.force = aFd1nSDK;
        this.afInfoLog = aFg1qSDK;
        this.v = aFd1oSDK;
        this.i = yhm.j.b(AnonymousClass4.valueOf);
        this.afRDLog = yhm.j.b(AnonymousClass2.AFKeystoreWrapper);
    }

    private final void AFInAppEventType(Map<String, Object> map) {
        try {
            long j2 = this.values.getPackageManager().getPackageInfo(this.values.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j2)));
            int i = afWarnLog + 45;
            afDebugLog = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e);
        }
    }

    @NotNull
    private String AFKeystoreWrapper(@NotNull SimpleDateFormat simpleDateFormat) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String strAFKeystoreWrapper = this.e.AFKeystoreWrapper("appsFlyerFirstInstall", (String) null);
        if (strAFKeystoreWrapper == null) {
            afDebugLog = (afWarnLog + 13) % 128;
            if (e()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                strAFKeystoreWrapper = simpleDateFormat.format(new Date());
            } else {
                afDebugLog = (afWarnLog + 23) % 128;
                strAFKeystoreWrapper = "";
            }
            this.e.AFInAppEventParameterName("appsFlyerFirstInstall", strAFKeystoreWrapper);
            afDebugLog = (afWarnLog + 31) % 128;
        }
        AFg1cSDK.i$default(AFLogger.INSTANCE, AFg1bSDK.GENERAL, "AppsFlyer: first launch date: ".concat(String.valueOf(strAFKeystoreWrapper)), false, 4, null);
        Intrinsics.checkNotNullExpressionValue(strAFKeystoreWrapper, "");
        afDebugLog = (afWarnLog + 79) % 128;
        return strAFKeystoreWrapper;
    }

    private void AFLogger(@NotNull Map<String, Object> map) {
        afDebugLog = (afWarnLog + 65) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString("oneLinkSlug");
        String string2 = AFKeystoreWrapper().getString("onelinkVersion");
        if (string != null) {
            map.put("onelink_id", string);
            afWarnLog = (afDebugLog + 89) % 128;
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
    }

    private void AFLogger$LogLevel(@NotNull Map<String, Object> map) {
        afWarnLog = (afDebugLog + 79) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        AFa1cSDK aFa1cSDKAFInAppEventType = AFb1uSDK.AFInAppEventType(this.values.getContentResolver());
        if (aFa1cSDKAFInAppEventType != null) {
            int i = afDebugLog + 15;
            afWarnLog = i % 128;
            if (i % 2 != 0) {
                map.put("amazon_aid", aFa1cSDKAFInAppEventType.valueOf);
                map.put("amazon_aid_limit", String.valueOf(aFa1cSDKAFInAppEventType.values));
            } else {
                map.put("amazon_aid", aFa1cSDKAFInAppEventType.valueOf);
                map.put("amazon_aid_limit", String.valueOf(aFa1cSDKAFInAppEventType.values));
                int i2 = 91 / 0;
            }
        }
    }

    private void AFPurchaseDetails(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        boolean zAFInAppEventType = AFg1lSDK.AFInAppEventType(this.values);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(zAFInAppEventType)));
        if (!zAFInAppEventType) {
            afDebugLog = (afWarnLog + 7) % 128;
            map.put("tokenRefreshConfigured", Boolean.FALSE);
            afDebugLog = (afWarnLog + 99) % 128;
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1lSDK.AFKeystoreWrapper(this.e)));
    }

    private static void a(int i, int i2, int i3, boolean z, String str, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFj1fSDK aFj1fSDK = new AFj1fSDK();
        char[] cArr2 = new char[i2];
        aFj1fSDK.AFKeystoreWrapper = 0;
        while (true) {
            int i5 = aFj1fSDK.AFKeystoreWrapper;
            if (i5 >= i2) {
                break;
            }
            char c2 = cArr[i5];
            aFj1fSDK.valueOf = c2;
            char c3 = (char) (c2 + i);
            cArr2[i5] = c3;
            cArr2[i5] = (char) (c3 - ((int) (((long) afVerboseLog) ^ (-8746108755996452782L))));
            aFj1fSDK.AFKeystoreWrapper = i5 + 1;
        }
        if (i3 > 0) {
            $10 = ($11 + LDSFile.EF_DG2_TAG) % 128;
            aFj1fSDK.values = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            int i6 = aFj1fSDK.values;
            System.arraycopy(cArr3, 0, cArr2, i2 - i6, i6);
            int i21 = aFj1fSDK.values;
            System.arraycopy(cArr3, i21, cArr2, 0, i2 - i21);
            $11 = ($10 + 27) % 128;
        }
        if (z) {
            $11 = ($10 + 35) % 128;
            char[] cArr4 = new char[i2];
            aFj1fSDK.AFKeystoreWrapper = 0;
            while (true) {
                int i22 = aFj1fSDK.AFKeystoreWrapper;
                if (i22 >= i2) {
                    break;
                }
                cArr4[i22] = cArr2[(i2 - i22) - 1];
                aFj1fSDK.AFKeystoreWrapper = i22 + 1;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private void afDebugLog(@NotNull Map<String, Object> map) {
        afWarnLog = (afDebugLog + 95) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString("sdkExtension");
        if (string == null || string.length() == 0) {
            return;
        }
        afWarnLog = (afDebugLog + 23) % 128;
        map.put("sdkExtension", string);
    }

    private static void afErrorLog(@NotNull Map<String, Object> map) {
        afDebugLog = (afWarnLog + 51) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e2);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
            int i = afDebugLog + LDSFile.EF_DG2_TAG;
            afWarnLog = i % 128;
            if (i % 2 == 0) {
                int i2 = 43 / 0;
            }
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e4);
        }
    }

    private void afErrorLogForExcManagerOnly(@NotNull Map<String, Object> map) {
        afDebugLog = (afWarnLog + 55) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.e.valueOf("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.e.AFKeystoreWrapper("is_stop_tracking_used")));
        }
        int i = afWarnLog + 75;
        afDebugLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private final void afInfoLog(Map<String, Object> map) {
        afDebugLog = (afWarnLog + 87) % 128;
        UiModeManager uiModeManager = (UiModeManager) this.values.getSystemService(UiModeManager.class);
        int i = (afWarnLog + 5) % 128;
        afDebugLog = i;
        if (uiModeManager != null) {
            int i2 = i + 57;
            afWarnLog = i2 % 128;
            if (i2 % 2 == 0) {
                if (uiModeManager.getCurrentModeType() != 3) {
                    return;
                }
            } else if (uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            map.put("tv", Boolean.TRUE);
        }
    }

    private void afLogForce(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String strAFInAppEventType = AFb1jSDK.AFInAppEventType(this.force, this.e);
            if (strAFInAppEventType != null) {
                int i = afWarnLog + 73;
                afDebugLog = i % 128;
                if (i % 2 == 0) {
                    map.put("uid", strAFInAppEventType);
                    return;
                } else {
                    map.put("uid", strAFInAppEventType);
                    throw null;
                }
            }
        } catch (Throwable th10) {
            StringBuilder sb6 = new StringBuilder("ERROR: could not get uid ");
            sb6.append(th10.getMessage());
            String string = sb6.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            AFLogger.afErrorLog(string, th10);
        }
        int i2 = afDebugLog + 73;
        afWarnLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void afRDLog(@NotNull Map<String, Object> map) {
        int i = afDebugLog + 75;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFb1hSDK.AFInAppEventType();
            AFb1hSDK.values();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        Object objAFInAppEventType = AFb1hSDK.AFInAppEventType();
        String strValues = AFb1hSDK.values();
        if (objAFInAppEventType == null || strValues == null) {
            return;
        }
        afDebugLog = (afWarnLog + 77) % 128;
        if (Integer.parseInt(strValues) > 0) {
            map.put("reinstallCounter", strValues);
            map.put("originalAppsflyerId", objAFInAppEventType);
            afWarnLog = (afDebugLog + 121) % 128;
        }
    }

    private void afVerboseLog(@NotNull Map<String, Object> map) {
        int i = afDebugLog + 105;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.afInfoLog.AFInAppEventParameterName());
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.afInfoLog.AFInAppEventParameterName());
            throw null;
        }
    }

    private void afWarnLog(@NotNull Map<String, Object> map) {
        boolean z;
        int i = afDebugLog + 113;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            values(this.e, this.AFLogger.AFLogger());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String strAFLogger = this.AFLogger.AFLogger();
        String strValues = values(this.e, strAFLogger);
        boolean z3 = false;
        if (strValues == null || strValues.equals(strAFLogger)) {
            z = false;
        } else {
            afDebugLog = (afWarnLog + 67) % 128;
            z = true;
        }
        if (strValues != null || strAFLogger == null) {
            afDebugLog = (afWarnLog + 123) % 128;
        } else {
            afWarnLog = (afDebugLog + 67) % 128;
            z3 = true;
        }
        if (z || z3) {
            map.put("af_latestchannel", strAFLogger);
        }
        String strD = d();
        if (strD != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            Object lowerCase = strD.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String strW = w();
        if (strW != null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            Object lowerCase2 = strW.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String strAFLogger2 = AFLogger();
        if (strAFLogger2 != null) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            Object lowerCase3 = strAFLogger2.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
            int i2 = afWarnLog + 103;
            afDebugLog = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    private final void d(Map<String, Object> map) {
        afWarnLog = (afDebugLog + 1) % 128;
        AFd1xSDK.AFa1ySDK aFa1ySDKValues = this.AFInAppEventType.values(this.values);
        float f = aFa1ySDKValues.valueOf;
        String str = aFa1ySDKValues.AFInAppEventType;
        map.put("btl", String.valueOf(f));
        if (str != null) {
            map.put("btch", str);
        }
        afDebugLog = (afWarnLog + 93) % 128;
    }

    private void e(@NotNull Map<String, ? extends Object> map) {
        int i;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1wSDK aFh1wSDK = this.unregisterClient;
        HashMap map2 = new HashMap(aFh1wSDK.valueOf);
        aFh1wSDK.valueOf.clear();
        this.unregisterClient.AFInAppEventParameterName.AFInAppEventParameterName("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (map2.isEmpty()) {
            i = afWarnLog + 5;
        } else {
            afWarnLog = (afDebugLog + 95) % 128;
            Map<String, Object> mapAFKeystoreWrapper = AFb1rSDK.AFKeystoreWrapper(map);
            Intrinsics.checkNotNullExpressionValue(mapAFKeystoreWrapper, "");
            mapAFKeystoreWrapper.put("gcd", map2);
            i = afWarnLog + 3;
        }
        afDebugLog = i % 128;
    }

    private final String force() {
        String strAFKeystoreWrapper = this.e.AFKeystoreWrapper("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(this.values.getContentResolver(), "android_id");
            if (string != null) {
                int i = afDebugLog + 113;
                afWarnLog = i % 128;
                if (i % 2 != 0) {
                    return string;
                }
                throw null;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (strAFKeystoreWrapper != null) {
            afDebugLog = (afWarnLog + 107) % 128;
            AFLogger.afDebugLog("use cached AndroidId: ".concat(strAFKeystoreWrapper));
            return strAFKeystoreWrapper;
        }
        int i2 = afDebugLog + 19;
        afWarnLog = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void getLevel(@NotNull Map<String, Object> map) {
        afWarnLog = (afDebugLog + 25) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.d.AFLogger;
        if (str == null || str.length() == 0) {
            return;
        }
        afWarnLog = (afDebugLog + LDSFile.EF_DG2_TAG) % 128;
        map.put("appsflyerKey", str);
    }

    private void i(@NotNull Map<String, Object> map) {
        long j2;
        int i = afDebugLog + 61;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            j2 = this.unregisterClient.f26036w;
            if (j2 == 1) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            j2 = this.unregisterClient.f26036w;
            if (j2 == 0) {
                return;
            }
        }
        afWarnLog = (afDebugLog + 87) % 128;
        map.put("prev_session_dur", Long.valueOf(j2));
        afWarnLog = (afDebugLog + 41) % 128;
    }

    private static long registerClient() {
        afWarnLog = (afDebugLog + 65) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        afDebugLog = (afWarnLog + 75) % 128;
        return jCurrentTimeMillis;
    }

    @NotNull
    private static String unregisterClient() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        StringBuilder sb6 = new StringBuilder();
        sb6.append((long) (availableBlocksLong / dPow));
        sb6.append('/');
        sb6.append((long) (blockCountLong / dPow));
        String string = sb6.toString();
        int i = afWarnLog + 5;
        afDebugLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
        }
        return string;
    }

    private boolean v() {
        int i = afWarnLog + 27;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            return Boolean.parseBoolean(this.e.AFKeystoreWrapper("sentSuccessfully", (String) null));
        }
        int i2 = 29 / 0;
        return Boolean.parseBoolean(this.e.AFKeystoreWrapper("sentSuccessfully", (String) null));
    }

    private String w() {
        int i = afWarnLog + 71;
        afDebugLog = i % 128;
        if (i % 2 != 0) {
            AFKeystoreWrapper().getString("preInstallName");
            throw null;
        }
        String string = AFKeystoreWrapper().getString("preInstallName");
        if (string != null) {
            int i2 = afWarnLog + 31;
            afDebugLog = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            throw null;
        }
        if (this.e.valueOf("preInstallName")) {
            string = this.e.AFKeystoreWrapper("preInstallName", (String) null);
        } else {
            if (e() && (string = afInfoLog()) == null) {
                string = AFKeystoreWrapper("AF_PRE_INSTALL_NAME");
            }
            if (string != null) {
                int i3 = afWarnLog + 71;
                afDebugLog = i3 % 128;
                if (i3 % 2 != 0) {
                    this.e.AFInAppEventParameterName("preInstallName", string);
                    int i5 = 30 / 0;
                } else {
                    this.e.AFInAppEventParameterName("preInstallName", string);
                }
            }
        }
        if (string != null) {
            int i6 = afDebugLog + 11;
            afWarnLog = i6 % 128;
            if (i6 % 2 == 0) {
                AFKeystoreWrapper().set("preInstallName", string);
                int i21 = 11 / 0;
                return string;
            }
            AFKeystoreWrapper().set("preInstallName", string);
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventParameterName(@NotNull AFa1pSDK aFa1pSDK) {
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Map<String, Object> mapAFInAppEventType = aFa1pSDK.AFInAppEventType();
        if (aFa1pSDK.AFInAppEventParameterName()) {
            String str = aFa1pSDK.d;
            AFd1oSDK aFd1oSDK = this.v;
            AFKeystoreWrapper(aFa1pSDK, str, aFd1oSDK.values, aFd1oSDK.AFKeystoreWrapper);
        } else if (!(aFa1pSDK instanceof AFh1jSDK)) {
            int i = afWarnLog + 23;
            afDebugLog = i % 128;
            if (i % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(mapAFInAppEventType, "");
                String str2 = aFa1pSDK.e;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                AFInAppEventType(mapAFInAppEventType, str2);
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(mapAFInAppEventType, "");
            String str3 = aFa1pSDK.e;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            AFInAppEventType(mapAFInAppEventType, str3);
            afDebugLog = (afWarnLog + 95) % 128;
        }
        if (v.k(AFf1ySDK.CONVERSION, AFf1ySDK.LAUNCH, AFf1ySDK.INAPP).contains(aFa1pSDK.values())) {
            Intrinsics.checkNotNullExpressionValue(mapAFInAppEventType, "");
            w(mapAFInAppEventType);
        }
        Intrinsics.checkNotNullExpressionValue(mapAFInAppEventType, "");
        getLevel(mapAFInAppEventType);
        afRDLog(mapAFInAppEventType);
        afVerboseLog(mapAFInAppEventType);
        afDebugLog(mapAFInAppEventType);
        afLogForce(mapAFInAppEventType);
        AFInAppEventType(mapAFInAppEventType, aFa1pSDK.AFInAppEventParameterName());
        AFPurchaseDetails(mapAFInAppEventType);
        afErrorLogForExcManagerOnly(mapAFInAppEventType);
        AFKeystoreWrapper(mapAFInAppEventType, aFa1pSDK);
        mapAFInAppEventType.put("af_events_api", "1");
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(@NotNull Map<String, Object> map, int i, int i2) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        if (!v()) {
            int i3 = afWarnLog;
            int i5 = i3 + 19;
            afDebugLog = i5 % 128;
            z = i5 % 2 == 0;
            afDebugLog = (i3 + 63) % 128;
        }
        map.put("isFirstCall", String.valueOf(z));
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString("appid");
        if (string != null) {
            map.put("appid", string);
        }
        String string2 = AFKeystoreWrapper().getString("currencyCode");
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb6 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb6.append(string2);
                sb6.append("' is not a legal value.");
                String string3 = sb6.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                AFLogger.afWarnLog(string3);
            }
            map.put("currency", string2);
        }
        String string4 = AFKeystoreWrapper().getString("IS_UPDATE");
        if (string4 != null) {
            map.put("isUpdate", string4);
        }
        String string5 = AFKeystoreWrapper().getString("additionalCustomData");
        if (string5 != null) {
            map.put("customData", string5);
        }
        String string6 = AFKeystoreWrapper().getString("AppUserId");
        if (string6 != null) {
            map.put("appUserId", string6);
        }
        String string7 = AFKeystoreWrapper().getString("userEmails");
        if (string7 != null) {
            afDebugLog = (afWarnLog + 123) % 128;
            map.put("user_emails", string7);
        }
        AFd1vSDK aFd1vSDK = this.v.AFInAppEventParameterName;
        if (aFd1vSDK != null) {
            afDebugLog = (afWarnLog + 13) % 128;
            String[] strArr = aFd1vSDK.AFKeystoreWrapper;
            if (strArr != null) {
                map.put("sharing_filter", strArr);
                afWarnLog = (afDebugLog + 41) % 128;
            }
        }
    }

    private final void registerClient(Map<String, Object> map) {
        int i = afDebugLog + 95;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            AFKeystoreWrapper().isOtherSdkStringDisabled();
            throw null;
        }
        if (AFKeystoreWrapper().isOtherSdkStringDisabled()) {
            return;
        }
        map.put("batteryLevel", String.valueOf(this.AFInAppEventType.values(this.values).valueOf));
        afDebugLog = (afWarnLog + 51) % 128;
    }

    private void v(@NotNull Map<String, Object> map) {
        long seconds;
        afDebugLog = (afWarnLog + 29) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        long jAFInAppEventParameterName = this.e.AFInAppEventParameterName("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.e.values("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
        if (jAFInAppEventParameterName > 0) {
            seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - jAFInAppEventParameterName);
            afWarnLog = (afDebugLog + 113) % 128;
        } else {
            seconds = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private void valueOf(@NotNull Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        if (AFKeystoreWrapper().getBoolean("deviceTrackingDisabled", false)) {
            afDebugLog = (afWarnLog + 19) % 128;
            map.put("deviceTrackingDisabled", "true");
            return;
        }
        String strValueOf = this.d.valueOf(this.e);
        if (strValueOf != null && strValueOf.length() != 0) {
            afDebugLog = (afWarnLog + 101) % 128;
            map.put("imei", strValueOf);
        }
        String strAFInAppEventParameterName = AFInAppEventParameterName(str);
        if (strAFInAppEventParameterName != null) {
            this.e.AFInAppEventParameterName("androidIdCached", strAFInAppEventParameterName);
            map.put("android_id", strAFInAppEventParameterName);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFa1cSDK aFa1cSDKAFInAppEventType = AFb1uSDK.AFInAppEventType(this.values);
        if (aFa1cSDKAFInAppEventType != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = aFa1cSDKAFInAppEventType.AFKeystoreWrapper;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str2 = aFa1cSDKAFInAppEventType.valueOf;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            linkedHashMap.put("val", str2);
            Boolean bool2 = aFa1cSDKAFInAppEventType.values;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
            afWarnLog = (afDebugLog + 23) % 128;
        }
    }

    private final String afInfoLog() {
        File fileAFInAppEventType = AFInAppEventType(valueOf("ro.appsflyer.preinstall.path"));
        if (AFInAppEventParameterName(fileAFInAppEventType)) {
            fileAFInAppEventType = AFInAppEventType(AFKeystoreWrapper("AF_PRE_INSTALL_PATH"));
        }
        if (AFInAppEventParameterName(fileAFInAppEventType)) {
            afWarnLog = (afDebugLog + 63) % 128;
            fileAFInAppEventType = AFInAppEventType("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFInAppEventParameterName(fileAFInAppEventType)) {
            int i = afDebugLog + 91;
            afWarnLog = i % 128;
            if (i % 2 == 0) {
                AFInAppEventType("/etc/pre_install.appsflyer");
                throw null;
            }
            fileAFInAppEventType = AFInAppEventType("/etc/pre_install.appsflyer");
        }
        if (AFInAppEventParameterName(fileAFInAppEventType)) {
            int i2 = afDebugLog + 95;
            afWarnLog = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String packageName = this.values.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return values(fileAFInAppEventType, packageName);
    }

    private String AFLogger() {
        afWarnLog = (afDebugLog + 37) % 128;
        String string = AFKeystoreWrapper().getString("api_store_value");
        if (string != null) {
            return string;
        }
        afDebugLog = (afWarnLog + 21) % 128;
        String strAFKeystoreWrapper = AFKeystoreWrapper("AF_STORE");
        afDebugLog = (afWarnLog + 105) % 128;
        return strAFKeystoreWrapper;
    }

    private String d() {
        int i = afDebugLog + 7;
        afWarnLog = i % 128;
        String strAFLogger = null;
        if (i % 2 != 0) {
            if (this.e.valueOf("INSTALL_STORE")) {
                return this.e.AFKeystoreWrapper("INSTALL_STORE", (String) null);
            }
            if (e()) {
                int i2 = afWarnLog + 71;
                afDebugLog = i2 % 128;
                if (i2 % 2 == 0) {
                    strAFLogger = AFLogger();
                } else {
                    AFLogger();
                    throw null;
                }
            }
            this.e.AFInAppEventParameterName("INSTALL_STORE", strAFLogger);
            return strAFLogger;
        }
        this.e.valueOf("INSTALL_STORE");
        throw null;
    }

    private static void unregisterClient(@NotNull Map<String, Object> map) {
        afWarnLog = (afDebugLog + 35) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) + 199, 5 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 5, false, "\ufffb\u000b\ufffa\u0007�", objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        afDebugLog = (afWarnLog + ISO781611.SMT_TAG) % 128;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final long AFInAppEventType() {
        afWarnLog = (afDebugLog + 63) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = afDebugLog + 107;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            return jCurrentTimeMillis;
        }
        throw null;
    }

    private void AFInAppEventType(@NotNull Map<String, Object> map, boolean z) {
        afWarnLog = (afDebugLog + ISO781611.SMT_TAG) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.f26034w.AFKeystoreWrapper());
        if (z) {
            map.put("platform_extension_v2", this.AFInAppEventParameterName.AFInAppEventParameterName());
        }
        afWarnLog = (afDebugLog + LDSFile.EF_DG13_TAG) % 128;
    }

    private final void force(Map<String, Object> map) {
        afWarnLog = (afDebugLog + 51) % 128;
        if (AFg1fSDK.AFKeystoreWrapper(this.values)) {
            map.put("inst_app", Boolean.TRUE);
            afDebugLog = (afWarnLog + 37) % 128;
        }
    }

    private final boolean i() {
        if (!AFKeystoreWrapper().getBoolean("collectAndroidIdForceByUser", false)) {
            afDebugLog = (afWarnLog + 69) % 128;
            if (!AFKeystoreWrapper().getBoolean("collectIMEIForceByUser", false)) {
                AFb1rSDK.AFInAppEventParameterName();
                return !AFb1rSDK.AFKeystoreWrapper(this.values);
            }
        }
        afWarnLog = (afDebugLog + 15) % 128;
        return true;
    }

    private boolean e() {
        if (this.e.valueOf("appsFlyerCount")) {
            afDebugLog = (afWarnLog + 67) % 128;
            return false;
        }
        afWarnLog = (afDebugLog + 73) % 128;
        return true;
    }

    private void AFKeystoreWrapper(@NotNull AFa1pSDK aFa1pSDK, String str, String str2, AFc1cSDK aFc1cSDK) {
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Map<String, Object> mapAFInAppEventType = aFa1pSDK.AFInAppEventType();
        if (aFa1pSDK.values() == AFf1ySDK.CONVERSION) {
            int i = afDebugLog + 61;
            afWarnLog = i % 128;
            if (i % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(mapAFInAppEventType, "");
                registerClient(mapAFInAppEventType);
                afInfoLog(mapAFInAppEventType);
                force(mapAFInAppEventType);
                AFb1hSDK.AFInAppEventParameterName(this.force, this.e);
                afWarnLog = (afDebugLog + 71) % 128;
            } else {
                Intrinsics.checkNotNullExpressionValue(mapAFInAppEventType, "");
                registerClient(mapAFInAppEventType);
                afInfoLog(mapAFInAppEventType);
                force(mapAFInAppEventType);
                AFb1hSDK.AFInAppEventParameterName(this.force, this.e);
                throw null;
            }
        }
        Intrinsics.checkNotNullExpressionValue(mapAFInAppEventType, "");
        v(mapAFInAppEventType);
        AFLogger(mapAFInAppEventType);
        e(mapAFInAppEventType);
        AFInAppEventParameterName(mapAFInAppEventType, str2);
        AFKeystoreWrapper(mapAFInAppEventType, str);
        i(mapAFInAppEventType);
        if (aFc1cSDK != null) {
            int i2 = afWarnLog + 91;
            afDebugLog = i2 % 128;
            int i3 = i2 % 2;
            aFc1cSDK.AFInAppEventType(mapAFInAppEventType);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(@NotNull AFa1pSDK aFa1pSDK) {
        afDebugLog = (afWarnLog + ISO781611.SMT_TAG) % 128;
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Map<String, Object> mapAFInAppEventType = aFa1pSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(mapAFInAppEventType, "");
        mapAFInAppEventType.put("open_referrer", aFa1pSDK.values);
        String str = aFa1pSDK.AFLogger;
        if (str != null) {
            int i = afDebugLog + 21;
            afWarnLog = i % 128;
            if (i % 2 == 0) {
                d0.W(str);
                throw null;
            }
            if (d0.W(str)) {
                return;
            }
            mapAFInAppEventType.put("af_web_referrer", aFa1pSDK.AFLogger);
        }
    }

    private void w(@NotNull Map<String, Object> map) {
        afDebugLog = (afWarnLog + 13) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(this.values.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        afWarnLog = (afDebugLog + 71) % 128;
    }

    private void AFInAppEventType(@NotNull Map<String, Object> map, @NotNull String str) {
        afWarnLog = (afDebugLog + LDSFile.EF_DG2_TAG) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String strAFKeystoreWrapper = this.e.AFKeystoreWrapper("prev_event_name", (String) null);
            if (strAFKeystoreWrapper != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.e.AFInAppEventParameterName("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", strAFKeystoreWrapper);
                map.put("prev_event", jSONObject);
            }
            this.e.AFInAppEventParameterName("prev_event_name", str);
            this.e.values("prev_event_timestamp", System.currentTimeMillis());
            afWarnLog = (afDebugLog + 83) % 128;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    private final SimpleDateFormat valueOf() {
        int i = afWarnLog + 71;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            return (SimpleDateFormat) this.afRDLog.getValue();
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(@NotNull Map<String, Object> map, boolean z, @NotNull Function0<String> function0) {
        int i = afWarnLog + 105;
        afDebugLog = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(function0, "");
            AFInAppEventType(map);
            valueOf(map);
            afWarnLog(map);
            values(map, z);
            AFInAppEventType(map, function0);
            int i2 = 48 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(function0, "");
            AFInAppEventType(map);
            valueOf(map);
            afWarnLog(map);
            values(map, z);
            AFInAppEventType(map, function0);
        }
        int i3 = afWarnLog + 101;
        afDebugLog = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void valueOf(Map<String, Object> map) {
        PackageInfo packageInfo;
        int i = afWarnLog + 89;
        afDebugLog = i % 128;
        try {
            if (i % 2 != 0) {
                packageInfo = this.values.getPackageManager().getPackageInfo(this.values.getPackageName(), 0);
                if (packageInfo.versionCode > this.e.valueOf("versionCode", 1)) {
                    afWarnLog = (afDebugLog + 69) % 128;
                    this.e.AFInAppEventParameterName("versionCode", packageInfo.versionCode);
                }
            } else {
                packageInfo = this.values.getPackageManager().getPackageInfo(this.values.getPackageName(), 0);
                if (packageInfo.versionCode > this.e.valueOf("versionCode", 0)) {
                    afWarnLog = (afDebugLog + 69) % 128;
                    this.e.AFInAppEventParameterName("versionCode", packageInfo.versionCode);
                }
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            Context context = this.AFLogger.valueOf.AFKeystoreWrapper;
            map.put("app_version_name", AFb1vSDK.values(context, context.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(this.AFLogger.valueOf.AFKeystoreWrapper.getApplicationInfo().targetSdkVersion));
            long j2 = packageInfo.firstInstallTime;
            long j3 = packageInfo.lastUpdateTime;
            map.put("date1", valueOf().format(new Date(j2)));
            map.put("date2", valueOf().format(new Date(j3)));
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + Constants.TAG_POWER_OFF_TIMEOUT, Color.green(0) + 15, 13 - ExpandableListView.getPackedPositionGroup(0L), false, "\f\r\u000e￦\ufffb\u000f\b�\u0002\uffde\ufffb\u000e\uffff\u0000\u0003", objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat simpleDateFormatValueOf = valueOf();
            Intrinsics.checkNotNullExpressionValue(simpleDateFormatValueOf, "");
            map.put(strIntern, AFKeystoreWrapper(simpleDateFormatValueOf));
        } catch (Throwable th10) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th10, true);
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        AFi1uSDK aFi1uSDKAFInAppEventType;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1xSDK aFi1xSDK = this.registerClient.AFInAppEventType;
        if (aFi1xSDK != null) {
            int i = afDebugLog + 113;
            afWarnLog = i % 128;
            if (i % 2 != 0) {
                aFi1uSDKAFInAppEventType = aFi1xSDK.AFInAppEventType();
            } else {
                aFi1xSDK.AFInAppEventType();
                throw null;
            }
        } else {
            afDebugLog = (afWarnLog + 107) % 128;
            aFi1uSDKAFInAppEventType = null;
        }
        if (aFi1uSDKAFInAppEventType != null) {
            int i2 = afWarnLog + 53;
            afDebugLog = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("network", aFi1uSDKAFInAppEventType.AFKeystoreWrapper);
                map.put("ivc", Boolean.valueOf(aFi1uSDKAFInAppEventType.valueOf()));
                if (AFKeystoreWrapper().getBoolean("disableCollectNetworkData", false)) {
                    return;
                }
            } else {
                map.put("network", aFi1uSDKAFInAppEventType.AFKeystoreWrapper);
                map.put("ivc", Boolean.valueOf(aFi1uSDKAFInAppEventType.valueOf()));
                if (AFKeystoreWrapper().getBoolean("disableCollectNetworkData", false)) {
                    return;
                }
            }
            int i3 = afDebugLog;
            afWarnLog = (i3 + 13) % 128;
            int i5 = i3 + 91;
            afWarnLog = i5 % 128;
            if (i5 % 2 != 0) {
                String str = aFi1uSDKAFInAppEventType.AFInAppEventType;
                if (str != null) {
                    map.put("operator", str);
                }
                String str2 = aFi1uSDKAFInAppEventType.values;
                if (str2 != null) {
                    map.put("carrier", str2);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFKeystoreWrapper(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "ro.product.cpu.abi"
            java.lang.String r1 = valueOf(r1)
            java.lang.String r2 = "cpu_abi"
            r0.put(r2, r1)
            java.lang.String r1 = "ro.product.cpu.abi2"
            java.lang.String r1 = valueOf(r1)
            java.lang.String r2 = "cpu_abi2"
            r0.put(r2, r1)
            java.lang.String r1 = "os.arch"
            java.lang.String r1 = valueOf(r1)
            java.lang.String r2 = "arch"
            r0.put(r2, r1)
            java.lang.String r1 = "ro.build.display.id"
            java.lang.String r1 = valueOf(r1)
            java.lang.String r2 = "build_display_id"
            r0.put(r2, r1)
            if (r6 == 0) goto L77
            int r6 = com.appsflyer.internal.AFg1iSDK.afWarnLog
            int r6 = r6 + 39
            int r1 = r6 % 128
            com.appsflyer.internal.AFg1iSDK.afDebugLog = r1
            r1 = 2
            int r6 = r6 % r1
            r2 = 0
            java.lang.String r3 = "appsFlyerCount"
            if (r6 == 0) goto L59
            r4.d(r0)
            com.appsflyer.internal.AFd1sSDK r6 = r4.AFLogger
            com.appsflyer.internal.AFd1pSDK r6 = r6.values
            int r6 = r6.valueOf(r3, r2)
            if (r6 > r1) goto L77
            goto L66
        L59:
            r4.d(r0)
            com.appsflyer.internal.AFd1sSDK r6 = r4.AFLogger
            com.appsflyer.internal.AFd1pSDK r6 = r6.values
            int r6 = r6.valueOf(r3, r2)
            if (r6 > r1) goto L77
        L66:
            com.appsflyer.internal.AFj1zSDK r6 = r4.AFKeystoreWrapper
            java.util.Map r6 = r6.values()
            r0.putAll(r6)
            int r6 = com.appsflyer.internal.AFg1iSDK.afDebugLog
            int r6 = r6 + 13
            int r6 = r6 % 128
            com.appsflyer.internal.AFg1iSDK.afWarnLog = r6
        L77:
            com.appsflyer.internal.AFb1ySDK r6 = r4.valueOf
            android.content.Context r1 = r4.values
            java.util.Map r6 = r6.valueOf(r1)
            java.lang.String r1 = "dim"
            r0.put(r1, r6)
            java.lang.String r6 = "deviceData"
            r5.put(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper(java.util.Map, boolean):void");
    }

    private void AFInAppEventType(@NotNull Map<String, Object> map, @NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (AFKeystoreWrapper().getBoolean("collectFacebookAttrId", true)) {
            afDebugLog = (afWarnLog + 93) % 128;
            String str = null;
            try {
                this.values.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                str = (String) function0.invoke();
            } catch (PackageManager.NameNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", e, true);
                AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
            } catch (Throwable th10) {
                AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th10);
            }
            if (str != null) {
                int i = afDebugLog + 69;
                afWarnLog = i % 128;
                int i2 = i % 2;
                map.put("fb", str);
                if (i2 == 0) {
                    int i3 = 60 / 0;
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(@NotNull AFa1pSDK aFa1pSDK) {
        afWarnLog = (afDebugLog + 95) % 128;
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Map<String, Object> mapAFInAppEventType = aFa1pSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(mapAFInAppEventType, "");
        AFKeystoreWrapper(mapAFInAppEventType, aFa1pSDK.AFInAppEventParameterName());
        unregisterClient(mapAFInAppEventType);
        afErrorLog(mapAFInAppEventType);
        AFInAppEventParameterName(mapAFInAppEventType);
        valueOf(mapAFInAppEventType, this.v.AFInAppEventType);
        AFLogger$LogLevel(mapAFInAppEventType);
        mapAFInAppEventType.put("cell", r0.k(new Pair("mcc", Integer.valueOf(this.values.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.values.getResources().getConfiguration().mnc))));
        mapAFInAppEventType.put("sig", AFInAppEventParameterName());
        mapAFInAppEventType.put("last_boot_time", Long.valueOf(registerClient()));
        mapAFInAppEventType.put("disk", unregisterClient());
        int i = afDebugLog + 23;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static File AFInAppEventType(String str) {
        int i = afDebugLog + 69;
        afWarnLog = i % 128;
        try {
        } catch (Throwable th10) {
            AFLogger.afErrorLog(th10.getMessage(), th10);
        }
        if (i % 2 == 0) {
            throw null;
        }
        if (str != null) {
            if (d0.F0(str).toString().length() > 0) {
                afDebugLog = (afWarnLog + 9) % 128;
                return new File(d0.F0(str).toString());
            }
            afWarnLog = (afDebugLog + 85) % 128;
        }
        return null;
    }

    private final AppsFlyerProperties AFKeystoreWrapper() {
        int i = afDebugLog + 31;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            return (AppsFlyerProperties) this.i.getValue();
        }
        int i2 = 8 / 0;
        return (AppsFlyerProperties) this.i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.appsflyer.internal.AFg1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFKeystoreWrapper(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFa1pSDK r6) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper(com.appsflyer.internal.AFa1pSDK):void");
    }

    private static void AFInAppEventParameterName(@NotNull Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            int i = afWarnLog + 93;
            afDebugLog = i % 128;
            int i2 = i % 2;
            map.put("phone", str);
            if (i2 != 0) {
                throw null;
            }
            afDebugLog = (afWarnLog + 41) % 128;
        }
    }

    private String AFInAppEventParameterName() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        afWarnLog = (afDebugLog + 9) % 128;
        String strAFInAppEventParameterName = AFb1vSDK.AFInAppEventParameterName(this.values.getApplicationContext().getPackageManager(), this.values.getApplicationContext().getPackageName());
        afWarnLog = (afDebugLog + ISO781611.SMT_TAG) % 128;
        return strAFInAppEventParameterName;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String AFInAppEventParameterName(java.lang.String r4) {
        /*
            r3 = this;
            com.appsflyer.AppsFlyerProperties r0 = r3.AFKeystoreWrapper()
            java.lang.String r1 = "collectAndroidId"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r1 = 0
            if (r0 == 0) goto L37
            if (r4 == 0) goto L24
            int r0 = com.appsflyer.internal.AFg1iSDK.afWarnLog
            int r0 = r0 + 105
            int r2 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.afDebugLog = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L23
            int r0 = r4.length()
            if (r0 != 0) goto L37
            goto L24
        L23:
            throw r1
        L24:
            boolean r4 = r3.i()
            if (r4 == 0) goto L47
            int r4 = com.appsflyer.internal.AFg1iSDK.afWarnLog
            int r4 = r4 + 21
            int r4 = r4 % 128
            com.appsflyer.internal.AFg1iSDK.afDebugLog = r4
            java.lang.String r4 = r3.force()
            return r4
        L37:
            if (r4 == 0) goto L47
            int r0 = com.appsflyer.internal.AFg1iSDK.afDebugLog
            int r0 = r0 + 63
            int r2 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.afWarnLog = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L46
            return r4
        L46:
            throw r1
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.AFInAppEventParameterName(java.lang.String):java.lang.String");
    }

    private static String valueOf(String str) {
        afDebugLog = (afWarnLog + LDSFile.EF_SOD_TAG) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (objInvoke != null) {
                String str2 = (String) objInvoke;
                int i = afDebugLog + 57;
                afWarnLog = i % 128;
                if (i % 2 == 0) {
                    int i2 = 97 / 0;
                }
                return str2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th10) {
            AFLogger.afErrorLog(th10.getMessage(), th10);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final Long values() throws PackageManager.NameNotFoundException {
        int i = afDebugLog;
        afWarnLog = (i + 59) % 128;
        Context context = this.force.AFKeystoreWrapper;
        if (context != null) {
            afWarnLog = (i + 69) % 128;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                int i2 = afWarnLog + 107;
                afDebugLog = i2 % 128;
                if (i2 % 2 == 0) {
                    String packageName = context.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "");
                    PackageInfo packageInfoAFKeystoreWrapper = AFKeystoreWrapper(packageManager, packageName);
                    if (packageInfoAFKeystoreWrapper != null) {
                        return Long.valueOf(packageInfoAFKeystoreWrapper.firstInstallTime);
                    }
                } else {
                    String packageName2 = context.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName2, "");
                    AFKeystoreWrapper(packageManager, packageName2);
                    throw null;
                }
            }
        }
        return null;
    }

    private static boolean AFInAppEventParameterName(File file) {
        int i = afDebugLog;
        int i2 = i + 55;
        afWarnLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (file != null) {
            afWarnLog = (i + 7) % 128;
            if (file.exists()) {
                return false;
            }
        }
        int i3 = afWarnLog + 7;
        afDebugLog = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static void values(@NotNull Map<String, Object> map, boolean z) {
        int i = afWarnLog + 5;
        afDebugLog = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(z));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(z));
        int i2 = afWarnLog + 95;
        afDebugLog = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static String values(AFd1pSDK aFd1pSDK, String str) {
        int i = afWarnLog + 71;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            String strAFKeystoreWrapper = aFd1pSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
            if (strAFKeystoreWrapper != null) {
                afDebugLog = (afWarnLog + 13) % 128;
                return strAFKeystoreWrapper;
            }
            aFd1pSDK.AFInAppEventParameterName("CACHED_CHANNEL", str);
            return str;
        }
        aFd1pSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
        throw null;
    }

    private static String values(File file, String str) {
        InputStreamReader inputStreamReader;
        Properties properties;
        int i = afWarnLog;
        afDebugLog = (i + 57) % 128;
        try {
            try {
                if (file == null) {
                    afDebugLog = (i + 85) % 128;
                    return null;
                }
                try {
                    properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                } catch (FileNotFoundException unused) {
                    inputStreamReader = null;
                } catch (Throwable th10) {
                    th = th10;
                    inputStreamReader = null;
                }
                try {
                    properties.load(inputStreamReader);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader.close();
                        return property;
                    } catch (Throwable th11) {
                        AFLogger.afErrorLog(th11.getMessage(), th11);
                        return property;
                    }
                } catch (FileNotFoundException unused2) {
                    StringBuilder sb6 = new StringBuilder("PreInstall file wasn't found: ");
                    sb6.append(file.getAbsolutePath());
                    AFLogger.afDebugLog(sb6.toString());
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                        afDebugLog = (afWarnLog + LDSFile.EF_DG13_TAG) % 128;
                    }
                    afWarnLog = (afDebugLog + 59) % 128;
                    return null;
                } catch (Throwable th12) {
                    th = th12;
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    afWarnLog = (afDebugLog + 59) % 128;
                    return null;
                }
            } catch (Throwable th13) {
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th14) {
                        AFLogger.afErrorLog(th14.getMessage(), th14);
                    }
                }
                throw th13;
            }
        } catch (Throwable th15) {
            AFLogger.afErrorLog(th15.getMessage(), th15);
        }
        afWarnLog = (afDebugLog + 59) % 128;
        return null;
    }

    private static PackageInfo AFKeystoreWrapper(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        int i = afWarnLog + LDSFile.EF_DG15_TAG;
        afDebugLog = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 126) {
            int i2 = afWarnLog + LDSFile.EF_SOD_TAG;
            afDebugLog = i2 % 128;
            if (i2 % 2 != 0) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                Intrinsics.checkNotNullExpressionValue(packageInfo, "");
                return packageInfo;
            }
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
            return packageInfo2;
        }
        PackageInfo packageInfo3 = packageManager.getPackageInfo(str, 0);
        Intrinsics.checkNotNullExpressionValue(packageInfo3, "");
        return packageInfo3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFKeystoreWrapper(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFg1iSDK.afWarnLog
            int r0 = r0 + 47
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.afDebugLog = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            java.lang.String r2 = "referrer"
            if (r0 == 0) goto L1b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            r0 = 75
            int r0 = r0 / 0
            if (r5 == 0) goto L33
            goto L20
        L1b:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            if (r5 == 0) goto L33
        L20:
            int r0 = r5.length()
            if (r0 != 0) goto L27
            goto L33
        L27:
            int r0 = com.appsflyer.internal.AFg1iSDK.afDebugLog
            int r0 = r0 + 89
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.afWarnLog = r0
            r4.put(r2, r5)
            goto L3b
        L33:
            int r5 = com.appsflyer.internal.AFg1iSDK.afWarnLog
            int r5 = r5 + 33
            int r5 = r5 % 128
            com.appsflyer.internal.AFg1iSDK.afDebugLog = r5
        L3b:
            com.appsflyer.internal.AFd1pSDK r5 = r3.e
            r0 = 0
            java.lang.String r1 = "extraReferrers"
            java.lang.String r5 = r5.AFKeystoreWrapper(r1, r0)
            if (r5 == 0) goto L49
            r4.put(r1, r5)
        L49:
            com.appsflyer.AppsFlyerProperties r5 = r3.AFKeystoreWrapper()
            com.appsflyer.internal.AFd1pSDK r0 = r3.e
            java.lang.String r5 = r5.getReferrer(r0)
            if (r5 == 0) goto L6d
            int r0 = r5.length()
            if (r0 != 0) goto L5c
            goto L6d
        L5c:
            int r0 = com.appsflyer.internal.AFg1iSDK.afDebugLog
            int r0 = r0 + 37
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.afWarnLog = r0
            java.lang.Object r0 = r4.get(r2)
            if (r0 != 0) goto L6d
            r4.put(r2, r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper(java.util.Map, java.lang.String):void");
    }

    private final String AFKeystoreWrapper(String str) {
        afDebugLog = (afWarnLog + 87) % 128;
        String strAFInAppEventType = this.AFLogger.AFInAppEventType(str);
        afDebugLog = (afWarnLog + 35) % 128;
        return strAFInAppEventType;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r0
      0x0025: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v16 java.lang.String) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFg1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFKeystoreWrapper(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r10 = this;
            int r0 = com.appsflyer.internal.AFg1iSDK.afDebugLog
            int r0 = r0 + 17
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.afWarnLog = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            if (r0 != 0) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            com.appsflyer.internal.AFd1oSDK r0 = r10.v
            java.lang.String r0 = r0.valueOf
            r1 = 62
            int r1 = r1 / 0
            if (r0 == 0) goto L8a
            goto L25
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            com.appsflyer.internal.AFd1oSDK r0 = r10.v
            java.lang.String r0 = r0.valueOf
            if (r0 == 0) goto L8a
        L25:
            java.lang.String r1 = "af_deeplink"
            java.lang.Object r2 = r11.get(r1)
            if (r2 == 0) goto L33
            java.lang.String r11 = "Skip 'af' payload as deeplink was found by path"
            com.appsflyer.AFLogger.afDebugLog(r11)
            goto L92
        L33:
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L4c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "isPush"
            java.lang.String r3 = "true"
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L4c
            r11.put(r1, r0)     // Catch: java.lang.Throwable -> L4c
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L4c
            goto L54
        L4c:
            r0 = move-exception
            r11 = r0
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r11 = yhm.o.a(r11)
        L54:
            java.lang.Throwable r3 = yhm.m.a(r11)
            if (r3 == 0) goto L85
            int r11 = com.appsflyer.internal.AFg1iSDK.afWarnLog
            int r11 = r11 + 21
            int r0 = r11 % 128
            com.appsflyer.internal.AFg1iSDK.afDebugLog = r0
            int r11 = r11 % 2
            if (r11 == 0) goto L77
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1bSDK r1 = com.appsflyer.internal.AFg1bSDK.GENERAL
            r8 = 93
            r9 = 0
            java.lang.String r2 = "Exception while trying to create JSONObject from pushPayload"
            r4 = 1
            r5 = 1
            r6 = 0
            r7 = 1
        L73:
            com.appsflyer.internal.AFg1cSDK.e$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L92
        L77:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1bSDK r1 = com.appsflyer.internal.AFg1bSDK.GENERAL
            r8 = 120(0x78, float:1.68E-43)
            r9 = 0
            java.lang.String r2 = "Exception while trying to create JSONObject from pushPayload"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            goto L73
        L85:
            int r11 = com.appsflyer.internal.AFg1iSDK.afDebugLog
            int r11 = r11 + 11
            goto L8e
        L8a:
            int r11 = com.appsflyer.internal.AFg1iSDK.afDebugLog
            int r11 = r11 + 119
        L8e:
            int r11 = r11 % 128
            com.appsflyer.internal.AFg1iSDK.afWarnLog = r11
        L92:
            com.appsflyer.internal.AFd1oSDK r11 = r10.v
            r0 = 0
            r11.valueOf = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper(java.util.Map):void");
    }

    private static void AFKeystoreWrapper(@NotNull Map<String, Object> map, @NotNull AFa1pSDK aFa1pSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        String str = aFa1pSDK.e;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFa1pSDK.valueOf;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }
}
