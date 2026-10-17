package k29;

import ip0.v7;
import k29.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.JsonElement;
import qlm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p0 {
    public static final b d = new b();

    private b() {
        super(o0.f186429a.b(a.class));
    }

    @Override // qlm.p0
    public final mlm.b c(JsonElement jsonElement) {
        JsonElement jsonElement2 = (JsonElement) v7.s(jsonElement, "element", jsonElement, "type");
        String strA = jsonElement2 != null ? rlm.j.l(jsonElement2).a() : null;
        return Intrinsics.f(strA, "IMAGE") ? a.b.INSTANCE.serializer() : Intrinsics.f(strA, "VIDEO") ? a.d.INSTANCE.serializer() : a.c.INSTANCE.serializer();
    }
}
