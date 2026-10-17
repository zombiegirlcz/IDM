package chc;

import chc.l;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.JsonElement;
import qlm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends p0 {
    public static final d d = new d();

    private d() {
        super(o0.f186429a.b(l.class));
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
        return Intrinsics.f(upperCase, "DIRECT_DEBIT") ? l.b.INSTANCE.serializer() : l.c.INSTANCE.serializer();
    }
}
