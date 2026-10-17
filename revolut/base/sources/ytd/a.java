package ytd;

import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingProduct f316697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f316698c;

    public a(String str, StakingProduct stakingProduct, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f316696a = str;
        this.f316697b = stakingProduct;
        this.f316698c = stakingPocket;
    }

    public final String b() {
        return this.f316696a;
    }

    public final StakingPocket c() {
        return this.f316698c;
    }

    public final StakingProduct d() {
        return this.f316697b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f316696a, aVar.f316696a) && Intrinsics.f(this.f316697b, aVar.f316697b) && Intrinsics.f(this.f316698c, aVar.f316698c);
    }

    public final int hashCode() {
        String str = this.f316696a;
        int iHashCode = (this.f316697b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        StakingPocket stakingPocket = this.f316698c;
        return iHashCode + (stakingPocket != null ? stakingPocket.hashCode() : 0);
    }
}
