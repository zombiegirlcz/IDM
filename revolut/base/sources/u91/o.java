package u91;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o {
    private o() {
    }

    public static p a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        String upperCase = id10.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        p pVar = p.MANUAL;
        if (!Intrinsics.f(upperCase, pVar.getId())) {
            p pVar2 = p.AUTOMATIC;
            if (Intrinsics.f(upperCase, pVar2.getId())) {
                return pVar2;
            }
            p pVar3 = p.INTERACTIVE;
            if (Intrinsics.f(upperCase, pVar3.getId())) {
                return pVar3;
            }
            p pVar4 = p.ONLINE;
            if (Intrinsics.f(upperCase, pVar4.getId())) {
                return pVar4;
            }
        }
        return pVar;
    }
}
