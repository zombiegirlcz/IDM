package t1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f267354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f267355b;

    public g(dj0.d available, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(available, "available");
        this.f267354a = available;
        this.f267355b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f267354a, gVar.f267354a) && Intrinsics.f(this.f267355b, gVar.f267355b);
    }

    public final int hashCode() {
        int iHashCode = this.f267354a.hashCode() * 31;
        dj0.d dVar = this.f267355b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
