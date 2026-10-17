package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iwg.c f240141c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f240143h;
    public final Float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f240144j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ko3.b f240145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f240146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f240147n;

    public h(iwg.a analyticsProductType, eel.c timeSpan, iwg.c method, boolean z, String currency, String asset, jo3.b pnl2, float f, Float f4, LocalDate localDate, String str, ko3.b bVar, String str2, String str3) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f240139a = analyticsProductType;
        this.f240140b = timeSpan;
        this.f240141c = method;
        this.d = z;
        this.e = currency;
        this.f = asset;
        this.f240142g = pnl2;
        this.f240143h = f;
        this.i = f4;
        this.f240144j = localDate;
        this.k = str;
        this.f240145l = bVar;
        this.f240146m = str2;
        this.f240147n = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f240139a == hVar.f240139a && this.f240140b == hVar.f240140b && this.f240141c == hVar.f240141c && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f240142g, hVar.f240142g) && Float.compare(this.f240143h, hVar.f240143h) == 0 && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f240144j, hVar.f240144j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f240145l, hVar.f240145l) && Intrinsics.f(this.f240146m, hVar.f240146m) && Intrinsics.f(this.f240147n, hVar.f240147n);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f240143h, wp5.y.e(this.f240142g, p.a.c(p.a.c(j6.a.c(prk.o.d(this.f240141c, prk.o.c(this.f240140b, this.f240139a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31);
        Float f = this.i;
        int iHashCode = (iB + (f == null ? 0 : f.hashCode())) * 31;
        LocalDate localDate = this.f240144j;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.k;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ko3.b bVar = this.f240145l;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f240146m;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f240147n;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
