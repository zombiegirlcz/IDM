package pcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f235004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f235005c;
    public final s d;
    public final t e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f235006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f235007h;
    public final r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f235008j;

    public y(String ref2, u price, x volume, s marketCap, t perShare, p dividend, w valuation, v profitability, r managementEffectiveness, q qVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(volume, "volume");
        Intrinsics.checkNotNullParameter(marketCap, "marketCap");
        Intrinsics.checkNotNullParameter(perShare, "perShare");
        Intrinsics.checkNotNullParameter(dividend, "dividend");
        Intrinsics.checkNotNullParameter(valuation, "valuation");
        Intrinsics.checkNotNullParameter(profitability, "profitability");
        Intrinsics.checkNotNullParameter(managementEffectiveness, "managementEffectiveness");
        this.f235003a = ref2;
        this.f235004b = price;
        this.f235005c = volume;
        this.d = marketCap;
        this.e = perShare;
        this.f = dividend;
        this.f235006g = valuation;
        this.f235007h = profitability;
        this.i = managementEffectiveness;
        this.f235008j = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f235003a, yVar.f235003a) && Intrinsics.f(this.f235004b, yVar.f235004b) && Intrinsics.f(this.f235005c, yVar.f235005c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f235006g, yVar.f235006g) && Intrinsics.f(this.f235007h, yVar.f235007h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f235008j, yVar.f235008j);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + ((this.f235007h.hashCode() + ((this.f235006g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f235005c.hashCode() + ((this.f235004b.hashCode() + (this.f235003a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        q qVar = this.f235008j;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }
}
