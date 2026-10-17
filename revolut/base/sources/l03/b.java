package l03;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wy2.d f191145a;

    public b(wy2.d reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f191145a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f191145a == ((b) obj2).f191145a;
    }

    public final int hashCode() {
        return this.f191145a.hashCode();
    }
}
