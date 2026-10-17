package sc5;

import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f261633a;

    public b(StakingProduct stakingProduct) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f261633a = stakingProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f261633a, ((b) obj2).f261633a);
    }

    public final int hashCode() {
        return this.f261633a.hashCode();
    }
}
