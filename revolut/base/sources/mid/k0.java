package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsLockedProductOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsLockedProductOffer f205721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205722b;

    public k0(ShopsLockedProductOffer context) {
        String placementId = context.d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205721a = context;
        this.f205722b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205721a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205722b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f205721a, k0Var.f205721a) && Intrinsics.f(this.f205722b, k0Var.f205722b);
    }

    public final int hashCode() {
        return this.f205722b.hashCode() + (this.f205721a.hashCode() * 31);
    }
}
