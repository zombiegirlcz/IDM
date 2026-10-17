package du7;

import du7.m1;
import ip0.v7;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 extends qlm.p0 {
    public static final n1 d = new n1();

    private n1() {
        super(kotlin.jvm.internal.o0.f186429a.b(m1.class));
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
                case -1453731207:
                    if (upperCase.equals("HIDDEN_PHONE")) {
                        return m1.g.INSTANCE.serializer();
                    }
                    break;
                case -993968055:
                    if (upperCase.equals("CLAIMS_VIA_CARD")) {
                        return m1.b.INSTANCE.serializer();
                    }
                    break;
                case 69366:
                    if (upperCase.equals("FAQ")) {
                        return m1.f.INSTANCE.serializer();
                    }
                    break;
                case 66081660:
                    if (upperCase.equals("EMAIL")) {
                        return m1.e.INSTANCE.serializer();
                    }
                    break;
                case 76105038:
                    if (upperCase.equals("PHONE")) {
                        return m1.h.INSTANCE.serializer();
                    }
                    break;
                case 1411860198:
                    if (upperCase.equals("DEEPLINK")) {
                        return m1.d.INSTANCE.serializer();
                    }
                    break;
                case 1939874766:
                    if (upperCase.equals("ASK_AI")) {
                        return m1.a.INSTANCE.serializer();
                    }
                    break;
            }
        }
        return m1.i.INSTANCE.serializer();
    }
}
