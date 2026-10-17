package cl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import md6.s;
import org.json.JSONObject;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class d {
    public static e a(String str) {
        String strE;
        Object objA;
        g gVarA;
        String string;
        if (str == null || d0.W(str) || (strE = s.e(str)) == null) {
            return null;
        }
        try {
            m.Companion companion = m.INSTANCE;
            JSONObject jSONObject = new JSONObject(strE);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("urls");
            if (jSONObjectOptJSONObject == null || (string = jSONObjectOptJSONObject.toString()) == null) {
                gVarA = null;
            } else {
                g.Companion.getClass();
                gVarA = f.a(string);
            }
            String strOptString = jSONObject.optString("uuid");
            i iVar = j.Companion;
            String json = jSONObject.getJSONObject("payload").toString();
            Intrinsics.checkNotNullExpressionValue(json, "toString(...)");
            iVar.getClass();
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObject2 = new JSONObject(json);
            String string2 = jSONObject2.getString("app");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = jSONObject2.getString("client_uuid");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            j jVar = new j(string2, string3);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("iss");
            objA = new e(gVarA, strOptString, jVar, jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        return (e) (objA instanceof n ? null : objA);
    }
}
