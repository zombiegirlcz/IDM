package c23;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.c u;
    public final /* synthetic */ f0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.card_order_new.impl.kompot.c cVar, f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.card_order_new.impl.kompot.c cVar = this.u;
        cVar.C1(new BridgeDestination(cVar.f65086w.c(new CardScreenAction.Select(this.v.f150110a, 6, false, false), AccountId.Personal.f51414a)));
        return Unit.f186387a;
    }
}
