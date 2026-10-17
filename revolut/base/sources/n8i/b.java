package n8i;

import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$InputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveAmountScreenContract$InputData f213403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f213404b;

    public b(MoveAmountScreenContract$InputData inputData, l80.e dateProvider, n7i.f excludedScheduledPaymentsAccountTypesProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(excludedScheduledPaymentsAccountTypesProvider, "excludedScheduledPaymentsAccountTypesProvider");
        this.f213403a = inputData;
        this.f213404b = dateProvider;
    }

    public final a a() {
        TransferScheduleData transferScheduleData;
        jli.c cVarK;
        MoveAmountScreenContract$InputData moveAmountScreenContract$InputData = this.f213403a;
        boolean z = moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.AddNewScheduledPayment;
        boolean z3 = (z || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.MoveWithFixedAccount)) ? false : true;
        if ((moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.MoveMoneyWithAccountPair) || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.Add) || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.MoveWithFixedAccount) || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.MoveMoney) || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.Withdraw) || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.Deposit)) {
            transferScheduleData = new TransferScheduleData(0L, (jli.c) null, 7);
        } else if (z) {
            transferScheduleData = ((MoveAmountScreenContract$InputData.AddNewScheduledPayment) moveAmountScreenContract$InputData).f97240b;
        } else {
            if (!(moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.EditScheduledPayment)) {
                throw new NoWhenBranchMatchedException();
            }
            MoveMoneyRecurringPayment moveMoneyRecurringPayment = ((MoveAmountScreenContract$InputData.EditScheduledPayment) moveAmountScreenContract$InputData).f97243a;
            long millis = qua.u.e(moveMoneyRecurringPayment, ((l80.f) this.f213404b).g()).getMillis();
            Period period = moveMoneyRecurringPayment.f104804a.f160151b;
            if (period == null || (cVarK = jli.e.k(period)) == null) {
                cVarK = jli.c.PERIOD_SELECTION_NONE;
            }
            transferScheduleData = new TransferScheduleData(millis, cVarK, 4);
        }
        return new a(z3, transferScheduleData);
    }
}
