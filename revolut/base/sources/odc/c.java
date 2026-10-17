package odc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f224441a;

    public c(dj0.d price) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.f224441a = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f224441a, ((c) obj2).f224441a);
    }

    public final int hashCode() {
        return this.f224441a.hashCode();
    }
}
