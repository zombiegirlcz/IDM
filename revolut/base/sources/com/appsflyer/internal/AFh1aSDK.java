package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1aSDK {
    public final AFh1hSDK AFInAppEventParameterName;

    @NonNull
    public final String AFInAppEventType;

    @NonNull
    public final AFh1gSDK AFKeystoreWrapper;

    @NonNull
    public final String valueOf;
    private final boolean values;

    public AFh1aSDK(@NonNull String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.valueOf = string;
            this.values = jSONObject.optBoolean("test_mode");
            this.AFInAppEventType = str;
            this.AFKeystoreWrapper = string.startsWith("default") ? AFh1gSDK.DEFAULT : AFh1gSDK.CUSTOM;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ib.b.Features);
            this.AFInAppEventParameterName = jSONObjectOptJSONObject != null ? new AFh1hSDK(jSONObjectOptJSONObject) : null;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || AFh1aSDK.class != obj2.getClass()) {
            return false;
        }
        AFh1aSDK aFh1aSDK = (AFh1aSDK) obj2;
        if (this.values == aFh1aSDK.values && this.valueOf.equals(aFh1aSDK.valueOf)) {
            return this.AFInAppEventType.equals(aFh1aSDK.AFInAppEventType);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.AFInAppEventType.hashCode() + ((this.valueOf.hashCode() + ((this.values ? 1 : 0) * 31)) * 31);
        AFh1hSDK aFh1hSDK = this.AFInAppEventParameterName;
        if (aFh1hSDK == null) {
            return iHashCode;
        }
        return aFh1hSDK.hashCode() + (iHashCode * 31);
    }
}
