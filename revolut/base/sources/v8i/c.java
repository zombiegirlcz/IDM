package v8i;

import com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static MoveMoneyRecurringPayment a(p recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        return new MoveMoneyRecurringPayment(recurringPayment.f249314a, recurringPayment.f249316b, recurringPayment.i, recurringPayment.f249323j, recurringPayment.f249327p, recurringPayment.A, recurringPayment.F, recurringPayment.f249317b0, recurringPayment.f249325m);
    }
}
