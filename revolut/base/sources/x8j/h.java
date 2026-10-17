package x8j;

import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f303445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f303446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f303447c;
    public final long d;
    public final boolean e;

    public h(long j2, StakingPocket stakingPocket, io3.d dVar, xi0.b pocketCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        this.f303445a = pocketCurrency;
        this.f303446b = dVar;
        this.f303447c = stakingPocket;
        this.d = j2;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f303445a, hVar.f303445a) && Intrinsics.f(this.f303446b, hVar.f303446b) && Intrinsics.f(this.f303447c, hVar.f303447c) && this.d == hVar.d && this.e == hVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f303445a.hashCode() * 31;
        io3.d dVar = this.f303446b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        StakingPocket stakingPocket = this.f303447c;
        return Boolean.hashCode(this.e) + a0.d.c((iHashCode2 + (stakingPocket != null ? stakingPocket.hashCode() : 0)) * 31, 31, this.d);
    }
}
