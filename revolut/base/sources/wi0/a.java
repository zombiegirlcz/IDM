package wi0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private a() {
    }

    public static b a(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Locale locale = Locale.ROOT;
        return new b(v0.a.j(locale, "ROOT", countryCode, locale, "toUpperCase(...)"));
    }
}
