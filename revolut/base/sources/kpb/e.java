package kpb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188215a;

    public e(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f188215a = productId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f188215a, ((e) obj2).f188215a);
    }

    public final int hashCode() {
        return this.f188215a.hashCode();
    }
}
