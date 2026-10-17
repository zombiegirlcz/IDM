package e4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f122593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BankTransferData f122594b;

    public f0(BankTransferData data, f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f122593a = beneficiary;
        this.f122594b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f122593a, f0Var.f122593a) && Intrinsics.f(this.f122594b, f0Var.f122594b);
    }

    public final int hashCode() {
        return this.f122594b.hashCode() + (this.f122593a.hashCode() * 31);
    }
}
