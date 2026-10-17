package f1m;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f131312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131313c;

    public i(h1m.a eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        HashMap map = eventData.f148610a;
        Object obj2 = map.get("data");
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        this.f131312b = (Map) obj2;
        Object obj3 = map.get("schema");
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f131313c = (String) obj3;
    }

    @Override // f1m.a
    public final Map a() {
        return this.f131312b;
    }

    @Override // f1m.a
    public final String b() {
        return this.f131313c;
    }

    public i(String schema, aim.f payload) {
        Intrinsics.checkNotNullParameter(schema, "schema");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f131313c = schema;
        this.f131312b = payload;
        new h1m.a(schema, payload);
    }
}
