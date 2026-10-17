package yb4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy3.d f312186a;

    public g(sy3.d changes) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.f312186a = changes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f312186a, ((g) obj2).f312186a);
    }

    public final int hashCode() {
        return this.f312186a.hashCode();
    }
}
