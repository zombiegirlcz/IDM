package eq5;

import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiatCryptoMoney f128301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FiatCryptoFeesBreakdown f128302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FiatCryptoMoney f128303c;
    public final FiatCryptoMoney d;
    public final dj0.d e;

    public q(FiatCryptoMoney withdrawAmount, FiatCryptoFeesBreakdown feesBreakdown, FiatCryptoMoney totalAmount, FiatCryptoMoney balance, dj0.d sourcePocketBalance) {
        Intrinsics.checkNotNullParameter(withdrawAmount, "withdrawAmount");
        Intrinsics.checkNotNullParameter(feesBreakdown, "feesBreakdown");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(sourcePocketBalance, "sourcePocketBalance");
        this.f128301a = withdrawAmount;
        this.f128302b = feesBreakdown;
        this.f128303c = totalAmount;
        this.d = balance;
        this.e = sourcePocketBalance;
    }

    public final dj0.d a() {
        return b() ? pyd.c.H(this.d.f71113b, this.f128302b.e.f71113b) : this.f128301a.f71113b;
    }

    public final boolean b() {
        boolean zC = c();
        FiatCryptoMoney fiatCryptoMoney = this.f128303c;
        return (zC ? fiatCryptoMoney.f71113b.f115082a : fiatCryptoMoney.f71112a.f115082a) > this.e.f115082a;
    }

    public final boolean c() {
        return Intrinsics.f(this.f128301a.f71113b.f115083b, this.e.f115083b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f128301a, qVar.f128301a) && Intrinsics.f(this.f128302b, qVar.f128302b) && Intrinsics.f(this.f128303c, qVar.f128303c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f128303c.hashCode() + ((this.f128302b.hashCode() + (this.f128301a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
