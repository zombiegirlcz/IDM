package ljb;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195617a;

    public b(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f195617a = productId;
    }

    public final String b() {
        return this.f195617a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f195617a, ((b) obj2).f195617a);
    }

    public final int hashCode() {
        return this.f195617a.hashCode();
    }
}
