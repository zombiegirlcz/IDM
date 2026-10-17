package du7;

import du7.i0;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends qlm.p0 {
    public static final j0 d = new j0();

    private j0() {
        super(kotlin.jvm.internal.o0.f186429a.b(i0.class));
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
        return Intrinsics.f(upperCase, "CLAIMS_CFAC") ? i0.a.INSTANCE.serializer() : Intrinsics.f(upperCase, "CLAIMS_EMBEDDED") ? i0.b.INSTANCE.serializer() : i0.d.INSTANCE.serializer();
    }
}
