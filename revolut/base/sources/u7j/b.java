package u7j;

import aii.e;
import com.revolut.feature.staking.api.model.StakingProduct;
import io3.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f277941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingProduct f277942b;

    public b(d pocket, StakingProduct stakingProduct) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f277941a = pocket;
        this.f277942b = stakingProduct;
    }

    public final d b() {
        return this.f277941a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f277941a, bVar.f277941a) && Intrinsics.f(this.f277942b, bVar.f277942b);
    }

    public final int hashCode() {
        int iHashCode = this.f277941a.hashCode() * 31;
        StakingProduct stakingProduct = this.f277942b;
        return iHashCode + (stakingProduct == null ? 0 : stakingProduct.hashCode());
    }
}
