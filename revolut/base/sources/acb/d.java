package acb;

import h30.l;
import kotlin.jvm.internal.Intrinsics;
import pcd.l0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f3112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f3113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3114c;
    public final l0 d;
    public final String e;

    public d(xi0.b sourceCurrency, xi0.b targetCurrency, long j2, l0 l0Var, String str) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f3112a = sourceCurrency;
        this.f3113b = targetCurrency;
        this.f3114c = j2;
        this.d = l0Var;
        this.e = str;
    }

    @Override // acb.e
    public final xi0.b a() {
        return this.f3112a;
    }

    @Override // acb.e
    public final xi0.b b() {
        return this.f3113b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f3112a, dVar.f3112a) && Intrinsics.f(this.f3113b, dVar.f3113b) && this.f3114c == dVar.f3114c && this.d == dVar.d && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = a0.d.c(l.j(this.f3113b, this.f3112a.hashCode() * 31, 31), 31, this.f3114c);
        l0 l0Var = this.d;
        int iHashCode = (iC + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        String str = this.e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
