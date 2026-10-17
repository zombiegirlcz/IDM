package qd0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ui0.g;
import ui0.h;
import ui0.i;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final i a(int i) {
        Locale locale = Locale.getDefault();
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        String upperCase = country.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (!Intrinsics.f(upperCase, "US") && !Intrinsics.f(upperCase, "GB")) {
            return new h(i / 1000, i % 1000);
        }
        double d = i;
        return new g((int) (d / 1609.34d), (int) ((d % 1609.34d) * 3.28084d));
    }
}
