package vge;

import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSpaceIdentifier f289040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pie.v f289041b;

    public v2(ProductSpaceIdentifier spaceIdentifier, pie.v productSubSpaceIdentifier) {
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(productSubSpaceIdentifier, "productSubSpaceIdentifier");
        this.f289040a = spaceIdentifier;
        this.f289041b = productSubSpaceIdentifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj2;
        return Intrinsics.f(this.f289040a, v2Var.f289040a) && this.f289041b == v2Var.f289041b;
    }

    public final int hashCode() {
        return this.f289041b.hashCode() + (this.f289040a.hashCode() * 31);
    }
}
