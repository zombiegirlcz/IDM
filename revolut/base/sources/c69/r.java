package c69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21737a;

    public r(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f21737a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f21737a, ((r) obj2).f21737a);
    }

    public final int hashCode() {
        return this.f21737a.hashCode();
    }
}
