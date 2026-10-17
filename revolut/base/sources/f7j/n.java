package f7j;

import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f132639a = v.k(10, 25, 50, 100);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f132640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f132641c;
    public static final List d;
    public static final List e;
    public static final Object f;

    static {
        List listK = v.k(10L, 100L, 500L, 1000L);
        f132640b = listK;
        List listK2 = v.k(100L, 1000L, 5000L, 10000L);
        f132641c = listK2;
        List listK3 = v.k(100L, 500L, 1000L, 5000L);
        d = listK3;
        List listK4 = v.k(5000L, 10000L, 50000L, 100000L);
        e = listK4;
        f = r0.k(new Pair("AUD", listK), new Pair("BGN", listK), new Pair("CHF", listK), new Pair("EUR", listK), new Pair("GBP", listK), new Pair("AED", listK), new Pair("NZD", listK), new Pair("SGD", listK), new Pair("USD", listK), new Pair("CZK", listK2), new Pair("DKK", listK2), new Pair("HKD", listK2), new Pair("ILS", listK2), new Pair("MAD", listK2), new Pair("MXN", listK2), new Pair("NOK", listK2), new Pair("SEK", listK2), new Pair("THB", listK2), new Pair("TRY", listK2), new Pair("ZAR", listK2), new Pair("HUF", listK4), new Pair("JPY", listK4), new Pair("PLN", listK3), new Pair("RON", listK3), new Pair("QAR", listK3), new Pair("SAR", listK3));
    }
}
