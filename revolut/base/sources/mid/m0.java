package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsProductOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsProductOffer f205727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205728b;

    public m0(ShopsProductOffer context) {
        String placementId = context.d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205727a = context;
        this.f205728b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205727a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205728b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f205727a, m0Var.f205727a) && Intrinsics.f(this.f205728b, m0Var.f205728b);
    }

    public final int hashCode() {
        return this.f205728b.hashCode() + (this.f205727a.hashCode() * 31);
    }
}
