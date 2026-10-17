package mid;

import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsAuction f205713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205714b;

    public i0(ShopsAuction context) {
        String placementId = context.f87012c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205713a = context;
        this.f205714b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205713a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205714b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f205713a, i0Var.f205713a) && Intrinsics.f(this.f205714b, i0Var.f205714b);
    }

    public final int hashCode() {
        return this.f205714b.hashCode() + (this.f205713a.hashCode() * 31);
    }
}
