package uq2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ulm.b1;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b implements e4m.e {
    public static ek.a a(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return p.a.g(b1.Companion, "application/json", json);
    }
}
