package ytd;

import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f316702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f316704c;
    public final StakingProduct d;

    public f(dj0.d amount, String sourcePocketId, StakingPocket stakingPocket, StakingProduct stakingProduct) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f316702a = amount;
        this.f316703b = sourcePocketId;
        this.f316704c = stakingPocket;
        this.d = stakingProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f316702a, fVar.f316702a) && Intrinsics.f(this.f316703b, fVar.f316703b) && Intrinsics.f(this.f316704c, fVar.f316704c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f316702a.hashCode() * 31, 31, this.f316703b);
        StakingPocket stakingPocket = this.f316704c;
        return this.d.hashCode() + ((iC + (stakingPocket == null ? 0 : stakingPocket.hashCode())) * 31);
    }
}
