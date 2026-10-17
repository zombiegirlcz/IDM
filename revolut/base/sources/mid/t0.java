package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsFrozenOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsFrozenOffer f205760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205761b;

    public t0(ShopsFrozenOffer context) {
        String placementId = context.f87047a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205760a = context;
        this.f205761b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205760a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205761b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f205760a, t0Var.f205760a) && Intrinsics.f(this.f205761b, t0Var.f205761b);
    }

    public final int hashCode() {
        return this.f205761b.hashCode() + (this.f205760a.hashCode() * 31);
    }
}
