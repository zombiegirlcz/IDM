package com.fourthline.orca.internal;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public abstract class s40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Json f32901a = ue0.e.b(Json.d, new nq1(8));

    public static final Json a() {
        return f32901a;
    }

    public static final JsonElement a(JsonObject jsonObject, String key) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        JsonElement jsonElement = (JsonElement) jsonObject.get(key);
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalStateException(("FL Developer Error. Missing key '" + key + "' during serialization of json object.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(rlm.f Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f255101c = true;
        Json.f255102g = true;
        return Unit.f186387a;
    }
}
