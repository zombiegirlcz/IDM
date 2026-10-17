package l96;

import aii.r;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DepositAmount f193043a;

    public d(DepositAmount selectedDepositAmount) {
        Intrinsics.checkNotNullParameter(selectedDepositAmount, "selectedDepositAmount");
        this.f193043a = selectedDepositAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f193043a, ((d) obj2).f193043a);
    }

    public final int hashCode() {
        return this.f193043a.hashCode();
    }
}
