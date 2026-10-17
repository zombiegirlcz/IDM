package cb2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22708a;

    public g(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f22708a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f22708a, ((g) obj2).f22708a);
    }

    public final int hashCode() {
        return this.f22708a.hashCode();
    }
}
