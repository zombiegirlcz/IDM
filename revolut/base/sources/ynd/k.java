package ynd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f315459a;

    public k(dj0.d allTimeAmount) {
        Intrinsics.checkNotNullParameter(allTimeAmount, "allTimeAmount");
        this.f315459a = allTimeAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f315459a, ((k) obj2).f315459a);
    }

    public final int hashCode() {
        return this.f315459a.hashCode();
    }
}
