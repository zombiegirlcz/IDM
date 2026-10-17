package mn1;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillSearchBoletoResult f207335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferScheduleData f207336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f207337c;
    public final String d;
    public final xi0.b e;
    public final PaymentPocketInfo f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f207338g;

    public h(BillSearchBoletoResult decodeResult, TransferScheduleData scheduleData, AccountId accountId, String str, xi0.b pocketCurrency, PaymentPocketInfo paymentPocketInfo, Boolean bool) {
        Intrinsics.checkNotNullParameter(decodeResult, "decodeResult");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        this.f207335a = decodeResult;
        this.f207336b = scheduleData;
        this.f207337c = accountId;
        this.d = str;
        this.e = pocketCurrency;
        this.f = paymentPocketInfo;
        this.f207338g = bool;
    }

    public static h a(h hVar, BillSearchBoletoResult billSearchBoletoResult, TransferScheduleData transferScheduleData, AccountId accountId, String str, xi0.b bVar, PaymentPocketInfo paymentPocketInfo, Boolean bool, int i) {
        if ((i & 1) != 0) {
            billSearchBoletoResult = hVar.f207335a;
        }
        BillSearchBoletoResult decodeResult = billSearchBoletoResult;
        if ((i & 2) != 0) {
            transferScheduleData = hVar.f207336b;
        }
        TransferScheduleData scheduleData = transferScheduleData;
        if ((i & 4) != 0) {
            accountId = hVar.f207337c;
        }
        AccountId accountId2 = accountId;
        if ((i & 8) != 0) {
            str = hVar.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            bVar = hVar.e;
        }
        xi0.b pocketCurrency = bVar;
        if ((i & 32) != 0) {
            paymentPocketInfo = hVar.f;
        }
        PaymentPocketInfo paymentPocketInfo2 = paymentPocketInfo;
        if ((i & 64) != 0) {
            bool = hVar.f207338g;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(decodeResult, "decodeResult");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        return new h(decodeResult, scheduleData, accountId2, str2, pocketCurrency, paymentPocketInfo2, bool);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f207335a, hVar.f207335a) && Intrinsics.f(this.f207336b, hVar.f207336b) && Intrinsics.f(this.f207337c, hVar.f207337c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f207338g, hVar.f207338g);
    }

    public final int hashCode() {
        int iB = h30.l.b(this.f207337c, h30.l.f(this.f207336b, this.f207335a.hashCode() * 31, 31), 31);
        String str = this.d;
        int iJ = h30.l.j(this.e, (iB + (str == null ? 0 : str.hashCode())) * 31, 31);
        PaymentPocketInfo paymentPocketInfo = this.f;
        int iHashCode = (iJ + (paymentPocketInfo == null ? 0 : paymentPocketInfo.hashCode())) * 31;
        Boolean bool = this.f207338g;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
