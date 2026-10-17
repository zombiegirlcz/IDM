package aqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f8412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f8413b;

    public w(dj0.d limit, dj0.d allocated) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(allocated, "allocated");
        this.f8412a = limit;
        this.f8413b = allocated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f8412a, wVar.f8412a) && Intrinsics.f(this.f8413b, wVar.f8413b);
    }

    public final int hashCode() {
        return this.f8413b.hashCode() + (this.f8412a.hashCode() * 31);
    }
}
