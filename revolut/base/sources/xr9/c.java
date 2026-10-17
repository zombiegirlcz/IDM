package xr9;

import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        DateTime dateTimeC;
        DateTime dateTimeC2;
        GroupTransactionItem groupTransactionItem = (GroupTransactionItem) obj3;
        if (groupTransactionItem instanceof GroupTransactionItem.Bill) {
            dateTimeC = ((GroupTransactionItem.Bill) groupTransactionItem).f79326a.b();
        } else {
            if (!(groupTransactionItem instanceof GroupTransactionItem.Settlement)) {
                throw new NoWhenBranchMatchedException();
            }
            dateTimeC = ((GroupTransactionItem.Settlement) groupTransactionItem).f79327a.c();
        }
        GroupTransactionItem groupTransactionItem2 = (GroupTransactionItem) obj2;
        if (groupTransactionItem2 instanceof GroupTransactionItem.Bill) {
            dateTimeC2 = ((GroupTransactionItem.Bill) groupTransactionItem2).f79326a.b();
        } else {
            if (!(groupTransactionItem2 instanceof GroupTransactionItem.Settlement)) {
                throw new NoWhenBranchMatchedException();
            }
            dateTimeC2 = ((GroupTransactionItem.Settlement) groupTransactionItem2).f79327a.c();
        }
        return cim.b.b(dateTimeC, dateTimeC2);
    }
}
