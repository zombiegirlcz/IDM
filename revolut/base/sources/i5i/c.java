package i5i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f158840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f158841b;

    public c(ej0.b bVar, ej0.b bVar2) {
        this.f158840a = bVar;
        this.f158841b = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f158840a, cVar.f158840a) && Intrinsics.f(this.f158841b, cVar.f158841b);
    }

    public final int hashCode() {
        ej0.b bVar = this.f158840a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        ej0.b bVar2 = this.f158841b;
        return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
