package od3;

import com.revolut.feature.cashback.api.models.CashbackByCurrencies;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v0 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f224308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f224309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CashbackByCurrencies f224310c;
    public final boolean d;
    public final boolean e;

    public v0(dj0.d totalPlanCashbackAmount, hha.d currentPlan, CashbackByCurrencies cashbackByCurrencies, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(totalPlanCashbackAmount, "totalPlanCashbackAmount");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
        this.f224308a = totalPlanCashbackAmount;
        this.f224309b = currentPlan;
        this.f224310c = cashbackByCurrencies;
        this.d = z;
        this.e = z3;
    }

    @Override // od3.x0
    public final CashbackByCurrencies a() {
        return this.f224310c;
    }

    @Override // od3.x0
    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f224308a, v0Var.f224308a) && Intrinsics.f(this.f224309b, v0Var.f224309b) && Intrinsics.f(this.f224310c, v0Var.f224310c) && this.d == v0Var.d && this.e == v0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f224310c.f65684a, (this.f224309b.hashCode() + (this.f224308a.hashCode() * 31)) * 31, 31), 31, this.d);
    }
}
