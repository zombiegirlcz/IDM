package oc5;

import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f224101a;

    public a(StakingProduct stakingProduct) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f224101a = stakingProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f224101a, ((a) obj2).f224101a);
    }

    public final int hashCode() {
        return this.f224101a.hashCode();
    }
}
