package od3;

import com.revolut.feature.cashback.api.models.CashbackByCurrencies;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w0 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashbackByCurrencies f224312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f224313b;

    public w0(CashbackByCurrencies cashbackByCurrencies, boolean z) {
        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
        this.f224312a = cashbackByCurrencies;
        this.f224313b = z;
    }

    @Override // od3.x0
    public final CashbackByCurrencies a() {
        return this.f224312a;
    }

    @Override // od3.x0
    public final boolean b() {
        return this.f224313b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f224312a, w0Var.f224312a) && this.f224313b == w0Var.f224313b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224313b) + (this.f224312a.f65684a.hashCode() * 31);
    }
}
