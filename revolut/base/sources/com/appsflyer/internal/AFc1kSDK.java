package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1kSDK implements AFe1iSDK<AFc1jSDK> {
    @Override // com.appsflyer.internal.AFe1iSDK
    public final /* synthetic */ AFc1jSDK AFKeystoreWrapper(String str) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        DeepLink deepLinkAFInAppEventParameterName = null;
        if (str == null || str.length() == 0) {
            return new AFc1jSDK(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean("found", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (zOptBoolean && (jSONObjectOptJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            deepLinkAFInAppEventParameterName = DeepLink.AFInAppEventParameterName(jSONObjectOptJSONObject);
            deepLinkAFInAppEventParameterName.AFInAppEventParameterName.put("is_deferred", true);
        }
        return new AFc1jSDK(zOptBoolean2, deepLinkAFInAppEventParameterName);
    }
}
