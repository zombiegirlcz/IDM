package ljb;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195616a;

    public a(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f195616a = productId;
    }

    public final String b() {
        return this.f195616a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f195616a, ((a) obj2).f195616a);
    }

    public final int hashCode() {
        return this.f195616a.hashCode();
    }
}
