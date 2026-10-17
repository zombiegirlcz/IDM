package du7;

import du7.w0;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends qlm.p0 {
    public static final x0 d = new x0();

    private x0() {
        super(kotlin.jvm.internal.o0.f186429a.b(w0.class));
    }

    @Override // qlm.p0
    public final mlm.b c(JsonElement jsonElement) {
        JsonElement jsonElement2 = (JsonElement) v7.s(jsonElement, "element", jsonElement, "type");
        String upperCase = null;
        String strA = jsonElement2 != null ? rlm.j.l(jsonElement2).a() : null;
        if (strA != null) {
            upperCase = strA.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        }
        return Intrinsics.f(upperCase, "STATIC") ? w0.c.INSTANCE.serializer() : Intrinsics.f(upperCase, "DYNAMIC") ? w0.b.INSTANCE.serializer() : w0.d.INSTANCE.serializer();
    }
}
