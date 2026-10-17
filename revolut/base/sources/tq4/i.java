package tq4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f273527a;

    public i(dj0.d maxLimit) {
        Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
        this.f273527a = maxLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f273527a, ((i) obj2).f273527a);
    }

    public final int hashCode() {
        return this.f273527a.hashCode();
    }
}
