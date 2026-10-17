package com.onfido.android.sdk.capture.utils;

import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import nkm.k;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0005H\u0007¨\u0006\u0007"}, d2 = {"camelToSnake", "", "str", "snakeToCamel", "convertCamelToSnakeCase", "Lkotlinx/serialization/json/JsonElement;", "convertSnakeToCamelCase", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class JsonExtKt {
    private static final String camelToSnake(String str) {
        String lowerCase = new Regex("([a-z])([A-Z])").replace(str, "$1_$2").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InternalOnfidoApi
    public static final JsonElement convertCamelToSnakeCase(JsonElement jsonElement) {
        if (jsonElement == 0) {
            return null;
        }
        if (!(jsonElement instanceof JsonObject)) {
            if (!(jsonElement instanceof kotlinx.serialization.json.a)) {
                return jsonElement;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it8 = ((Iterable) jsonElement).iterator();
            while (it8.hasNext()) {
                JsonElement jsonElementConvertCamelToSnakeCase = convertCamelToSnakeCase((JsonElement) it8.next());
                if (jsonElementConvertCamelToSnakeCase != null) {
                    arrayList.add(jsonElementConvertCamelToSnakeCase);
                }
            }
            return new kotlinx.serialization.json.a(arrayList);
        }
        Map map = (Map) jsonElement;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            JsonElement jsonElement2 = (JsonElement) entry.getValue();
            String strCamelToSnake = camelToSnake(str);
            JsonElement jsonElementConvertCamelToSnakeCase2 = convertCamelToSnakeCase(jsonElement2);
            Intrinsics.i(jsonElementConvertCamelToSnakeCase2, "null cannot be cast to non-null type kotlinx.serialization.json.JsonElement");
            arrayList2.add(new Pair(strCamelToSnake, jsonElementConvertCamelToSnakeCase2));
        }
        return new JsonObject(r0.t(arrayList2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InternalOnfidoApi
    public static final JsonElement convertSnakeToCamelCase(JsonElement jsonElement) {
        if (jsonElement == 0) {
            return null;
        }
        if (!(jsonElement instanceof JsonObject)) {
            if (!(jsonElement instanceof kotlinx.serialization.json.a)) {
                return jsonElement;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it8 = ((Iterable) jsonElement).iterator();
            while (it8.hasNext()) {
                JsonElement jsonElementConvertSnakeToCamelCase = convertSnakeToCamelCase((JsonElement) it8.next());
                if (jsonElementConvertSnakeToCamelCase != null) {
                    arrayList.add(jsonElementConvertSnakeToCamelCase);
                }
            }
            return new kotlinx.serialization.json.a(arrayList);
        }
        Map map = (Map) jsonElement;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            JsonElement jsonElement2 = (JsonElement) entry.getValue();
            String strSnakeToCamel = snakeToCamel(str);
            JsonElement jsonElementConvertSnakeToCamelCase2 = convertSnakeToCamelCase(jsonElement2);
            Intrinsics.i(jsonElementConvertSnakeToCamelCase2, "null cannot be cast to non-null type kotlinx.serialization.json.JsonElement");
            arrayList2.add(new Pair(strSnakeToCamel, jsonElementConvertSnakeToCamelCase2));
        }
        return new JsonObject(r0.t(arrayList2));
    }

    private static final String snakeToCamel(String str) {
        k kVar = new k(Regex.c(new Regex("_([a-z])"), str));
        while (kVar.hasNext()) {
            String value = ((MatchResult) kVar.next()).getValue();
            String strValueOf = String.valueOf(value.charAt(1));
            Intrinsics.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            str = a0.F(str, value, upperCase, false);
        }
        return str;
    }
}
