package eq8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128406a;

    public x(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.f128406a = taskId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f128406a, ((x) obj2).f128406a);
    }

    public final int hashCode() {
        return this.f128406a.hashCode();
    }
}
