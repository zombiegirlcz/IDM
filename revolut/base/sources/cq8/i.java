package cq8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp8.b f108030a;

    public i(dp8.b task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f108030a = task;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f108030a, ((i) obj2).f108030a);
    }

    public final int hashCode() {
        return this.f108030a.hashCode();
    }
}
