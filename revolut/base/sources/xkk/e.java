package xkk;

import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.PlanBenefitsToLoseScreen;
import ggk.u0;
import ggk.y;
import ggk.z;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanBenefitsToLoseScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PlanBenefitsToLoseScreen planBenefitsToLoseScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planBenefitsToLoseScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SplitColumnCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        z layout;
        SplitColumnCellDelegate.Model model = (SplitColumnCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String id10 = model.f53450a;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        y yVar = (y) ((f) ((j2) aVar2.f103476w.f22677a).getValue()).f306848b.getContent();
        if (yVar != null && (layout = yVar.f143800c) != null) {
            aVar2.o.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(layout, "layout");
            u0 u0VarD = dnk.d.d(id10, layout.f143805b, layout.f143806c);
            if (u0VarD == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanBenefitsToLoseScreenModel", "unable to find description on benefit action value click", null, h0Var);
            } else {
                aVar2.n2(new n(u0VarD, aVar2, (Continuation) null), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
