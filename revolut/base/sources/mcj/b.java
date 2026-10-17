package mcj;

import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingPocket f204366a;

    public b(StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        this.f204366a = stakingPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f204366a, ((b) obj2).f204366a);
    }

    public final int hashCode() {
        return this.f204366a.hashCode();
    }
}
