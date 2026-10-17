package js9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f178164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f178165b;

    public b() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f178164a, bVar.f178164a) && Intrinsics.f(this.f178165b, bVar.f178165b);
    }

    public final int hashCode() {
        a aVar = this.f178164a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.f178165b;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public b(a aVar, a aVar2) {
        this.f178164a = aVar;
        this.f178165b = aVar2;
    }
}
