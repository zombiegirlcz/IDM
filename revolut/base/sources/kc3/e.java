package kc3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f182651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f182652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e7l.k f182653c;

    public e() {
        this(null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f182651a, eVar.f182651a) && Intrinsics.f(this.f182652b, eVar.f182652b) && Intrinsics.f(this.f182653c, eVar.f182653c);
    }

    public final int hashCode() {
        dj0.d dVar = this.f182651a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f182652b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        e7l.k kVar = this.f182653c;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    public e(dj0.d dVar, dj0.d dVar2, e7l.k kVar) {
        this.f182651a = dVar;
        this.f182652b = dVar2;
        this.f182653c = kVar;
    }
}
