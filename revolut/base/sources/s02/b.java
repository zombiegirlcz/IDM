package s02;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f258814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f258815b;

    public b(d dVar, d dVar2) {
        this.f258814a = dVar;
        this.f258815b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f258814a, bVar.f258814a) && Intrinsics.f(this.f258815b, bVar.f258815b);
    }

    public final int hashCode() {
        d dVar = this.f258814a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f258815b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
