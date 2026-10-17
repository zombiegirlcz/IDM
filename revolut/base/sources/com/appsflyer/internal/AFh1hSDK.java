package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yhm.m;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1hSDK {
    public final AFh1eSDK AFInAppEventParameterName;
    public final AFh1bSDK AFInAppEventType;
    public AFh1dSDK values;

    public AFh1hSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.values = AFKeystoreWrapper(jSONObject);
        this.AFInAppEventParameterName = AFInAppEventParameterName(jSONObject);
        this.AFInAppEventType = valueOf(jSONObject);
    }

    private static AFh1eSDK AFInAppEventParameterName(JSONObject jSONObject) {
        Object objA;
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            JSONObject jSONObjectAFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "exc_mngr");
            objA = jSONObjectAFKeystoreWrapper != null ? new AFh1eSDK(jSONObjectAFKeystoreWrapper.getString("sdk_ver"), jSONObjectAFKeystoreWrapper.optInt("min", -1), jSONObjectAFKeystoreWrapper.optInt("expire", -1), jSONObjectAFKeystoreWrapper.optLong("ttl", -1L)) : null;
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        return (AFh1eSDK) (objA instanceof yhm.n ? null : objA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    private static AFh1dSDK AFKeystoreWrapper(JSONObject jSONObject) {
        Object objA;
        ?? arrayList;
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            JSONObject jSONObjectAFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "r_debugger");
            if (jSONObjectAFKeystoreWrapper != null) {
                long j2 = jSONObjectAFKeystoreWrapper.getLong("ttl");
                int i = jSONObjectAFKeystoreWrapper.getInt("counter");
                String strOptString = jSONObjectAFKeystoreWrapper.optString("app_ver", "");
                String strOptString2 = jSONObjectAFKeystoreWrapper.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectAFKeystoreWrapper.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectAFKeystoreWrapper.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArrayOptJSONArray.getString(i2);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                ?? r72 = arrayList;
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                objA = new AFh1dSDK(j2, fOptDouble, r72, i, strOptString, strOptString2);
            } else {
                objA = null;
            }
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        m.Companion aVar3 = yhm.m.INSTANCE;
        return (AFh1dSDK) (objA instanceof yhm.n ? null : objA);
    }

    private static AFh1bSDK valueOf(JSONObject jSONObject) {
        Object objA;
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            JSONObject jSONObjectAFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "meta_data");
            objA = jSONObjectAFKeystoreWrapper != null ? new AFh1bSDK(jSONObjectAFKeystoreWrapper.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        return (AFh1bSDK) (objA instanceof yhm.n ? null : objA);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!AFh1hSDK.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.Features");
        }
        AFh1hSDK aFh1hSDK = (AFh1hSDK) obj2;
        return Intrinsics.f(this.AFInAppEventParameterName, aFh1hSDK.AFInAppEventParameterName) && Intrinsics.f(this.AFInAppEventType, aFh1hSDK.AFInAppEventType) && Intrinsics.f(this.values, aFh1hSDK.values);
    }

    public final int hashCode() {
        AFh1eSDK aFh1eSDK = this.AFInAppEventParameterName;
        int iHashCode = (aFh1eSDK != null ? aFh1eSDK.hashCode() : 0) * 31;
        AFh1bSDK aFh1bSDK = this.AFInAppEventType;
        int iHashCode2 = (iHashCode + (aFh1bSDK != null ? aFh1bSDK.hashCode() : 0)) * 31;
        AFh1dSDK aFh1dSDK = this.values;
        return iHashCode2 + (aFh1dSDK != null ? aFh1dSDK.hashCode() : 0);
    }

    private static JSONObject AFKeystoreWrapper(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
