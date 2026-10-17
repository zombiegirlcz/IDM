package com.fourthline.orca.internal;

import com.fourthline.orca.internal.nx0;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public abstract class xa0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(nx0.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        List listB = aVar.b();
        JSONArray jSONArray = new JSONArray();
        Iterator it8 = listB.iterator();
        while (it8.hasNext()) {
            jSONArray.put(a((nx0.a.b) it8.next()));
        }
        jSONObject.put("authorizedDocuments", jSONArray);
        List listA = aVar.a();
        JSONArray jSONArray2 = new JSONArray();
        Iterator it9 = listA.iterator();
        while (it9.hasNext()) {
            jSONArray2.put(a((nx0.a.C0253a) it9.next()));
        }
        jSONObject.put("legalDocumentsAccepted", jSONArray2);
        return jSONObject;
    }

    private static final JSONObject a(nx0.a.b bVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("documentId", bVar.b());
        jSONObject.put("documentHash", bVar.a());
        return jSONObject;
    }

    private static final JSONObject a(nx0.a.C0253a c0253a) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", c0253a.b());
        jSONObject.putOpt("url", c0253a.c());
        jSONObject.put("version", c0253a.d());
        jSONObject.putOpt("displayName", c0253a.a());
        return jSONObject;
    }
}
