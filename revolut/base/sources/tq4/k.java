package tq4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f273529a;

    public k(dj0.d minLimit) {
        Intrinsics.checkNotNullParameter(minLimit, "minLimit");
        this.f273529a = minLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f273529a, ((k) obj2).f273529a);
    }

    public final int hashCode() {
        return this.f273529a.hashCode();
    }
}
