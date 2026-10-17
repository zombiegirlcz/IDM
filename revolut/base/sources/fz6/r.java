package fz6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139130a;

    public r(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f139130a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f139130a, ((r) obj2).f139130a);
    }

    public final int hashCode() {
        return this.f139130a.hashCode();
    }
}
