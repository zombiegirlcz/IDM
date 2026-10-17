package du7;

import du7.t2;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class a3 extends qlm.p0 {
    public static final a3 d = new a3();

    private a3() {
        super(kotlin.jvm.internal.o0.f186429a.b(t2.class));
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
        return Intrinsics.f(upperCase, "DEEPLINK") ? w2.Companion.serializer() : Intrinsics.f(upperCase, "DETAILS") ? z2.Companion.serializer() : t2.b.INSTANCE.serializer();
    }
}
