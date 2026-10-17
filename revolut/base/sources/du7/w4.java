package du7;

import du7.v4;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class w4 extends qlm.p0 {
    public static final w4 d = new w4();

    private w4() {
        super(kotlin.jvm.internal.o0.f186429a.b(v4.class));
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
            if (iHashCode != 69366) {
                if (iHashCode != 486811132) {
                    if (iHashCode == 1411860198 && upperCase.equals("DEEPLINK")) {
                        return v4.b.INSTANCE.serializer();
                    }
                } else if (upperCase.equals("UPGRADE")) {
                    return v4.e.INSTANCE.serializer();
                }
            } else if (upperCase.equals("FAQ")) {
                return v4.c.INSTANCE.serializer();
            }
        }
        return v4.d.INSTANCE.serializer();
    }
}
