package rzj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vel.a f258696a;

    public i(vel.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f258696a = performance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f258696a, ((i) obj2).f258696a);
    }

    public final int hashCode() {
        return this.f258696a.hashCode();
    }
}
