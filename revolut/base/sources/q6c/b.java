package q6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f242524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f242525c;
    public final a d;

    public b(String name, long j2, Long l2, a aVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f242523a = name;
        this.f242524b = j2;
        this.f242525c = l2;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f242523a, bVar.f242523a) && this.f242524b == bVar.f242524b && Intrinsics.f(this.f242525c, bVar.f242525c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f242523a.hashCode() * 31, 31, this.f242524b);
        Long l2 = this.f242525c;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        a aVar = this.d;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
