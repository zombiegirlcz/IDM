package mif;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f205838a;

    public w(i7 filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f205838a = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f205838a, ((w) obj2).f205838a);
    }

    @Override // mif.y
    public final i7 getFilter() {
        return this.f205838a;
    }

    public final int hashCode() {
        return this.f205838a.hashCode();
    }
}
