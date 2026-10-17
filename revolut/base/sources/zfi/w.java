package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f322005b;

    public w(dj0.d dVar, dj0.d dVar2) {
        this.f322004a = dVar;
        this.f322005b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f322004a, wVar.f322004a) && Intrinsics.f(this.f322005b, wVar.f322005b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f322004a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f322005b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
