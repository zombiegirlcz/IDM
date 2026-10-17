package fkk;

import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import hha.d;
import hha.s;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static d a(String str, ArrayList arrayList) {
        Object next;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((d) next).f152287a, str)) {
                break;
            }
        }
        return (d) next;
    }

    public static d b(PlanSelection selection, ArrayList allPlans, d currentPlan, String suggestedPlanId) {
        d dVarB;
        Object next;
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(allPlans, "allPlans");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(suggestedPlanId, "suggestedPlanId");
        Object obj2 = null;
        if (selection instanceof PlanSelection.Default) {
            dVarB = a(suggestedPlanId, allPlans);
        } else if (selection instanceof PlanSelection.LowestPlan) {
            Iterator it8 = allPlans.iterator();
            if (it8.hasNext()) {
                next = it8.next();
                if (it8.hasNext()) {
                    int i = ((d) next).f152294m;
                    do {
                        Object next2 = it8.next();
                        int i2 = ((d) next2).f152294m;
                        if (i > i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it8.hasNext());
                }
            } else {
                next = null;
            }
            dVarB = (d) next;
        } else {
            if (!(selection instanceof PlanSelection.PlanTier)) {
                throw new NoWhenBranchMatchedException();
            }
            dVarB = s.b(allPlans, ((PlanSelection.PlanTier) selection).f103357a);
            if (dVarB == null) {
                dVarB = a(suggestedPlanId, allPlans);
            }
        }
        if (dVarB != null) {
            return dVarB;
        }
        Iterator it9 = d0.P0(allPlans, new a()).iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next3 = it9.next();
            if (((d) next3).f152294m > currentPlan.f152294m) {
                obj2 = next3;
                break;
            }
        }
        d dVar = (d) obj2;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = (d) d0.d0(allPlans);
        return dVar2 == null ? currentPlan : dVar2;
    }
}
