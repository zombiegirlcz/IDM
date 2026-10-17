package y20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f310477a;

    public c1(i plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f310477a = plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f310477a, ((c1) obj2).f310477a);
    }

    public final int hashCode() {
        return this.f310477a.hashCode();
    }
}
