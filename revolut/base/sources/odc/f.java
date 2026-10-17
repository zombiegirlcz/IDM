package odc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f224444a;

    public f(dj0.d price) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.f224444a = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f224444a, ((f) obj2).f224444a);
    }

    public final int hashCode() {
        return this.f224444a.hashCode();
    }
}
