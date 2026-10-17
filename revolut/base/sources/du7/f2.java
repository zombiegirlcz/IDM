package du7;

import du7.d2;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 extends qlm.p0 {
    public static final f2 d = new f2();

    private f2() {
        super(kotlin.jvm.internal.o0.f186429a.b(d2.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
            switch (upperCase.hashCode()) {
                case -323033581:
                    if (upperCase.equals("MAKE_CFAC_CLAIM")) {
                        return d2.c.INSTANCE.serializer();
                    }
                    break;
                case 486811132:
                    if (upperCase.equals("UPGRADE")) {
                        return d2.f.INSTANCE.serializer();
                    }
                    break;
                case 1411860198:
                    if (upperCase.equals("DEEPLINK")) {
                        return d2.b.INSTANCE.serializer();
                    }
                    break;
                case 1986881163:
                    if (upperCase.equals("MAKE_CLAIM")) {
                        return d2.d.INSTANCE.serializer();
                    }
                    break;
            }
        }
        return d2.e.INSTANCE.serializer();
    }
}
