package as1;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillSearchTapiResult f8763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f8764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8765c;
    public final AccountId d;
    public final String e;
    public final ApmQuote f;

    public h(BillSearchTapiResult bill, dj0.d amount, String str, AccountId accountId, String str2, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(bill, "bill");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f8763a = bill;
        this.f8764b = amount;
        this.f8765c = str;
        this.d = accountId;
        this.e = str2;
        this.f = apmQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f8763a, hVar.f8763a) && Intrinsics.f(this.f8764b, hVar.f8764b) && Intrinsics.f(this.f8765c, hVar.f8765c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iC = v7.c(this.f8763a.hashCode() * 31, 31, this.f8764b);
        String str = this.f8765c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        AccountId accountId = this.d;
        int iHashCode2 = (iHashCode + (accountId == null ? 0 : accountId.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ApmQuote apmQuote = this.f;
        return iHashCode3 + (apmQuote != null ? apmQuote.hashCode() : 0);
    }
}
