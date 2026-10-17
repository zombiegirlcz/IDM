package ytd;

import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingPocket f316699a;

    public b(StakingPocket stakingPocket) {
        this.f316699a = stakingPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f316699a, ((b) obj2).f316699a);
    }

    public final int hashCode() {
        StakingPocket stakingPocket = this.f316699a;
        if (stakingPocket == null) {
            return 0;
        }
        return stakingPocket.hashCode();
    }
}
