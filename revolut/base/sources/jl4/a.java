package jl4;

import dj0.d;
import h30.l;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f175590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f175591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f175592c;
    public final d d;
    public final d e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f175593g;

    public a(d cap, d stepAmount, d minCap, d midCap, d maxCap, d dVar, b currency) {
        Intrinsics.checkNotNullParameter(cap, "cap");
        Intrinsics.checkNotNullParameter(stepAmount, "stepAmount");
        Intrinsics.checkNotNullParameter(minCap, "minCap");
        Intrinsics.checkNotNullParameter(midCap, "midCap");
        Intrinsics.checkNotNullParameter(maxCap, "maxCap");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f175590a = cap;
        this.f175591b = stepAmount;
        this.f175592c = minCap;
        this.d = midCap;
        this.e = maxCap;
        this.f = currency;
        this.f175593g = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f175590a, aVar.f175590a) && Intrinsics.f(this.f175591b, aVar.f175591b) && Intrinsics.f(this.f175592c, aVar.f175592c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f175593g, aVar.f175593g);
    }

    public final int hashCode() {
        int iJ = l.j(this.f, v7.c(v7.c(v7.c(v7.c(this.f175590a.hashCode() * 31, 31, this.f175591b), 31, this.f175592c), 31, this.d), 31, this.e), 31);
        d dVar = this.f175593g;
        return iJ + (dVar == null ? 0 : dVar.hashCode());
    }
}
