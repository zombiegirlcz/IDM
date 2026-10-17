package yoc;

import com.revolut.feature.robo.api.ui.providers.models.RoboTransaction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements Function1 {
    public static RoboTransaction a(a3 transaction) {
        ilc.c cVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        switch (d.f315646a[transaction.f.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                cVar = ilc.c.PENDING;
                break;
            case 5:
                cVar = ilc.c.COMPLETED;
                break;
            case 6:
            case 7:
                cVar = ilc.c.CANCELLED;
                break;
            case 8:
            case 9:
                cVar = ilc.c.FAILED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ilc.c cVar2 = cVar;
        DateTime dateTime = transaction.f272596j;
        if (dateTime == null) {
            dateTime = transaction.f272591g;
        }
        long millis = dateTime.getMillis();
        ibd.i iVar = transaction.C;
        return transaction.k.f(dj0.d.e) ? new RoboTransaction.Withdrawal(cVar2, transaction.k, millis, null, null) : iVar != null ? new RoboTransaction.RecurringDeposit(cVar2, transaction.k, millis, null, iVar.getId()) : new RoboTransaction.OneOffContribution(cVar2, transaction.k, millis, null, false, false);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return a((a3) obj2);
    }
}
