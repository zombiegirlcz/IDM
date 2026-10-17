package eq8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp8.b f128408a;

    public z(dp8.b task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f128408a = task;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f128408a, ((z) obj2).f128408a);
    }

    public final int hashCode() {
        return this.f128408a.hashCode();
    }
}
