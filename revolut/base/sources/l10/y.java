package l10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class y extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191411a;

    public y(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f191411a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f191411a, ((y) obj2).f191411a);
    }

    public final int hashCode() {
        return this.f191411a.hashCode();
    }
}
