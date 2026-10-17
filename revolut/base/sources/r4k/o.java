package r4k;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankTransferData f251490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f251491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f5j.a f251492c;
    public final AccountId d;

    public o(BankTransferData bankTransferData, m extraData, f5j.a beneficiary, AccountId accountId) {
        Intrinsics.checkNotNullParameter(bankTransferData, "bankTransferData");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter("BANK_TRANSFER_REVIEW_CTA_BUTTON_TAG", "loadingButtonTag");
        this.f251490a = bankTransferData;
        this.f251491b = extraData;
        this.f251492c = beneficiary;
        this.d = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f251490a, oVar.f251490a) && this.f251491b.equals(oVar.f251491b) && Intrinsics.f(this.f251492c, oVar.f251492c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        return ((this.d.hashCode() + ((this.f251492c.hashCode() + ((this.f251491b.hashCode() + (this.f251490a.hashCode() * 31)) * 31)) * 31)) * 31) - 1771231374;
    }
}
