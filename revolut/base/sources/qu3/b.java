package qu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f249195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f249196c;
    public final boolean d;

    public b(dj0.d dVar, String id10, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f249194a = id10;
        this.f249195b = dVar;
        this.f249196c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f249194a, bVar.f249194a) && Intrinsics.f(this.f249195b, bVar.f249195b) && this.f249196c == bVar.f249196c && this.d == bVar.d;
    }

    @Override // qu3.d
    public final boolean f0() {
        return this.d;
    }

    @Override // qu3.d
    public final String getId() {
        return this.f249194a;
    }

    @Override // qu3.d
    public final Object getValue() {
        return this.f249195b;
    }

    public final int hashCode() {
        int iHashCode = this.f249194a.hashCode() * 31;
        dj0.d dVar = this.f249195b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f249196c);
    }

    @Override // qu3.d
    public final boolean k0() {
        return this.f249196c;
    }
}
