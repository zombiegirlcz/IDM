package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f4571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f4572c;
    public final u d;
    public final v e;
    public final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f4573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f4574h;
    public final t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f4575j;

    public a0(String ref2, w price, z volume, u marketCap, v perShare, r dividend, y valuation, x profitability, t managementEffectiveness, s sVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(volume, "volume");
        Intrinsics.checkNotNullParameter(marketCap, "marketCap");
        Intrinsics.checkNotNullParameter(perShare, "perShare");
        Intrinsics.checkNotNullParameter(dividend, "dividend");
        Intrinsics.checkNotNullParameter(valuation, "valuation");
        Intrinsics.checkNotNullParameter(profitability, "profitability");
        Intrinsics.checkNotNullParameter(managementEffectiveness, "managementEffectiveness");
        this.f4570a = ref2;
        this.f4571b = price;
        this.f4572c = volume;
        this.d = marketCap;
        this.e = perShare;
        this.f = dividend;
        this.f4573g = valuation;
        this.f4574h = profitability;
        this.i = managementEffectiveness;
        this.f4575j = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f4570a, a0Var.f4570a) && Intrinsics.f(this.f4571b, a0Var.f4571b) && Intrinsics.f(this.f4572c, a0Var.f4572c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f4573g, a0Var.f4573g) && Intrinsics.f(this.f4574h, a0Var.f4574h) && Intrinsics.f(this.i, a0Var.i) && Intrinsics.f(this.f4575j, a0Var.f4575j);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + ((this.f4574h.hashCode() + ((this.f4573g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f4572c.hashCode() + ((this.f4571b.hashCode() + (this.f4570a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        s sVar = this.f4575j;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    @Override // afl.a
    public final String i() {
        return this.f4570a;
    }
}
