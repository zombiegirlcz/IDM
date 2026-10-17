package x62;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f303030b;

    public b(String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f303029a = listId;
        this.f303030b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f303029a, bVar.f303029a) && Intrinsics.f(this.f303030b, bVar.f303030b);
    }

    public final int hashCode() {
        int iHashCode = this.f303029a.hashCode() * 31;
        Object obj2 = this.f303030b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
