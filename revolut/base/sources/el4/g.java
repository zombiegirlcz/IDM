package el4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f127261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f127262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f127263c;

    public g(Long l2, j jVar, Boolean bool) {
        this.f127261a = l2;
        this.f127262b = jVar;
        this.f127263c = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f127261a, gVar.f127261a) && Intrinsics.f(this.f127262b, gVar.f127262b) && Intrinsics.f(this.f127263c, gVar.f127263c);
    }

    public final int hashCode() {
        Long l2 = this.f127261a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        j jVar = this.f127262b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Boolean bool = this.f127263c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
