package n33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f211817b;

    public t(String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f211816a = listId;
        this.f211817b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f211816a, tVar.f211816a) && Intrinsics.f(this.f211817b, tVar.f211817b);
    }

    public final int hashCode() {
        int iHashCode = this.f211816a.hashCode() * 31;
        Object obj2 = this.f211817b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
