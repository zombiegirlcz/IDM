package o8b;

import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import yhm.j;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n8b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f222989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f222990b;

    public g(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f222989a = languageProvider;
        this.f222990b = j.b(new o23.b(25));
    }

    public final String a(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Locale localeB = ((s80.b) this.f222989a).b();
        String displayCountry = new Locale(localeB.getLanguage(), countryCode).getDisplayCountry(localeB);
        Intrinsics.h(displayCountry);
        if (d0.W(displayCountry)) {
            displayCountry = null;
        }
        return displayCountry == null ? countryCode : displayCountry;
    }
}
