package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsFrozenOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsFrozenOffer f205757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205758b;

    public s0(ShopsFrozenOffer context) {
        String placementId = context.f87047a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205757a = context;
        this.f205758b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205757a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205758b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f205757a, s0Var.f205757a) && Intrinsics.f(this.f205758b, s0Var.f205758b);
    }

    public final int hashCode() {
        return this.f205758b.hashCode() + (this.f205757a.hashCode() * 31);
    }
}
