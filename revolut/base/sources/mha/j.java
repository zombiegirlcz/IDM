package mha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f205454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f205455b;

    public j(double d, dj0.d dVar) {
        this.f205454a = d;
        this.f205455b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Double.compare(this.f205454a, jVar.f205454a) == 0 && Intrinsics.f(this.f205455b, jVar.f205455b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f205454a) * 31;
        dj0.d dVar = this.f205455b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
