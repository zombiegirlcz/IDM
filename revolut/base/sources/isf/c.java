package isf;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import ip0.qd0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static ArrayList a(List reasons, Set selectedReasons, ttf.e selectionMode) {
        i model;
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        List<TransferReasonNode> list = reasons;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TransferReasonNode transferReasonNode : list) {
            int i = b.f168248a[selectionMode.ordinal()];
            if (i == 1) {
                model = new SelectableDelegate.Model(transferReasonNode.getF92432a(), new RowDelegate.Model(j6.a.q("INNER_", transferReasonNode.getF92432a()), null, hb9.b.B(transferReasonNode), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), selectedReasons.contains(transferReasonNode) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, transferReasonNode, null, false, 32504);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                model = new SingleChoiceDelegate.Model(transferReasonNode.getF92432a(), hb9.b.B(transferReasonNode), selectedReasons.contains(transferReasonNode), null, transferReasonNode, YearClass.CLASS_2008);
            }
            arrayList.add(model);
        }
        return arrayList;
    }
}
