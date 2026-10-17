package g9j;

import com.revolut.feature.staking.api.model.StakingAvailability;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingAvailability f141924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f141925b;

    public k(StakingAvailability stakingAvailability, Boolean bool) {
        Intrinsics.checkNotNullParameter(stakingAvailability, "stakingAvailability");
        this.f141924a = stakingAvailability;
        this.f141925b = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f141924a, kVar.f141924a) && Intrinsics.f(this.f141925b, kVar.f141925b);
    }

    public final int hashCode() {
        int iHashCode = this.f141924a.hashCode() * 31;
        Boolean bool = this.f141925b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
