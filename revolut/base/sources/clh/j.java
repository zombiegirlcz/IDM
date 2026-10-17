package clh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25002a;

    public j(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f25002a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f25002a, ((j) obj2).f25002a);
    }

    public final int hashCode() {
        return this.f25002a.hashCode();
    }
}
