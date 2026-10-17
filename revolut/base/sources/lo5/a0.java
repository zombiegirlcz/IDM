package lo5;

import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f197393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferMoneyPocket f197394b;

    public a0(f5j.a beneficiary, TransferMoneyPocket moneyPocket) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
        this.f197393a = beneficiary;
        this.f197394b = moneyPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f197393a, a0Var.f197393a) && Intrinsics.f(this.f197394b, a0Var.f197394b);
    }

    public final int hashCode() {
        return this.f197394b.hashCode() + (this.f197393a.hashCode() * 31);
    }
}
