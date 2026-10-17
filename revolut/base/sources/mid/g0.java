package mid;

import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsCampaignOffer f205704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205705b;

    public g0(ShopsCampaignOffer context) {
        String placementId = context.u;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205704a = context;
        this.f205705b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205704a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205705b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f205704a, g0Var.f205704a) && Intrinsics.f(this.f205705b, g0Var.f205705b);
    }

    public final int hashCode() {
        return this.f205705b.hashCode() + (this.f205704a.hashCode() * 31);
    }
}
