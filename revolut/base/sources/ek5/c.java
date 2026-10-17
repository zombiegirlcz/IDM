package ek5;

import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ulm.b1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements e {
    public static ek.a a(Json json) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(json, "json");
        return p.a.g(b1.Companion, "application/json", json);
    }
}
