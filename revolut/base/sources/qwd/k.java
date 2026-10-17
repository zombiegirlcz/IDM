package qwd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f249858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f249859b;

    public k(dj0.d dVar, dj0.d dVar2) {
        this.f249858a = dVar;
        this.f249859b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f249858a, kVar.f249858a) && Intrinsics.f(this.f249859b, kVar.f249859b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f249858a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f249859b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
