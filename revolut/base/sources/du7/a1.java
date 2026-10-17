package du7;

import du7.z0;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends qlm.p0 {
    public static final a1 d = new a1();

    private a1() {
        super(kotlin.jvm.internal.o0.f186429a.b(z0.class));
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
        if (upperCase != null) {
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 185613424) {
                if (iHashCode != 1411860198) {
                    if (iHashCode == 1534708267 && upperCase.equals("BOTTOM_SHEET")) {
                        return z0.a.INSTANCE.serializer();
                    }
                } else if (upperCase.equals("DEEPLINK")) {
                    return z0.c.INSTANCE.serializer();
                }
            } else if (upperCase.equals("DYNAMIC_CONTACT_URL")) {
                return z0.d.INSTANCE.serializer();
            }
        }
        return z0.e.INSTANCE.serializer();
    }
}
