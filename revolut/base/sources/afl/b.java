package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f4576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f4577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f4578c;

    public b(ej0.b bVar, g gVar, g gVar2) {
        this.f4576a = bVar;
        this.f4577b = gVar;
        this.f4578c = gVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f4576a, bVar.f4576a) && Intrinsics.f(this.f4577b, bVar.f4577b) && Intrinsics.f(this.f4578c, bVar.f4578c);
    }

    public final int hashCode() {
        ej0.b bVar = this.f4576a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        g gVar = this.f4577b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        g gVar2 = this.f4578c;
        return iHashCode2 + (gVar2 != null ? gVar2.hashCode() : 0);
    }
}
