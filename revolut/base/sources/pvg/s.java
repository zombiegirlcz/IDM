package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iwg.c f240216c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f240217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240218h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Float f240219j;
    public final LocalDate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f240220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ko3.b f240221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f240222n;
    public final String o;

    public s(iwg.a analyticsProductType, eel.c timeSpan, iwg.c method, boolean z, String portfolioId, String currency, String asset, jo3.b pnl2, float f, Float f4, LocalDate localDate, String str, ko3.b bVar, String str2, String str3) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f240214a = analyticsProductType;
        this.f240215b = timeSpan;
        this.f240216c = method;
        this.d = z;
        this.e = portfolioId;
        this.f = currency;
        this.f240217g = asset;
        this.f240218h = pnl2;
        this.i = f;
        this.f240219j = f4;
        this.k = localDate;
        this.f240220l = str;
        this.f240221m = bVar;
        this.f240222n = str2;
        this.o = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f240214a == sVar.f240214a && this.f240215b == sVar.f240215b && this.f240216c == sVar.f240216c && this.d == sVar.d && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f240217g, sVar.f240217g) && Intrinsics.f(this.f240218h, sVar.f240218h) && Float.compare(this.i, sVar.i) == 0 && Intrinsics.f(this.f240219j, sVar.f240219j) && Intrinsics.f(this.k, sVar.k) && Intrinsics.f(this.f240220l, sVar.f240220l) && Intrinsics.f(this.f240221m, sVar.f240221m) && Intrinsics.f(this.f240222n, sVar.f240222n) && Intrinsics.f(this.o, sVar.o);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.i, wp5.y.e(this.f240218h, p.a.c(p.a.c(p.a.c(j6.a.c(prk.o.d(this.f240216c, prk.o.c(this.f240215b, this.f240214a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.f240217g), 31), 31);
        Float f = this.f240219j;
        int iHashCode = (iB + (f == null ? 0 : f.hashCode())) * 31;
        LocalDate localDate = this.k;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.f240220l;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ko3.b bVar = this.f240221m;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f240222n;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
