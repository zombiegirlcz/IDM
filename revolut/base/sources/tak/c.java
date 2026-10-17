package tak;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f269360b;

    public c(String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f269359a = listId;
        this.f269360b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f269359a, cVar.f269359a) && Intrinsics.f(this.f269360b, cVar.f269360b);
    }

    public final int hashCode() {
        int iHashCode = this.f269359a.hashCode() * 31;
        Object obj2 = this.f269360b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
