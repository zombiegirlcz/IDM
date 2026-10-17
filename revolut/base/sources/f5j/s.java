package f5j;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {
    private s() {
    }

    public static t a(String str) {
        if (str == null) {
            return null;
        }
        for (t tVar : t.values()) {
            Locale ROOT = Locale.ROOT;
            String strR = p.a.r(ROOT, "ROOT", str, ROOT, "toLowerCase(...)");
            String strName = tVar.name();
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = strName.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.f(strR, lowerCase)) {
                return tVar;
            }
        }
        return null;
    }
}
