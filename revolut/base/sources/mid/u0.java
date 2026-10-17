package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsPurchase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsPurchase f205764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205765b;

    public u0(ShopsPurchase context) {
        String placementId = context.f87070j;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205764a = context;
        this.f205765b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205764a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205765b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f205764a, u0Var.f205764a) && Intrinsics.f(this.f205765b, u0Var.f205765b);
    }

    public final int hashCode() {
        return this.f205765b.hashCode() + (this.f205764a.hashCode() * 31);
    }
}
