package l9j;

import aw0.q0;
import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingPocket f193254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f193255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f193256c;
    public final do3.n d;

    public f(StakingPocket stakingPocket, Data earningDetailsData, q0 q0Var, do3.n nVar) {
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        Intrinsics.checkNotNullParameter(earningDetailsData, "earningDetailsData");
        this.f193254a = stakingPocket;
        this.f193255b = earningDetailsData;
        this.f193256c = q0Var;
        this.d = nVar;
    }

    public static f a(f fVar, StakingPocket stakingPocket, Data earningDetailsData, q0 q0Var, do3.n nVar, int i) {
        if ((i & 1) != 0) {
            stakingPocket = fVar.f193254a;
        }
        if ((i & 2) != 0) {
            earningDetailsData = fVar.f193255b;
        }
        if ((i & 4) != 0) {
            q0Var = fVar.f193256c;
        }
        if ((i & 8) != 0) {
            nVar = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        Intrinsics.checkNotNullParameter(earningDetailsData, "earningDetailsData");
        return new f(stakingPocket, earningDetailsData, q0Var, nVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f193254a, fVar.f193254a) && Intrinsics.f(this.f193255b, fVar.f193255b) && Intrinsics.f(this.f193256c, fVar.f193256c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f193255b, this.f193254a.hashCode() * 31, 31);
        q0 q0Var = this.f193256c;
        int iHashCode = (iC + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        do3.n nVar = this.d;
        return iHashCode + (nVar != null ? nVar.hashCode() : 0);
    }
}
