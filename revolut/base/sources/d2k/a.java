package d2k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankTransferData f110871a;

    public a(BankTransferData bankTransferData) {
        Intrinsics.checkNotNullParameter(bankTransferData, "bankTransferData");
        this.f110871a = bankTransferData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f110871a, ((a) obj2).f110871a);
    }

    public final int hashCode() {
        return this.f110871a.hashCode();
    }
}
