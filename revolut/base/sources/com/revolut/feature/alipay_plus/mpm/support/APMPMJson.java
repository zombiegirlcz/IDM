package com.revolut.feature.alipay_plus.mpm.support;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0006\u0010\n\u001a\u00020\u0005J%\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\r\"\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMJson;", "", "<init>", "()V", "parseObject", "Lorg/json/JSONObject;", "value", "", "toMap", "", "jsonObject", "firstNonBlank", "values", "", "([Ljava/lang/String;)Ljava/lang/String;", "unwrap", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMJson {

    @NotNull
    public static final APMPMJson INSTANCE = new APMPMJson();

    private APMPMJson() {
    }

    private final Object unwrap(Object value) {
        if (Intrinsics.f(value, JSONObject.NULL)) {
            return null;
        }
        if (value instanceof JSONObject) {
            return toMap((JSONObject) value);
        }
        if (!(value instanceof JSONArray)) {
            return value;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = (JSONArray) value;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(unwrap(jSONArray.opt(i)));
        }
        return arrayList;
    }

    public final String firstNonBlank(@NotNull String... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        int length = values.length;
        for (int i = 0; i < length; i++) {
            String str = values[i];
            if (!(str == null || d0.W(str))) {
                return str;
            }
        }
        return null;
    }

    public final JSONObject parseObject(String value) {
        Object objA;
        if (value == null || d0.W(value)) {
            return null;
        }
        try {
            m.Companion companion = m.INSTANCE;
            objA = new JSONObject(value);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        return (JSONObject) (objA instanceof n ? null : objA);
    }

    @NotNull
    public final Map<String, Object> toMap(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, unwrap(jsonObject.opt(next)));
        }
        return linkedHashMap;
    }
}
