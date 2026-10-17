package fag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final afi.a f133362b;

    public q(String id10, afi.a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f133361a = id10;
        this.f133362b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f133361a, qVar.f133361a) && Intrinsics.f(this.f133362b, qVar.f133362b);
    }

    public final int hashCode() {
        int iHashCode = this.f133361a.hashCode() * 31;
        afi.a aVar = this.f133362b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
