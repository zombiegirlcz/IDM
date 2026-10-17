package zp8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp8.b f324189a;

    public d(dp8.b task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f324189a = task;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f324189a, ((d) obj2).f324189a);
    }

    public final int hashCode() {
        return this.f324189a.hashCode();
    }
}
