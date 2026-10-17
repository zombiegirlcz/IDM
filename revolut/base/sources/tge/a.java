package tge;

import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.jvm.internal.Intrinsics;
import pie.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSpaceIdentifier f271160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f271161b;

    public a(ProductSpaceIdentifier spaceIdentifier, v productSubSpaceIdentifier) {
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(productSubSpaceIdentifier, "productSubSpaceIdentifier");
        this.f271160a = spaceIdentifier;
        this.f271161b = productSubSpaceIdentifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f271160a, aVar.f271160a) && this.f271161b == aVar.f271161b;
    }

    public final int hashCode() {
        return this.f271161b.hashCode() + (this.f271160a.hashCode() * 31);
    }
}
