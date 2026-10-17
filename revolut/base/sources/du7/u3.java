package du7;

import du7.k3;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class u3 extends qlm.p0 {
    public static final u3 d = new u3();

    private u3() {
        super(kotlin.jvm.internal.o0.f186429a.b(k3.class));
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
        if (upperCase != null) {
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 79058) {
                if (iHashCode != 2571565) {
                    if (iHashCode == 1411860198 && upperCase.equals("DEEPLINK")) {
                        return n3.Companion.serializer();
                    }
                } else if (upperCase.equals("TEXT")) {
                    return t3.Companion.serializer();
                }
            } else if (upperCase.equals("PDF")) {
                return q3.Companion.serializer();
            }
        }
        return k3.b.INSTANCE.serializer();
    }
}
