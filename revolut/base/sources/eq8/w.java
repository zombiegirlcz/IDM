package eq8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp8.b f128405a;

    public w(dp8.b task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f128405a = task;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f128405a, ((w) obj2).f128405a);
    }

    public final int hashCode() {
        return this.f128405a.hashCode();
    }
}
