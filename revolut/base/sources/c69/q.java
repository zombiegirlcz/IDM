package c69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21736a;

    public q(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f21736a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f21736a, ((q) obj2).f21736a);
    }

    public final int hashCode() {
        return this.f21736a.hashCode();
    }
}
