package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f163660b;

    public bz(String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f163659a = listId;
        this.f163660b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj2;
        return Intrinsics.f(this.f163659a, bzVar.f163659a) && Intrinsics.f(this.f163660b, bzVar.f163660b);
    }

    public final int hashCode() {
        int iHashCode = this.f163659a.hashCode() * 31;
        Object obj2 = this.f163660b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
