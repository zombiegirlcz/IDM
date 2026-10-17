package g4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f140540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BankTransferData f140541b;

    public c0(BankTransferData transferData, f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f140540a = beneficiary;
        this.f140541b = transferData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f140540a, c0Var.f140540a) && Intrinsics.f(this.f140541b, c0Var.f140541b);
    }

    public final int hashCode() {
        return this.f140541b.hashCode() + (this.f140540a.hashCode() * 31);
    }
}
