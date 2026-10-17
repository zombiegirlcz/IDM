package ymk;

import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreen;
import ggk.g1;
import ggk.u0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanPageScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PlanPageScreen planPageScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planPageScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SplitColumnCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SplitColumnCellDelegate.Model model = (SplitColumnCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        String id10 = model.f53450a;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) oVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        g1 layout = (g1) ((l) ((j2) aVar2.f103614x.f22677a).getValue()).f315035b.getContent();
        if (layout != null) {
            aVar2.v.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(layout, "layout");
            u0 u0VarD = dnk.d.d(id10, layout.f143722h, layout.i);
            Continuation continuation = null;
            if (u0VarD == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanPageScreenModel", "unable to find description on benefit action value click", null, h0Var);
            } else {
                aVar2.n2(new yg6.v(aVar2, u0VarD, continuation, 7), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
