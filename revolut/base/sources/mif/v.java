package mif;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f205837a;

    public v() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f205837a, ((v) obj2).f205837a);
    }

    @Override // mif.y
    public final i7 getFilter() {
        return this.f205837a;
    }

    public final int hashCode() {
        return this.f205837a.hashCode();
    }

    public v(int i) {
        i7.c0 filter = i7.c0.f272809a;
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f205837a = filter;
    }
}
