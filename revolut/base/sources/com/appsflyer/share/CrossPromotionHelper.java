package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass4;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFg1bSDK;
import com.appsflyer.internal.AFj1mSDK;
import com.appsflyer.internal.AFj1nSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class CrossPromotionHelper {
    private static String values = "https://%simpression.%s";

    @NonNull
    private static LinkGenerator AFInAppEventParameterName(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.values = str3;
        linkGenerator.AFInAppEventParameterName = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        return linkGenerator;
    }

    private static void AFInAppEventType(@NonNull String str, @NonNull Context context, AFj1nSDK aFj1nSDK) {
        AFb1rSDK aFb1rSDKAFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName();
        aFb1rSDKAFInAppEventParameterName.valueOf(context);
        AFd1fSDK aFd1fSDKAFInAppEventType = aFb1rSDKAFInAppEventParameterName.AFInAppEventType();
        AFf1oSDK aFf1oSDK = new AFf1oSDK(aFd1fSDKAFInAppEventType, str, aFj1nSDK);
        AFe1aSDK aFe1aSDKW = aFd1fSDKAFInAppEventType.w();
        aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(aFf1oSDK));
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            if (key.equals("app")) {
                AFj1mSDK.AFInAppEventParameterName = value;
            } else if (key.equals("impression")) {
                values = value;
            }
        }
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator linkGeneratorAFInAppEventParameterName = AFInAppEventParameterName(context, str, str2, map, String.format(AFj1mSDK.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.AFInAppEventParameterName().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.INSTANCE.i(AFg1bSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1bSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        AFInAppEventType(linkGeneratorAFInAppEventParameterName.generateLink(), context, new AFj1nSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.INSTANCE.i(AFg1bSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1bSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            AFInAppEventType(AFInAppEventParameterName(context, str, str2, map, String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.AFInAppEventParameterName().getHostName())).generateLink(), context, null);
        }
    }
}
