package odc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f224447a;

    public i(dj0.d price) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.f224447a = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f224447a, ((i) obj2).f224447a);
    }

    public final int hashCode() {
        return this.f224447a.hashCode();
    }
}
