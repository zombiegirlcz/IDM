package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1tSDK {
    public String AFInAppEventParameterName;
    public Intent AFInAppEventType;
    public Map<String, String> AFKeystoreWrapper;
    public String[] AFLogger;
    public final AFd1fSDK d;
    public long unregisterClient;
    public DeepLinkListener valueOf;

    @NonNull
    public List<List<String>> values = new ArrayList();

    @NonNull
    public final List<String> e = new ArrayList();

    public AFc1tSDK(@NonNull AFd1fSDK aFd1fSDK) {
        this.d = aFd1fSDK;
    }

    private static void valueOf(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb6 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb6.append(map.toString());
                AFLogger.afDebugLog(sb6.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th10) {
                AFLogger.afErrorLog(th10.getLocalizedMessage(), th10);
            }
        }
    }

    private Uri values(Object obj2, Iterator<String> it8) {
        while (obj2 != JSONObject.NULL) {
            if (!it8.hasNext()) {
                Uri uri2 = Uri.parse(obj2.toString());
                if (uri2 == null || uri2.getScheme() == null || uri2.getHost() == null) {
                    return null;
                }
                return uri2;
            }
            try {
                obj2 = new JSONObject(obj2.toString()).get(it8.next());
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    public final void AFInAppEventParameterName(AFc1oSDK aFc1oSDK, Intent intent, Context context) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) this.d;
        if (context != null) {
            aFd1kSDK.values.AFKeystoreWrapper = context.getApplicationContext();
        }
        if (!AFInAppEventType(intent, context, aFc1oSDK) && this.valueOf != null && this.d.valueOf().values.valueOf("appsFlyerCount", 0) == 0 && !this.d.AFInAppEventType().AFKeystoreWrapper("ddl_sent")) {
            AFc1qSDK aFc1qSDK = new AFc1qSDK();
            AFe1aSDK aFe1aSDKW = this.d.w();
            aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(new AFf1iSDK(aFc1qSDK, this.d)));
        }
        this.d.AFInAppEventType().AFKeystoreWrapper("ddl_sent", true);
    }

    public final void AFInAppEventType(String str, DeepLinkResult.Error error) {
        if (this.valueOf == null) {
            values(str);
        } else {
            AFLogger.INSTANCE.d(AFg1bSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventParameterName(new DeepLinkResult(null, error));
        }
    }

    public final void AFKeystoreWrapper(Context context, AFc1oSDK aFc1oSDK, Uri uri2) {
        AFf1hSDK aFf1hSDK = new AFf1hSDK(context, aFc1oSDK, uri2, this.e);
        AFe1aSDK aFe1aSDKW = this.d.w();
        aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(aFf1hSDK));
        this.AFInAppEventType = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[LOOP:0: B:21:0x0047->B:66:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean AFInAppEventType(android.content.Intent r10, android.content.Context r11, com.appsflyer.internal.AFc1oSDK r12) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1tSDK.AFInAppEventType(android.content.Intent, android.content.Context, com.appsflyer.internal.AFc1oSDK):boolean");
    }

    private static void values(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th10) {
                AFLogger.afErrorLog(th10.getLocalizedMessage(), th10);
            }
        }
    }

    public final void AFInAppEventParameterName(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.valueOf != null) {
            try {
                try {
                    DeepLink deepLinkValues = DeepLink.values(map);
                    deepLinkValues.AFInAppEventParameterName.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(deepLinkValues, null);
                } catch (JSONException e) {
                    AFLogger.INSTANCE.e(AFg1bSDK.DDL, "Error occurred", e, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                AFInAppEventParameterName(deepLinkResult);
                return;
            } catch (Throwable th10) {
                AFInAppEventParameterName(new DeepLinkResult(null, null));
                throw th10;
            }
        }
        valueOf(map);
    }

    public final void AFInAppEventParameterName(DeepLinkResult deepLinkResult) {
        if (this.valueOf != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1bSDK aFg1bSDK = AFg1bSDK.DDL;
            StringBuilder sb6 = new StringBuilder("Calling onDeepLinking with:\n");
            sb6.append(deepLinkResult.toString());
            aFLogger.d(aFg1bSDK, sb6.toString());
            try {
                this.valueOf.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th10) {
                AFLogger.afErrorLog(th10.getLocalizedMessage(), th10);
                return;
            }
        }
        AFLogger.INSTANCE.d(AFg1bSDK.DDL, "skipping, no callback registered");
    }
}
