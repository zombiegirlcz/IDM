package ew2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130016a;

    public g0(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f130016a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f130016a, ((g0) obj2).f130016a);
    }

    public final int hashCode() {
        return this.f130016a.hashCode();
    }
}
