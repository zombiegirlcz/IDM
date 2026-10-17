package vwd;

import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f292704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f292705b;

    public f(StakingProduct stakingProduct, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f292704a = stakingProduct;
        this.f292705b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f292704a, fVar.f292704a) && Intrinsics.f(this.f292705b, fVar.f292705b);
    }

    public final int hashCode() {
        int iHashCode = this.f292704a.hashCode() * 31;
        wi0.b bVar = this.f292705b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
