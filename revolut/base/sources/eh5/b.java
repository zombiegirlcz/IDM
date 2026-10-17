package eh5;

import com.revolut.feature.staking.api.model.StakingPocket;
import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import pyd.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f125736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f125737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f125738c;
    public final d d;
    public final StakingPocket e;

    public b(xi0.b currency, d lockedUnstake, d openOrders, d lockedGift, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(lockedUnstake, "lockedUnstake");
        Intrinsics.checkNotNullParameter(openOrders, "openOrders");
        Intrinsics.checkNotNullParameter(lockedGift, "lockedGift");
        this.f125736a = currency;
        this.f125737b = lockedUnstake;
        this.f125738c = openOrders;
        this.d = lockedGift;
        this.e = stakingPocket;
    }

    public final d a() {
        return c.O(c.O(this.f125737b, this.f125738c), this.d);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f125736a, bVar.f125736a) && Intrinsics.f(this.f125737b, bVar.f125737b) && Intrinsics.f(this.f125738c, bVar.f125738c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(v7.c(this.f125736a.hashCode() * 31, 31, this.f125737b), 31, this.f125738c), 31, this.d);
        StakingPocket stakingPocket = this.e;
        return iC + (stakingPocket == null ? 0 : stakingPocket.hashCode());
    }
}
