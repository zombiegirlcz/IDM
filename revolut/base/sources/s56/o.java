package s56;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f259971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f259973c;
    public final s d;
    public final wk5.a e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DeFiAssetDetails f259974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DeFiBalance f259975h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xi0.b f259976j;
    public final PaymentPocketInfo k;

    public o(CryptoAddress wallet, String amountInput, n amountInputMode, s sVar, wk5.a chain, Data initialization, DeFiAssetDetails deFiAssetDetails, DeFiBalance deFiBalance, Data quote, xi0.b bVar, PaymentPocketInfo paymentPocketInfo) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(amountInput, "amountInput");
        Intrinsics.checkNotNullParameter(amountInputMode, "amountInputMode");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(initialization, "initialization");
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f259971a = wallet;
        this.f259972b = amountInput;
        this.f259973c = amountInputMode;
        this.d = sVar;
        this.e = chain;
        this.f = initialization;
        this.f259974g = deFiAssetDetails;
        this.f259975h = deFiBalance;
        this.i = quote;
        this.f259976j = bVar;
        this.k = paymentPocketInfo;
    }

    public static o a(o oVar, String str, n amountInputMode, s sVar, wk5.a chain, Data initialization, DeFiAssetDetails deFiAssetDetails, DeFiBalance deFiBalance, Data quote, xi0.b bVar, PaymentPocketInfo paymentPocketInfo, int i) {
        String amountInput = str;
        CryptoAddress wallet = oVar.f259971a;
        if ((i & 2) != 0) {
            amountInput = oVar.f259972b;
        }
        if ((i & 4) != 0) {
            amountInputMode = oVar.f259973c;
        }
        if ((i & 8) != 0) {
            sVar = oVar.d;
        }
        if ((i & 16) != 0) {
            chain = oVar.e;
        }
        if ((i & 32) != 0) {
            initialization = oVar.f;
        }
        if ((i & 64) != 0) {
            deFiAssetDetails = oVar.f259974g;
        }
        if ((i & 128) != 0) {
            deFiBalance = oVar.f259975h;
        }
        if ((i & 256) != 0) {
            quote = oVar.i;
        }
        if ((i & 512) != 0) {
            bVar = oVar.f259976j;
        }
        if ((i & 1024) != 0) {
            paymentPocketInfo = oVar.k;
        }
        PaymentPocketInfo paymentPocketInfo2 = paymentPocketInfo;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(amountInput, "amountInput");
        Intrinsics.checkNotNullParameter(amountInputMode, "amountInputMode");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(initialization, "initialization");
        Intrinsics.checkNotNullParameter(quote, "quote");
        xi0.b bVar2 = bVar;
        Data data = quote;
        DeFiBalance deFiBalance2 = deFiBalance;
        DeFiAssetDetails deFiAssetDetails2 = deFiAssetDetails;
        Data data2 = initialization;
        wk5.a aVar = chain;
        s sVar2 = sVar;
        return new o(wallet, amountInput, amountInputMode, sVar2, aVar, data2, deFiAssetDetails2, deFiBalance2, data, bVar2, paymentPocketInfo2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f259971a, oVar.f259971a) && Intrinsics.f(this.f259972b, oVar.f259972b) && this.f259973c == oVar.f259973c && Intrinsics.f(this.d, oVar.d) && this.e == oVar.e && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f259974g, oVar.f259974g) && Intrinsics.f(this.f259975h, oVar.f259975h) && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f259976j, oVar.f259976j) && Intrinsics.f(this.k, oVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f259973c.hashCode() + p.a.c(this.f259971a.hashCode() * 31, 31, this.f259972b)) * 31;
        s sVar = this.d;
        int iC = kii.e.c(this.f, (this.e.hashCode() + ((iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31)) * 31, 31);
        DeFiAssetDetails deFiAssetDetails = this.f259974g;
        int iHashCode2 = (iC + (deFiAssetDetails == null ? 0 : deFiAssetDetails.hashCode())) * 31;
        DeFiBalance deFiBalance = this.f259975h;
        int iC2 = kii.e.c(this.i, (iHashCode2 + (deFiBalance == null ? 0 : deFiBalance.hashCode())) * 31, 31);
        xi0.b bVar = this.f259976j;
        int iHashCode3 = (iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        PaymentPocketInfo paymentPocketInfo = this.k;
        return iHashCode3 + (paymentPocketInfo != null ? paymentPocketInfo.hashCode() : 0);
    }
}
