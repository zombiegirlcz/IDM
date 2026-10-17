package e4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f122589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BankTransferData f122590b;

    public e0(BankTransferData data, f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f122589a = beneficiary;
        this.f122590b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f122589a, e0Var.f122589a) && Intrinsics.f(this.f122590b, e0Var.f122590b);
    }

    public final int hashCode() {
        return this.f122590b.hashCode() + (this.f122589a.hashCode() * 31);
    }
}
