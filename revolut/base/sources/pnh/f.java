package pnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237771a;

    public f(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f237771a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f237771a, ((f) obj2).f237771a);
    }

    public final int hashCode() {
        return this.f237771a.hashCode();
    }
}
