package q64;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242489a;

    public p(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f242489a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f242489a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f242489a, ((p) obj2).f242489a);
    }

    public final int hashCode() {
        return this.f242489a.hashCode();
    }
}
