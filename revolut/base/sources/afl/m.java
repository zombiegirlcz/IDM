package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f4614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f4615b;

    public m(dj0.d dVar, dj0.d dVar2) {
        this.f4614a = dVar;
        this.f4615b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f4614a, mVar.f4614a) && Intrinsics.f(this.f4615b, mVar.f4615b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f4614a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f4615b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
