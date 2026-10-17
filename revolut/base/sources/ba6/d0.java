package ba6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f13927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f13928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f13929c;
    public final l d;
    public final wi0.b e;
    public final u f;

    public d0(dj0.d amount, g0 status, r rVar, l charity, wi0.b countryCode, u donationMode) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(donationMode, "donationMode");
        this.f13927a = amount;
        this.f13928b = status;
        this.f13929c = rVar;
        this.d = charity;
        this.e = countryCode;
        this.f = donationMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f13927a, d0Var.f13927a) && this.f13928b == d0Var.f13928b && Intrinsics.f(this.f13929c, d0Var.f13929c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e) && this.f == d0Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f13928b.hashCode() + (this.f13927a.hashCode() * 31)) * 31;
        r rVar = this.f13929c;
        return this.f.hashCode() + p.a.c((this.d.hashCode() + ((iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31)) * 31, 31, this.e.f297794a);
    }
}
