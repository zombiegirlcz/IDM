package lo5;

import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f197414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferMoneyPocket f197415b;

    public v(f5j.a beneficiary, TransferMoneyPocket moneyPocket) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
        this.f197414a = beneficiary;
        this.f197415b = moneyPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f197414a, vVar.f197414a) && Intrinsics.f(this.f197415b, vVar.f197415b);
    }

    public final int hashCode() {
        return this.f197415b.hashCode() + (this.f197414a.hashCode() * 31);
    }
}
