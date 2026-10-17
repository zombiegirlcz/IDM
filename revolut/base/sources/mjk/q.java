package mjk;

import bjk.g2;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import ggk.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q {
    public static final PlansDashboardLayout$Button a(g2.a aVar) {
        h0 h0Var;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String style = aVar.getStyle();
        if (style != null) {
            h0[] h0VarArrValues = h0.values();
            int length = h0VarArrValues.length;
            for (int i = 0; i < length; i++) {
                h0Var = h0VarArrValues[i];
                if (a0.z(h0Var.name(), style, true)) {
                    break;
                }
            }
            h0Var = null;
        } else {
            h0Var = null;
        }
        String label = aVar.getLabel();
        PlansDashboardLayout$ClickAction plansDashboardLayout$ClickActionB = p.b(aVar.getAction(), aVar.getUrl());
        if (plansDashboardLayout$ClickActionB == null) {
            return null;
        }
        return new PlansDashboardLayout$Button(h0Var, plansDashboardLayout$ClickActionB, label, aVar.getIcon());
    }

    public static final g2.a b(PlansDashboardLayout$Button plansDashboardLayout$Button) {
        Intrinsics.checkNotNullParameter(plansDashboardLayout$Button, "<this>");
        h0 h0Var = plansDashboardLayout$Button.f102732a;
        PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction = plansDashboardLayout$Button.f102733b;
        String strName = h0Var != null ? h0Var.name() : null;
        String str = plansDashboardLayout$Button.f102734c;
        String strA = p.a(plansDashboardLayout$ClickAction);
        Intrinsics.checkNotNullParameter(plansDashboardLayout$ClickAction, "<this>");
        return new g2.a(strName, strA, str, plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.OpenUrl ? ((PlansDashboardLayout$ClickAction.OpenUrl) plansDashboardLayout$ClickAction).f102739a : null, plansDashboardLayout$Button.d);
    }
}
