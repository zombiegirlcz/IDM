package du7;

import du7.f4;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class g4 extends qlm.p0 {
    public static final g4 d = new g4();

    private g4() {
        super(kotlin.jvm.internal.o0.f186429a.b(f4.class));
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
        return Intrinsics.f(upperCase, "UPGRADE") ? f4.d.INSTANCE.serializer() : Intrinsics.f(upperCase, "DEEPLINK") ? f4.b.INSTANCE.serializer() : f4.c.INSTANCE.serializer();
    }
}
