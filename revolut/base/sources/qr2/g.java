package qr2;

import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.JsonElement;
import qlm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends p0 {
    public static final g d = new g();

    private g() {
        super(o0.f186429a.b(f.class));
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
        return Intrinsics.f(upperCase, "ORDERED_ITEM") ? d.INSTANCE.serializer() : e.INSTANCE.serializer();
    }
}
