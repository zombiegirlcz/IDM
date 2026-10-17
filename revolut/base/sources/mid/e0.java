package mid;

import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsAuction f205698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205699b;

    public e0(ShopsAuction context, String placementId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205698a = context;
        this.f205699b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205698a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205699b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f205698a, e0Var.f205698a) && Intrinsics.f(this.f205699b, e0Var.f205699b);
    }

    public final int hashCode() {
        return this.f205699b.hashCode() + (this.f205698a.hashCode() * 31);
    }
}
