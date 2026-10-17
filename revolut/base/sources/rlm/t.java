package rlm;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes14.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f255121a = new LinkedHashMap();

    public final JsonObject a() {
        return new JsonObject(this.f255121a);
    }

    public final JsonElement b(JsonElement element, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return (JsonElement) this.f255121a.put(key, element);
    }
}
