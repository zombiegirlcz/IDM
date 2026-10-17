package tq4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f273520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f273521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f273522c;
    public final dj0.d d;
    public final xi0.b e;

    public d(dj0.d dVar, dj0.d minCreditLimit, dj0.d maxCreditLimit, dj0.d nonSelectableMinCreditLimit, xi0.b currency) {
        Intrinsics.checkNotNullParameter(minCreditLimit, "minCreditLimit");
        Intrinsics.checkNotNullParameter(maxCreditLimit, "maxCreditLimit");
        Intrinsics.checkNotNullParameter(nonSelectableMinCreditLimit, "nonSelectableMinCreditLimit");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f273520a = dVar;
        this.f273521b = minCreditLimit;
        this.f273522c = maxCreditLimit;
        this.d = nonSelectableMinCreditLimit;
        this.e = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f273520a, dVar.f273520a) && Intrinsics.f(this.f273521b, dVar.f273521b) && Intrinsics.f(this.f273522c, dVar.f273522c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        dj0.d dVar = this.f273520a;
        return this.e.hashCode() + v7.c(v7.c(v7.c((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f273521b), 31, this.f273522c), 31, this.d);
    }
}
