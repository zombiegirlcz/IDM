package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1rSDK {
    public static JSONObject AFKeystoreWrapper(String str) {
        JSONObject jSONObjectValueOf = AFa1mSDK.valueOf(str);
        if (jSONObjectValueOf != null) {
            try {
                if (jSONObjectValueOf.has("ol_id")) {
                    String strOptString = jSONObjectValueOf.optString("ol_scheme", null);
                    String strOptString2 = jSONObjectValueOf.optString("ol_domain", null);
                    String strOptString3 = jSONObjectValueOf.optString("ol_ver", null);
                    if (strOptString != null) {
                        AppsFlyerProperties.getInstance().set("onelinkScheme", strOptString);
                    }
                    if (strOptString2 != null) {
                        AppsFlyerProperties.getInstance().set("onelinkDomain", strOptString2);
                    }
                    if (strOptString3 != null) {
                        AppsFlyerProperties.getInstance().set("onelinkVersion", strOptString3);
                        return jSONObjectValueOf;
                    }
                }
            } catch (Throwable th10) {
                StringBuilder sb6 = new StringBuilder("Error in handleResponse: ");
                sb6.append(th10.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb6.toString(), th10);
                AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().i().valueOf();
                AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().i().AFKeystoreWrapper();
            }
        }
        return jSONObjectValueOf;
    }
}
