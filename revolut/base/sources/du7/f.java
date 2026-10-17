package du7;

import du7.e;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends qlm.p0 {
    public static final f d = new f();

    private f() {
        super(kotlin.jvm.internal.o0.f186429a.b(e.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
            switch (upperCase.hashCode()) {
                case -1905312150:
                    if (upperCase.equals("DISMISS")) {
                        return e.c.INSTANCE.serializer();
                    }
                    break;
                case 69366:
                    if (upperCase.equals("FAQ")) {
                        return e.C0701e.INSTANCE.serializer();
                    }
                    break;
                case 185613424:
                    if (upperCase.equals("DYNAMIC_CONTACT_URL")) {
                        return e.d.INSTANCE.serializer();
                    }
                    break;
                case 486811132:
                    if (upperCase.equals("UPGRADE")) {
                        return e.g.INSTANCE.serializer();
                    }
                    break;
                case 1411860198:
                    if (upperCase.equals("DEEPLINK")) {
                        return e.b.INSTANCE.serializer();
                    }
                    break;
            }
        }
        return e.f.INSTANCE.serializer();
    }
}
