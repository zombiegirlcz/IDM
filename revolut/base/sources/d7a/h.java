package d7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111901a;

    public h(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f111901a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f111901a, ((h) obj2).f111901a);
    }

    public final int hashCode() {
        return this.f111901a.hashCode();
    }
}
