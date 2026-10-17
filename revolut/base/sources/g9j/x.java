package g9j;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f141950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f141951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f141952c;
    public final dj0.d d;

    public x(dj0.d balance, dj0.d dVar, dj0.d availableBalance, dj0.d pnlBalance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(pnlBalance, "pnlBalance");
        this.f141950a = balance;
        this.f141951b = dVar;
        this.f141952c = availableBalance;
        this.d = pnlBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f141950a, xVar.f141950a) && Intrinsics.f(this.f141951b, xVar.f141951b) && Intrinsics.f(this.f141952c, xVar.f141952c) && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f141950a.hashCode() * 31;
        dj0.d dVar = this.f141951b;
        return this.d.hashCode() + v7.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f141952c);
    }
}
