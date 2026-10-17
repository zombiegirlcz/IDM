package e1a;

import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((SplitBillLink) obj3).d), Long.valueOf(((SplitBillLink) obj2).d));
    }
}
