package ml;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sl.x f206515a;

    public b(sl.x workflowTask) {
        Intrinsics.checkNotNullParameter(workflowTask, "workflowTask");
        this.f206515a = workflowTask;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f206515a, ((b) obj2).f206515a);
    }

    public final int hashCode() {
        return this.f206515a.hashCode();
    }

    public final String toString() {
        return "InteractiveTask(workflowTask=" + this.f206515a + ")";
    }
}
