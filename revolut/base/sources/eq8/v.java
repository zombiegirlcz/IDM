package eq8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp8.b f128404a;

    public v(dp8.b task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f128404a = task;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f128404a, ((v) obj2).f128404a);
    }

    public final int hashCode() {
        return this.f128404a.hashCode();
    }
}
