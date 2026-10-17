package i56;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f158764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f158765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f158766c;

    public d(c cVar, b bVar, Boolean bool) {
        this.f158764a = cVar;
        this.f158765b = bVar;
        this.f158766c = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f158764a, dVar.f158764a) && Intrinsics.f(this.f158765b, dVar.f158765b) && Intrinsics.f(this.f158766c, dVar.f158766c);
    }

    public final int hashCode() {
        c cVar = this.f158764a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        b bVar = this.f158765b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.f158766c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
