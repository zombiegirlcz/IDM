package sl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f264073b;

    public w(String taskName, Throwable th10) {
        Intrinsics.checkNotNullParameter("", "id");
        Intrinsics.checkNotNullParameter("", "taskDefId");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        this.f264072a = taskName;
        this.f264073b = th10;
    }

    @Override // sl.x
    public final String a() {
        return "";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f264072a, wVar.f264072a) && this.f264073b.equals(wVar.f264073b);
    }

    @Override // sl.x
    public final String getId() {
        return "";
    }

    public final int hashCode() {
        return this.f264073b.hashCode() + (this.f264072a.hashCode() * 31);
    }

    public final String toString() {
        return "UnsupportedTask(id=, taskDefId=, taskName=" + this.f264072a + ", reason=" + this.f264073b + ")";
    }
}
