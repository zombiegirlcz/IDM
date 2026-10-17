package vlk;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutButton;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.PlanContextualSelectionScreenContract$InputData;
import ggk.k1;
import ggk.o1;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vdl.c1;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends oki.h implements dli.b {

    @NotNull
    public static final r Companion = new r();
    public final PlanContextualSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wik.m f290495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f290496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f290497r;

    public s(t stateMapper, PlanContextualSelectionScreenContract$InputData inputData, wik.m offersInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(offersInteractor, "offersInteractor");
        this.o = inputData;
        this.f290495p = offersInteractor;
        this.f290496q = new vii.b(w4l.i.f294643c);
        this.f290497r = mra.d.b(this, new m(new Data(null, null, true, 3, null), 0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, prk.o.w("PlanContextualSelectionScreenModel", "observeContextualSelectionLayout", vkm.q.Q(this.f290496q, new c1(continuation, this, 16))), null, null, new vfg.m(this, continuation, 13), 3);
    }

    public final void I2(int i) {
        PricingPlanLayoutFooter pricingPlanLayoutFooter;
        List list;
        PricingPlanLayoutButton pricingPlanLayoutButton;
        y yVar = this.f290497r;
        o1 o1Var = (o1) ((m) ((j2) yVar.f22677a).getValue()).f290488a.getContent();
        if (o1Var == null) {
            return;
        }
        k1 k1Var = (k1) d0.e0(((m) ((j2) yVar.f22677a).getValue()).f290489b, o1Var.f143767b);
        if (k1Var == null || (pricingPlanLayoutFooter = k1Var.e) == null || (list = pricingPlanLayoutFooter.f102834a) == null || (pricingPlanLayoutButton = (PricingPlanLayoutButton) d0.e0(i, list)) == null) {
            return;
        }
        C2(new n(pricingPlanLayoutButton.f102833c));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f290497r;
    }
}
