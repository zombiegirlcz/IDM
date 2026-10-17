package as6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f8799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f8800b;

    public c(double d, dj0.d dVar) {
        this.f8799a = d;
        this.f8800b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Double.compare(this.f8799a, cVar.f8799a) == 0 && Intrinsics.f(this.f8800b, cVar.f8800b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f8799a) * 31;
        dj0.d dVar = this.f8800b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
