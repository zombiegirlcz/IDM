package odc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f224443a;

    public e(dj0.d price) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.f224443a = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f224443a, ((e) obj2).f224443a);
    }

    public final int hashCode() {
        return this.f224443a.hashCode();
    }
}
