package sr9;

import com.revolut.feature.payments.bills_chooser.api.splits.MoneySplit;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.o;
import oq9.x;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static ArrayList a(o owner, ArrayList splits) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(splits, "splits");
        ArrayList arrayList = new ArrayList(w.t(splits, 10));
        Iterator it8 = splits.iterator();
        while (it8.hasNext()) {
            MoneySplit moneySplit = (MoneySplit) it8.next();
            if (!(moneySplit instanceof MoneySplit.Amount)) {
                if (moneySplit instanceof MoneySplit.Percentage) {
                    throw new UnsupportedOperationException("Payment group bill splits only support MoneySplit.Amount");
                }
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add((MoneySplit.Amount) moneySplit);
        }
        ArrayList<MoneySplit.Amount> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            MoneySplit.Amount amount = (MoneySplit.Amount) obj2;
            boolean zF = Intrinsics.f(amount.f79202a.O7(), owner.b());
            boolean z = amount.f79204c.f115082a != 0;
            if (!zF && z) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (MoneySplit.Amount amount2 : arrayList2) {
            arrayList3.add(new oq9.w(new x(amount2.f79202a.O7()), amount2.f79204c, amount2.f79203b));
        }
        return arrayList3;
    }
}
