package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsSoldOutProductOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsSoldOutProductOffer f205739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205740b;

    public o0(ShopsSoldOutProductOffer context) {
        String placementId = context.f87075a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205739a = context;
        this.f205740b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205739a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205740b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f205739a, o0Var.f205739a) && Intrinsics.f(this.f205740b, o0Var.f205740b);
    }

    public final int hashCode() {
        return this.f205740b.hashCode() + (this.f205739a.hashCode() * 31);
    }
}
