package cy4;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f110042b;

    public b(String listId, p pVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f110041a = listId;
        this.f110042b = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f110041a, bVar.f110041a) && Intrinsics.f(this.f110042b, bVar.f110042b);
    }

    public final int hashCode() {
        int iHashCode = this.f110041a.hashCode() * 31;
        p pVar = this.f110042b;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
