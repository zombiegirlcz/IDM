package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f154885b;

    public f(String deeplink, h hVar) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f154884a = deeplink;
        this.f154885b = hVar;
    }

    @Override // hs3.k
    public final h O() {
        return this.f154885b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f154884a, fVar.f154884a) && Intrinsics.f(this.f154885b, fVar.f154885b);
    }

    public final int hashCode() {
        int iHashCode = this.f154884a.hashCode() * 31;
        h hVar = this.f154885b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
