package drk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.b f117169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f117170b;

    public g(jo3.b bVar, Long l2) {
        this.f117169a = bVar;
        this.f117170b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f117169a, gVar.f117169a) && Intrinsics.f(this.f117170b, gVar.f117170b);
    }

    public final int hashCode() {
        jo3.b bVar = this.f117169a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Long l2 = this.f117170b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
