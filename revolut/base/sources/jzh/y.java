package jzh;

import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f179871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingProduct f179873c;
    public final StakingPocket d;

    public y(xi0.b currency, String sourcePocketId, StakingProduct stakingProduct, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f179871a = currency;
        this.f179872b = sourcePocketId;
        this.f179873c = stakingProduct;
        this.d = stakingPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f179871a, yVar.f179871a) && Intrinsics.f(this.f179872b, yVar.f179872b) && Intrinsics.f(this.f179873c, yVar.f179873c) && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f179873c.hashCode() + p.a.c(this.f179871a.hashCode() * 31, 31, this.f179872b)) * 31;
        StakingPocket stakingPocket = this.d;
        return iHashCode + (stakingPocket == null ? 0 : stakingPocket.hashCode());
    }
}
