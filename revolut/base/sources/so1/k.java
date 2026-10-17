package so1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264680a;

    public k(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f264680a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f264680a, ((k) obj2).f264680a);
    }

    public final int hashCode() {
        return this.f264680a.hashCode();
    }
}
