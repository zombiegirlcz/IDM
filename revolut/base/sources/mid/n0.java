package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsProductOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsProductOffer f205734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205735b;

    public n0(ShopsProductOffer context) {
        String placementId = context.d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205734a = context;
        this.f205735b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205734a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205735b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f205734a, n0Var.f205734a) && Intrinsics.f(this.f205735b, n0Var.f205735b);
    }

    public final int hashCode() {
        return this.f205735b.hashCode() + (this.f205734a.hashCode() * 31);
    }
}
