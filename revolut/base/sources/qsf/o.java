package qsf;

import com.revolut.feature.transfer_reasons.models.reason.TransferReason;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    public static n a(dj0.d amount, ttf.b catalogue, TransferReasonCategory transferReasonCategory, Set selectedReasons, List additionalInfo, List allocations, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        if (transferReasonCategory == null) {
            return null;
        }
        List listD1 = d0.d1(selectedReasons);
        if (listD1.size() > 1 && (allocations.isEmpty() || !z)) {
            return m.f248833a;
        }
        if (listD1.size() != 1) {
            return new l(new TransferReasonsValues(catalogue, additionalInfo, u.c(TransferReasonCategory.a(transferReasonCategory, allocations))));
        }
        List list = listD1;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new TransferReason(amount, ((TransferReasonNode) it8.next()).getF92432a(), null));
        }
        return new l(new TransferReasonsValues(catalogue, additionalInfo, u.c(TransferReasonCategory.a(transferReasonCategory, arrayList))));
    }
}
