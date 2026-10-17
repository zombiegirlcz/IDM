package yc5;

import com.revolut.feature.staking.api.model.StakingModes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingModes.StakingMode f312535a;

    public b(StakingModes.StakingMode stakingMode) {
        Intrinsics.checkNotNullParameter(stakingMode, "stakingMode");
        this.f312535a = stakingMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f312535a, ((b) obj2).f312535a);
    }

    public final int hashCode() {
        return this.f312535a.hashCode();
    }
}
