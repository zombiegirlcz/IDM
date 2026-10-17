package j18;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.JsonElement;
import qlm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends p0 {
    public static final i d = new i();

    private i() {
        super(o0.f186429a.b(h.class));
    }

    @Override // qlm.p0
    public final mlm.b c(JsonElement jsonElement) {
        JsonElement jsonElement2 = (JsonElement) v7.s(jsonElement, "element", jsonElement, "type");
        String strA = jsonElement2 != null ? rlm.j.l(jsonElement2).a() : null;
        return Intrinsics.f(strA, "REV_INSIGHT") ? v.INSTANCE.serializer() : Intrinsics.f(strA, "PRICE_ALERT") ? p.INSTANCE.serializer() : k.INSTANCE.serializer();
    }
}
