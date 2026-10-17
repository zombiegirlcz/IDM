package uud;

import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f283207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f283208b;

    public b(StakingProduct stakingProduct, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f283207a = stakingProduct;
        this.f283208b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f283207a, bVar.f283207a) && Intrinsics.f(this.f283208b, bVar.f283208b);
    }

    public final int hashCode() {
        int iHashCode = this.f283207a.hashCode() * 31;
        wi0.b bVar = this.f283208b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
