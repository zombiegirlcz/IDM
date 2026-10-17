package chc;

import chc.z;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.JsonElement;
import qlm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends p0 {
    public static final a0 d = new a0();

    private a0() {
        super(o0.f186429a.b(z.class));
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
        return Intrinsics.f(upperCase, "TOPIC") ? z.c.INSTANCE.serializer() : Intrinsics.f(upperCase, "DEEPLINK") ? z.b.INSTANCE.serializer() : z.d.INSTANCE.serializer();
    }
}
