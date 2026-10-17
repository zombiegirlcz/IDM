package mid;

import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsCampaignOffer f205700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205701b;

    public f0(ShopsCampaignOffer context) {
        String placementId = context.u;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205700a = context;
        this.f205701b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205700a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205701b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f205700a, f0Var.f205700a) && Intrinsics.f(this.f205701b, f0Var.f205701b);
    }

    public final int hashCode() {
        return this.f205701b.hashCode() + (this.f205700a.hashCode() * 31);
    }
}
