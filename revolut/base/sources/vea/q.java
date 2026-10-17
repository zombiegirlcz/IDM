package vea;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f288230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f288231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f288232c;
    public final boolean d;
    public final boolean e;
    public final n9l.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vel.a f288233g;

    public q(io3.d pocket, dj0.d totalBalance, dj0.d totalBalanceInBaseCurrency, boolean z, boolean z3, n9l.a aVar, vel.a aVar2) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(totalBalanceInBaseCurrency, "totalBalanceInBaseCurrency");
        this.f288230a = pocket;
        this.f288231b = totalBalance;
        this.f288232c = totalBalanceInBaseCurrency;
        this.d = z;
        this.e = z3;
        this.f = aVar;
        this.f288233g = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f288230a, qVar.f288230a) && Intrinsics.f(this.f288231b, qVar.f288231b) && Intrinsics.f(this.f288232c, qVar.f288232c) && this.d == qVar.d && this.e == qVar.e && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f288233g, qVar.f288233g);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(v7.c(v7.c(this.f288230a.hashCode() * 31, 31, this.f288231b), 31, this.f288232c), 31, this.d), 31, this.e);
        n9l.a aVar = this.f;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        vel.a aVar2 = this.f288233g;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
