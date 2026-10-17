package ghk;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$PlanPagerItem;
import ggk.h1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlanPagerFlow f143949a;

    public c(PlanPagerFlow planPagerFlow) {
        this.f143949a = planPagerFlow;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            PlanPagerFlow planPagerFlow = this.f143949a;
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) planPagerFlow.R2();
            Object obj2 = ((j) ((j2) dVar.D.f22677a).getValue()).f143959a.get(planPagerFlow.e3().f215180h.getCurrentItem());
            PlanPagerFlowContract$PlanPagerItem.PlanItem planItem = obj2 instanceof PlanPagerFlowContract$PlanPagerItem.PlanItem ? (PlanPagerFlowContract$PlanPagerItem.PlanItem) obj2 : null;
            if (planItem == null) {
                return;
            }
            String planId = planItem.f103057c;
            cli.y yVar = dVar.D;
            h1 h1Var = (h1) ((j) ((j2) yVar.f22677a).getValue()).f143962g.getContent();
            if (h1Var != null) {
                dVar.H2(yVar, new gbi.c(d8l.d.l(h1Var, planId), planId, 16));
            }
            dVar.P2();
            enk.o oVar = dVar.f103073w;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(planId, "planId");
            oVar.f127845a.setValue(planId);
        }
    }
}
