package nc5;

import com.revolut.feature.staking.api.model.StakingModes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingModes.StakingMode f214152a;

    public g(StakingModes.StakingMode stakingMode) {
        Intrinsics.checkNotNullParameter(stakingMode, "stakingMode");
        this.f214152a = stakingMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f214152a, ((g) obj2).f214152a);
    }

    public final int hashCode() {
        return this.f214152a.hashCode();
    }
}
