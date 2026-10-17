package qpd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GroupDetailsScreen groupDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupDetailsScreen;
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

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh clickData = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVar = (g) this.v.O.getValue();
        Intrinsics.h(clickData);
        com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a) gVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj3 = ((RowDelegate.Model) clickData.f54884b).u;
        a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
        if (a3Var != null) {
            aVar2.l2(new q(clickData.f54883a.e, aVar2, a3Var, clickData, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
