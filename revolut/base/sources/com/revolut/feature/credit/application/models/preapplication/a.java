package com.revolut.feature.credit.application.models.preapplication;

import com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItem;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario;
import et3.b;
import et3.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static PreApplicationChecksScenario a(b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        int i = c.f129183a[result.f129181a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return PreApplicationChecksScenario.RejectedUndisclosed.f66271a;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            List<PreApplicationCheckItem> list = result.f129182b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                PreApplicationCheckItem preApplicationCheckItem = (PreApplicationCheckItem) obj2;
                if ((preApplicationCheckItem instanceof PreApplicationCheckItem.Remediable) || (preApplicationCheckItem instanceof PreApplicationCheckItem.Pending) || (preApplicationCheckItem instanceof PreApplicationCheckItem.Completed)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof PreApplicationCheckItem.NonRemediable) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof PreApplicationCheckItem.Informative) {
                    arrayList3.add(obj4);
                }
            }
            if (!arrayList2.isEmpty()) {
                return new PreApplicationChecksScenario.Blocked(arrayList2, arrayList, arrayList3);
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (PreApplicationCheckItem preApplicationCheckItem2 : list) {
                    if ((preApplicationCheckItem2 instanceof PreApplicationCheckItem.Remediable) || (preApplicationCheckItem2 instanceof PreApplicationCheckItem.Pending)) {
                        return new PreApplicationChecksScenario.RemediationRequired(arrayList, arrayList3);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                return new PreApplicationChecksScenario.ReadyWithInfo(arrayList3);
            }
        }
        return PreApplicationChecksScenario.Ready.f66269a;
    }
}
