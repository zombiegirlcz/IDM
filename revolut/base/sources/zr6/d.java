package zr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f324609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f324610b;

    public d(double d, dj0.d dVar) {
        this.f324609a = d;
        this.f324610b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Double.compare(this.f324609a, dVar.f324609a) == 0 && Intrinsics.f(this.f324610b, dVar.f324610b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f324609a) * 31;
        dj0.d dVar = this.f324610b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
