package x8j;

import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingProduct f303453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f303454c;

    public j(String str, StakingProduct stakingProduct, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f303452a = str;
        this.f303453b = stakingProduct;
        this.f303454c = stakingPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f303452a, jVar.f303452a) && Intrinsics.f(this.f303453b, jVar.f303453b) && Intrinsics.f(this.f303454c, jVar.f303454c);
    }

    public final int hashCode() {
        String str = this.f303452a;
        int iHashCode = (this.f303453b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        StakingPocket stakingPocket = this.f303454c;
        return iHashCode + (stakingPocket != null ? stakingPocket.hashCode() : 0);
    }
}
