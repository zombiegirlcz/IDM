package u7j;

import aii.e;
import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingPocket f277940a;

    public a(StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        this.f277940a = stakingPocket;
    }

    public final StakingPocket b() {
        return this.f277940a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f277940a, ((a) obj2).f277940a);
    }

    public final int hashCode() {
        return this.f277940a.hashCode();
    }
}
