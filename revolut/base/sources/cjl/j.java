package cjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aii.u f24714a;

    public j(aii.u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f24714a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f24714a, ((j) obj2).f24714a);
    }

    public final int hashCode() {
        return this.f24714a.hashCode();
    }
}
