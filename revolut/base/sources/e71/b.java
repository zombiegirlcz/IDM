package e71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f123019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f123021c;

    public b(dj0.d dVar, String str, a aVar) {
        this.f123019a = dVar;
        this.f123020b = str;
        this.f123021c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f123019a, bVar.f123019a) && Intrinsics.f(this.f123020b, bVar.f123020b) && Intrinsics.f(this.f123021c, bVar.f123021c);
    }

    public final int hashCode() {
        dj0.d dVar = this.f123019a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        String str = this.f123020b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f123021c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
