package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import nkm.t;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zhm.l0;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class AFj1sSDK {
    private static final List<Object> AFInAppEventParameterName(JSONArray jSONArray) throws JSONException {
        IntRange intRangeO = kotlin.ranges.f.o(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        Iterator<Integer> it8 = intRangeO.iterator();
        while (it8.hasNext()) {
            Object obj2 = jSONArray.get(((l0) it8).nextInt());
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            arrayList.add(AFInAppEventParameterName(obj2));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> valueOf(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        nkm.a aVarC = t.c(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : aVarC) {
            Object obj3 = jSONObject.get((String) obj2);
            Intrinsics.checkNotNullExpressionValue(obj3, "");
            linkedHashMap.put(obj2, AFInAppEventParameterName(obj3));
        }
        return linkedHashMap;
    }

    private static final Object AFInAppEventParameterName(Object obj2) {
        if (obj2 instanceof JSONArray) {
            return AFInAppEventParameterName((JSONArray) obj2);
        }
        if (obj2 instanceof JSONObject) {
            return valueOf((JSONObject) obj2);
        }
        if (Intrinsics.f(obj2, JSONObject.NULL)) {
            return null;
        }
        return obj2;
    }
}
