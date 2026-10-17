package uof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f281646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f281647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f281648c;

    public b(c cVar, d dVar, d dVar2) {
        this.f281646a = cVar;
        this.f281647b = dVar;
        this.f281648c = dVar2;
    }

    public final c a() {
        return this.f281646a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f281646a == bVar.f281646a && Intrinsics.f(this.f281647b, bVar.f281647b) && Intrinsics.f(this.f281648c, bVar.f281648c);
    }

    public final int hashCode() {
        c cVar = this.f281646a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        d dVar = this.f281647b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f281648c;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
