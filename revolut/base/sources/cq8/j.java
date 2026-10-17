package cq8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp8.b f108031a;

    public j(dp8.b task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f108031a = task;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f108031a, ((j) obj2).f108031a);
    }

    public final int hashCode() {
        return this.f108031a.hashCode();
    }
}
