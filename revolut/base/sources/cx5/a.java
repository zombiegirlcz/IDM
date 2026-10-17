package cx5;

import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C0650a Companion = new C0650a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f109894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f109895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f109896c;
    public static final List d;
    public static final Object e;

    /* JADX INFO: renamed from: cx5.a$a, reason: collision with other inner class name */
    public static final class C0650a {
        private C0650a() {
        }
    }

    static {
        List listK = v.k(10L, 100L, 500L, 1000L);
        f109894a = listK;
        List listK2 = v.k(100L, 1000L, 5000L, 10000L);
        f109895b = listK2;
        List listK3 = v.k(100L, 500L, 1000L, 5000L);
        f109896c = listK3;
        List listK4 = v.k(5000L, 10000L, 50000L, 100000L);
        d = listK4;
        e = r0.k(new Pair("AUD", listK), new Pair("BGN", listK), new Pair("CHF", listK), new Pair("EUR", listK), new Pair("GBP", listK), new Pair("AED", listK), new Pair("NZD", listK), new Pair("SGD", listK), new Pair("USD", listK), new Pair("CZK", listK2), new Pair("DKK", listK2), new Pair("HKD", listK2), new Pair("ILS", listK2), new Pair("MAD", listK2), new Pair("MXN", listK2), new Pair("NOK", listK2), new Pair("SEK", listK2), new Pair("THB", listK2), new Pair("TRY", listK2), new Pair("ZAR", listK2), new Pair("HUF", listK4), new Pair("JPY", listK4), new Pair("PLN", listK3), new Pair("RON", listK3), new Pair("QAR", listK3), new Pair("SAR", listK3));
    }
}
