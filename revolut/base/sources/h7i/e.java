package h7i;

import com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyRecurringPayment f149887a;

    public e(MoveMoneyRecurringPayment recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f149887a = recurringPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f149887a, ((e) obj2).f149887a);
    }

    public final int hashCode() {
        return this.f149887a.hashCode();
    }
}
