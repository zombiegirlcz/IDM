package zcj;

import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f321273c;
    public final List d;

    public c(String fromCurrency, String toCurrency, Instant updatedAt, List priceTargets) {
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(priceTargets, "priceTargets");
        this.f321271a = fromCurrency;
        this.f321272b = toCurrency;
        this.f321273c = updatedAt;
        this.d = priceTargets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f321271a, cVar.f321271a) && Intrinsics.f(this.f321272b, cVar.f321272b) && Intrinsics.f(this.f321273c, cVar.f321273c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r6.b.c(p.a.c(this.f321271a.hashCode() * 31, 31, this.f321272b), 31, this.f321273c);
    }
}
