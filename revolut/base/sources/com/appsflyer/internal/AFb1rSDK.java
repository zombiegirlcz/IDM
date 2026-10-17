package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFd1uSDK;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass4;
import com.appsflyer.internal.AFf1lSDK;
import com.appsflyer.internal.AFg1vSDK;
import com.appsflyer.internal.AFi1bSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import java.net.URI;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1rSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFInAppEventParameterName;
    static AppsFlyerInAppPurchaseValidatorListener AFKeystoreWrapper = null;
    private static AFb1rSDK AFLogger = null;
    private static char[] afDebugLog = null;
    private static int afErrorLog = 0;
    private static char afVerboseLog = 0;
    private static int afWarnLog = 1;
    public static final String valueOf;
    static final String values;
    private AFf1aSDK afRDLog;

    @NonNull
    private final AFd1kSDK force;
    private SharedPreferences i;
    private Map<Long, String> registerClient;
    private boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Application f26017w;
    public volatile AppsFlyerConversionListener AFInAppEventType = null;
    private long e = -1;
    private long unregisterClient = -1;
    private long d = TimeUnit.SECONDS.toMillis(5);
    private boolean afInfoLog = false;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1rSDK$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            values = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class AFa1tSDK implements Runnable {
        private final AFa1pSDK valueOf;

        public /* synthetic */ AFa1tSDK(AFb1rSDK aFb1rSDK, AFa1pSDK aFa1pSDK, byte b4) {
            this(aFa1pSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1rSDK.valueOf(AFb1rSDK.this, this.valueOf);
        }

        private AFa1tSDK(AFa1pSDK aFa1pSDK) {
            this.valueOf = aFa1pSDK;
        }
    }

    public class AFa1uSDK implements AFe1eSDK {
        private AFa1uSDK() {
        }

        private boolean AFInAppEventParameterName() {
            return AFb1rSDK.this.AFInAppEventType != null;
        }

        @Override // com.appsflyer.internal.AFe1eSDK
        public final void AFKeystoreWrapper(AFf1xSDK<?> aFf1xSDK) {
            if (aFf1xSDK instanceof AFf1fSDK) {
                AFb1rSDK.this.AFInAppEventType().registerClient().AFKeystoreWrapper(((AFf1gSDK) aFf1xSDK).AFLogger.registerClient);
            }
        }

        @Override // com.appsflyer.internal.AFe1eSDK
        public final void values(AFf1xSDK<?> aFf1xSDK) {
        }

        public /* synthetic */ AFa1uSDK(AFb1rSDK aFb1rSDK, byte b4) {
            this();
        }

        @Override // com.appsflyer.internal.AFe1eSDK
        public final void AFKeystoreWrapper(AFf1xSDK<?> aFf1xSDK, AFe1fSDK aFe1fSDK) {
            JSONObject jSONObjectAFKeystoreWrapper;
            AFg1jSDK aFg1jSDKAFKeystoreWrapper;
            if (aFf1xSDK instanceof AFf1gSDK) {
                AFf1gSDK aFf1gSDK = (AFf1gSDK) aFf1xSDK;
                boolean z = aFf1xSDK instanceof AFf1fSDK;
                if (z && AFInAppEventParameterName()) {
                    AFf1fSDK aFf1fSDK = (AFf1fSDK) aFf1xSDK;
                    if (aFf1fSDK.values == AFe1fSDK.SUCCESS || aFf1fSDK.AFInAppEventType == 1) {
                        AFg1hSDK aFg1hSDK = new AFg1hSDK(aFf1fSDK, AFb1rSDK.this.AFInAppEventType().AFInAppEventType());
                        AFe1aSDK aFe1aSDKW = AFb1rSDK.this.AFInAppEventType().w();
                        aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(aFg1hSDK));
                    }
                }
                if (aFe1fSDK == AFe1fSDK.SUCCESS) {
                    AFb1rSDK aFb1rSDK = AFb1rSDK.this;
                    aFb1rSDK.AFInAppEventType(AFb1rSDK.AFInAppEventParameterName(aFb1rSDK)).AFInAppEventParameterName("sentSuccessfully", "true");
                    if (!(aFf1xSDK instanceof AFf1cSDK) && (aFg1jSDKAFKeystoreWrapper = new AFg1lSDK(AFb1rSDK.AFInAppEventParameterName(AFb1rSDK.this)).AFKeystoreWrapper()) != null && aFg1jSDKAFKeystoreWrapper.values()) {
                        String str = aFg1jSDKAFKeystoreWrapper.AFKeystoreWrapper;
                        AFLogger.INSTANCE.d(AFg1bSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFg1lSDK.AFKeystoreWrapper(str);
                    }
                    ResponseNetwork responseNetwork = ((AFf1qSDK) aFf1gSDK).d;
                    if (responseNetwork != null && (jSONObjectAFKeystoreWrapper = AFc1rSDK.AFKeystoreWrapper((String) responseNetwork.getBody())) != null) {
                        AFb1rSDK.values(AFb1rSDK.this, jSONObjectAFKeystoreWrapper.optBoolean("send_background", false));
                    }
                    if (z) {
                        AFb1rSDK.AFInAppEventParameterName(AFb1rSDK.this, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFf1xSDK instanceof AFg1hSDK) || aFe1fSDK == AFe1fSDK.SUCCESS) {
                return;
            }
            AFg1eSDK aFg1eSDK = new AFg1eSDK(AFb1rSDK.this.AFInAppEventType());
            AFe1aSDK aFe1aSDKW2 = AFb1rSDK.this.AFInAppEventType().w();
            aFe1aSDKW2.AFInAppEventParameterName.execute(aFe1aSDKW2.new AnonymousClass4(aFg1eSDK));
        }
    }

    static {
        AFKeystoreWrapper();
        values = "292";
        valueOf = "6.14";
        StringBuilder sb6 = new StringBuilder();
        sb6.append("6.14");
        sb6.append("/androidevent?buildnumber=6.14.2&app_id=");
        AFInAppEventParameterName = sb6.toString();
        AFKeystoreWrapper = null;
        AFLogger = new AFb1rSDK();
        afWarnLog = (afErrorLog + 81) % 128;
    }

    public AFb1rSDK() {
        AFVersionDeclaration.init();
        this.force = new AFd1kSDK();
        AFInAppEventType().AFLogger$LogLevel().valueOf();
        AFInAppEventType().AFLogger$LogLevel().values();
        AFe1aSDK aFe1aSDKW = AFInAppEventType().w();
        aFe1aSDKW.values.add(new AFa1uSDK(this, (byte) 0));
    }

    public static /* synthetic */ long AFInAppEventParameterName(AFb1rSDK aFb1rSDK, long j2) {
        int i = afWarnLog;
        afErrorLog = (i + 31) % 128;
        aFb1rSDK.unregisterClient = j2;
        afErrorLog = (i + 79) % 128;
        return j2;
    }

    public static /* synthetic */ void AFInAppEventType(AFb1rSDK aFb1rSDK) {
        afErrorLog = (afWarnLog + 21) % 128;
        aFb1rSDK.AFLogger();
        int i = afWarnLog + 67;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static void AFKeystoreWrapper() {
        afDebugLog = new char[]{50047, 50018, 50000, 50022, 50030, 50044, 50026, 50025, 50043};
        afVerboseLog = (char) 63126;
    }

    private void AFLogger() {
        afWarnLog = (afErrorLog + 51) % 128;
        if (AFf1mSDK.AFLogger()) {
            return;
        }
        AFd1fSDK aFd1fSDKAFInAppEventType = AFInAppEventType();
        AFe1aSDK aFe1aSDKW = aFd1fSDKAFInAppEventType.w();
        aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(new AFf1mSDK(aFd1fSDKAFInAppEventType)));
        afWarnLog = (afErrorLog + 33) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient() {
        AFInAppEventType(new AFh1oSDK());
        afWarnLog = (afErrorLog + 33) % 128;
    }

    @NonNull
    private AFi1bSDK[] unregisterClient() {
        AFi1bSDK[] aFi1bSDKArrValueOf;
        int i = afErrorLog + 13;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            aFi1bSDKArrValueOf = AFInAppEventType().force().valueOf();
            int i2 = 51 / 0;
        } else {
            aFi1bSDKArrValueOf = AFInAppEventType().force().valueOf();
        }
        afErrorLog = (afWarnLog + ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG) % 128;
        return aFi1bSDKArrValueOf;
    }

    public static /* synthetic */ void valueOf(AFb1rSDK aFb1rSDK, AFa1pSDK aFa1pSDK) {
        afWarnLog = (afErrorLog + LDSFile.EF_DG15_TAG) % 128;
        aFb1rSDK.AFInAppEventType(aFa1pSDK);
        afWarnLog = (afErrorLog + 75) % 128;
    }

    public static /* synthetic */ boolean values(AFb1rSDK aFb1rSDK, boolean z) {
        int i = afErrorLog;
        int i2 = i + 57;
        afWarnLog = i2 % 128;
        int i3 = i2 % 2;
        aFb1rSDK.afInfoLog = z;
        if (i3 == 0) {
            throw null;
        }
        int i5 = i + 9;
        afWarnLog = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return z;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        afErrorLog = (afWarnLog + 67) % 128;
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = AFInAppEventType().afDebugLog().values;
        if (list.contains(listAsList)) {
            return;
        }
        int i = afWarnLog + 1;
        afErrorLog = i % 128;
        int i2 = i % 2;
        list.add(listAsList);
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = afWarnLog + LDSFile.EF_SOD_TAG;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            AFb1aSDK aFb1aSDKI = AFInAppEventType().i();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z);
            aFb1aSDKI.AFInAppEventParameterName("anonymizeUser", strArr);
        } else {
            AFInAppEventType().i().AFInAppEventParameterName("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", z);
        int i2 = afErrorLog + LDSFile.EF_DG13_TAG;
        afWarnLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = afErrorLog + 113;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            AFc1tSDK aFc1tSDKAfDebugLog = AFInAppEventType().afDebugLog();
            aFc1tSDKAfDebugLog.AFInAppEventParameterName = str;
            aFc1tSDKAfDebugLog.AFKeystoreWrapper = map;
            int i2 = 95 / 0;
        } else {
            AFc1tSDK aFc1tSDKAfDebugLog2 = AFInAppEventType().afDebugLog();
            aFc1tSDKAfDebugLog2.AFInAppEventParameterName = str;
            aFc1tSDKAfDebugLog2.AFKeystoreWrapper = map;
        }
        afErrorLog = (afWarnLog + LDSFile.EF_DG15_TAG) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        afErrorLog = (afWarnLog + LDSFile.EF_SOD_TAG) % 128;
        AFInAppEventType().afErrorLog().AFInAppEventParameterName(z);
        int i = afWarnLog + 49;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        afWarnLog = (afErrorLog + 101) % 128;
        AFInAppEventParameterName("enableTCFDataCollection", Boolean.toString(z));
        int i = afWarnLog + 29;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(@NonNull Context context) {
        afErrorLog = (afWarnLog + 69) % 128;
        AFInAppEventType().i().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
        if (context == null) {
            int i = afWarnLog + 49;
            afErrorLog = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        }
        valueOf(context);
        AFd1sSDK aFd1sSDKValueOf = AFInAppEventType().valueOf();
        String strAFInAppEventType = AFb1jSDK.AFInAppEventType(aFd1sSDKValueOf.valueOf, aFd1sSDKValueOf.values);
        int i2 = afWarnLog + ISO781611.SMT_TAG;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            return strAFInAppEventType;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String strAFInAppEventType = new AFb1lSDK(context, AFInAppEventType()).AFInAppEventType();
            int i = afWarnLog + LDSFile.EF_DG13_TAG;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                int i2 = 49 / 0;
            }
            return strAFInAppEventType;
        } catch (Throwable th10) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th10);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        String strAFInAppEventType;
        int i = afWarnLog + 59;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            strAFInAppEventType = AFInAppEventType().afRDLog().AFInAppEventType();
            int i2 = 91 / 0;
        } else {
            strAFInAppEventType = AFInAppEventType().afRDLog().AFInAppEventType();
        }
        afErrorLog = (afWarnLog + 97) % 128;
        return strAFInAppEventType;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i = afErrorLog + 65;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            AFInAppEventType().afRDLog().AFKeystoreWrapper();
            throw null;
        }
        String strAFKeystoreWrapper = AFInAppEventType().afRDLog().AFKeystoreWrapper();
        afErrorLog = (afWarnLog + LDSFile.EF_DG13_TAG) % 128;
        return strAFKeystoreWrapper;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            afErrorLog = (afWarnLog + 21) % 128;
            return string;
        }
        String strAFKeystoreWrapper = AFKeystoreWrapper(context, "AF_STORE");
        if (strAFKeystoreWrapper == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i = afErrorLog + 15;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            return strAFKeystoreWrapper;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        afErrorLog = (afWarnLog + 85) % 128;
        AFInAppEventType().i().AFInAppEventParameterName("getSdkVersion", new String[0]);
        String strRegisterClient = AFd1sSDK.registerClient();
        int i = afWarnLog + 17;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            return strRegisterClient;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        long j2;
        if (this.v) {
            afWarnLog = (afErrorLog + 63) % 128;
            return this;
        }
        this.v = true;
        AFInAppEventType().v().AFLogger = str;
        AFb1kSDK.values(str);
        if (context != null) {
            valueOf(context);
            Application applicationValues = AFb1vSDK.values(context);
            if (applicationValues == null) {
                return this;
            }
            int i = afWarnLog + 123;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                this.f26017w = applicationValues;
                throw null;
            }
            this.f26017w = applicationValues;
            AFInAppEventType().afWarnLog().AFInAppEventType();
            AFInAppEventType().registerClient().AFInAppEventType = System.currentTimeMillis();
            AFe1aSDK aFe1aSDKW = AFInAppEventType().w();
            aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(new AFf1pSDK(AFInAppEventType())));
            AFi1vSDK aFi1vSDKAFPurchaseDetails = AFInAppEventType().AFPurchaseDetails();
            aFi1vSDKAFPurchaseDetails.AFInAppEventType = Build.VERSION.SDK_INT >= 31 ? new AFi1tSDK(aFi1vSDKAFPurchaseDetails.valueOf) : new AFi1wSDK(aFi1vSDKAFPurchaseDetails.valueOf);
            AFInAppEventType().getPrice().AFKeystoreWrapper(new c(this));
            AFInAppEventType().e().values(e());
            AFi1cSDK aFi1cSDKForce = AFInAppEventType().force();
            a aVar = new a(this, 1);
            AFi1lSDK aFi1lSDKValueOf = aFi1cSDKForce.valueOf(aVar);
            Runnable runnableAFInAppEventType = aFi1cSDKForce.AFInAppEventType(aFi1lSDKValueOf, aVar);
            aFi1cSDKForce.AFInAppEventParameterName(aFi1lSDKValueOf);
            aFi1cSDKForce.AFInAppEventParameterName(new AFi1eSDK(aFi1cSDKForce.AFInAppEventType.valueOf(), runnableAFInAppEventType));
            aFi1cSDKForce.AFInAppEventParameterName(new AFi1hSDK(runnableAFInAppEventType, aFi1cSDKForce.AFInAppEventType, new AFi1jSDK()));
            aFi1cSDKForce.AFInAppEventParameterName(new AFi1aSDK(runnableAFInAppEventType, aFi1cSDKForce.AFInAppEventType));
            aFi1cSDKForce.AFInAppEventType(runnableAFInAppEventType);
            if (!aFi1cSDKForce.AFKeystoreWrapper()) {
                Context context2 = aFi1cSDKForce.AFInAppEventType.afInfoLog().AFKeystoreWrapper;
                AFd1fSDK aFd1fSDK = aFi1cSDKForce.AFInAppEventType;
                List<ResolveInfo> listQueryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (listQueryIntentContentProviders != null && !listQueryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it8 = listQueryIntentContentProviders.iterator();
                    while (it8.hasNext()) {
                        ProviderInfo providerInfo = it8.next().providerInfo;
                        if (providerInfo != null) {
                            arrayList.add(new AFi1dSDK(providerInfo, runnableAFInAppEventType, aFd1fSDK));
                        } else {
                            AFLogger.INSTANCE.w(AFg1bSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        aFi1cSDKForce.AFKeystoreWrapper.addAll(arrayList);
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1bSDK aFg1bSDK = AFg1bSDK.PREINSTALL;
                        StringBuilder sb6 = new StringBuilder("Detected ");
                        sb6.append(arrayList.size());
                        sb6.append(" valid preinstall provider(s)");
                        aFLogger.d(aFg1bSDK, sb6.toString());
                    }
                }
            }
            for (AFi1bSDK aFi1bSDK : aFi1cSDKForce.valueOf()) {
                aFi1bSDK.values(aFi1cSDKForce.AFInAppEventType.afInfoLog().AFKeystoreWrapper);
            }
            final AFg1wSDK aFg1wSDKV = this.force.v();
            AFd1sSDK aFd1sSDKValueOf = AFInAppEventType().valueOf();
            aFg1wSDKV.values = System.currentTimeMillis();
            AFg1vSDK aFg1vSDK = aFg1wSDKV.AFKeystoreWrapper;
            StringBuilder sb9 = new StringBuilder();
            sb9.append(AFb1jSDK.AFInAppEventType(aFd1sSDKValueOf.valueOf, aFd1sSDKValueOf.values));
            sb9.append(aFg1wSDKV.values);
            byte[] bArrValueOf = AFb1mSDK.valueOf(sb9.toString());
            if (bArrValueOf == null || bArrValueOf.length <= 0) {
                j2 = -1;
            } else {
                if (bArrValueOf.length > 8) {
                    int i2 = afWarnLog + 67;
                    afErrorLog = i2 % 128;
                    bArrValueOf = i2 % 2 != 0 ? Arrays.copyOfRange(bArrValueOf, 1, 112) : Arrays.copyOfRange(bArrValueOf, 0, 8);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.put(bArrValueOf);
                byteBufferAllocate.flip();
                j2 = byteBufferAllocate.getLong();
                afWarnLog = (afErrorLog + 95) % 128;
            }
            aFg1wSDKV.AFInAppEventType = aFg1vSDK.AFInAppEventType(j2, aFg1wSDKV.valueOf.AFKeystoreWrapper, new AFg1vSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFg1wSDK.4
                @Override // com.appsflyer.internal.AFg1vSDK.AFa1tSDK
                public final void AFInAppEventType(String str2, Exception exc2) {
                    AFg1wSDK.this.AFInAppEventParameterName = new ConcurrentHashMap();
                    String message = exc2.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    AFg1wSDK.this.AFInAppEventType();
                    AFg1wSDK.this.AFInAppEventParameterName.put("error", message);
                    AFLogger.afErrorLog(str2, exc2, true, true, false);
                }

                @Override // com.appsflyer.internal.AFg1vSDK.AFa1tSDK
                public final void values(@NonNull String str2, @NonNull String str3) {
                    AFg1wSDK.this.AFInAppEventParameterName = new ConcurrentHashMap();
                    AFg1wSDK.this.AFInAppEventParameterName.put("signedData", str2);
                    AFg1wSDK.this.AFInAppEventParameterName.put("signature", str3);
                    AFg1wSDK.this.AFInAppEventType();
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }
            });
        } else {
            AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFInAppEventType().i().AFInAppEventParameterName("init", str, appsFlyerConversionListener == null ? "null" : "conversionDataListener");
        AFLogger.INSTANCE.force(AFg1bSDK.GENERAL, "Initializing AppsFlyer SDK: (v6.14.2." + values + ")");
        this.AFInAppEventType = appsFlyerConversionListener;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if ((r4.getPackageManager().getApplicationInfo(r4.getPackageName(), 0).flags & 1) != 0) goto L12;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isPreInstalledApp(android.content.Context r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1rSDK.afErrorLog
            int r0 = r0 + 121
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afWarnLog = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L22
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            int r4 = r4.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            r4 = r4 & r2
            if (r4 == 0) goto L34
            goto L33
        L20:
            r4 = move-exception
            goto L3d
        L22:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            int r4 = r4.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            r4 = r4 & r2
            if (r4 == 0) goto L34
        L33:
            return r2
        L34:
            int r4 = com.appsflyer.internal.AFb1rSDK.afErrorLog
            int r4 = r4 + 27
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1rSDK.afWarnLog = r4
            goto L42
        L3d:
            java.lang.String r0 = "Could not check if app is pre installed"
            com.appsflyer.AFLogger.afErrorLog(r0, r4)
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.isPreInstalledApp(android.content.Context):boolean");
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i = afErrorLog + 63;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            return AFInAppEventType().v().valueOf();
        }
        int i2 = 49 / 0;
        return AFInAppEventType().v().valueOf();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = afErrorLog + 57;
        afWarnLog = i % 128;
        int i2 = i % 2;
        logEvent(context, str, map, null);
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d5) {
        AFInAppEventType().i().AFInAppEventParameterName("logLocation", String.valueOf(d), String.valueOf(d5));
        HashMap map = new HashMap();
        map.put("af_long", Double.toString(d5));
        map.put("af_lat", Double.toString(d));
        values(context, "af_location_coordinates", map);
        int i = afWarnLog + 63;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 46 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        afErrorLog = (afWarnLog + 19) % 128;
        AFInAppEventType().i().AFInAppEventParameterName("logSession", new String[0]);
        AFInAppEventType().i().AFInAppEventParameterName();
        AFInAppEventParameterName(context, AFh1xSDK.logSession);
        values(context, null, null);
        int i = afErrorLog + 35;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = afErrorLog + 81;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFKeystoreWrapper();
        } else {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFKeystoreWrapper();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri2) {
        int i = afWarnLog + 71;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (uri2 != null && !uri2.toString().isEmpty()) {
            if (context != null) {
                valueOf(context);
                AFInAppEventType().afDebugLog().AFKeystoreWrapper(context, AFc1oSDK.AFInAppEventType(AFInAppEventType().getPurchaseToken()), Uri.parse(uri2.toString()));
                return;
            }
            AFc1tSDK aFc1tSDKAfDebugLog = AFInAppEventType().afDebugLog();
            StringBuilder sb6 = new StringBuilder("Context is \"");
            sb6.append(context);
            sb6.append("\"");
            aFc1tSDKAfDebugLog.AFInAppEventType(sb6.toString(), DeepLinkResult.Error.NETWORK);
            return;
        }
        AFc1tSDK aFc1tSDKAfDebugLog2 = AFInAppEventType().afDebugLog();
        StringBuilder sb9 = new StringBuilder("Link is \"");
        sb9.append(uri2);
        sb9.append("\"");
        aFc1tSDKAfDebugLog2.AFInAppEventType(sb9.toString(), DeepLinkResult.Error.NETWORK);
        int i2 = afWarnLog + LDSFile.EF_DG2_TAG;
        afErrorLog = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context) {
        if (intent == null) {
            afErrorLog = (afWarnLog + ISO781611.SMT_TAG) % 128;
            AFInAppEventType().afDebugLog().AFInAppEventType("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            valueOf(applicationContext);
            AFInAppEventType().AFKeystoreWrapper().execute(new b0.d(this, 1, applicationContext, intent));
        } else {
            int i = afWarnLog + 41;
            afErrorLog = i % 128;
            if (i % 2 == 0) {
                AFInAppEventType().afDebugLog().AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            } else {
                AFInAppEventType().afDebugLog().AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        afErrorLog = (afWarnLog + 91) % 128;
        AFInAppEventType().i().AFInAppEventParameterName("registerConversionListener", new String[0]);
        values(appsFlyerConversionListener);
        int i = afWarnLog + 73;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        afErrorLog = (afWarnLog + 33) % 128;
        AFInAppEventType().i().AFInAppEventParameterName("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            AFKeystoreWrapper = appsFlyerInAppPurchaseValidatorListener;
            return;
        }
        int i = afWarnLog + 53;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int iValues = values(AFInAppEventType(context));
        HashMap map2 = new HashMap();
        map2.put("ad_network", map);
        map2.put("adimpression_counter", Integer.valueOf(iValues));
        AFInAppEventParameterName(context, map2, new AFh1qSDK());
        afErrorLog = (afWarnLog + LDSFile.EF_DG2_TAG) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int iAFKeystoreWrapper = AFKeystoreWrapper(AFInAppEventType(context));
        HashMap map2 = new HashMap();
        map2.put("ad_network", map);
        map2.put("adrevenue_counter", Integer.valueOf(iAFKeystoreWrapper));
        AFInAppEventParameterName(context, map2, new AFh1sSDK());
        afWarnLog = (afErrorLog + 15) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        afWarnLog = (afErrorLog + 71) % 128;
        valueOf(context);
        PurchaseHandler purchaseHandlerD = AFInAppEventType().d();
        if (purchaseHandlerD.AFInAppEventType(map, purchaseValidationCallback, "purchases")) {
            AFf1nSDK aFf1nSDK = new AFf1nSDK(map, purchaseValidationCallback, purchaseHandlerD.AFKeystoreWrapper);
            AFe1aSDK aFe1aSDK = purchaseHandlerD.valueOf;
            aFe1aSDK.AFInAppEventParameterName.execute(aFe1aSDK.new AnonymousClass4(aFf1nSDK));
        }
        int i = afErrorLog + 123;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        afWarnLog = (afErrorLog + 71) % 128;
        valueOf(context);
        PurchaseHandler purchaseHandlerD = AFInAppEventType().d();
        if (purchaseHandlerD.AFInAppEventType(map, purchaseValidationCallback, "subscriptions")) {
            AFf1rSDK aFf1rSDK = new AFf1rSDK(map, purchaseValidationCallback, purchaseHandlerD.AFKeystoreWrapper);
            AFe1aSDK aFe1aSDK = purchaseHandlerD.valueOf;
            aFe1aSDK.AFInAppEventParameterName.execute(aFe1aSDK.new AnonymousClass4(aFf1rSDK));
        }
        int i = afWarnLog + 37;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPushNotificationData(android.app.Activity r19) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        afErrorLog = (afWarnLog + 75) % 128;
        if (map != null) {
            AFInAppEventType().i().AFInAppEventParameterName("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        afErrorLog = (afWarnLog + 29) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i = afErrorLog + 35;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            AFb1aSDK aFb1aSDKI = AFInAppEventType().i();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFb1aSDKI.AFInAppEventParameterName("setAndroidIdData", strArr);
        } else {
            AFInAppEventType().i().AFInAppEventParameterName("setAndroidIdData", str);
        }
        AFInAppEventType().getLevel().AFInAppEventType = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = afErrorLog + 89;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            AFb1aSDK aFb1aSDKI = AFInAppEventType().i();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFb1aSDKI.AFInAppEventParameterName("setAppId", strArr);
        } else {
            AFInAppEventType().i().AFInAppEventParameterName("setAppId", str);
        }
        AFInAppEventParameterName("appid", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAppInviteOneLink(java.lang.String r4) {
        /*
            r3 = this;
            com.appsflyer.internal.AFd1fSDK r0 = r3.AFInAppEventType()
            com.appsflyer.internal.AFb1aSDK r0 = r0.i()
            java.lang.String r1 = "setAppInviteOneLink"
            java.lang.String[] r2 = new java.lang.String[]{r4}
            r0.AFInAppEventParameterName(r1, r2)
            java.lang.String r0 = "setAppInviteOneLink = "
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r1)
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.lang.String r0 = "oneLinkSlug"
            if (r4 == 0) goto L4d
            int r1 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L40
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = r1.getString(r0)
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L73
            goto L4d
        L40:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r1.getString(r0)
            r4.equals(r0)
            r4 = 0
            throw r4
        L4d:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkDomain"
            r1.remove(r2)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkVersion"
            r1.remove(r2)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkScheme"
            r1.remove(r2)
            int r1 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r1 = r1 + 17
            int r1 = r1 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r1
        L73:
            AFInAppEventParameterName(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.setAppInviteOneLink(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        afErrorLog = (afWarnLog + 89) % 128;
        AFInAppEventType().i().AFInAppEventParameterName("setCollectAndroidID", String.valueOf(z));
        AFInAppEventParameterName("collectAndroidId", Boolean.toString(z));
        AFInAppEventParameterName("collectAndroidIdForceByUser", Boolean.toString(z));
        int i = afWarnLog + 71;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        afErrorLog = (afWarnLog + 91) % 128;
        AFInAppEventType().i().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z));
        AFInAppEventParameterName("collectIMEI", Boolean.toString(z));
        AFInAppEventParameterName("collectIMEIForceByUser", Boolean.toString(z));
        afErrorLog = (afWarnLog + 73) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        afWarnLog = (afErrorLog + LDSFile.EF_SOD_TAG) % 128;
        AFInAppEventType().i().AFInAppEventParameterName("setCollectOaid", String.valueOf(z));
        AFInAppEventParameterName("collectOAID", Boolean.toString(z));
        afWarnLog = (afErrorLog + 15) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        int i = afErrorLog + 99;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            AFInAppEventType().getLevel().e = appsFlyerConsent;
            throw null;
        }
        Objects.requireNonNull(appsFlyerConsent);
        AFInAppEventType().getLevel().e = appsFlyerConsent;
        afErrorLog = (afWarnLog + 25) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i = afErrorLog + 99;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            AFb1aSDK aFb1aSDKI = AFInAppEventType().i();
            String[] strArr = new String[0];
            strArr[0] = str;
            aFb1aSDKI.AFInAppEventParameterName("setCurrencyCode", strArr);
        } else {
            AFInAppEventType().i().AFInAppEventParameterName("setCurrencyCode", str);
        }
        AppsFlyerProperties.getInstance().set("currencyCode", str);
        afErrorLog = (afWarnLog + 91) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        if (context != null) {
            if (!valueOf()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb6 = new StringBuilder("CustomerUserId set: ");
            sb6.append(str);
            sb6.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb6.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventType().AFInAppEventType());
            AFInAppEventParameterName(context, AFh1xSDK.setCustomerIdAndLogSession);
            String str2 = AFInAppEventType().v().AFLogger;
            if (referrer == null) {
                int i = afErrorLog + 51;
                afWarnLog = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
                afWarnLog = (afErrorLog + 107) % 128;
            }
            values(context, referrer);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        afErrorLog = (afWarnLog + 97) % 128;
        AFInAppEventType().i().AFInAppEventParameterName("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventParameterName("AppUserId", str);
        AFKeystoreWrapper("waitForCustomerId", false);
        int i = afWarnLog + 23;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        if (z) {
            logLevel = AFLogger.LogLevel.DEBUG;
            afWarnLog = (afErrorLog + 93) % 128;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
            afErrorLog = (afWarnLog + 27) % 128;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z3;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        if (z) {
            z3 = false;
        } else {
            afErrorLog = (afWarnLog + 57) % 128;
            z3 = true;
        }
        AFb1uSDK.AFInAppEventParameterName = Boolean.valueOf(z3);
        AFd1fSDK aFd1fSDKAFInAppEventType = AFInAppEventType();
        aFd1fSDKAFInAppEventType.getLevel().d = z;
        if (z) {
            aFd1fSDKAFInAppEventType.getLevel().AFLogger = null;
            afWarnLog = (afErrorLog + 37) % 128;
        } else {
            AFe1aSDK aFe1aSDKW = aFd1fSDKAFInAppEventType.w();
            aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(new AFf1pSDK(AFInAppEventType())));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        afErrorLog = (afWarnLog + 81) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        AFKeystoreWrapper("disableCollectNetworkData", z);
        afErrorLog = (afWarnLog + 65) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = afWarnLog + 49;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            AFInAppEventType().i().AFInAppEventParameterName("setExtension", str);
        } else {
            AFInAppEventType().i().AFInAppEventParameterName("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set("sdkExtension", str);
        int i2 = afErrorLog + 83;
        afWarnLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, @NonNull String str2) {
        String strTrim;
        if (AFc1vSDK.AFInAppEventType(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i = afErrorLog;
        afWarnLog = (i + LDSFile.EF_DG15_TAG) % 128;
        if (str != null) {
            strTrim = str.trim();
        } else {
            afWarnLog = (i + LDSFile.EF_DG13_TAG) % 128;
            strTrim = "";
        }
        AFe1bSDK.valueOf(new AFe1kSDK(strTrim, str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = afErrorLog + 25;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            AFb1aSDK aFb1aSDKI = AFInAppEventType().i();
            String[] strArr = new String[0];
            strArr[1] = str;
            aFb1aSDKI.AFInAppEventParameterName("setImeiData", strArr);
        } else {
            AFInAppEventType().i().AFInAppEventParameterName("setImeiData", str);
        }
        AFInAppEventType().v().registerClient = str;
        afErrorLog = (afWarnLog + 87) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = afWarnLog + LDSFile.EF_DG15_TAG;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            AFInAppEventType().i().AFInAppEventParameterName("setIsUpdate", String.valueOf(z));
        } else {
            AFInAppEventType().i().AFInAppEventParameterName("setIsUpdate", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set("IS_UPDATE", z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        afErrorLog = (afWarnLog + 97) % 128;
        boolean z = logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel();
        AFInAppEventType().i().AFInAppEventParameterName("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z) {
            AFInAppEventType().AFLogger$LogLevel().AFLogger();
            return;
        }
        int i = afWarnLog + LDSFile.EF_DG13_TAG;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            AFInAppEventType().AFLogger$LogLevel().values();
        } else {
            AFInAppEventType().AFLogger$LogLevel().values();
            int i2 = 89 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        afErrorLog = (afWarnLog + 113) % 128;
        this.d = TimeUnit.SECONDS.toMillis(i);
        int i2 = afWarnLog + 19;
        afErrorLog = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = afWarnLog + 55;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            AFInAppEventType().i().AFInAppEventParameterName("setOaidData", str);
        } else {
            AFInAppEventType().i().AFInAppEventParameterName("setOaidData", str);
        }
        AFb1uSDK.values = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        afErrorLog = (afWarnLog + 121) % 128;
        AFLogger.afDebugLog("setOneLinkCustomDomain " + Arrays.toString(strArr));
        AFInAppEventType().afDebugLog().AFLogger = strArr;
        int i = afWarnLog + 99;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r6 = r6.toLowerCase(java.util.Locale.getDefault());
        com.appsflyer.AppsFlyerProperties.getInstance().set("api_store_value", r6);
        com.appsflyer.AFLogger.afInfoLog("Store API set with value: ".concat(java.lang.String.valueOf(r6)), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r6 = r6.toLowerCase(java.util.Locale.getDefault());
        com.appsflyer.AppsFlyerProperties.getInstance().set("api_store_value", r6);
        com.appsflyer.AFLogger.afInfoLog("Store API set with value: ".concat(java.lang.String.valueOf(r6)), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
        r6 = com.appsflyer.internal.AFb1rSDK.afErrorLog + 123;
        com.appsflyer.internal.AFb1rSDK.afWarnLog = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if ((r6 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r6 = 29 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r6 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r6 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r1 = r1 + 17;
        com.appsflyer.internal.AFb1rSDK.afErrorLog = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setOutOfStore(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = com.appsflyer.internal.AFb1rSDK.afErrorLog
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afWarnLog = r1
            int r0 = r0 % 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L14
            r0 = 59
            int r0 = r0 / r3
            if (r6 == 0) goto L5a
            goto L16
        L14:
            if (r6 == 0) goto L5a
        L16:
            int r1 = r1 + 17
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r0
            int r1 = r1 % 2
            java.lang.String r0 = "Store API set with value: "
            java.lang.String r4 = "api_store_value"
            if (r1 == 0) goto L3f
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.toLowerCase(r1)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            r1.set(r4, r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r0.concat(r6)
            com.appsflyer.AFLogger.afInfoLog(r6, r3)
            return
        L3f:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.toLowerCase(r1)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            r1.set(r4, r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r0.concat(r6)
            com.appsflyer.AFLogger.afInfoLog(r6, r2)
            return
        L5a:
            java.lang.String r6 = "Cannot set setOutOfStore with null"
            com.appsflyer.AFLogger.afWarnLog(r6, r2)
            int r6 = com.appsflyer.internal.AFb1rSDK.afErrorLog
            int r6 = r6 + 123
            int r0 = r6 % 128
            com.appsflyer.internal.AFb1rSDK.afWarnLog = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L6e
            r6 = 29
            int r6 = r6 / r3
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.setOutOfStore(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r0
      0x0028: PHI (r0v5 com.appsflyer.internal.AFd1oSDK) = (r0v4 com.appsflyer.internal.AFd1oSDK), (r0v10 com.appsflyer.internal.AFd1oSDK) binds: [B:8:0x0026, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPartnerData(@androidx.annotation.NonNull java.lang.String r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.setPartnerData(java.lang.String, java.util.Map):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        afErrorLog = (afWarnLog + 17) % 128;
        AFInAppEventType().getLevel().values = AFb1mSDK.AFInAppEventType(str);
        int i = afErrorLog + 49;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        afErrorLog = (afWarnLog + 89) % 128;
        Objects.requireNonNull(pluginInfo);
        AFInAppEventType().afVerboseLog().values(pluginInfo);
        afErrorLog = (afWarnLog + 63) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[Catch: JSONException -> 0x001c, TRY_LEAVE, TryCatch #0 {JSONException -> 0x001c, blocks: (B:5:0x0018, B:9:0x0020, B:13:0x0035, B:14:0x0039), top: B:25:0x0018 }] */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPreinstallAttribution(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "setPreinstallAttribution API called"
            com.appsflyer.AFLogger.afDebugLog(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "pid"
            if (r4 == 0) goto L1e
            int r2 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r2 = r2 + 75
            int r2 = r2 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r2
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L1c
            goto L1e
        L1c:
            r4 = move-exception
            goto L3e
        L1e:
            if (r5 == 0) goto L25
            java.lang.String r4 = "c"
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L1c
        L25:
            if (r6 == 0) goto L46
            int r4 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r4 = r4 + 95
            int r5 = r4 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r5
            int r4 = r4 % 2
            java.lang.String r5 = "af_siteid"
            if (r4 != 0) goto L39
            r0.put(r5, r6)     // Catch: org.json.JSONException -> L1c
            goto L46
        L39:
            r0.put(r5, r6)     // Catch: org.json.JSONException -> L1c
            r4 = 0
            throw r4
        L3e:
            java.lang.String r5 = r4.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r5, r4)
            goto L4e
        L46:
            int r4 = com.appsflyer.internal.AFb1rSDK.afErrorLog
            int r4 = r4 + 67
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1rSDK.afWarnLog = r4
        L4e:
            boolean r4 = r0.has(r1)
            if (r4 == 0) goto L5f
            java.lang.String r4 = "preInstallName"
            java.lang.String r5 = r0.toString()
            AFInAppEventParameterName(r4, r5)
            return
        L5f:
            java.lang.String r4 = "Cannot set preinstall attribution data without a media source"
            com.appsflyer.AFLogger.afWarnLog(r4)
            int r4 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r4 = r4 + 39
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.setPreinstallAttribution(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        afWarnLog = (afErrorLog + 97) % 128;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFc1tSDK aFc1tSDKAfDebugLog = AFInAppEventType().afDebugLog();
        aFc1tSDKAfDebugLog.e.clear();
        aFc1tSDKAfDebugLog.e.addAll(Arrays.asList(strArr));
        afErrorLog = (afWarnLog + 23) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        int i = afErrorLog + 95;
        afWarnLog = i % 128;
        int i2 = i % 2;
        setSharingFilterForPartners(strArr);
        if (i2 == 0) {
            throw null;
        }
        int i3 = afWarnLog + 45;
        afErrorLog = i3 % 128;
        if (i3 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        afWarnLog = (afErrorLog + 101) % 128;
        setSharingFilterForPartners("all");
        afErrorLog = (afWarnLog + 123) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        AFInAppEventType().getLevel().AFInAppEventParameterName = new AFd1vSDK(strArr);
        afErrorLog = (afWarnLog + 23) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        afErrorLog = (afWarnLog + 11) % 128;
        AFInAppEventType().i().AFInAppEventParameterName("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        afWarnLog = (afErrorLog + 57) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        int i = afWarnLog + 25;
        afErrorLog = i % 128;
        int i2 = i % 2;
        start(context, null);
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        afWarnLog = (afErrorLog + 55) % 128;
        valueOf(context);
        AFd1fSDK aFd1fSDKAFInAppEventType = AFInAppEventType();
        aFd1fSDKAFInAppEventType.v().unregisterClient = z;
        aFd1fSDKAFInAppEventType.AFKeystoreWrapper().submit(new a(aFd1fSDKAFInAppEventType, 0));
        if (z) {
            afWarnLog = (afErrorLog + 1) % 128;
            aFd1fSDKAFInAppEventType.AFInAppEventType().AFKeystoreWrapper("is_stop_tracking_used", true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        afWarnLog = (afErrorLog + 79) % 128;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i = afWarnLog + 81;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 44 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = afWarnLog + ISO781611.SMT_TAG;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            AFInAppEventType().i().AFInAppEventParameterName("unregisterConversionListener", new String[1]);
        } else {
            AFInAppEventType().i().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        }
        this.AFInAppEventType = null;
        int i2 = afWarnLog + ISO781611.SMT_TAG;
        afErrorLog = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        valueOf(context);
        AFg1lSDK aFg1lSDK = new AFg1lSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1bSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1bSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFg1jSDK aFg1jSDKAFKeystoreWrapper = aFg1lSDK.AFKeystoreWrapper();
        if (aFg1jSDKAFKeystoreWrapper == null || !str.equals(aFg1jSDKAFKeystoreWrapper.AFKeystoreWrapper)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = aFg1jSDKAFKeystoreWrapper == null || jCurrentTimeMillis - aFg1jSDKAFKeystoreWrapper.valueOf > TimeUnit.SECONDS.toMillis(2L);
            AFg1jSDK aFg1jSDK = new AFg1jSDK(str, jCurrentTimeMillis, !z);
            aFg1lSDK.valueOf.AFInAppEventParameterName("afUninstallToken", aFg1jSDK.AFKeystoreWrapper);
            aFg1lSDK.valueOf.values("afUninstallToken_received_time", aFg1jSDK.valueOf);
            aFg1lSDK.valueOf.AFKeystoreWrapper("afUninstallToken_queued", aFg1jSDK.values());
            if (z) {
                AFg1lSDK.AFKeystoreWrapper(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void validateAndLogInAppPurchase(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
            r12 = this;
            com.appsflyer.internal.AFd1fSDK r0 = r12.AFInAppEventType()
            com.appsflyer.internal.AFb1aSDK r6 = r0.i()
            if (r19 != 0) goto L1e
            int r0 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r0 = r0 + 97
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r0
            java.lang.String r0 = ""
        L14:
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r0
            r0 = r14
            goto L23
        L1e:
            java.lang.String r0 = r19.toString()
            goto L14
        L23:
            java.lang.String[] r5 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            r8 = r4
            java.lang.String r0 = "validateAndTrackInAppPurchase"
            r6.AFInAppEventParameterName(r0, r5)
            boolean r0 = r12.isStopped()
            if (r0 != 0) goto L4a
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1bSDK r1 = com.appsflyer.internal.AFg1bSDK.PURCHASE_VALIDATION
            java.lang.String r4 = "Validate in app called with parameters: "
            java.lang.String r5 = " "
            java.lang.StringBuilder r4 = v0.a.m(r4, r2, r5, r3, r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r0.i(r1, r4)
        L4a:
            r10 = 0
            if (r14 == 0) goto L8f
            if (r3 == 0) goto L8f
            int r0 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L8e
            if (r15 == 0) goto L8f
            if (r8 == 0) goto L8f
            if (r2 != 0) goto L62
            goto L8f
        L62:
            java.lang.Thread r11 = new java.lang.Thread
            com.appsflyer.internal.AFa1bSDK r0 = new com.appsflyer.internal.AFa1bSDK
            android.content.Context r1 = r13.getApplicationContext()
            com.appsflyer.internal.AFd1fSDK r13 = r12.AFInAppEventType()
            com.appsflyer.internal.AFg1wSDK r13 = r13.v()
            java.lang.String r13 = r13.AFLogger
            com.appsflyer.internal.AFd1fSDK r4 = r12.AFInAppEventType()
            com.appsflyer.internal.AFd1sSDK r4 = r4.valueOf()
            r5 = r15
            r9 = r19
            r6 = r2
            r7 = r3
            r3 = r4
            r2 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.<init>(r0)
            r11.start()
            goto L99
        L8e:
            throw r10
        L8f:
            com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r13 = com.appsflyer.internal.AFb1rSDK.AFKeystoreWrapper
            if (r13 == 0) goto L99
            java.lang.String r14 = "Please provide purchase parameters"
            r13.onValidateInAppFailure(r14)
            return
        L99:
            int r13 = com.appsflyer.internal.AFb1rSDK.afErrorLog
            int r13 = r13 + 93
            int r14 = r13 % 128
            com.appsflyer.internal.AFb1rSDK.afWarnLog = r14
            int r13 = r13 % 2
            if (r13 == 0) goto La6
            return
        La6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.validateAndLogInAppPurchase(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i = afErrorLog + 33;
        afWarnLog = i % 128;
        int i2 = i % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AFKeystoreWrapper("waitForCustomerId", z);
        afErrorLog = (afWarnLog + LDSFile.EF_DG2_TAG) % 128;
    }

    public static /* synthetic */ Application AFInAppEventParameterName(AFb1rSDK aFb1rSDK) {
        int i = afWarnLog;
        afErrorLog = (i + 27) % 128;
        Application application = aFb1rSDK.f26017w;
        afErrorLog = (i + 75) % 128;
        return application;
    }

    public static /* synthetic */ AFf1aSDK AFKeystoreWrapper(AFb1rSDK aFb1rSDK) {
        afErrorLog = (afWarnLog + 65) % 128;
        AFf1aSDK aFf1aSDKE = aFb1rSDK.e();
        afWarnLog = (afErrorLog + 101) % 128;
        return aFf1aSDKE;
    }

    private static void a(String str, byte b4, int i, Object[] objArr) {
        int i2;
        int i3;
        int length;
        char[] cArr;
        int i5 = $11;
        int i6 = i5 + 55;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        Object charArray = str;
        if (str != null) {
            int i21 = i5 + 15;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 48 / 0;
                charArray = str.toCharArray();
            } else {
                charArray = str.toCharArray();
            }
        }
        char[] cArr2 = (char[]) charArray;
        AFk1zSDK aFk1zSDK = new AFk1zSDK();
        char[] cArr3 = afDebugLog;
        if (cArr3 != null) {
            int i32 = $11 + 23;
            $10 = i32 % 128;
            if (i32 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            for (int i33 = 0; i33 < length; i33++) {
                cArr[i33] = (char) (((long) cArr3[i33]) ^ 1822166676708980373L);
            }
            cArr3 = cArr;
        }
        char c2 = (char) (1822166676708980373L ^ ((long) afVerboseLog));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr2[i2] - b4);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aFk1zSDK.valueOf = 0;
            while (true) {
                int i43 = aFk1zSDK.valueOf;
                if (i43 >= i2) {
                    break;
                }
                char c3 = cArr2[i43];
                aFk1zSDK.AFInAppEventParameterName = c3;
                char c5 = cArr2[i43 + 1];
                aFk1zSDK.values = c5;
                if (c3 == c5) {
                    cArr4[i43] = (char) (c3 - b4);
                    cArr4[i43 + 1] = (char) (c5 - b4);
                } else {
                    int i59 = c3 / c2;
                    aFk1zSDK.AFInAppEventType = i59;
                    int i66 = c3 % c2;
                    aFk1zSDK.unregisterClient = i66;
                    int i74 = c5 / c2;
                    aFk1zSDK.AFKeystoreWrapper = i74;
                    int i92 = c5 % c2;
                    aFk1zSDK.registerClient = i92;
                    if (i66 == i92) {
                        int i96 = ((i59 + c2) - 1) % c2;
                        aFk1zSDK.AFInAppEventType = i96;
                        int i99 = ((i74 + c2) - 1) % c2;
                        aFk1zSDK.AFKeystoreWrapper = i99;
                        cArr4[i43] = cArr3[(i96 * c2) + i66];
                        cArr4[i43 + 1] = cArr3[(i99 * c2) + i92];
                    } else {
                        if (i59 == i74) {
                            int i100 = ((i66 + c2) - 1) % c2;
                            aFk1zSDK.unregisterClient = i100;
                            int i101 = ((i92 + c2) - 1) % c2;
                            aFk1zSDK.registerClient = i101;
                            cArr4[i43] = cArr3[(i59 * c2) + i100];
                            cArr4[i43 + 1] = cArr3[(i74 * c2) + i101];
                            i3 = $10 + 123;
                        } else {
                            cArr4[i43] = cArr3[(i59 * c2) + i92];
                            cArr4[i43 + 1] = cArr3[(i74 * c2) + i66];
                            i3 = $10 + 19;
                        }
                        $11 = i3 % 128;
                    }
                }
                aFk1zSDK.valueOf = i43 + 2;
            }
        }
        for (int i102 = 0; i102 < i; i102++) {
            cArr4[i102] = (char) (cArr4[i102] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private boolean d() {
        String string;
        if (this.e <= 0) {
            if (isStopped()) {
                return false;
            }
            AFLogger.afInfoLog("Sending first launch for this session!");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.e;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
        String strAFInAppEventType = AFInAppEventType(simpleDateFormat, this.e);
        String strAFInAppEventType2 = AFInAppEventType(simpleDateFormat, this.unregisterClient);
        if (jCurrentTimeMillis < this.d && !isStopped()) {
            long j2 = this.d;
            StringBuilder sbM = v0.a.m("Last Launch attempt: ", strAFInAppEventType, ";\nLast successful Launch event: ", strAFInAppEventType2, ";\nThis launch is blocked: ");
            sbM.append(jCurrentTimeMillis);
            sbM.append(" ms < ");
            sbM.append(j2);
            sbM.append(" ms");
            AFLogger.afInfoLog(sbM.toString());
            return true;
        }
        if (isStopped()) {
            return false;
        }
        int i = afErrorLog + 23;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[3];
            objArr[1] = strAFInAppEventType;
            objArr[1] = strAFInAppEventType2;
            objArr[4] = Long.valueOf(jCurrentTimeMillis);
            string = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", objArr);
        } else {
            StringBuilder sbM2 = v0.a.m("Last Launch attempt: ", strAFInAppEventType, ";\nLast successful Launch event: ", strAFInAppEventType2, ";\nSending launch (+");
            sbM2.append(jCurrentTimeMillis);
            sbM2.append(" ms)");
            string = sbM2.toString();
        }
        AFLogger.afInfoLog(string);
        afWarnLog = (afErrorLog + 99) % 128;
        return false;
    }

    private synchronized AFf1aSDK e() {
        AFf1aSDK aFf1aSDK;
        try {
            if (this.afRDLog == null) {
                int i = afWarnLog + 81;
                afErrorLog = i % 128;
                if (i % 2 != 0) {
                    this.afRDLog = new c(this);
                    throw null;
                }
                this.afRDLog = new c(this);
            }
            aFf1aSDK = this.afRDLog;
            int i2 = afErrorLog + 97;
            afWarnLog = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return aFf1aSDK;
    }

    private static void registerClient(Context context) {
        try {
            List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!listAsList.contains("android.permission.INTERNET")) {
                AFLogger.INSTANCE.w(AFg1bSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFg1bSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                int i = afErrorLog + 93;
                afWarnLog = i % 128;
                if (i % 2 == 0) {
                    listAsList.contains("com.google.android.gms.permission.AD_ID");
                    throw null;
                }
                if (!listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.INSTANCE.w(AFg1bSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                }
            }
            afWarnLog = (afErrorLog + 37) % 128;
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1bSDK.GENERAL, "Exception while validation permissions. ", e);
        }
    }

    private static String values(String str) {
        afErrorLog = (afWarnLog + 107) % 128;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i = afErrorLog + 61;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final AFd1fSDK AFInAppEventType() {
        int i = afWarnLog;
        AFd1kSDK aFd1kSDK = this.force;
        int i2 = i + LDSFile.EF_DG2_TAG;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            return aFd1kSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        valueOf(context);
        AFh1kSDK aFh1kSDK = new AFh1kSDK();
        aFh1kSDK.e = str;
        aFh1kSDK.AFInAppEventParameterName = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey("af_touch_obj")) {
            HashMap map3 = new HashMap();
            Object obj2 = map2.get("af_touch_obj");
            if (obj2 instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj2;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1bSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove("af_touch_obj");
            aFh1kSDK.AFInAppEventType(mapSingletonMap);
        }
        aFh1kSDK.valueOf = map2;
        AFb1aSDK aFb1aSDKI = AFInAppEventType().i();
        Map map5 = aFh1kSDK.valueOf;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFb1aSDKI.AFInAppEventParameterName("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            AFInAppEventParameterName(context, AFh1xSDK.logEvent);
        }
        values(aFh1kSDK, e(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        afWarnLog = (afErrorLog + 9) % 128;
        start(context, str, null);
        afErrorLog = (afWarnLog + 31) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j2) {
        afErrorLog = (afWarnLog + 53) % 128;
        AFInAppEventType().afDebugLog().valueOf = deepLinkListener;
        AFInAppEventType().afDebugLog().unregisterClient = j2;
        afErrorLog = (afWarnLog + 15) % 128;
    }

    public final void valueOf(@NonNull Context context) {
        AFd1kSDK aFd1kSDK = this.force;
        if (context != null) {
            AFd1nSDK aFd1nSDK = aFd1kSDK.values;
            if (context != null) {
                int i = afWarnLog + 39;
                afErrorLog = i % 128;
                int i2 = i % 2;
                aFd1nSDK.AFKeystoreWrapper = context.getApplicationContext();
                if (i2 != 0) {
                    int i3 = 2 / 0;
                }
                afErrorLog = (afWarnLog + 93) % 128;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(AFg1zSDK aFg1zSDK) {
        int i = afWarnLog + 17;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            AFd1fSDK aFd1fSDKAFInAppEventType = AFInAppEventType();
            if (aFg1zSDK == AFg1zSDK.SUCCESS) {
                aFd1fSDKAFInAppEventType.getPrice().AFInAppEventType();
                afErrorLog = (afWarnLog + 63) % 128;
            }
            if (!aFd1fSDKAFInAppEventType.i().AFInAppEventType()) {
                aFd1fSDKAFInAppEventType.AFLogger$LogLevel().AFInAppEventParameterName();
                return;
            } else {
                aFd1fSDKAFInAppEventType.AFLogger$LogLevel().valueOf();
                return;
            }
        }
        AFInAppEventType();
        AFg1zSDK aFg1zSDK2 = AFg1zSDK.SUCCESS;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventType(AFd1fSDK aFd1fSDK) {
        int i = afWarnLog + LDSFile.EF_DG2_TAG;
        afErrorLog = i % 128;
        int i2 = i % 2;
        aFd1fSDK.afWarnLog().AFKeystoreWrapper();
        if (i2 != 0) {
            throw null;
        }
        afWarnLog = (afErrorLog + 81) % 128;
    }

    private static void AFKeystoreWrapper(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    afWarnLog = (afErrorLog + 79) % 128;
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (itKeys2.hasNext()) {
                int i2 = afErrorLog + 79;
                afWarnLog = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i3 = 0;
                    while (i3 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i3) == ((Long) arrayList.get(0)).longValue() || jSONArray2.getLong(i3) == ((Long) arrayList.get(1)).longValue() || jSONArray2.getLong(i3) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            break;
                        }
                        i3++;
                        str = next;
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
        }
        if (str != null) {
            afErrorLog = (afWarnLog + 11) % 128;
            jSONObject.remove(str);
        }
    }

    public static String values() {
        int i = afWarnLog + 43;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            return values("AppUserId");
        }
        values("AppUserId");
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        afWarnLog = (afErrorLog + 97) % 128;
        if (AFInAppEventType().afErrorLogForExcManagerOnly().values()) {
            return;
        }
        if (!this.v) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        }
        valueOf(context);
        final AFh1wSDK aFh1wSDKRegisterClient = AFInAppEventType().registerClient();
        aFh1wSDKRegisterClient.AFInAppEventType(AFa1mSDK.valueOf(context));
        if (this.f26017w == null) {
            Application applicationValues = AFb1vSDK.values(context);
            if (applicationValues == null) {
                return;
            }
            int i = afErrorLog + 73;
            afWarnLog = i % 128;
            if (i % 2 == 0) {
                this.f26017w = applicationValues;
                int i2 = 23 / 0;
            } else {
                this.f26017w = applicationValues;
            }
        }
        AFInAppEventType().i().AFInAppEventParameterName("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1bSDK aFg1bSDK = AFg1bSDK.GENERAL;
        String str2 = values;
        aFLogger.i(aFg1bSDK, "Starting AppsFlyer: (v6.14.2." + str2 + ")");
        StringBuilder sb6 = new StringBuilder("Build Number: ");
        sb6.append(str2);
        aFLogger.i(aFg1bSDK, sb6.toString());
        AppsFlyerProperties.getInstance().loadProperties(AFInAppEventType().AFInAppEventType());
        if (!TextUtils.isEmpty(str)) {
            AFInAppEventType().v().AFLogger = str;
            AFb1kSDK.values(str);
        } else if (TextUtils.isEmpty(AFInAppEventType().v().AFLogger)) {
            int i3 = afErrorLog + 83;
            afWarnLog = i3 % 128;
            if (i3 % 2 != 0) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
        AFInAppEventType().e().values(e());
        AFLogger();
        AFInAppEventParameterName(this.f26017w.getBaseContext());
        AFInAppEventType().afErrorLog().AFInAppEventParameterName();
        this.force.afErrorLogForExcManagerOnly().AFKeystoreWrapper(context, new AFd1uSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFb1rSDK.4
            @Override // com.appsflyer.internal.AFd1uSDK.AFa1vSDK
            public final void AFKeystoreWrapper() {
                Context context2 = AFb1rSDK.this.AFInAppEventType().afInfoLog().AFKeystoreWrapper;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1wSDK aFh1wSDK = aFh1wSDKRegisterClient;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = aFh1wSDK.AFLogger;
                if (j2 != 0) {
                    long j3 = jCurrentTimeMillis - j2;
                    if (j3 > 0 && j3 < 1000) {
                        j3 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j3);
                    aFh1wSDK.f26036w = seconds;
                    aFh1wSDK.AFInAppEventParameterName.values("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1rSDK.this.AFInAppEventType().getPrice().AFInAppEventParameterName();
                AFb1aSDK aFb1aSDKI = AFb1rSDK.this.AFInAppEventType().i();
                if (aFb1aSDKI.e()) {
                    aFb1aSDKI.AFKeystoreWrapper();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFb1aSDKI.values(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFb1aSDKI.values();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1rSDK.this.AFInAppEventType().unregisterClient().AFKeystoreWrapper();
                AFb1rSDK.this.AFInAppEventType().getPurchaseToken().AFInAppEventParameterName();
            }

            @Override // com.appsflyer.internal.AFd1uSDK.AFa1vSDK
            public final void values(@NonNull AFh1pSDK aFh1pSDK) {
                aFh1wSDKRegisterClient.AFInAppEventType();
                AFd1fSDK aFd1fSDKAFInAppEventType = AFb1rSDK.this.AFInAppEventType();
                aFd1fSDKAFInAppEventType.e().values(AFb1rSDK.AFKeystoreWrapper(AFb1rSDK.this));
                AFb1rSDK.AFInAppEventType(AFb1rSDK.this);
                int iValueOf = aFd1fSDKAFInAppEventType.valueOf().values.valueOf("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (iValueOf < 2) {
                    AFb1rSDK.this.AFInAppEventType().unregisterClient().AFInAppEventParameterName();
                }
                AFh1nSDK aFh1nSDK = new AFh1nSDK();
                if (aFh1pSDK != null) {
                    AFb1rSDK.this.AFInAppEventType().afDebugLog().AFInAppEventParameterName(AFc1oSDK.AFKeystoreWrapper(aFh1nSDK), aFh1pSDK.AFInAppEventType, aFd1fSDKAFInAppEventType.afInfoLog().AFKeystoreWrapper);
                }
                AFb1rSDK aFb1rSDK = AFb1rSDK.this;
                aFh1nSDK.AFInAppEventParameterName = appsFlyerRequestListener;
                aFb1rSDK.values(aFh1nSDK, aFh1pSDK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        AFInAppEventType().AFLogger$LogLevel().AFInAppEventType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        AFInAppEventType().AFLogger$LogLevel().AFInAppEventType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        AFInAppEventType().AFLogger$LogLevel().AFKeystoreWrapper();
        com.appsflyer.internal.AFb1rSDK.afErrorLog = (com.appsflyer.internal.AFb1rSDK.afWarnLog + 65) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r0 = r0 + 39;
        com.appsflyer.internal.AFb1rSDK.afErrorLog = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r0 % 2) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void AFInAppEventType(boolean r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r1 = r0 + 101
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L13
            r1 = 66
            int r1 = r1 / 0
            if (r4 == 0) goto L38
            goto L15
        L13:
            if (r4 == 0) goto L38
        L15:
            int r0 = r0 + 39
            int r4 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L2b
            com.appsflyer.internal.AFd1fSDK r4 = r3.AFInAppEventType()
            com.appsflyer.internal.AFh1ySDK r4 = r4.AFLogger$LogLevel()
            r4.AFInAppEventType()
            return
        L2b:
            com.appsflyer.internal.AFd1fSDK r4 = r3.AFInAppEventType()
            com.appsflyer.internal.AFh1ySDK r4 = r4.AFLogger$LogLevel()
            r4.AFInAppEventType()
            r4 = 0
            throw r4
        L38:
            com.appsflyer.internal.AFd1fSDK r4 = r3.AFInAppEventType()
            com.appsflyer.internal.AFh1ySDK r4 = r4.AFLogger$LogLevel()
            r4.AFKeystoreWrapper()
            int r4 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r4 = r4 + 65
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.AFInAppEventType(boolean):void");
    }

    private void values(Context context, String str, Map<String, Object> map) {
        AFh1kSDK aFh1kSDK = new AFh1kSDK();
        aFh1kSDK.e = str;
        aFh1kSDK.valueOf = map;
        values(aFh1kSDK, e(context));
        int i = afErrorLog + 33;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            int i2 = 0 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFInAppEventType().i().AFInAppEventParameterName("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set("userEmailsCryptType", emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        afWarnLog = (afErrorLog + 93) % 128;
        String str = null;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            if (AnonymousClass2.values[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1mSDK.AFInAppEventType(str2));
                afWarnLog = (afErrorLog + 95) % 128;
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
            i++;
            afErrorLog = (afWarnLog + 81) % 128;
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
    }

    public final void valueOf(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strAFKeystoreWrapper = AFInAppEventType(context).AFKeystoreWrapper("extraReferrers", (String) null);
                if (strAFKeystoreWrapper == null) {
                    jSONObject = new JSONObject();
                    jSONArray2 = new JSONArray();
                } else {
                    JSONObject jSONObject2 = new JSONObject(strAFKeystoreWrapper);
                    if (jSONObject2.has(str)) {
                        jSONArray = new JSONArray((String) jSONObject2.get(str));
                    } else {
                        jSONArray = new JSONArray();
                    }
                    jSONArray2 = jSONArray;
                    jSONObject = jSONObject2;
                }
                if (jSONArray2.length() < 5) {
                    int i = afWarnLog + 43;
                    afErrorLog = i % 128;
                    if (i % 2 != 0) {
                        jSONArray2.put(jCurrentTimeMillis);
                        throw null;
                    }
                    jSONArray2.put(jCurrentTimeMillis);
                }
                if (jSONObject.length() >= 4) {
                    int i2 = afWarnLog + 9;
                    afErrorLog = i2 % 128;
                    if (i2 % 2 != 0) {
                        AFKeystoreWrapper(jSONObject);
                        throw null;
                    }
                    AFKeystoreWrapper(jSONObject);
                }
                jSONObject.put(str, jSONArray2.toString());
                AFInAppEventType(context).AFInAppEventParameterName("extraReferrers", jSONObject.toString());
            } catch (Throwable th10) {
                StringBuilder sb6 = new StringBuilder("Couldn't save referrer - ");
                sb6.append(str);
                sb6.append(": ");
                AFLogger.afErrorLog(sb6.toString(), th10);
            }
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        }
    }

    private AFh1pSDK e(Context context) {
        int i = afErrorLog + 3;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        AFh1pSDK aFh1pSDK = new AFh1pSDK((Activity) context, AFInAppEventType().afLogForce());
        afWarnLog = (afErrorLog + 95) % 128;
        return aFh1pSDK;
    }

    public final void values(@NonNull AFa1pSDK aFa1pSDK, AFh1pSDK aFh1pSDK) {
        valueOf(aFa1pSDK, aFh1pSDK);
        if (AFInAppEventType().v().AFLogger == null) {
            int i = afErrorLog + 11;
            afWarnLog = i % 128;
            if (i % 2 != 0) {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                AppsFlyerRequestListener appsFlyerRequestListener = aFa1pSDK.AFInAppEventParameterName;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener2 = aFa1pSDK.AFInAppEventParameterName;
            throw null;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventType().AFInAppEventType());
        if (referrer == null) {
            afWarnLog = (afErrorLog + 81) % 128;
            referrer = "";
        }
        aFa1pSDK.d = referrer;
        AFInAppEventParameterName(aFa1pSDK);
    }

    public static String AFInAppEventType(SimpleDateFormat simpleDateFormat, long j2) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j2));
        int i = afWarnLog + ISO781611.SMT_TAG;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    private void AFInAppEventType(String str) {
        byte b4 = 0;
        AFa1pSDK aFa1pSDKAFKeystoreWrapper = new AFh1lSDK().AFKeystoreWrapper(AFInAppEventType().valueOf().values.valueOf("appsFlyerCount", 0));
        aFa1pSDKAFKeystoreWrapper.d = str;
        if (str != null) {
            afWarnLog = (afErrorLog + 47) % 128;
            if (str.length() > 5) {
                int i = afErrorLog + 53;
                afWarnLog = i % 128;
                if (i % 2 != 0) {
                    if (AFInAppEventType().force().AFInAppEventType(aFa1pSDKAFKeystoreWrapper)) {
                        AFj1qSDK.AFInAppEventParameterName(AFInAppEventType().AFInAppEventParameterName(), new AFa1tSDK(this, aFa1pSDKAFKeystoreWrapper, b4), 5L, TimeUnit.MILLISECONDS);
                        return;
                    }
                    return;
                }
                AFInAppEventType().force().AFInAppEventType(aFa1pSDKAFKeystoreWrapper);
                throw null;
            }
        }
    }

    public static AFb1rSDK AFInAppEventParameterName() {
        int i = afErrorLog;
        AFb1rSDK aFb1rSDK = AFLogger;
        afWarnLog = (i + 97) % 128;
        return aFb1rSDK;
    }

    private static void e(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                int i = afWarnLog + 93;
                afErrorLog = i % 128;
                if (i % 2 == 0) {
                    AFInAppEventParameterName("preInstallName", str);
                    return;
                } else {
                    AFInAppEventParameterName("preInstallName", str);
                    throw null;
                }
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    public final void AFInAppEventParameterName(Context context, Intent intent) {
        AFj1xSDK aFj1xSDK = new AFj1xSDK(intent);
        if (aFj1xSDK.valueOf("appsflyer_preinstall") != null) {
            int i = afWarnLog + 71;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                e(aFj1xSDK.valueOf("appsflyer_preinstall"));
                throw null;
            }
            e(aFj1xSDK.valueOf("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String strValueOf = aFj1xSDK.valueOf("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(strValueOf)));
        if (strValueOf != null) {
            int i2 = afWarnLog + 53;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0) {
                AFInAppEventType(context).AFInAppEventParameterName("referrer", strValueOf);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", strValueOf);
                appsFlyerProperties.AFKeystoreWrapper = strValueOf;
                if (AppsFlyerProperties.getInstance().valueOf()) {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, AFh1xSDK.onReceive);
                    AFInAppEventType(strValueOf);
                }
            } else {
                AFInAppEventType(context).AFInAppEventParameterName("referrer", strValueOf);
                AppsFlyerProperties appsFlyerProperties2 = AppsFlyerProperties.getInstance();
                appsFlyerProperties2.set("AF_REFERRER", strValueOf);
                appsFlyerProperties2.AFKeystoreWrapper = strValueOf;
                AppsFlyerProperties.getInstance().valueOf();
                throw null;
            }
        }
        int i3 = afWarnLog + 107;
        afErrorLog = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static void AFKeystoreWrapper(String str, boolean z) {
        int i = afErrorLog + ISO781611.SMT_TAG;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, z);
            throw null;
        }
        AppsFlyerProperties.getInstance().set(str, z);
        int i2 = afWarnLog + 87;
        afErrorLog = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
    }

    private void values(AppsFlyerConversionListener appsFlyerConversionListener) {
        afWarnLog = (afErrorLog + 81) % 128;
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.AFInAppEventType = appsFlyerConversionListener;
        afErrorLog = (afWarnLog + 63) % 128;
    }

    private void AFInAppEventType(AFa1pSDK aFa1pSDK) {
        String strAFInAppEventParameterName;
        Context context = AFInAppEventType().afInfoLog().AFKeystoreWrapper;
        if (context == null) {
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        String str = AFInAppEventType().v().AFLogger;
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1pSDK.AFInAppEventParameterName;
        if (str != null && str.length() != 0) {
            AFd1pSDK aFd1pSDKAFInAppEventType = AFInAppEventType(context);
            AppsFlyerProperties.getInstance().saveProperties(aFd1pSDKAFInAppEventType);
            if (!AFInAppEventType().v().valueOf()) {
                AFLogger.afInfoLog("sendWithEvent from activity: ".concat(context.getClass().getName()));
            }
            boolean zAFInAppEventParameterName = aFa1pSDK.AFInAppEventParameterName();
            Map<String, ?> mapValues = values(aFa1pSDK);
            if (!isStopped()) {
                AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                afWarnLog = (afErrorLog + 7) % 128;
            }
            int i = 0;
            int iAFInAppEventType = AFInAppEventType(aFd1pSDKAFInAppEventType, false);
            AFj1uSDK aFj1uSDK = new AFj1uSDK(AFInAppEventType().valueOf());
            Intrinsics.checkNotNullParameter(aFa1pSDK, "");
            boolean zAFInAppEventParameterName2 = aFa1pSDK.AFInAppEventParameterName();
            boolean z = aFa1pSDK instanceof AFh1sSDK;
            boolean z3 = aFa1pSDK instanceof AFh1qSDK;
            boolean z4 = aFa1pSDK instanceof AFh1lSDK;
            if ((aFa1pSDK instanceof AFh1oSDK) || z4) {
                strAFInAppEventParameterName = aFj1uSDK.valueOf.AFInAppEventParameterName(AFj1uSDK.AFInAppEventParameterName);
            } else if (z3) {
                strAFInAppEventParameterName = aFj1uSDK.valueOf.AFInAppEventParameterName(AFj1uSDK.valueOf);
            } else if (z) {
                afErrorLog = (afWarnLog + 103) % 128;
                strAFInAppEventParameterName = aFj1uSDK.valueOf.AFInAppEventParameterName(AFj1uSDK.AFInAppEventType);
            } else if (zAFInAppEventParameterName2) {
                afErrorLog = (afWarnLog + 91) % 128;
                if (aFj1uSDK.AFKeystoreWrapper.values.valueOf("appsFlyerCount", 0) < 2) {
                    strAFInAppEventParameterName = aFj1uSDK.valueOf.AFInAppEventParameterName(AFj1uSDK.e);
                } else {
                    strAFInAppEventParameterName = aFj1uSDK.valueOf.AFInAppEventParameterName(AFj1uSDK.registerClient);
                }
            } else {
                strAFInAppEventParameterName = aFj1uSDK.valueOf.AFInAppEventParameterName(AFj1uSDK.d);
            }
            StringBuilder sbS = p.a.s(strAFInAppEventParameterName);
            sbS.append(aFj1uSDK.AFKeystoreWrapper.valueOf.AFKeystoreWrapper.getPackageName());
            String strValues = aFj1uSDK.values(AFj1uSDK.AFInAppEventType(sbS.toString(), z));
            AFInAppEventParameterName(mapValues);
            AFc1uSDK aFc1uSDK = new AFc1uSDK(AFInAppEventType(), aFa1pSDK.AFInAppEventType(strValues).AFInAppEventType(mapValues).AFKeystoreWrapper(iAFInAppEventType), AFInAppEventType().afErrorLog().AFInAppEventType());
            if (zAFInAppEventParameterName) {
                AFi1bSDK[] aFi1bSDKArrUnregisterClient = unregisterClient();
                int length = aFi1bSDKArrUnregisterClient.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = afWarnLog + 25;
                    afErrorLog = i3 % 128;
                    if (i3 % 2 == 0) {
                        AFi1bSDK aFi1bSDK = aFi1bSDKArrUnregisterClient[i];
                        if (aFi1bSDK.AFInAppEventType == AFi1bSDK.AFa1uSDK.STARTED) {
                            StringBuilder sb6 = new StringBuilder("Failed to get ");
                            sb6.append(aFi1bSDK.AFInAppEventParameterName);
                            sb6.append(" referrer, wait ...");
                            AFLogger.afDebugLog(sb6.toString());
                            afWarnLog = (afErrorLog + 9) % 128;
                            i2 = 1;
                        }
                        i++;
                    } else {
                        AFi1bSDK.AFa1uSDK aFa1uSDK = aFi1bSDKArrUnregisterClient[i].AFInAppEventType;
                        AFi1bSDK.AFa1uSDK aFa1uSDK2 = AFi1bSDK.AFa1uSDK.NOT_STARTED;
                        throw null;
                    }
                }
                if (AFInAppEventType().afErrorLog().values()) {
                    AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                    i = 1;
                } else {
                    i = i2;
                }
                if (AFInAppEventType().v().values()) {
                    i = 1;
                }
            }
            AFj1qSDK.AFInAppEventParameterName(AFInAppEventType().AFInAppEventParameterName(), aFc1uSDK, i != 0 ? 500L : 0L, TimeUnit.MILLISECONDS);
            return;
        }
        AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
        AFLogger.afInfoLog("AppsFlyer will not track this event.");
        if (appsFlyerRequestListener != null) {
            afWarnLog = (afErrorLog + 73) % 128;
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    public static Map<String, Object> AFKeystoreWrapper(Map<String, Object> map) {
        afWarnLog = (afErrorLog + 87) % 128;
        if (map.containsKey("meta")) {
            int i = afErrorLog + 57;
            afWarnLog = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            return (Map) map.get("meta");
        }
        HashMap map2 = new HashMap();
        map.put("meta", map2);
        return map2;
    }

    private void values(Context context, String str) {
        AFh1nSDK aFh1nSDK = new AFh1nSDK();
        valueOf(context);
        aFh1nSDK.e = null;
        aFh1nSDK.valueOf = null;
        aFh1nSDK.d = str;
        aFh1nSDK.values = null;
        AFInAppEventParameterName(aFh1nSDK);
        int i = afWarnLog + 89;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1aSDK aFe1aSDKW = this.force.w();
        aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(new AFf1kSDK(this.force, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i = afErrorLog + 107;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static boolean valueOf(String str) {
        AppsFlyerProperties appsFlyerProperties;
        boolean z;
        int i = afErrorLog + 77;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            appsFlyerProperties = AppsFlyerProperties.getInstance();
            z = true;
        } else {
            appsFlyerProperties = AppsFlyerProperties.getInstance();
            z = false;
        }
        return appsFlyerProperties.getBoolean(str, z);
    }

    public final boolean valueOf() {
        if (!valueOf("waitForCustomerId")) {
            return false;
        }
        afWarnLog = (afErrorLog + 23) % 128;
        if (values() != null) {
            return false;
        }
        afWarnLog = (afErrorLog + 51) % 128;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[PHI: r1 r3
      0x0046: PHI (r1v11 java.lang.String) = (r1v10 java.lang.String), (r1v22 java.lang.String) binds: [B:10:0x0044, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r3v4 com.appsflyer.internal.AFc1tSDK) = (r3v3 com.appsflyer.internal.AFc1tSDK), (r3v16 com.appsflyer.internal.AFc1tSDK) binds: [B:10:0x0044, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void valueOf(android.content.Context r9, com.appsflyer.internal.AFc1oSDK r10, android.net.Uri r11, android.net.Uri r12) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.valueOf(android.content.Context, com.appsflyer.internal.AFc1oSDK, android.net.Uri, android.net.Uri):void");
    }

    private static String AFKeystoreWrapper(Activity activity) {
        Intent intent;
        afWarnLog = (afErrorLog + 9) % 128;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return null;
                }
                int i = afErrorLog + 91;
                afWarnLog = i % 128;
                if (i % 2 != 0) {
                    String string = extras.getString("af");
                    if (string == null) {
                        return string;
                    }
                    int i2 = afErrorLog + 31;
                    afWarnLog = i2 % 128;
                    try {
                        if (i2 % 2 != 0) {
                            AFLogger.INSTANCE.w(AFg1bSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(string)));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                            return string;
                        }
                        AFLogger.INSTANCE.w(AFg1bSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(string)));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                        throw null;
                    } catch (Throwable th10) {
                        th = th10;
                        str = string;
                    }
                } else {
                    String string2 = extras.getString("af");
                    try {
                        throw null;
                    } catch (Throwable th11) {
                        str = string2;
                        th = th11;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
            AFLogger.INSTANCE.e(AFg1bSDK.ENGAGEMENT, th.getMessage(), th);
        }
        return str;
    }

    @NonNull
    public final Map<String, Object> values(AFa1pSDK aFa1pSDK) {
        final Context context = AFInAppEventType().afInfoLog().AFKeystoreWrapper;
        AFd1pSDK aFd1pSDKAFInAppEventType = AFInAppEventType(context);
        AFg1mSDK aFg1mSDKAFLogger = AFInAppEventType().AFLogger();
        boolean zAFInAppEventParameterName = aFa1pSDK.AFInAppEventParameterName();
        Map<String, Object> map = aFa1pSDK.AFKeystoreWrapper;
        long time = new Date().getTime();
        boolean z = false;
        Object[] objArr = new Object[1];
        a("\u0007\u0001\u0005\u0002\u0004\u0000\b\u0003\u0007\u0005\u0002\u0001", (byte) (47 - TextUtils.lastIndexOf("", '0', 0)), KeyEvent.keyCodeFromString("") + 12, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (!isStopped()) {
                StringBuilder sb6 = new StringBuilder("******* sendTrackingWithEvent: ");
                sb6.append(zAFInAppEventParameterName ? "Launch" : aFa1pSDK.e);
                AFLogger.afInfoLog(sb6.toString());
            } else {
                AFLogger.afInfoLog("Reporting has been stopped");
            }
            registerClient(context);
            aFg1mSDKAFLogger.values(map, isPreInstalledApp(context), new Function0() { // from class: com.appsflyer.internal.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f26042a.d(context);
                }
            });
            int iAFInAppEventType = AFInAppEventType(aFd1pSDKAFInAppEventType, zAFInAppEventParameterName);
            if (aFa1pSDK.e != null) {
                afErrorLog = (afWarnLog + 47) % 128;
                z = true;
            } else {
                afErrorLog = (afWarnLog + 75) % 128;
            }
            int iValueOf = valueOf(aFd1pSDKAFInAppEventType, z);
            if (zAFInAppEventParameterName && iAFInAppEventType == 1) {
                AppsFlyerProperties.getInstance().valueOf = true;
            }
            aFg1mSDKAFLogger.valueOf(map, iAFInAppEventType, iValueOf);
            return map;
        } catch (Throwable th10) {
            AFLogger.afErrorLog(th10.getLocalizedMessage(), th10, true);
            return map;
        }
    }

    private static void AFInAppEventParameterName(String str, String str2) {
        afWarnLog = (afErrorLog + ISO781611.SMT_TAG) % 128;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i = afErrorLog + 73;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void AFInAppEventParameterName(Context context) {
        afWarnLog = (afErrorLog + 1) % 128;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                int i = afErrorLog + 69;
                afWarnLog = i % 128;
                if (i % 2 != 0) {
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.i(AFg1bSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    } else {
                        AFLogger.INSTANCE.w(AFg1bSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules", true);
                        return;
                    }
                }
                context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName());
                throw null;
            }
        } catch (Exception e) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1bSDK aFg1bSDK = AFg1bSDK.GENERAL;
            aFLogger.e(aFg1bSDK, "checkBackupRules Exception", e, false, false);
            aFLogger.v(aFg1bSDK, "checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String d(Context context) {
        afErrorLog = (afWarnLog + 53) % 128;
        String attributionId = getAttributionId(context);
        int i = afWarnLog + 65;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            return attributionId;
        }
        throw null;
    }

    private static int AFKeystoreWrapper(AFd1pSDK aFd1pSDK) {
        afWarnLog = (afErrorLog + 53) % 128;
        int iAFInAppEventType = AFInAppEventType(aFd1pSDK, "appsFlyerAdRevenueCount", true);
        afWarnLog = (afErrorLog + 105) % 128;
        return iAFInAppEventType;
    }

    private static String AFKeystoreWrapper(String str) {
        if (str == null) {
            int i = afWarnLog;
            int i2 = i + 97;
            afErrorLog = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = i + 87;
            afErrorLog = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains("access_token")) {
            return str;
        }
        afErrorLog = (afWarnLog + 61) % 128;
        String strAFInAppEventParameterName = AFInAppEventParameterName(str);
        if (strAFInAppEventParameterName.length() == 0) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (strAFInAppEventParameterName.contains("&")) {
            arrayList = new ArrayList(Arrays.asList(strAFInAppEventParameterName.split("&")));
        } else {
            arrayList.add(strAFInAppEventParameterName);
        }
        StringBuilder sb6 = new StringBuilder();
        Iterator it8 = arrayList.iterator();
        afErrorLog = (afWarnLog + 85) % 128;
        while (it8.hasNext()) {
            String str2 = (String) it8.next();
            if (str2.contains("access_token")) {
                it8.remove();
            } else {
                if (sb6.length() != 0) {
                    sb6.append("&");
                } else if (!str2.startsWith("?")) {
                    int i5 = afWarnLog + 83;
                    afErrorLog = i5 % 128;
                    if (i5 % 2 != 0) {
                        sb6.append("?");
                        throw null;
                    }
                    sb6.append("?");
                }
                sb6.append(str2);
                afWarnLog = (afErrorLog + 121) % 128;
            }
        }
        return str.replace(strAFInAppEventParameterName, sb6.toString());
    }

    private void AFInAppEventParameterName(Context context, AFh1xSDK aFh1xSDK) {
        valueOf(context);
        AFh1wSDK aFh1wSDKRegisterClient = AFInAppEventType().registerClient();
        AFh1uSDK aFh1uSDKValueOf = AFa1mSDK.valueOf(context);
        if (aFh1wSDKRegisterClient.values()) {
            aFh1wSDKRegisterClient.AFKeystoreWrapper.put("api_name", aFh1xSDK.toString());
            aFh1wSDKRegisterClient.AFInAppEventType(aFh1uSDKValueOf);
            afWarnLog = (afErrorLog + 55) % 128;
        }
        aFh1wSDKRegisterClient.AFInAppEventType();
        afWarnLog = (afErrorLog + 123) % 128;
    }

    private static int values(AFd1pSDK aFd1pSDK) {
        afWarnLog = (afErrorLog + 75) % 128;
        int iAFInAppEventType = AFInAppEventType(aFd1pSDK, "appsFlyerAdImpressionCount", true);
        afErrorLog = (afWarnLog + 97) % 128;
        return iAFInAppEventType;
    }

    private void AFInAppEventParameterName(Context context, Map<String, Object> map, AFa1pSDK aFa1pSDK) {
        int i = afErrorLog + 77;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            valueOf(context);
            aFa1pSDK.AFInAppEventType((Map<String, ?>) map);
            values(aFa1pSDK, e(context));
            afErrorLog = (afWarnLog + LDSFile.EF_DG2_TAG) % 128;
            return;
        }
        valueOf(context);
        aFa1pSDK.AFInAppEventType((Map<String, ?>) map);
        values(aFa1pSDK, e(context));
        throw null;
    }

    private AFf1lSDK.AFa1ySDK values(final Map<String, String> map) {
        AFf1lSDK.AFa1ySDK aFa1ySDK = new AFf1lSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFb1rSDK.3
            @Override // com.appsflyer.internal.AFf1lSDK.AFa1ySDK
            public final void AFInAppEventType(String str) {
                AFb1rSDK.this.AFInAppEventType().afDebugLog().AFInAppEventType(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1lSDK.AFa1ySDK
            public final void AFKeystoreWrapper(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1rSDK.this.AFInAppEventType().afDebugLog().AFInAppEventParameterName(map);
            }
        };
        int i = afErrorLog + 69;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            return aFa1ySDK;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public static synchronized SharedPreferences values(Context context) {
        AFb1rSDK aFb1rSDKAFInAppEventParameterName;
        SharedPreferences sharedPreferences;
        try {
            if (AFInAppEventParameterName().i == null) {
                int i = afWarnLog + 11;
                afErrorLog = i % 128;
                StrictMode.ThreadPolicy threadPolicy = i % 2;
                try {
                    if (threadPolicy != 0) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        aFb1rSDKAFInAppEventParameterName = AFInAppEventParameterName();
                        sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = threadPolicyAllowThreadDiskReads;
                    } else {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        aFb1rSDKAFInAppEventParameterName = AFInAppEventParameterName();
                        sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = threadPolicyAllowThreadDiskReads2;
                    }
                    aFb1rSDKAFInAppEventParameterName.i = sharedPreferences;
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (Throwable th10) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th10;
                }
            }
            SharedPreferences sharedPreferences2 = AFInAppEventParameterName().i;
            int i2 = afWarnLog + 23;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0) {
                return sharedPreferences2;
            }
            int i3 = 11 / 0;
            return sharedPreferences2;
        } catch (Throwable th11) {
            throw th11;
        }
    }

    private void AFInAppEventParameterName(AFa1pSDK aFa1pSDK) {
        int i = afErrorLog + 87;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            byte b4 = 0;
            boolean z = aFa1pSDK.e == null;
            if (valueOf()) {
                AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                return;
            }
            if (z) {
                if (AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true)) {
                    afWarnLog = (afErrorLog + 31) % 128;
                    if (d()) {
                        AppsFlyerRequestListener appsFlyerRequestListener = aFa1pSDK.AFInAppEventParameterName;
                        if (appsFlyerRequestListener != null) {
                            int i2 = afErrorLog + 39;
                            afWarnLog = i2 % 128;
                            appsFlyerRequestListener.onError(i2 % 2 == 0 ? 84 : 10, "Event timeout. Check 'minTimeBetweenSessions' param");
                            afWarnLog = (afErrorLog + 57) % 128;
                            return;
                        }
                        return;
                    }
                } else {
                    AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                }
                this.e = System.currentTimeMillis();
                afWarnLog = (afErrorLog + 49) % 128;
            }
            AFj1qSDK.AFInAppEventParameterName(AFInAppEventType().AFInAppEventParameterName(), new AFa1tSDK(this, aFa1pSDK, b4), 0L, TimeUnit.MILLISECONDS);
            return;
        }
        String str = aFa1pSDK.e;
        throw null;
    }

    public static boolean AFKeystoreWrapper(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i = afWarnLog + 35;
                afErrorLog = i % 128;
                return i % 2 == 0;
            }
        } catch (Throwable th10) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th10);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            int i2 = afWarnLog + 89;
            afErrorLog = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 66 / 0;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFg1bSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    private static int valueOf(AFd1pSDK aFd1pSDK, boolean z) {
        afErrorLog = (afWarnLog + 17) % 128;
        int iAFInAppEventType = AFInAppEventType(aFd1pSDK, "appsFlyerInAppEventCount", z);
        afErrorLog = (afWarnLog + 95) % 128;
        return iAFInAppEventType;
    }

    private static void valueOf(@NonNull AFa1pSDK aFa1pSDK, AFh1pSDK aFh1pSDK) {
        int i = afWarnLog;
        int i2 = i + 121;
        afErrorLog = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (aFh1pSDK != null) {
            aFa1pSDK.values = aFh1pSDK.AFKeystoreWrapper;
            aFa1pSDK.AFLogger = aFh1pSDK.valueOf;
        }
        int i3 = i + 91;
        afErrorLog = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private String AFKeystoreWrapper(Context context, String str) {
        int i = afWarnLog;
        afErrorLog = (i + 61) % 128;
        if (context == null) {
            int i2 = i + 93;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        valueOf(context);
        return AFInAppEventType().valueOf().AFInAppEventType(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[Catch: Exception -> 0x0055, TryCatch #2 {Exception -> 0x0055, blocks: (B:11:0x003f, B:13:0x004f, B:25:0x0075, B:27:0x0085, B:31:0x009c, B:33:0x00a0, B:35:0x00a4, B:22:0x0067, B:24:0x006f, B:20:0x0057), top: B:45:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFInAppEventParameterName(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "collectAndroidIdForceByUser"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Lad
            int r0 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r0 = r0 + 81
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r0
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "collectIMEIForceByUser"
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L23
            goto Lad
        L23:
            int r0 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r0 = r0 + 103
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r0
            java.lang.String r0 = "advertiserId"
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto Lad
            int r0 = com.appsflyer.internal.AFb1rSDK.afErrorLog
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afWarnLog = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L57
            com.appsflyer.internal.AFd1fSDK r0 = r3.AFInAppEventType()     // Catch: java.lang.Exception -> L55
            com.appsflyer.internal.AFd1oSDK r0 = r0.getLevel()     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = r0.AFInAppEventType     // Catch: java.lang.Exception -> L55
            boolean r0 = com.appsflyer.internal.AFc1vSDK.valueOf(r0)     // Catch: java.lang.Exception -> L55
            r1 = 28
            int r1 = r1 / r2
            if (r0 == 0) goto L75
            goto L67
        L53:
            r4 = move-exception
            throw r4
        L55:
            r4 = move-exception
            goto La8
        L57:
            com.appsflyer.internal.AFd1fSDK r0 = r3.AFInAppEventType()     // Catch: java.lang.Exception -> L55
            com.appsflyer.internal.AFd1oSDK r0 = r0.getLevel()     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = r0.AFInAppEventType     // Catch: java.lang.Exception -> L55
            boolean r0 = com.appsflyer.internal.AFc1vSDK.valueOf(r0)     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L75
        L67:
            java.lang.String r0 = "android_id"
            java.lang.Object r0 = r4.remove(r0)     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L75
            java.lang.String r0 = "validateGaidAndIMEI :: removing: android_id"
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch: java.lang.Exception -> L55
        L75:
            com.appsflyer.internal.AFd1fSDK r0 = r3.AFInAppEventType()     // Catch: java.lang.Exception -> L55
            com.appsflyer.internal.AFg1wSDK r0 = r0.v()     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = r0.registerClient     // Catch: java.lang.Exception -> L55
            boolean r0 = com.appsflyer.internal.AFc1vSDK.valueOf(r0)     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto La7
            java.lang.String r0 = "imei"
            java.lang.Object r4 = r4.remove(r0)     // Catch: java.lang.Exception -> L55
            if (r4 == 0) goto La7
            int r4 = com.appsflyer.internal.AFb1rSDK.afWarnLog
            int r4 = r4 + 25
            int r0 = r4 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r0
            int r4 = r4 % 2
            java.lang.String r0 = "validateGaidAndIMEI :: removing: imei"
            if (r4 != 0) goto La0
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch: java.lang.Exception -> L55
            return
        La0:
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch: java.lang.Exception -> L55
            r4 = 0
            throw r4     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> La5
        La5:
            r4 = move-exception
            throw r4
        La7:
            return
        La8:
            java.lang.String r0 = "failed to remove IMEI or AndroidID key from params; "
            com.appsflyer.AFLogger.afErrorLog(r0, r4)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.AFInAppEventParameterName(java.util.Map):void");
    }

    public static String AFInAppEventType(AFd1pSDK aFd1pSDK, String str) {
        afWarnLog = (afErrorLog + 41) % 128;
        String strAFKeystoreWrapper = aFd1pSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
        if (strAFKeystoreWrapper != null) {
            afErrorLog = (afWarnLog + 11) % 128;
            return strAFKeystoreWrapper;
        }
        aFd1pSDK.AFInAppEventParameterName("CACHED_CHANNEL", str);
        int i = afErrorLog + LDSFile.EF_DG15_TAG;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            int i2 = 32 / 0;
        }
        return str;
    }

    public final AFd1pSDK AFInAppEventType(Context context) {
        int i = afErrorLog + 121;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            valueOf(context);
            AFd1pSDK aFd1pSDKAFInAppEventType = AFInAppEventType().AFInAppEventType();
            afWarnLog = (afErrorLog + 55) % 128;
            return aFd1pSDKAFInAppEventType;
        }
        valueOf(context);
        AFInAppEventType().AFInAppEventType();
        throw null;
    }

    public static int AFInAppEventType(AFd1pSDK aFd1pSDK, boolean z) {
        afErrorLog = (afWarnLog + 107) % 128;
        int iAFInAppEventType = AFInAppEventType(aFd1pSDK, "appsFlyerCount", z);
        afErrorLog = (afWarnLog + 81) % 128;
        return iAFInAppEventType;
    }

    private static int AFInAppEventType(AFd1pSDK aFd1pSDK, String str, boolean z) {
        int iValueOf = aFd1pSDK.valueOf(str, 0);
        if (z) {
            int i = afWarnLog + 87;
            afErrorLog = i % 128;
            iValueOf = i % 2 != 0 ? iValueOf + 57 : iValueOf + 1;
            aFd1pSDK.AFInAppEventParameterName(str, iValueOf);
        }
        int i2 = afWarnLog + 69;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            return iValueOf;
        }
        throw null;
    }

    private static String AFInAppEventParameterName(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1) {
            return str.substring(iIndexOf);
        }
        afWarnLog = (afErrorLog + 29) % 128;
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(Context context, Intent intent) {
        Uri data;
        int i = afWarnLog + LDSFile.EF_DG15_TAG;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            valueOf(context);
            AFc1tSDK aFc1tSDKAfDebugLog = AFInAppEventType().afDebugLog();
            AFd1pSDK aFd1pSDKAFInAppEventType = AFInAppEventType().AFInAppEventType();
            if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
                data = null;
            } else {
                data = intent.getData();
                afWarnLog = (afErrorLog + 105) % 128;
            }
            boolean z = (data == null || data.toString().isEmpty()) ? false : true;
            if (aFd1pSDKAFInAppEventType.AFKeystoreWrapper("ddl_sent")) {
                afWarnLog = (afErrorLog + 49) % 128;
                if (!z) {
                    aFc1tSDKAfDebugLog.AFInAppEventType("No direct deep link", null);
                    return;
                }
            }
            aFc1tSDKAfDebugLog.AFInAppEventParameterName(AFc1oSDK.AFInAppEventType(aFc1tSDKAfDebugLog.d.getPurchaseToken()), intent, context);
            return;
        }
        valueOf(context);
        AFInAppEventType().afDebugLog();
        AFInAppEventType().AFInAppEventType();
        throw null;
    }
}
