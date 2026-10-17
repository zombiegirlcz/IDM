package cl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class f {
    public static g a(String json) {
        Object objA;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            m.Companion companion = m.INSTANCE;
            JSONObject jSONObject = new JSONObject(json);
            objA = new g(jSONObject.getString("onfido_api_url"), jSONObject.getString("auth_url"));
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        return (g) objA;
    }
}
