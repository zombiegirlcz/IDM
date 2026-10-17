package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f181530b;

    public b(String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f181529a = listId;
        this.f181530b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f181529a, bVar.f181529a) && Intrinsics.f(this.f181530b, bVar.f181530b);
    }

    public final int hashCode() {
        int iHashCode = this.f181529a.hashCode() * 31;
        Object obj2 = this.f181530b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
