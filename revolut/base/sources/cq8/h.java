package cq8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp8.b f108029a;

    public h(dp8.b task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f108029a = task;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f108029a, ((h) obj2).f108029a);
    }

    public final int hashCode() {
        return this.f108029a.hashCode();
    }
}
