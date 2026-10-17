package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1pSDK implements AFg1uSDK {

    @NotNull
    private final AFg1oSDK AFInAppEventParameterName;

    @NotNull
    private final AppsFlyerProperties AFKeystoreWrapper;

    @NotNull
    private final AFd1oSDK values;

    public AFg1pSDK(@NotNull AFg1oSDK aFg1oSDK, @NotNull AFd1oSDK aFd1oSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(aFg1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1oSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFInAppEventParameterName = aFg1oSDK;
        this.values = aFd1oSDK;
        this.AFKeystoreWrapper = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1uSDK
    public final void valueOf(@NotNull Map<String, Object> map, @NotNull AFf1ySDK aFf1ySDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFf1ySDK, "");
        AFg1nSDK aFg1nSDKValueOf = this.AFInAppEventParameterName.valueOf();
        AppsFlyerConsent appsFlyerConsent = this.values.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("gdpr_applies", Boolean.valueOf(appsFlyerConsent.isUserSubjectToGDPR()));
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (aFg1nSDKValueOf != null) {
            boolean z = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(aFg1nSDKValueOf.valueOf));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(aFg1nSDKValueOf.AFKeystoreWrapper));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(aFg1nSDKValueOf.AFInAppEventType));
            if (z) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(aFg1nSDKValueOf.values));
                linkedHashMap3.put("tcstring", aFg1nSDKValueOf.AFInAppEventParameterName);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFf1ySDK != AFf1ySDK.CONVERSION || this.AFKeystoreWrapper.getString("enableTCFDataCollection") == null) {
            return;
        }
        Map<String, Object> mapAFKeystoreWrapper = AFb1rSDK.AFKeystoreWrapper(map);
        Intrinsics.checkNotNullExpressionValue(mapAFKeystoreWrapper, "");
        mapAFKeystoreWrapper.put("api", q0.c(new Pair("enableTCFDataCollection", this.AFKeystoreWrapper.getString("enableTCFDataCollection"))));
    }
}
