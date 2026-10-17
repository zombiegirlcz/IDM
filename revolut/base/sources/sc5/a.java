package sc5;

import cli.j;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f261632a;

    public a(StakingProduct stakingProduct) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f261632a = stakingProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f261632a, ((a) obj2).f261632a);
    }

    public final int hashCode() {
        return this.f261632a.hashCode();
    }
}
