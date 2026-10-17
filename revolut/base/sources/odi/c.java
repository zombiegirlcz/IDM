package odi;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.JsonElement;
import odi.b;
import qlm.p0;
import rlm.j;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends p0 {
    public static final c d = new c();

    private c() {
        super(o0.f186429a.b(b.class));
    }

    @Override // qlm.p0
    public final mlm.b c(JsonElement jsonElement) {
        JsonElement jsonElement2 = (JsonElement) v7.s(jsonElement, "element", jsonElement, "state");
        String strA = jsonElement2 != null ? j.l(jsonElement2).a() : null;
        if (Intrinsics.f(strA, "OPEN")) {
            return b.C1248b.INSTANCE.serializer();
        }
        if (Intrinsics.f(strA, "ABSENT")) {
            return b.a.INSTANCE.serializer();
        }
        throw new IllegalArgumentException("Unknown key: 'state' not found or does not matches any pocket type");
    }
}
