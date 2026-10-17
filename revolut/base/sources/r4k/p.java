package r4k;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankTransferData f251493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f251494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f5j.a f251495c;
    public final AccountId d;

    public p(BankTransferData bankTransferData, m extraData, f5j.a beneficiary, AccountId accountId) {
        Intrinsics.checkNotNullParameter(bankTransferData, "bankTransferData");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter("BANK_TRANSFER_REVIEW_CTA_BUTTON_TAG", "loadingButtonTag");
        this.f251493a = bankTransferData;
        this.f251494b = extraData;
        this.f251495c = beneficiary;
        this.d = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f251493a, pVar.f251493a) && this.f251494b.equals(pVar.f251494b) && Intrinsics.f(this.f251495c, pVar.f251495c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        return ((this.d.hashCode() + ((this.f251495c.hashCode() + ((this.f251494b.hashCode() + (this.f251493a.hashCode() * 31)) * 31)) * 31)) * 31) - 1771231374;
    }
}
