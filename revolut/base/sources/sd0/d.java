package sd0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f261785c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f261786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f261787h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f261788j;
    public final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f261789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f261790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f261791n;

    public d(String code, String genericLocalizedName, int i, String type, String symbol, String ticker, String lightIconUrl, String darkIconUrl, Integer num, String str, Map map, Map map2, Boolean bool, Long l2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(genericLocalizedName, "genericLocalizedName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(lightIconUrl, "lightIconUrl");
        Intrinsics.checkNotNullParameter(darkIconUrl, "darkIconUrl");
        this.f261783a = code;
        this.f261784b = genericLocalizedName;
        this.f261785c = i;
        this.d = type;
        this.e = symbol;
        this.f = ticker;
        this.f261786g = lightIconUrl;
        this.f261787h = darkIconUrl;
        this.i = num;
        this.f261788j = str;
        this.k = map;
        this.f261789l = map2;
        this.f261790m = bool;
        this.f261791n = l2;
    }

    public final String a() {
        return this.f261783a;
    }

    public final String b() {
        return this.f261787h;
    }

    public final int c() {
        return this.f261785c;
    }

    public final Integer d() {
        return this.i;
    }

    public final String e() {
        return this.f261788j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f261783a, dVar.f261783a) && Intrinsics.f(this.f261784b, dVar.f261784b) && this.f261785c == dVar.f261785c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f261786g, dVar.f261786g) && Intrinsics.f(this.f261787h, dVar.f261787h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f261788j, dVar.f261788j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f261789l, dVar.f261789l) && Intrinsics.f(this.f261790m, dVar.f261790m) && Intrinsics.f(this.f261791n, dVar.f261791n);
    }

    public final String f() {
        return this.f261784b;
    }

    public final String g() {
        return this.f261786g;
    }

    public final Long h() {
        return this.f261791n;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(j6.a.b(this.f261785c, p.a.c(this.f261783a.hashCode() * 31, 31, this.f261784b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.f261786g), 31, this.f261787h);
        Integer num = this.i;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f261788j;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.k;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f261789l;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool = this.f261790m;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.f261791n;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public final Map i() {
        return this.k;
    }

    public final Map j() {
        return this.f261789l;
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return this.d;
    }

    public final Boolean n() {
        return this.f261790m;
    }
}
