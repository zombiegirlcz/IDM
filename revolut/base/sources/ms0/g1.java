package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g1 implements koi.j, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208258a;

    public g1(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f208258a = listId;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53082a() {
        return this.f208258a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g1) && Intrinsics.f(this.f208258a, ((g1) obj2).f208258a);
    }

    public final int hashCode() {
        return this.f208258a.hashCode();
    }
}
