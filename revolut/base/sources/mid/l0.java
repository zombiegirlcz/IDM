package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsLockedProductOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsLockedProductOffer f205724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205725b;

    public l0(ShopsLockedProductOffer context) {
        String placementId = context.d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205724a = context;
        this.f205725b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205724a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205725b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f205724a, l0Var.f205724a) && Intrinsics.f(this.f205725b, l0Var.f205725b);
    }

    public final int hashCode() {
        return this.f205725b.hashCode() + (this.f205724a.hashCode() * 31);
    }
}
