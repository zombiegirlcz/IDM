package h7i;

import com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyRecurringPayment f149897a;

    public o(MoveMoneyRecurringPayment recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f149897a = recurringPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f149897a, ((o) obj2).f149897a);
    }

    public final int hashCode() {
        return this.f149897a.hashCode();
    }
}
