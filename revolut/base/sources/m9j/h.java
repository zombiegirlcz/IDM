package m9j;

import aw0.q0;
import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f203801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingProduct f203802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f203803c;
    public final Data d;
    public final boolean e;
    public final q0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final do3.n f203804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f203805h;
    public final Data i;

    public h(xi0.b currency, StakingProduct stakingProduct, Boolean bool, Data data, boolean z, q0 q0Var, do3.n nVar, boolean z3, Data data2) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f203801a = currency;
        this.f203802b = stakingProduct;
        this.f203803c = bool;
        this.d = data;
        this.e = z;
        this.f = q0Var;
        this.f203804g = nVar;
        this.f203805h = z3;
        this.i = data2;
    }

    public static h a(h hVar, StakingProduct stakingProduct, Boolean bool, Data data, boolean z, q0 q0Var, do3.n nVar, Data data2, int i) {
        xi0.b currency = hVar.f203801a;
        if ((i & 2) != 0) {
            stakingProduct = hVar.f203802b;
        }
        StakingProduct stakingProduct2 = stakingProduct;
        if ((i & 4) != 0) {
            bool = hVar.f203803c;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            data = hVar.d;
        }
        Data data3 = data;
        if ((i & 16) != 0) {
            z = hVar.e;
        }
        boolean z3 = z;
        q0 q0Var2 = (i & 32) != 0 ? hVar.f : q0Var;
        do3.n nVar2 = (i & 64) != 0 ? hVar.f203804g : nVar;
        boolean z4 = hVar.f203805h;
        Data data4 = (i & 256) != 0 ? hVar.i : data2;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new h(currency, stakingProduct2, bool2, data3, z3, q0Var2, nVar2, z4, data4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f203801a, hVar.f203801a) && Intrinsics.f(this.f203802b, hVar.f203802b) && Intrinsics.f(this.f203803c, hVar.f203803c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f203804g, hVar.f203804g) && this.f203805h == hVar.f203805h && Intrinsics.f(this.i, hVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f203801a.hashCode() * 31;
        StakingProduct stakingProduct = this.f203802b;
        int iHashCode2 = (iHashCode + (stakingProduct == null ? 0 : stakingProduct.hashCode())) * 31;
        Boolean bool = this.f203803c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Data data = this.d;
        int iC = j6.a.c((iHashCode3 + (data == null ? 0 : data.hashCode())) * 31, 31, this.e);
        q0 q0Var = this.f;
        int iHashCode4 = (iC + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        do3.n nVar = this.f203804g;
        int iC2 = j6.a.c((iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.f203805h);
        Data data2 = this.i;
        return iC2 + (data2 != null ? data2.hashCode() : 0);
    }
}
