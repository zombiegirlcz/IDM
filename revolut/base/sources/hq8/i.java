package hq8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154631a;

    public i(List tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f154631a = tasks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f154631a, ((i) obj2).f154631a);
    }

    public final int hashCode() {
        return this.f154631a.hashCode();
    }
}
