package pmk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.screen.PlanManagementScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pmk.l;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanManagementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PlanManagementScreen planManagementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planManagementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.v.Y.getValue();
        String listId = model.f52613a;
        v vVar = (v) pVar;
        j60.a aVar2 = vVar.f237636r;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "CONTINUE_LIST_ID")) {
            j60.a.v(aVar2, false, null, 3);
            vVar.v2(l.b.f237621a);
        } else if (Intrinsics.f(listId, "KEEP_LIST_ID")) {
            j60.a.v(aVar2, false, null, 3);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown listId: ", listId));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
