package l1a;

import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState;
import fnc.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public i(s splitBillLinkInteractor) {
        Intrinsics.checkNotNullParameter(splitBillLinkInteractor, "splitBillLinkInteractor");
    }

    public final SplitBillQrState a(SplitBillLink splitBillLink, a3 transaction, List relatedTransactions) {
        Intrinsics.checkNotNullParameter(splitBillLink, "link");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(relatedTransactions, "relatedTransactions");
        Intrinsics.checkNotNullParameter(splitBillLink, "splitBillLink");
        return (!s.k(splitBillLink, System.currentTimeMillis()) || s.l(relatedTransactions, transaction)) ? new SplitBillQrState.Expired(splitBillLink, transaction, relatedTransactions) : new SplitBillQrState.Shareable(splitBillLink, transaction, relatedTransactions);
    }
}
