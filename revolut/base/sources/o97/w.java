package o97;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.wh;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class w {
    public static qv0.l a(RowDelegate.Model model, List allActions, ArrayList searchedActions) {
        Intrinsics.checkNotNullParameter(model, "<this>");
        Intrinsics.checkNotNullParameter(allActions, "allActions");
        Intrinsics.checkNotNullParameter(searchedActions, "searchedActions");
        List list = searchedActions.isEmpty() ? allActions : searchedActions;
        if (list.size() == 0) {
            return model;
        }
        if (list.size() == 1 && list.equals(searchedActions)) {
            return RowDelegate.Model.x(model, null, null, null, null, null, 0, new pf(((v) zhm.d0.b0(searchedActions)).f223133b, null, null, false, ((v) zhm.d0.b0(searchedActions)).f223132a, null, 478), false, null, null, 0, 0, 0, 0, null, -1025, 15);
        }
        String str = model.f53228a;
        List<v> list2 = allActions;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (v vVar : list2) {
            arrayList.add(new SwipeToActionDelegate.SwipeAction(vVar.f223132a, vVar.f223134c, vVar.f223133b, null, null, null, null, SyslogConstants.LOG_CLOCK));
        }
        return new wh(str, model, arrayList, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
