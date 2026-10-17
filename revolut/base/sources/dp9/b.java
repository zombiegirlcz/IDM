package dp9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f116849b;

    public b(String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f116848a = listId;
        this.f116849b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f116848a, bVar.f116848a) && Intrinsics.f(this.f116849b, bVar.f116849b);
    }

    public final int hashCode() {
        int iHashCode = this.f116848a.hashCode() * 31;
        Object obj2 = this.f116849b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
