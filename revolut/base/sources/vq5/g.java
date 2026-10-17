package vq5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f291314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoAddress f291315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f291316c;
    public final xi0.b d;
    public final FiatCryptoMoney e;
    public final CryptoWithdrawLimits f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ko5.l f291317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n9l.a f291318h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f291319j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Clause f291320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CryptoAddressCounterparty f291321m;

    public g(boolean z, CryptoAddress beneficiary, boolean z3, xi0.b sourceCurrency, FiatCryptoMoney sourcePocketBalance, CryptoWithdrawLimits withdrawLimits, ko5.l lVar, n9l.a aVar, Data userData, Data userCompany, Data cryptoAccount, Clause clause, CryptoAddressCounterparty recipientPreCheckResult) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(sourcePocketBalance, "sourcePocketBalance");
        Intrinsics.checkNotNullParameter(withdrawLimits, "withdrawLimits");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(cryptoAccount, "cryptoAccount");
        Intrinsics.checkNotNullParameter(recipientPreCheckResult, "recipientPreCheckResult");
        this.f291314a = z;
        this.f291315b = beneficiary;
        this.f291316c = z3;
        this.d = sourceCurrency;
        this.e = sourcePocketBalance;
        this.f = withdrawLimits;
        this.f291317g = lVar;
        this.f291318h = aVar;
        this.i = userData;
        this.f291319j = userCompany;
        this.k = cryptoAccount;
        this.f291320l = clause;
        this.f291321m = recipientPreCheckResult;
    }

    public static g a(g gVar, ko5.l lVar, n9l.a aVar, Data data, Data data2, Data data3, Clause clause, int i) {
        boolean z = gVar.f291314a;
        CryptoAddress beneficiary = gVar.f291315b;
        boolean z3 = gVar.f291316c;
        xi0.b sourceCurrency = gVar.d;
        FiatCryptoMoney sourcePocketBalance = gVar.e;
        CryptoWithdrawLimits withdrawLimits = gVar.f;
        ko5.l lVar2 = (i & 64) != 0 ? gVar.f291317g : lVar;
        n9l.a aVar2 = (i & 128) != 0 ? gVar.f291318h : aVar;
        Data userData = (i & 256) != 0 ? gVar.i : data;
        Data userCompany = (i & 512) != 0 ? gVar.f291319j : data2;
        Data cryptoAccount = (i & 1024) != 0 ? gVar.k : data3;
        Clause clause2 = (i & 2048) != 0 ? gVar.f291320l : clause;
        CryptoAddressCounterparty recipientPreCheckResult = gVar.f291321m;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(sourcePocketBalance, "sourcePocketBalance");
        Intrinsics.checkNotNullParameter(withdrawLimits, "withdrawLimits");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(cryptoAccount, "cryptoAccount");
        Intrinsics.checkNotNullParameter(recipientPreCheckResult, "recipientPreCheckResult");
        return new g(z, beneficiary, z3, sourceCurrency, sourcePocketBalance, withdrawLimits, lVar2, aVar2, userData, userCompany, cryptoAccount, clause2, recipientPreCheckResult);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f291314a == gVar.f291314a && Intrinsics.f(this.f291315b, gVar.f291315b) && this.f291316c == gVar.f291316c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f291317g, gVar.f291317g) && Intrinsics.f(this.f291318h, gVar.f291318h) && Intrinsics.f(this.i, gVar.i) && Intrinsics.f(this.f291319j, gVar.f291319j) && Intrinsics.f(this.k, gVar.k) && Intrinsics.f(this.f291320l, gVar.f291320l) && Intrinsics.f(this.f291321m, gVar.f291321m);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + h30.l.j(this.d, j6.a.c((this.f291315b.hashCode() + (Boolean.hashCode(this.f291314a) * 31)) * 31, 31, this.f291316c), 31)) * 31)) * 31;
        ko5.l lVar = this.f291317g;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n9l.a aVar = this.f291318h;
        int iC = kii.e.c(this.k, kii.e.c(this.f291319j, kii.e.c(this.i, (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31), 31);
        Clause clause = this.f291320l;
        return this.f291321m.hashCode() + ((iC + (clause != null ? clause.hashCode() : 0)) * 31);
    }
}
