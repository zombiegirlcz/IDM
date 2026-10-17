package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322253a;

    public c0(dj0.d minAmount) {
        Intrinsics.checkNotNullParameter(minAmount, "minAmount");
        this.f322253a = minAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f322253a, ((c0) obj2).f322253a);
    }

    public final int hashCode() {
        return this.f322253a.hashCode();
    }
}
