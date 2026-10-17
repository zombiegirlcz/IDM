package u2i;

import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f276677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f276678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.d f276679c;

    public i(StakingProduct stakingProduct, Boolean bool, io3.d dVar) {
        this.f276677a = stakingProduct;
        this.f276678b = bool;
        this.f276679c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f276677a, iVar.f276677a) && Intrinsics.f(this.f276678b, iVar.f276678b) && Intrinsics.f(this.f276679c, iVar.f276679c);
    }

    public final int hashCode() {
        StakingProduct stakingProduct = this.f276677a;
        int iHashCode = (stakingProduct == null ? 0 : stakingProduct.hashCode()) * 31;
        Boolean bool = this.f276678b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        io3.d dVar = this.f276679c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
