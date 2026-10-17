package se6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f262138c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f262139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f262140h;

    public i(String id10, String countryCode, String name, boolean z, boolean z3, boolean z4, b bVar, a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f262136a = id10;
        this.f262137b = countryCode;
        this.f262138c = name;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f262139g = bVar;
        this.f262140h = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f262136a, iVar.f262136a) && Intrinsics.f(this.f262137b, iVar.f262137b) && Intrinsics.f(this.f262138c, iVar.f262138c) && this.d == iVar.d && this.e == iVar.e && this.f == iVar.f && Intrinsics.f(this.f262139g, iVar.f262139g) && Intrinsics.f(this.f262140h, iVar.f262140h);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(this.f262136a.hashCode() * 31, 31, this.f262137b), 31, this.f262138c), 31, this.d), 31, this.e), 31, this.f);
        b bVar = this.f262139g;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.f262140h;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
