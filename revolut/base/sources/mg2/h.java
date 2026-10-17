package mg2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205145a;

    public h(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f205145a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f205145a, ((h) obj2).f205145a);
    }

    public final int hashCode() {
        return this.f205145a.hashCode();
    }
}
