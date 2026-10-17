package y73;

import a83.s;
import a83.w;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ft3.a1;
import gim.i;
import grl.r2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_list.c u;
    public final /* synthetic */ w v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.card_screen.impl.kompot.cards_list.c cVar, w wVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return this.u.C1(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.CARDS_LIST, null, null, null, null, 30), ((s) this.v).f2083a, null, null, null, null, null, null, null, null, 2044))));
    }
}
