package ytd;

import aii.r;
import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingPocket f316701a;

    public e(StakingPocket stakingPocket) {
        this.f316701a = stakingPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f316701a, ((e) obj2).f316701a);
    }

    public final int hashCode() {
        StakingPocket stakingPocket = this.f316701a;
        if (stakingPocket == null) {
            return 0;
        }
        return stakingPocket.hashCode();
    }
}
