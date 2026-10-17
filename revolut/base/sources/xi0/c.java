package xi0;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f306288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f306289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f306290c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f306291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f306292h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f306293j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Instant f306294l;

    public c(int i, e type, String symbol, String displayName, String ticker, boolean z, Integer num, String str, String lightIconUrl, String darkIconUrl, boolean z3, Instant instant) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(lightIconUrl, "lightIconUrl");
        Intrinsics.checkNotNullParameter(darkIconUrl, "darkIconUrl");
        this.f306288a = i;
        this.f306289b = type;
        this.f306290c = symbol;
        this.d = displayName;
        this.e = ticker;
        this.f = z;
        this.f306291g = num;
        this.f306292h = str;
        this.i = lightIconUrl;
        this.f306293j = darkIconUrl;
        this.k = z3;
        this.f306294l = instant;
    }

    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f306288a == cVar.f306288a && this.f306289b == cVar.f306289b && Intrinsics.f(this.f306290c, cVar.f306290c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f && Intrinsics.f(this.f306291g, cVar.f306291g) && Intrinsics.f(this.f306292h, cVar.f306292h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f306293j, cVar.f306293j) && this.k == cVar.k && Intrinsics.f(this.f306294l, cVar.f306294l);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(p.a.c((this.f306289b.hashCode() + (Integer.hashCode(this.f306288a) * 31)) * 31, 31, this.f306290c), 31, this.d), 31, this.e), 31, this.f);
        Integer num = this.f306291g;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f306292h;
        int iC2 = j6.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.f306293j), 31, this.k);
        Instant instant = this.f306294l;
        return iC2 + (instant != null ? instant.hashCode() : 0);
    }

    public /* synthetic */ c(int i, e eVar, String str, String str2, String str3, Integer num, String str4, String str5) {
        this(i, eVar, str, str2, str3, true, num, null, str4, str5, false, null);
    }
}
