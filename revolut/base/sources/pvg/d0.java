package pvg;

import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f240106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240107c;
    public final jo3.b d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Float f240109h;
    public final String i;

    public d0(iwg.a analyticsProductType, a3 sector, String currency, jo3.b totalValue, String str, String str2, jo3.b bVar, Float f, String str3) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        this.f240105a = analyticsProductType;
        this.f240106b = sector;
        this.f240107c = currency;
        this.d = totalValue;
        this.e = str;
        this.f = str2;
        this.f240108g = bVar;
        this.f240109h = f;
        this.i = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f240105a == d0Var.f240105a && this.f240106b == d0Var.f240106b && Intrinsics.f(this.f240107c, d0Var.f240107c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f) && Intrinsics.f(this.f240108g, d0Var.f240108g) && Intrinsics.f(this.f240109h, d0Var.f240109h) && Intrinsics.f(this.i, d0Var.i);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.d, p.a.c((this.f240106b.hashCode() + (this.f240105a.hashCode() * 31)) * 31, 31, this.f240107c), 31);
        String str = this.e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jo3.b bVar = this.f240108g;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Float f = this.f240109h;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
