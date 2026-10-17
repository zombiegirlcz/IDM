package fb7;

import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSpaceIdentifier f133496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pie.v f133497b;

    public u(ProductSpaceIdentifier productSpaceIdentifier, pie.v productSubSpaceIdentifier) {
        Intrinsics.checkNotNullParameter(productSpaceIdentifier, "productSpaceIdentifier");
        Intrinsics.checkNotNullParameter(productSubSpaceIdentifier, "productSubSpaceIdentifier");
        this.f133496a = productSpaceIdentifier;
        this.f133497b = productSubSpaceIdentifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f133496a, uVar.f133496a) && this.f133497b == uVar.f133497b;
    }

    public final int hashCode() {
        return this.f133497b.hashCode() + (this.f133496a.hashCode() * 31);
    }
}
