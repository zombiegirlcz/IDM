package mlk;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m9d.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanCancelFeaturesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PlanCancelFeaturesScreen planCancelFeaturesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planCancelFeaturesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarE3 = this.v.d();
        Intrinsics.h(model);
        h0 h0Var = (h0) xVarE3;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        Continuation continuation = null;
        if (Intrinsics.f(str, "ID_CARDS_SUBHEADER_ITEM")) {
            h0Var.n2(new y0(h0Var, continuation, 20), new whi.b(6));
        } else if (Intrinsics.f(str, "ID_INSURANCE_SUBHEADER_ITEM")) {
            h0Var.n2(new g0(h0Var, null), new whi.b(6));
        } else {
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanCancelFeaturesScreen", j6.a.q("List subheader start image click not handled, listId = ", str), null, h0Var2);
        }
        return Unit.f186387a;
    }
}
