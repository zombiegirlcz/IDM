package we5;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import io3.d;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import qta.c;
import z92.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f296622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingPocket f296623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f296624c;
    public final c d;
    public final dj0.d e;

    public a(StakingProduct stakingProduct, StakingPocket stakingPocket, d dVar, c cVar) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f296622a = stakingProduct;
        this.f296623b = stakingPocket;
        this.f296624c = dVar;
        this.d = cVar;
        this.e = new dj0.d(0L, stakingProduct.d);
    }

    public final dj0.d a() {
        dj0.d dVarB = b();
        c cVar = this.d;
        if (cVar != null) {
            return t1.C(dVarB, q.f0(cVar));
        }
        return null;
    }

    public final dj0.d b() {
        dj0.d dVar;
        if (this.f296622a.f88087b.f88067m) {
            d dVar2 = this.f296624c;
            if (dVar2 != null) {
                return f.j(dVar2);
            }
        } else {
            StakingPocket stakingPocket = this.f296623b;
            if (stakingPocket != null && (dVar = stakingPocket.f88084g) != null) {
                return dVar;
            }
        }
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f296622a, aVar.f296622a) && Intrinsics.f(this.f296623b, aVar.f296623b) && Intrinsics.f(this.f296624c, aVar.f296624c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f296622a.hashCode() * 31;
        StakingPocket stakingPocket = this.f296623b;
        int iHashCode2 = (iHashCode + (stakingPocket == null ? 0 : stakingPocket.hashCode())) * 31;
        d dVar = this.f296624c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.d;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }
}
