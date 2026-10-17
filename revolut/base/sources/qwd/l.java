package qwd;

import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingProduct f249861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f249862c;
    public final String d;

    public l(String requestId, StakingProduct stakingProduct, StakingPocket stakingPocket, String str) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f249860a = requestId;
        this.f249861b = stakingProduct;
        this.f249862c = stakingPocket;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f249860a, lVar.f249860a) && Intrinsics.f(this.f249861b, lVar.f249861b) && Intrinsics.f(this.f249862c, lVar.f249862c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f249861b.hashCode() + (this.f249860a.hashCode() * 31)) * 31;
        StakingPocket stakingPocket = this.f249862c;
        int iHashCode2 = (iHashCode + (stakingPocket == null ? 0 : stakingPocket.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
