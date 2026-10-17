package w4i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f294600b;

    public z(String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f294599a = listId;
        this.f294600b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f294599a, zVar.f294599a) && Intrinsics.f(this.f294600b, zVar.f294600b);
    }

    public final int hashCode() {
        int iHashCode = this.f294599a.hashCode() * 31;
        Object obj2 = this.f294600b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
