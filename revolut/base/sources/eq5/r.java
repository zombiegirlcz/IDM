package eq5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f128308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wk5.a f128309c;
    public final boolean d;
    public final Data e;
    public final nqi.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f128310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f128311h;
    public final FundingSource i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PaymentPocketInfo f128312j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f128313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f128314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f128315n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CryptoWithdrawLimits f128316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CryptoAddressCounterparty f128317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f128318r;

    public r(String address, xi0.b bVar, wk5.a aVar, boolean z, Data beneficiary, nqi.c cVar, Data inputFiatCryptoMoneyData, s sVar, FundingSource fundingSource, PaymentPocketInfo paymentPocketInfo, Data sourcePocketFiatCryptoMoneyData, boolean z3, Data exchangeRates, Data amountErrorData, Data limitsData, CryptoWithdrawLimits cryptoWithdrawLimits, CryptoAddressCounterparty cryptoAddressCounterparty, boolean z4) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(inputFiatCryptoMoneyData, "inputFiatCryptoMoneyData");
        Intrinsics.checkNotNullParameter(sourcePocketFiatCryptoMoneyData, "sourcePocketFiatCryptoMoneyData");
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        Intrinsics.checkNotNullParameter(amountErrorData, "amountErrorData");
        Intrinsics.checkNotNullParameter(limitsData, "limitsData");
        this.f128307a = address;
        this.f128308b = bVar;
        this.f128309c = aVar;
        this.d = z;
        this.e = beneficiary;
        this.f = cVar;
        this.f128310g = inputFiatCryptoMoneyData;
        this.f128311h = sVar;
        this.i = fundingSource;
        this.f128312j = paymentPocketInfo;
        this.k = sourcePocketFiatCryptoMoneyData;
        this.f128313l = z3;
        this.f128314m = exchangeRates;
        this.f128315n = amountErrorData;
        this.o = limitsData;
        this.f128316p = cryptoWithdrawLimits;
        this.f128317q = cryptoAddressCounterparty;
        this.f128318r = z4;
    }

    public static r a(r rVar, xi0.b bVar, wk5.a aVar, Data data, nqi.c cVar, Data data2, s sVar, FundingSource fundingSource, PaymentPocketInfo paymentPocketInfo, Data data3, boolean z, Data data4, Data data5, Data data6, CryptoWithdrawLimits cryptoWithdrawLimits, CryptoAddressCounterparty cryptoAddressCounterparty, int i) {
        String address = rVar.f128307a;
        xi0.b bVar2 = (i & 2) != 0 ? rVar.f128308b : bVar;
        wk5.a aVar2 = (i & 4) != 0 ? rVar.f128309c : aVar;
        boolean z3 = rVar.d;
        Data beneficiary = (i & 16) != 0 ? rVar.e : data;
        nqi.c cVar2 = (i & 32) != 0 ? rVar.f : cVar;
        Data inputFiatCryptoMoneyData = (i & 64) != 0 ? rVar.f128310g : data2;
        s sVar2 = (i & 128) != 0 ? rVar.f128311h : sVar;
        FundingSource fundingSource2 = (i & 256) != 0 ? rVar.i : fundingSource;
        PaymentPocketInfo paymentPocketInfo2 = (i & 512) != 0 ? rVar.f128312j : paymentPocketInfo;
        Data sourcePocketFiatCryptoMoneyData = (i & 1024) != 0 ? rVar.k : data3;
        boolean z4 = (i & 2048) != 0 ? rVar.f128313l : z;
        Data exchangeRates = (i & 4096) != 0 ? rVar.f128314m : data4;
        rVar.getClass();
        rVar.getClass();
        Data amountErrorData = (32768 & i) != 0 ? rVar.f128315n : data5;
        Data limitsData = (i & 65536) != 0 ? rVar.o : data6;
        xi0.b bVar3 = bVar2;
        CryptoWithdrawLimits cryptoWithdrawLimits2 = (i & 131072) != 0 ? rVar.f128316p : cryptoWithdrawLimits;
        CryptoAddressCounterparty cryptoAddressCounterparty2 = (i & 262144) != 0 ? rVar.f128317q : cryptoAddressCounterparty;
        boolean z6 = (i & 524288) != 0 ? rVar.f128318r : true;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(inputFiatCryptoMoneyData, "inputFiatCryptoMoneyData");
        Intrinsics.checkNotNullParameter(sourcePocketFiatCryptoMoneyData, "sourcePocketFiatCryptoMoneyData");
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        Intrinsics.checkNotNullParameter(amountErrorData, "amountErrorData");
        Intrinsics.checkNotNullParameter(limitsData, "limitsData");
        return new r(address, bVar3, aVar2, z3, beneficiary, cVar2, inputFiatCryptoMoneyData, sVar2, fundingSource2, paymentPocketInfo2, sourcePocketFiatCryptoMoneyData, z4, exchangeRates, amountErrorData, limitsData, cryptoWithdrawLimits2, cryptoAddressCounterparty2, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f128307a, rVar.f128307a) && Intrinsics.f(this.f128308b, rVar.f128308b) && this.f128309c == rVar.f128309c && this.d == rVar.d && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f128310g, rVar.f128310g) && Intrinsics.f(this.f128311h, rVar.f128311h) && Intrinsics.f(this.i, rVar.i) && Intrinsics.f(this.f128312j, rVar.f128312j) && Intrinsics.f(this.k, rVar.k) && this.f128313l == rVar.f128313l && Intrinsics.f(this.f128314m, rVar.f128314m) && Intrinsics.f(this.f128315n, rVar.f128315n) && Intrinsics.f(this.o, rVar.o) && Intrinsics.f(this.f128316p, rVar.f128316p) && Intrinsics.f(this.f128317q, rVar.f128317q) && this.f128318r == rVar.f128318r;
    }

    public final int hashCode() {
        int iHashCode = this.f128307a.hashCode() * 31;
        xi0.b bVar = this.f128308b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        wk5.a aVar = this.f128309c;
        int iC = kii.e.c(this.e, j6.a.c((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.d), 31);
        nqi.c cVar = this.f;
        int iC2 = kii.e.c(this.f128310g, (iC + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
        s sVar = this.f128311h;
        int iHashCode3 = (iC2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        FundingSource fundingSource = this.i;
        int iHashCode4 = (iHashCode3 + (fundingSource == null ? 0 : fundingSource.hashCode())) * 31;
        PaymentPocketInfo paymentPocketInfo = this.f128312j;
        int iC3 = kii.e.c(this.o, kii.e.c(this.f128315n, j6.a.c(kii.e.c(this.f128314m, j6.a.c(kii.e.c(this.k, (iHashCode4 + (paymentPocketInfo == null ? 0 : paymentPocketInfo.hashCode())) * 31, 31), 31, this.f128313l), 961), 31, false), 31), 31);
        CryptoWithdrawLimits cryptoWithdrawLimits = this.f128316p;
        int iHashCode5 = (iC3 + (cryptoWithdrawLimits == null ? 0 : cryptoWithdrawLimits.hashCode())) * 31;
        CryptoAddressCounterparty cryptoAddressCounterparty = this.f128317q;
        return Boolean.hashCode(this.f128318r) + ((iHashCode5 + (cryptoAddressCounterparty != null ? cryptoAddressCounterparty.hashCode() : 0)) * 31);
    }
}
