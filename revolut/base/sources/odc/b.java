package odc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f224440a;

    public b(dj0.d price) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.f224440a = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f224440a, ((b) obj2).f224440a);
    }

    public final int hashCode() {
        return this.f224440a.hashCode();
    }
}
