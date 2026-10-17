package ytd;

import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingPocket f316700a;

    public d(StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        this.f316700a = stakingPocket;
    }

    public final StakingPocket b() {
        return this.f316700a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f316700a, ((d) obj2).f316700a);
    }

    public final int hashCode() {
        return this.f316700a.hashCode();
    }
}
