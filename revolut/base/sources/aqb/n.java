package aqb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f8294b;

    public n(String id10, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f8293a = id10;
        this.f8294b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f8293a, nVar.f8293a) && Intrinsics.f(this.f8294b, nVar.f8294b);
    }

    public final int hashCode() {
        int iHashCode = this.f8293a.hashCode() * 31;
        Long l2 = this.f8294b;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
