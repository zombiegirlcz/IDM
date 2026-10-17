package m9j;

import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f203809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f203810b;

    public j(StakingProduct stakingProduct, boolean z) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f203809a = stakingProduct;
        this.f203810b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f203809a, jVar.f203809a) && this.f203810b == jVar.f203810b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203810b) + (this.f203809a.hashCode() * 31);
    }
}
