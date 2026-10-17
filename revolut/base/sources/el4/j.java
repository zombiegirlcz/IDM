package el4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f127267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f127268b;

    public j(Boolean bool, Long l2) {
        this.f127267a = l2;
        this.f127268b = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f127267a, jVar.f127267a) && Intrinsics.f(this.f127268b, jVar.f127268b);
    }

    public final int hashCode() {
        Long l2 = this.f127267a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Boolean bool = this.f127268b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
