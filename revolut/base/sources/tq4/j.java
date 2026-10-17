package tq4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f273528a;

    public j(dj0.d minLimit) {
        Intrinsics.checkNotNullParameter(minLimit, "minLimit");
        this.f273528a = minLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f273528a, ((j) obj2).f273528a);
    }

    public final int hashCode() {
        return this.f273528a.hashCode();
    }
}
