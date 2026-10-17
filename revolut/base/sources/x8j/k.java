package x8j;

import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingPocket f303456a;

    public k(StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        this.f303456a = stakingPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f303456a, ((k) obj2).f303456a);
    }

    public final int hashCode() {
        return this.f303456a.hashCode();
    }
}
