package com.google.firebase.messaging;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final long d = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f49550c;

    public v(String str, String str2, long j2) {
        this.f49548a = str;
        this.f49549b = str2;
        this.f49550c = j2;
    }

    public static String a(long j2, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j2);
            return jSONObject.toString();
        } catch (JSONException e) {
            String str3 = "Failed to encode token: " + e;
            return null;
        }
    }

    public static v b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new v(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new v(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String str2 = "Failed to parse token: " + e;
            return null;
        }
    }
}
