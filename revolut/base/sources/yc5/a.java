package yc5;

import cli.j;
import com.revolut.feature.staking.api.model.StakingModes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingModes.StakingMode f312534a;

    public a(StakingModes.StakingMode stakingMode) {
        Intrinsics.checkNotNullParameter(stakingMode, "stakingMode");
        this.f312534a = stakingMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f312534a, ((a) obj2).f312534a);
    }

    public final int hashCode() {
        return this.f312534a.hashCode();
    }
}
