package mjk;

import bjk.g2;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import ggk.i0;
import ggk.j0;
import ggk.k0;
import ggk.l0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class s {
    public static final i0 a(g2.b bVar) {
        PlansDashboardLayout$ClickAction plansDashboardLayout$ClickActionB;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        g2.c forward = bVar.getForward();
        l0 k0Var = null;
        if (forward != null && (plansDashboardLayout$ClickActionB = p.b(forward.getAction(), forward.getUrl())) != null) {
            if (forward.getIcon() != null) {
                k0Var = new j0(forward.getIcon(), plansDashboardLayout$ClickActionB);
            } else if (forward.getLabel() != null) {
                k0Var = new k0(forward.getLabel(), plansDashboardLayout$ClickActionB);
            } else {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlansDashboardLayoutMapping", "unsupported navigation item structure", null, h0Var);
            }
        }
        return new i0(k0Var);
    }
}
