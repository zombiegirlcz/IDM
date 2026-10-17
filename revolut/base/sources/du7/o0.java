package du7;

import du7.n0;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends qlm.p0 {
    public static final o0 d = new o0();

    private o0() {
        super(kotlin.jvm.internal.o0.f186429a.b(n0.class));
    }

    @Override // qlm.p0
    public final mlm.b c(JsonElement jsonElement) {
        String upperCase;
        String strA;
        JsonElement jsonElement2 = (JsonElement) v7.s(jsonElement, "element", jsonElement, "type");
        if (jsonElement2 == null || (strA = rlm.j.l(jsonElement2).a()) == null) {
            upperCase = null;
        } else {
            upperCase = strA.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        }
        return Intrinsics.f(upperCase, "COPY") ? n0.b.INSTANCE.serializer() : Intrinsics.f(upperCase, "DETAILS") ? n0.c.INSTANCE.serializer() : n0.d.INSTANCE.serializer();
    }
}
