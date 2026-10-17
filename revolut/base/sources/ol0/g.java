package ol0;

import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f226288a;

    public g(ArrayDeque children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f226288a = children;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f226288a.equals(((g) obj2).f226288a);
    }

    public final int hashCode() {
        return this.f226288a.hashCode();
    }
}
