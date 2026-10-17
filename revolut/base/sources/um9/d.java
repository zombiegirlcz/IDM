package um9;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.payees.impl.ui.payees_overview.junior.JuniorPayeesOverviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorPayeesOverviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JuniorPayeesOverviewScreen juniorPayeesOverviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorPayeesOverviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.R.getValue();
        Object obj3 = vhVar.f54883a.f;
        com.revolut.feature.payees.impl.ui.payees_overview.junior.a aVar2 = (com.revolut.feature.payees.impl.ui.payees_overview.junior.a) hVar;
        aVar2.getClass();
        aVar2.l2(new u2i.g(aVar2, obj3, null, 28), new yi5.b(26));
        return Unit.f186387a;
    }
}
