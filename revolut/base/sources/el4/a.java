package el4;

import h30.l;
import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f127242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f127243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f127244c;
    public final dj0.d d;
    public final boolean e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f127245g;

    public a(dj0.d amountAvailable, dj0.d amountSpent, dj0.d monthlySpendingLimit, dj0.d dVar, boolean z, xi0.b currency, int i) {
        Intrinsics.checkNotNullParameter(amountAvailable, "amountAvailable");
        Intrinsics.checkNotNullParameter(amountSpent, "amountSpent");
        Intrinsics.checkNotNullParameter(monthlySpendingLimit, "monthlySpendingLimit");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f127242a = amountAvailable;
        this.f127243b = amountSpent;
        this.f127244c = monthlySpendingLimit;
        this.d = dVar;
        this.e = z;
        this.f = currency;
        this.f127245g = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f127242a, aVar.f127242a) && Intrinsics.f(this.f127243b, aVar.f127243b) && Intrinsics.f(this.f127244c, aVar.f127244c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && this.f127245g == aVar.f127245g;
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f127242a.hashCode() * 31, 31, this.f127243b), 31, this.f127244c);
        dj0.d dVar = this.d;
        return Integer.hashCode(this.f127245g) + l.j(this.f, j6.a.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.e), 31);
    }
}
