package mlk;

import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import ggk.u0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mhd.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanCancelFeaturesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PlanCancelFeaturesScreen planCancelFeaturesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planCancelFeaturesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((SplitColumnCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ggk.z layout;
        SplitColumnCellDelegate.Model model = (SplitColumnCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarE3 = this.v.d();
        String id10 = model.f53450a;
        h0 h0Var = (h0) xVarE3;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        t tVar = (t) ((v) ((j2) h0Var.E.f22677a).getValue()).d.getContent();
        if (tVar != null && (tVar instanceof s) && (layout = ((s) tVar).d) != null) {
            h0Var.f207014w.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(layout, "layout");
            u0 u0VarD = dnk.d.d(id10, layout.f143805b, layout.f143806c);
            Continuation continuation = null;
            if (u0VarD == null) {
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanCancelFeaturesScreen", "unable to find description on benefit item value click", null, h0Var2);
            } else {
                h0Var.n2(new p0(h0Var, u0VarD, continuation, 8), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
