package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public abstract class tc {
    public static final sc a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return a(string);
    }

    public static final sc a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.toString().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new sc(bytes);
    }
}
