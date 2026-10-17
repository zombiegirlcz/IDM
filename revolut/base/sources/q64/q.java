package q64;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242490a;

    public q(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f242490a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f242490a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f242490a, ((q) obj2).f242490a);
    }

    public final int hashCode() {
        return this.f242490a.hashCode();
    }
}
