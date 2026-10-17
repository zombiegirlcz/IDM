package jb1;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f172554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f172555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f172556c;

    public j(dj0.d subTotal, dj0.d vat, dj0.d total) {
        Intrinsics.checkNotNullParameter(subTotal, "subTotal");
        Intrinsics.checkNotNullParameter(vat, "vat");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f172554a = subTotal;
        this.f172555b = vat;
        this.f172556c = total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f172554a, jVar.f172554a) && Intrinsics.f(this.f172555b, jVar.f172555b) && Intrinsics.f(this.f172556c, jVar.f172556c);
    }

    public final int hashCode() {
        return this.f172556c.hashCode() + v7.c(this.f172554a.hashCode() * 31, 31, this.f172555b);
    }
}
