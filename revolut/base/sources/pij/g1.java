package pij;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g1 g1Var = new g1(this.v, continuation);
        g1Var.u = obj2;
        return g1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g1) create((bjj.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        bjj.e eVar = (bjj.e) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = this.v;
        bVar.T2();
        if (!Intrinsics.f(eVar, bjj.b.f15680a)) {
            if (Intrinsics.f(eVar, bjj.c.f15681a)) {
                bVar.C1(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, null, 31)));
            } else {
                if (!(eVar instanceof bjj.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.M2(bVar, ((bjj.d) eVar).f15682a);
            }
        }
        return Unit.f186387a;
    }
}
