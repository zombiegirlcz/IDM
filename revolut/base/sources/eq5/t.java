package eq5;

import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f128328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FiatCryptoMoney f128330c;
    public final FundingSource d;
    public final xi0.b e;
    public final FiatCryptoMoney f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CryptoWithdrawLimits f128331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CryptoAddressCounterparty f128332h;

    public t(CryptoAddress beneficiary, boolean z, FiatCryptoMoney sourcePocketBalance, FundingSource fundingSource, xi0.b sourceCurrency, FiatCryptoMoney recipientTargetAmount, CryptoWithdrawLimits withdrawLimits, CryptoAddressCounterparty recipientPreCheckResult) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(sourcePocketBalance, "sourcePocketBalance");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(recipientTargetAmount, "recipientTargetAmount");
        Intrinsics.checkNotNullParameter(withdrawLimits, "withdrawLimits");
        Intrinsics.checkNotNullParameter(recipientPreCheckResult, "recipientPreCheckResult");
        this.f128328a = beneficiary;
        this.f128329b = z;
        this.f128330c = sourcePocketBalance;
        this.d = fundingSource;
        this.e = sourceCurrency;
        this.f = recipientTargetAmount;
        this.f128331g = withdrawLimits;
        this.f128332h = recipientPreCheckResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f128328a, tVar.f128328a) && this.f128329b == tVar.f128329b && Intrinsics.f(this.f128330c, tVar.f128330c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f128331g, tVar.f128331g) && Intrinsics.f(this.f128332h, tVar.f128332h);
    }

    public final int hashCode() {
        return this.f128332h.hashCode() + ((this.f128331g.hashCode() + ((this.f.hashCode() + h30.l.j(this.e, (this.d.hashCode() + ((this.f128330c.hashCode() + j6.a.c(this.f128328a.hashCode() * 31, 31, this.f128329b)) * 31)) * 31, 31)) * 31)) * 31);
    }
}
