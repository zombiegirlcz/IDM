package ln5;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final boolean a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.ROOT;
        return (str.equals(p.a.r(locale, "ROOT", str, locale, "toLowerCase(...)")) || str.equals(v0.a.j(locale, "ROOT", str, locale, "toUpperCase(...)"))) ? false : true;
    }
}
