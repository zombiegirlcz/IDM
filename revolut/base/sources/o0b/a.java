package o0b;

import c1b.l;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f221186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f221187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f221188c;
    public final String d;
    public final String e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0b.d f221189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f221190h;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public a(long j2, long j3, int i, String symbol, String interval, l chartType, w0b.d tradingHours) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(tradingHours, "tradingHours");
        this.f221186a = j2;
        this.f221187b = j3;
        this.f221188c = i;
        this.d = symbol;
        this.e = interval;
        this.f = chartType;
        this.f221189g = tradingHours;
        int length = symbol.length();
        int length2 = interval.length();
        String strName = chartType.name();
        String strG = u1.g(tradingHours, w0b.e.f293681a);
        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "from=", ";to=");
        sbV.append(j3);
        sbV.append(";countBack=");
        sbV.append(i);
        sbV.append(";symbol=");
        sbV.append(length);
        sbV.append("#");
        sbV.append(symbol);
        sbV.append(";interval=");
        sbV.append(length2);
        sbV.append("#");
        sbV.append(interval);
        this.f221190h = j6.a.w(sbV, ";chartType=", strName, ";tradingHours=", strG);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f221186a == aVar.f221186a && this.f221187b == aVar.f221187b && this.f221188c == aVar.f221188c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && this.f221189g == aVar.f221189g;
    }

    public final int hashCode() {
        return this.f221189g.hashCode() + ((this.f.hashCode() + p.a.c(p.a.c(j6.a.b(this.f221188c, a0.d.c(Long.hashCode(this.f221186a) * 31, 31, this.f221187b), 31), 31, this.d), 31, this.e)) * 31);
    }
}
