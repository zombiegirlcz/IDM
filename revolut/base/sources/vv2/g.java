package vv2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292441a;

    public g(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f292441a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f292441a, ((g) obj2).f292441a);
    }

    public final int hashCode() {
        return this.f292441a.hashCode();
    }
}
