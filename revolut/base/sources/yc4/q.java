package yc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv3.f f312527a;

    public q(iv3.f error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f312527a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f312527a, ((q) obj2).f312527a);
    }

    public final int hashCode() {
        return this.f312527a.hashCode();
    }
}
