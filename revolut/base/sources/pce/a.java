package pce;

import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qua.x;
import qua.y;
import qua.z;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final z a(RecurringPaymentAccount recurringPaymentAccount) {
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "<this>");
        if (recurringPaymentAccount instanceof RecurringPaymentAccount.Joint) {
            String id10 = ((RecurringPaymentAccount.Joint) recurringPaymentAccount).f89317b;
            Intrinsics.checkNotNullParameter(id10, "id");
            return new x(id10);
        }
        if (recurringPaymentAccount instanceof RecurringPaymentAccount.Junior) {
            String id11 = ((RecurringPaymentAccount.Junior) recurringPaymentAccount).f89319b;
            Intrinsics.checkNotNullParameter(id11, "id");
            return new x(id11);
        }
        if (recurringPaymentAccount instanceof RecurringPaymentAccount.Pro) {
            String id12 = ((RecurringPaymentAccount.Pro) recurringPaymentAccount).f89322b;
            Intrinsics.checkNotNullParameter(id12, "id");
            return new x(id12);
        }
        if (Intrinsics.f(recurringPaymentAccount, RecurringPaymentAccount.Personal.f89320a)) {
            return y.f249342a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
