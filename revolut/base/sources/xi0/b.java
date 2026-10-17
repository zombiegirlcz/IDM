package xi0;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public static final b J;
    public static final b K;
    public static final b L;
    public static final b M;
    public static final b N;
    public static final b O;
    public static final b P;
    public static final b Q;
    public static final b R;
    public static final b S;
    public static final b T;
    public static final b U;
    public static final b V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f306287b;

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f306271c = a.a("UNKNOWN");
    public static final b d = a.a("CAD");
    public static final b e = a.a("CHF");
    public static final b f = a.a("CZK");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f306272g = a.a("EUR");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f306273h = a.a("GBP");
    public static final b i = a.a("USD");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f306274j = a.a("JPY");
    public static final b k = a.a("PLN");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f306275l = a.a("SGD");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f306276m = a.a("AUD");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f306277n = a.a("RON");
    public static final b o = a.a("HUF");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f306278p = a.a("BGN");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f306279q = a.a("HRK");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f306280r = a.a("SEK");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f306281s = a.a("NOK");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f306282t = a.a("DKK");
    public static final b u = a.a("ZAR");
    public static final b v = a.a("AED");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f306283w = a.a("ILS");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f306284x = a.a("HKD");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f306285y = a.a("NZD");
    public static final b z = a.a("MXN");
    public static final b A = a.a("TRY");
    public static final b B = a.a("THB");

    static {
        a.a("RUB");
        a.a("MAD");
        a.a("QAR");
        C = a.a("ISK");
        a.a("RSD");
        D = a.a("BRL");
        E = a.a("INR");
        a.a("CLP");
        F = a.a("COP");
        a.a("KRW");
        a.a("LKR");
        a.a("IDR");
        a.a("KES");
        G = a.a("XRP");
        H = a.a("BTC");
        I = a.a("LTC");
        J = a.a("ETH");
        K = a.a("BCH");
        a.a("XLM");
        a.a("EOS");
        a.a("ETC");
        a.a("OMG");
        a.a("ZRX");
        a.a("BAT");
        a.a("GNT");
        a.a("MANA");
        a.a("ATOM");
        a.a("XTZ");
        a.a("ADA");
        a.a("BNT");
        a.a("CVC");
        a.a("DNT");
        a.a("NMR");
        a.a("UNI");
        a.a("DOGE");
        a.a("AAVE");
        a.a("COMP");
        a.a("CRV");
        L = a.a("MATIC");
        a.a("SUSHI");
        a.a("1INCH");
        a.a("ALGO");
        a.a("BAND");
        a.a("ENJ");
        a.a("KAVA");
        a.a("DOT");
        a.a("FLOW");
        a.a("QTUM");
        a.a("WAVES");
        a.a("ICP");
        M = a.a("SOL");
        a.a("REN");
        a.a("AUDIO");
        a.a("AMP");
        a.a("CHZ");
        a.a("GTC");
        N = a.a("BNB");
        O = a.a("USDC");
        P = a.a("USDT");
        a.a("AVAX");
        Q = a.a("X:8:POL");
        R = a.a("X:6:EURR");
        S = a.a("XAU");
        T = a.a("XAG");
        U = a.a("XPT");
        V = a.a("XPD");
    }

    public /* synthetic */ b(int i2, String str, Integer num) {
        this(str, (i2 & 2) != 0 ? null : num);
    }

    public static b a(b bVar, Integer num) {
        String code = bVar.f306286a;
        bVar.getClass();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        return new b(code, num);
    }

    public final int b() {
        Integer numO = cp5.d.o(this);
        return numO != null ? numO.intValue() : c();
    }

    public final int c() {
        Integer num = this.f306287b;
        return num != null ? num.intValue() : cp5.d.p(this);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f306286a, bVar.f306286a) && Intrinsics.f(this.f306287b, bVar.f306287b);
    }

    public final String getCode() {
        return this.f306286a;
    }

    public final int hashCode() {
        int iHashCode = this.f306286a.hashCode() * 31;
        Integer num = this.f306287b;
        return (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
    }

    public b(String code, Integer num) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f306286a = code;
        this.f306287b = num;
    }
}
