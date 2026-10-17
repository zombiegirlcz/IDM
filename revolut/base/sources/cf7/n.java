package cf7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ulm.b1;

/* JADX INFO: loaded from: classes22.dex */
public abstract class n implements e4m.e {
    public static ek.a a(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return p.a.g(b1.Companion, "application/json", json);
    }
}
