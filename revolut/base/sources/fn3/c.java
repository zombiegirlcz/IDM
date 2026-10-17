package fn3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f136524b;

    public c(String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f136523a = listId;
        this.f136524b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f136523a, cVar.f136523a) && Intrinsics.f(this.f136524b, cVar.f136524b);
    }

    public final int hashCode() {
        int iHashCode = this.f136523a.hashCode() * 31;
        Object obj2 = this.f136524b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
