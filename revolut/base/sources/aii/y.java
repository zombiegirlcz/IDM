package aii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f5296b;

    public y(x request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f5296b = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f5296b, ((y) obj2).f5296b);
    }

    public final int hashCode() {
        return this.f5296b.hashCode();
    }
}
