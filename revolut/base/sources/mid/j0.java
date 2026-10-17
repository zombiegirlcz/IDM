package mid;

import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsAuction f205717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205718b;

    public j0(ShopsAuction context) {
        String placementId = context.f87012c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205717a = context;
        this.f205718b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205717a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205718b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f205717a, j0Var.f205717a) && Intrinsics.f(this.f205718b, j0Var.f205718b);
    }

    public final int hashCode() {
        return this.f205718b.hashCode() + (this.f205717a.hashCode() * 31);
    }
}
