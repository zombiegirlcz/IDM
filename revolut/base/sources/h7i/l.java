package h7i;

import com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyRecurringPayment f149894a;

    public l(MoveMoneyRecurringPayment recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f149894a = recurringPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f149894a, ((l) obj2).f149894a);
    }

    public final int hashCode() {
        return this.f149894a.hashCode();
    }
}
