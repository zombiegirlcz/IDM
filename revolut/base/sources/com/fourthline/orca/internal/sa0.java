package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cw0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public abstract class sa0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final cw0.a.C0180a b(String str) throws JSONException {
        JSONArray jSONArray;
        ArrayList arrayList;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("mobilePhoneNumber");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        JSONArray jSONArray2 = jSONObject.getJSONArray("documentsToSign");
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
        IntRange intRangeO = kotlin.ranges.f.o(0, jSONArray2.length());
        ArrayList arrayList2 = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(it8.nextInt());
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            arrayList2.add(d(jSONObject2));
        }
        JSONArray jSONArray3 = jSONObject.getJSONArray("legalDocuments");
        Intrinsics.checkNotNullExpressionValue(jSONArray3, "getJSONArray(...)");
        IntRange intRangeO2 = kotlin.ranges.f.o(0, jSONArray3.length());
        ArrayList arrayList3 = new ArrayList(zhm.w.t(intRangeO2, 10));
        vim.f it9 = intRangeO2.iterator();
        while (it9.f289625c) {
            JSONObject jSONObject3 = jSONArray3.getJSONObject(it9.nextInt());
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "getJSONObject(...)");
            arrayList3.add(b(jSONObject3));
        }
        cw0.a.C0180a.c cVarC = null;
        try {
            jSONArray = jSONObject.getJSONArray("clauses");
        } catch (JSONException unused) {
            jSONArray = null;
        }
        if (jSONArray != null) {
            IntRange intRangeO3 = kotlin.ranges.f.o(0, jSONArray.length());
            ArrayList arrayList4 = new ArrayList(zhm.w.t(intRangeO3, 10));
            vim.f it10 = intRangeO3.iterator();
            while (it10.f289625c) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(it10.nextInt());
                Intrinsics.checkNotNullExpressionValue(jSONObject4, "getJSONObject(...)");
                arrayList4.add(a(jSONObject4));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        try {
            JSONObject jSONObject5 = jSONObject.getJSONObject("otpSettings");
            Intrinsics.checkNotNullExpressionValue(jSONObject5, "getJSONObject(...)");
            cVarC = c(jSONObject5);
        } catch (JSONException unused2) {
        }
        return new cw0.a.C0180a(string, arrayList2, arrayList3, arrayList, cVarC);
    }

    private static final cw0.a.C0180a.c c(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("validation");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new cw0.a.C0180a.c(string, jSONObject.getInt("length"));
    }

    private static final cw0.a.C0180a.d d(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("fileName");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObject.getString("displayName");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new cw0.a.C0180a.d(string, string2, string3);
    }

    private static final cw0.a.C0180a.C0181a a(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("text");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new cw0.a.C0180a.C0181a(string, string2, jSONObject.getInt("version"));
    }

    private static final cw0.a.C0180a.b b(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("displayName");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i = jSONObject.getInt("version");
        String string3 = jSONObject.getString("url");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new cw0.a.C0180a.b(string, string2, i, string3);
    }
}
