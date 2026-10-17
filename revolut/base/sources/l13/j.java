package l13;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191436a;

    public j(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f191436a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f191436a, ((j) obj2).f191436a);
    }

    public final int hashCode() {
        return this.f191436a.hashCode();
    }
}
