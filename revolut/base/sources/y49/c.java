package y49;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f310836c;
    public final dj0.d d;
    public final dj0.d e;

    public c(String id10, String currency, dj0.d investable, dj0.d withdrawable, dj0.d blocked) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(investable, "investable");
        Intrinsics.checkNotNullParameter(withdrawable, "withdrawable");
        Intrinsics.checkNotNullParameter(blocked, "blocked");
        this.f310834a = id10;
        this.f310835b = currency;
        this.f310836c = investable;
        this.d = withdrawable;
        this.e = blocked;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f310834a, cVar.f310834a) && Intrinsics.f(this.f310835b, cVar.f310835b) && Intrinsics.f(this.f310836c, cVar.f310836c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(p.a.c(this.f310834a.hashCode() * 31, 31, this.f310835b), 31, this.f310836c), 31, this.d);
    }
}
