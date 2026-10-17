package k9c;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements k {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f182318b = r0.k(new Pair("AT", u.c("de")), new Pair("BE", u.c("fr")), new Pair("BG", u.c("bg")), new Pair("HR", u.c("hr")), new Pair("CY", u.c("el")), new Pair("CZ", u.c("cs")), new Pair("DK", u.c("da")), new Pair("FR", u.c("fr")), new Pair("DE", u.c("de")), new Pair("GR", u.c("el")), new Pair("HU", u.c("hu")), new Pair("IE", u.c("en")), new Pair("IT", u.c("it")), new Pair("LV", u.c("lv")), new Pair("LT", u.c("lt")), new Pair("LU", v.k("fr", "de")), new Pair("MT", u.c("en")), new Pair("NL", u.c("nl")), new Pair("NO", u.c("en")), new Pair("PL", u.c("pl")), new Pair("PT", u.c("pt")), new Pair("RO", u.c("ro")), new Pair("SK", u.c("sk")), new Pair("ES", u.c("es")), new Pair("SE", u.c("sv")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f182319a;

    public m(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f182319a = languageProvider;
    }
}
