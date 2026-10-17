package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsSoldOutProductOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsSoldOutProductOffer f205744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205745b;

    public p0(ShopsSoldOutProductOffer context) {
        String placementId = context.f87075a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205744a = context;
        this.f205745b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205744a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205745b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f205744a, p0Var.f205744a) && Intrinsics.f(this.f205745b, p0Var.f205745b);
    }

    public final int hashCode() {
        return this.f205745b.hashCode() + (this.f205744a.hashCode() * 31);
    }
}
