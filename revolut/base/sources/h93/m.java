package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f150152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f150153b;

    public m(dj0.d dVar, boolean z) {
        this.f150152a = z;
        this.f150153b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f150152a == mVar.f150152a && Intrinsics.f(this.f150153b, mVar.f150153b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f150152a) * 31;
        dj0.d dVar = this.f150153b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
