package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1eSDK {
    public final int AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final long valueOf;
    public final int values;

    public AFh1eSDK(String str, int i, int i2, long j2) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventType = i;
        this.values = i2;
        this.valueOf = j2;
    }

    public final String AFInAppEventType() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.AFKeystoreWrapper);
            jSONObject.put("min", this.AFInAppEventType);
            jSONObject.put("expire", this.values);
            jSONObject.put("ttl", this.valueOf);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final boolean equals(Object obj2) {
        String str;
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && AFh1eSDK.class == obj2.getClass()) {
            AFh1eSDK aFh1eSDK = (AFh1eSDK) obj2;
            if (this.AFInAppEventType == aFh1eSDK.AFInAppEventType && this.values == aFh1eSDK.values && this.valueOf == aFh1eSDK.valueOf && (str = this.AFKeystoreWrapper) != null && str.equals(aFh1eSDK.AFKeystoreWrapper)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.AFInAppEventType) * 31) + this.values) * 31) + ((int) this.valueOf);
    }
}
