package e1c;

import com.revolut.data.model.Data;
import hha.z0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f121951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f121952b;

    public j() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f121951a, jVar.f121951a) && Intrinsics.f(this.f121952b, jVar.f121952b);
    }

    public final int hashCode() {
        int iHashCode = this.f121951a.hashCode() * 31;
        z0 z0Var = this.f121952b;
        return iHashCode + (z0Var == null ? 0 : z0Var.hashCode());
    }

    public j(Data loyaltyEarningRatesData, z0 z0Var) {
        Intrinsics.checkNotNullParameter(loyaltyEarningRatesData, "loyaltyEarningRatesData");
        this.f121951a = loyaltyEarningRatesData;
        this.f121952b = z0Var;
    }

    public /* synthetic */ j(int i) {
        this(new Data(null, null, false, 7, null), null);
    }
}
